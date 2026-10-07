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
public abstract class o00000O implements nn0 {
    public static final il2 OooO;
    public static final boolean OooO0oO = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger OooO0oo = Logger.getLogger(o00000O.class.getName());
    public static final Object OooOO0;
    public volatile Object OooO0Oo;
    public volatile o00000O0 OooO0o;
    public volatile o000000 OooO0o0;

    static {
        il2 o00000Var;
        try {
            o00000Var = new o000000O(AtomicReferenceFieldUpdater.newUpdater(o00000O0.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(o00000O0.class, o00000O0.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(o00000O.class, o00000O0.class, "OooO0o"), AtomicReferenceFieldUpdater.newUpdater(o00000O.class, o000000.class, "OooO0o0"), AtomicReferenceFieldUpdater.newUpdater(o00000O.class, Object.class, "OooO0Oo"));
            th = null;
        } catch (Throwable th) {
            th = th;
            o00000Var = new o00000();
        }
        OooO = o00000Var;
        if (th != null) {
            OooO0oo.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        OooOO0 = new Object();
    }

    public static void OooO0O0(o00000O o00000o) {
        o00000O0 o00000o0;
        o000000 o000000Var;
        o000000 o000000Var2;
        o000000 o000000Var3;
        do {
            o00000o0 = o00000o.OooO0o;
        } while (!OooO.OooO0OO(o00000o, o00000o0, o00000O0.OooO0OO));
        while (true) {
            o000000Var = null;
            if (o00000o0 == null) {
                break;
            }
            Thread thread = o00000o0.OooO00o;
            if (thread != null) {
                o00000o0.OooO00o = null;
                LockSupport.unpark(thread);
            }
            o00000o0 = o00000o0.OooO0O0;
        }
        do {
            o000000Var2 = o00000o.OooO0o0;
        } while (!OooO.OooO00o(o00000o, o000000Var2, o000000.OooO0Oo));
        while (true) {
            o000000Var3 = o000000Var;
            o000000Var = o000000Var2;
            if (o000000Var == null) {
                break;
            }
            o000000Var2 = o000000Var.OooO0OO;
            o000000Var.OooO0OO = o000000Var3;
        }
        while (o000000Var3 != null) {
            o000000 o000000Var4 = o000000Var3.OooO0OO;
            OooO0OO(o000000Var3.OooO00o, o000000Var3.OooO0O0);
            o000000Var3 = o000000Var4;
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
        if (obj instanceof o0O0O00) {
            Throwable th = ((o0O0O00) obj).OooO00o;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof o000OOo) {
            throw new ExecutionException(((o000OOo) obj).OooO00o);
        }
        if (obj == OooOO0) {
            return null;
        }
        return obj;
    }

    public static Object OooO0o0(o00000O o00000o) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = o00000o.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void OooO00o(StringBuilder sb) {
        try {
            Object objOooO0o0 = OooO0o0(this);
            sb.append("SUCCESS, result=[");
            sb.append(objOooO0o0 == this ? "this future" : String.valueOf(objOooO0o0));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String OooO0o() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void OooO0oO(o00000O0 o00000o0) {
        o00000o0.OooO00o = null;
        while (true) {
            o00000O0 o00000o02 = this.OooO0o;
            if (o00000o02 == o00000O0.OooO0OO) {
                return;
            }
            o00000O0 o00000o03 = null;
            while (o00000o02 != null) {
                o00000O0 o00000o04 = o00000o02.OooO0O0;
                if (o00000o02.OooO00o != null) {
                    o00000o03 = o00000o02;
                } else if (o00000o03 != null) {
                    o00000o03.OooO0O0 = o00000o04;
                    if (o00000o03.OooO00o == null) {
                        break;
                    }
                } else if (!OooO.OooO0OO(this, o00000o02, o00000o04)) {
                    break;
                }
                o00000o02 = o00000o04;
            }
            return;
        }
    }

    public boolean OooO0oo(Throwable th) {
        th.getClass();
        if (!OooO.OooO0O0(this, null, new o000OOo(th))) {
            return false;
        }
        OooO0O0(this);
        return true;
    }

    @Override // com.cmaster.cloner.nn0
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        o000000 o000000Var = this.OooO0o0;
        o000000 o000000Var2 = o000000.OooO0Oo;
        if (o000000Var != o000000Var2) {
            o000000 o000000Var3 = new o000000(runnable, executor);
            do {
                o000000Var3.OooO0OO = o000000Var;
                if (OooO.OooO00o(this, o000000Var, o000000Var3)) {
                    return;
                } else {
                    o000000Var = this.OooO0o0;
                }
            } while (o000000Var != o000000Var2);
        }
        OooO0OO(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.OooO0Oo;
        if (obj != null) {
            return false;
        }
        if (!OooO.OooO0O0(this, obj, OooO0oO ? new o0O0O00(z, new CancellationException("Future.cancel() was called.")) : z ? o0O0O00.OooO0O0 : o0O0O00.OooO0OO)) {
            return false;
        }
        OooO0O0(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        o00000O0 o00000o0 = o00000O0.OooO0OO;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.OooO0Oo;
        if (obj != null) {
            return OooO0Oo(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            o00000O0 o00000o02 = this.OooO0o;
            if (o00000o02 != o00000o0) {
                o00000O0 o00000o03 = new o00000O0();
                do {
                    il2 il2Var = OooO;
                    il2Var.OooO0Oo(o00000o03, o00000o02);
                    if (il2Var.OooO0OO(this, o00000o02, o00000o03)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                OooO0oO(o00000o03);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.OooO0Oo;
                            if (obj2 != null) {
                                return OooO0Oo(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        OooO0oO(o00000o03);
                    } else {
                        o00000o02 = this.OooO0o;
                    }
                } while (o00000o02 != o00000o0);
            }
            return OooO0Oo(this.OooO0Oo);
        }
        while (nanos > 0) {
            Object obj3 = this.OooO0Oo;
            if (obj3 != null) {
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
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
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
        return this.OooO0Oo instanceof o0O0O00;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.OooO0Oo != null;
    }

    public final String toString() {
        String strOooO0o;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.OooO0Oo instanceof o0O0O00) {
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
        o00000O0 o00000o0 = o00000O0.OooO0OO;
        if (!Thread.interrupted()) {
            Object obj2 = this.OooO0Oo;
            if (obj2 != null) {
                return OooO0Oo(obj2);
            }
            o00000O0 o00000o02 = this.OooO0o;
            if (o00000o02 != o00000o0) {
                o00000O0 o00000o03 = new o00000O0();
                do {
                    il2 il2Var = OooO;
                    il2Var.OooO0Oo(o00000o03, o00000o02);
                    if (il2Var.OooO0OO(this, o00000o02, o00000o03)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.OooO0Oo;
                            } else {
                                OooO0oO(o00000o03);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return OooO0Oo(obj);
                    }
                    o00000o02 = this.OooO0o;
                } while (o00000o02 != o00000o0);
            }
            return OooO0Oo(this.OooO0Oo);
        }
        throw new InterruptedException();
    }
}
