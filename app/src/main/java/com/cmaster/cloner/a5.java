package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a5 extends bp0 {
    public final long OooO00o;
    public final long OooO0O0;
    public final t4 OooO0OO;
    public final Integer OooO0Oo;
    public final ArrayList OooO0o;
    public final String OooO0o0;

    public a5(long j, long j2, t4 t4Var, Integer num, String str, ArrayList arrayList) {
        z51 z51Var = z51.OooO0Oo;
        this.OooO00o = j;
        this.OooO0O0 = j2;
        this.OooO0OO = t4Var;
        this.OooO0Oo = num;
        this.OooO0o0 = str;
        this.OooO0o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bp0)) {
            return false;
        }
        a5 a5Var = (a5) ((bp0) obj);
        if (this.OooO00o != a5Var.OooO00o || this.OooO0O0 != a5Var.OooO0O0 || !this.OooO0OO.equals(a5Var.OooO0OO)) {
            return false;
        }
        Integer num = a5Var.OooO0Oo;
        Integer num2 = this.OooO0Oo;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = a5Var.OooO0o0;
        String str2 = this.OooO0o0;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.OooO0o.equals(a5Var.OooO0o)) {
            return false;
        }
        Object obj2 = z51.OooO0Oo;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.OooO00o;
        long j2 = this.OooO0O0;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.OooO0OO.hashCode()) * 1000003;
        Integer num = this.OooO0Oo;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.OooO0o0;
        return ((this.OooO0o.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ z51.OooO0Oo.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.OooO00o + ", requestUptimeMs=" + this.OooO0O0 + ", clientInfo=" + this.OooO0OO + ", logSource=" + this.OooO0Oo + ", logSourceName=" + this.OooO0o0 + ", logEvents=" + this.OooO0o + ", qosTier=" + z51.OooO0Oo + "}";
    }
}
