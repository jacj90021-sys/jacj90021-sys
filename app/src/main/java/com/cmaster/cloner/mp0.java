package com.cmaster.cloner;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class mp0 {
    public final LinkedHashMap OooO00o = new LinkedHashMap(100, 0.75f, true);
    public final long OooO0O0;
    public long OooO0OO;

    public mp0(long j) {
        this.OooO0O0 = j;
    }

    public final synchronized Object OooO00o(Object obj) {
        lp0 lp0Var;
        lp0Var = (lp0) this.OooO00o.get(obj);
        return lp0Var != null ? lp0Var.OooO00o : null;
    }

    public int OooO0O0(Object obj) {
        return 1;
    }

    public void OooO0OO(Object obj, Object obj2) {
    }

    public final synchronized Object OooO0Oo(Object obj, Object obj2) {
        int iOooO0O0 = OooO0O0(obj2);
        long j = iOooO0O0;
        if (j >= this.OooO0O0) {
            OooO0OO(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.OooO0OO += j;
        }
        lp0 lp0Var = (lp0) this.OooO00o.put(obj, obj2 == null ? null : new lp0(obj2, iOooO0O0));
        if (lp0Var != null) {
            this.OooO0OO -= lp0Var.OooO0O0;
            if (!lp0Var.OooO00o.equals(obj2)) {
                OooO0OO(obj, lp0Var.OooO00o);
            }
        }
        OooO0o0(this.OooO0O0);
        return lp0Var != null ? lp0Var.OooO00o : null;
    }

    public final synchronized void OooO0o0(long j) {
        while (this.OooO0OO > j) {
            Iterator it = this.OooO00o.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            lp0 lp0Var = (lp0) entry.getValue();
            this.OooO0OO -= lp0Var.OooO0O0;
            Object key = entry.getKey();
            it.remove();
            OooO0OO(key, lp0Var.OooO00o);
        }
    }
}
