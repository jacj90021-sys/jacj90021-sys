package com.cmaster.cloner;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class lh2 implements jj2 {
    public static final w73 OooO;
    public static final boolean OooO0oO;
    public static final gj2 OooO0oo;
    public static final Object OooOO0;
    public volatile Object OooO0Oo;
    public volatile kh2 OooO0o;
    public volatile eh2 OooO0o0;

    static {
        boolean z;
        w73 hh2Var;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        OooO0oO = z;
        OooO0oo = new gj2(lh2.class);
        try {
            hh2Var = new jh2();
            th = null;
            th2 = null;
        } catch (Error | Exception e) {
            try {
                th = null;
                th2 = e;
                hh2Var = new fh2(AtomicReferenceFieldUpdater.newUpdater(kh2.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(kh2.class, kh2.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(lh2.class, kh2.class, "OooO0o"), AtomicReferenceFieldUpdater.newUpdater(lh2.class, eh2.class, "OooO0o0"), AtomicReferenceFieldUpdater.newUpdater(lh2.class, Object.class, "OooO0Oo"));
            } catch (Error | Exception e2) {
                hh2Var = new hh2();
                th = e2;
                th2 = e;
            }
        }
        OooO = hh2Var;
        if (th != null) {
            gj2 gj2Var = OooO0oo;
            Logger loggerOooO00o = gj2Var.OooO00o();
            Level level = Level.SEVERE;
            loggerOooO00o.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            gj2Var.OooO00o().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        OooOO0 = new Object();
    }

    public static void OooO0Oo(lh2 lh2Var) {
        for (kh2 kh2VarOooO0O0 = OooO.OooO0O0(lh2Var); kh2VarOooO0O0 != null; kh2VarOooO0O0 = kh2VarOooO0O0.OooO0O0) {
            Thread thread = kh2VarOooO0O0.OooO00o;
            if (thread != null) {
                kh2VarOooO0O0.OooO00o = null;
                LockSupport.unpark(thread);
            }
        }
        lh2Var.OooO0O0();
        eh2 eh2VarOooO00o = OooO.OooO00o(lh2Var);
        eh2 eh2Var = null;
        while (eh2VarOooO00o != null) {
            eh2 eh2Var2 = eh2VarOooO00o.OooO0OO;
            eh2VarOooO00o.OooO0OO = eh2Var;
            eh2Var = eh2VarOooO00o;
            eh2VarOooO00o = eh2Var2;
        }
        while (eh2Var != null) {
            Runnable runnable = eh2Var.OooO00o;
            eh2 eh2Var3 = eh2Var.OooO0OO;
            Objects.requireNonNull(runnable);
            if (runnable instanceof gh2) {
                throw null;
            }
            hi2 hi2Var = eh2Var.OooO0O0;
            Objects.requireNonNull(hi2Var);
            OooO0o0(runnable, hi2Var);
            eh2Var = eh2Var3;
        }
    }

    public static void OooO0o0(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            OooO0oo.OooO00o().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", rj.OooO0o0("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public static final Object OooO0oO(Object obj) throws ExecutionException {
        if (obj instanceof ch2) {
            Throwable th = ((ch2) obj).OooO0O0;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof dh2) {
            throw new ExecutionException(((dh2) obj).OooO00o);
        }
        if (obj == OooOO0) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String OooO00o() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public void OooO0O0() {
    }

    public final void OooO0OO(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    public final void OooO0o(kh2 kh2Var) {
        kh2Var.OooO00o = null;
        while (true) {
            kh2 kh2Var2 = this.OooO0o;
            if (kh2Var2 != kh2.OooO0OO) {
                kh2 kh2Var3 = null;
                while (kh2Var2 != null) {
                    kh2 kh2Var4 = kh2Var2.OooO0O0;
                    if (kh2Var2.OooO00o != null) {
                        kh2Var3 = kh2Var2;
                    } else if (kh2Var3 != null) {
                        kh2Var3.OooO0O0 = kh2Var4;
                        if (kh2Var3.OooO00o == null) {
                            break;
                        }
                    } else if (!OooO.OooO0oO(this, kh2Var2, kh2Var4)) {
                        break;
                    }
                    kh2Var2 = kh2Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ch2 ch2Var;
        Object obj = this.OooO0Oo;
        if ((obj instanceof gh2) | (obj == null)) {
            if (OooO0oO) {
                ch2Var = new ch2(z, new CancellationException("Future.cancel() was called."));
            } else {
                ch2Var = z ? ch2.OooO0OO : ch2.OooO0Oo;
                Objects.requireNonNull(ch2Var);
            }
            while (!OooO.OooO0o(this, obj, ch2Var)) {
                obj = this.OooO0Oo;
                if (!(obj instanceof gh2)) {
                }
            }
            OooO0Oo(this);
            if (obj instanceof gh2) {
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        kh2 kh2Var = kh2.OooO0OO;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.OooO0Oo;
        if ((obj != null) && (!(obj instanceof gh2))) {
            return OooO0oO(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            kh2 kh2Var2 = this.OooO0o;
            if (kh2Var2 != kh2Var) {
                kh2 kh2Var3 = new kh2();
                z = true;
                while (true) {
                    w73 w73Var = OooO;
                    w73Var.OooO0OO(kh2Var3, kh2Var2);
                    if (w73Var.OooO0oO(this, kh2Var2, kh2Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                OooO0o(kh2Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.OooO0Oo;
                            if ((obj2 != null) && (!(obj2 instanceof gh2))) {
                                return OooO0oO(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        OooO0o(kh2Var3);
                    } else {
                        long j4 = j3;
                        kh2Var2 = this.OooO0o;
                        if (kh2Var2 == kh2Var) {
                            break;
                        }
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.OooO0Oo;
            Objects.requireNonNull(obj3);
            return OooO0oO(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.OooO0Oo;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof gh2))) {
                return OooO0oO(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < j2) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            if (jConvert != j2 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > j2) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(rj.OooO0Oo(strConcat, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.OooO0Oo instanceof ch2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.OooO0Oo != null) & (!(r2 instanceof gh2));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r6.OooO0Oo
            boolean r1 = r1 instanceof com.cmaster.cloner.ch2
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r6 = "CANCELLED"
            r0.append(r6)
            goto Lc9
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.OooO0OO(r0)
            goto Lc9
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.OooO0Oo
            boolean r3 = r3 instanceof com.cmaster.cloner.gh2
            r4 = 0
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r3 == 0) goto L87
            java.lang.String r3 = ", setFuture=["
            r0.append(r3)
            r0.append(r4)     // Catch: java.lang.StackOverflowError -> L76 java.lang.Exception -> L78
            goto L83
        L76:
            r3 = move-exception
            goto L79
        L78:
            r3 = move-exception
        L79:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L83:
            r0.append(r2)
            goto Lb9
        L87:
            java.lang.String r3 = r6.OooO00o()     // Catch: java.lang.StackOverflowError -> L96 java.lang.Exception -> L98
            if (r3 == 0) goto L9a
            boolean r5 = r3.isEmpty()     // Catch: java.lang.StackOverflowError -> L96 java.lang.Exception -> L98
            if (r5 == 0) goto L94
            goto L9a
        L94:
            r5 = 0
            goto L9b
        L96:
            r3 = move-exception
            goto La0
        L98:
            r3 = move-exception
            goto La0
        L9a:
            r5 = 1
        L9b:
            if (r5 == 0) goto L9e
            goto Lac
        L9e:
            r4 = r3
            goto Lac
        La0:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r5.concat(r3)
        Lac:
            if (r4 == 0) goto Lb9
            java.lang.String r3 = ", info=["
            r0.append(r3)
            r0.append(r4)
            r0.append(r2)
        Lb9:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Lc9
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.OooO0OO(r0)
        Lc9:
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.lh2.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        kh2 kh2Var = kh2.OooO0OO;
        if (!Thread.interrupted()) {
            Object obj2 = this.OooO0Oo;
            if ((obj2 != null) & (!(obj2 instanceof gh2))) {
                return OooO0oO(obj2);
            }
            kh2 kh2Var2 = this.OooO0o;
            if (kh2Var2 != kh2Var) {
                kh2 kh2Var3 = new kh2();
                do {
                    w73 w73Var = OooO;
                    w73Var.OooO0OO(kh2Var3, kh2Var2);
                    if (w73Var.OooO0oO(this, kh2Var2, kh2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.OooO0Oo;
                            } else {
                                OooO0o(kh2Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof gh2))));
                        return OooO0oO(obj);
                    }
                    kh2Var2 = this.OooO0o;
                } while (kh2Var2 != kh2Var);
            }
            Object obj3 = this.OooO0Oo;
            Objects.requireNonNull(obj3);
            return OooO0oO(obj3);
        }
        throw new InterruptedException();
    }
}
