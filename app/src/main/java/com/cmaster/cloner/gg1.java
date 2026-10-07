package com.cmaster.cloner;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gg1 extends ig1 {
    public static final RectF OooO0oo = new RectF();
    public final float OooO0O0;
    public final float OooO0OO;
    public final float OooO0Oo;
    public float OooO0o;
    public final float OooO0o0;
    public float OooO0oO;

    public gg1(float f, float f2, float f3, float f4) {
        this.OooO0O0 = f;
        this.OooO0OO = f2;
        this.OooO0Oo = f3;
        this.OooO0o0 = f4;
    }

    @Override // com.cmaster.cloner.ig1
    public final void OooO00o(Matrix matrix, Path path) {
        Matrix matrix2 = this.OooO00o;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.OooO0Oo;
        float f2 = this.OooO0o0;
        RectF rectF = OooO0oo;
        rectF.set(this.OooO0O0, this.OooO0OO, f, f2);
        path.arcTo(rectF, this.OooO0o, this.OooO0oO, false);
        path.transform(matrix);
    }
}
