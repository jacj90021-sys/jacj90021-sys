package com.cmaster.cloner;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class fu1 extends lj {
    public ed OooO00o;
    public int OooO0O0 = 0;

    public fu1() {
    }

    @Override // com.cmaster.cloner.lj
    public boolean OooOO0o(CoordinatorLayout coordinatorLayout, View view, int i) {
        OooOo(coordinatorLayout, view, i);
        if (this.OooO00o == null) {
            ed edVar = new ed();
            edVar.OooO0Oo = view;
            this.OooO00o = edVar;
        }
        ed edVar2 = this.OooO00o;
        View view2 = (View) edVar2.OooO0Oo;
        edVar2.OooO00o = view2.getTop();
        edVar2.OooO0O0 = view2.getLeft();
        this.OooO00o.OooO0OO();
        int i2 = this.OooO0O0;
        if (i2 == 0) {
            return true;
        }
        ed edVar3 = this.OooO00o;
        if (edVar3.OooO0OO != i2) {
            edVar3.OooO0OO = i2;
            edVar3.OooO0OO();
        }
        this.OooO0O0 = 0;
        return true;
    }

    public void OooOo(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.OooOOo(view, i);
    }

    public final int OooOo0o() {
        ed edVar = this.OooO00o;
        if (edVar != null) {
            return edVar.OooO0OO;
        }
        return 0;
    }

    public fu1(int i) {
    }
}
