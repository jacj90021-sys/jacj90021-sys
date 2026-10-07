package com.cmaster.cloner;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mp extends View {
    public Paint OooO0Oo;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        Paint paint = this.OooO0Oo;
        canvas.drawRect(width * 0.3f, height * 0.35f, width * 0.7f, height * 0.8f, paint);
        float f = height * 0.3f;
        canvas.drawLine(width * 0.25f, f, width * 0.75f, f, paint);
        float f2 = height * 0.2f;
        canvas.drawLine(width * 0.45f, f2, width * 0.55f, f2, paint);
        float f3 = width * 0.42f;
        float f4 = height * 0.45f;
        float f5 = height * 0.7f;
        canvas.drawLine(f3, f4, f3, f5, paint);
        float f6 = width * 0.5f;
        canvas.drawLine(f6, f4, f6, f5, paint);
        float f7 = width * 0.58f;
        canvas.drawLine(f7, f4, f7, f5, paint);
    }
}
