package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nz2 extends wb3 {
    public final int OooO00o;
    public final int OooO0O0;
    public final boolean OooO0OO;

    public nz2(int i, int i2, boolean z) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wb3) {
            nz2 nz2Var = (nz2) ((wb3) obj);
            if (this.OooO00o == nz2Var.OooO00o && this.OooO0O0 == nz2Var.OooO0O0 && this.OooO0OO == nz2Var.OooO0OO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.OooO0O0 ^ ((this.OooO00o ^ 1000003) * 1000003)) * 1000003) ^ (true != this.OooO0OO ? 1237 : 1231);
    }

    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.OooO00o + ", clickPrerequisite=" + this.OooO0O0 + ", notificationFlowEnabled=" + this.OooO0OO + "}";
    }
}
