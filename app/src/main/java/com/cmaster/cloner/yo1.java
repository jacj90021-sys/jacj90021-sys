package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yo1 extends xo1 {
    public final /* synthetic */ k3 OooO00o;
    public final /* synthetic */ zo1 OooO0O0;

    public yo1(zo1 zo1Var, k3 k3Var) {
        this.OooO0O0 = zo1Var;
        this.OooO00o = k3Var;
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO00o(vo1 vo1Var) {
        ((ArrayList) this.OooO00o.get(this.OooO0O0.OooO0o0)).remove(vo1Var);
        vo1Var.OooOo(this);
    }
}
