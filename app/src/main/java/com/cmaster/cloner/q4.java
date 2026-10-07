package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q4 extends oO0O000o {
    public final String OooO;
    public final Integer OooO00o;
    public final String OooO0O0;
    public final String OooO0OO;
    public final String OooO0Oo;
    public final String OooO0o;
    public final String OooO0o0;
    public final String OooO0oO;
    public final String OooO0oo;
    public final String OooOO0;
    public final String OooOO0O;
    public final String OooOO0o;

    public q4(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.OooO00o = num;
        this.OooO0O0 = str;
        this.OooO0OO = str2;
        this.OooO0Oo = str3;
        this.OooO0o0 = str4;
        this.OooO0o = str5;
        this.OooO0oO = str6;
        this.OooO0oo = str7;
        this.OooO = str8;
        this.OooOO0 = str9;
        this.OooOO0O = str10;
        this.OooOO0o = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oO0O000o)) {
            return false;
        }
        oO0O000o oo0o000o = (oO0O000o) obj;
        if (!this.OooO00o.equals(((q4) oo0o000o).OooO00o)) {
            return false;
        }
        if (!this.OooO0O0.equals(((q4) oo0o000o).OooO0O0)) {
            return false;
        }
        if (!this.OooO0OO.equals(((q4) oo0o000o).OooO0OO)) {
            return false;
        }
        if (!this.OooO0Oo.equals(((q4) oo0o000o).OooO0Oo)) {
            return false;
        }
        if (!this.OooO0o0.equals(((q4) oo0o000o).OooO0o0)) {
            return false;
        }
        if (!this.OooO0o.equals(((q4) oo0o000o).OooO0o)) {
            return false;
        }
        if (!this.OooO0oO.equals(((q4) oo0o000o).OooO0oO)) {
            return false;
        }
        if (!this.OooO0oo.equals(((q4) oo0o000o).OooO0oo)) {
            return false;
        }
        if (!this.OooO.equals(((q4) oo0o000o).OooO)) {
            return false;
        }
        if (!this.OooOO0.equals(((q4) oo0o000o).OooOO0)) {
            return false;
        }
        if (this.OooOO0O.equals(((q4) oo0o000o).OooOO0O)) {
            return this.OooOO0o.equals(((q4) oo0o000o).OooOO0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooOO0o.hashCode() ^ ((((((((((((((((((((((this.OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.OooO0O0.hashCode()) * 1000003) ^ this.OooO0OO.hashCode()) * 1000003) ^ this.OooO0Oo.hashCode()) * 1000003) ^ this.OooO0o0.hashCode()) * 1000003) ^ this.OooO0o.hashCode()) * 1000003) ^ this.OooO0oO.hashCode()) * 1000003) ^ this.OooO0oo.hashCode()) * 1000003) ^ this.OooO.hashCode()) * 1000003) ^ this.OooOO0.hashCode()) * 1000003) ^ this.OooOO0O.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.OooO00o);
        sb.append(", model=");
        sb.append(this.OooO0O0);
        sb.append(", hardware=");
        sb.append(this.OooO0OO);
        sb.append(", device=");
        sb.append(this.OooO0Oo);
        sb.append(", product=");
        sb.append(this.OooO0o0);
        sb.append(", osBuild=");
        sb.append(this.OooO0o);
        sb.append(", manufacturer=");
        sb.append(this.OooO0oO);
        sb.append(", fingerprint=");
        sb.append(this.OooO0oo);
        sb.append(", locale=");
        sb.append(this.OooO);
        sb.append(", country=");
        sb.append(this.OooOO0);
        sb.append(", mccMnc=");
        sb.append(this.OooOO0O);
        sb.append(", applicationBuild=");
        return rj.OooO0oO(sb, this.OooOO0o, "}");
    }
}
