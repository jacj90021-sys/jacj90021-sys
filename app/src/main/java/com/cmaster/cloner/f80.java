package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class f80 implements iy0 {
    public final /* synthetic */ int OooO0Oo = 1;
    public final /* synthetic */ a40 OooO0o0;

    public f80(OooOOO0 oooOOO0) {
        sn2.OooO00o("wD/tGHvM4xE=\n", "pkqDew+ljH8=\n");
        this.OooO0o0 = oooOOO0;
    }

    @Override // com.cmaster.cloner.iy0
    public final /* synthetic */ void OooO00o(Object obj) throws Exception {
        switch (this.OooO0Oo) {
            case 0:
                this.OooO0o0.OooO0o(obj);
                break;
            default:
                ((OooOOO0) this.OooO0o0).OooO0o(obj);
                break;
        }
    }

    public final a40 OooO0O0() {
        switch (this.OooO0Oo) {
            case 0:
                return this.OooO0o0;
            default:
                return (OooOOO0) this.OooO0o0;
        }
    }

    public final boolean equals(Object obj) {
        int i = this.OooO0Oo;
        a40 a40Var = this.OooO0o0;
        switch (i) {
            case 0:
                if ((obj instanceof iy0) && (obj instanceof f80)) {
                    return ij0.OooO00o(a40Var, ((f80) obj).OooO0O0());
                }
                return false;
            default:
                if ((obj instanceof iy0) && (obj instanceof f80)) {
                    return ij0.OooO00o((OooOOO0) a40Var, ((f80) obj).OooO0O0());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.OooO0Oo) {
            case 0:
                return this.OooO0o0.hashCode();
            default:
                return ((OooOOO0) this.OooO0o0).hashCode();
        }
    }

    public f80(a40 a40Var) {
        sn2.OooO00o("wfIX9B/UQzU=\n", "p4d5l2u9LFs=\n");
        this.OooO0o0 = a40Var;
    }
}
