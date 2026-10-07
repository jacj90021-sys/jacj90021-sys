package com.cmaster.cloner;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class li1 extends o00OO0O0 implements qs0 {
    public WeakReference OooO;
    public Context OooO0o;
    public ActionBarContextView OooO0oO;
    public o0O000O OooO0oo;
    public boolean OooOO0;
    public ss0 OooOO0O;

    @Override // com.cmaster.cloner.o00OO0O0
    public final boolean OooO() {
        return this.OooO0oO.OooOo0O;
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooO00o() {
        if (this.OooOO0) {
            return;
        }
        this.OooOO0 = true;
        this.OooO0oo.OoooO0O(this);
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
        return this.OooOO0O;
    }

    @Override // com.cmaster.cloner.qs0
    public final boolean OooO0Oo(ss0 ss0Var, MenuItem menuItem) {
        return ((ho1) this.OooO0oo.OooO0o0).Oooo00o(this, menuItem);
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final CharSequence OooO0o() {
        return this.OooO0oO.getSubtitle();
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final MenuInflater OooO0o0() {
        return new fk1(this.OooO0oO.getContext());
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final CharSequence OooO0oO() {
        return this.OooO0oO.getTitle();
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooO0oo() {
        this.OooO0oo.OoooO(this, this.OooOO0O);
    }

    @Override // com.cmaster.cloner.qs0
    public final void OooOO0(ss0 ss0Var) {
        OooO0oo();
        o00O0OOO o00o0ooo = this.OooO0oO.OooO0oO;
        if (o00o0ooo != null) {
            o00o0ooo.OooOO0o();
        }
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooOO0O(View view) {
        this.OooO0oO.setCustomView(view);
        this.OooO = view != null ? new WeakReference(view) : null;
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooOO0o(int i) {
        OooOOO0(this.OooO0o.getString(i));
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooOOO(int i) {
        OooOOOO(this.OooO0o.getString(i));
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooOOO0(CharSequence charSequence) {
        this.OooO0oO.setSubtitle(charSequence);
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooOOOO(CharSequence charSequence) {
        this.OooO0oO.setTitle(charSequence);
    }

    @Override // com.cmaster.cloner.o00OO0O0
    public final void OooOOOo(boolean z) {
        this.OooO0o0 = z;
        this.OooO0oO.setTitleOptional(z);
    }
}
