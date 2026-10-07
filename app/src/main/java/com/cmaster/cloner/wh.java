package com.cmaster.cloner;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wh {
    public final ConstraintLayout OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public final /* synthetic */ ConstraintLayout OooO0oo;

    public wh(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.OooO0oo = constraintLayout;
        this.OooO00o = constraintLayout2;
    }

    public static boolean OooO00o(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void OooO0O0(hi hiVar, k7 k7Var) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iMax2;
        boolean z;
        int baseline;
        int i;
        qh qhVar = hiVar.Oooo0;
        qh qhVar2 = hiVar.Oooo00O;
        if (hiVar.OooooOO == 8) {
            k7Var.OooO0o0 = 0;
            k7Var.OooO0o = 0;
            k7Var.OooO0oO = 0;
            return;
        }
        if (hiVar.OoooO0 == null) {
            return;
        }
        int i2 = k7Var.OooO00o;
        int i3 = k7Var.OooO0O0;
        int i4 = k7Var.OooO0OO;
        int i5 = k7Var.OooO0Oo;
        int i6 = this.OooO0O0 + this.OooO0OO;
        int i7 = this.OooO0Oo;
        View view = hiVar.OooooO0;
        int iOooOOoo = rj.OooOOoo(i2);
        if (iOooOOoo == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (iOooOOoo == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.OooO0o, i7, -2);
        } else if (iOooOOoo == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.OooO0o, i7, -2);
            boolean z2 = hiVar.OooOOo0 == 1;
            int i8 = k7Var.OooOO0;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == hiVar.OooO();
                if (k7Var.OooOO0 == 2 || !z2 || ((z2 && z3) || hiVar.OooOo0O())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hiVar.OooOO0o(), 1073741824);
                }
            }
        } else if (iOooOOoo != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i9 = this.OooO0o;
            int i10 = qhVar2 != null ? qhVar2.OooO0oO : 0;
            if (qhVar != null) {
                i10 += qhVar.OooO0oO;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int iOooOOoo2 = rj.OooOOoo(i3);
        if (iOooOOoo2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iOooOOoo2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.OooO0oO, i6, -2);
        } else if (iOooOOoo2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.OooO0oO, i6, -2);
            boolean z4 = hiVar.OooOOo == 1;
            int i11 = k7Var.OooOO0;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == hiVar.OooOO0o();
                if (k7Var.OooOO0 == 2 || !z4 || ((z4 && z5) || hiVar.OooOo0o())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hiVar.OooO(), 1073741824);
                }
            }
        } else if (iOooOOoo2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i12 = this.OooO0oO;
            int i13 = qhVar2 != null ? hiVar.Oooo00o.OooO0oO : 0;
            if (qhVar != null) {
                i13 += hiVar.Oooo0O0.OooO0oO;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        ii iiVar = (ii) hiVar.OoooO0;
        ConstraintLayout constraintLayout = this.OooO0oo;
        if (iiVar != null && o72.OooO0O0(constraintLayout.OooOO0o, 256) && view.getMeasuredWidth() == hiVar.OooOO0o() && view.getMeasuredWidth() < iiVar.OooOO0o() && view.getMeasuredHeight() == hiVar.OooO() && view.getMeasuredHeight() < iiVar.OooO() && view.getBaseline() == hiVar.OoooOo0 && !hiVar.OooOo0() && OooO00o(hiVar.OooOooo, iMakeMeasureSpec, hiVar.OooOO0o()) && OooO00o(hiVar.Oooo000, iMakeMeasureSpec2, hiVar.OooO())) {
            k7Var.OooO0o0 = hiVar.OooOO0o();
            k7Var.OooO0o = hiVar.OooO();
            k7Var.OooO0oO = hiVar.OoooOo0;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && hiVar.OoooOO0 > 0.0f;
        boolean z11 = z7 && hiVar.OoooOO0 > 0.0f;
        if (view == null) {
            return;
        }
        vh vhVar = (vh) view.getLayoutParams();
        int i14 = k7Var.OooOO0;
        if (i14 != 1 && i14 != 2 && z6 && hiVar.OooOOo0 == 0 && z7 && hiVar.OooOOo == 0) {
            i = -1;
            z = false;
            baseline = 0;
            iMax2 = 0;
            iMax = 0;
        } else {
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            hiVar.OooOooo = iMakeMeasureSpec;
            hiVar.Oooo000 = iMakeMeasureSpec2;
            hiVar.OooO0oO = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = hiVar.OooOo00;
            iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = hiVar.OooOo0;
            if (i16 > 0) {
                iMax = Math.min(i16, iMax);
            }
            int i17 = hiVar.OooOo0o;
            iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = hiVar.OooOo;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            if (!o72.OooO0O0(constraintLayout.OooOO0o, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMax2 * hiVar.OoooOO0) + 0.5f);
                } else if (z11 && z9) {
                    iMax2 = (int) ((iMax / hiVar.OoooOO0) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                baseline = baseline2;
                i = -1;
                z = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                hiVar.OooOooo = iMakeMeasureSpec;
                hiVar.Oooo000 = iMakeMeasureSpec3;
                z = false;
                hiVar.OooO0oO = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMax2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        k7Var.OooO = (iMax == k7Var.OooO0OO && iMax2 == k7Var.OooO0Oo) ? z : true;
        boolean z13 = vhVar.Ooooo00 ? true : z12;
        if (z13 && baseline != -1 && hiVar.OoooOo0 != baseline) {
            k7Var.OooO = true;
        }
        k7Var.OooO0o0 = iMax;
        k7Var.OooO0o = iMax2;
        k7Var.OooO0oo = z13;
        k7Var.OooO0oO = baseline;
    }
}
