package com.cmaster.cloner;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dr0 {
    public static final u5 OooO0Oo = new u5(2);
    public final LinkedHashMap OooO00o = new LinkedHashMap();
    public ar0 OooO0O0 = new gu0(6);
    public final s60 OooO0OO = new s60();

    public static dr0 OooO00o() {
        return (dr0) OooO0Oo.OooO0O0();
    }

    public final cr0 OooO0O0(int i, er0 er0Var) {
        LinkedHashMap linkedHashMap = this.OooO00o;
        cr0 cr0Var = (cr0) linkedHashMap.get(er0Var);
        if (cr0Var != null) {
            return cr0Var;
        }
        er0Var.getClass();
        cr0 cr0VarOooO0O0 = this.OooO0O0.OooO0O0(i, er0Var);
        linkedHashMap.put(er0Var, cr0VarOooO0O0);
        return cr0VarOooO0O0;
    }
}
