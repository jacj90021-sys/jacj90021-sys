package com.cmaster.cloner;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class he2 implements jz0, bz0, yy0 {
    public final /* synthetic */ int OooO0Oo;
    public final Object OooO0o;
    public final Executor OooO0o0;
    public final Object OooO0oO;

    public he2(Executor executor, yy0 yy0Var) {
        this.OooO0Oo = 2;
        this.OooO0oO = new Object();
        this.OooO0o0 = executor;
        this.OooO0o = yy0Var;
    }

    public final void OooO00o(xl1 xl1Var) {
        int i = 27;
        switch (this.OooO0Oo) {
            case 0:
                this.OooO0o0.execute(new bf1(this, xl1Var, 15));
                return;
            case 1:
                this.OooO0o0.execute(new bf1(this, xl1Var, 16));
                return;
            case 2:
                if (((ac3) xl1Var).OooO0Oo) {
                    synchronized (this.OooO0oO) {
                    }
                    this.OooO0o0.execute(new u91(this, i));
                    return;
                }
                return;
            case 3:
                synchronized (this.OooO0oO) {
                }
                this.OooO0o0.execute(new bf1(this, xl1Var, 22));
                return;
            case 4:
                if (xl1Var.OooO0o() || ((ac3) xl1Var).OooO0Oo) {
                    return;
                }
                synchronized (this.OooO0oO) {
                }
                this.OooO0o0.execute(new bf1(this, xl1Var, 25));
                return;
            case 5:
                if (xl1Var.OooO0o()) {
                    synchronized (this.OooO0oO) {
                    }
                    this.OooO0o0.execute(new bf1(this, xl1Var, i));
                    return;
                }
                return;
            default:
                this.OooO0o0.execute(new bf1(this, xl1Var, 28));
                return;
        }
    }

    @Override // com.cmaster.cloner.jz0
    public void OooO0O0(Object obj) {
        int i = this.OooO0Oo;
        Object obj2 = this.OooO0o;
        switch (i) {
            case 1:
                ((ac3) obj2).OooO0oo(obj);
                break;
            default:
                ((ac3) obj2).OooO0oo(obj);
                break;
        }
    }

    @Override // com.cmaster.cloner.yy0
    public void OooO0oO() {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o;
        switch (i) {
            case 1:
                ((ac3) obj).OooO();
                break;
            default:
                ((ac3) obj).OooO();
                break;
        }
    }

    @Override // com.cmaster.cloner.bz0
    public void onFailure(Exception exc) {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o;
        switch (i) {
            case 1:
                ((ac3) obj).OooO0oO(exc);
                break;
            default:
                ((ac3) obj).OooO0oO(exc);
                break;
        }
    }

    public he2(Executor executor, zy0 zy0Var) {
        this.OooO0Oo = 3;
        this.OooO0oO = new Object();
        this.OooO0o0 = executor;
        this.OooO0o = zy0Var;
    }

    public he2(Executor executor, bz0 bz0Var) {
        this.OooO0Oo = 4;
        this.OooO0oO = new Object();
        this.OooO0o0 = executor;
        this.OooO0o = bz0Var;
    }

    public he2(Executor executor, jz0 jz0Var) {
        this.OooO0Oo = 5;
        this.OooO0oO = new Object();
        this.OooO0o0 = executor;
        this.OooO0o = jz0Var;
    }

    public /* synthetic */ he2(Executor executor, Object obj, ac3 ac3Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = executor;
        this.OooO0oO = obj;
        this.OooO0o = ac3Var;
    }
}
