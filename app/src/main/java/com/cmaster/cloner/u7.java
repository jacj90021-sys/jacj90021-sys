package com.cmaster.cloner;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class u7 {
    public static byte OooO00o = (byte) new SecureRandom().nextInt(256);

    public static String OooO00o(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            byte b = (byte) (bArr[i] ^ bArr2[i2]);
            bArr[i] = b;
            bArr[i] = (byte) (b | OooO00o);
            i++;
            i2++;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
