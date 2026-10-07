package com.cmaster.cloner;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class or1 {
    public static final /* synthetic */ int[] OooO00o;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        OooO00o = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            OooO00o[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            OooO00o[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            OooO00o[Bitmap.Config.RGBA_F16.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            OooO00o[Bitmap.Config.ARGB_8888.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
