package com.cmaster.cloner;

import android.content.res.Resources;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class dp1 {
    public static final RectF OooO00o = new RectF();

    public static View OooO00o(View view, int i) throws Resources.NotFoundException {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    public static RectF OooO0O0(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    public static float OooO0OO(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float OooO0Oo(float f, float f2, float f3, float f4, float f5, boolean z) {
        return (!z || (f5 >= 0.0f && f5 <= 1.0f)) ? f5 < f3 ? f : f5 > f4 ? f2 : OooO0OO(f, f2, (f5 - f3) / (f4 - f3)) : OooO0OO(f, f2, f5);
    }

    public static int OooO0o0(float f, float f2, float f3, int i, int i2) {
        return f3 < f ? i : f3 > f2 ? i2 : (int) OooO0OO(i, i2, (f3 - f) / (f2 - f));
    }
}
