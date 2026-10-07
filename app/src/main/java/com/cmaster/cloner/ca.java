package com.cmaster.cloner;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ca {
    public static final String OooO0OO;
    public static final Set OooO0Oo;
    public static final ca OooO0o0;
    public final String OooO00o;
    public final String OooO0O0;

    static {
        String strOooO00o = f43.OooO00o("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        OooO0OO = strOooO00o;
        f43.OooO00o("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f43.OooO00o("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        OooO0Oo = Collections.unmodifiableSet(new HashSet(Arrays.asList(new dw("proto"), new dw("json"))));
        OooO0o0 = new ca(strOooO00o, null);
    }

    public ca(String str, String str2) {
        this.OooO00o = str;
        this.OooO0O0 = str2;
    }

    public static ca OooO00o(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            ra.OooOOO("Version marker missing from extras");
            return null;
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            ra.OooOOO("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            ra.OooOOO("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = strArrSplit[1];
        return new ca(str2, str3.isEmpty() ? null : str3);
    }
}
