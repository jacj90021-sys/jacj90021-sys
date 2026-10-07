package com.cmaster.cloner;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h0 extends hn0 implements j0 {
    public int Oooo0;
    public CharSequence Oooo000;
    public e0 Oooo00O;
    public final Rect Oooo00o;
    public final /* synthetic */ k0 Oooo0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.Oooo0O0 = k0Var;
        this.Oooo00o = new Rect();
        this.OooOOo = k0Var;
        this.OooOoo0 = true;
        this.OooOoo.setFocusable(true);
        this.OooOOoo = new f0(this, 0);
    }

    @Override // com.cmaster.cloner.j0
    public final CharSequence OooO0Oo() {
        return this.Oooo000;
    }

    @Override // com.cmaster.cloner.j0
    public final void OooO0o(CharSequence charSequence) {
        this.Oooo000 = charSequence;
    }

    @Override // com.cmaster.cloner.j0
    public final void OooOO0(int i) {
        this.Oooo0 = i;
    }

    @Override // com.cmaster.cloner.j0
    public final void OooOOO0(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        u uVar = this.OooOoo;
        boolean zIsShowing = uVar.isShowing();
        OooOOo();
        uVar.setInputMethodMode(2);
        OooO();
        ot otVar = this.OooO0o;
        otVar.setChoiceMode(1);
        otVar.setTextDirection(i);
        otVar.setTextAlignment(i2);
        k0 k0Var = this.Oooo0O0;
        int selectedItemPosition = k0Var.getSelectedItemPosition();
        ot otVar2 = this.OooO0o;
        if (uVar.isShowing() && otVar2 != null) {
            otVar2.setListSelectionHidden(false);
            otVar2.setSelection(selectedItemPosition);
            if (otVar2.getChoiceMode() != 0) {
                otVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = k0Var.getViewTreeObserver()) == null) {
            return;
        }
        b0 b0Var = new b0(this, 1);
        viewTreeObserver.addOnGlobalLayoutListener(b0Var);
        uVar.setOnDismissListener(new g0(this, b0Var));
    }

    @Override // com.cmaster.cloner.hn0, com.cmaster.cloner.j0
    public final void OooOOOO(ListAdapter listAdapter) {
        super.OooOOOO(listAdapter);
        this.Oooo00O = (e0) listAdapter;
    }

    public final void OooOOo() {
        int i;
        u uVar = this.OooOoo;
        Drawable background = uVar.getBackground();
        k0 k0Var = this.Oooo0O0;
        Rect rect = k0Var.OooOO0O;
        if (background != null) {
            background.getPadding(rect);
            boolean z = nu1.OooO00o;
            i = k0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = k0Var.getPaddingLeft();
        int paddingRight = k0Var.getPaddingRight();
        int width = k0Var.getWidth();
        int i2 = k0Var.OooOO0;
        if (i2 == -2) {
            int iOooO00o = k0Var.OooO00o(this.Oooo00O, uVar.getBackground());
            int i3 = (k0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iOooO00o > i3) {
                iOooO00o = i3;
            }
            OooOOo0(Math.max(iOooO00o, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            OooOOo0((width - paddingLeft) - paddingRight);
        } else {
            OooOOo0(i2);
        }
        boolean z2 = nu1.OooO00o;
        this.OooO = k0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.OooO0oo) - this.Oooo0) + i : paddingLeft + this.Oooo0 + i;
    }
}
