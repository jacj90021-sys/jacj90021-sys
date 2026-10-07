package com.cmaster.cloner;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m62 implements Runnable {
    public final /* synthetic */ Context OooO0Oo;
    public final /* synthetic */ boolean OooO0o;
    public final /* synthetic */ String OooO0o0;
    public final /* synthetic */ boolean OooO0oO;

    public m62(pb1 pb1Var, Context context, String str, boolean z, boolean z2) {
        this.OooO0Oo = context;
        this.OooO0o0 = str;
        this.OooO0o = z;
        this.OooO0oO = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a73 a73Var = ya3.OooOooO.OooO0OO;
        Context context = this.OooO0Oo;
        AlertDialog.Builder builderOooOO0 = a73.OooOO0(context);
        builderOooOO0.setMessage(this.OooO0o0);
        if (this.OooO0o) {
            builderOooOO0.setTitle("Error");
        } else {
            builderOooOO0.setTitle("Info");
        }
        if (this.OooO0oO) {
            builderOooOO0.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderOooOO0.setPositiveButton("Learn More", new jn0(this, context));
            builderOooOO0.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderOooOO0.create().show();
    }
}
