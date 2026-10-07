package com.cmaster.cloner;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ts0 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, ht0 {
    public vj1 OooO0Oo;
    public bn0 OooO0o;
    public oOo0000O OooO0o0;

    @Override // com.cmaster.cloner.ht0
    public final void OooO0OO(ss0 ss0Var, boolean z) {
        oOo0000O ooo0000o;
        if ((z || ss0Var == this.OooO0Oo) && (ooo0000o = this.OooO0o0) != null) {
            ooo0000o.dismiss();
        }
    }

    @Override // com.cmaster.cloner.ht0
    public final boolean OooOOOO(ss0 ss0Var) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        vj1 vj1Var = this.OooO0Oo;
        bn0 bn0Var = this.OooO0o;
        if (bn0Var.OooO == null) {
            bn0Var.OooO = new an0(bn0Var);
        }
        vj1Var.OooOOo0(bn0Var.OooO.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.OooO0o.OooO0OO(this.OooO0Oo, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        vj1 vj1Var = this.OooO0Oo;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.OooO0o0.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.OooO0o0.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                vj1Var.OooO0OO(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return vj1Var.performShortcut(i, keyEvent, 0);
    }
}
