package com.cmaster.cloner;

import android.util.SparseArray;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o71 {
    public SparseArray OooO00o;
    public int OooO0O0;
    public Set OooO0OO;

    public final n71 OooO00o(int i) {
        SparseArray sparseArray = this.OooO00o;
        n71 n71Var = (n71) sparseArray.get(i);
        if (n71Var != null) {
            return n71Var;
        }
        n71 n71Var2 = new n71();
        sparseArray.put(i, n71Var2);
        return n71Var2;
    }
}
