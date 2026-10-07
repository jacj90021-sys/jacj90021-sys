package androidx.camera.camera2;

import android.util.ArrayMap;
import com.cmaster.cloner.ab;
import com.cmaster.cloner.ay1;
import com.cmaster.cloner.hv0;
import com.cmaster.cloner.jg;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.sa;
import com.cmaster.cloner.u4;
import com.cmaster.cloner.wg;
import com.cmaster.cloner.yz0;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class Camera2Config$DefaultProvider {
    public ab getCameraXConfig() {
        qa qaVar = new qa(0);
        ra raVar = new ra(0);
        sa saVar = new sa();
        hv0 hv0Var = (hv0) new ay1(12).OooO0o0;
        hv0Var.OooO0O0(ab.OooO0OO, qaVar);
        TreeMap treeMap = hv0Var.OooO00o;
        hv0Var.OooO0O0(ab.OooO0Oo, raVar);
        hv0Var.OooO0O0(ab.OooO0o0, saVar);
        jg jgVar = yz0.OooO0O0;
        if (!yz0.class.equals(hv0.class)) {
            TreeMap treeMap2 = new TreeMap(yz0.OooO0O0);
            for (u4 u4Var : Collections.unmodifiableSet(treeMap.keySet())) {
                Map map = (Map) treeMap.get(u4Var);
                Set<wg> setUnmodifiableSet = map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
                ArrayMap arrayMap = new ArrayMap();
                for (wg wgVar : setUnmodifiableSet) {
                    Map map2 = (Map) hv0Var.OooO00o.get(u4Var);
                    Object obj = null;
                    if (map2 == null) {
                        sa.OooOO0o(u4Var, "Option does not exist: ");
                    } else if (map2.containsKey(wgVar)) {
                        obj = map2.get(wgVar);
                    } else {
                        ra.OooO0oo("Option does not exist: ", u4Var, " with priority=", wgVar);
                    }
                    arrayMap.put(wgVar, obj);
                }
                treeMap2.put(u4Var, arrayMap);
            }
            new yz0(treeMap2);
        }
        return new ab();
    }
}
