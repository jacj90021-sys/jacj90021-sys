package com.cmaster.cloner;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ot0 {
    public final o0O000O OooO00o;
    public final a02 OooO0O0;
    public final HashMap OooO0OO;

    public ot0(Context context, a02 a02Var) {
        o0O000O o0o000o = new o0O000O(context);
        this.OooO0OO = new HashMap();
        this.OooO00o = o0o000o;
        this.OooO0O0 = a02Var;
    }

    public final synchronized gp1 OooO00o(String str) {
        if (this.OooO0OO.containsKey(str)) {
            return (gp1) this.OooO0OO.get(str);
        }
        CctBackendFactory cctBackendFactoryOooOoOO = this.OooO00o.OooOoOO(str);
        if (cctBackendFactoryOooOoOO == null) {
            return null;
        }
        a02 a02Var = this.OooO0O0;
        gp1 gp1VarCreate = cctBackendFactoryOooOoOO.create(new v4((Context) a02Var.OooO0o0, (ie) a02Var.OooO0o, (ie) a02Var.OooO0oO, str));
        this.OooO0OO.put(str, gp1VarCreate);
        return gp1VarCreate;
    }
}
