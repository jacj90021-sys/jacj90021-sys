package com.cmaster.cloner;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class v41 {
    public static final SparseArray OooO00o = new SparseArray();
    public static final HashMap OooO0O0;

    static {
        HashMap map = new HashMap();
        OooO0O0 = map;
        map.put(s41.OooO0Oo, 0);
        map.put(s41.OooO0o0, 1);
        map.put(s41.OooO0o, 2);
        for (s41 s41Var : map.keySet()) {
            OooO00o.append(((Integer) OooO0O0.get(s41Var)).intValue(), s41Var);
        }
    }

    public static int OooO00o(s41 s41Var) {
        Integer num = (Integer) OooO0O0.get(s41Var);
        if (num != null) {
            return num.intValue();
        }
        ra.OooO0o0(s41Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static s41 OooO0O0(int i) {
        s41 s41Var = (s41) OooO00o.get(i);
        if (s41Var != null) {
            return s41Var;
        }
        ra.OooOOO(px0.OooOOO(i, "Unknown Priority for value "));
        return null;
    }
}
