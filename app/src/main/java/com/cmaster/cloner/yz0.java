package com.cmaster.cloner;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class yz0 {
    public static final jg OooO0O0;
    public final TreeMap OooO00o;

    static {
        jg jgVar = new jg(2);
        OooO0O0 = jgVar;
        new TreeMap(jgVar);
    }

    public yz0(TreeMap treeMap) {
        this.OooO00o = treeMap;
    }

    public final Object OooO00o(u4 u4Var) {
        Map map = (Map) this.OooO00o.get(u4Var);
        if (map != null) {
            return map.get((wg) Collections.min(map.keySet()));
        }
        sa.OooOO0o(u4Var, "Option does not exist: ");
        return null;
    }
}
