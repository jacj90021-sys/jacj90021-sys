package com.cmaster.cloner;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k83 extends LinkedHashMap {
    public final /* synthetic */ wa3 OooO0Oo;

    public k83(wa3 wa3Var) {
        this.OooO0Oo = wa3Var;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        wa3 wa3Var = this.OooO0Oo;
        synchronized (wa3Var) {
            try {
                if (size() <= wa3Var.OooO00o) {
                    return false;
                }
                wa3Var.OooO0o.add(new Pair((String) entry.getKey(), ((r93) entry.getValue()).OooO0O0));
                return size() > wa3Var.OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
