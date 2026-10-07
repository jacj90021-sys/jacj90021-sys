package com.cmaster.cloner;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class br implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ br(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                er erVar = (er) obj;
                Dialog dialog = erVar.OoooooO;
                if (dialog != null) {
                    erVar.onCancel(dialog);
                    break;
                }
                break;
            default:
                ((c62) obj).OooO0O0();
                break;
        }
    }
}
