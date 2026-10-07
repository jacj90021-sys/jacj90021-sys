package com.cmaster.cloner;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class oOO0Oo00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;
    public final /* synthetic */ Object OooO0OO;

    public /* synthetic */ oOO0Oo00(Object obj, Object obj2, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.OooO00o;
        Object obj = this.OooO0OO;
        Object obj2 = this.OooO0O0;
        switch (i) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i2 = AppBarLayout.OooOooO;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((wq0) obj).OooOO0O(fFloatValue);
                Drawable drawable = appBarLayout.OooOoO;
                if (drawable instanceof wq0) {
                    ((wq0) drawable).OooOO0O(fFloatValue);
                }
                Iterator it = appBarLayout.OooOo00.iterator();
                if (it.hasNext()) {
                    throw px0.OooOO0o(it);
                }
                Iterator it2 = appBarLayout.OooOo0.iterator();
                if (it2.hasNext()) {
                    throw px0.OooOO0o(it2);
                }
                return;
            case 1:
                yp ypVar = (yp) obj2;
                ld ldVar = (ld) obj;
                if (ldVar.OooO00o(true) && ldVar.OooOOO0 != 0 && ypVar.isVisible()) {
                    ypVar.invalidateSelf();
                    return;
                }
                return;
            default:
                ((View) ((ry1) ((na1) obj2).OooO0o0).OooO0Oo.getParent()).invalidate();
                return;
        }
    }
}
