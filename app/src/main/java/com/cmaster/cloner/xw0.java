package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xw0 {
    public boolean OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw0)) {
            return false;
        }
        xw0 xw0Var = (xw0) obj;
        return this.OooO00o == xw0Var.OooO00o && this.OooO0O0 == xw0Var.OooO0O0 && this.OooO0OO == xw0Var.OooO0OO && this.OooO0Oo == xw0Var.OooO0Oo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        int r0 = this.OooO00o ? 1 : 0;
        int i = r0;
        if (this.OooO0O0) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.OooO0OO) {
            i2 = i + 256;
        }
        return this.OooO0Oo ? i2 + 4096 : i2;
    }

    public final String toString() {
        return "[ Connected=" + this.OooO00o + " Validated=" + this.OooO0O0 + " Metered=" + this.OooO0OO + " NotRoaming=" + this.OooO0Oo + " ]";
    }
}
