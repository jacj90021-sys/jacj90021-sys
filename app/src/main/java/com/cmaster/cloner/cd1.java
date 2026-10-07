package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cd1 implements cm0, AutoCloseable {
    public final String OooO0Oo;
    public boolean OooO0o;
    public final bd1 OooO0o0;

    public cd1(String str, bd1 bd1Var) {
        this.OooO0Oo = str;
        this.OooO0o0 = bd1Var;
    }

    public final void OooO0OO(o0O000O o0o000o, jm0 jm0Var) {
        o0o000o.getClass();
        jm0Var.getClass();
        if (this.OooO0o) {
            qa.OooO0o("Already attached to lifecycleOwner");
            return;
        }
        this.OooO0o = true;
        jm0Var.OooO0OO(this);
        o0o000o.o000oOoO(this.OooO0Oo, (c20) this.OooO0o0.OooO00o.OooO0oo);
    }

    @Override // com.cmaster.cloner.cm0
    public final void OooO0o(hm0 hm0Var, wl0 wl0Var) {
        if (wl0Var == wl0.ON_DESTROY) {
            this.OooO0o = false;
            hm0Var.OooO0o().OooOOOO(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
