package com.cmaster.cloner;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.bumptech.matrix.ui.qrcode.GraphicOverlay;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kg0 extends v60 {
    public final Paint OooO0O0;
    public final GraphicOverlay OooO0OO;
    public final long OooO0Oo;
    public final Integer OooO0o;
    public final long OooO0o0;

    public kg0(GraphicOverlay graphicOverlay, long j, long j2, Integer num) {
        super(graphicOverlay);
        this.OooO0OO = graphicOverlay;
        this.OooO0Oo = j;
        this.OooO0o0 = j2;
        this.OooO0o = num;
        Paint paint = new Paint();
        this.OooO0O0 = paint;
        paint.setColor(-1);
        paint.setTextSize(60.0f);
        paint.setShadowLayer(5.0f, 0.0f, 0.0f, -16777216);
        graphicOverlay.postInvalidate();
    }

    @Override // com.cmaster.cloner.v60
    public final synchronized void OooO00o(Canvas canvas) {
        try {
            canvas.drawText(sn2.OooO00o("Gw+f4c9aJeY1BM/n0mktvXI=\n", "UmHvlLsTSIc=\n") + this.OooO0OO.getImageHeight() + sn2.OooO00o("Fg==\n", "bvz5MzfOlEA=\n") + this.OooO0OO.getImageWidth(), 30.0f, 90.0f, this.OooO0O0);
            if (this.OooO0o != null) {
                canvas.drawText(sn2.OooO00o("LlFS+q8=\n", "aAEBwI+SmG0=\n") + this.OooO0o + sn2.OooO00o("T1yzjFIR38sPHYGbXR/D0UM=\n", "Y3z1/jN8uus=\n") + this.OooO0Oo + sn2.OooO00o("Pyez\n", "H0rAVcSpZaA=\n"), 30.0f, 150.0f, this.OooO0O0);
            } else {
                canvas.drawText(sn2.OooO00o("TTJFE3VHI3B/JUodaV1v\n", "C0AkfhBnTxE=\n") + this.OooO0Oo + sn2.OooO00o("ySlz\n", "6UQANnYgjg0=\n"), 30.0f, 150.0f, this.OooO0O0);
            }
            canvas.drawText(sn2.OooO00o("xHj2ujCQBHSgceOrNooIf7o9\n", "gB2C31PkawY=\n") + this.OooO0o0 + sn2.OooO00o("Me6E\n", "EYP3gh5+11k=\n"), 30.0f, 210.0f, this.OooO0O0);
        } catch (Throwable th) {
            throw th;
        }
    }
}
