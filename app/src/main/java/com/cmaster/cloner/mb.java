package com.cmaster.cloner;

import android.view.View;
import com.bumptech.matrix.ui.qrcode.GraphicOverlay;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class mb implements View.OnLayoutChangeListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ mb(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i9) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    view.post(new o00OOOOo(carouselLayoutManager, 3));
                    break;
                }
                break;
            default:
                ((GraphicOverlay) obj).OooOOO0 = true;
                break;
        }
    }
}
