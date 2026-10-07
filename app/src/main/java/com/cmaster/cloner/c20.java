package com.cmaster.cloner;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class c20 implements gd1 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ c20(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.cmaster.cloner.gd1
    public final Bundle OooO00o() {
        k21[] k21VarArr;
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                return ((k20) obj).OoooO0();
            default:
                yo yoVar = (yo) obj;
                for (Map.Entry entry : xp0.OooO0OO((LinkedHashMap) yoVar.OooO0oO).entrySet()) {
                    String str = (String) entry.getKey();
                    si1 si1Var = (si1) entry.getValue();
                    si1Var.getClass();
                    Object obj2 = si1.OooO0O0.get(si1Var);
                    if (obj2 == k72.OooO00o) {
                        obj2 = null;
                    }
                    yoVar.OooO00o(obj2, str);
                }
                for (Map.Entry entry2 : xp0.OooO0OO((LinkedHashMap) yoVar.OooO0o0).entrySet()) {
                    yoVar.OooO00o(((gd1) entry2.getValue()).OooO00o(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) yoVar.OooO0Oo;
                if (linkedHashMap.isEmpty()) {
                    k21VarArr = new k21[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new k21((String) entry3.getKey(), entry3.getValue()));
                    }
                    k21VarArr = (k21[]) arrayList.toArray(new k21[0]);
                }
                return co2.OooO00o((k21[]) Arrays.copyOf(k21VarArr, k21VarArr.length));
        }
    }
}
