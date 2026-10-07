package com.cmaster.cloner;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sm0 {
    public int OooO;
    public boolean OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public List OooOO0O;
    public boolean OooOO0o;

    public final void OooO00o(View view) {
        int iOooO0Oo;
        int size = this.OooOO0O.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((y71) this.OooOO0O.get(i2)).OooO00o;
            j71 j71Var = (j71) view3.getLayoutParams();
            if (view3 != view && !j71Var.OooO00o.OooOO0() && (iOooO0Oo = (j71Var.OooO00o.OooO0Oo() - this.OooO0Oo) * this.OooO0o0) >= 0 && iOooO0Oo < i) {
                view2 = view3;
                if (iOooO0Oo == 0) {
                    break;
                } else {
                    i = iOooO0Oo;
                }
            }
        }
        if (view2 == null) {
            this.OooO0Oo = -1;
        } else {
            this.OooO0Oo = ((j71) view2.getLayoutParams()).OooO00o.OooO0Oo();
        }
    }

    public final View OooO0O0(p71 p71Var) {
        List list = this.OooOO0O;
        if (list == null) {
            View viewOooO0Oo = p71Var.OooO0Oo(this.OooO0Oo);
            this.OooO0Oo += this.OooO0o0;
            return viewOooO0Oo;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((y71) this.OooOO0O.get(i)).OooO00o;
            j71 j71Var = (j71) view.getLayoutParams();
            if (!j71Var.OooO00o.OooOO0() && this.OooO0Oo == j71Var.OooO00o.OooO0Oo()) {
                OooO00o(view);
                return view;
            }
        }
        return null;
    }
}
