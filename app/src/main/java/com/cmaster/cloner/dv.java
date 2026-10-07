package com.cmaster.cloner;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dv {
    public int OooO00o = 1;
    public final rt0 OooO0O0;
    public rt0 OooO0OO;
    public rt0 OooO0Oo;
    public int OooO0o;
    public int OooO0o0;

    public dv(rt0 rt0Var) {
        this.OooO0O0 = rt0Var;
        this.OooO0OO = rt0Var;
    }

    public final void OooO00o() {
        this.OooO00o = 1;
        this.OooO0OO = this.OooO0O0;
        this.OooO0o = 0;
    }

    public final boolean OooO0O0() {
        pt0 pt0VarOooO0O0 = this.OooO0OO.OooO0O0.OooO0O0();
        int iOooO00o = pt0VarOooO0O0.OooO00o(6);
        return !(iOooO00o == 0 || ((ByteBuffer) pt0VarOooO0O0.OooO0oO).get(iOooO00o + pt0VarOooO0O0.OooO0Oo) == 0) || this.OooO0o0 == 65039;
    }
}
