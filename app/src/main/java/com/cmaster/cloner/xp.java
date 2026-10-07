package com.cmaster.cloner;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xp extends rr2 {
    public final /* synthetic */ int OooO00o = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.rr2
    public final float OooO00o(Drawable drawable) {
        switch (this.OooO00o) {
            case 0:
                return ((yp) drawable).OooOo00.OooO0O0 * 10000.0f;
            default:
                return ((kq0) drawable).getDisplayedWidthIncrease();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.rr2
    public final void OooO0O0(Drawable drawable, float f) {
        switch (this.OooO00o) {
            case 0:
                yp ypVar = (yp) drawable;
                ypVar.OooOo00.OooO0O0 = f / 10000.0f;
                ypVar.invalidateSelf();
                int i = (int) f;
                if (ypVar.OooO0o0.OooO00o(true)) {
                    Context context = ypVar.OooO0Oo;
                    if (ypVar.OooOo == null) {
                        LinearInterpolator linearInterpolator = oO0oO000.OooO00o;
                        ypVar.OooOoO = ow2.OooO0Oo(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        ypVar.OooOoOO = ow2.OooO0Oo(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        ypVar.OooOo = valueAnimator;
                        valueAnimator.setDuration(500L);
                        ypVar.OooOo.setFloatValues(0.0f, 1.0f);
                        ypVar.OooOo.setInterpolator(null);
                        ypVar.OooOo.addUpdateListener(new wp(ypVar, 0));
                    }
                    float f2 = i;
                    float f3 = (f2 < 1000.0f || f2 > 9000.0f) ? 0.0f : 1.0f;
                    float f4 = ypVar.OooOo0;
                    ValueAnimator valueAnimator2 = ypVar.OooOo;
                    if (f3 == f4) {
                        if (!valueAnimator2.isRunning()) {
                            ypVar.OooOo00.OooO0Oo = f3;
                            ypVar.invalidateSelf();
                            break;
                        }
                    } else {
                        if (valueAnimator2.isRunning()) {
                            ypVar.OooOo.cancel();
                        }
                        ypVar.OooOo0 = f3;
                        if (f3 != 1.0f) {
                            ypVar.OooOoO0 = ypVar.OooOoOO;
                            ypVar.OooOo.reverse();
                            break;
                        } else {
                            ypVar.OooOoO0 = ypVar.OooOoO;
                            ypVar.OooOo.start();
                            break;
                        }
                    }
                }
                break;
            default:
                ((kq0) drawable).setDisplayedWidthIncrease(f);
                break;
        }
    }
}
