package com.cmaster.cloner;

import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fq implements View.OnClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ gq OooO0o0;

    public /* synthetic */ fq(gq gqVar, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = gqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.OooO0Oo;
        gq gqVar = this.OooO0o0;
        switch (i) {
            case 0:
                gqVar.OoooOo0(view.getId());
                break;
            case 1:
                gqVar.OoooOo0(view.getId());
                break;
            case 2:
                gqVar.Ooooo00.OooO0oO(gqVar.OooooOO, gqVar.OooooO0);
                break;
            default:
                kq kqVar = gqVar.Ooooo00;
                String str = gqVar.OooooO0;
                int i2 = gqVar.OooooOO;
                if (kqVar.OooOOo0 != null) {
                    kqVar.OooO.OooO0Oo(false);
                    kqVar.OooO0o.OooO0Oo(kqVar.OooOOo0.OooO00o());
                    kqVar.OooOOO0.OooO0Oo(Build.BRAND);
                    kqVar.OooOO0o.OooO0Oo(Build.DEVICE);
                    kqVar.OooOO0O.OooO0Oo(Build.PRODUCT);
                    kqVar.OooOOO.OooO0Oo(Build.MODEL);
                    kqVar.OooO0oO(i2, str);
                    break;
                }
                break;
        }
    }
}
