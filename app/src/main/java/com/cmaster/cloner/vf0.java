package com.cmaster.cloner;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class vf0 {
    public static final /* synthetic */ int[] OooO00o;

    static {
        int[] iArr = new int[ImageHeaderParser$ImageType.values().length];
        OooO00o = iArr;
        try {
            iArr[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            OooO00o[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            OooO00o[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
