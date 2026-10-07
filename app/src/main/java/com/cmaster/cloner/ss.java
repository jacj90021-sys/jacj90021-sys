package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ss {
    public static final ss OooO0O0 = new ss(2);
    public static final ss OooO0OO = new ss(0);
    public static final ss OooO0Oo;
    public static final ss OooO0o;
    public static final ss OooO0o0;
    public static final tz0 OooO0oO;
    public static final boolean OooO0oo;
    public final /* synthetic */ int OooO00o;

    static {
        ss ssVar = new ss(1);
        OooO0Oo = ssVar;
        OooO0o0 = new ss(3);
        OooO0o = ssVar;
        OooO0oO = tz0.OooO00o(ssVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        OooO0oo = true;
    }

    public /* synthetic */ ss(int i) {
        this.OooO00o = i;
    }

    public final int OooO00o(int i, int i2, int i3, int i4) {
        switch (this.OooO00o) {
            case 0:
                if (OooO0O0(i, i2, i3, i4) == 1.0f) {
                    return 2;
                }
                return OooO0O0.OooO00o(i, i2, i3, i4);
            case 1:
                return 2;
            case 2:
                return OooO0oo ? 2 : 1;
            default:
                return 2;
        }
    }

    public final float OooO0O0(int i, int i2, int i3, int i4) {
        switch (this.OooO00o) {
            case 0:
                return Math.min(1.0f, OooO0O0.OooO0O0(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (OooO0oo) {
                    return Math.min(i3 / i, i4 / i2);
                }
                if (Math.max(i2 / i4, i / i3) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r1);
            default:
                return 1.0f;
        }
    }
}
