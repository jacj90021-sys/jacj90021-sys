package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s22 extends b60 {

    public s22(android.content.Context context, com.cmaster.cloner.o0O000O o0o000o, com.cmaster.cloner.oOO0000 oOO00004, com.cmaster.cloner.a60 a60Var) {
        super(context, o0o000o, oOO00004, a60Var);
    }
    public static final o0O000O OooOO0o = new o0O000O("ClientTelemetry.API", new m12(2), new iu(3));
    public static final o0O000O OooOOO0 = new o0O000O("ModuleInstall.API", new m12(3), new iu(3));

    public ac3 OooO0Oo(uz0... uz0VarArr) {
        by2.OooO00o("Please provide at least one OptionalModuleApi.", uz0VarArr.length > 0);
        for (uz0 uz0Var : uz0VarArr) {
            by2.OooO(uz0Var, "Requested API must not be null.");
        }
        oOO0 ooo0OooO00o = oOO0.OooO00o(Arrays.asList(uz0VarArr), false);
        if (ooo0OooO00o.OooO0Oo.isEmpty()) {
            return m43.OooO0OO(new mu0(true, 0));
        }
        z8 z8Var = new z8();
        z8Var.OooO0o0 = new iz[]{q92.OooO00o};
        z8Var.OooO0O0 = 27301;
        z8Var.OooO0OO = false;
        z8Var.OooO0Oo = new vk1(this, ooo0OooO00o);
        return OooO0OO(0, z8Var.OooO00o());
    }

    public ac3 OooO0o0(gm1 gm1Var) {
        z8 z8Var = new z8();
        z8Var.OooO0O0 = 0;
        z8Var.OooO0o0 = new iz[]{m92.OooO00o};
        z8Var.OooO0OO = false;
        z8Var.OooO0Oo = new nz0(gm1Var, 14);
        return OooO0OO(2, z8Var.OooO00o());
    }
}
