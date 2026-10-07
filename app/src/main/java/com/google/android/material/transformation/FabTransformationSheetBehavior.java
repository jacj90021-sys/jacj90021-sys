package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.R;
import com.cmaster.cloner.o0O000O;
import com.cmaster.cloner.oj;
import com.cmaster.cloner.qc3;
import com.cmaster.cloner.ru0;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public HashMap OooO;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void OooOo0o(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.OooO = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof oj) && (((oj) childAt.getLayoutParams()).OooO00o instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    HashMap map = this.OooO;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.OooO.get(childAt)).intValue());
                    }
                }
            }
            if (!z) {
                this.OooO = null;
            }
        }
        super.OooOo0o(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final o0O000O OooOooO(Context context, boolean z) {
        int i = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        o0O000O o0o000o = new o0O000O(15, false);
        o0o000o.OooO0o0 = ru0.OooO00o(context, i);
        o0o000o.OooO0o = new qc3(10);
        return o0o000o;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
