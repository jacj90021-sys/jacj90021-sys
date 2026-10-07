package com.cmaster.cloner;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class d0 implements j0, DialogInterface.OnClickListener {
    public oOo0000O OooO0Oo;
    public CharSequence OooO0o;
    public e0 OooO0o0;
    public final /* synthetic */ k0 OooO0oO;

    public d0(k0 k0Var) {
        this.OooO0oO = k0Var;
    }

    @Override // com.cmaster.cloner.j0
    public final boolean OooO00o() {
        oOo0000O ooo0000o = this.OooO0Oo;
        if (ooo0000o != null) {
            return ooo0000o.isShowing();
        }
        return false;
    }

    @Override // com.cmaster.cloner.j0
    public final int OooO0O0() {
        return 0;
    }

    @Override // com.cmaster.cloner.j0
    public final void OooO0OO(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // com.cmaster.cloner.j0
    public final CharSequence OooO0Oo() {
        return this.OooO0o;
    }

    @Override // com.cmaster.cloner.j0
    public final void OooO0o(CharSequence charSequence) {
        this.OooO0o = charSequence;
    }

    @Override // com.cmaster.cloner.j0
    public final Drawable OooO0o0() {
        return null;
    }

    @Override // com.cmaster.cloner.j0
    public final void OooO0oO(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // com.cmaster.cloner.j0
    public final void OooO0oo(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // com.cmaster.cloner.j0
    public final void OooOO0(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // com.cmaster.cloner.j0
    public final int OooOOO() {
        return 0;
    }

    @Override // com.cmaster.cloner.j0
    public final void OooOOO0(int i, int i2) {
        if (this.OooO0o0 == null) {
            return;
        }
        k0 k0Var = this.OooO0oO;
        oOo000Oo ooo000oo = new oOo000Oo(k0Var.getPopupContext());
        oO00o0 oo00o0 = (oO00o0) ooo000oo.OooO0o0;
        CharSequence charSequence = this.OooO0o;
        if (charSequence != null) {
            oo00o0.OooO0Oo = charSequence;
        }
        e0 e0Var = this.OooO0o0;
        int selectedItemPosition = k0Var.getSelectedItemPosition();
        oo00o0.OooOOOo = e0Var;
        oo00o0.OooOOo0 = this;
        oo00o0.OooOo0O = selectedItemPosition;
        oo00o0.OooOo0 = true;
        oOo0000O ooo0000oOooO0OO = ooo000oo.OooO0OO();
        this.OooO0Oo = ooo0000oOooO0OO;
        AlertController$RecycleListView alertController$RecycleListView = ooo0000oOooO0OO.OooO.OooO0o;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.OooO0Oo.show();
    }

    @Override // com.cmaster.cloner.j0
    public final void OooOOOO(ListAdapter listAdapter) {
        this.OooO0o0 = (e0) listAdapter;
    }

    @Override // com.cmaster.cloner.j0
    public final void dismiss() {
        oOo0000O ooo0000o = this.OooO0Oo;
        if (ooo0000o != null) {
            ooo0000o.dismiss();
            this.OooO0Oo = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        k0 k0Var = this.OooO0oO;
        k0Var.setSelection(i);
        if (k0Var.getOnItemClickListener() != null) {
            k0Var.performItemClick(null, i, this.OooO0o0.getItemId(i));
        }
        dismiss();
    }
}
