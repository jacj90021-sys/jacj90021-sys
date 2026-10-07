package com.cmaster.cloner;

import android.content.DialogInterface;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bv0 implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ cv0 OooO00o;

    public bv0(cv0 cv0Var) {
        this.OooO00o = cv0Var;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        cv0 cv0Var = this.OooO00o;
        HashSet hashSet = cv0Var.o0ooOOo;
        boolean z2 = cv0Var.o0ooOoO;
        if (z) {
            cv0Var.o0ooOoO = hashSet.add(cv0Var.o0Oo0oo[i].toString()) | z2;
        } else {
            cv0Var.o0ooOoO = hashSet.remove(cv0Var.o0Oo0oo[i].toString()) | z2;
        }
    }
}
