package com.cmaster.cloner;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class um0 {
    public final LinearInterpolator OooO;
    public int OooO00o = -1;
    public RecyclerView OooO0O0;
    public i71 OooO0OO;
    public boolean OooO0Oo;
    public View OooO0o;
    public boolean OooO0o0;
    public final s71 OooO0oO;
    public boolean OooO0oo;
    public final DecelerateInterpolator OooOO0;
    public PointF OooOO0O;
    public final DisplayMetrics OooOO0o;
    public float OooOOO;
    public boolean OooOOO0;
    public int OooOOOO;
    public int OooOOOo;

    public um0(Context context) {
        s71 s71Var = new s71();
        s71Var.OooO0Oo = -1;
        s71Var.OooO0o = false;
        s71Var.OooO0oO = 0;
        s71Var.OooO00o = 0;
        s71Var.OooO0O0 = 0;
        s71Var.OooO0OO = Integer.MIN_VALUE;
        s71Var.OooO0o0 = null;
        this.OooO0oO = s71Var;
        this.OooO = new LinearInterpolator();
        this.OooOO0 = new DecelerateInterpolator();
        this.OooOOO0 = false;
        this.OooOOOO = 0;
        this.OooOOOo = 0;
        this.OooOO0o = context.getResources().getDisplayMetrics();
    }

    public static int OooO00o(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            ra.OooOOO("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int OooO0O0(View view, int i) {
        i71 i71Var = this.OooO0OO;
        if (i71Var == null || !i71Var.OooO0Oo()) {
            return 0;
        }
        j71 j71Var = (j71) view.getLayoutParams();
        return OooO00o((view.getLeft() - ((j71) view.getLayoutParams()).OooO0O0.left) - ((ViewGroup.MarginLayoutParams) j71Var).leftMargin, view.getRight() + ((j71) view.getLayoutParams()).OooO0O0.right + ((ViewGroup.MarginLayoutParams) j71Var).rightMargin, i71Var.OooOooo(), i71Var.OooOOO - i71Var.Oooo000(), i);
    }

    public int OooO0OO(View view, int i) {
        i71 i71Var = this.OooO0OO;
        if (i71Var == null || !i71Var.OooO0o0()) {
            return 0;
        }
        j71 j71Var = (j71) view.getLayoutParams();
        return OooO00o(i71.OooOoo0(view) - ((ViewGroup.MarginLayoutParams) j71Var).topMargin, view.getBottom() + ((j71) view.getLayoutParams()).OooO0O0.bottom + ((ViewGroup.MarginLayoutParams) j71Var).bottomMargin, i71Var.Oooo00O(), i71Var.OooOOOO - i71Var.OooOooO(), i);
    }

    public final int OooO0Oo(int i) {
        float fAbs = Math.abs(i);
        if (!this.OooOOO0) {
            this.OooOOO = 25.0f / this.OooOO0o.densityDpi;
            this.OooOOO0 = true;
        }
        return (int) Math.ceil(fAbs * this.OooOOO);
    }

    public int OooO0o() {
        PointF pointF = this.OooOO0O;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public PointF OooO0o0(int i) {
        Object obj = this.OooO0OO;
        if (obj instanceof t71) {
            return ((t71) obj).OooO00o(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + t71.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0oO(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.um0.OooO0oO(int, int):void");
    }

    public final void OooO0oo() {
        if (this.OooO0o0) {
            this.OooO0o0 = false;
            this.OooOOOo = 0;
            this.OooOOOO = 0;
            this.OooOO0O = null;
            this.OooO0O0.Oooooo0.OooO00o = -1;
            this.OooO0o = null;
            this.OooO00o = -1;
            this.OooO0Oo = false;
            i71 i71Var = this.OooO0OO;
            if (i71Var.OooO0o0 == this) {
                i71Var.OooO0o0 = null;
            }
            this.OooO0OO = null;
            this.OooO0O0 = null;
        }
    }
}
