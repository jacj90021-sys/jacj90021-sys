package com.cmaster.cloner;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class uw extends DialogFragment {
    public Dialog OooO0Oo;
    public AlertDialog OooO0o;
    public DialogInterface.OnCancelListener OooO0o0;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.OooO0o0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.OooO0Oo;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.OooO0o == null) {
            Activity activity = getActivity();
            by2.OooO0oo(activity);
            this.OooO0o = new AlertDialog.Builder(activity).create();
        }
        return this.OooO0o;
    }
}
