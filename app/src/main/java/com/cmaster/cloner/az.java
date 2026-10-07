package com.cmaster.cloner;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class az {
    public Rect OooO;
    public cz OooO00o;
    public Resources OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public RectF OooO0o;
    public Path OooO0o0;
    public Paint OooO0oO;
    public int OooO0oo;
    public Rect OooOO0;
    public Rect OooOO0O;
    public String OooOO0o;
    public Rect OooOOO;
    public Paint OooOOO0;
    public float OooOOOO;
    public ValueAnimator OooOOOo;
    public int OooOOo;
    public boolean OooOOo0;

    public final void OooO00o(boolean z) {
        if (this.OooOOo0 != z) {
            this.OooOOo0 = z;
            ValueAnimator valueAnimator = this.OooOOOo;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 1.0f : 0.0f);
            this.OooOOOo = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new u8(this, 1));
            this.OooOOOo.setDuration(z ? 200L : 150L);
            this.OooOOOo.start();
        }
    }
}
