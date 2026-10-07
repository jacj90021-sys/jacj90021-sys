package com.cmaster.cloner;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class vt1 {
    public static final ThreadLocal OooO00o = new ThreadLocal();
    public static final ThreadLocal OooO0O0 = new ThreadLocal();

    public static void OooO00o(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            OooO00o(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
