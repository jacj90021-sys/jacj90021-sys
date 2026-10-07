package com.cmaster.cloner;

import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOo000o0 extends eb1 implements cm0, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnCancelListener, DialogInterface.OnShowListener {
    public final oO0Ooooo OooOOo;
    public final oOo0000O OooOOo0;
    public final hm0 OooOOoo;

    public oOo000o0(oO0Ooooo oo0ooooo) {
        hm0 hm0Var = (hm0) oo0ooooo.OooOO0;
        this.OooOOoo = hm0Var;
        this.OooOOo = oo0ooooo;
        zp0 zp0Var = new zp0((Context) oo0ooooo.OooO0o0);
        String str = (String) oo0ooooo.OooO0o;
        Object obj = zp0Var.OooO0o0;
        if (str != null) {
            ((oO00o0) obj).OooO0o = str;
        }
        CharSequence charSequence = (CharSequence) oo0ooooo.OooO0oo;
        if (charSequence != null) {
            zp0Var.OooO0Oo(charSequence, this);
        }
        CharSequence charSequence2 = (CharSequence) oo0ooooo.OooO0oO;
        if (charSequence2 != null) {
            zp0Var.OooO0o0(charSequence2, this);
        }
        CharSequence charSequence3 = (CharSequence) oo0ooooo.OooO;
        if (charSequence3 != null) {
            oO00o0 oo00o0 = (oO00o0) obj;
            oo00o0.OooOO0O = charSequence3;
            oo00o0.OooOO0o = this;
        }
        ((oO00o0) obj).OooOOO0 = true;
        this.OooOOo0 = zp0Var.OooO0OO();
        hm0Var.OooO0o().OooO0OO(this);
    }

    @Override // com.cmaster.cloner.cm0
    public final void OooO0o(hm0 hm0Var, wl0 wl0Var) {
        if (wl0Var == wl0.ON_DESTROY) {
            oOo0000O ooo0000o = this.OooOOo0;
            if (ooo0000o.isShowing()) {
                ooo0000o.dismiss();
            }
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        onClick(dialogInterface, -3);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Integer numValueOf = Integer.valueOf(i);
        if (h1.OooO0O0()) {
            OooOO0o(numValueOf);
        } else {
            OooOO0(numValueOf);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        hm0 hm0Var = this.OooOOoo;
        if (hm0Var != null) {
            hm0Var.OooO0o().OooOOOO(this);
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        oO0Ooooo oo0ooooo = this.OooOOo;
        if (oo0ooooo == null) {
            return;
        }
        oo0ooooo.getClass();
        oo0ooooo.getClass();
    }
}
