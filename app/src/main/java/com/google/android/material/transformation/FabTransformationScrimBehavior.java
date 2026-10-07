package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.hy;
import com.cmaster.cloner.rm2;
import com.cmaster.cloner.su0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final su0 OooO0OO;
    public final su0 OooO0Oo;

    public FabTransformationScrimBehavior() {
        this.OooO0OO = new su0(75L);
        this.OooO0Oo = new su0(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, com.cmaster.cloner.lj
    public final boolean OooO0o(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet OooOo(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        su0 su0Var = z ? this.OooO0OO : this.OooO0Oo;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        su0Var.OooO00o(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        rm2.OooO00o(animatorSet, arrayList);
        animatorSet.addListener(new hy(view2, z));
        return animatorSet;
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOo0O(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO0OO = new su0(75L);
        this.OooO0Oo = new su0(0L);
    }
}
