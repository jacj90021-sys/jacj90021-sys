package com.cmaster.cloner;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sy1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ yy1 OooO00o;
    public final /* synthetic */ qz1 OooO0O0;
    public final /* synthetic */ qz1 OooO0OO;
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ View OooO0o0;

    public sy1(yy1 yy1Var, qz1 qz1Var, qz1 qz1Var2, int i, View view) {
        this.OooO00o = yy1Var;
        this.OooO0O0 = qz1Var;
        this.OooO0OO = qz1Var2;
        this.OooO0Oo = i;
        this.OooO0o0 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        yy1 yy1Var = this.OooO00o;
        xy1 xy1Var = yy1Var.OooO00o;
        xy1Var.OooO0Oo(animatedFraction);
        float fOooO0O0 = xy1Var.OooO0O0();
        PathInterpolator pathInterpolator = uy1.OooO0o0;
        int i = Build.VERSION.SDK_INT;
        qz1 qz1Var = this.OooO0O0;
        ez1 dz1Var = i >= 34 ? new dz1(qz1Var) : i >= 31 ? new cz1(qz1Var) : i >= 30 ? new bz1(qz1Var) : i >= 29 ? new az1(qz1Var) : new zy1(qz1Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.OooO0Oo & i2;
            mz1 mz1Var = qz1Var.OooO00o;
            if (i3 == 0) {
                dz1Var.OooO0OO(i2, mz1Var.OooO0o(i2));
            } else {
                zg0 zg0VarOooO0o = mz1Var.OooO0o(i2);
                zg0 zg0VarOooO0o2 = this.OooO0OO.OooO00o.OooO0o(i2);
                float f = 1.0f - fOooO0O0;
                dz1Var.OooO0OO(i2, qz1.OooO0o0(zg0VarOooO0o, (int) (((zg0VarOooO0o.OooO00o - zg0VarOooO0o2.OooO00o) * f) + 0.5d), (int) (((zg0VarOooO0o.OooO0O0 - zg0VarOooO0o2.OooO0O0) * f) + 0.5d), (int) (((zg0VarOooO0o.OooO0OO - zg0VarOooO0o2.OooO0OO) * f) + 0.5d), (int) (((zg0VarOooO0o.OooO0Oo - zg0VarOooO0o2.OooO0Oo) * f) + 0.5d)));
            }
        }
        uy1.OooO0oO(this.OooO0o0, dz1Var.OooO0O0(), Collections.singletonList(yy1Var));
    }
}
