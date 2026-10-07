package com.cmaster.cloner;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ar extends eb1 implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        OooOO0o(-3);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        OooOO0o(Integer.valueOf(i));
    }
}
