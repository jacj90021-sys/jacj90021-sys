package com.cmaster.cloner;

import android.os.Bundle;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0O0OO0 implements cm0 {
    public final /* synthetic */ String OooO0Oo;
    public final /* synthetic */ o0O0O0o0 OooO0o;
    public final /* synthetic */ o0O0oo0o OooO0o0;
    public final /* synthetic */ zf OooO0oO;

    public o0O0OO0(zf zfVar, String str, ay1 ay1Var, o0O0O0o0 o0o0o0o0) {
        this.OooO0oO = zfVar;
        this.OooO0Oo = str;
        this.OooO0o0 = ay1Var;
        this.OooO0o = o0o0o0o0;
    }

    @Override // com.cmaster.cloner.cm0
    public final void OooO0o(hm0 hm0Var, wl0 wl0Var) {
        boolean zEquals = wl0.ON_START.equals(wl0Var);
        String str = this.OooO0Oo;
        zf zfVar = this.OooO0oO;
        if (!zEquals) {
            if (wl0.ON_STOP.equals(wl0Var)) {
                zfVar.OooO0o0.remove(str);
                return;
            } else {
                if (wl0.ON_DESTROY.equals(wl0Var)) {
                    zfVar.OooO0o0(str);
                    return;
                }
                return;
            }
        }
        HashMap map = zfVar.OooO0o0;
        Bundle bundle = zfVar.OooO0oO;
        HashMap map2 = zfVar.OooO0o;
        o0O0oo0o o0o0oo0o = this.OooO0o0;
        o0O0O0o0 o0o0o0o0 = this.OooO0o;
        map.put(str, new o0O0OOOo(o0o0oo0o, o0o0o0o0));
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            map2.remove(str);
            o0o0oo0o.OooO0o0(obj);
        }
        o0oO0O0o o0oo0o0o = (o0oO0O0o) bundle.getParcelable(str);
        if (o0oo0o0o != null) {
            bundle.remove(str);
            o0o0oo0o.OooO0o0(o0o0o0o0.OooO00o(o0oo0o0o.OooO0Oo, o0oo0o0o.OooO0o0));
        }
    }
}
