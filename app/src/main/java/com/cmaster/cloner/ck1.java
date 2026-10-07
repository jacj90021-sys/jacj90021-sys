package com.cmaster.cloner;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ck1 extends er {
    public Dialog o00Oo0;
    public DialogInterface.OnCancelListener o00Ooo;
    public AlertDialog o00o0O;

    @Override // com.cmaster.cloner.er
    public final Dialog OoooOOO() {
        Dialog dialog = this.o00Oo0;
        if (dialog != null) {
            return dialog;
        }
        this.OooooOO = false;
        if (this.o00o0O == null) {
            Context contextOooOO0 = OooOO0();
            by2.OooO0oo(contextOooOO0);
            this.o00o0O = new AlertDialog.Builder(contextOooOO0).create();
        }
        return this.o00o0O;
    }

    @Override // com.cmaster.cloner.er, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.o00Ooo;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
