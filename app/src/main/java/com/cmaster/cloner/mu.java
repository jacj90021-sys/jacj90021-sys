package com.cmaster.cloner;

import android.content.Context;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mu {
    public static final int OooO0o = (int) Math.round(5.1000000000000005d);
    public final boolean OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final float OooO0o0;

    public mu(Context context) {
        boolean zOooO0O0 = sv2.OooO0O0(context, R.attr.elevationOverlayEnabled, false);
        int iOooO0O0 = uv2.OooO0O0(context, R.attr.elevationOverlayColor, 0);
        int iOooO0O02 = uv2.OooO0O0(context, R.attr.elevationOverlayAccentColor, 0);
        int iOooO0O03 = uv2.OooO0O0(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.OooO00o = zOooO0O0;
        this.OooO0O0 = iOooO0O0;
        this.OooO0OO = iOooO0O02;
        this.OooO0Oo = iOooO0O03;
        this.OooO0o0 = f;
    }
}
