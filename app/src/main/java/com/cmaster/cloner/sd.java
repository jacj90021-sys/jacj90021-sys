package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sd {
    public final HashMap OooO00o = new HashMap();
    public final HashMap OooO0O0;

    public sd(HashMap map) {
        this.OooO0O0 = map;
        for (Map.Entry entry : map.entrySet()) {
            wl0 wl0Var = (wl0) entry.getValue();
            List arrayList = (List) this.OooO00o.get(wl0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.OooO00o.put(wl0Var, arrayList);
            }
            arrayList.add((td) entry.getKey());
        }
    }

    public static void OooO00o(List list, hm0 hm0Var, wl0 wl0Var, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                td tdVar = (td) list.get(size);
                Method method = tdVar.OooO0O0;
                try {
                    int i = tdVar.OooO00o;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, hm0Var);
                    } else if (i == 2) {
                        method.invoke(obj, hm0Var, wl0Var);
                    }
                } catch (IllegalAccessException e) {
                    sa.OooOO0(e);
                    return;
                } catch (InvocationTargetException e2) {
                    qa.OooO0oO("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
