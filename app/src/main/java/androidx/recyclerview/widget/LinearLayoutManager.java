package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.cmaster.cloner.a71;
import com.cmaster.cloner.ed;
import com.cmaster.cloner.h71;
import com.cmaster.cloner.i71;
import com.cmaster.cloner.j71;
import com.cmaster.cloner.o000;
import com.cmaster.cloner.o000O00O;
import com.cmaster.cloner.p71;
import com.cmaster.cloner.pu;
import com.cmaster.cloner.px0;
import com.cmaster.cloner.qm0;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.rm0;
import com.cmaster.cloner.sm0;
import com.cmaster.cloner.t71;
import com.cmaster.cloner.tm0;
import com.cmaster.cloner.u71;
import com.cmaster.cloner.um0;
import com.cmaster.cloner.z33;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends i71 implements t71 {
    public int OooOOOo;
    public pu OooOOo;
    public sm0 OooOOo0;
    public boolean OooOOoo;
    public int OooOo;
    public boolean OooOo0;
    public final boolean OooOo00;
    public boolean OooOo0O;
    public final boolean OooOo0o;
    public tm0 OooOoO;
    public int OooOoO0;
    public final qm0 OooOoOO;
    public final int OooOoo;
    public final rm0 OooOoo0;
    public final int[] OooOooO;

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.OooOOOo = 1;
        this.OooOo00 = false;
        this.OooOo0 = false;
        this.OooOo0O = false;
        this.OooOo0o = true;
        this.OooOo = -1;
        this.OooOoO0 = Integer.MIN_VALUE;
        this.OooOoO = null;
        this.OooOoOO = new qm0();
        this.OooOoo0 = new rm0();
        this.OooOoo = 2;
        this.OooOooO = new int[2];
        h71 h71VarOooo0 = i71.Oooo0(context, attributeSet, i, i2);
        o0000o0(h71VarOooo0.OooO00o);
        boolean z = h71VarOooo0.OooO0OO;
        OooO0OO(null);
        if (z != this.OooOo00) {
            this.OooOo00 = z;
            o00o0O();
        }
        o0000o0O(h71VarOooo0.OooO0Oo);
    }

    @Override // com.cmaster.cloner.i71
    public final void OooO(int i, ed edVar) {
        boolean z;
        int i2;
        tm0 tm0Var = this.OooOoO;
        if (tm0Var == null || (i2 = tm0Var.OooO0Oo) < 0) {
            o0000Oo0();
            z = this.OooOo0;
            i2 = this.OooOo;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = tm0Var.OooO0o;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.OooOoo && i2 >= 0 && i2 < i; i4++) {
            edVar.OooO0O0(i2, 0);
            i2 += i3;
        }
    }

    @Override // com.cmaster.cloner.t71
    public PointF OooO00o(int i) {
        if (OooOo0O() == 0) {
            return null;
        }
        int i2 = (i < i71.Oooo00o(OooOo0(0))) != this.OooOo0 ? -1 : 1;
        return this.OooOOOo == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // com.cmaster.cloner.i71
    public final void OooO0OO(String str) {
        if (this.OooOoO == null) {
            super.OooO0OO(str);
        }
    }

    @Override // com.cmaster.cloner.i71
    public final boolean OooO0Oo() {
        return this.OooOOOo == 0;
    }

    @Override // com.cmaster.cloner.i71
    public final boolean OooO0o0() {
        return this.OooOOOo == 1;
    }

    @Override // com.cmaster.cloner.i71
    public final void OooO0oo(int i, int i2, u71 u71Var, ed edVar) {
        if (this.OooOOOo != 0) {
            i = i2;
        }
        if (OooOo0O() == 0 || i == 0) {
            return;
        }
        o00000OO();
        o0000o0o(i > 0 ? 1 : -1, Math.abs(i), true, u71Var);
        o000000O(u71Var, this.OooOOo0, edVar);
    }

    @Override // com.cmaster.cloner.i71
    public int OooOO0(u71 u71Var) {
        return o000000o(u71Var);
    }

    @Override // com.cmaster.cloner.i71
    public int OooOO0O(u71 u71Var) {
        return o00000(u71Var);
    }

    @Override // com.cmaster.cloner.i71
    public int OooOO0o(u71 u71Var) {
        return o00000O0(u71Var);
    }

    @Override // com.cmaster.cloner.i71
    public int OooOOO(u71 u71Var) {
        return o00000(u71Var);
    }

    @Override // com.cmaster.cloner.i71
    public int OooOOO0(u71 u71Var) {
        return o000000o(u71Var);
    }

    @Override // com.cmaster.cloner.i71
    public int OooOOOO(u71 u71Var) {
        return o00000O0(u71Var);
    }

    @Override // com.cmaster.cloner.i71
    public j71 OooOOo() {
        return new j71(-2, -2);
    }

    @Override // com.cmaster.cloner.i71
    public final View OooOOo0(int i) {
        int iOooOo0O = OooOo0O();
        if (iOooOo0O == 0) {
            return null;
        }
        int iOooo00o = i - i71.Oooo00o(OooOo0(0));
        if (iOooo00o >= 0 && iOooo00o < iOooOo0O) {
            View viewOooOo0 = OooOo0(iOooo00o);
            if (i71.Oooo00o(viewOooOo0) == i) {
                return viewOooOo0;
            }
        }
        return super.OooOOo0(i);
    }

    @Override // com.cmaster.cloner.i71
    public final boolean Oooo0o() {
        return this.OooOo00;
    }

    @Override // com.cmaster.cloner.i71
    public final boolean Oooo0o0() {
        return true;
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooOO0(RecyclerView recyclerView) {
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooOOO(AccessibilityEvent accessibilityEvent) {
        super.OoooOOO(accessibilityEvent);
        if (OooOo0O() > 0) {
            accessibilityEvent.setFromIndex(o00000oO());
            accessibilityEvent.setToIndex(o00000oo());
        }
    }

    @Override // com.cmaster.cloner.i71
    public void OoooOOo(p71 p71Var, u71 u71Var, o000O00O o000o00o) {
        super.OoooOOo(p71Var, u71Var, o000o00o);
        a71 a71Var = this.OooO0O0.OooOOOo;
        if (a71Var == null || a71Var.OooO00o() <= 0) {
            return;
        }
        o000o00o.OooO00o(o000.OooOO0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018c  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // com.cmaster.cloner.i71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooooOo(com.cmaster.cloner.p71 r18, com.cmaster.cloner.u71 r19) {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.OooooOo(com.cmaster.cloner.p71, com.cmaster.cloner.u71):void");
    }

    @Override // com.cmaster.cloner.i71
    public void Oooooo(Parcelable parcelable) {
        if (parcelable instanceof tm0) {
            tm0 tm0Var = (tm0) parcelable;
            this.OooOoO = tm0Var;
            if (this.OooOo != -1) {
                tm0Var.OooO0Oo = -1;
            }
            o00o0O();
        }
    }

    @Override // com.cmaster.cloner.i71
    public void Oooooo0(u71 u71Var) {
        this.OooOoO = null;
        this.OooOo = -1;
        this.OooOoO0 = Integer.MIN_VALUE;
        this.OooOoOO.OooO0OO();
    }

    @Override // com.cmaster.cloner.i71
    public Parcelable OoooooO() {
        tm0 tm0Var = this.OooOoO;
        if (tm0Var != null) {
            tm0 tm0Var2 = new tm0();
            tm0Var2.OooO0Oo = tm0Var.OooO0Oo;
            tm0Var2.OooO0o0 = tm0Var.OooO0o0;
            tm0Var2.OooO0o = tm0Var.OooO0o;
            return tm0Var2;
        }
        tm0 tm0Var3 = new tm0();
        if (OooOo0O() <= 0) {
            tm0Var3.OooO0Oo = -1;
            return tm0Var3;
        }
        o00000OO();
        boolean z = this.OooOOoo ^ this.OooOo0;
        tm0Var3.OooO0o = z;
        if (z) {
            View viewO0000O0O = o0000O0O();
            tm0Var3.OooO0o0 = this.OooOOo.OooO() - this.OooOOo.OooO0Oo(viewO0000O0O);
            tm0Var3.OooO0Oo = i71.Oooo00o(viewO0000O0O);
            return tm0Var3;
        }
        View viewO000OO = o000OO();
        tm0Var3.OooO0Oo = i71.Oooo00o(viewO000OO);
        tm0Var3.OooO0o0 = this.OooOOo.OooO0oO(viewO000OO) - this.OooOOo.OooOOO0();
        return tm0Var3;
    }

    public final View o0000(int i, int i2) {
        int i3;
        int i4;
        o00000OO();
        if (i2 <= i && i2 >= i) {
            return OooOo0(i);
        }
        if (this.OooOOo.OooO0oO(OooOo0(i)) < this.OooOOo.OooOOO0()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.OooOOOo == 0 ? this.OooO0OO.OooO0O0(i, i2, i3, i4) : this.OooO0Oo.OooO0O0(i, i2, i3, i4);
    }

    public final int o00000(u71 u71Var) {
        if (OooOo0O() == 0) {
            return 0;
        }
        o00000OO();
        pu puVar = this.OooOOo;
        boolean z = !this.OooOo0o;
        return z33.OooO0O0(u71Var, puVar, o0000Ooo(z), o00000o0(z), this, this.OooOo0o, this.OooOo0);
    }

    @Override // com.cmaster.cloner.i71
    public boolean o000000() {
        return this.OooOoO == null && this.OooOOoo == this.OooOo0O;
    }

    public void o000000O(u71 u71Var, sm0 sm0Var, ed edVar) {
        int i = sm0Var.OooO0Oo;
        if (i < 0 || i >= u71Var.OooO0O0()) {
            return;
        }
        edVar.OooO0O0(i, Math.max(0, sm0Var.OooO0oO));
    }

    public final int o000000o(u71 u71Var) {
        if (OooOo0O() == 0) {
            return 0;
        }
        o00000OO();
        pu puVar = this.OooOOo;
        boolean z = !this.OooOo0o;
        return z33.OooO00o(u71Var, puVar, o0000Ooo(z), o00000o0(z), this, this.OooOo0o);
    }

    public final int o00000O(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.OooOOOo == 1) ? 1 : Integer.MIN_VALUE : this.OooOOOo == 0 ? 1 : Integer.MIN_VALUE : this.OooOOOo == 1 ? -1 : Integer.MIN_VALUE : this.OooOOOo == 0 ? -1 : Integer.MIN_VALUE : (this.OooOOOo != 1 && o0000O()) ? -1 : 1 : (this.OooOOOo != 1 && o0000O()) ? 1 : -1;
    }

    public final int o00000O0(u71 u71Var) {
        if (OooOo0O() == 0) {
            return 0;
        }
        o00000OO();
        pu puVar = this.OooOOo;
        boolean z = !this.OooOo0o;
        return z33.OooO0OO(u71Var, puVar, o0000Ooo(z), o00000o0(z), this, this.OooOo0o);
    }

    public final void o00000OO() {
        if (this.OooOOo0 == null) {
            sm0 sm0Var = new sm0();
            sm0Var.OooO00o = true;
            sm0Var.OooO0oo = 0;
            sm0Var.OooO = 0;
            sm0Var.OooOO0O = null;
            this.OooOOo0 = sm0Var;
        }
    }

    public final int o00000Oo(p71 p71Var, sm0 sm0Var, u71 u71Var, boolean z) {
        int i;
        int i2 = sm0Var.OooO0OO;
        int i3 = sm0Var.OooO0oO;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                sm0Var.OooO0oO = i3 + i2;
            }
            o0000OOO(p71Var, sm0Var);
        }
        int i4 = sm0Var.OooO0OO + sm0Var.OooO0oo;
        while (true) {
            if ((!sm0Var.OooOO0o && i4 <= 0) || (i = sm0Var.OooO0Oo) < 0 || i >= u71Var.OooO0O0()) {
                break;
            }
            rm0 rm0Var = this.OooOoo0;
            rm0Var.OooO00o = 0;
            rm0Var.OooO0O0 = false;
            rm0Var.OooO0OO = false;
            rm0Var.OooO0Oo = false;
            o0000OO0(p71Var, u71Var, sm0Var, rm0Var);
            if (!rm0Var.OooO0O0) {
                int i5 = sm0Var.OooO0O0;
                int i6 = rm0Var.OooO00o;
                sm0Var.OooO0O0 = (sm0Var.OooO0o * i6) + i5;
                if (!rm0Var.OooO0OO || sm0Var.OooOO0O != null || !u71Var.OooO0oO) {
                    sm0Var.OooO0OO -= i6;
                    i4 -= i6;
                }
                int i7 = sm0Var.OooO0oO;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    sm0Var.OooO0oO = i8;
                    int i9 = sm0Var.OooO0OO;
                    if (i9 < 0) {
                        sm0Var.OooO0oO = i8 + i9;
                    }
                    o0000OOO(p71Var, sm0Var);
                }
                if (z && rm0Var.OooO0Oo) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - sm0Var.OooO0OO;
    }

    public final View o00000o0(boolean z) {
        return this.OooOo0 ? o0000O00(0, OooOo0O(), z) : o0000O00(OooOo0O() - 1, -1, z);
    }

    public int o00000oO() {
        View viewO0000O00 = o0000O00(0, OooOo0O(), false);
        if (viewO0000O00 == null) {
            return -1;
        }
        return i71.Oooo00o(viewO0000O00);
    }

    public int o00000oo() {
        View viewO0000O00 = o0000O00(OooOo0O() - 1, -1, false);
        if (viewO0000O00 == null) {
            return -1;
        }
        return i71.Oooo00o(viewO0000O00);
    }

    public final boolean o0000O() {
        return this.OooO0O0.getLayoutDirection() == 1;
    }

    public final int o0000O0(int i, p71 p71Var, u71 u71Var, boolean z) {
        int iOooOOO0;
        int iOooOOO02 = i - this.OooOOo.OooOOO0();
        if (iOooOOO02 <= 0) {
            return 0;
        }
        int i2 = -o0000Oo(iOooOOO02, p71Var, u71Var);
        int i3 = i + i2;
        if (!z || (iOooOOO0 = i3 - this.OooOOo.OooOOO0()) <= 0) {
            return i2;
        }
        this.OooOOo.OooOOo0(-iOooOOO0);
        return i2 - iOooOOO0;
    }

    public final View o0000O00(int i, int i2, boolean z) {
        o00000OO();
        int i3 = z ? 24579 : 320;
        return this.OooOOOo == 0 ? this.OooO0OO.OooO0O0(i, i2, i3, 320) : this.OooO0Oo.OooO0O0(i, i2, i3, 320);
    }

    public final View o0000O0O() {
        return OooOo0(this.OooOo0 ? 0 : OooOo0O() - 1);
    }

    public void o0000OO(p71 p71Var, u71 u71Var, qm0 qm0Var, int i) {
    }

    public void o0000OO0(p71 p71Var, u71 u71Var, sm0 sm0Var, rm0 rm0Var) {
        int i;
        int iOooO0o;
        int i2;
        int iOooO0o2;
        View viewOooO0O0 = sm0Var.OooO0O0(p71Var);
        if (viewOooO0O0 == null) {
            rm0Var.OooO0O0 = true;
            return;
        }
        j71 j71Var = (j71) viewOooO0O0.getLayoutParams();
        List list = sm0Var.OooOO0O;
        boolean z = this.OooOo0;
        int i3 = sm0Var.OooO0o;
        if (list == null) {
            if (z == (i3 == -1)) {
                OooO0O0(viewOooO0O0, -1, false);
            } else {
                OooO0O0(viewOooO0O0, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                OooO0O0(viewOooO0O0, -1, true);
            } else {
                OooO0O0(viewOooO0O0, 0, true);
            }
        }
        Oooo(viewOooO0O0);
        rm0Var.OooO00o = this.OooOOo.OooO0o0(viewOooO0O0);
        if (this.OooOOOo == 1) {
            if (o0000O()) {
                iOooO0o2 = this.OooOOO - Oooo000();
                iOooO0o = iOooO0o2 - this.OooOOo.OooO0o(viewOooO0O0);
            } else {
                int iOooOooo = OooOooo();
                iOooO0o2 = this.OooOOo.OooO0o(viewOooO0O0) + iOooOooo;
                iOooO0o = iOooOooo;
            }
            int i4 = sm0Var.OooO0o;
            i2 = sm0Var.OooO0O0;
            int i5 = rm0Var.OooO00o;
            if (i4 == -1) {
                int i6 = i2 - i5;
                i = i2;
                i2 = i6;
            } else {
                i = i5 + i2;
            }
        } else {
            int iOooo00O = Oooo00O();
            int iOooO0o3 = this.OooOOo.OooO0o(viewOooO0O0) + iOooo00O;
            int i7 = sm0Var.OooO0o;
            int i8 = sm0Var.OooO0O0;
            int i9 = rm0Var.OooO00o;
            if (i7 == -1) {
                int i10 = i8 - i9;
                iOooO0o2 = i8;
                i2 = iOooo00O;
                i = iOooO0o3;
                iOooO0o = i10;
            } else {
                int i11 = i8 + i9;
                i = iOooO0o3;
                iOooO0o = i8;
                i2 = iOooo00O;
                iOooO0o2 = i11;
            }
        }
        i71.Oooo0oo(viewOooO0O0, iOooO0o, i2, iOooO0o2, i);
        if (j71Var.OooO00o.OooOO0() || j71Var.OooO00o.OooOOO0()) {
            rm0Var.OooO0OO = true;
        }
        rm0Var.OooO0Oo = viewOooO0O0.hasFocusable();
    }

    public final void o0000OOO(p71 p71Var, sm0 sm0Var) {
        if (!sm0Var.OooO00o || sm0Var.OooOO0o) {
            return;
        }
        int i = sm0Var.OooO0oO;
        int i2 = sm0Var.OooO;
        if (sm0Var.OooO0o == -1) {
            int iOooOo0O = OooOo0O();
            if (i < 0) {
                return;
            }
            int iOooO0oo = (this.OooOOo.OooO0oo() - i) + i2;
            if (this.OooOo0) {
                for (int i3 = 0; i3 < iOooOo0O; i3++) {
                    View viewOooOo0 = OooOo0(i3);
                    if (this.OooOOo.OooO0oO(viewOooOo0) < iOooO0oo || this.OooOOo.OooOOOo(viewOooOo0) < iOooO0oo) {
                        o0000OOo(p71Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iOooOo0O - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewOooOo02 = OooOo0(i5);
                if (this.OooOOo.OooO0oO(viewOooOo02) < iOooO0oo || this.OooOOo.OooOOOo(viewOooOo02) < iOooO0oo) {
                    o0000OOo(p71Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iOooOo0O2 = OooOo0O();
        if (!this.OooOo0) {
            for (int i7 = 0; i7 < iOooOo0O2; i7++) {
                View viewOooOo03 = OooOo0(i7);
                if (this.OooOOo.OooO0Oo(viewOooOo03) > i6 || this.OooOOo.OooOOOO(viewOooOo03) > i6) {
                    o0000OOo(p71Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iOooOo0O2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewOooOo04 = OooOo0(i9);
            if (this.OooOOo.OooO0Oo(viewOooOo04) > i6 || this.OooOOo.OooOOOO(viewOooOo04) > i6) {
                o0000OOo(p71Var, i8, i9);
                return;
            }
        }
    }

    public final void o0000OOo(p71 p71Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewOooOo0 = OooOo0(i);
                o00Oo0(i);
                p71Var.OooO(viewOooOo0);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewOooOo02 = OooOo0(i3);
            o00Oo0(i3);
            p71Var.OooO(viewOooOo02);
        }
    }

    public final int o0000Oo(int i, p71 p71Var, u71 u71Var) {
        if (OooOo0O() != 0 && i != 0) {
            o00000OO();
            this.OooOOo0.OooO00o = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            o0000o0o(i2, iAbs, true, u71Var);
            sm0 sm0Var = this.OooOOo0;
            int iO00000Oo = o00000Oo(p71Var, sm0Var, u71Var, false) + sm0Var.OooO0oO;
            if (iO00000Oo >= 0) {
                if (iAbs > iO00000Oo) {
                    i = i2 * iO00000Oo;
                }
                this.OooOOo.OooOOo0(-i);
                this.OooOOo0.OooOO0 = i;
                return i;
            }
        }
        return 0;
    }

    public final void o0000Oo0() {
        if (this.OooOOOo == 1 || !o0000O()) {
            this.OooOo0 = this.OooOo00;
        } else {
            this.OooOo0 = !this.OooOo00;
        }
    }

    public void o0000OoO(int i, int i2) {
        this.OooOo = i;
        this.OooOoO0 = i2;
        tm0 tm0Var = this.OooOoO;
        if (tm0Var != null) {
            tm0Var.OooO0Oo = -1;
        }
        o00o0O();
    }

    public final View o0000Ooo(boolean z) {
        return this.OooOo0 ? o0000O00(OooOo0O() - 1, -1, z) : o0000O00(0, OooOo0O(), z);
    }

    public final void o0000o(int i, int i2) {
        this.OooOOo0.OooO0OO = this.OooOOo.OooO() - i2;
        sm0 sm0Var = this.OooOOo0;
        sm0Var.OooO0o0 = this.OooOo0 ? -1 : 1;
        sm0Var.OooO0Oo = i;
        sm0Var.OooO0o = 1;
        sm0Var.OooO0O0 = i2;
        sm0Var.OooO0oO = Integer.MIN_VALUE;
    }

    public final void o0000o0(int i) {
        if (i != 0 && i != 1) {
            ra.OooOOO(px0.OooOOO(i, "invalid orientation:"));
            return;
        }
        OooO0OO(null);
        if (i != this.OooOOOo || this.OooOOo == null) {
            pu puVarOooO0O0 = pu.OooO0O0(this, i);
            this.OooOOo = puVarOooO0O0;
            this.OooOoOO.OooO00o = puVarOooO0O0;
            this.OooOOOo = i;
            o00o0O();
        }
    }

    public void o0000o0O(boolean z) {
        OooO0OO(null);
        if (this.OooOo0O == z) {
            return;
        }
        this.OooOo0O = z;
        o00o0O();
    }

    public final void o0000o0o(int i, int i2, boolean z, u71 u71Var) {
        int i3;
        int iOooOOO0;
        this.OooOOo0.OooOO0o = this.OooOOo.OooOO0O() == 0 && this.OooOOo.OooO0oo() == 0;
        this.OooOOo0.OooO0o = i;
        int[] iArr = this.OooOooO;
        iArr[0] = 0;
        iArr[1] = 0;
        int iOooOOO = u71Var.OooO00o != -1 ? this.OooOOo.OooOOO() : 0;
        if (this.OooOOo0.OooO0o == -1) {
            i3 = 0;
        } else {
            i3 = iOooOOO;
            iOooOOO = 0;
        }
        iArr[0] = iOooOOO;
        iArr[1] = i3;
        int iMax = Math.max(0, iOooOOO);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        sm0 sm0Var = this.OooOOo0;
        int i4 = z2 ? iMax2 : iMax;
        sm0Var.OooO0oo = i4;
        if (!z2) {
            iMax = iMax2;
        }
        sm0Var.OooO = iMax;
        if (z2) {
            sm0Var.OooO0oo = this.OooOOo.OooOO0() + i4;
            View viewO0000O0O = o0000O0O();
            sm0 sm0Var2 = this.OooOOo0;
            sm0Var2.OooO0o0 = this.OooOo0 ? -1 : 1;
            int iOooo00o = i71.Oooo00o(viewO0000O0O);
            sm0 sm0Var3 = this.OooOOo0;
            sm0Var2.OooO0Oo = iOooo00o + sm0Var3.OooO0o0;
            sm0Var3.OooO0O0 = this.OooOOo.OooO0Oo(viewO0000O0O);
            iOooOOO0 = this.OooOOo.OooO0Oo(viewO0000O0O) - this.OooOOo.OooO();
        } else {
            View viewO000OO = o000OO();
            sm0 sm0Var4 = this.OooOOo0;
            sm0Var4.OooO0oo = this.OooOOo.OooOOO0() + sm0Var4.OooO0oo;
            sm0 sm0Var5 = this.OooOOo0;
            sm0Var5.OooO0o0 = this.OooOo0 ? 1 : -1;
            int iOooo00o2 = i71.Oooo00o(viewO000OO);
            sm0 sm0Var6 = this.OooOOo0;
            sm0Var5.OooO0Oo = iOooo00o2 + sm0Var6.OooO0o0;
            sm0Var6.OooO0O0 = this.OooOOo.OooO0oO(viewO000OO);
            iOooOOO0 = (-this.OooOOo.OooO0oO(viewO000OO)) + this.OooOOo.OooOOO0();
        }
        sm0 sm0Var7 = this.OooOOo0;
        sm0Var7.OooO0OO = i2;
        if (z) {
            sm0Var7.OooO0OO = i2 - iOooOOO0;
        }
        sm0Var7.OooO0oO = iOooOOO0;
    }

    public final int o0000oO(int i, p71 p71Var, u71 u71Var, boolean z) {
        int iOooO;
        int iOooO2 = this.OooOOo.OooO() - i;
        if (iOooO2 <= 0) {
            return 0;
        }
        int i2 = -o0000Oo(-iOooO2, p71Var, u71Var);
        int i3 = i + i2;
        if (!z || (iOooO = this.OooOOo.OooO() - i3) <= 0) {
            return i2;
        }
        this.OooOOo.OooOOo0(iOooO);
        return iOooO + i2;
    }

    public final void o0000oO0(int i, int i2) {
        this.OooOOo0.OooO0OO = i2 - this.OooOOo.OooOOO0();
        sm0 sm0Var = this.OooOOo0;
        sm0Var.OooO0Oo = i;
        sm0Var.OooO0o0 = this.OooOo0 ? 1 : -1;
        sm0Var.OooO0o = -1;
        sm0Var.OooO0O0 = i2;
        sm0Var.OooO0oO = Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View o0000oo(com.cmaster.cloner.p71 r17, com.cmaster.cloner.u71 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.o00000OO()
            int r1 = r0.OooOo0O()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.OooOo0O()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.OooO0O0()
            com.cmaster.cloner.pu r7 = r0.OooOOo
            int r7 = r7.OooOOO0()
            com.cmaster.cloner.pu r8 = r0.OooOOo
            int r8 = r8.OooO()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.OooOo0(r1)
            int r13 = com.cmaster.cloner.i71.Oooo00o(r12)
            com.cmaster.cloner.pu r14 = r0.OooOOo
            int r14 = r14.OooO0oO(r12)
            com.cmaster.cloner.pu r15 = r0.OooOOo
            int r15 = r15.OooO0Oo(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            com.cmaster.cloner.j71 r13 = (com.cmaster.cloner.j71) r13
            com.cmaster.cloner.y71 r13 = r13.OooO00o
            boolean r13 = r13.OooOO0()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.o0000oo(com.cmaster.cloner.p71, com.cmaster.cloner.u71, boolean, boolean):android.view.View");
    }

    public final View o000OO() {
        return OooOo0(this.OooOo0 ? OooOo0O() - 1 : 0);
    }

    @Override // com.cmaster.cloner.i71
    public View o000oOoO(View view, int i, p71 p71Var, u71 u71Var) {
        int iO00000O;
        o0000Oo0();
        if (OooOo0O() != 0 && (iO00000O = o00000O(i)) != Integer.MIN_VALUE) {
            o00000OO();
            o0000o0o(iO00000O, (int) (this.OooOOo.OooOOO() * 0.33333334f), false, u71Var);
            sm0 sm0Var = this.OooOOo0;
            sm0Var.OooO0oO = Integer.MIN_VALUE;
            sm0Var.OooO00o = false;
            o00000Oo(p71Var, sm0Var, u71Var, true);
            boolean z = this.OooOo0;
            View viewO0000 = iO00000O == -1 ? z ? o0000(OooOo0O() - 1, -1) : o0000(0, OooOo0O()) : z ? o0000(0, OooOo0O()) : o0000(OooOo0O() - 1, -1);
            View viewO000OO = iO00000O == -1 ? o000OO() : o0000O0O();
            if (!viewO000OO.hasFocusable()) {
                return viewO0000;
            }
            if (viewO0000 != null) {
                return viewO000OO;
            }
        }
        return null;
    }

    @Override // com.cmaster.cloner.i71
    public int o00oO0o(int i, p71 p71Var, u71 u71Var) {
        if (this.OooOOOo == 0) {
            return 0;
        }
        return o0000Oo(i, p71Var, u71Var);
    }

    @Override // com.cmaster.cloner.i71
    public int o00ooo(int i, p71 p71Var, u71 u71Var) {
        if (this.OooOOOo == 1) {
            return 0;
        }
        return o0000Oo(i, p71Var, u71Var);
    }

    @Override // com.cmaster.cloner.i71
    public final void o0O0O00(RecyclerView recyclerView, int i) {
        um0 um0Var = new um0(recyclerView.getContext());
        um0Var.OooO00o = i;
        o000OOo(um0Var);
    }

    @Override // com.cmaster.cloner.i71
    public final boolean o0OO00O() {
        if (this.OooOOO0 != 1073741824 && this.OooOO0o != 1073741824) {
            int iOooOo0O = OooOo0O();
            for (int i = 0; i < iOooOo0O; i++) {
                ViewGroup.LayoutParams layoutParams = OooOo0(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.i71
    public boolean o0OoOo0(int i, Bundle bundle) {
        int iMin;
        if (super.o0OoOo0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.OooOOOo == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.OooO0O0;
                iMin = Math.min(i2, Oooo0O0(recyclerView.OooO0o, recyclerView.Oooooo0) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.OooO0O0;
                iMin = Math.min(i3, OooOo(recyclerView2.OooO0o, recyclerView2.Oooooo0) - 1);
            }
            if (iMin >= 0) {
                o0000OoO(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.i71
    public void oo000o(int i) {
        this.OooOo = i;
        this.OooOoO0 = Integer.MIN_VALUE;
        tm0 tm0Var = this.OooOoO;
        if (tm0Var != null) {
            tm0Var.OooO0Oo = -1;
        }
        o00o0O();
    }

    public LinearLayoutManager(int i) {
        this.OooOOOo = 1;
        this.OooOo00 = false;
        this.OooOo0 = false;
        this.OooOo0O = false;
        this.OooOo0o = true;
        this.OooOo = -1;
        this.OooOoO0 = Integer.MIN_VALUE;
        this.OooOoO = null;
        this.OooOoOO = new qm0();
        this.OooOoo0 = new rm0();
        this.OooOoo = 2;
        this.OooOooO = new int[2];
        o0000o0(1);
        OooO0OO(null);
        if (this.OooOo00) {
            this.OooOo00 = false;
            o00o0O();
        }
    }
}
