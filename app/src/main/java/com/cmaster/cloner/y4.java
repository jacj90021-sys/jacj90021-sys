package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y4 {
    public static final y4 OooO0o = new y4(10485760, 200, 10000, 604800000, 81920);
    public final long OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final long OooO0Oo;
    public final int OooO0o0;

    public y4(long j, int i, int i2, long j2, int i3) {
        this.OooO00o = j;
        this.OooO0O0 = i;
        this.OooO0OO = i2;
        this.OooO0Oo = j2;
        this.OooO0o0 = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y4) {
            y4 y4Var = (y4) obj;
            if (this.OooO00o == y4Var.OooO00o && this.OooO0O0 == y4Var.OooO0O0 && this.OooO0OO == y4Var.OooO0OO && this.OooO0Oo == y4Var.OooO0Oo && this.OooO0o0 == y4Var.OooO0o0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.OooO00o;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.OooO0O0) * 1000003) ^ this.OooO0OO) * 1000003;
        long j2 = this.OooO0Oo;
        return this.OooO0o0 ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.OooO00o);
        sb.append(", loadBatchSize=");
        sb.append(this.OooO0O0);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.OooO0OO);
        sb.append(", eventCleanUpAge=");
        sb.append(this.OooO0Oo);
        sb.append(", maxBlobByteSizePerRow=");
        return rj.OooO0o(sb, this.OooO0o0, "}");
    }
}
