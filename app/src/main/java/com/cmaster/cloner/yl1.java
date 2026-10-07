package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yl1 {
    public final ac3 OooO00o = new ac3();

    public yl1(na1 na1Var) {
        vk1 vk1Var = new vk1(this, 15);
        na1Var.getClass();
        ((ac3) na1Var.OooO0o0).OooO0O0(am1.OooO00o, new vk1(vk1Var, 5));
    }

    public final void OooO00o(Exception exc) {
        this.OooO00o.OooO0oO(exc);
    }

    public final void OooO0O0(Object obj) {
        this.OooO00o.OooO0oo(obj);
    }

    public final boolean OooO0OO(Exception exc) {
        ac3 ac3Var = this.OooO00o;
        ac3Var.getClass();
        by2.OooO(exc, "Exception must not be null");
        synchronized (ac3Var.OooO00o) {
            try {
                if (ac3Var.OooO0OO) {
                    return false;
                }
                ac3Var.OooO0OO = true;
                ac3Var.OooO0o = exc;
                ac3Var.OooO0O0.OooO0o(ac3Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public yl1() {
    }
}
