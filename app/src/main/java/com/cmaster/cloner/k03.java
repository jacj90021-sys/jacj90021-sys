package com.cmaster.cloner;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k03 implements sz2 {
    public final il0 OooO00o;
    public final pz2 OooO0O0;

    public k03(Context context, pz2 pz2Var) {
        this.OooO0O0 = pz2Var;
        ca caVar = ca.OooO0o0;
        ip1.OooO0O0(context);
        hx2 hx2VarOooO0OO = ip1.OooO00o().OooO0OO(caVar);
        if (ca.OooO0Oo.contains(new dw("json"))) {
            new il0(new g03(hx2VarOooO0OO, 0));
        }
        this.OooO00o = new il0(new g03(hx2VarOooO0OO, 1));
    }

    @Override // com.cmaster.cloner.sz2
    public final void OooO00o(er1 er1Var) {
        u42 u42Var;
        zx0 zx0Var;
        hp1 hp1Var = (hp1) this.OooO00o.get();
        vu0 vu0Var = vu0.OooO0o;
        a02 a02Var = (a02) er1Var.OooO0o0;
        ((ax2) er1Var.OooO0o).OooO0oo = false;
        ax2 ax2Var = (ax2) er1Var.OooO0o;
        ax2Var.OooO0o = Boolean.FALSE;
        a02Var.OooO0o0 = new lx2(ax2Var);
        try {
            v03.OooOOo0();
            ps2 ps2Var = new ps2(a02Var);
            a02 a02Var2 = new a02(25);
            vu0Var.OooO0o(a02Var2);
            HashMap map = new HashMap((HashMap) a02Var2.OooO0o0);
            HashMap map2 = new HashMap((HashMap) a02Var2.OooO0o);
            rk0 rk0Var = (rk0) a02Var2.OooO0oO;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                u42Var = new u42(byteArrayOutputStream, map, map2, rk0Var);
                zx0Var = (zx0) map.get(ps2.class);
            } catch (IOException unused) {
            }
            if (zx0Var == null) {
                throw new ew("No encoder for ".concat(String.valueOf(ps2.class)));
            }
            zx0Var.OooO00o(ps2Var, u42Var);
            hp1Var.OooO00o(new w4(byteArrayOutputStream.toByteArray(), s41.OooO0o0));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
