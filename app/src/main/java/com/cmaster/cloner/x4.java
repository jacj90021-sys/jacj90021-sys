package com.cmaster.cloner;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class x4 {
    public final String OooO00o;
    public final Integer OooO0O0;
    public final xv OooO0OO;
    public final long OooO0Oo;
    public final Map OooO0o;
    public final long OooO0o0;

    public x4(String str, Integer num, xv xvVar, long j, long j2, HashMap map) {
        this.OooO00o = str;
        this.OooO0O0 = num;
        this.OooO0OO = xvVar;
        this.OooO0Oo = j;
        this.OooO0o0 = j2;
        this.OooO0o = map;
    }

    public final String OooO00o(String str) {
        String str2 = (String) this.OooO0o.get(str);
        return str2 == null ? "" : str2;
    }

    public final int OooO0O0(String str) {
        String str2 = (String) this.OooO0o.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final oO0Ooooo OooO0OO() {
        oO0Ooooo oo0ooooo = new oO0Ooooo(3);
        String str = this.OooO00o;
        if (str == null) {
            qa.OooOOO0("Null transportName");
            return null;
        }
        oo0ooooo.OooO0o0 = str;
        oo0ooooo.OooO0o = this.OooO0O0;
        xv xvVar = this.OooO0OO;
        if (xvVar == null) {
            qa.OooOOO0("Null encodedPayload");
            return null;
        }
        oo0ooooo.OooO0oO = xvVar;
        oo0ooooo.OooO0oo = Long.valueOf(this.OooO0Oo);
        oo0ooooo.OooO = Long.valueOf(this.OooO0o0);
        oo0ooooo.OooOO0 = new HashMap(this.OooO0o);
        return oo0ooooo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x4) {
            x4 x4Var = (x4) obj;
            if (this.OooO00o.equals(x4Var.OooO00o)) {
                Integer num = x4Var.OooO0O0;
                Integer num2 = this.OooO0O0;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.OooO0OO.equals(x4Var.OooO0OO) && this.OooO0Oo == x4Var.OooO0Oo && this.OooO0o0 == x4Var.OooO0o0 && this.OooO0o.equals(x4Var.OooO0o)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.OooO00o.hashCode() ^ 1000003) * 1000003;
        Integer num = this.OooO0O0;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.OooO0OO.hashCode()) * 1000003;
        long j = this.OooO0Oo;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.OooO0o0;
        return this.OooO0o.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.OooO00o + ", code=" + this.OooO0O0 + ", encodedPayload=" + this.OooO0OO + ", eventMillis=" + this.OooO0Oo + ", uptimeMillis=" + this.OooO0o0 + ", autoMetadata=" + this.OooO0o + "}";
    }
}
