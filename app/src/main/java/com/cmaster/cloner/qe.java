package com.cmaster.cloner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class qe extends a71 {
    public static final c2 OooOO0 = new c2(5);
    public re OooO;
    public final o0O000O OooO0Oo;
    public boolean OooO0o;
    public ez0 OooO0o0;
    public LayoutInflater OooO0oO;
    public final o81 OooO0oo;

    public qe(re reVar, o0O000O o0o000o) {
        this.OooO0o = false;
        this.OooO0Oo = o0o000o;
        this.OooO = reVar;
        o81 o81Var = new o81(this);
        this.OooO0oo = o81Var;
        reVar.getClass();
        if (!h1.OooO0O0()) {
            qa.OooO0o("must be main thread");
            throw null;
        }
        reVar.OooO0Oo.OooO00o.add(o81Var);
        o81Var.OooO0O0.add(reVar);
    }

    @Override // com.cmaster.cloner.a71
    public final void OooO(y71 y71Var) {
        this.OooO0Oo.Oooo0O0(((xj0) y71Var).OooO0o);
    }

    @Override // com.cmaster.cloner.a71
    public final int OooO00o() {
        return this.OooO.OooO0o0.OooO0o.size();
    }

    @Override // com.cmaster.cloner.a71
    public final int OooO0OO(int i) {
        return this.OooO0Oo.OooOoo(i, OooOOO0(i));
    }

    @Override // com.cmaster.cloner.a71
    public final void OooO0Oo(RecyclerView recyclerView) {
        this.OooO0oO = LayoutInflater.from(recyclerView.getContext());
    }

    @Override // com.cmaster.cloner.a71
    public final void OooO0o(y71 y71Var, int i, List list) {
        xj0 xj0Var = (xj0) y71Var;
        c2 c2VarOooo0O0 = this.OooO0Oo.Oooo0O0(xj0Var.OooO0o);
        if (c2VarOooo0O0 == null) {
            c2VarOooo0O0 = OooOO0;
        }
        xj0Var.OooOo0O = OooOOO0(i);
        c2VarOooo0O0.OooO0O0(xj0Var);
    }

    @Override // com.cmaster.cloner.a71
    public final void OooO0o0(y71 y71Var, int i) {
        throw new IllegalArgumentException("onBindViewHolder");
    }

    @Override // com.cmaster.cloner.a71
    public final y71 OooO0oO(ViewGroup viewGroup, int i) {
        c2 c2VarOooo0O0 = this.OooO0Oo.Oooo0O0(i);
        if (c2VarOooo0O0 == null) {
            c2VarOooo0O0 = OooOO0;
        }
        xj0 xj0VarOooO0OO = c2VarOooo0O0.OooO0OO(this, viewGroup);
        xj0VarOooO0OO.OooOo0 = this;
        View view = xj0VarOooO0OO.OooO00o;
        if (this.OooO0o) {
            view.setOnCreateContextMenuListener(c2VarOooo0O0);
            b81 b81Var = new b81(this, xj0VarOooO0OO);
            view.setOnClickListener(b81Var);
            view.setOnLongClickListener(b81Var);
        }
        return xj0VarOooO0OO;
    }

    @Override // com.cmaster.cloner.a71
    public final void OooO0oo() {
        this.OooO0oO = null;
    }

    @Override // com.cmaster.cloner.a71
    public final void OooOO0(y71 y71Var) {
        this.OooO0Oo.Oooo0O0(((xj0) y71Var).OooO0o);
    }

    @Override // com.cmaster.cloner.a71
    public final void OooOO0O(y71 y71Var) {
        this.OooO0Oo.Oooo0O0(((xj0) y71Var).OooO0o);
    }

    public final void OooOO0o(Class cls, c2 c2Var) {
        this.OooO0Oo.OooO0O0(cls, c2Var);
    }

    public String OooOOO(int i) {
        Object objOooOOO0 = OooOOO0(i);
        return objOooOOO0 instanceof qe ? ((qe) objOooOOO0).OooOOO(i) : "";
    }

    public final cc OooOOO0(int i) {
        sv svVar;
        re reVar = this.OooO;
        w3 w3Var = reVar.OooO0o0;
        return (w3Var.OooO0o.size() != 0 || (svVar = reVar.OooOO0O) == null) ? (cc) w3Var.OooO0o.get(i) : svVar;
    }

    public final void OooOOOO(List list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        re reVar = this.OooO;
        if (list == null) {
            reVar.getClass();
            list = Collections.EMPTY_LIST;
        }
        reVar.OooO0o = list;
        reVar.OooOO0++;
        reVar.OooO0O0(null);
    }

    public qe(o0O000O o0o000o) {
        this(new re(), o0o000o);
    }

    public qe() {
        this(new o0O000O(9));
    }
}
