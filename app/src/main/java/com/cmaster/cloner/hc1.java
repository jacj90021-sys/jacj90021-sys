package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hc1 extends gp2 {
    @Override // com.cmaster.cloner.gp2
    public final void OooO00o(kg1 kg1Var, float f, float f2) {
        float f3 = f2 * f;
        kg1Var.OooO0Oo(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        gg1 gg1Var = new gg1(0.0f, 0.0f, f4, f4);
        gg1Var.OooO0o = 180.0f;
        gg1Var.OooO0oO = 90.0f;
        kg1Var.OooO0o.add(gg1Var);
        eg1 eg1Var = new eg1(gg1Var);
        kg1Var.OooO00o(180.0f);
        kg1Var.OooO0oO.add(eg1Var);
        kg1Var.OooO0Oo = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        kg1Var.OooO0O0 = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        kg1Var.OooO0OO = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
