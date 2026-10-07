package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class v92 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ String OooO0o;
    public final /* synthetic */ ea2 OooO0o0;

    public /* synthetic */ v92(ea2 ea2Var, String str, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = ea2Var;
        this.OooO0o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        String str = this.OooO0o;
        ea2 ea2Var = this.OooO0o0;
        switch (i) {
            case 0:
                ea2Var.OooO0O0.OooO0O0.evaluateJavascript(str, null);
                break;
            default:
                ea2Var.OooO0O0.OooO0O0.evaluateJavascript(str, null);
                break;
        }
    }
}
