package com.cmaster.cloner;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bumptech.matrix.ui.qrcode.GraphicOverlay;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y5 extends v60 {
    public final Paint OooO0O0;
    public final Paint OooO0OO;
    public final x5 OooO0Oo;
    public final Paint OooO0o0;

    public y5(GraphicOverlay graphicOverlay, x5 x5Var) {
        super(graphicOverlay);
        this.OooO0Oo = x5Var;
        Paint paint = new Paint();
        this.OooO0O0 = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        Paint paint2 = new Paint();
        this.OooO0OO = paint2;
        paint2.setColor(-16777216);
        paint2.setTextSize(54.0f);
        Paint paint3 = new Paint();
        this.OooO0o0 = paint3;
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.FILL);
    }

    @Override // com.cmaster.cloner.v60
    public final void OooO00o(Canvas canvas) {
        x5 x5Var = this.OooO0Oo;
        if (x5Var == null) {
            qa.OooO0o(sn2.OooO00o("bBQIjiTd7mVDB1yfJo3+fkwXXIppw+9gQUAeijvO9WhITg==\n", "LWB860mtmgw=\n"));
            return;
        }
        c6 c6Var = x5Var.OooO00o;
        RectF rectF = new RectF(x5Var.OooO0O0);
        float f = rectF.left;
        GraphicOverlay graphicOverlay = this.OooO00o;
        float width = graphicOverlay.OooOO0o ? graphicOverlay.getWidth() - ((f * graphicOverlay.OooO) - graphicOverlay.OooOO0) : (f * graphicOverlay.OooO) - graphicOverlay.OooOO0;
        float f2 = rectF.right;
        float width2 = graphicOverlay.OooOO0o ? graphicOverlay.getWidth() - ((f2 * graphicOverlay.OooO) - graphicOverlay.OooOO0) : (f2 * graphicOverlay.OooO) - graphicOverlay.OooOO0;
        rectF.left = Math.min(width, width2);
        rectF.right = Math.max(width, width2);
        float f3 = rectF.top;
        float f4 = graphicOverlay.OooO;
        float f5 = graphicOverlay.OooOO0O;
        rectF.top = (f3 * f4) - f5;
        rectF.bottom = (rectF.bottom * f4) - f5;
        canvas.drawRect(rectF, this.OooO0O0);
        String strOooO0oo = c6Var.OooO0oo();
        Paint paint = this.OooO0OO;
        float fMeasureText = paint.measureText(strOooO0oo);
        float f6 = rectF.left;
        float f7 = rectF.top;
        canvas.drawRect(f6 - 4.0f, f7 - 62.0f, f6 + fMeasureText + 8.0f, f7, this.OooO0o0);
        canvas.drawText(c6Var.OooO0oo(), rectF.left, rectF.top - 4.0f, paint);
    }
}
