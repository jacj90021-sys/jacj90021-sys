package com.cmaster.cloner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f91 {
    public static final x9 OooO0O0 = new x9(1);
    public final HashMap OooO00o;

    public f91(Set set) {
        this.OooO00o = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e91 e91Var = (e91) it.next();
            HashMap map = this.OooO00o;
            e91Var.getClass();
            map.put(yl.class, e91Var.OooO00o);
        }
    }

    public f91(int i) {
        switch (i) {
            case 2:
                this.OooO00o = new HashMap();
                new HashMap();
                break;
            default:
                this.OooO00o = new HashMap();
                break;
        }
    }
}
