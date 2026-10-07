package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ct0 {
    public at0 OooO;
    public final Context OooO00o;
    public final ss0 OooO0O0;
    public final boolean OooO0OO;
    public final int OooO0Oo;
    public View OooO0o0;
    public boolean OooO0oO;
    public ht0 OooO0oo;
    public PopupWindow.OnDismissListener OooOO0;
    public int OooO0o = 8388611;
    public final bt0 OooOO0O = new bt0(this);

    public ct0(Context context, ss0 ss0Var, View view, boolean z, int i, int i2) {
        this.OooO00o = context;
        this.OooO0O0 = ss0Var;
        this.OooO0o0 = view;
        this.OooO0OO = z;
        this.OooO0Oo = i;
    }

    public final at0 OooO00o() throws Resources.NotFoundException {
        at0 oi1Var;
        if (this.OooO == null) {
            Context context = this.OooO00o;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.OooO00o;
            if (iMin >= dimensionPixelSize) {
                oi1Var = new ub(context2, this.OooO0o0, this.OooO0Oo, this.OooO0OO);
            } else {
                oi1Var = new oi1(context2, this.OooO0O0, this.OooO0o0, this.OooO0Oo, this.OooO0OO);
            }
            oi1Var.OooOO0O(this.OooO0O0);
            oi1Var.OooOOo(this.OooOO0O);
            oi1Var.OooOOO(this.OooO0o0);
            oi1Var.OooO0Oo(this.OooO0oo);
            oi1Var.OooOOOO(this.OooO0oO);
            oi1Var.OooOOOo(this.OooO0o);
            this.OooO = oi1Var;
        }
        return this.OooO;
    }

    public final boolean OooO0O0() {
        at0 at0Var = this.OooO;
        return at0Var != null && at0Var.OooO00o();
    }

    public void OooO0OO() {
        this.OooO = null;
        PopupWindow.OnDismissListener onDismissListener = this.OooOO0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void OooO0Oo(int i, int i2, boolean z, boolean z2) {
        at0 at0VarOooO00o = OooO00o();
        at0VarOooO00o.OooOOoo(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.OooO0o, this.OooO0o0.getLayoutDirection()) & 7) == 5) {
                i -= this.OooO0o0.getWidth();
            }
            at0VarOooO00o.OooOOo0(i);
            at0VarOooO00o.OooOo00(i2);
            int i3 = (int) ((this.OooO00o.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            at0VarOooO00o.OooO0Oo = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        at0VarOooO00o.OooO();
    }
}
