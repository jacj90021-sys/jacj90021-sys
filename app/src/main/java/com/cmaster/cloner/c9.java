package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class c9 extends x8 {
    public final Boolean OooO00o;
    public final qz1 OooO0O0;
    public Window OooO0OO;
    public boolean OooO0Oo;

    public c9(View view, qz1 qz1Var) {
        this.OooO0O0 = qz1Var;
        wq0 wq0Var = BottomSheetBehavior.OooOoo0(view).OooO;
        ColorStateList backgroundTintList = wq0Var != null ? wq0Var.OooO0o0.OooO0Oo : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.OooO00o = Boolean.valueOf(uv2.OooO0Oo(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListOooO00o = mq2.OooO00o(view.getBackground());
        Integer numValueOf = colorStateListOooO00o != null ? Integer.valueOf(colorStateListOooO00o.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.OooO00o = Boolean.valueOf(uv2.OooO0Oo(numValueOf.intValue()));
        } else {
            this.OooO00o = null;
        }
    }

    @Override // com.cmaster.cloner.x8
    public final void OooO00o(View view) {
        OooO0Oo(view);
    }

    @Override // com.cmaster.cloner.x8
    public final void OooO0O0(View view) {
        OooO0Oo(view);
    }

    @Override // com.cmaster.cloner.x8
    public final void OooO0OO(View view, int i) {
        OooO0Oo(view);
    }

    public final void OooO0Oo(View view) {
        int top = view.getTop();
        qz1 qz1Var = this.OooO0O0;
        if (top < qz1Var.OooO0Oo()) {
            Window window = this.OooO0OO;
            if (window != null) {
                Boolean bool = this.OooO00o;
                boolean zBooleanValue = bool == null ? this.OooO0Oo : bool.booleanValue();
                window.getDecorView();
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new uz1(window) : i >= 30 ? new tz1(window) : i >= 26 ? new sz1(window) : new rz1(window)).OooO0O0(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), qz1Var.OooO0Oo() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.OooO0OO;
            if (window2 != null) {
                boolean z = this.OooO0Oo;
                window2.getDecorView();
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new uz1(window2) : i2 >= 30 ? new tz1(window2) : i2 >= 26 ? new sz1(window2) : new rz1(window2)).OooO0O0(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void OooO0o0(Window window) {
        if (this.OooO0OO == window) {
            return;
        }
        this.OooO0OO = window;
        if (window != null) {
            window.getDecorView();
            int i = Build.VERSION.SDK_INT;
            this.OooO0Oo = (i >= 35 ? new uz1(window) : i >= 30 ? new tz1(window) : i >= 26 ? new sz1(window) : new rz1(window)).OooO00o();
        }
    }
}
