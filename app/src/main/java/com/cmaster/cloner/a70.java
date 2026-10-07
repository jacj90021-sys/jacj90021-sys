package com.cmaster.cloner;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a70 extends View {
    public a70(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        vh vhVar = (vh) getLayoutParams();
        vhVar.OooO00o = i;
        setLayoutParams(vhVar);
    }

    public void setGuidelineEnd(int i) {
        vh vhVar = (vh) getLayoutParams();
        vhVar.OooO0O0 = i;
        setLayoutParams(vhVar);
    }

    public void setGuidelinePercent(float f) {
        vh vhVar = (vh) getLayoutParams();
        vhVar.OooO0OO = f;
        setLayoutParams(vhVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
