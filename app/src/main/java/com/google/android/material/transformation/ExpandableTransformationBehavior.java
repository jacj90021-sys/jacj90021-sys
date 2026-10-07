package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.cmaster.cloner.oOO00O;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet OooO0O0;

    public ExpandableTransformationBehavior() {
    }

    public abstract AnimatorSet OooOo(View view, View view2, boolean z, boolean z2);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void OooOo0o(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.OooO0O0;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetOooOo = OooOo(view, view2, z, z3);
        this.OooO0O0 = animatorSetOooOo;
        animatorSetOooOo.addListener(new oOO00O(this, 4));
        this.OooO0O0.start();
        if (z2) {
            return;
        }
        this.OooO0O0.end();
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
