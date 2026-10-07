package com.cmaster.cloner;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k00 implements TypeEvaluator {
    public final float[] OooO00o = new float[9];
    public final float[] OooO0O0 = new float[9];
    public final Matrix OooO0OO = new Matrix();
    public final /* synthetic */ n00 OooO0Oo;

    public k00(n00 n00Var) {
        this.OooO0Oo = n00Var;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        this.OooO0Oo.OooOOOo = f;
        float[] fArr = this.OooO00o;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.OooO0O0;
        ((Matrix) obj2).getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = ((f2 - f3) * f) + f3;
        }
        Matrix matrix = this.OooO0OO;
        matrix.setValues(fArr2);
        return matrix;
    }
}
