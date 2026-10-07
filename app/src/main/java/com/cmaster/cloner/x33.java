package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class x33 {
    public static final List OooO00o(rc1 rc1Var) {
        int iOooO00o = p03.OooO00o(rc1Var, "id");
        int iOooO00o2 = p03.OooO00o(rc1Var, "seq");
        int iOooO00o3 = p03.OooO00o(rc1Var, "from");
        int iOooO00o4 = p03.OooO00o(rc1Var, "to");
        zm0 zm0Var = new zm0(10);
        while (rc1Var.OooOOOo()) {
            zm0Var.add(new f10((int) rc1Var.getLong(iOooO00o), (int) rc1Var.getLong(iOooO00o2), rc1Var.OooOO0o(iOooO00o3), rc1Var.OooOO0o(iOooO00o4)));
        }
        return se.OooO0o(te.OooO00o(zm0Var));
    }

    public static final pl1 OooO0O0(mc1 mc1Var, String str, boolean z) throws Exception {
        rc1 rc1VarOooOOo0 = mc1Var.OooOOo0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iOooO00o = p03.OooO00o(rc1VarOooOOo0, "seqno");
            int iOooO00o2 = p03.OooO00o(rc1VarOooOOo0, "cid");
            int iOooO00o3 = p03.OooO00o(rc1VarOooOOo0, "name");
            int iOooO00o4 = p03.OooO00o(rc1VarOooOOo0, "desc");
            if (iOooO00o != -1 && iOooO00o2 != -1 && iOooO00o3 != -1 && iOooO00o4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (rc1VarOooOOo0.OooOOOo()) {
                    if (((int) rc1VarOooOOo0.getLong(iOooO00o2)) >= 0) {
                        int i = (int) rc1VarOooOOo0.getLong(iOooO00o);
                        String strOooOO0o = rc1VarOooOOo0.OooOO0o(iOooO00o3);
                        String str2 = rc1VarOooOOo0.getLong(iOooO00o4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strOooOO0o);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listOooO0oO = se.OooO0oO(new p12(7), linkedHashMap.entrySet());
                ArrayList arrayList = new ArrayList(listOooO0oO.size());
                Iterator it = listOooO0oO.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listOooO0oo = se.OooO0oo(arrayList);
                List listOooO0oO2 = se.OooO0oO(new p12(8), linkedHashMap2.entrySet());
                ArrayList arrayList2 = new ArrayList(listOooO0oO2.size());
                Iterator it2 = listOooO0oO2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                pl1 pl1Var = new pl1(str, z, listOooO0oo, se.OooO0oo(arrayList2));
                in2.OooO00o(rc1VarOooOOo0, null);
                return pl1Var;
            }
            in2.OooO00o(rc1VarOooOOo0, null);
            return null;
        } finally {
        }
    }
}
