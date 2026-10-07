package com.google.mlkit.vision.common.internal;

import com.cmaster.cloner.b13;
import com.cmaster.cloner.gu0;
import com.cmaster.cloner.pp;
import com.cmaster.cloner.px0;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.t93;
import com.cmaster.cloner.u33;
import com.cmaster.cloner.uu0;
import com.cmaster.cloner.vf;
import com.cmaster.cloner.vu0;
import com.cmaster.cloner.xb;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List OooO00o() {
        xb xbVarOooO00o = vf.OooO00o(vu0.class);
        xbVarOooO00o.OooO00o(new pp(2, 0, uu0.class));
        xbVarOooO00o.OooO0oo = gu0.OooO0o;
        Object[] objArr = {xbVarOooO00o.OooO0o0()};
        for (int i = 0; i < 1; i++) {
            b13 b13Var = u33.OooO0o0;
            if (objArr[i] == null) {
                qa.OooOOO0(px0.OooOOO(i, "at index "));
                return null;
            }
        }
        b13 b13Var2 = u33.OooO0o0;
        return new t93(objArr, 1);
    }
}
