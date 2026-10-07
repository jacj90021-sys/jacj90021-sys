package com.cmaster.cloner;

import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class sn2 {
    public static String OooO00o(String str, String str2) {
        byte[] bArrOooO00o = on2.OooO00o(str);
        byte[] bArrOooO00o2 = on2.OooO00o(str2);
        int i = v7.OooO00o;
        int length = bArrOooO00o.length;
        int length2 = bArrOooO00o2.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 >= length2) {
                i3 = 0;
            }
            bArrOooO00o[i2] = (byte) ((bArrOooO00o[i2] ^ bArrOooO00o2[i3]) | v7.OooO00o);
            i2++;
            i3++;
        }
        return new String(bArrOooO00o, StandardCharsets.UTF_8);
    }
}
