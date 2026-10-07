package com.cmaster.cloner;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wz2 implements sz2 {
    public final ArrayList OooO00o;

    public wz2(Context context, pz2 pz2Var) {
        ArrayList arrayList = new ArrayList();
        this.OooO00o = arrayList;
        arrayList.add(new k03(context, pz2Var));
    }

    @Override // com.cmaster.cloner.sz2
    public final void OooO00o(er1 er1Var) {
        ArrayList arrayList = this.OooO00o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((sz2) obj).OooO00o(er1Var);
        }
    }
}
