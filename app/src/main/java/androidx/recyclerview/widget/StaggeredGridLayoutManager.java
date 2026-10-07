package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.cmaster.cloner.a71;
import com.cmaster.cloner.ed;
import com.cmaster.cloner.gl0;
import com.cmaster.cloner.h71;
import com.cmaster.cloner.hi1;
import com.cmaster.cloner.i71;
import com.cmaster.cloner.ii1;
import com.cmaster.cloner.j71;
import com.cmaster.cloner.ki1;
import com.cmaster.cloner.np0;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.o000O00O;
import com.cmaster.cloner.o0O000O;
import com.cmaster.cloner.p71;
import com.cmaster.cloner.pu;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.sc;
import com.cmaster.cloner.t71;
import com.cmaster.cloner.u71;
import com.cmaster.cloner.u91;
import com.cmaster.cloner.um0;
import com.cmaster.cloner.xb;
import com.cmaster.cloner.xb1;
import com.cmaster.cloner.z33;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends i71 implements t71 {
    public final int OooOOOo;
    public final pu OooOOo;
    public final np0[] OooOOo0;
    public final pu OooOOoo;
    public int OooOo0;
    public final int OooOo00;
    public final gl0 OooOo0O;
    public boolean OooOo0o;
    public final BitSet OooOoO0;
    public final int OooOoo;
    public final o0O000O OooOoo0;
    public boolean OooOooO;
    public boolean OooOooo;
    public final boolean Oooo0;
    public ki1 Oooo000;
    public final Rect Oooo00O;
    public final hi1 Oooo00o;
    public int[] Oooo0O0;
    public final u91 Oooo0OO;
    public boolean OooOo = false;
    public int OooOoO = -1;
    public int OooOoOO = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.OooOOOo = -1;
        this.OooOo0o = false;
        o0O000O o0o000o = new o0O000O(29, false);
        this.OooOoo0 = o0o000o;
        this.OooOoo = 2;
        this.Oooo00O = new Rect();
        this.Oooo00o = new hi1(this);
        this.Oooo0 = true;
        this.Oooo0OO = new u91(this, 2);
        h71 h71VarOooo0 = i71.Oooo0(context, attributeSet, i, i2);
        int i3 = h71VarOooo0.OooO00o;
        if (i3 != 0 && i3 != 1) {
            ra.OooOOO("invalid orientation.");
            throw null;
        }
        OooO0OO(null);
        if (i3 != this.OooOo00) {
            this.OooOo00 = i3;
            pu puVar = this.OooOOo;
            this.OooOOo = this.OooOOoo;
            this.OooOOoo = puVar;
            o00o0O();
        }
        int i4 = h71VarOooo0.OooO0O0;
        OooO0OO(null);
        if (i4 != this.OooOOOo) {
            o0o000o.OooO0o0();
            o00o0O();
            this.OooOOOo = i4;
            this.OooOoO0 = new BitSet(this.OooOOOo);
            this.OooOOo0 = new np0[this.OooOOOo];
            for (int i5 = 0; i5 < this.OooOOOo; i5++) {
                this.OooOOo0[i5] = new np0(this, i5);
            }
            o00o0O();
        }
        boolean z = h71VarOooo0.OooO0OO;
        OooO0OO(null);
        ki1 ki1Var = this.Oooo000;
        if (ki1Var != null && ki1Var.OooOO0O != z) {
            ki1Var.OooOO0O = z;
        }
        this.OooOo0o = z;
        o00o0O();
        gl0 gl0Var = new gl0();
        gl0Var.OooO00o = true;
        gl0Var.OooO0o = 0;
        gl0Var.OooO0oO = 0;
        this.OooOo0O = gl0Var;
        this.OooOOo = pu.OooO0O0(this, this.OooOo00);
        this.OooOOoo = pu.OooO0O0(this, 1 - this.OooOo00);
    }

    public static int o0000o0(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // com.cmaster.cloner.t71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF OooO00o(int r4) {
        /*
            r3 = this;
            int r0 = r3.OooOo0O()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.OooOo
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.o00000o0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.OooOo
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r3 = 0
            return r3
        L24:
            int r3 = r3.OooOo00
            r0 = 0
            if (r3 != 0) goto L2f
            float r3 = (float) r1
            r4.x = r3
            r4.y = r0
            return r4
        L2f:
            r4.x = r0
            float r3 = (float) r1
            r4.y = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.OooO00o(int):android.graphics.PointF");
    }

    @Override // com.cmaster.cloner.i71
    public final void OooO0OO(String str) {
        if (this.Oooo000 == null) {
            super.OooO0OO(str);
        }
    }

    @Override // com.cmaster.cloner.i71
    public final boolean OooO0Oo() {
        return this.OooOo00 == 0;
    }

    @Override // com.cmaster.cloner.i71
    public final boolean OooO0o(j71 j71Var) {
        return j71Var instanceof ii1;
    }

    @Override // com.cmaster.cloner.i71
    public final boolean OooO0o0() {
        return this.OooOo00 == 1;
    }

    @Override // com.cmaster.cloner.i71
    public final void OooO0oo(int i, int i2, u71 u71Var, ed edVar) {
        gl0 gl0Var;
        int iOooO0oO;
        if (this.OooOo00 != 0) {
            i = i2;
        }
        if (OooOo0O() == 0 || i == 0) {
            return;
        }
        o000OO(i, u71Var);
        int[] iArr = this.Oooo0O0;
        int i3 = this.OooOOOo;
        if (iArr == null || iArr.length < i3) {
            this.Oooo0O0 = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            gl0Var = this.OooOo0O;
            if (i4 >= i3) {
                break;
            }
            int i6 = gl0Var.OooO0Oo;
            np0[] np0VarArr = this.OooOOo0;
            if (i6 == -1) {
                int i7 = gl0Var.OooO0o;
                iOooO0oO = i7 - np0VarArr[i4].OooO(i7);
            } else {
                iOooO0oO = np0VarArr[i4].OooO0oO(gl0Var.OooO0oO) - gl0Var.OooO0oO;
            }
            if (iOooO0oO >= 0) {
                this.Oooo0O0[i5] = iOooO0oO;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.Oooo0O0, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = gl0Var.OooO0OO;
            if (i9 < 0 || i9 >= u71Var.OooO0O0()) {
                return;
            }
            edVar.OooO0O0(gl0Var.OooO0OO, this.Oooo0O0[i8]);
            gl0Var.OooO0OO += gl0Var.OooO0Oo;
        }
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOO0(u71 u71Var) {
        if (OooOo0O() == 0) {
            return 0;
        }
        boolean z = !this.Oooo0;
        return z33.OooO00o(u71Var, this.OooOOo, o00000O(z), o00000O0(z), this, this.Oooo0);
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOO0O(u71 u71Var) {
        return o000000o(u71Var);
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOO0o(u71 u71Var) {
        if (OooOo0O() == 0) {
            return 0;
        }
        boolean z = !this.Oooo0;
        return z33.OooO0OO(u71Var, this.OooOOo, o00000O(z), o00000O0(z), this, this.Oooo0);
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOOO(u71 u71Var) {
        return o000000o(u71Var);
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOOO0(u71 u71Var) {
        if (OooOo0O() == 0) {
            return 0;
        }
        boolean z = !this.Oooo0;
        return z33.OooO00o(u71Var, this.OooOOo, o00000O(z), o00000O0(z), this, this.Oooo0);
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOOOO(u71 u71Var) {
        if (OooOo0O() == 0) {
            return 0;
        }
        boolean z = !this.Oooo0;
        return z33.OooO0OO(u71Var, this.OooOOo, o00000O(z), o00000O0(z), this, this.Oooo0);
    }

    @Override // com.cmaster.cloner.i71
    public final j71 OooOOo() {
        return this.OooOo00 == 0 ? new ii1(-2, -1) : new ii1(-1, -2);
    }

    @Override // com.cmaster.cloner.i71
    public final j71 OooOOoo(Context context, AttributeSet attributeSet) {
        return new ii1(context, attributeSet);
    }

    @Override // com.cmaster.cloner.i71
    public final int OooOo(p71 p71Var, u71 u71Var) {
        if (this.OooOo00 == 1) {
            return Math.min(this.OooOOOo, u71Var.OooO0O0());
        }
        return -1;
    }

    @Override // com.cmaster.cloner.i71
    public final j71 OooOo00(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ii1((ViewGroup.MarginLayoutParams) layoutParams) : new ii1(layoutParams);
    }

    @Override // com.cmaster.cloner.i71
    public final int Oooo0O0(p71 p71Var, u71 u71Var) {
        if (this.OooOo00 == 0) {
            return Math.min(this.OooOOOo, u71Var.OooO0O0());
        }
        return -1;
    }

    @Override // com.cmaster.cloner.i71
    public final boolean Oooo0o() {
        return this.OooOo0o;
    }

    @Override // com.cmaster.cloner.i71
    public final boolean Oooo0o0() {
        return this.OooOoo != 0;
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooO0(int i) {
        super.OoooO0(i);
        for (int i2 = 0; i2 < this.OooOOOo; i2++) {
            np0 np0Var = this.OooOOo0[i2];
            int i3 = np0Var.OooO0O0;
            if (i3 != Integer.MIN_VALUE) {
                np0Var.OooO0O0 = i3 + i;
            }
            int i4 = np0Var.OooO0OO;
            if (i4 != Integer.MIN_VALUE) {
                np0Var.OooO0OO = i4 + i;
            }
        }
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooO00(int i) {
        super.OoooO00(i);
        for (int i2 = 0; i2 < this.OooOOOo; i2++) {
            np0 np0Var = this.OooOOo0[i2];
            int i3 = np0Var.OooO0O0;
            if (i3 != Integer.MIN_VALUE) {
                np0Var.OooO0O0 = i3 + i;
            }
            int i4 = np0Var.OooO0OO;
            if (i4 != Integer.MIN_VALUE) {
                np0Var.OooO0OO = i4 + i;
            }
        }
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooO0O(a71 a71Var) {
        this.OooOoo0.OooO0o0();
        for (int i = 0; i < this.OooOOOo; i++) {
            this.OooOOo0[i].OooO0O0();
        }
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooOO0(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.OooO0O0;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.Oooo0OO);
        }
        for (int i = 0; i < this.OooOOOo; i++) {
            this.OooOOo0[i].OooO0O0();
        }
        recyclerView.requestLayout();
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooOOO(AccessibilityEvent accessibilityEvent) {
        super.OoooOOO(accessibilityEvent);
        if (OooOo0O() > 0) {
            View viewO00000O = o00000O(false);
            View viewO00000O0 = o00000O0(false);
            if (viewO00000O == null || viewO00000O0 == null) {
                return;
            }
            int iOooo00o = i71.Oooo00o(viewO00000O);
            int iOooo00o2 = i71.Oooo00o(viewO00000O0);
            if (iOooo00o < iOooo00o2) {
                accessibilityEvent.setFromIndex(iOooo00o);
                accessibilityEvent.setToIndex(iOooo00o2);
            } else {
                accessibilityEvent.setFromIndex(iOooo00o2);
                accessibilityEvent.setToIndex(iOooo00o);
            }
        }
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooOOo(p71 p71Var, u71 u71Var, o000O00O o000o00o) {
        super.OoooOOo(p71Var, u71Var, o000o00o);
        o000o00o.OooO00o.setClassName("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooOoO(p71 p71Var, u71 u71Var, View view, o000O00O o000o00o) {
        AccessibilityNodeInfo accessibilityNodeInfo = o000o00o.OooO00o;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ii1)) {
            OoooOo0(view, o000o00o);
            return;
        }
        np0 np0Var = ((ii1) layoutParams).OooO0o0;
        if (this.OooOo00 == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(np0Var != null ? np0Var.OooO0o0 : -1, 1, -1, -1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(-1, -1, np0Var != null ? np0Var.OooO0o0 : -1, 1, false, false));
        }
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooOoo(int i, int i2) {
        o0000(i, i2, 1);
    }

    @Override // com.cmaster.cloner.i71
    public final void Ooooo00() {
        this.OooOoo0.OooO0o0();
        o00o0O();
    }

    @Override // com.cmaster.cloner.i71
    public final void Ooooo0o(int i, int i2) {
        o0000(i, i2, 8);
    }

    @Override // com.cmaster.cloner.i71
    public final void OooooO0(int i, int i2) {
        o0000(i, i2, 2);
    }

    @Override // com.cmaster.cloner.i71
    public final void OooooOO(int i, int i2) {
        o0000(i, i2, 4);
    }

    @Override // com.cmaster.cloner.i71
    public final void OooooOo(p71 p71Var, u71 u71Var) {
        o0000O0(p71Var, u71Var, true);
    }

    @Override // com.cmaster.cloner.i71
    public final void Oooooo(Parcelable parcelable) {
        if (parcelable instanceof ki1) {
            ki1 ki1Var = (ki1) parcelable;
            this.Oooo000 = ki1Var;
            if (this.OooOoO != -1) {
                ki1Var.OooO0Oo = -1;
                ki1Var.OooO0o0 = -1;
                ki1Var.OooO0oO = null;
                ki1Var.OooO0o = 0;
                ki1Var.OooO0oo = 0;
                ki1Var.OooO = null;
                ki1Var.OooOO0 = null;
            }
            o00o0O();
        }
    }

    @Override // com.cmaster.cloner.i71
    public final void Oooooo0(u71 u71Var) {
        this.OooOoO = -1;
        this.OooOoOO = Integer.MIN_VALUE;
        this.Oooo000 = null;
        this.Oooo00o.OooO00o();
    }

    @Override // com.cmaster.cloner.i71
    public final Parcelable OoooooO() {
        int iOooO;
        int iOooOOO0;
        int[] iArr;
        ki1 ki1Var = this.Oooo000;
        if (ki1Var != null) {
            ki1 ki1Var2 = new ki1();
            ki1Var2.OooO0o = ki1Var.OooO0o;
            ki1Var2.OooO0Oo = ki1Var.OooO0Oo;
            ki1Var2.OooO0o0 = ki1Var.OooO0o0;
            ki1Var2.OooO0oO = ki1Var.OooO0oO;
            ki1Var2.OooO0oo = ki1Var.OooO0oo;
            ki1Var2.OooO = ki1Var.OooO;
            ki1Var2.OooOO0O = ki1Var.OooOO0O;
            ki1Var2.OooOO0o = ki1Var.OooOO0o;
            ki1Var2.OooOOO0 = ki1Var.OooOOO0;
            ki1Var2.OooOO0 = ki1Var.OooOO0;
            return ki1Var2;
        }
        ki1 ki1Var3 = new ki1();
        ki1Var3.OooOO0O = this.OooOo0o;
        ki1Var3.OooOO0o = this.OooOooO;
        ki1Var3.OooOOO0 = this.OooOooo;
        o0O000O o0o000o = this.OooOoo0;
        if (o0o000o == null || (iArr = (int[]) o0o000o.OooO0o0) == null) {
            ki1Var3.OooO0oo = 0;
        } else {
            ki1Var3.OooO = iArr;
            ki1Var3.OooO0oo = iArr.length;
            ki1Var3.OooOO0 = (ArrayList) o0o000o.OooO0o;
        }
        if (OooOo0O() <= 0) {
            ki1Var3.OooO0Oo = -1;
            ki1Var3.OooO0o0 = -1;
            ki1Var3.OooO0o = 0;
            return ki1Var3;
        }
        ki1Var3.OooO0Oo = this.OooOooO ? o0000Ooo() : o00000o0();
        View viewO00000O0 = this.OooOo ? o00000O0(true) : o00000O(true);
        ki1Var3.OooO0o0 = viewO00000O0 != null ? i71.Oooo00o(viewO00000O0) : -1;
        int i = this.OooOOOo;
        ki1Var3.OooO0o = i;
        ki1Var3.OooO0oO = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.OooOooO;
            pu puVar = this.OooOOo;
            np0[] np0VarArr = this.OooOOo0;
            if (z) {
                iOooO = np0VarArr[i2].OooO0oO(Integer.MIN_VALUE);
                if (iOooO != Integer.MIN_VALUE) {
                    iOooOOO0 = puVar.OooO();
                    iOooO -= iOooOOO0;
                }
            } else {
                iOooO = np0VarArr[i2].OooO(Integer.MIN_VALUE);
                if (iOooO != Integer.MIN_VALUE) {
                    iOooOOO0 = puVar.OooOOO0();
                    iOooO -= iOooOOO0;
                }
            }
            ki1Var3.OooO0oO[i2] = iOooO;
        }
        return ki1Var3;
    }

    @Override // com.cmaster.cloner.i71
    public final void Ooooooo(int i) {
        if (i == 0) {
            o000000O();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0000(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o0000(int, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    public final int o00000(p71 p71Var, gl0 gl0Var, u71 u71Var) {
        np0[] np0VarArr;
        BitSet bitSet;
        int i;
        np0[] np0VarArr2;
        np0 np0Var;
        int iOooO;
        int iOooO0o0;
        int iOooO0o02;
        int iOooO2;
        BitSet bitSet2;
        int i2;
        int i3;
        p71 p71Var2 = p71Var;
        BitSet bitSet3 = this.OooOoO0;
        int i4 = this.OooOOOo;
        bitSet3.set(0, i4, true);
        gl0 gl0Var2 = this.OooOo0O;
        int i5 = gl0Var2.OooO ? gl0Var.OooO0o0 == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : gl0Var.OooO0o0 == 1 ? gl0Var.OooO0oO + gl0Var.OooO0O0 : gl0Var.OooO0o - gl0Var.OooO0O0;
        int i6 = gl0Var.OooO0o0;
        int i7 = 0;
        while (true) {
            np0VarArr = this.OooOOo0;
            if (i7 >= i4) {
                break;
            }
            if (!((ArrayList) np0VarArr[i7].OooO0o).isEmpty()) {
                o0000OoO(np0VarArr[i7], i6, i5);
            }
            i7++;
        }
        boolean z = this.OooOo;
        pu puVar = this.OooOOo;
        int iOooO3 = z ? puVar.OooO() : puVar.OooOOO0();
        boolean z2 = false;
        while (true) {
            int i8 = gl0Var.OooO0OO;
            if (i8 < 0 || i8 >= u71Var.OooO0O0() || (!gl0Var2.OooO && bitSet3.isEmpty())) {
                break;
            }
            View viewOooO0Oo = p71Var2.OooO0Oo(gl0Var.OooO0OO);
            gl0Var.OooO0OO += gl0Var.OooO0Oo;
            ii1 ii1Var = (ii1) viewOooO0Oo.getLayoutParams();
            int iOooO0Oo = ii1Var.OooO00o.OooO0Oo();
            o0O000O o0o000o = this.OooOoo0;
            int[] iArr = (int[]) o0o000o.OooO0o0;
            int i9 = (iArr == null || iOooO0Oo >= iArr.length) ? -1 : iArr[iOooO0Oo];
            if (i9 == -1) {
                if (o0000O0O(gl0Var.OooO0o0)) {
                    i = i4;
                    i3 = i4 - 1;
                    i4 = -1;
                    i2 = -1;
                } else {
                    i = i4;
                    i2 = 1;
                    i3 = 0;
                }
                np0 np0Var2 = null;
                int i10 = i2;
                if (gl0Var.OooO0o0 == 1) {
                    int iOooOOO0 = puVar.OooOOO0();
                    np0VarArr2 = np0VarArr;
                    int i11 = i3;
                    int i12 = Integer.MAX_VALUE;
                    while (i11 != i4) {
                        int i13 = i11;
                        np0 np0Var3 = np0VarArr2[i13];
                        BitSet bitSet4 = bitSet3;
                        int iOooO0oO = np0Var3.OooO0oO(iOooOOO0);
                        if (iOooO0oO < i12) {
                            i12 = iOooO0oO;
                            np0Var2 = np0Var3;
                        }
                        i11 = i13 + i10;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    np0VarArr2 = np0VarArr;
                    int iOooO4 = puVar.OooO();
                    int i14 = i3;
                    int i15 = Integer.MIN_VALUE;
                    while (i14 != i4) {
                        np0 np0Var4 = np0VarArr2[i14];
                        int i16 = i4;
                        int iOooO5 = np0Var4.OooO(iOooO4);
                        if (iOooO5 > i15) {
                            i15 = iOooO5;
                            np0Var2 = np0Var4;
                        }
                        i14 += i10;
                        i4 = i16;
                    }
                }
                np0Var = np0Var2;
                o0o000o.OooOoO0(iOooO0Oo);
                ((int[]) o0o000o.OooO0o0)[iOooO0Oo] = np0Var.OooO0o0;
            } else {
                bitSet = bitSet3;
                i = i4;
                np0VarArr2 = np0VarArr;
                np0Var = np0VarArr2[i9];
            }
            ii1Var.OooO0o0 = np0Var;
            if (gl0Var.OooO0o0 == 1) {
                OooO0O0(viewOooO0Oo, -1, false);
            } else {
                OooO0O0(viewOooO0Oo, 0, false);
            }
            int i17 = this.OooOo00;
            if (i17 == 1) {
                o0000oO(viewOooO0Oo, i71.OooOo0o(false, this.OooOo0, this.OooOO0o, 0, ((ViewGroup.MarginLayoutParams) ii1Var).width), i71.OooOo0o(true, this.OooOOOO, this.OooOOO0, OooOooO() + Oooo00O(), ((ViewGroup.MarginLayoutParams) ii1Var).height));
            } else {
                o0000oO(viewOooO0Oo, i71.OooOo0o(true, this.OooOOO, this.OooOO0o, Oooo000() + OooOooo(), ((ViewGroup.MarginLayoutParams) ii1Var).width), i71.OooOo0o(false, this.OooOo0, this.OooOOO0, 0, ((ViewGroup.MarginLayoutParams) ii1Var).height));
            }
            if (gl0Var.OooO0o0 == 1) {
                iOooO0o0 = np0Var.OooO0oO(iOooO3);
                iOooO = puVar.OooO0o0(viewOooO0Oo) + iOooO0o0;
            } else {
                iOooO = np0Var.OooO(iOooO3);
                iOooO0o0 = iOooO - puVar.OooO0o0(viewOooO0Oo);
            }
            int i18 = gl0Var.OooO0o0;
            np0 np0Var5 = ii1Var.OooO0o0;
            if (i18 == 1) {
                np0Var5.getClass();
                ii1 ii1Var2 = (ii1) viewOooO0Oo.getLayoutParams();
                ii1Var2.OooO0o0 = np0Var5;
                ArrayList arrayList = (ArrayList) np0Var5.OooO0o;
                arrayList.add(viewOooO0Oo);
                np0Var5.OooO0OO = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    np0Var5.OooO0O0 = Integer.MIN_VALUE;
                }
                if (ii1Var2.OooO00o.OooOO0() || ii1Var2.OooO00o.OooOOO0()) {
                    np0Var5.OooO0Oo = ((StaggeredGridLayoutManager) np0Var5.OooO0oO).OooOOo.OooO0o0(viewOooO0Oo) + np0Var5.OooO0Oo;
                }
            } else {
                np0Var5.getClass();
                ii1 ii1Var3 = (ii1) viewOooO0Oo.getLayoutParams();
                ii1Var3.OooO0o0 = np0Var5;
                ArrayList arrayList2 = (ArrayList) np0Var5.OooO0o;
                arrayList2.add(0, viewOooO0Oo);
                np0Var5.OooO0O0 = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    np0Var5.OooO0OO = Integer.MIN_VALUE;
                }
                if (ii1Var3.OooO00o.OooOO0() || ii1Var3.OooO00o.OooOOO0()) {
                    np0Var5.OooO0Oo = ((StaggeredGridLayoutManager) np0Var5.OooO0oO).OooOOo.OooO0o0(viewOooO0Oo) + np0Var5.OooO0Oo;
                }
            }
            boolean zO0000oo = o0000oo();
            pu puVar2 = this.OooOOoo;
            if (zO0000oo && i17 == 1) {
                iOooO2 = puVar2.OooO() - (((i - 1) - np0Var.OooO0o0) * this.OooOo0);
                iOooO0o02 = iOooO2 - puVar2.OooO0o0(viewOooO0Oo);
            } else {
                int iOooOOO02 = (np0Var.OooO0o0 * this.OooOo0) + puVar2.OooOOO0();
                int iOooO0o03 = puVar2.OooO0o0(viewOooO0Oo) + iOooOOO02;
                iOooO0o02 = iOooOOO02;
                iOooO2 = iOooO0o03;
            }
            z2 = true;
            if (i17 == 1) {
                i71.Oooo0oo(viewOooO0Oo, iOooO0o02, iOooO0o0, iOooO2, iOooO);
            } else {
                i71.Oooo0oo(viewOooO0Oo, iOooO0o0, iOooO0o02, iOooO, iOooO2);
            }
            o0000OoO(np0Var, gl0Var2.OooO0o0, i5);
            p71Var2 = p71Var;
            o0000O(p71Var2, gl0Var2);
            if (gl0Var2.OooO0oo && viewOooO0Oo.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(np0Var.OooO0o0, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i4 = i;
            np0VarArr = np0VarArr2;
        }
        if (!z2) {
            o0000O(p71Var2, gl0Var2);
        }
        int iOooOOO03 = gl0Var2.OooO0o0 == -1 ? puVar.OooOOO0() - o00000oo(puVar.OooOOO0()) : o00000oO(puVar.OooO()) - puVar.OooO();
        if (iOooOOO03 > 0) {
            return Math.min(gl0Var.OooO0O0, iOooOOO03);
        }
        return 0;
    }

    @Override // com.cmaster.cloner.i71
    public final boolean o000000() {
        return this.Oooo000 == null;
    }

    public final boolean o000000O() {
        int iO00000o0;
        if (OooOo0O() != 0 && this.OooOoo != 0 && this.OooO0oO) {
            if (this.OooOo) {
                iO00000o0 = o0000Ooo();
                o00000o0();
            } else {
                iO00000o0 = o00000o0();
                o0000Ooo();
            }
            if (iO00000o0 == 0 && o0000O00() != null) {
                this.OooOoo0.OooO0o0();
                this.OooO0o = true;
                o00o0O();
                return true;
            }
        }
        return false;
    }

    public final int o000000o(u71 u71Var) {
        if (OooOo0O() == 0) {
            return 0;
        }
        boolean z = !this.Oooo0;
        return z33.OooO0O0(u71Var, this.OooOOo, o00000O(z), o00000O0(z), this, this.Oooo0, this.OooOo);
    }

    public final View o00000O(boolean z) {
        pu puVar = this.OooOOo;
        int iOooOOO0 = puVar.OooOOO0();
        int iOooO = puVar.OooO();
        int iOooOo0O = OooOo0O();
        View view = null;
        for (int i = 0; i < iOooOo0O; i++) {
            View viewOooOo0 = OooOo0(i);
            int iOooO0oO = puVar.OooO0oO(viewOooOo0);
            if (puVar.OooO0Oo(viewOooOo0) > iOooOOO0 && iOooO0oO < iOooO) {
                if (iOooO0oO >= iOooOOO0 || !z) {
                    return viewOooOo0;
                }
                if (view == null) {
                    view = viewOooOo0;
                }
            }
        }
        return view;
    }

    public final View o00000O0(boolean z) {
        pu puVar = this.OooOOo;
        int iOooOOO0 = puVar.OooOOO0();
        int iOooO = puVar.OooO();
        View view = null;
        for (int iOooOo0O = OooOo0O() - 1; iOooOo0O >= 0; iOooOo0O--) {
            View viewOooOo0 = OooOo0(iOooOo0O);
            int iOooO0oO = puVar.OooO0oO(viewOooOo0);
            int iOooO0Oo = puVar.OooO0Oo(viewOooOo0);
            if (iOooO0Oo > iOooOOO0 && iOooO0oO < iOooO) {
                if (iOooO0Oo <= iOooO || !z) {
                    return viewOooOo0;
                }
                if (view == null) {
                    view = viewOooOo0;
                }
            }
        }
        return view;
    }

    public final void o00000OO(p71 p71Var, u71 u71Var, boolean z) {
        int iOooO;
        int iO00000oO = o00000oO(Integer.MIN_VALUE);
        if (iO00000oO != Integer.MIN_VALUE && (iOooO = this.OooOOo.OooO() - iO00000oO) > 0) {
            int i = iOooO - (-o0000OOo(-iOooO, p71Var, u71Var));
            if (!z || i <= 0) {
                return;
            }
            this.OooOOo.OooOOo0(i);
        }
    }

    public final void o00000Oo(p71 p71Var, u71 u71Var, boolean z) {
        int iOooOOO0;
        int iO00000oo = o00000oo(Integer.MAX_VALUE);
        if (iO00000oo != Integer.MAX_VALUE && (iOooOOO0 = iO00000oo - this.OooOOo.OooOOO0()) > 0) {
            int iO0000OOo = iOooOOO0 - o0000OOo(iOooOOO0, p71Var, u71Var);
            if (!z || iO0000OOo <= 0) {
                return;
            }
            this.OooOOo.OooOOo0(-iO0000OOo);
        }
    }

    public final int o00000o0() {
        if (OooOo0O() == 0) {
            return 0;
        }
        return i71.Oooo00o(OooOo0(0));
    }

    public final int o00000oO(int i) {
        int iOooO0oO = this.OooOOo0[0].OooO0oO(i);
        for (int i2 = 1; i2 < this.OooOOOo; i2++) {
            int iOooO0oO2 = this.OooOOo0[i2].OooO0oO(i);
            if (iOooO0oO2 > iOooO0oO) {
                iOooO0oO = iOooO0oO2;
            }
        }
        return iOooO0oO;
    }

    public final int o00000oo(int i) {
        int iOooO = this.OooOOo0[0].OooO(i);
        for (int i2 = 1; i2 < this.OooOOOo; i2++) {
            int iOooO2 = this.OooOOo0[i2].OooO(i);
            if (iOooO2 < iOooO) {
                iOooO = iOooO2;
            }
        }
        return iOooO;
    }

    public final void o0000O(p71 p71Var, gl0 gl0Var) {
        if (!gl0Var.OooO00o || gl0Var.OooO) {
            return;
        }
        int i = gl0Var.OooO0O0;
        int i2 = gl0Var.OooO0o0;
        if (i == 0) {
            if (i2 == -1) {
                o0000OO0(p71Var, gl0Var.OooO0oO);
                return;
            } else {
                o0000OO(p71Var, gl0Var.OooO0o);
                return;
            }
        }
        int i3 = this.OooOOOo;
        np0[] np0VarArr = this.OooOOo0;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = gl0Var.OooO0o;
            int iOooO = np0VarArr[0].OooO(i5);
            while (i4 < i3) {
                int iOooO2 = np0VarArr[i4].OooO(i5);
                if (iOooO2 > iOooO) {
                    iOooO = iOooO2;
                }
                i4++;
            }
            int i6 = i5 - iOooO;
            int iMin = gl0Var.OooO0oO;
            if (i6 >= 0) {
                iMin -= Math.min(i6, gl0Var.OooO0O0);
            }
            o0000OO0(p71Var, iMin);
            return;
        }
        int i7 = gl0Var.OooO0oO;
        int iOooO0oO = np0VarArr[0].OooO0oO(i7);
        while (i4 < i3) {
            int iOooO0oO2 = np0VarArr[i4].OooO0oO(i7);
            if (iOooO0oO2 < iOooO0oO) {
                iOooO0oO = iOooO0oO2;
            }
            i4++;
        }
        int i8 = iOooO0oO - gl0Var.OooO0oO;
        int iMin2 = gl0Var.OooO0o;
        if (i8 >= 0) {
            iMin2 += Math.min(i8, gl0Var.OooO0O0);
        }
        o0000OO(p71Var, iMin2);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0000O0(com.cmaster.cloner.p71 r18, com.cmaster.cloner.u71 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o0000O0(com.cmaster.cloner.p71, com.cmaster.cloner.u71, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View o0000O00() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o0000O00():android.view.View");
    }

    public final boolean o0000O0O(int i) {
        if (this.OooOo00 == 0) {
            return (i == -1) != this.OooOo;
        }
        return ((i == -1) == this.OooOo) == o0000oo();
    }

    public final void o0000OO(p71 p71Var, int i) {
        while (OooOo0O() > 0) {
            View viewOooOo0 = OooOo0(0);
            pu puVar = this.OooOOo;
            if (puVar.OooO0Oo(viewOooOo0) > i || puVar.OooOOOO(viewOooOo0) > i) {
                return;
            }
            ii1 ii1Var = (ii1) viewOooOo0.getLayoutParams();
            ii1Var.getClass();
            if (((ArrayList) ii1Var.OooO0o0.OooO0o).size() == 1) {
                return;
            }
            np0 np0Var = ii1Var.OooO0o0;
            ArrayList arrayList = (ArrayList) np0Var.OooO0o;
            View view = (View) arrayList.remove(0);
            ii1 ii1Var2 = (ii1) view.getLayoutParams();
            ii1Var2.OooO0o0 = null;
            if (arrayList.size() == 0) {
                np0Var.OooO0OO = Integer.MIN_VALUE;
            }
            if (ii1Var2.OooO00o.OooOO0() || ii1Var2.OooO00o.OooOOO0()) {
                np0Var.OooO0Oo -= ((StaggeredGridLayoutManager) np0Var.OooO0oO).OooOOo.OooO0o0(view);
            }
            np0Var.OooO0O0 = Integer.MIN_VALUE;
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
                xbVar.OooO0o0 = 1;
                xbVar.OooO = viewOooOo0;
                int iIndexOfChild = ((RecyclerView) xb1Var.OooO0o0).indexOfChild(viewOooOo0);
                if (iIndexOfChild >= 0) {
                    if (((sc) xbVar.OooO0oO).OooO0o(iIndexOfChild)) {
                        xbVar.OooOOo0(viewOooOo0);
                    }
                    xb1Var.Oooo0O0(iIndexOfChild);
                }
                xbVar.OooO0o0 = 0;
                xbVar.OooO = null;
                p71Var.OooO(viewOooOo0);
            } catch (Throwable th) {
                xbVar.OooO0o0 = 0;
                xbVar.OooO = null;
                throw th;
            }
        }
    }

    public final void o0000OO0(p71 p71Var, int i) {
        for (int iOooOo0O = OooOo0O() - 1; iOooOo0O >= 0; iOooOo0O--) {
            View viewOooOo0 = OooOo0(iOooOo0O);
            pu puVar = this.OooOOo;
            if (puVar.OooO0oO(viewOooOo0) < i || puVar.OooOOOo(viewOooOo0) < i) {
                return;
            }
            ii1 ii1Var = (ii1) viewOooOo0.getLayoutParams();
            ii1Var.getClass();
            if (((ArrayList) ii1Var.OooO0o0.OooO0o).size() == 1) {
                return;
            }
            np0 np0Var = ii1Var.OooO0o0;
            ArrayList arrayList = (ArrayList) np0Var.OooO0o;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            ii1 ii1Var2 = (ii1) view.getLayoutParams();
            ii1Var2.OooO0o0 = null;
            if (ii1Var2.OooO00o.OooOO0() || ii1Var2.OooO00o.OooOOO0()) {
                np0Var.OooO0Oo -= ((StaggeredGridLayoutManager) np0Var.OooO0oO).OooOOo.OooO0o0(view);
            }
            if (size == 1) {
                np0Var.OooO0O0 = Integer.MIN_VALUE;
            }
            np0Var.OooO0OO = Integer.MIN_VALUE;
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
                xbVar.OooO0o0 = 1;
                xbVar.OooO = viewOooOo0;
                int iIndexOfChild = ((RecyclerView) xb1Var.OooO0o0).indexOfChild(viewOooOo0);
                if (iIndexOfChild >= 0) {
                    if (((sc) xbVar.OooO0oO).OooO0o(iIndexOfChild)) {
                        xbVar.OooOOo0(viewOooOo0);
                    }
                    xb1Var.Oooo0O0(iIndexOfChild);
                }
                xbVar.OooO0o0 = 0;
                xbVar.OooO = null;
                p71Var.OooO(viewOooOo0);
            } catch (Throwable th) {
                xbVar.OooO0o0 = 0;
                xbVar.OooO = null;
                throw th;
            }
        }
    }

    public final void o0000OOO() {
        if (this.OooOo00 == 1 || !o0000oo()) {
            this.OooOo = this.OooOo0o;
        } else {
            this.OooOo = !this.OooOo0o;
        }
    }

    public final int o0000OOo(int i, p71 p71Var, u71 u71Var) {
        if (OooOo0O() == 0 || i == 0) {
            return 0;
        }
        o000OO(i, u71Var);
        gl0 gl0Var = this.OooOo0O;
        int iO00000 = o00000(p71Var, gl0Var, u71Var);
        if (gl0Var.OooO0O0 >= iO00000) {
            i = i < 0 ? -iO00000 : iO00000;
        }
        this.OooOOo.OooOOo0(-i);
        this.OooOooO = this.OooOo;
        gl0Var.OooO0O0 = 0;
        o0000O(p71Var, gl0Var);
        return i;
    }

    public final void o0000Oo(int i, u71 u71Var) {
        int iOooOOO;
        int iOooOOO2;
        int i2;
        gl0 gl0Var = this.OooOo0O;
        boolean z = false;
        gl0Var.OooO0O0 = 0;
        gl0Var.OooO0OO = i;
        um0 um0Var = this.OooO0o0;
        pu puVar = this.OooOOo;
        if (um0Var == null || !um0Var.OooO0o0 || (i2 = u71Var.OooO00o) == -1) {
            iOooOOO = 0;
            iOooOOO2 = 0;
        } else {
            if (this.OooOo == (i2 < i)) {
                iOooOOO = puVar.OooOOO();
                iOooOOO2 = 0;
            } else {
                iOooOOO2 = puVar.OooOOO();
                iOooOOO = 0;
            }
        }
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView == null || !recyclerView.OooOO0O) {
            gl0Var.OooO0oO = puVar.OooO0oo() + iOooOOO;
            gl0Var.OooO0o = -iOooOOO2;
        } else {
            gl0Var.OooO0o = puVar.OooOOO0() - iOooOOO2;
            gl0Var.OooO0oO = puVar.OooO() + iOooOOO;
        }
        gl0Var.OooO0oo = false;
        gl0Var.OooO00o = true;
        if (puVar.OooOO0O() == 0 && puVar.OooO0oo() == 0) {
            z = true;
        }
        gl0Var.OooO = z;
    }

    public final void o0000Oo0(int i) {
        gl0 gl0Var = this.OooOo0O;
        gl0Var.OooO0o0 = i;
        gl0Var.OooO0Oo = this.OooOo != (i == -1) ? -1 : 1;
    }

    public final void o0000OoO(np0 np0Var, int i, int i2) {
        int i3 = np0Var.OooO0Oo;
        int i4 = np0Var.OooO0o0;
        BitSet bitSet = this.OooOoO0;
        if (i != -1) {
            int i5 = np0Var.OooO0OO;
            if (i5 == Integer.MIN_VALUE) {
                np0Var.OooO00o();
                i5 = np0Var.OooO0OO;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = np0Var.OooO0O0;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) np0Var.OooO0o).get(0);
            ii1 ii1Var = (ii1) view.getLayoutParams();
            np0Var.OooO0O0 = ((StaggeredGridLayoutManager) np0Var.OooO0oO).OooOOo.OooO0oO(view);
            ii1Var.getClass();
            i6 = np0Var.OooO0O0;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    public final int o0000Ooo() {
        int iOooOo0O = OooOo0O();
        if (iOooOo0O == 0) {
            return 0;
        }
        return i71.Oooo00o(OooOo0(iOooOo0O - 1));
    }

    public final void o0000oO(View view, int i, int i2) {
        RecyclerView recyclerView = this.OooO0O0;
        Rect rect = this.Oooo00O;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.Oooo(view));
        }
        ii1 ii1Var = (ii1) view.getLayoutParams();
        int iO0000o0 = o0000o0(i, ((ViewGroup.MarginLayoutParams) ii1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) ii1Var).rightMargin + rect.right);
        int iO0000o02 = o0000o0(i2, ((ViewGroup.MarginLayoutParams) ii1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) ii1Var).bottomMargin + rect.bottom);
        if (o0Oo0oo(view, iO0000o0, iO0000o02, ii1Var)) {
            view.measure(iO0000o0, iO0000o02);
        }
    }

    public final boolean o0000oo() {
        return this.OooO0O0.getLayoutDirection() == 1;
    }

    public final void o000OO(int i, u71 u71Var) {
        int iO00000o0;
        int i2;
        if (i > 0) {
            iO00000o0 = o0000Ooo();
            i2 = 1;
        } else {
            iO00000o0 = o00000o0();
            i2 = -1;
        }
        gl0 gl0Var = this.OooOo0O;
        gl0Var.OooO00o = true;
        o0000Oo(iO00000o0, u71Var);
        o0000Oo0(i2);
        gl0Var.OooO0OO = iO00000o0 + gl0Var.OooO0Oo;
        gl0Var.OooO0O0 = Math.abs(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    @Override // com.cmaster.cloner.i71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View o000oOoO(android.view.View r9, int r10, com.cmaster.cloner.p71 r11, com.cmaster.cloner.u71 r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o000oOoO(android.view.View, int, com.cmaster.cloner.p71, com.cmaster.cloner.u71):android.view.View");
    }

    @Override // com.cmaster.cloner.i71
    public final int o00oO0o(int i, p71 p71Var, u71 u71Var) {
        return o0000OOo(i, p71Var, u71Var);
    }

    @Override // com.cmaster.cloner.i71
    public final int o00ooo(int i, p71 p71Var, u71 u71Var) {
        return o0000OOo(i, p71Var, u71Var);
    }

    @Override // com.cmaster.cloner.i71
    public final void o0O0O00(RecyclerView recyclerView, int i) {
        um0 um0Var = new um0(recyclerView.getContext());
        um0Var.OooO00o = i;
        o000OOo(um0Var);
    }

    @Override // com.cmaster.cloner.i71
    public final void o0ooOOo(Rect rect, int i, int i2) {
        int iOooO0oO;
        int iOooO0oO2;
        int iOooo000 = Oooo000() + OooOooo();
        int iOooOooO = OooOooO() + Oooo00O();
        int i3 = this.OooOo00;
        int i4 = this.OooOOOo;
        if (i3 == 1) {
            int iHeight = rect.height() + iOooOooO;
            RecyclerView recyclerView = this.OooO0O0;
            WeakHashMap weakHashMap = nt1.OooO00o;
            iOooO0oO2 = i71.OooO0oO(i2, iHeight, recyclerView.getMinimumHeight());
            iOooO0oO = i71.OooO0oO(i, (this.OooOo0 * i4) + iOooo000, this.OooO0O0.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iOooo000;
            RecyclerView recyclerView2 = this.OooO0O0;
            WeakHashMap weakHashMap2 = nt1.OooO00o;
            iOooO0oO = i71.OooO0oO(i, iWidth, recyclerView2.getMinimumWidth());
            iOooO0oO2 = i71.OooO0oO(i2, (this.OooOo0 * i4) + iOooOooO, this.OooO0O0.getMinimumHeight());
        }
        this.OooO0O0.setMeasuredDimension(iOooO0oO, iOooO0oO2);
    }

    @Override // com.cmaster.cloner.i71
    public final void oo000o(int i) {
        ki1 ki1Var = this.Oooo000;
        if (ki1Var != null && ki1Var.OooO0Oo != i) {
            ki1Var.OooO0oO = null;
            ki1Var.OooO0o = 0;
            ki1Var.OooO0Oo = -1;
            ki1Var.OooO0o0 = -1;
        }
        this.OooOoO = i;
        this.OooOoOO = Integer.MIN_VALUE;
        o00o0O();
    }
}
