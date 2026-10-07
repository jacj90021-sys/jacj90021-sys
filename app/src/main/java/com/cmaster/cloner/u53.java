package com.cmaster.cloner;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class u53 {
    public static boolean OooO00o(String str) {
        oOO00OO ooo00oo = hy1.OooO00o;
        Set<ooooO000> setUnmodifiableSet = Collections.unmodifiableSet(ooooO000.OooO0OO);
        HashSet hashSet = new HashSet();
        for (ooooO000 ooooo000 : setUnmodifiableSet) {
            if (ooooo000.OooO00o.equals(str)) {
                hashSet.add(ooooo000);
            }
        }
        if (hashSet.isEmpty()) {
            ra.OooOOO0("Unknown feature ".concat(str));
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ooooO000 ooooo0002 = (ooooO000) it.next();
            if (ooooo0002.OooO00o() || ooooo0002.OooO0O0()) {
                return true;
            }
        }
        return false;
    }
}
