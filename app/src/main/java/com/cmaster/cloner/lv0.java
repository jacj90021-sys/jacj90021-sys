package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lv0 extends el0 implements a40 {
    public final /* synthetic */ pe1 OooO0o;
    public final /* synthetic */ int OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv0(pe1 pe1Var) {
        super(1);
        this.OooO0o0 = 2;
        this.OooO0o = pe1Var;
    }

    @Override // com.cmaster.cloner.a40
    public final Object OooO0o(Object obj) {
        int i = this.OooO0o0;
        vq1 vq1Var = vq1.OooO00o;
        pe1 pe1Var = this.OooO0o;
        switch (i) {
            case 0:
                ((ov0) pe1Var).unlock();
                break;
            case 1:
                ov0 ov0Var = (ov0) pe1Var;
                ov0.OooOO0O.set(ov0Var, null);
                ov0Var.unlock();
                break;
            default:
                pe1Var.OooO0O0();
                break;
        }
        return vq1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv0(ov0 ov0Var, mv0 mv0Var, int i) {
        super(1);
        this.OooO0o0 = i;
        this.OooO0o = ov0Var;
    }
}
