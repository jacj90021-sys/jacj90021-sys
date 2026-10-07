package com.cmaster.cloner;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class on1 implements it0 {
    public ss0 OooO0Oo;
    public final /* synthetic */ Toolbar OooO0o;
    public vs0 OooO0o0;

    public on1(Toolbar toolbar) {
        this.OooO0o = toolbar;
    }

    @Override // com.cmaster.cloner.it0
    public final void OooO0O0(Context context, ss0 ss0Var) {
        vs0 vs0Var;
        ss0 ss0Var2 = this.OooO0Oo;
        if (ss0Var2 != null && (vs0Var = this.OooO0o0) != null) {
            ss0Var2.OooO0Oo(vs0Var);
        }
        this.OooO0Oo = ss0Var;
    }

    @Override // com.cmaster.cloner.it0
    public final void OooO0OO(ss0 ss0Var, boolean z) {
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0o(vs0 vs0Var) {
        Toolbar toolbar = this.OooO0o;
        toolbar.OooO0OO();
        ViewParent parent = toolbar.OooOO0O.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.OooOO0O);
            }
            toolbar.addView(toolbar.OooOO0O);
        }
        View actionView = vs0Var.getActionView();
        toolbar.OooOO0o = actionView;
        this.OooO0o0 = vs0Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.OooOO0o);
            }
            pn1 pn1VarOooO0oo = Toolbar.OooO0oo();
            pn1VarOooO0oo.OooO00o = (toolbar.OooOOo0 & 112) | 8388611;
            pn1VarOooO0oo.OooO0O0 = 2;
            toolbar.OooOO0o.setLayoutParams(pn1VarOooO0oo);
            toolbar.addView(toolbar.OooOO0o);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((pn1) childAt.getLayoutParams()).OooO0O0 != 2 && childAt != toolbar.OooO0Oo) {
                toolbar.removeViewAt(childCount);
                toolbar.Oooo00o.add(childAt);
            }
        }
        toolbar.requestLayout();
        vs0Var.Oooo000 = true;
        vs0Var.OooOOo0.OooOOOo(false);
        KeyEvent.Callback callback = toolbar.OooOO0o;
        if (callback instanceof me) {
            ((me) callback).onActionViewExpanded();
        }
        toolbar.OooOo0O();
        return true;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0o0() {
        return false;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0oO(vs0 vs0Var) {
        Toolbar toolbar = this.OooO0o;
        KeyEvent.Callback callback = toolbar.OooOO0o;
        if (callback instanceof me) {
            ((me) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.OooOO0o);
        toolbar.removeView(toolbar.OooOO0O);
        toolbar.OooOO0o = null;
        ArrayList arrayList = toolbar.Oooo00o;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.OooO0o0 = null;
        toolbar.requestLayout();
        vs0Var.Oooo000 = false;
        vs0Var.OooOOo0.OooOOOo(false);
        toolbar.OooOo0O();
        return true;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0oo(vj1 vj1Var) {
        return false;
    }

    @Override // com.cmaster.cloner.it0
    public final void OooOO0() {
        if (this.OooO0o0 != null) {
            ss0 ss0Var = this.OooO0Oo;
            if (ss0Var != null) {
                int size = ss0Var.OooO.size();
                for (int i = 0; i < size; i++) {
                    if (this.OooO0Oo.getItem(i) == this.OooO0o0) {
                        return;
                    }
                }
            }
            OooO0oO(this.OooO0o0);
        }
    }
}
