package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z4 extends ap0 {
    public final long OooO00o;
    public final Integer OooO0O0;
    public final long OooO0OO;
    public final byte[] OooO0Oo;
    public final long OooO0o;
    public final String OooO0o0;
    public final tw0 OooO0oO;

    public z4(long j, Integer num, long j2, byte[] bArr, String str, long j3, tw0 tw0Var) {
        this.OooO00o = j;
        this.OooO0O0 = num;
        this.OooO0OO = j2;
        this.OooO0Oo = bArr;
        this.OooO0o0 = str;
        this.OooO0o = j3;
        this.OooO0oO = tw0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ap0) {
            ap0 ap0Var = (ap0) obj;
            z4 z4Var = (z4) ap0Var;
            if (this.OooO00o == z4Var.OooO00o) {
                Integer num = z4Var.OooO0O0;
                Integer num2 = this.OooO0O0;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.OooO0OO == z4Var.OooO0OO) {
                        if (Arrays.equals(this.OooO0Oo, ap0Var instanceof z4 ? ((z4) ap0Var).OooO0Oo : z4Var.OooO0Oo)) {
                            String str = z4Var.OooO0o0;
                            String str2 = this.OooO0o0;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.OooO0o == z4Var.OooO0o) {
                                    tw0 tw0Var = z4Var.OooO0oO;
                                    tw0 tw0Var2 = this.OooO0oO;
                                    if (tw0Var2 != null ? tw0Var2.equals(tw0Var) : tw0Var == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.OooO00o;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.OooO0O0;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.OooO0OO;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.OooO0Oo)) * 1000003;
        String str = this.OooO0o0;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.OooO0o;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        tw0 tw0Var = this.OooO0oO;
        return i2 ^ (tw0Var != null ? tw0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.OooO00o + ", eventCode=" + this.OooO0O0 + ", eventUptimeMs=" + this.OooO0OO + ", sourceExtension=" + Arrays.toString(this.OooO0Oo) + ", sourceExtensionJsonProto3=" + this.OooO0o0 + ", timezoneOffsetSeconds=" + this.OooO0o + ", networkConnectionInfo=" + this.OooO0oO + "}";
    }
}
