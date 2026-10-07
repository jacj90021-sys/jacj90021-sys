package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class lb1 {
    public static final int[] OooO00o = {android.R.attr.state_enabled, android.R.attr.state_pressed};
    public static final String OooO0O0 = lb1.class.getSimpleName();

    public static ColorStateList OooO00o(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(OooO00o, 0)) != 0) {
            Log.w(OooO0O0, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }
}
