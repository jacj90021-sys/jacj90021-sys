package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class pr1 {
    public static final char[] OooO00o = "0123456789abcdef".toCharArray();
    public static final char[] OooO0O0 = new char[64];
    public static volatile Handler OooO0OO;

    public static boolean OooO(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
        return false;
    }

    public static void OooO00o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        ra.OooOOO("You must call this method on the main thread");
    }

    public static boolean OooO0O0(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int OooO0OO(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    public static int OooO0Oo(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = or1.OooO00o[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    public static Handler OooO0o() {
        if (OooO0OO == null) {
            synchronized (pr1.class) {
                try {
                    if (OooO0OO == null) {
                        OooO0OO = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return OooO0OO;
    }

    public static ArrayList OooO0o0(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int OooO0oO(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int OooO0oo(int i, Object obj) {
        return OooO0oO(obj == null ? 0 : obj.hashCode(), i);
    }
}
