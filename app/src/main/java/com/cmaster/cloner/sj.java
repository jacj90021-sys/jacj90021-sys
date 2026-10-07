package com.cmaster.cloner;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sj extends el0 implements a40 {
    public final /* synthetic */ hp OooO0o;
    public final /* synthetic */ la OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(la laVar, hp hpVar) {
        super(1);
        this.OooO0o0 = laVar;
        this.OooO0o = hpVar;
    }

    @Override // com.cmaster.cloner.a40
    public final Object OooO0o(Object obj) throws Throwable {
        Throwable th = (Throwable) obj;
        la laVar = this.OooO0o0;
        if (th == null) {
            Object objOooOo0o = this.OooO0o.OooOo0o();
            laVar.OooO0Oo = true;
            na naVar = laVar.OooO0O0;
            if (naVar != null) {
                ma maVar = naVar.OooO0o0;
                maVar.getClass();
                if (objOooOo0o == null) {
                    objOooOo0o = o00000O.OooOO0;
                }
                if (o00000O.OooO.OooO0O0(maVar, null, objOooOo0o)) {
                    o00000O.OooO0O0(maVar);
                    laVar.OooO00o = null;
                    laVar.OooO0O0 = null;
                    laVar.OooO0OO = null;
                }
            }
        } else if (th instanceof CancellationException) {
            laVar.OooO0Oo = true;
            na naVar2 = laVar.OooO0O0;
            if (naVar2 != null && naVar2.OooO0o0.cancel(true)) {
                laVar.OooO00o = null;
                laVar.OooO0O0 = null;
                laVar.OooO0OO = null;
            }
        } else {
            laVar.OooO0Oo = true;
            na naVar3 = laVar.OooO0O0;
            if (naVar3 != null && naVar3.OooO0o0.OooO0oo(th)) {
                laVar.OooO00o = null;
                laVar.OooO0O0 = null;
                laVar.OooO0OO = null;
            }
        }
        return vq1.OooO00o;
    }
}
