package com.cmaster.cloner;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n03 extends OooOO0O {
    public final /* synthetic */ int OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n03(int i) {
        super(3);
        this.OooO0o0 = i;
    }

    @Override // com.cmaster.cloner.OooOO0O
    public final Object OooO0Oo(Object obj) {
        switch (this.OooO0o0) {
            case 0:
                au0 au0VarOooO0OO = au0.OooO0OO();
                return new c03(au0VarOooO0OO.OooO0O0(), (pg1) au0VarOooO0OO.OooO00o(pg1.class), new wz2(au0.OooO0OO().OooO0O0(), (pz2) obj));
            case 1:
                au0 au0VarOooO0OO2 = au0.OooO0OO();
                Context contextOooO0O0 = au0.OooO0OO().OooO0O0();
                ArrayList arrayList = new ArrayList();
                je jeVar = new je(18);
                ca caVar = ca.OooO0o0;
                ip1.OooO0O0(contextOooO0O0);
                ip1.OooO00o().OooO0OO(caVar);
                ca.OooO0Oo.contains(new dw("json"));
                arrayList.add(jeVar);
                return new l73(au0VarOooO0OO2.OooO0O0(), (pg1) au0VarOooO0OO2.OooO00o(pg1.class));
            default:
                cc3 cc3Var = (cc3) obj;
                au0 au0VarOooO0OO3 = au0.OooO0OO();
                return new ic3(au0VarOooO0OO3.OooO0O0(), (pg1) au0VarOooO0OO3.OooO00o(pg1.class), new ec3(au0.OooO0OO().OooO0O0(), cc3Var), cc3Var.OooO00o);
        }
    }
}
