package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class xp0 {
    public static int OooO00o(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map OooO0O0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return pv.OooO0Oo;
        }
        int i = 0;
        if (size == 1) {
            k21 k21Var = (k21) arrayList.get(0);
            k21Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(k21Var.OooO0Oo, k21Var.OooO0o0);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(OooO00o(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            k21 k21Var2 = (k21) obj;
            linkedHashMap.put(k21Var2.OooO0Oo, k21Var2.OooO0o0);
        }
        return linkedHashMap;
    }

    public static Map OooO0OO(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        int size = linkedHashMap.size();
        if (size == 0) {
            return pv.OooO0Oo;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
