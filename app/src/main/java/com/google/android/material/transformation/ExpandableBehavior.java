package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.cy;
import com.cmaster.cloner.dy;
import com.cmaster.cloner.lj;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends lj {
    public int OooO00o = 0;

    public ExpandableBehavior() {
    }

    @Override // com.cmaster.cloner.lj
    public abstract boolean OooO0o(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.lj
    public final boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (dy) view2;
        boolean z = ((FloatingActionButton) obj).OooOOo.OooO00o;
        int i = this.OooO00o;
        if (z) {
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        boolean z2 = ((FloatingActionButton) obj).OooOOo.OooO00o;
        this.OooO00o = z2 ? 1 : 2;
        OooOo0o((View) obj, view, z2, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.lj
    public final boolean OooOO0o(CoordinatorLayout coordinatorLayout, View view, int i) {
        dy dyVar;
        if (!view.isLaidOut()) {
            ArrayList arrayListOooOO0O = coordinatorLayout.OooOO0O(view);
            int size = arrayListOooOO0O.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    dyVar = null;
                    break;
                }
                View view2 = (View) arrayListOooOO0O.get(i2);
                if (OooO0o(view, view2)) {
                    dyVar = (dy) view2;
                    break;
                }
                i2++;
            }
            if (dyVar != null) {
                boolean z = ((FloatingActionButton) dyVar).OooOOo.OooO00o;
                int i3 = this.OooO00o;
                if (!z ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                    int i4 = z ? 1 : 2;
                    this.OooO00o = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new cy(this, view, i4, dyVar));
                }
            }
        }
        return false;
    }

    public abstract void OooOo0o(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
