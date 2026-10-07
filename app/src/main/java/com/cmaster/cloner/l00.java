package com.cmaster.cloner;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l00 implements TypeEvaluator {
    public final FloatEvaluator OooO00o = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        float fFloatValue = this.OooO00o.evaluate(f, (Number) obj, (Number) obj2).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = 0.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}
