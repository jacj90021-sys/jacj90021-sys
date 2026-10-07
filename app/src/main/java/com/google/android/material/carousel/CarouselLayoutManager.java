package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.cmaster.cloner.R;
import com.cmaster.cloner.i71;
import com.cmaster.cloner.j71;
import com.cmaster.cloner.k61;
import com.cmaster.cloner.mb;
import com.cmaster.cloner.nb;
import com.cmaster.cloner.ob;
import com.cmaster.cloner.p71;
import com.cmaster.cloner.pb;
import com.cmaster.cloner.px0;
import com.cmaster.cloner.qb;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.t71;
import com.cmaster.cloner.u71;
import com.cmaster.cloner.zt;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends i71 implements t71 {
    public final zt OooOOOo;
    public final View.OnLayoutChangeListener OooOOo;
    public qb OooOOo0;

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new ob();
        this.OooOOo = new mb(this, 0);
        this.OooOOOo = new zt();
        o00o0O();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k61.OooO0o0);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            o00o0O();
            o00000O0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // com.cmaster.cloner.t71
    public final PointF OooO00o(int i) {
        return null;
    }

    @Override // com.cmaster.cloner.i71
    public final boolean OooO0Oo() {
        return o000000o();
    }

    @Override // com.cmaster.cloner.i71
    public final boolean OooO0o0() {
        return !o000000o();
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOO0(u71 u71Var) {
        OooOo0O();
        return 0;
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOO0O(u71 u71Var) {
        return 0;
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOO0o(u71 u71Var) {
        return 0;
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOOO(u71 u71Var) {
        return 0;
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOOO0(u71 u71Var) {
        OooOo0O();
        return 0;
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOOOO(u71 u71Var) {
        return 0;
    }

    @Override // com.cmaster.cloner.i71
    public final j71 OooOOo() {
        return new j71(-2, -2);
    }

    @Override // com.cmaster.cloner.i71
    public final void OooOoO0(View view, Rect rect) {
        super.OooOoO0(view, rect);
        rect.centerY();
        if (o000000o()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // com.cmaster.cloner.i71
    public final void Oooo(View view) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // com.cmaster.cloner.i71
    public final boolean Oooo0o0() {
        return true;
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooO(RecyclerView recyclerView) throws Resources.NotFoundException {
        Context context = recyclerView.getContext();
        zt ztVar = this.OooOOOo;
        float dimension = ztVar.OooO00o;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        ztVar.OooO00o = dimension;
        float dimension2 = ztVar.OooO0O0;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        ztVar.OooO0O0 = dimension2;
        o00o0O();
        recyclerView.addOnLayoutChangeListener(this.OooOOo);
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooOO0(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.OooOOo);
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooOOO(AccessibilityEvent accessibilityEvent) {
        super.OoooOOO(accessibilityEvent);
        if (OooOo0O() > 0) {
            accessibilityEvent.setFromIndex(i71.Oooo00o(OooOo0(0)));
            accessibilityEvent.setToIndex(i71.Oooo00o(OooOo0(OooOo0O() - 1)));
        }
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooOoo(int i, int i2) {
        OooOoo();
    }

    @Override // com.cmaster.cloner.i71
    public final void Ooooo00() {
        OooOoo();
    }

    @Override // com.cmaster.cloner.i71
    public final void OooooO0(int i, int i2) {
        OooOoo();
    }

    @Override // com.cmaster.cloner.i71
    public final void OooooOo(p71 p71Var, u71 u71Var) {
        if (u71Var.OooO0O0() > 0) {
            if ((o000000o() ? this.OooOOO : this.OooOOOO) > 0.0f) {
                o00000();
                Oooo(p71Var.OooO0Oo(0));
                throw null;
            }
        }
        ooOO(p71Var);
    }

    @Override // com.cmaster.cloner.i71
    public final void Oooooo0(u71 u71Var) {
        if (OooOo0O() == 0) {
            return;
        }
        i71.Oooo00o(OooOo0(0));
    }

    public final boolean o00000() {
        return o000000o() && this.OooO0O0.getLayoutDirection() == 1;
    }

    public final float o000000O(float f, float f2) {
        return o00000() ? f - f2 : f + f2;
    }

    public final boolean o000000o() {
        return this.OooOOo0.OooO00o == 0;
    }

    public final void o00000O0(int i) {
        pb pbVar;
        if (i != 0 && i != 1) {
            ra.OooOOO(px0.OooOOO(i, "invalid orientation:"));
            return;
        }
        OooO0OO(null);
        qb qbVar = this.OooOOo0;
        if (qbVar == null || i != qbVar.OooO00o) {
            if (i == 0) {
                pbVar = new pb(this, 1);
            } else {
                if (i != 1) {
                    ra.OooOOO("invalid orientation");
                    return;
                }
                pbVar = new pb(this, 0);
            }
            this.OooOOo0 = pbVar;
            o00o0O();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    @Override // com.cmaster.cloner.i71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View o000oOoO(android.view.View r5, int r6, com.cmaster.cloner.p71 r7, com.cmaster.cloner.u71 r8) {
        /*
            r4 = this;
            int r7 = r4.OooOo0O()
            r8 = 0
            if (r7 != 0) goto L9
            goto L96
        L9:
            com.cmaster.cloner.qb r7 = r4.OooOOo0
            int r7 = r7.OooO00o
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L47
            r3 = 2
            if (r6 == r3) goto L3d
            r3 = 17
            if (r6 == r3) goto L4c
            r3 = 33
            if (r6 == r3) goto L49
            r3 = 66
            if (r6 == r3) goto L3f
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L3b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r7.<init>(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CarouselLayoutManager"
            android.util.Log.d(r7, r6)
        L39:
            r6 = r0
            goto L55
        L3b:
            if (r7 != r2) goto L39
        L3d:
            r6 = r2
            goto L55
        L3f:
            if (r7 != 0) goto L39
            boolean r6 = r4.o00000()
            if (r6 == 0) goto L3d
        L47:
            r6 = r1
            goto L55
        L49:
            if (r7 != r2) goto L39
            goto L47
        L4c:
            if (r7 != 0) goto L39
            boolean r6 = r4.o00000()
            if (r6 == 0) goto L47
            goto L3d
        L55:
            if (r6 != r0) goto L58
            goto L96
        L58:
            r7 = 0
            if (r6 != r1) goto L8b
            int r5 = com.cmaster.cloner.i71.Oooo00o(r5)
            if (r5 != 0) goto L62
            goto L96
        L62:
            android.view.View r5 = r4.OooOo0(r7)
            int r5 = com.cmaster.cloner.i71.Oooo00o(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L7a
            int r6 = r4.OooOoo()
            if (r5 < r6) goto L74
            goto L7a
        L74:
            com.cmaster.cloner.qb r4 = r4.OooOOo0
            r4.OooO0o0()
            throw r8
        L7a:
            boolean r5 = r4.o00000()
            if (r5 == 0) goto L86
            int r5 = r4.OooOo0O()
            int r7 = r5 + (-1)
        L86:
            android.view.View r4 = r4.OooOo0(r7)
            return r4
        L8b:
            int r5 = com.cmaster.cloner.i71.Oooo00o(r5)
            int r6 = r4.OooOoo()
            int r6 = r6 - r2
            if (r5 != r6) goto L97
        L96:
            return r8
        L97:
            int r5 = r4.OooOo0O()
            int r5 = r5 - r2
            android.view.View r5 = r4.OooOo0(r5)
            int r5 = com.cmaster.cloner.i71.Oooo00o(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto Lb4
            int r6 = r4.OooOoo()
            if (r5 < r6) goto Lae
            goto Lb4
        Lae:
            com.cmaster.cloner.qb r4 = r4.OooOOo0
            r4.OooO0o0()
            throw r8
        Lb4:
            boolean r5 = r4.o00000()
            if (r5 == 0) goto Lbb
            goto Lc1
        Lbb:
            int r5 = r4.OooOo0O()
            int r7 = r5 + (-1)
        Lc1:
            android.view.View r4 = r4.OooOo0(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.o000oOoO(android.view.View, int, com.cmaster.cloner.p71, com.cmaster.cloner.u71):android.view.View");
    }

    @Override // com.cmaster.cloner.i71
    public final boolean o00Ooo(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // com.cmaster.cloner.i71
    public final int o00oO0o(int i, p71 p71Var, u71 u71Var) {
        if (!OooO0o0() || OooOo0O() == 0 || i == 0) {
            return 0;
        }
        Oooo(p71Var.OooO0Oo(0));
        throw null;
    }

    @Override // com.cmaster.cloner.i71
    public final int o00ooo(int i, p71 p71Var, u71 u71Var) {
        if (!o000000o() || OooOo0O() == 0 || i == 0) {
            return 0;
        }
        Oooo(p71Var.OooO0Oo(0));
        throw null;
    }

    @Override // com.cmaster.cloner.i71
    public final void o0O0O00(RecyclerView recyclerView, int i) {
        nb nbVar = new nb(this, recyclerView.getContext());
        nbVar.OooO00o = i;
        o000OOo(nbVar);
    }

    @Override // com.cmaster.cloner.i71
    public final void oo000o(int i) {
    }

    public CarouselLayoutManager() {
        zt ztVar = new zt();
        new ob();
        this.OooOOo = new mb(this, 0);
        this.OooOOOo = ztVar;
        o00o0O();
        o00000O0(0);
    }
}
