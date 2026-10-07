package com.cmaster.cloner;

import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bv1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ bv1(Object obj, Object obj2, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.OooO0Oo;
        Object obj = this.OooO0o;
        Object obj2 = this.OooO0o0;
        switch (i2) {
            case 0:
                m1 m1VarOoooOOO = ((g80) obj2).OoooOOO();
                wu1 wu1Var = (wu1) obj;
                String str = wu1Var.OooO0o0;
                int i3 = wu1Var.OooOOO;
                sn2.OooO00o("NYPfKfHZSOIkj9k=\n", "ReK8QpC+Law=\n");
                str.getClass();
                if (m1VarOoooOOO != null) {
                    m1VarOoooOOO.OooOo0(new a80(i3, 0, str));
                    break;
                }
                break;
            default:
                a73 a73Var = ya3.OooOooO.OooO0OO;
                a73.OooOOo0(((c62) obj2).OooO00o, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", (String) obj), "Share via"));
                break;
        }
    }
}
