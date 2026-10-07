package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class di1 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ dp OooO0o;
    public final /* synthetic */ ei1 OooO0o0;

    public /* synthetic */ di1(dp dpVar, ei1 ei1Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o = dpVar;
        this.OooO0o0 = ei1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        ei1 ei1Var = this.OooO0o0;
        dp dpVar = this.OooO0o;
        switch (i) {
            case 0:
                if (dpVar.OooO0O0.contains(ei1Var)) {
                    px0.OooO00o(ei1Var.OooO0OO.Oooo0, ei1Var.OooO00o);
                    break;
                }
                break;
            default:
                dpVar.OooO0O0.remove(ei1Var);
                dpVar.OooO0OO.remove(ei1Var);
                break;
        }
    }
}
