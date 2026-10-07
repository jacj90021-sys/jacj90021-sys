package com.cmaster.cloner;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ob extends g71 {
    public final Paint OooO0Oo;
    public final List OooO0o0;

    public ob() {
        Paint paint = new Paint();
        this.OooO0Oo = paint;
        this.OooO0o0 = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // com.cmaster.cloner.g71
    public final void OooO0o(Canvas canvas, RecyclerView recyclerView) throws Resources.NotFoundException {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.OooO0Oo;
        paint.setStrokeWidth(dimension);
        Iterator it = this.OooO0o0.iterator();
        while (it.hasNext()) {
            ((bl0) it.next()).getClass();
            ThreadLocal threadLocal = ye.OooO00o;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).o000000o()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).OooOOo0.OooO0o(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).OooOOo0.OooO0O0(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).OooOOo0.OooO0OO(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).OooOOo0.OooO0Oo(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
