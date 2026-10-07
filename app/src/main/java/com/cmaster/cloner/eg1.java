package com.cmaster.cloner;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class eg1 extends jg1 {
    public final gg1 OooO0OO;

    public eg1(gg1 gg1Var) {
        this.OooO0OO = gg1Var;
    }

    @Override // com.cmaster.cloner.jg1
    public final void OooO00o(Matrix matrix, xf1 xf1Var, int i, Canvas canvas) {
        gg1 gg1Var = this.OooO0OO;
        float f = gg1Var.OooO0o;
        float f2 = gg1Var.OooO0oO;
        RectF rectF = new RectF(gg1Var.OooO0O0, gg1Var.OooO0OO, gg1Var.OooO0Oo, gg1Var.OooO0o0);
        Paint paint = (Paint) xf1Var.OooO0o0;
        boolean z = f2 < 0.0f;
        Path path = (Path) xf1Var.OooO0oo;
        int[] iArr = xf1.OooOO0O;
        if (z) {
            iArr[0] = 0;
            iArr[1] = xf1Var.OooO0OO;
            iArr[2] = xf1Var.OooO0O0;
            iArr[3] = xf1Var.OooO00o;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = xf1Var.OooO00o;
            iArr[2] = xf1Var.OooO0O0;
            iArr[3] = xf1Var.OooO0OO;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = xf1.OooOO0o;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, (Paint) xf1Var.OooO0oO);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
