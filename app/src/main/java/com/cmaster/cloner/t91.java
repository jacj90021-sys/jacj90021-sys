package com.cmaster.cloner;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t91 implements Future, sl1 {
    public boolean OooO;
    public final int OooO0Oo;
    public Object OooO0o;
    public final int OooO0o0;
    public m91 OooO0oO;
    public boolean OooO0oo;
    public boolean OooOO0;
    public n50 OooOO0O;

    public t91(int i, int i2) {
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
    }

    @Override // com.cmaster.cloner.fm0
    public final void OooO() {
    }

    @Override // com.cmaster.cloner.sl1
    public final synchronized void OooO00o(m91 m91Var) {
        this.OooO0oO = m91Var;
    }

    @Override // com.cmaster.cloner.sl1
    public final synchronized void OooO0O0(Object obj) {
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0OO(kh1 kh1Var) {
    }

    @Override // com.cmaster.cloner.sl1
    public final synchronized void OooO0Oo(Drawable drawable) {
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0o(Drawable drawable) {
    }

    @Override // com.cmaster.cloner.fm0
    public final void OooO0o0() {
    }

    @Override // com.cmaster.cloner.sl1
    public final synchronized m91 OooO0oO() {
        return this.OooO0oO;
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0oo(Drawable drawable) {
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooOO0(kh1 kh1Var) throws Throwable {
        kh1Var.OooOOO0(this.OooO0Oo, this.OooO0o0);
    }

    public final synchronized Object OooOO0O(Long l) {
        if (!isDone()) {
            char[] cArr = pr1.OooO00o;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.OooO0oo) {
            throw new CancellationException();
        }
        if (this.OooOO0) {
            throw new ExecutionException(this.OooOO0O);
        }
        if (this.OooO) {
            return this.OooO0o;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                wait(jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.OooOO0) {
            throw new ExecutionException(this.OooOO0O);
        }
        if (this.OooO0oo) {
            throw new CancellationException();
        }
        if (this.OooO) {
            return this.OooO0o;
        }
        throw new TimeoutException();
    }

    public final synchronized void OooOO0o(n50 n50Var) {
        this.OooOO0 = true;
        this.OooOO0O = n50Var;
        notifyAll();
    }

    public final synchronized void OooOOO0(Object obj) {
        this.OooO = true;
        this.OooO0o = obj;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.OooO0oo = true;
                notifyAll();
                m91 m91Var = null;
                if (z) {
                    m91 m91Var2 = this.OooO0oO;
                    this.OooO0oO = null;
                    m91Var = m91Var2;
                }
                if (m91Var != null) {
                    m91Var.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return OooOO0O(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.OooO0oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.OooO0oo     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.OooO     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.OooOO0     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.t91.isDone():boolean");
    }

    @Override // com.cmaster.cloner.fm0
    public final void onDestroy() {
    }

    public final String toString() {
        m91 m91Var;
        String str;
        String strOooO0oO = rj.OooO0oO(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                m91Var = null;
                if (this.OooO0oo) {
                    str = "CANCELLED";
                } else if (this.OooOO0) {
                    str = "FAILURE";
                } else if (this.OooO) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    m91Var = this.OooO0oO;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m91Var == null) {
            return rj.OooO0Oo(strOooO0oO, str, "]");
        }
        return strOooO0oO + str + ", request=[" + m91Var + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return OooOO0O(Long.valueOf(timeUnit.toMillis(j)));
    }
}
