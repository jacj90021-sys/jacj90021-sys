package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class cy0 {
    public static final Object OooO00o = new Object();
    public static final HashMap OooO0O0 = new HashMap();

    public static dy0 OooO00o(Class cls) {
        synchronized (OooO00o) {
            try {
                ArrayList arrayList = (ArrayList) OooO0O0.get(cls);
                if (arrayList == null || arrayList.isEmpty()) {
                    return null;
                }
                return (dy0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
