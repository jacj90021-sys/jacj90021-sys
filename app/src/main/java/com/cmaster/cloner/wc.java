package com.cmaster.cloner;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class wc implements DialogInterface.OnClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ wc(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int[] iArrOooOo;
        int i2 = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i2) {
            case 0:
                ((xc) obj).OooO0OO.dismiss();
                break;
            default:
                g80 g80Var = (g80) obj;
                try {
                    iArrOooOo = a02.OooO0oo.OooOo(null);
                } catch (Exception unused) {
                    iArrOooOo = new int[0];
                }
                if (iArrOooOo != null) {
                    for (int i3 : iArrOooOo) {
                        m1 m1VarOoooOOO = g80Var.OoooOOO();
                        String strOooO00o = sn2.OooO00o("WludrpGAc4NVUd7hmItui1BQ3uebnA==\n", "OTTwgPbvHOQ=\n");
                        sn2.OooO00o("NYPfKfHZSOIkj9k=\n", "ReK8QpC+Law=\n");
                        if (m1VarOoooOOO != null) {
                            m1VarOoooOOO.OooOo0(new a80(i3, 0, strOooO00o));
                        }
                    }
                    break;
                }
                break;
        }
    }
}
