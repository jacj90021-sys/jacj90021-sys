package com.cmaster.cloner;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ma2 extends ia2 implements Serializable {
    public final transient fc2 OooO0oO;
    public transient int OooO0oo;

    public ma2() {
        fc2 fc2Var = new fc2();
        if (fc2Var.isEmpty()) {
            this.OooO0oO = fc2Var;
        } else {
            qa.OooOO0();
            throw null;
        }
    }

    public final void OooO0OO() {
        fc2 fc2Var = this.OooO0oO;
        Iterator it = fc2Var.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        fc2Var.clear();
        this.OooO0oo = 0;
    }

    public final boolean OooO0Oo(Object obj, Object obj2) {
        fc2 fc2Var = this.OooO0oO;
        Collection collection = (Collection) fc2Var.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.OooO0oo++;
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        if (!arrayList.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.OooO0oo++;
        fc2Var.put(obj, arrayList);
        return true;
    }
}
