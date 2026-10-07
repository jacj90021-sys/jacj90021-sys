package com.cmaster.cloner;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k2 extends g7 {
    public final int OooO0o0;
    public boolean OooO0oo;
    public final re OooO0o = new re();
    public volatile Map OooO0oO = Collections.EMPTY_MAP;

    public k2(int i, boolean z) {
        this.OooO0oo = z;
        this.OooO0o0 = i;
    }

    public static String OooO0o0(String str, String str2) {
        if (str2 == null || str == null) {
            return null;
        }
        Collator collator = Collator.getInstance();
        collator.setStrength(0);
        if (collator.compare(str2, str) == 0 || str2.toLowerCase().contains(str.toLowerCase())) {
            return str2;
        }
        return null;
    }

    public final void OooO0Oo() {
        Map map = this.OooO0oO;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (!this.OooO0oo || ((wu1) entry.getValue()).OooOOO0.OooO0O0() != 1) {
                arrayList.add((wu1) entry.getValue());
            }
        }
        re reVar = this.OooO0o;
        pi2 pi2Var = new pi2((Object) this, (Object) reVar.OooO0o0.OooO0o, 8, false);
        reVar.OooO0o = arrayList;
        reVar.OooOO0++;
        reVar.OooO0O0(pi2Var);
    }
}
