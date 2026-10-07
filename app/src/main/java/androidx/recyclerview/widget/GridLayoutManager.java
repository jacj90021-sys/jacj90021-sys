package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.cmaster.cloner.a71;
import com.cmaster.cloner.ed;
import com.cmaster.cloner.i71;
import com.cmaster.cloner.j71;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.o000;
import com.cmaster.cloner.o000O00O;
import com.cmaster.cloner.o0O000O;
import com.cmaster.cloner.p71;
import com.cmaster.cloner.px0;
import com.cmaster.cloner.qm0;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.rj;
import com.cmaster.cloner.rm0;
import com.cmaster.cloner.sa;
import com.cmaster.cloner.sm0;
import com.cmaster.cloner.u71;
import com.cmaster.cloner.y60;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set Oooo = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean OooOooo;
    public final SparseIntArray Oooo0;
    public int Oooo000;
    public int[] Oooo00O;
    public View[] Oooo00o;
    public final SparseIntArray Oooo0O0;
    public final o0O000O Oooo0OO;
    public int Oooo0o;
    public final Rect Oooo0o0;
    public int Oooo0oO;
    public int Oooo0oo;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.OooOooo = false;
        this.Oooo000 = -1;
        this.Oooo0 = new SparseIntArray();
        this.Oooo0O0 = new SparseIntArray();
        this.Oooo0OO = new o0O000O(19);
        this.Oooo0o0 = new Rect();
        this.Oooo0o = -1;
        this.Oooo0oO = -1;
        this.Oooo0oo = -1;
        o000O00(i71.Oooo0(context, attributeSet, i, i2).OooO0O0);
    }

    @Override // com.cmaster.cloner.i71
    public final boolean OooO0o(j71 j71Var) {
        return j71Var instanceof y60;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int OooOO0O(u71 u71Var) {
        return o00000(u71Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int OooOO0o(u71 u71Var) {
        return o00000O0(u71Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int OooOOO(u71 u71Var) {
        return o00000(u71Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int OooOOOO(u71 u71Var) {
        return o00000O0(u71Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final j71 OooOOo() {
        return this.OooOOOo == 0 ? new y60(-2, -1) : new y60(-1, -2);
    }

    @Override // com.cmaster.cloner.i71
    public final j71 OooOOoo(Context context, AttributeSet attributeSet) {
        y60 y60Var = new y60(context, attributeSet);
        y60Var.OooO0o0 = -1;
        y60Var.OooO0o = 0;
        return y60Var;
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOo(p71 p71Var, u71 u71Var) {
        if (this.OooOOOo == 1) {
            return Math.min(this.Oooo000, OooOoo());
        }
        if (u71Var.OooO0O0() < 1) {
            return 0;
        }
        return o000O0o(u71Var.OooO0O0() - 1, p71Var, u71Var) + 1;
    }

    @Override // com.cmaster.cloner.i71
    public final j71 OooOo00(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            y60 y60Var = new y60((ViewGroup.MarginLayoutParams) layoutParams);
            y60Var.OooO0o0 = -1;
            y60Var.OooO0o = 0;
            return y60Var;
        }
        y60 y60Var2 = new y60(layoutParams);
        y60Var2.OooO0o0 = -1;
        y60Var2.OooO0o = 0;
        return y60Var2;
    }

    @Override // com.cmaster.cloner.i71
    public final int Oooo0O0(p71 p71Var, u71 u71Var) {
        if (this.OooOOOo == 0) {
            return Math.min(this.Oooo000, OooOoo());
        }
        if (u71Var.OooO0O0() < 1) {
            return 0;
        }
        return o000O0o(u71Var.OooO0O0() - 1, p71Var, u71Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final void OoooOOo(p71 p71Var, u71 u71Var, o000O00O o000o00o) {
        super.OoooOOo(p71Var, u71Var, o000o00o);
        o000o00o.OooO00o.setClassName("android.widget.GridView");
        a71 a71Var = this.OooO0O0.OooOOOo;
        if (a71Var == null || a71Var.OooO00o() <= 1) {
            return;
        }
        o000o00o.OooO00o(o000.OooOOO0);
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooOoO(p71 p71Var, u71 u71Var, View view, o000O00O o000o00o) {
        AccessibilityNodeInfo accessibilityNodeInfo = o000o00o.OooO00o;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof y60)) {
            OoooOo0(view, o000o00o);
            return;
        }
        y60 y60Var = (y60) layoutParams;
        int iO000O0o = o000O0o(y60Var.OooO00o.OooO0Oo(), p71Var, u71Var);
        int i = this.OooOOOo;
        int i2 = y60Var.OooO0o0;
        int i3 = y60Var.OooO0o;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, iO000O0o, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iO000O0o, 1, i2, i3, false, false));
        }
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooOoo(int i, int i2) {
        o0O000O o0o000o = this.Oooo0OO;
        o0o000o.Oooo0o();
        ((SparseIntArray) o0o000o.OooO0o).clear();
    }

    @Override // com.cmaster.cloner.i71
    public final void Ooooo00() {
        o0O000O o0o000o = this.Oooo0OO;
        o0o000o.Oooo0o();
        ((SparseIntArray) o0o000o.OooO0o).clear();
    }

    @Override // com.cmaster.cloner.i71
    public final void Ooooo0o(int i, int i2) {
        o0O000O o0o000o = this.Oooo0OO;
        o0o000o.Oooo0o();
        ((SparseIntArray) o0o000o.OooO0o).clear();
    }

    @Override // com.cmaster.cloner.i71
    public final void OooooO0(int i, int i2) {
        o0O000O o0o000o = this.Oooo0OO;
        o0o000o.Oooo0o();
        ((SparseIntArray) o0o000o.OooO0o).clear();
    }

    @Override // com.cmaster.cloner.i71
    public final void OooooOO(int i, int i2) {
        o0O000O o0o000o = this.Oooo0OO;
        o0o000o.Oooo0o();
        ((SparseIntArray) o0o000o.OooO0o).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final void OooooOo(p71 p71Var, u71 u71Var) {
        boolean z = u71Var.OooO0oO;
        SparseIntArray sparseIntArray = this.Oooo0O0;
        SparseIntArray sparseIntArray2 = this.Oooo0;
        if (z) {
            int iOooOo0O = OooOo0O();
            for (int i = 0; i < iOooOo0O; i++) {
                y60 y60Var = (y60) OooOo0(i).getLayoutParams();
                int iOooO0Oo = y60Var.OooO00o.OooO0Oo();
                sparseIntArray2.put(iOooO0Oo, y60Var.OooO0o);
                sparseIntArray.put(iOooO0Oo, y60Var.OooO0o0);
            }
        }
        super.OooooOo(p71Var, u71Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final void Oooooo0(u71 u71Var) {
        View viewOooOOo0;
        super.Oooooo0(u71Var);
        this.OooOooo = false;
        int i = this.Oooo0o;
        if (i == -1 || (viewOooOOo0 = OooOOo0(i)) == null) {
            return;
        }
        viewOooOOo0.sendAccessibilityEvent(67108864);
        this.Oooo0o = -1;
    }

    public final HashSet o000(int i) {
        return o000O000(o0000ooO(i), i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final boolean o000000() {
        return this.OooOoO == null && !this.OooOooo;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o000000O(u71 u71Var, sm0 sm0Var, ed edVar) {
        int i;
        int i2 = this.Oooo000;
        for (int i3 = 0; i3 < this.Oooo000 && (i = sm0Var.OooO0Oo) >= 0 && i < u71Var.OooO0O0() && i2 > 0; i3++) {
            edVar.OooO0O0(sm0Var.OooO0Oo, Math.max(0, sm0Var.OooO0oO));
            this.Oooo0OO.getClass();
            i2--;
            sm0Var.OooO0Oo += sm0Var.OooO0o0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o0000OO(p71 p71Var, u71 u71Var, qm0 qm0Var, int i) {
        o000O00O();
        if (u71Var.OooO0O0() > 0 && !u71Var.OooO0oO) {
            boolean z = i == 1;
            int iO000Ooo = o000Ooo(qm0Var.OooO0O0, p71Var, u71Var);
            if (z) {
                while (iO000Ooo > 0) {
                    int i2 = qm0Var.OooO0O0;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    qm0Var.OooO0O0 = i3;
                    iO000Ooo = o000Ooo(i3, p71Var, u71Var);
                }
            } else {
                int iOooO0O0 = u71Var.OooO0O0() - 1;
                int i4 = qm0Var.OooO0O0;
                while (i4 < iOooO0O0) {
                    int i5 = i4 + 1;
                    int iO000Ooo2 = o000Ooo(i5, p71Var, u71Var);
                    if (iO000Ooo2 <= iO000Ooo) {
                        break;
                    }
                    i4 = i5;
                    iO000Ooo = iO000Ooo2;
                }
                qm0Var.OooO0O0 = i4;
            }
        }
        o0000oOo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o0000OO0(p71 p71Var, u71 u71Var, sm0 sm0Var, rm0 rm0Var) {
        int i;
        int i2;
        int i3;
        int iOooO0o;
        int iOooo00O;
        int iOooOooo;
        int iOooOo0o;
        int iOooOo0o2;
        int i4;
        View viewOooO0O0;
        int iOooOO0o = this.OooOOo.OooOO0o();
        boolean z = iOooOO0o != 1073741824;
        int i5 = OooOo0O() > 0 ? this.Oooo00O[this.Oooo000] : 0;
        if (z) {
            o000O00O();
        }
        boolean z2 = sm0Var.OooO0o0 == 1;
        int iO000Ooo = this.Oooo000;
        if (!z2) {
            iO000Ooo = o000Ooo(sm0Var.OooO0Oo, p71Var, u71Var) + o000O0O(sm0Var.OooO0Oo, p71Var, u71Var);
        }
        int i6 = 0;
        while (i6 < this.Oooo000 && (i4 = sm0Var.OooO0Oo) >= 0 && i4 < u71Var.OooO0O0() && iO000Ooo > 0) {
            int i7 = sm0Var.OooO0Oo;
            int iO000O0O = o000O0O(i7, p71Var, u71Var);
            if (iO000O0O > this.Oooo000) {
                ra.OooOOO(rj.OooO0o(rj.OooO(i7, iO000O0O, "Item at position ", " requires ", " spans but GridLayoutManager has only "), this.Oooo000, " spans."));
                return;
            }
            iO000Ooo -= iO000O0O;
            if (iO000Ooo < 0 || (viewOooO0O0 = sm0Var.OooO0O0(p71Var)) == null) {
                break;
            }
            this.Oooo00o[i6] = viewOooO0O0;
            i6++;
        }
        if (i6 == 0) {
            rm0Var.OooO0O0 = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.Oooo00o[i];
            y60 y60Var = (y60) view.getLayoutParams();
            int iO000O0O2 = o000O0O(i71.Oooo00o(view), p71Var, u71Var);
            y60Var.OooO0o = iO000O0O2;
            y60Var.OooO0o0 = i8;
            i8 += iO000O0O2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.Oooo00o[i10];
            if (sm0Var.OooOO0O != null) {
                if (z2) {
                    OooO0O0(view2, -1, true);
                } else {
                    OooO0O0(view2, 0, true);
                }
            } else if (z2) {
                OooO0O0(view2, -1, false);
            } else {
                OooO0O0(view2, 0, false);
            }
            RecyclerView recyclerView = this.OooO0O0;
            Rect rect = this.Oooo0o0;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.Oooo(view2));
            }
            o000Oo0(view2, iOooOO0o, false);
            int iOooO0o0 = this.OooOOo.OooO0o0(view2);
            if (iOooO0o0 > i9) {
                i9 = iOooO0o0;
            }
            float fOooO0o = (this.OooOOo.OooO0o(view2) * 1.0f) / ((y60) view2.getLayoutParams()).OooO0o;
            if (fOooO0o > f) {
                f = fOooO0o;
            }
        }
        if (z) {
            o0000oOO(Math.max(Math.round(f * this.Oooo000), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.Oooo00o[i11];
                o000Oo0(view3, 1073741824, true);
                int iOooO0o02 = this.OooOOo.OooO0o0(view3);
                if (iOooO0o02 > i9) {
                    i9 = iOooO0o02;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.Oooo00o[i12];
            if (this.OooOOo.OooO0o0(view4) != i9) {
                y60 y60Var2 = (y60) view4.getLayoutParams();
                Rect rect2 = y60Var2.OooO0O0;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) y60Var2).topMargin + ((ViewGroup.MarginLayoutParams) y60Var2).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) y60Var2).leftMargin + ((ViewGroup.MarginLayoutParams) y60Var2).rightMargin;
                int iO000OoO = o000OoO(y60Var2.OooO0o0, y60Var2.OooO0o);
                if (this.OooOOOo == 1) {
                    iOooOo0o2 = i71.OooOo0o(false, iO000OoO, 1073741824, i14, ((ViewGroup.MarginLayoutParams) y60Var2).width);
                    iOooOo0o = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iOooOo0o = i71.OooOo0o(false, iO000OoO, 1073741824, i13, ((ViewGroup.MarginLayoutParams) y60Var2).height);
                    iOooOo0o2 = iMakeMeasureSpec;
                }
                if (oo0o0Oo(view4, iOooOo0o2, iOooOo0o, (j71) view4.getLayoutParams())) {
                    view4.measure(iOooOo0o2, iOooOo0o);
                }
            }
        }
        rm0Var.OooO00o = i9;
        int i15 = this.OooOOOo;
        int i16 = sm0Var.OooO0o;
        int iOooO0o2 = sm0Var.OooO0O0;
        if (i15 != 1) {
            if (i16 == -1) {
                iOooOooo = iOooO0o2 - i9;
                iOooo00O = 0;
                iOooO0o = iOooO0o2;
            } else {
                iOooO0o = iOooO0o2 + i9;
                iOooo00O = 0;
                iOooOooo = iOooO0o2;
            }
            iOooO0o2 = iOooo00O;
        } else if (i16 == -1) {
            iOooo00O = iOooO0o2 - i9;
            iOooOooo = 0;
            iOooO0o = 0;
        } else {
            iOooO0o = 0;
            iOooo00O = iOooO0o2;
            iOooO0o2 += i9;
            iOooOooo = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.Oooo00o;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            y60 y60Var3 = (y60) view5.getLayoutParams();
            if (this.OooOOOo != 1) {
                iOooo00O = Oooo00O() + this.Oooo00O[y60Var3.OooO0o0];
                iOooO0o2 = this.OooOOo.OooO0o(view5) + iOooo00O;
            } else if (o0000O()) {
                int iOooOooo2 = OooOooo() + this.Oooo00O[this.Oooo000 - y60Var3.OooO0o0];
                iOooO0o = iOooOooo2;
                iOooOooo = iOooOooo2 - this.OooOOo.OooO0o(view5);
            } else {
                iOooOooo = OooOooo() + this.Oooo00O[y60Var3.OooO0o0];
                iOooO0o = this.OooOOo.OooO0o(view5) + iOooOooo;
            }
            i71.Oooo0oo(view5, iOooOooo, iOooo00O, iOooO0o, iOooO0o2);
            if (y60Var3.OooO00o.OooOO0() || y60Var3.OooO00o.OooOOO0()) {
                rm0Var.OooO0OO = true;
            }
            rm0Var.OooO0Oo = view5.hasFocusable() | rm0Var.OooO0Oo;
            i17++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o0000o0O(boolean z) {
        if (z) {
            sa.OooO0oO("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.o0000o0O(false);
        }
    }

    public final void o0000oOO(int i) {
        int i2;
        int[] iArr = this.Oooo00O;
        int i3 = this.Oooo000;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.Oooo00O = iArr;
    }

    public final void o0000oOo() {
        View[] viewArr = this.Oooo00o;
        if (viewArr == null || viewArr.length != this.Oooo000) {
            this.Oooo00o = new View[this.Oooo000];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View o0000oo(p71 p71Var, u71 u71Var, boolean z, boolean z2) {
        int i;
        int iOooOo0O;
        int iOooOo0O2 = OooOo0O();
        int i2 = 1;
        if (z2) {
            iOooOo0O = OooOo0O() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iOooOo0O2;
            iOooOo0O = 0;
        }
        int iOooO0O0 = u71Var.OooO0O0();
        o00000OO();
        int iOooOOO0 = this.OooOOo.OooOOO0();
        int iOooO = this.OooOOo.OooO();
        View view = null;
        View view2 = null;
        while (iOooOo0O != i) {
            View viewOooOo0 = OooOo0(iOooOo0O);
            int iOooo00o = i71.Oooo00o(viewOooOo0);
            if (iOooo00o >= 0 && iOooo00o < iOooO0O0 && o000Ooo(iOooo00o, p71Var, u71Var) == 0) {
                if (((j71) viewOooOo0.getLayoutParams()).OooO00o.OooOO0()) {
                    if (view2 == null) {
                        view2 = viewOooOo0;
                    }
                } else {
                    if (this.OooOOo.OooO0oO(viewOooOo0) < iOooO && this.OooOOo.OooO0Oo(viewOooOo0) >= iOooOOO0) {
                        return viewOooOo0;
                    }
                    if (view == null) {
                        view = viewOooOo0;
                    }
                }
            }
            iOooOo0O += i2;
        }
        return view != null ? view : view2;
    }

    public final int o0000oo0(int i) {
        int i2 = this.OooOOOo;
        RecyclerView recyclerView = this.OooO0O0;
        return i2 == 0 ? o000O0o(i, recyclerView.OooO0o, recyclerView.Oooooo0) : o000Ooo(i, recyclerView.OooO0o, recyclerView.Oooooo0);
    }

    public final int o0000ooO(int i) {
        int i2 = this.OooOOOo;
        RecyclerView recyclerView = this.OooO0O0;
        return i2 == 1 ? o000O0o(i, recyclerView.OooO0o, recyclerView.Oooooo0) : o000Ooo(i, recyclerView.OooO0o, recyclerView.Oooooo0);
    }

    public final void o000O00(int i) {
        if (i == this.Oooo000) {
            return;
        }
        this.OooOooo = true;
        if (i < 1) {
            ra.OooOOO(px0.OooOOO(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.Oooo000 = i;
        this.Oooo0OO.Oooo0o();
        o00o0O();
    }

    public final HashSet o000O000(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.OooO0O0;
        int iO000O0O = o000O0O(i2, recyclerView.OooO0o, recyclerView.Oooooo0);
        for (int i3 = i; i3 < i + iO000O0O; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    public final void o000O00O() {
        int iOooOooO;
        int iOooo00O;
        if (this.OooOOOo == 1) {
            iOooOooO = this.OooOOO - Oooo000();
            iOooo00O = OooOooo();
        } else {
            iOooOooO = this.OooOOOO - OooOooO();
            iOooo00O = Oooo00O();
        }
        o0000oOO(iOooOooO - iOooo00O);
    }

    public final int o000O0O(int i, p71 p71Var, u71 u71Var) {
        boolean z = u71Var.OooO0oO;
        o0O000O o0o000o = this.Oooo0OO;
        if (!z) {
            o0o000o.getClass();
            return 1;
        }
        int i2 = this.Oooo0.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (p71Var.OooO0O0(i) != -1) {
            o0o000o.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final int o000O0o(int i, p71 p71Var, u71 u71Var) {
        boolean z = u71Var.OooO0oO;
        o0O000O o0o000o = this.Oooo0OO;
        if (!z) {
            int i2 = this.Oooo000;
            o0o000o.getClass();
            return o0O000O.Oooo00O(i, i2);
        }
        int iOooO0O0 = p71Var.OooO0O0(i);
        if (iOooO0O0 != -1) {
            int i3 = this.Oooo000;
            o0o000o.getClass();
            return o0O000O.Oooo00O(iOooO0O0, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final void o000Oo0(View view, int i, boolean z) {
        int iOooOo0o;
        int iOooOo0o2;
        y60 y60Var = (y60) view.getLayoutParams();
        Rect rect = y60Var.OooO0O0;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) y60Var).topMargin + ((ViewGroup.MarginLayoutParams) y60Var).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) y60Var).leftMargin + ((ViewGroup.MarginLayoutParams) y60Var).rightMargin;
        int iO000OoO = o000OoO(y60Var.OooO0o0, y60Var.OooO0o);
        if (this.OooOOOo == 1) {
            iOooOo0o2 = i71.OooOo0o(false, iO000OoO, i, i3, ((ViewGroup.MarginLayoutParams) y60Var).width);
            iOooOo0o = i71.OooOo0o(true, this.OooOOo.OooOOO(), this.OooOOO0, i2, ((ViewGroup.MarginLayoutParams) y60Var).height);
        } else {
            int iOooOo0o3 = i71.OooOo0o(false, iO000OoO, i, i2, ((ViewGroup.MarginLayoutParams) y60Var).height);
            int iOooOo0o4 = i71.OooOo0o(true, this.OooOOo.OooOOO(), this.OooOO0o, i3, ((ViewGroup.MarginLayoutParams) y60Var).width);
            iOooOo0o = iOooOo0o3;
            iOooOo0o2 = iOooOo0o4;
        }
        j71 j71Var = (j71) view.getLayoutParams();
        if (z ? oo0o0Oo(view, iOooOo0o2, iOooOo0o, j71Var) : o0Oo0oo(view, iOooOo0o2, iOooOo0o, j71Var)) {
            view.measure(iOooOo0o2, iOooOo0o);
        }
    }

    public final int o000OoO(int i, int i2) {
        if (this.OooOOOo != 1 || !o0000O()) {
            int[] iArr = this.Oooo00O;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.Oooo00O;
        int i3 = this.Oooo000;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int o000Ooo(int i, p71 p71Var, u71 u71Var) {
        boolean z = u71Var.OooO0oO;
        o0O000O o0o000o = this.Oooo0OO;
        if (!z) {
            int i2 = this.Oooo000;
            o0o000o.getClass();
            return i % i2;
        }
        int i3 = this.Oooo0O0.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iOooO0O0 = p71Var.OooO0O0(i);
        if (iOooO0O0 != -1) {
            int i4 = this.Oooo000;
            o0o000o.getClass();
            return iOooO0O0 % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013f, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0141, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0142, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View o000oOoO(android.view.View r23, int r24, com.cmaster.cloner.p71 r25, com.cmaster.cloner.u71 r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.o000oOoO(android.view.View, int, com.cmaster.cloner.p71, com.cmaster.cloner.u71):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int o00oO0o(int i, p71 p71Var, u71 u71Var) {
        o000O00O();
        o0000oOo();
        return super.o00oO0o(i, p71Var, u71Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int o00ooo(int i, p71 p71Var, u71 u71Var) {
        o000O00O();
        o0000oOo();
        return super.o00ooo(i, p71Var, u71Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a9 A[EDGE_INSN: B:206:0x01a9->B:122:0x01a9 BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2], EDGE_INSN: B:213:0x01a9->B:122:0x01a9 BREAK  A[LOOP:5: B:148:0x0221->B:159:0x0251, LOOP_LABEL: LOOP:5: B:148:0x0221->B:159:0x0251]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027e  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o0OoOo0(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.o0OoOo0(int, android.os.Bundle):boolean");
    }

    @Override // com.cmaster.cloner.i71
    public final void o0ooOOo(Rect rect, int i, int i2) {
        int iOooO0oO;
        int iOooO0oO2;
        if (this.Oooo00O == null) {
            super.o0ooOOo(rect, i, i2);
        }
        int iOooo000 = Oooo000() + OooOooo();
        int iOooOooO = OooOooO() + Oooo00O();
        if (this.OooOOOo == 1) {
            int iHeight = rect.height() + iOooOooO;
            RecyclerView recyclerView = this.OooO0O0;
            WeakHashMap weakHashMap = nt1.OooO00o;
            iOooO0oO2 = i71.OooO0oO(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.Oooo00O;
            iOooO0oO = i71.OooO0oO(i, iArr[iArr.length - 1] + iOooo000, this.OooO0O0.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iOooo000;
            RecyclerView recyclerView2 = this.OooO0O0;
            WeakHashMap weakHashMap2 = nt1.OooO00o;
            iOooO0oO = i71.OooO0oO(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.Oooo00O;
            iOooO0oO2 = i71.OooO0oO(i2, iArr2[iArr2.length - 1] + iOooOooO, this.OooO0O0.getMinimumHeight());
        }
        this.OooO0O0.setMeasuredDimension(iOooO0oO, iOooO0oO2);
    }

    public GridLayoutManager() {
        super(0);
        this.OooOooo = false;
        this.Oooo000 = -1;
        this.Oooo0 = new SparseIntArray();
        this.Oooo0O0 = new SparseIntArray();
        this.Oooo0OO = new o0O000O(19);
        this.Oooo0o0 = new Rect();
        this.Oooo0o = -1;
        this.Oooo0oO = -1;
        this.Oooo0oo = -1;
        o000O00(4);
    }
}
