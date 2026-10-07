package com.cmaster.cloner;

import android.content.Context;
import android.util.AndroidRuntimeException;
import java.io.File;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class dx1 {
    public static File OooO00o;
    public static File OooO0O0;
    public static final int[] OooO0OO = new int[0];
    public static final Object[] OooO0Oo = new Object[0];
    public static final String[] OooO0o0 = new String[0];

    public static File OooO00o() {
        if (OooO0O0 == null) {
            Integer num = qx1.OooO00o;
            OooO0OO(e92.OooO00o);
            if (OooO0O0 == null) {
                throw new AndroidRuntimeException(u7.OooO00o(new byte[]{-62, 59, -35, 42, 47, -55, -39, -80, -52, 90, -53, 61, 93, -56, -34, -35}, new byte[]{-128, 122, -114, 111, 15, -121, -116, -4}));
            }
        }
        File file = new File(OooO0O0, u7.OooO00o(new byte[]{1, 114, -4, -88}, new byte[]{101, 19, -120, -55, 114, 126, -11, -112}));
        zz.OooOO0(file, false);
        return file;
    }

    public static File OooO0O0() {
        File file = new File(OooO00o(), u7.OooO00o(new byte[]{-56, -95, 85, -101, 7, -40}, new byte[]{-69, -40, 38, -17, 98, -75, 70, -17}));
        zz.OooOO0(file, false);
        return file;
    }

    public static void OooO0OO(Context context) {
        synchronized (dx1.class) {
            try {
                if (OooO0O0 != null) {
                    return;
                }
                OooO00o = context.getCacheDir().getParentFile();
                File file = new File(OooO00o, u7.OooO00o(new byte[]{51, -102, -59, 99}, new byte[]{118, -56, -107, 33, -51, 94, 44, -111}));
                OooO0O0 = file;
                zz.OooOO0(file, false);
                zz.OooOO0(OooO0O0.getParentFile(), false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
