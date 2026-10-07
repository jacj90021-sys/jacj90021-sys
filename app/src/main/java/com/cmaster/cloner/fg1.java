package com.cmaster.cloner;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fg1 extends jg1 {
    public final hg1 OooO0OO;
    public final float OooO0Oo;
    public final float OooO0o0;

    public fg1(hg1 hg1Var, float f, float f2) {
        this.OooO0OO = hg1Var;
        this.OooO0Oo = f;
        this.OooO0o0 = f2;
    }

    @Override // com.cmaster.cloner.jg1
    public final void OooO00o(Matrix matrix, xf1 xf1Var, int i, Canvas canvas) {
        hg1 hg1Var = this.OooO0OO;
        float f = hg1Var.OooO0OO;
        float f2 = this.OooO0o0;
        float f3 = hg1Var.OooO0O0;
        float f4 = this.OooO0Oo;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.OooO00o;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(OooO0O0());
        xf1Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = xf1Var.OooO0OO;
        int[] iArr = xf1.OooO;
        iArr[0] = i2;
        iArr[1] = xf1Var.OooO0O0;
        iArr[2] = xf1Var.OooO00o;
        Paint paint = (Paint) xf1Var.OooO0o;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, xf1.OooOO0, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float OooO0O0() {
        hg1 hg1Var = this.OooO0OO;
        return (float) Math.toDegrees(Math.atan((hg1Var.OooO0OO - this.OooO0o0) / (hg1Var.OooO0O0 - this.OooO0Oo)));
    }
}
