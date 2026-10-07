package com.cmaster.cloner;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hv0 extends yz0 {

    public hv0(java.util.TreeMap treeMap) {
        super(treeMap);
    }
    public final void OooO0O0(u4 u4Var, Object obj) {
        TreeMap treeMap = this.OooO00o;
        Map map = (Map) treeMap.get(u4Var);
        wg wgVar = wg.OooO0Oo;
        if (map != null) {
            Objects.equals(map.get((wg) Collections.min(map.keySet())), obj);
            map.put(wgVar, obj);
        } else {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(u4Var, arrayMap);
            arrayMap.put(wgVar, obj);
        }
    }
}
