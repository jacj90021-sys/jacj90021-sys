package com.cmaster.cloner;

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class c3 implements TypeEvaluator {
    public static Integer OooO00o(float f, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = ((((float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f) + fPow2;
        float fPow6 = ((((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3) * f) + fPow3;
        float f4 = (((f3 - f2) * f) + f2) * 255.0f;
        return Integer.valueOf((Math.round(((float) Math.pow(((fPow4 - fPow) * f) + fPow, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f4) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
