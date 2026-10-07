package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t6 {
    public oOo0oooO OooO00o;
    public final /* synthetic */ int OooO0O0;
    public final /* synthetic */ View OooO0OO;

    public /* synthetic */ t6(View view, int i) {
        this.OooO0O0 = i;
        this.OooO0OO = view;
    }

    public final void OooO00o(Drawable drawable) {
        int i = this.OooO0O0;
        View view = this.OooO0OO;
        switch (i) {
            case 0:
                u6 u6Var = (u6) view;
                u6Var.setIndeterminate(false);
                u6Var.OooO00o(u6Var.OooO0o0);
                break;
            case 1:
                u6 u6Var2 = (u6) view;
                if (!u6Var2.OooO) {
                    u6Var2.setVisibility(u6Var2.OooOO0);
                    break;
                }
                break;
            default:
                ColorStateList colorStateList = ((nq0) view).OooOOo;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    break;
                }
                break;
        }
    }

    public void OooO0O0(Drawable drawable) {
        switch (this.OooO0O0) {
            case 2:
                nq0 nq0Var = (nq0) this.OooO0OO;
                ColorStateList colorStateList = nq0Var.OooOOo;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(nq0Var.OooOo0O, colorStateList.getDefaultColor()));
                    break;
                }
                break;
        }
    }

    public final void OooO0OO(Drawable drawable) {
    }
}
