package com.bumptech.glide.load;

import com.cmaster.cloner.vf0;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);

    public final boolean OooO0Oo;

    ImageHeaderParser$ImageType(boolean z) {
        this.OooO0Oo = z;
    }

    public boolean hasAlpha() {
        return this.OooO0Oo;
    }

    public boolean isWebp() {
        int i = vf0.OooO00o[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
