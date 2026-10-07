package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qm2 extends a32 {
    public final /* synthetic */ m6 OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm2(m6 m6Var, int i) {
        super(m6Var, i, null);
        this.OooO0oO = m6Var;
    }

    @Override // com.cmaster.cloner.a32
    public final void OooO00o(gh ghVar) {
        m6 m6Var = this.OooO0oO;
        if (m6Var.enableLocalFallback() && m6.zzo(m6Var)) {
            m6.zzk(m6Var, 16);
        } else {
            m6Var.zzc.OooOOo(ghVar);
            m6Var.onConnectionFailed(ghVar);
        }
    }

    @Override // com.cmaster.cloner.a32
    public final boolean OooO0O0() {
        this.OooO0oO.zzc.OooOOo(gh.OooO0oo);
        return true;
    }
}
