package com.cmaster.cloner;

import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class uk0 implements aw {
    public static final tk0 OooO0oo = new tk0();
    public final HashMap OooO0Oo;
    public final rk0 OooO0o;
    public final HashMap OooO0o0;
    public boolean OooO0oO;

    public uk0() {
        HashMap map = new HashMap();
        this.OooO0Oo = map;
        HashMap map2 = new HashMap();
        this.OooO0o0 = map2;
        this.OooO0o = rk0.OooO0O0;
        this.OooO0oO = false;
        map2.put(String.class, sk0.OooO0O0);
        map.remove(String.class);
        map2.put(Boolean.class, sk0.OooO0OO);
        map.remove(Boolean.class);
        map2.put(Date.class, OooO0oo);
        map.remove(Date.class);
    }

    @Override // com.cmaster.cloner.aw
    public final aw OooO0oO(Class cls, zx0 zx0Var) {
        this.OooO0Oo.put(cls, zx0Var);
        this.OooO0o0.remove(cls);
        return this;
    }
}
