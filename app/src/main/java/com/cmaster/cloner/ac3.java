package com.cmaster.cloner;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ac3 extends xl1 {
    public final Object OooO00o = new Object();
    public final oh1 OooO0O0 = new oh1(5);
    public boolean OooO0OO;
    public volatile boolean OooO0Oo;
    public Exception OooO0o;
    public Object OooO0o0;

    public final void OooO() {
        synchronized (this.OooO00o) {
            try {
                if (this.OooO0OO) {
                    return;
                }
                this.OooO0OO = true;
                this.OooO0Oo = true;
                this.OooO0O0.OooO0o(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.xl1
    public final ac3 OooO00o(Executor executor, bz0 bz0Var) {
        this.OooO0O0.OooO0o0(new he2(executor, bz0Var));
        OooOO0o();
        return this;
    }

    @Override // com.cmaster.cloner.xl1
    public final ac3 OooO0O0(Executor executor, jz0 jz0Var) {
        this.OooO0O0.OooO0o0(new he2(executor, jz0Var));
        OooOO0o();
        return this;
    }

    @Override // com.cmaster.cloner.xl1
    public final Exception OooO0OO() {
        Exception exc;
        synchronized (this.OooO00o) {
            exc = this.OooO0o;
        }
        return exc;
    }

    @Override // com.cmaster.cloner.xl1
    public final Object OooO0Oo() {
        Object obj;
        synchronized (this.OooO00o) {
            try {
                by2.OooOO0("Task is not yet complete", this.OooO0OO);
                if (this.OooO0Oo) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.OooO0o;
                if (exc != null) {
                    throw new lc1(exc);
                }
                obj = this.OooO0o0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.cmaster.cloner.xl1
    public final boolean OooO0o() {
        boolean z;
        synchronized (this.OooO00o) {
            try {
                z = false;
                if (this.OooO0OO && !this.OooO0Oo && this.OooO0o == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.cmaster.cloner.xl1
    public final boolean OooO0o0() {
        boolean z;
        synchronized (this.OooO00o) {
            z = this.OooO0OO;
        }
        return z;
    }

    public final void OooO0oO(Exception exc) {
        by2.OooO(exc, "Exception must not be null");
        synchronized (this.OooO00o) {
            OooOO0O();
            this.OooO0OO = true;
            this.OooO0o = exc;
        }
        this.OooO0O0.OooO0o(this);
    }

    public final void OooO0oo(Object obj) {
        synchronized (this.OooO00o) {
            OooOO0O();
            this.OooO0OO = true;
            this.OooO0o0 = obj;
        }
        this.OooO0O0.OooO0o(this);
    }

    public final boolean OooOO0(Object obj) {
        synchronized (this.OooO00o) {
            try {
                if (this.OooO0OO) {
                    return false;
                }
                this.OooO0OO = true;
                this.OooO0o0 = obj;
                this.OooO0O0.OooO0o(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOO0O() {
        if (this.OooO0OO) {
            if (!OooO0o0()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excOooO0OO = OooO0OO();
        }
    }

    public final void OooOO0o() {
        synchronized (this.OooO00o) {
            try {
                if (this.OooO0OO) {
                    this.OooO0O0.OooO0o(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
