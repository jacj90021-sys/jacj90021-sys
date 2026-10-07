package com.cmaster.cloner;

import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class q0 {
    public static int OooO00o(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void OooO0O0(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public static void OooO0OO(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static boolean OooO0Oo(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
