package com.cmaster.cloner;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r00 {
    public final String OooO00o;
    public final String OooO0O0;
    public final String OooO0OO;
    public final List OooO0Oo;
    public final String OooO0o;
    public final String OooO0o0;
    public final String OooO0oO;

    public r00(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.OooO00o = str;
        str2.getClass();
        this.OooO0O0 = str2;
        this.OooO0OO = str3;
        list.getClass();
        this.OooO0Oo = list;
        this.OooO0o0 = str4;
        this.OooO0o = str5;
        this.OooO0oO = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.OooO00o + ", mProviderPackage: " + this.OooO0O0 + ", mQuery: " + this.OooO0OO + ", mSystemFont: " + this.OooO0o0 + ", mVariationSettings: " + this.OooO0o + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.OooO0Oo;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
