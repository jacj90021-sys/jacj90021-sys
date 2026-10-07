package com.cmaster.cloner;

import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zy extends wc1 {
    public final HashMap OooO0oo = new HashMap();

    @Override // com.cmaster.cloner.wc1
    public final tc1 OooO00o(Object obj) {
        return (tc1) this.OooO0oo.get(obj);
    }

    @Override // com.cmaster.cloner.wc1
    public final Object OooO0O0(Object obj) {
        Object objOooO0O0 = super.OooO0O0(obj);
        this.OooO0oo.remove(obj);
        return objOooO0O0;
    }
}
