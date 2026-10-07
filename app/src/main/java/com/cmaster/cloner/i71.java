package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class i71 {
    public final boolean OooO;
    public xb OooO00o;
    public RecyclerView OooO0O0;
    public final er1 OooO0OO;
    public final er1 OooO0Oo;
    public boolean OooO0o;
    public um0 OooO0o0;
    public boolean OooO0oO;
    public final boolean OooO0oo;
    public int OooOO0;
    public boolean OooOO0O;
    public int OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public int OooOOOO;

    public i71() {
        xb1 xb1Var = new xb1(this, 28);
        o00OO000 o00oo000 = new o00OO000(this, 24);
        this.OooO0OO = new er1(xb1Var);
        this.OooO0Oo = new er1(o00oo000);
        this.OooO0o = false;
        this.OooO0oO = false;
        this.OooO0oo = true;
        this.OooO = true;
    }

    public static int OooO0oO(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int OooOo0o(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.i71.OooOo0o(boolean, int, int, int, int):int");
    }

    public static int OooOoO(View view) {
        Rect rect = ((j71) view.getLayoutParams()).OooO0O0;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int OooOoOO(View view) {
        Rect rect = ((j71) view.getLayoutParams()).OooO0O0;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int OooOoo0(View view) {
        return view.getTop() - ((j71) view.getLayoutParams()).OooO0O0.top;
    }

    public static h71 Oooo0(Context context, AttributeSet attributeSet, int i, int i2) {
        h71 h71Var = new h71();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j61.OooO00o, i, i2);
        h71Var.OooO00o = typedArrayObtainStyledAttributes.getInt(0, 1);
        h71Var.OooO0O0 = typedArrayObtainStyledAttributes.getInt(10, 1);
        h71Var.OooO0OO = typedArrayObtainStyledAttributes.getBoolean(9, false);
        h71Var.OooO0Oo = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return h71Var;
    }

    public static int Oooo00o(View view) {
        return ((j71) view.getLayoutParams()).OooO00o.OooO0Oo();
    }

    public static boolean Oooo0oO(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void Oooo0oo(View view, int i, int i2, int i3, int i4) {
        j71 j71Var = (j71) view.getLayoutParams();
        Rect rect = j71Var.OooO0O0;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) j71Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) j71Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) j71Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) j71Var).bottomMargin);
    }

    public void OooO(int i, ed edVar) {
    }

    public final void OooO0O0(View view, int i, boolean z) {
        y71 y71VarOooo0oo = RecyclerView.Oooo0oo(view);
        if (z || y71VarOooo0oo.OooOO0()) {
            gh1 gh1Var = (gh1) this.OooO0O0.OooOO0.OooO0o0;
            wt1 wt1VarOooO00o = (wt1) gh1Var.get(y71VarOooo0oo);
            if (wt1VarOooO00o == null) {
                wt1VarOooO00o = wt1.OooO00o();
                gh1Var.put(y71VarOooo0oo, wt1VarOooO00o);
            }
            wt1VarOooO00o.OooO00o |= 1;
        } else {
            this.OooO0O0.OooOO0.OooO0o(y71VarOooo0oo);
        }
        j71 j71Var = (j71) view.getLayoutParams();
        if (y71VarOooo0oo.OooOOo() || y71VarOooo0oo.OooOO0O()) {
            if (y71VarOooo0oo.OooOO0O()) {
                y71VarOooo0oo.OooOOO.OooOOO0(y71VarOooo0oo);
            } else {
                y71VarOooo0oo.OooOO0 &= -33;
            }
            this.OooO00o.OooO0Oo(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.OooO0O0;
            xb xbVar = this.OooO00o;
            if (parent == recyclerView) {
                int iOooOOOo = xbVar.OooOOOo(view);
                if (i == -1) {
                    i = this.OooO00o.OooOO0();
                }
                if (iOooOOOo == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.OooO0O0.indexOfChild(view) + this.OooO0O0.OooOooO());
                }
                if (iOooOOOo != i) {
                    i71 i71Var = this.OooO0O0.OooOOo0;
                    View viewOooOo0 = i71Var.OooOo0(iOooOOOo);
                    if (viewOooOo0 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iOooOOOo + i71Var.OooO0O0.toString());
                    }
                    i71Var.OooOo0(iOooOOOo);
                    i71Var.OooO00o.OooO0oO(iOooOOOo);
                    j71 j71Var2 = (j71) viewOooOo0.getLayoutParams();
                    y71 y71VarOooo0oo2 = RecyclerView.Oooo0oo(viewOooOo0);
                    boolean zOooOO0 = y71VarOooo0oo2.OooOO0();
                    RecyclerView recyclerView2 = i71Var.OooO0O0;
                    if (zOooOO0) {
                        gh1 gh1Var2 = (gh1) recyclerView2.OooOO0.OooO0o0;
                        wt1 wt1VarOooO00o2 = (wt1) gh1Var2.get(y71VarOooo0oo2);
                        if (wt1VarOooO00o2 == null) {
                            wt1VarOooO00o2 = wt1.OooO00o();
                            gh1Var2.put(y71VarOooo0oo2, wt1VarOooO00o2);
                        }
                        wt1VarOooO00o2.OooO00o = 1 | wt1VarOooO00o2.OooO00o;
                    } else {
                        recyclerView2.OooOO0.OooO0o(y71VarOooo0oo2);
                    }
                    i71Var.OooO00o.OooO0Oo(viewOooOo0, i, j71Var2, y71VarOooo0oo2.OooOO0());
                }
            } else {
                xbVar.OooO0O0(view, i, false);
                j71Var.OooO0OO = true;
                um0 um0Var = this.OooO0o0;
                if (um0Var != null && um0Var.OooO0o0) {
                    um0Var.OooO0O0.getClass();
                    y71 y71VarOooo0oo3 = RecyclerView.Oooo0oo(view);
                    if ((y71VarOooo0oo3 != null ? y71VarOooo0oo3.OooO0Oo() : -1) == um0Var.OooO00o) {
                        um0Var.OooO0o = view;
                        if (RecyclerView.o000OOo) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (j71Var.OooO0Oo) {
            if (RecyclerView.o000OOo) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + j71Var.OooO00o);
            }
            y71VarOooo0oo.OooO00o.invalidate();
            j71Var.OooO0Oo = false;
        }
    }

    public void OooO0OO(String str) {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            recyclerView.OooOO0o(str);
        }
    }

    public abstract boolean OooO0Oo();

    public boolean OooO0o(j71 j71Var) {
        return j71Var != null;
    }

    public abstract boolean OooO0o0();

    public void OooO0oo(int i, int i2, u71 u71Var, ed edVar) {
    }

    public abstract int OooOO0(u71 u71Var);

    public abstract int OooOO0O(u71 u71Var);

    public abstract int OooOO0o(u71 u71Var);

    public abstract int OooOOO(u71 u71Var);

    public abstract int OooOOO0(u71 u71Var);

    public abstract int OooOOOO(u71 u71Var);

    public final void OooOOOo(p71 p71Var) {
        for (int iOooOo0O = OooOo0O() - 1; iOooOo0O >= 0; iOooOo0O--) {
            View viewOooOo0 = OooOo0(iOooOo0O);
            y71 y71VarOooo0oo = RecyclerView.Oooo0oo(viewOooOo0);
            if (y71VarOooo0oo.OooOOo0()) {
                if (RecyclerView.o000OOo) {
                    Log.d("RecyclerView", "ignoring view " + y71VarOooo0oo);
                }
            } else if (!y71VarOooo0oo.OooO0oo() || y71VarOooo0oo.OooOO0() || this.OooO0O0.OooOOOo.OooO0O0) {
                OooOo0(iOooOo0O);
                this.OooO00o.OooO0oO(iOooOo0O);
                p71Var.OooOO0O(viewOooOo0);
                this.OooO0O0.OooOO0.OooO0o(y71VarOooo0oo);
            } else {
                o00Oo0(iOooOo0O);
                p71Var.OooOO0(y71VarOooo0oo);
            }
        }
    }

    public abstract j71 OooOOo();

    public View OooOOo0(int i) {
        int iOooOo0O = OooOo0O();
        for (int i2 = 0; i2 < iOooOo0O; i2++) {
            View viewOooOo0 = OooOo0(i2);
            y71 y71VarOooo0oo = RecyclerView.Oooo0oo(viewOooOo0);
            if (y71VarOooo0oo != null && y71VarOooo0oo.OooO0Oo() == i && !y71VarOooo0oo.OooOOo0() && (this.OooO0O0.Oooooo0.OooO0oO || !y71VarOooo0oo.OooOO0())) {
                return viewOooOo0;
            }
        }
        return null;
    }

    public j71 OooOOoo(Context context, AttributeSet attributeSet) {
        return new j71(context, attributeSet);
    }

    public int OooOo(p71 p71Var, u71 u71Var) {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView == null || recyclerView.OooOOOo == null || !OooO0Oo()) {
            return 1;
        }
        return this.OooO0O0.OooOOOo.OooO00o();
    }

    public final View OooOo0(int i) {
        xb xbVar = this.OooO00o;
        if (xbVar != null) {
            return xbVar.OooO(i);
        }
        return null;
    }

    public j71 OooOo00(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof j71 ? new j71((j71) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new j71((ViewGroup.MarginLayoutParams) layoutParams) : new j71(layoutParams);
    }

    public final int OooOo0O() {
        xb xbVar = this.OooO00o;
        if (xbVar != null) {
            return xbVar.OooOO0();
        }
        return 0;
    }

    public void OooOoO0(View view, Rect rect) {
        boolean z = RecyclerView.o0O0O00;
        j71 j71Var = (j71) view.getLayoutParams();
        Rect rect2 = j71Var.OooO0O0;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) j71Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) j71Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) j71Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) j71Var).bottomMargin);
    }

    public final int OooOoo() {
        RecyclerView recyclerView = this.OooO0O0;
        a71 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.OooO00o();
        }
        return 0;
    }

    public final int OooOooO() {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int OooOooo() {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public void Oooo(View view) {
        j71 j71Var = (j71) view.getLayoutParams();
        Rect rectOooo = this.OooO0O0.Oooo(view);
        int i = rectOooo.left + rectOooo.right;
        int i2 = rectOooo.top + rectOooo.bottom;
        int iOooOo0o = OooOo0o(OooO0Oo(), this.OooOOO, this.OooOO0o, Oooo000() + OooOooo() + ((ViewGroup.MarginLayoutParams) j71Var).leftMargin + ((ViewGroup.MarginLayoutParams) j71Var).rightMargin + i, ((ViewGroup.MarginLayoutParams) j71Var).width);
        int iOooOo0o2 = OooOo0o(OooO0o0(), this.OooOOOO, this.OooOOO0, OooOooO() + Oooo00O() + ((ViewGroup.MarginLayoutParams) j71Var).topMargin + ((ViewGroup.MarginLayoutParams) j71Var).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) j71Var).height);
        if (o0Oo0oo(view, iOooOo0o, iOooOo0o2, j71Var)) {
            view.measure(iOooOo0o, iOooOo0o2);
        }
    }

    public final int Oooo000() {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int Oooo00O() {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int Oooo0O0(p71 p71Var, u71 u71Var) {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView == null || recyclerView.OooOOOo == null || !OooO0o0()) {
            return 1;
        }
        return this.OooO0O0.OooOOOo.OooO00o();
    }

    public final void Oooo0OO(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((j71) view.getLayoutParams()).OooO0O0;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.OooO0O0 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.OooO0O0.OooOOOO;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean Oooo0o() {
        return false;
    }

    public abstract boolean Oooo0o0();

    public void OoooO(RecyclerView recyclerView) {
    }

    public void OoooO0(int i) {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            int iOooOO0 = recyclerView.OooO.OooOO0();
            for (int i2 = 0; i2 < iOooOO0; i2++) {
                recyclerView.OooO.OooO(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void OoooO00(int i) {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            int iOooOO0 = recyclerView.OooO.OooOO0();
            for (int i2 = 0; i2 < iOooOO0; i2++) {
                recyclerView.OooO.OooO(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void OoooO0O(a71 a71Var) {
    }

    public abstract void OoooOO0(RecyclerView recyclerView);

    public void OoooOOO(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.OooO0O0;
        p71 p71Var = recyclerView.OooO0o;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.OooO0O0.canScrollVertically(-1) && !this.OooO0O0.canScrollHorizontally(-1) && !this.OooO0O0.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        a71 a71Var = this.OooO0O0.OooOOOo;
        if (a71Var != null) {
            accessibilityEvent.setItemCount(a71Var.OooO00o());
        }
    }

    public void OoooOOo(p71 p71Var, u71 u71Var, o000O00O o000o00o) {
        AccessibilityNodeInfo accessibilityNodeInfo = o000o00o.OooO00o;
        if (this.OooO0O0.canScrollVertically(-1) || this.OooO0O0.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            o000o00o.OooO0o();
            o000o00o.OooO0o0(67108864, true);
        }
        if (this.OooO0O0.canScrollVertically(1) || this.OooO0O0.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            o000o00o.OooO0o();
            o000o00o.OooO0o0(67108864, true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(Oooo0O0(p71Var, u71Var), OooOo(p71Var, u71Var), false, 0));
    }

    public final void OoooOo0(View view, o000O00O o000o00o) {
        y71 y71VarOooo0oo = RecyclerView.Oooo0oo(view);
        if (y71VarOooo0oo == null || y71VarOooo0oo.OooOO0()) {
            return;
        }
        xb xbVar = this.OooO00o;
        if (((ArrayList) xbVar.OooO0oo).contains(y71VarOooo0oo.OooO00o)) {
            return;
        }
        RecyclerView recyclerView = this.OooO0O0;
        OoooOoO(recyclerView.OooO0o, recyclerView.Oooooo0, view, o000o00o);
    }

    public void OoooOoO(p71 p71Var, u71 u71Var, View view, o000O00O o000o00o) {
        o000o00o.OooO00o.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(OooO0o0() ? Oooo00o(view) : 0, 1, OooO0Oo() ? Oooo00o(view) : 0, 1, false, false));
    }

    public void OoooOoo(int i, int i2) {
    }

    public void Ooooo00() {
    }

    public void Ooooo0o(int i, int i2) {
    }

    public void OooooO0(int i, int i2) {
    }

    public void OooooOO(int i, int i2) {
    }

    public abstract void OooooOo(p71 p71Var, u71 u71Var);

    public void Oooooo(Parcelable parcelable) {
    }

    public abstract void Oooooo0(u71 u71Var);

    public Parcelable OoooooO() {
        return null;
    }

    public void Ooooooo(int i) {
    }

    public boolean o000000() {
        return false;
    }

    public final void o000OOo(um0 um0Var) {
        um0 um0Var2 = this.OooO0o0;
        if (um0Var2 != null && um0Var != um0Var2 && um0Var2.OooO0o0) {
            um0Var2.OooO0oo();
        }
        this.OooO0o0 = um0Var;
        RecyclerView recyclerView = this.OooO0O0;
        x71 x71Var = recyclerView.OooooO0;
        x71Var.OooOO0.removeCallbacks(x71Var);
        x71Var.OooO0o.abortAnimation();
        if (um0Var.OooO0oo) {
            Log.w("RecyclerView", "An instance of " + um0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + um0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        um0Var.OooO0O0 = recyclerView;
        um0Var.OooO0OO = this;
        int i = um0Var.OooO00o;
        if (i == -1) {
            ra.OooOOO("Invalid target position");
            return;
        }
        recyclerView.Oooooo0.OooO00o = i;
        um0Var.OooO0o0 = true;
        um0Var.OooO0Oo = true;
        um0Var.OooO0o = recyclerView.OooOOo0.OooOOo0(i);
        um0Var.OooO0O0.OooooO0.OooO0O0();
        um0Var.OooO0oo = true;
    }

    public abstract View o000oOoO(View view, int i, p71 p71Var, u71 u71Var);

    public final void o00O0O(p71 p71Var) {
        ArrayList arrayList;
        int size = p71Var.OooO00o.size();
        int i = size - 1;
        while (true) {
            arrayList = p71Var.OooO00o;
            if (i < 0) {
                break;
            }
            View view = ((y71) arrayList.get(i)).OooO00o;
            y71 y71VarOooo0oo = RecyclerView.Oooo0oo(view);
            if (!y71VarOooo0oo.OooOOo0()) {
                y71VarOooo0oo.OooOOOo(false);
                if (y71VarOooo0oo.OooOO0o()) {
                    this.OooO0O0.removeDetachedView(view, false);
                }
                f71 f71Var = this.OooO0O0.Oooo;
                if (f71Var != null) {
                    f71Var.OooO0Oo(y71VarOooo0oo);
                }
                y71VarOooo0oo.OooOOOo(true);
                y71 y71VarOooo0oo2 = RecyclerView.Oooo0oo(view);
                y71VarOooo0oo2.OooOOO = null;
                y71VarOooo0oo2.OooOOOO = false;
                y71VarOooo0oo2.OooOO0 &= -33;
                p71Var.OooOO0(y71VarOooo0oo2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = p71Var.OooO0O0;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.OooO0O0.invalidate();
        }
    }

    public final void o00Oo0(int i) {
        if (OooOo0(i) != null) {
            xb xbVar = this.OooO00o;
            xb1 xb1Var = (xb1) xbVar.OooO0o;
            int i2 = xbVar.OooO0o0;
            if (i2 == 1) {
                qa.OooO0o("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i2 == 2) {
                qa.OooO0o("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                int iOooOO0o = xbVar.OooOO0o(i);
                View childAt = ((RecyclerView) xb1Var.OooO0o0).getChildAt(iOooOO0o);
                if (childAt == null) {
                    xbVar.OooO0o0 = 0;
                    xbVar.OooO = null;
                    return;
                }
                xbVar.OooO0o0 = 1;
                xbVar.OooO = childAt;
                if (((sc) xbVar.OooO0oO).OooO0o(iOooOO0o)) {
                    xbVar.OooOOo0(childAt);
                }
                xb1Var.Oooo0O0(iOooOO0o);
                xbVar.OooO0o0 = 0;
                xbVar.OooO = null;
            } catch (Throwable th) {
                xbVar.OooO0o0 = 0;
                xbVar.OooO = null;
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o00Ooo(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.OooOooo()
            int r1 = r8.Oooo00O()
            int r2 = r8.OooOOO
            int r3 = r8.Oooo000()
            int r2 = r2 - r3
            int r3 = r8.OooOOOO
            int r4 = r8.OooOooO()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.OooO0O0
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L5e
            if (r2 == 0) goto L59
            goto L66
        L59:
            int r2 = java.lang.Math.max(r6, r10)
            goto L66
        L5e:
            if (r6 == 0) goto L61
            goto L65
        L61:
            int r6 = java.lang.Math.min(r4, r2)
        L65:
            r2 = r6
        L66:
            if (r1 == 0) goto L69
            goto L6d
        L69:
            int r1 = java.lang.Math.min(r5, r11)
        L6d:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb0
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7e
            goto Lb5
        L7e:
            int r1 = r8.OooOooo()
            int r2 = r8.Oooo00O()
            int r3 = r8.OooOOO
            int r4 = r8.Oooo000()
            int r3 = r3 - r4
            int r4 = r8.OooOOOO
            int r5 = r8.OooOooO()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.OooO0O0
            android.graphics.Rect r5 = r5.OooOOO0
            r8.OooOoO0(r13, r5)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb5
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb5
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb5
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lb0
            goto Lb5
        Lb0:
            if (r11 != 0) goto Lb6
            if (r10 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r0
        Lb6:
            if (r12 == 0) goto Lbc
            r9.scrollBy(r11, r10)
            return r7
        Lbc:
            r9.o0OoOo0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.i71.o00Ooo(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final void o00o0O() {
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void o00oO0O(RecyclerView recyclerView) {
        o0ooOO0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int o00oO0o(int i, p71 p71Var, u71 u71Var);

    public abstract int o00ooo(int i, p71 p71Var, u71 u71Var);

    public abstract void o0O0O00(RecyclerView recyclerView, int i);

    public boolean o0OO00O() {
        return false;
    }

    public final void o0OOO0o(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.OooO0O0 = null;
            this.OooO00o = null;
            this.OooOOO = 0;
            this.OooOOOO = 0;
        } else {
            this.OooO0O0 = recyclerView;
            this.OooO00o = recyclerView.OooO;
            this.OooOOO = recyclerView.getWidth();
            this.OooOOOO = recyclerView.getHeight();
        }
        this.OooOO0o = 1073741824;
        this.OooOOO0 = 1073741824;
    }

    public final boolean o0Oo0oo(View view, int i, int i2, j71 j71Var) {
        return (!view.isLayoutRequested() && this.OooO0oo && Oooo0oO(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) j71Var).width) && Oooo0oO(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) j71Var).height)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[PHI: r0
      0x0060: PHI (r0v8 int) = (r0v5 int), (r0v14 int) binds: [B:24:0x007c, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o0OoOo0(int r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.i71.o0OoOo0(int, android.os.Bundle):boolean");
    }

    public final void o0ooOO0(int i, int i2) {
        this.OooOOO = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.OooOO0o = mode;
        if (mode == 0 && !RecyclerView.o000000o) {
            this.OooOOO = 0;
        }
        this.OooOOOO = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.OooOOO0 = mode2;
        if (mode2 != 0 || RecyclerView.o000000o) {
            return;
        }
        this.OooOOOO = 0;
    }

    public void o0ooOOo(Rect rect, int i, int i2) {
        int iOooo000 = Oooo000() + OooOooo() + rect.width();
        int iOooOooO = OooOooO() + Oooo00O() + rect.height();
        RecyclerView recyclerView = this.OooO0O0;
        WeakHashMap weakHashMap = nt1.OooO00o;
        this.OooO0O0.setMeasuredDimension(OooO0oO(i, iOooo000, recyclerView.getMinimumWidth()), OooO0oO(i2, iOooOooO, this.OooO0O0.getMinimumHeight()));
    }

    public final void o0ooOoO(int i, int i2) {
        int iOooOo0O = OooOo0O();
        if (iOooOo0O == 0) {
            this.OooO0O0.OooOOo(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iOooOo0O; i7++) {
            View viewOooOo0 = OooOo0(i7);
            Rect rect = this.OooO0O0.OooOOO0;
            OooOoO0(viewOooOo0, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.OooO0O0.OooOOO0.set(i6, i4, i3, i5);
        o0ooOOo(this.OooO0O0.OooOOO0, i, i2);
    }

    public abstract void oo000o(int i);

    public final boolean oo0o0Oo(View view, int i, int i2, j71 j71Var) {
        return (this.OooO0oo && Oooo0oO(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) j71Var).width) && Oooo0oO(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) j71Var).height)) ? false : true;
    }

    public final void ooOO(p71 p71Var) {
        for (int iOooOo0O = OooOo0O() - 1; iOooOo0O >= 0; iOooOo0O--) {
            if (!RecyclerView.Oooo0oo(OooOo0(iOooOo0O)).OooOOo0()) {
                View viewOooOo0 = OooOo0(iOooOo0O);
                o00Oo0(iOooOo0O);
                p71Var.OooO(viewOooOo0);
            }
        }
    }
}
