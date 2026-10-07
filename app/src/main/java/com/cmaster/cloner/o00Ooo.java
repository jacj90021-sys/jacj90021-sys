package com.cmaster.cloner;

import java.util.Locale;
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
public abstract class o00Ooo implements nn0 {
    public static final dl2 OooO;
    public static final boolean OooO0oO = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger OooO0oo = Logger.getLogger(o00Ooo.class.getName());
    public static final Object OooOO0;
    public volatile Object OooO0Oo;
    public volatile o00Oo0 OooO0o;
    public volatile Oooo0 OooO0o0;

    static {
        dl2 o00o0o;
        try {
            o00o0o = new o000oOoO(AtomicReferenceFieldUpdater.newUpdater(o00Oo0.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(o00Oo0.class, o00Oo0.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(o00Ooo.class, o00Oo0.class, "OooO0o"), AtomicReferenceFieldUpdater.newUpdater(o00Ooo.class, Oooo0.class, "OooO0o0"), AtomicReferenceFieldUpdater.newUpdater(o00Ooo.class, Object.class, "OooO0Oo"));
            th = null;
        } catch (Throwable th) {
            th = th;
            o00o0o = new o00O0O();
        }
        OooO = o00o0o;
        if (th != null) {
            OooO0oo.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        OooOO0 = new Object();
    }

    public static void OooO0O0(o00Ooo o00ooo) {
        Oooo0 oooo0;
        Oooo0 oooo02;
        Oooo0 oooo03 = null;
        while (true) {
            o00Oo0 o00oo0 = o00ooo.OooO0o;
            if (OooO.OooO0OO(o00ooo, o00oo0, o00Oo0.OooO0OO)) {
                while (o00oo0 != null) {
                    Thread thread = o00oo0.OooO00o;
                    if (thread != null) {
                        o00oo0.OooO00o = null;
                        LockSupport.unpark(thread);
                    }
                    o00oo0 = o00oo0.OooO0O0;
                }
                do {
                    oooo0 = o00ooo.OooO0o0;
                } while (!OooO.OooO00o(o00ooo, oooo0, Oooo0.OooO0Oo));
                while (true) {
                    oooo02 = oooo03;
                    oooo03 = oooo0;
                    if (oooo03 == null) {
                        break;
                    }
                    oooo0 = oooo03.OooO0OO;
                    oooo03.OooO0OO = oooo02;
                }
                while (oooo02 != null) {
                    oooo03 = oooo02.OooO0OO;
                    Runnable runnable = oooo02.OooO00o;
                    if (runnable instanceof o0OoOo0) {
                        o0OoOo0 o0oooo0 = (o0OoOo0) runnable;
                        o00ooo = o0oooo0.OooO0Oo;
                        if (o00ooo.OooO0Oo == o0oooo0) {
                            if (OooO.OooO0O0(o00ooo, o0oooo0, OooO0o0(o0oooo0.OooO0o0))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        OooO0OO(runnable, oooo02.OooO0O0);
                    }
                    oooo02 = oooo03;
                }
                return;
            }
        }
    }

    public static void OooO0OO(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            OooO0oo.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object OooO0Oo(Object obj) throws ExecutionException {
        if (obj instanceof OooOo00) {
            Throwable th = ((OooOo00) obj).OooO0O0;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof Oooo000) {
            throw new ExecutionException(((Oooo000) obj).OooO00o);
        }
        if (obj == OooOO0) {
            return null;
        }
        return obj;
    }

    public static Object OooO0o0(nn0 nn0Var) {
        Object obj;
        if (nn0Var instanceof o00Ooo) {
            Object obj2 = ((o00Ooo) nn0Var).OooO0Oo;
            if (!(obj2 instanceof OooOo00)) {
                return obj2;
            }
            OooOo00 oooOo00 = (OooOo00) obj2;
            return oooOo00.OooO00o ? oooOo00.OooO0O0 != null ? new OooOo00(false, oooOo00.OooO0O0) : OooOo00.OooO0Oo : obj2;
        }
        boolean zIsCancelled = nn0Var.isCancelled();
        boolean z = true;
        if ((!OooO0oO) && zIsCancelled) {
            return OooOo00.OooO0Oo;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = nn0Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e) {
                if (zIsCancelled) {
                    return new OooOo00(false, e);
                }
                return new Oooo000(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + nn0Var, e));
            } catch (ExecutionException e2) {
                return new Oooo000(e2.getCause());
            } catch (Throwable th2) {
                return new Oooo000(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? OooOO0 : obj;
    }

    public final void OooO00o(StringBuilder sb) {
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
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String OooO0o() {
        Object obj = this.OooO0Oo;
        if (obj instanceof o0OoOo0) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            nn0 nn0Var = ((o0OoOo0) obj).OooO0o0;
            return rj.OooO0oO(sb, nn0Var == this ? "this future" : String.valueOf(nn0Var), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void OooO0oO(o00Oo0 o00oo0) {
        o00oo0.OooO00o = null;
        while (true) {
            o00Oo0 o00oo02 = this.OooO0o;
            if (o00oo02 == o00Oo0.OooO0OO) {
                return;
            }
            o00Oo0 o00oo03 = null;
            while (o00oo02 != null) {
                o00Oo0 o00oo04 = o00oo02.OooO0O0;
                if (o00oo02.OooO00o != null) {
                    o00oo03 = o00oo02;
                } else if (o00oo03 != null) {
                    o00oo03.OooO0O0 = o00oo04;
                    if (o00oo03.OooO00o == null) {
                        break;
                    }
                } else if (!OooO.OooO0OO(this, o00oo02, o00oo04)) {
                    break;
                }
                o00oo02 = o00oo04;
            }
            return;
        }
    }

    @Override // com.cmaster.cloner.nn0
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        Oooo0 oooo0 = this.OooO0o0;
        Oooo0 oooo02 = Oooo0.OooO0Oo;
        if (oooo0 != oooo02) {
            Oooo0 oooo03 = new Oooo0(runnable, executor);
            do {
                oooo03.OooO0OO = oooo0;
                if (OooO.OooO00o(this, oooo0, oooo03)) {
                    return;
                } else {
                    oooo0 = this.OooO0o0;
                }
            } while (oooo0 != oooo02);
        }
        OooO0OO(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.OooO0Oo
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof com.cmaster.cloner.o0OoOo0
            r3 = r3 | r4
            if (r3 == 0) goto L59
            boolean r3 = com.cmaster.cloner.o00Ooo.OooO0oO
            if (r3 == 0) goto L1f
            com.cmaster.cloner.OooOo00 r3 = new com.cmaster.cloner.OooOo00
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r7, r4)
            goto L26
        L1f:
            if (r7 == 0) goto L24
            com.cmaster.cloner.OooOo00 r3 = com.cmaster.cloner.OooOo00.OooO0OO
            goto L26
        L24:
            com.cmaster.cloner.OooOo00 r3 = com.cmaster.cloner.OooOo00.OooO0Oo
        L26:
            r4 = r2
        L27:
            com.cmaster.cloner.dl2 r5 = com.cmaster.cloner.o00Ooo.OooO
            boolean r5 = r5.OooO0O0(r6, r0, r3)
            if (r5 == 0) goto L52
            OooO0O0(r6)
            boolean r6 = r0 instanceof com.cmaster.cloner.o0OoOo0
            if (r6 == 0) goto L51
            com.cmaster.cloner.o0OoOo0 r0 = (com.cmaster.cloner.o0OoOo0) r0
            com.cmaster.cloner.nn0 r6 = r0.OooO0o0
            boolean r0 = r6 instanceof com.cmaster.cloner.o00Ooo
            if (r0 == 0) goto L4e
            com.cmaster.cloner.o00Ooo r6 = (com.cmaster.cloner.o00Ooo) r6
            java.lang.Object r0 = r6.OooO0Oo
            if (r0 != 0) goto L46
            r4 = r1
            goto L47
        L46:
            r4 = r2
        L47:
            boolean r5 = r0 instanceof com.cmaster.cloner.o0OoOo0
            r4 = r4 | r5
            if (r4 == 0) goto L51
            r4 = r1
            goto L27
        L4e:
            r6.cancel(r7)
        L51:
            return r1
        L52:
            java.lang.Object r0 = r6.OooO0Oo
            boolean r5 = r0 instanceof com.cmaster.cloner.o0OoOo0
            if (r5 != 0) goto L27
            return r4
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.o00Ooo.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        o00Oo0 o00oo0 = o00Oo0.OooO0OO;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.OooO0Oo;
        if ((obj != null) && (!(obj instanceof o0OoOo0))) {
            return OooO0Oo(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            o00Oo0 o00oo02 = this.OooO0o;
            if (o00oo02 != o00oo0) {
                o00Oo0 o00oo03 = new o00Oo0();
                z = true;
                do {
                    dl2 dl2Var = OooO;
                    dl2Var.OooO0Oo(o00oo03, o00oo02);
                    if (dl2Var.OooO0OO(this, o00oo02, o00oo03)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                OooO0oO(o00oo03);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.OooO0Oo;
                            if ((obj2 != null) && (!(obj2 instanceof o0OoOo0))) {
                                return OooO0Oo(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        OooO0oO(o00oo03);
                    } else {
                        o00oo02 = this.OooO0o;
                    }
                } while (o00oo02 != o00oo0);
            }
            return OooO0Oo(this.OooO0Oo);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.OooO0Oo;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof o0OoOo0))) {
                return OooO0Oo(obj3);
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
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z2) {
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
        return this.OooO0Oo instanceof OooOo00;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r2 instanceof o0OoOo0)) & (this.OooO0Oo != null);
    }

    public final String toString() {
        String strOooO0o;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.OooO0Oo instanceof OooOo00) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            OooO00o(sb);
        } else {
            try {
                strOooO0o = OooO0o();
            } catch (RuntimeException e) {
                strOooO0o = "Exception thrown from implementation: " + e.getClass();
            }
            if (strOooO0o != null && !strOooO0o.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strOooO0o);
                sb.append("]");
            } else if (isDone()) {
                OooO00o(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        o00Oo0 o00oo0 = o00Oo0.OooO0OO;
        if (!Thread.interrupted()) {
            Object obj2 = this.OooO0Oo;
            if ((obj2 != null) & (!(obj2 instanceof o0OoOo0))) {
                return OooO0Oo(obj2);
            }
            o00Oo0 o00oo02 = this.OooO0o;
            if (o00oo02 != o00oo0) {
                o00Oo0 o00oo03 = new o00Oo0();
                do {
                    dl2 dl2Var = OooO;
                    dl2Var.OooO0Oo(o00oo03, o00oo02);
                    if (dl2Var.OooO0OO(this, o00oo02, o00oo03)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.OooO0Oo;
                            } else {
                                OooO0oO(o00oo03);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof o0OoOo0))));
                        return OooO0Oo(obj);
                    }
                    o00oo02 = this.OooO0o;
                } while (o00oo02 != o00oo0);
            }
            return OooO0Oo(this.OooO0Oo);
        }
        throw new InterruptedException();
    }
}
