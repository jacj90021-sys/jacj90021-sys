package com.cmaster.cloner;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class qd1 {
    public static final String OooO00o = ep0.OooO("Schedulers");

    public static void OooO00o(xf1 xf1Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        o0O00000 o0o00000OooOo0o = workDatabase.OooOo0o();
        workDatabase.OooO0OO();
        try {
            ArrayList arrayListOooO0O0 = o0o00000OooOo0o.OooO0O0(xf1Var.OooO0OO);
            ArrayList arrayListOooO00o = o0o00000OooOo0o.OooO00o();
            if (arrayListOooO0O0.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int size = arrayListOooO0O0.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListOooO0O0.get(i);
                    i++;
                    o0o00000OooOo0o.OooO(((w02) obj).OooO00o, jCurrentTimeMillis);
                }
            }
            workDatabase.OooOOo0();
            workDatabase.OooOOO();
            if (arrayListOooO0O0.size() > 0) {
                w02[] w02VarArr = (w02[]) arrayListOooO0O0.toArray(new w02[arrayListOooO0O0.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    od1 od1Var = (od1) it.next();
                    if (od1Var.OooO00o()) {
                        od1Var.OooO0o0(w02VarArr);
                    }
                }
            }
            if (arrayListOooO00o.size() > 0) {
                w02[] w02VarArr2 = (w02[]) arrayListOooO00o.toArray(new w02[arrayListOooO00o.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    od1 od1Var2 = (od1) it2.next();
                    if (!od1Var2.OooO00o()) {
                        od1Var2.OooO0o0(w02VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.OooOOO();
            throw th;
        }
    }
}
