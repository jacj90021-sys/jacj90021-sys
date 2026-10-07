package com.cmaster.cloner;

import android.graphics.Insets;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zg0 {
    public static final zg0 OooO0o0 = new zg0(0, 0, 0, 0);
    public final int OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;

    public zg0(int i, int i2, int i3, int i4) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = i3;
        this.OooO0Oo = i4;
    }

    public static zg0 OooO00o(zg0 zg0Var, zg0 zg0Var2) {
        return OooO0O0(Math.max(zg0Var.OooO00o, zg0Var2.OooO00o), Math.max(zg0Var.OooO0O0, zg0Var2.OooO0O0), Math.max(zg0Var.OooO0OO, zg0Var2.OooO0OO), Math.max(zg0Var.OooO0Oo, zg0Var2.OooO0Oo));
    }

    public static zg0 OooO0O0(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? OooO0o0 : new zg0(i, i2, i3, i4);
    }

    public static zg0 OooO0OO(Insets insets) {
        return OooO0O0(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets OooO0Oo() {
        return b2.OooO0o0(this.OooO00o, this.OooO0O0, this.OooO0OO, this.OooO0Oo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zg0.class != obj.getClass()) {
            return false;
        }
        zg0 zg0Var = (zg0) obj;
        return this.OooO0Oo == zg0Var.OooO0Oo && this.OooO00o == zg0Var.OooO00o && this.OooO0OO == zg0Var.OooO0OO && this.OooO0O0 == zg0Var.OooO0O0;
    }

    public final int hashCode() {
        return (((((this.OooO00o * 31) + this.OooO0O0) * 31) + this.OooO0OO) * 31) + this.OooO0Oo;
    }

    public final String toString() {
        return "Insets{left=" + this.OooO00o + ", top=" + this.OooO0O0 + ", right=" + this.OooO0OO + ", bottom=" + this.OooO0Oo + '}';
    }
}
