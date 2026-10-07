package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oi1 extends at0 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final int OooO;
    public final ss0 OooO0o;
    public final Context OooO0o0;
    public final ps0 OooO0oO;
    public final boolean OooO0oo;
    public final int OooOO0;
    public final gt0 OooOO0O;
    public PopupWindow.OnDismissListener OooOOO;
    public View OooOOOO;
    public View OooOOOo;
    public ViewTreeObserver OooOOo;
    public ht0 OooOOo0;
    public boolean OooOOoo;
    public int OooOo0;
    public boolean OooOo00;
    public boolean OooOo0o;
    public final b0 OooOO0o = new b0(this, 3);
    public final rb OooOOO0 = new rb(this, 5);
    public int OooOo0O = 0;

    public oi1(Context context, ss0 ss0Var, View view, int i, boolean z) {
        this.OooO0o0 = context;
        this.OooO0o = ss0Var;
        this.OooO0oo = z;
        this.OooO0oO = new ps0(ss0Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.OooOO0 = i;
        Resources resources = context.getResources();
        this.OooO = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.OooOOOO = view;
        this.OooOO0O = new gt0(context, null, i, 0);
        ss0Var.OooO0O0(this, context);
    }

    @Override // com.cmaster.cloner.wg1
    public final void OooO() {
        View view;
        if (OooO00o()) {
            return;
        }
        if (this.OooOOoo || (view = this.OooOOOO) == null) {
            qa.OooO0o("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.OooOOOo = view;
        gt0 gt0Var = this.OooOO0O;
        u uVar = gt0Var.OooOoo;
        u uVar2 = gt0Var.OooOoo;
        uVar.setOnDismissListener(this);
        gt0Var.OooOOoo = this;
        gt0Var.OooOoo0 = true;
        uVar2.setFocusable(true);
        View view2 = this.OooOOOo;
        boolean z = this.OooOOo == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.OooOOo = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.OooOO0o);
        }
        view2.addOnAttachStateChangeListener(this.OooOOO0);
        gt0Var.OooOOo = view2;
        gt0Var.OooOOOO = this.OooOo0O;
        boolean z2 = this.OooOo00;
        Context context = this.OooO0o0;
        ps0 ps0Var = this.OooO0oO;
        if (!z2) {
            this.OooOo0 = at0.OooOOO0(ps0Var, context, this.OooO);
            this.OooOo00 = true;
        }
        gt0Var.OooOOo0(this.OooOo0);
        uVar2.setInputMethodMode(2);
        Rect rect = this.OooO0Oo;
        gt0Var.OooOoOO = rect != null ? new Rect(rect) : null;
        gt0Var.OooO();
        ot otVar = gt0Var.OooO0o;
        otVar.setOnKeyListener(this);
        if (this.OooOo0o) {
            ss0 ss0Var = this.OooO0o;
            if (ss0Var.OooOOOo != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) otVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(ss0Var.OooOOOo);
                }
                frameLayout.setEnabled(false);
                otVar.addHeaderView(frameLayout, null, false);
            }
        }
        gt0Var.OooOOOO(ps0Var);
        gt0Var.OooO();
    }

    @Override // com.cmaster.cloner.wg1
    public final boolean OooO00o() {
        return !this.OooOOoo && this.OooOO0O.OooOoo.isShowing();
    }

    @Override // com.cmaster.cloner.it0
    public final void OooO0OO(ss0 ss0Var, boolean z) {
        if (ss0Var != this.OooO0o) {
            return;
        }
        dismiss();
        ht0 ht0Var = this.OooOOo0;
        if (ht0Var != null) {
            ht0Var.OooO0OO(ss0Var, z);
        }
    }

    @Override // com.cmaster.cloner.it0
    public final void OooO0Oo(ht0 ht0Var) {
        this.OooOOo0 = ht0Var;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0o0() {
        return false;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0oo(vj1 vj1Var) {
        boolean z;
        if (vj1Var.hasVisibleItems()) {
            ct0 ct0Var = new ct0(this.OooO0o0, vj1Var, this.OooOOOo, this.OooO0oo, this.OooOO0, 0);
            ht0 ht0Var = this.OooOOo0;
            ct0Var.OooO0oo = ht0Var;
            at0 at0Var = ct0Var.OooO;
            if (at0Var != null) {
                at0Var.OooO0Oo(ht0Var);
            }
            int size = vj1Var.OooO.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = vj1Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            ct0Var.OooO0oO = z;
            at0 at0Var2 = ct0Var.OooO;
            if (at0Var2 != null) {
                at0Var2.OooOOOO(z);
            }
            ct0Var.OooOO0 = this.OooOOO;
            this.OooOOO = null;
            this.OooO0o.OooO0OO(false);
            gt0 gt0Var = this.OooOO0O;
            int width = gt0Var.OooO;
            int iOooOOO = gt0Var.OooOOO();
            if ((Gravity.getAbsoluteGravity(this.OooOo0O, this.OooOOOO.getLayoutDirection()) & 7) == 5) {
                width += this.OooOOOO.getWidth();
            }
            if (!ct0Var.OooO0O0()) {
                if (ct0Var.OooO0o0 != null) {
                    ct0Var.OooO0Oo(width, iOooOOO, true, true);
                }
            }
            ht0 ht0Var2 = this.OooOOo0;
            if (ht0Var2 != null) {
                ht0Var2.OooOOOO(vj1Var);
            }
            return true;
        }
        return false;
    }

    @Override // com.cmaster.cloner.it0
    public final void OooOO0() {
        this.OooOo00 = false;
        ps0 ps0Var = this.OooO0oO;
        if (ps0Var != null) {
            ps0Var.notifyDataSetChanged();
        }
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOO0O(ss0 ss0Var) {
    }

    @Override // com.cmaster.cloner.wg1
    public final ot OooOO0o() {
        return this.OooOO0O.OooO0o;
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOOO(View view) {
        this.OooOOOO = view;
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOOOO(boolean z) {
        this.OooO0oO.OooO0o = z;
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOOOo(int i) {
        this.OooOo0O = i;
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOOo(PopupWindow.OnDismissListener onDismissListener) {
        this.OooOOO = onDismissListener;
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOOo0(int i) {
        this.OooOO0O.OooO = i;
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOOoo(boolean z) {
        this.OooOo0o = z;
    }

    @Override // com.cmaster.cloner.at0
    public final void OooOo00(int i) {
        this.OooOO0O.OooO0oo(i);
    }

    @Override // com.cmaster.cloner.wg1
    public final void dismiss() {
        if (OooO00o()) {
            this.OooOO0O.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.OooOOoo = true;
        this.OooO0o.OooO0OO(true);
        ViewTreeObserver viewTreeObserver = this.OooOOo;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.OooOOo = this.OooOOOo.getViewTreeObserver();
            }
            this.OooOOo.removeGlobalOnLayoutListener(this.OooOO0o);
            this.OooOOo = null;
        }
        this.OooOOOo.removeOnAttachStateChangeListener(this.OooOOO0);
        PopupWindow.OnDismissListener onDismissListener = this.OooOOO;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
