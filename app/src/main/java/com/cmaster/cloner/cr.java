package com.cmaster.cloner;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cr implements DialogInterface.OnDismissListener {
    public final /* synthetic */ er OooO0Oo;

    public cr(er erVar) {
        this.OooO0Oo = erVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        er erVar = this.OooO0Oo;
        Dialog dialog = erVar.OoooooO;
        if (dialog != null) {
            erVar.onDismiss(dialog);
        }
    }
}
