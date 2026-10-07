package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r4 {
    public final int OooO00o;
    public final long OooO0O0;

    public r4(int i, long j) {
        if (i == 0) {
            qa.OooOOO0("Null status");
            throw null;
        }
        this.OooO00o = i;
        this.OooO0O0 = j;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof r4) {
                r4 r4Var = (r4) obj;
                int i = r4Var.OooO00o;
                int i2 = this.OooO00o;
                if (i2 == 0) {
                    throw null;
                }
                if (!(i2 == i) || this.OooO0O0 != r4Var.OooO0O0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iOooOOoo = (rj.OooOOoo(this.OooO00o) ^ 1000003) * 1000003;
        long j = this.OooO0O0;
        return ((int) ((j >>> 32) ^ j)) ^ iOooOOoo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.OooO00o;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.OooO0O0);
        sb.append("}");
        return sb.toString();
    }
}
