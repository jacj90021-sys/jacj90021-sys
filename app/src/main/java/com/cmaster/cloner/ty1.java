package com.cmaster.cloner;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ty1 implements View.OnApplyWindowInsetsListener {
    public final ah0 OooO00o;
    public qz1 OooO0O0;

    public ty1(View view, ah0 ah0Var) {
        qz1 qz1VarOooO0O0;
        this.OooO00o = ah0Var;
        WeakHashMap weakHashMap = nt1.OooO00o;
        qz1 qz1VarOooO00o = gt1.OooO00o(view);
        if (qz1VarOooO00o != null) {
            int i = Build.VERSION.SDK_INT;
            qz1VarOooO0O0 = (i >= 34 ? new dz1(qz1VarOooO00o) : i >= 31 ? new cz1(qz1VarOooO00o) : i >= 30 ? new bz1(qz1VarOooO00o) : i >= 29 ? new az1(qz1VarOooO00o) : new zy1(qz1VarOooO00o)).OooO0O0();
        } else {
            qz1VarOooO0O0 = null;
        }
        this.OooO0O0 = qz1VarOooO0O0;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.OooO0O0 = qz1.OooO0oO(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        qz1 qz1VarOooO0oO = qz1.OooO0oO(windowInsets, view);
        mz1 mz1Var = qz1VarOooO0oO.OooO00o;
        if (this.OooO0O0 == null) {
            WeakHashMap weakHashMap = nt1.OooO00o;
            this.OooO0O0 = gt1.OooO00o(view);
        }
        if (this.OooO0O0 == null) {
            this.OooO0O0 = qz1VarOooO0oO;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            ah0 ah0VarOooO = uy1.OooO(view);
            if (ah0VarOooO == null || !Objects.equals((qz1) ah0VarOooO.OooO0OO, qz1VarOooO0oO)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                qz1 qz1Var = this.OooO0O0;
                int i = 1;
                while (i <= 512) {
                    zg0 zg0VarOooO0o = mz1Var.OooO0o(i);
                    zg0 zg0VarOooO0o2 = qz1Var.OooO00o.OooO0o(i);
                    int i2 = zg0VarOooO0o.OooO00o;
                    int i3 = zg0VarOooO0o.OooO0Oo;
                    int i4 = zg0VarOooO0o.OooO0OO;
                    int i5 = zg0VarOooO0o.OooO0O0;
                    int i6 = zg0VarOooO0o2.OooO00o;
                    int i7 = zg0VarOooO0o2.OooO0Oo;
                    int[] iArr4 = iArr2;
                    int i8 = zg0VarOooO0o2.OooO0OO;
                    int i9 = zg0VarOooO0o2.OooO0O0;
                    if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i;
                        } else {
                            iArr[0] = iArr[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i10 = iArr2[0];
                int i11 = iArr3[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.OooO0O0 = qz1VarOooO0oO;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    qz1 qz1Var2 = this.OooO0O0;
                    yy1 yy1Var = new yy1(i12, (i10 & 8) != 0 ? uy1.OooO0o0 : (i11 & 8) != 0 ? uy1.OooO0o : (i10 & 519) != 0 ? uy1.OooO0oO : (i11 & 519) != 0 ? uy1.OooO0oo : null, (i12 & 8) != 0 ? 160L : 250L);
                    yy1Var.OooO00o.OooO0Oo(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(yy1Var.OooO00o.OooO00o());
                    zg0 zg0VarOooO0o3 = mz1Var.OooO0o(i12);
                    zg0 zg0VarOooO0o4 = qz1Var2.OooO00o.OooO0o(i12);
                    int iMin = Math.min(zg0VarOooO0o3.OooO00o, zg0VarOooO0o4.OooO00o);
                    int i13 = zg0VarOooO0o3.OooO0O0;
                    int i14 = zg0VarOooO0o4.OooO0O0;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = zg0VarOooO0o3.OooO0OO;
                    int i16 = zg0VarOooO0o4.OooO0OO;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = zg0VarOooO0o3.OooO0Oo;
                    int i18 = zg0VarOooO0o4.OooO0Oo;
                    vr1 vr1Var = new vr1(zg0.OooO0O0(iMin, iMin2, iMin3, Math.min(i17, i18)), zg0.OooO0O0(Math.max(zg0VarOooO0o3.OooO00o, zg0VarOooO0o4.OooO00o), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), 2);
                    uy1.OooO0o(view, qz1VarOooO0oO, false);
                    duration.addUpdateListener(new sy1(yy1Var, qz1VarOooO0oO, qz1Var2, i12, view));
                    duration.addListener(new ro1(yy1Var, view, 2));
                    lz0.OooO00o(view, new l1(view, yy1Var, vr1Var, duration));
                    this.OooO0O0 = qz1VarOooO0oO;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
