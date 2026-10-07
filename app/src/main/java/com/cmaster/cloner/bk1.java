package com.cmaster.cloner;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bk1 extends ActionMode {
    public final Context OooO00o;
    public final o00OO0O0 OooO0O0;

    public bk1(Context context, o00OO0O0 o00oo0o0) {
        this.OooO00o = context;
        this.OooO0O0 = o00oo0o0;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.OooO0O0.OooO00o();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.OooO0O0.OooO0O0();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new lt0(this.OooO00o, this.OooO0O0.OooO0OO());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.OooO0O0.OooO0o0();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.OooO0O0.OooO0o();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.OooO0O0.OooO0Oo;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.OooO0O0.OooO0oO();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.OooO0O0.OooO0o0;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.OooO0O0.OooO0oo();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.OooO0O0.OooO();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.OooO0O0.OooOO0O(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.OooO0O0.OooOOO0(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.OooO0O0.OooO0Oo = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.OooO0O0.OooOOOO(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.OooO0O0.OooOOOo(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.OooO0O0.OooOO0o(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.OooO0O0.OooOOO(i);
    }
}
