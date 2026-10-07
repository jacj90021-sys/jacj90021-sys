package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class wn0 {
    public final iy0 OooO0Oo;
    public int OooO0o = -1;
    public boolean OooO0o0;
    public final /* synthetic */ gv0 OooO0oO;

    public wn0(gv0 gv0Var, iy0 iy0Var) {
        this.OooO0oO = gv0Var;
        this.OooO0Oo = iy0Var;
    }

    public final void OooO00o(boolean z) {
        if (z == this.OooO0o0) {
            return;
        }
        this.OooO0o0 = z;
        int i = z ? 1 : -1;
        gv0 gv0Var = this.OooO0oO;
        int i2 = gv0Var.OooO0o;
        gv0Var.OooO0o = i + i2;
        if (!gv0Var.OooO0oO) {
            gv0Var.OooO0oO = true;
            while (true) {
                try {
                    int i3 = gv0Var.OooO0o;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        gv0Var.OooO0oo();
                    } else if (z3) {
                        gv0Var.OooO();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    gv0Var.OooO0oO = false;
                    throw th;
                }
            }
            gv0Var.OooO0oO = false;
        }
        if (this.OooO0o0) {
            gv0Var.OooO0OO(this);
        }
    }

    public void OooO0O0() {
    }

    public boolean OooO0OO(hm0 hm0Var) {
        return false;
    }

    public abstract boolean OooO0Oo();
}
