package com.cmaster.cloner;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tu1 extends su1 {
    @Override // com.cmaster.cloner.s53
    public final float OooO00o(View view) {
        return view.getTransitionAlpha();
    }

    @Override // com.cmaster.cloner.s53
    public final void OooO0O0(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // com.cmaster.cloner.su1
    public final void OooO0OO(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // com.cmaster.cloner.su1
    public final void OooO0Oo(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // com.cmaster.cloner.su1
    public final void OooO0o(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    @Override // com.cmaster.cloner.su1
    public final void OooO0o0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
