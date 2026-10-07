package com.cmaster.cloner;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ec3 implements dc3 {
    public final ArrayList OooO00o;

    public ec3(Context context, cc3 cc3Var) {
        ArrayList arrayList = new ArrayList();
        this.OooO00o = arrayList;
        arrayList.add(new jc3(context, cc3Var));
    }

    @Override // com.cmaster.cloner.dc3
    public final void OooO00o(o00Oo00 o00oo00) {
        ArrayList arrayList = this.OooO00o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((dc3) obj).OooO00o(o00oo00);
        }
    }
}
