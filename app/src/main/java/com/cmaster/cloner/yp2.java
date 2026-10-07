package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class yp2 {
    public static void OooO00o(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            vf vfVar = (vf) obj;
            tm tmVar = new tm(vfVar);
            for (Class cls : vfVar.OooO00o) {
                boolean z = vfVar.OooO0OO == 0;
                um umVar = new um(cls, !z);
                if (!map.containsKey(umVar)) {
                    map.put(umVar, new HashSet());
                }
                Set set = (Set) map.get(umVar);
                if (!set.isEmpty() && z) {
                    sa.OooO0o(cls, "Multiple components provide ", ".");
                    return;
                }
                set.add(tmVar);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (tm tmVar2 : (Set) it.next()) {
                for (pp ppVar : tmVar2.OooO00o.OooO0O0) {
                    if (ppVar.OooO0OO == 0) {
                        Set<tm> set2 = (Set) map.get(new um(ppVar.OooO00o, ppVar.OooO0O0 == 2));
                        if (set2 != null) {
                            for (tm tmVar3 : set2) {
                                tmVar2.OooO0O0.add(tmVar3);
                                tmVar3.OooO0OO.add(tmVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            tm tmVar4 = (tm) it3.next();
            if (tmVar4.OooO0OO.isEmpty()) {
                hashSet2.add(tmVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            tm tmVar5 = (tm) hashSet2.iterator().next();
            hashSet2.remove(tmVar5);
            i++;
            Iterator it4 = tmVar5.OooO0O0.iterator();
            while (it4.hasNext()) {
                tm tmVar6 = (tm) it4.next();
                tmVar6.OooO0OO.remove(tmVar5);
                if (tmVar6.OooO0OO.isEmpty()) {
                    hashSet2.add(tmVar6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            tm tmVar7 = (tm) it5.next();
            if (!tmVar7.OooO0OO.isEmpty() && !tmVar7.OooO0O0.isEmpty()) {
                arrayList2.add(tmVar7.OooO00o);
            }
        }
        throw new rp("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
