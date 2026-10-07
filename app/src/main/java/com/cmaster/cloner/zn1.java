package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zn1 {
    public final long OooO00o;
    public final long OooO0O0;
    public final int OooO0OO;

    public zn1(long j, long j2, int i) {
        this.OooO00o = j;
        this.OooO0O0 = j2;
        this.OooO0OO = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn1)) {
            return false;
        }
        zn1 zn1Var = (zn1) obj;
        return this.OooO00o == zn1Var.OooO00o && this.OooO0O0 == zn1Var.OooO0O0 && this.OooO0OO == zn1Var.OooO0OO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.OooO0OO) + ((Long.hashCode(this.OooO0O0) + (Long.hashCode(this.OooO00o) * 31)) * 31);
    }

    public final String toString() {
        return "Topic { ".concat("TaxonomyVersion=" + this.OooO00o + ", ModelVersion=" + this.OooO0O0 + ", TopicCode=" + this.OooO0OO + " }");
    }
}
