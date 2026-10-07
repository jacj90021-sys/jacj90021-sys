package com.cmaster.cloner;

import com.google.android.gms.internal.ads.zzbxf;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class r5 extends o30 {
    public final int OooO00o;
    public final int OooO0O0;
    public final String OooO0OO;

    public r5(String str, int i, int i2) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = str;
    }

    @Override // com.cmaster.cloner.o30
    public final void OooO0O0() {
        i81.OooO0oo.OooO0Oo(this.OooO0O0, this.OooO0OO);
    }

    @Override // com.cmaster.cloner.o30
    public final void OooO0OO(ay1 ay1Var) {
        int amount = ((zzbxf) ay1Var.OooO0o0).getAmount();
        if (amount <= 1) {
            amount = this.OooO00o;
        }
        i81.OooO0oo.OooO0Oo(amount, this.OooO0OO);
    }
}
