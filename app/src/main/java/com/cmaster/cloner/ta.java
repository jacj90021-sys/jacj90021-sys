package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bumptech.matrix.ui.qrcode.GraphicOverlay;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ta extends v60 {
    public final Bitmap OooO0O0;

    public ta(GraphicOverlay graphicOverlay, Bitmap bitmap) {
        super(graphicOverlay);
        this.OooO0O0 = bitmap;
    }

    @Override // com.cmaster.cloner.v60
    public final void OooO00o(Canvas canvas) {
        canvas.drawBitmap(this.OooO0O0, this.OooO00o.OooO0o, null);
    }
}
