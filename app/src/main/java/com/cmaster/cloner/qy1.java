package com.cmaster.cloner;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qy1 extends o00OO0O0 implements qs0 {
    public WeakReference OooO;
    public final Context OooO0o;
    public final ss0 OooO0oO;
    public o0O000O OooO0oo;
    public final /* synthetic */ ry1 OooOO0;

    public qy1(ry1 ry1Var, Context context, o0O000O o0o000o) {
        this.OooOO0 = ry1Var;
        this.OooO0o = context;
        this.OooO0oo = o0o000o;
        ss0 ss0Var = new ss0(context);
        ss0Var.OooOOOO = 1;
        this.OooO0oO = ss0Var;
        ss0Var.OooO0oo = this;
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final boolean OooO() {
        return this.OooOO0.OooO0o.OooOo0O;
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooO00o() {
        ry1 ry1Var = this.OooOO0;
        if (ry1Var.OooO != this) {
            return;
        }
        if (ry1Var.OooOOOo) {
            ry1Var.OooOO0 = this;
            ry1Var.OooOO0O = this.OooO0oo;
        } else {
            this.OooO0oo.OoooO0O(this);
        }
        this.OooO0oo = null;
        ry1Var.OooOOo(false);
        ActionBarContextView actionBarContextView = ry1Var.OooO0o;
        if (actionBarContextView.OooOOO == null) {
            actionBarContextView.OooO0o0();
        }
        ry1Var.OooO0OO.setHideOnContentScrollEnabled(ry1Var.OooOo0);
        ry1Var.OooO = null;
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final View OooO0O0() {
        WeakReference weakReference = this.OooO;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final ss0 OooO0OO() {
        return this.OooO0oO;
    }

    @Override // com.cmaster.cloner.qs0
    public final boolean OooO0Oo(ss0 ss0Var, MenuItem menuItem) {
        o0O000O o0o000o = this.OooO0oo;
        if (o0o000o != null) {
            return ((ho1) o0o000o.OooO0o0).Oooo00o(this, menuItem);
        }
        return false;
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final CharSequence OooO0o() {
        return this.OooOO0.OooO0o.getSubtitle();
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final MenuInflater OooO0o0() {
        return new fk1(this.OooO0o);
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final CharSequence OooO0oO() {
        return this.OooOO0.OooO0o.getTitle();
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooO0oo() {
        if (this.OooOO0.OooO != this) {
            return;
        }
        ss0 ss0Var = this.OooO0oO;
        ss0Var.OooOo0o();
        try {
            this.OooO0oo.OoooO(this, ss0Var);
        } finally {
            ss0Var.OooOo0O();
        }
    }

    @Override // com.cmaster.cloner.qs0
    public final void OooOO0(ss0 ss0Var) {
        if (this.OooO0oo == null) {
            return;
        }
        OooO0oo();
        o00O0OOO o00o0ooo = this.OooOO0.OooO0o.OooO0oO;
        if (o00o0ooo != null) {
            o00o0ooo.OooOO0o();
        }
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooOO0O(View view) {
        this.OooOO0.OooO0o.setCustomView(view);
        this.OooO = new WeakReference(view);
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooOO0o(int i) {
        OooOOO0(this.OooOO0.OooO00o.getResources().getString(i));
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooOOO(int i) {
        OooOOOO(this.OooOO0.OooO00o.getResources().getString(i));
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooOOO0(CharSequence charSequence) {
        this.OooOO0.OooO0o.setSubtitle(charSequence);
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooOOOO(CharSequence charSequence) {
        this.OooOO0.OooO0o.setTitle(charSequence);
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooOOOo(boolean z) {
        this.OooO0o0 = z;
        this.OooOO0.OooO0o.setTitleOptional(z);
    }
}
