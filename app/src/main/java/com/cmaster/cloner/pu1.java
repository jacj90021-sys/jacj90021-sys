package com.cmaster.cloner;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class pu1 {
    public static void OooO00o(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static void OooO0O0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void OooO0OO(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
