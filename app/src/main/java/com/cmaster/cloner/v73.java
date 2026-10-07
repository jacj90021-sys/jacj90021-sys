package com.cmaster.cloner;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class v73 {
    public static int OooO00o(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static boolean OooO0O0(mg2 mg2Var, Collection collection) {
        collection.getClass();
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= mg2Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= mg2Var.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = mg2Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }
}
