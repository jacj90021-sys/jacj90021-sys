package com.bumptech.mobile.recyclerview.sticky;

import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cmaster.cloner.a71;
import com.cmaster.cloner.cj1;
import com.cmaster.cloner.p71;
import com.cmaster.cloner.u71;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class StickyHeadersLinearLayoutManager<T extends a71> extends LinearLayoutManager {
    public int OooOooo;
    public int Oooo000;
    public int Oooo00O;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.t71
    public final PointF OooO00o(int i) {
        o0000oOo();
        PointF pointFOooO00o = super.OooO00o(i);
        o0000oOO();
        return pointFOooO00o;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int OooOO0(u71 u71Var) {
        o0000oOo();
        int iO000000o = o000000o(u71Var);
        o0000oOO();
        return iO000000o;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int OooOO0O(u71 u71Var) {
        o0000oOo();
        int iO00000 = o00000(u71Var);
        o0000oOO();
        return iO00000;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int OooOO0o(u71 u71Var) {
        o0000oOo();
        int iO00000O0 = o00000O0(u71Var);
        o0000oOO();
        return iO00000O0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int OooOOO(u71 u71Var) {
        o0000oOo();
        int iO00000 = o00000(u71Var);
        o0000oOO();
        return iO00000;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int OooOOO0(u71 u71Var) {
        o0000oOo();
        int iO000000o = o000000o(u71Var);
        o0000oOO();
        return iO000000o;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int OooOOOO(u71 u71Var) {
        o0000oOo();
        int iO00000O0 = o00000O0(u71Var);
        o0000oOO();
        return iO00000O0;
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooO(RecyclerView recyclerView) {
        recyclerView.getAdapter();
        throw null;
    }

    @Override // com.cmaster.cloner.i71
    public final void OoooO0O(a71 a71Var) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final void OooooOo(p71 p71Var, u71 u71Var) {
        o0000oOo();
        super.OooooOo(p71Var, u71Var);
        o0000oOO();
        if (!u71Var.OooO0oO) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final void Oooooo(Parcelable parcelable) {
        if (parcelable instanceof cj1) {
            cj1 cj1Var = (cj1) parcelable;
            this.OooOooo = cj1Var.OooO0o0;
            this.Oooo000 = cj1Var.OooO0o;
            parcelable = cj1Var.OooO0Oo;
        }
        super.Oooooo(parcelable);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final Parcelable OoooooO() {
        cj1 cj1Var = new cj1();
        cj1Var.OooO0Oo = super.OoooooO();
        cj1Var.OooO0o0 = this.OooOooo;
        cj1Var.OooO0o = this.Oooo000;
        return cj1Var;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int o00000oO() {
        o0000oOo();
        int iO00000oO = super.o00000oO();
        o0000oOO();
        return iO00000oO;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int o00000oo() {
        o0000oOo();
        int iO00000oo = super.o00000oo();
        o0000oOO();
        return iO00000oo;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o0000OoO(int i, int i2) {
        this.OooOooo = -1;
        this.Oooo000 = Integer.MIN_VALUE;
        throw null;
    }

    public final void o0000oOO() {
        this.Oooo00O++;
    }

    public final void o0000oOo() {
        this.Oooo00O--;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final View o000oOoO(View view, int i, p71 p71Var, u71 u71Var) {
        o0000oOo();
        View viewO000oOoO = super.o000oOoO(view, i, p71Var, u71Var);
        o0000oOO();
        return viewO000oOoO;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int o00oO0o(int i, p71 p71Var, u71 u71Var) {
        o0000oOo();
        int iO00oO0o = super.o00oO0o(i, p71Var, u71Var);
        o0000oOO();
        if (iO00oO0o == 0) {
            return iO00oO0o;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final int o00ooo(int i, p71 p71Var, u71 u71Var) {
        o0000oOo();
        int iO00ooo = super.o00ooo(i, p71Var, u71Var);
        o0000oOO();
        if (iO00ooo == 0) {
            return iO00ooo;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.cmaster.cloner.i71
    public final void oo000o(int i) {
        o0000OoO(i, Integer.MIN_VALUE);
        throw null;
    }
}
