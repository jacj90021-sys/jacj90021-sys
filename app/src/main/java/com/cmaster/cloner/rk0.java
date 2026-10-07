package com.cmaster.cloner;

import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class rk0 implements zx0 {
    public static final rk0 OooO0O0 = new rk0(0);
    public static final /* synthetic */ rk0 OooO0OO = new rk0(1);
    public static final /* synthetic */ rk0 OooO0Oo = new rk0(2);
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ rk0(int i) {
        this.OooO00o = i;
    }

    @Override // com.cmaster.cloner.yv
    public final void OooO00o(Object obj, Object obj2) {
        switch (this.OooO00o) {
            case 0:
                tk0 tk0Var = uk0.OooO0oo;
                throw new ew("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ay0 ay0Var = (ay0) obj2;
                ay0Var.OooO00o(u42.OooO0oO, entry.getKey());
                ay0Var.OooO00o(u42.OooO0oo, entry.getValue());
                return;
            case 2:
                throw new ew("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                ay0 ay0Var2 = (ay0) obj2;
                ay0Var2.OooO00o(pk2.OooO0oO, entry2.getKey());
                ay0Var2.OooO00o(pk2.OooO0oo, entry2.getValue());
                return;
            default:
                throw new ew("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
