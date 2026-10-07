package com.cmaster.cloner;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class rc2 {
    public static String OooO00o;
    public static final Object OooO0O0 = new Object();
    public static boolean OooO0OO;
    public static int OooO0Oo;

    public static synchronized String OooO00o(Context context) {
        String str;
        try {
            if (OooO00o == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || o73.OooO00o()) {
                    string = "emulator";
                }
                for (int i = 0; i < 3; i++) {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(string.getBytes());
                        str = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                        break;
                    } catch (ArithmeticException unused) {
                    } catch (NoSuchAlgorithmException unused2) {
                    }
                }
                str = "";
                OooO00o = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return OooO00o;
    }
}
