package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class la {
    public Object OooO00o;
    public na OooO0O0;
    public da1 OooO0OO;
    public boolean OooO0Oo;

    public final void finalize() {
        da1 da1Var;
        na naVar = this.OooO0O0;
        if (naVar != null) {
            ma maVar = naVar.OooO0o0;
            if (!maVar.isDone()) {
                maVar.OooO0oo(new OooOo("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.OooO00o, 2));
            }
        }
        if (this.OooO0Oo || (da1Var = this.OooO0OO) == null) {
            return;
        }
        da1Var.OooO(null);
    }
}
