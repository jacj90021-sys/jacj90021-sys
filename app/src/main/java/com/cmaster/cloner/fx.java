package com.cmaster.cloner;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fx implements c02 {
    public static final fx OooO0O0 = new fx();
    public final SparseArray OooO00o;

    public fx() {
        SparseArray sparseArray = new SparseArray();
        this.OooO00o = sparseArray;
        h01 h01Var = h01.OooO0OO;
        sparseArray.put(1, h01Var);
        sparseArray.put(2, h01Var);
        sparseArray.put(3, h01Var);
        sparseArray.put(4, new io1());
        sparseArray.put(5, h01Var);
        sparseArray.put(6, h01Var);
    }

    @Override // com.cmaster.cloner.c02
    public final Bundle OooO00o(Context context, int i, Bundle bundle) {
        c02 c02Var;
        synchronized (this.OooO00o) {
            c02Var = (c02) this.OooO00o.get(i);
        }
        return c02Var != null ? c02Var.OooO00o(context, i, bundle) : Bundle.EMPTY;
    }
}
