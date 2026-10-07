package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.k61;
import com.cmaster.cloner.lj;
import com.cmaster.cloner.oj;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends lj {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k61.OooO0oO);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.cmaster.cloner.lj
    public final /* synthetic */ boolean OooO0o0(View view, Rect rect) {
        throw new ClassCastException();
    }

    @Override // com.cmaster.cloner.lj
    public final void OooO0oO(oj ojVar) {
        if (ojVar.OooO0oo == 0) {
            ojVar.OooO0oo = 80;
        }
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOO0o(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }
}
