package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zo0 implements fa1, ky {
    public static final hx2 OooO0oo = z52.OooO00o(20, new qc3(9));
    public final vi1 OooO0Oo = new vi1();
    public boolean OooO0o;
    public fa1 OooO0o0;
    public boolean OooO0oO;

    public final synchronized void OooO00o() {
        this.OooO0Oo.OooO00o();
        if (!this.OooO0o) {
            throw new IllegalStateException("Already unlocked");
        }
        this.OooO0o = false;
        if (this.OooO0oO) {
            OooO0O0();
        }
    }

    @Override // com.cmaster.cloner.fa1
    public final synchronized void OooO0O0() {
        this.OooO0Oo.OooO00o();
        this.OooO0oO = true;
        if (!this.OooO0o) {
            this.OooO0o0.OooO0O0();
            this.OooO0o0 = null;
            OooO0oo.OooO0O0(this);
        }
    }

    @Override // com.cmaster.cloner.ky
    public final vi1 OooO0OO() {
        return this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.fa1
    public final int OooO0Oo() {
        return this.OooO0o0.OooO0Oo();
    }

    @Override // com.cmaster.cloner.fa1
    public final Class OooO0o0() {
        return this.OooO0o0.OooO0o0();
    }

    @Override // com.cmaster.cloner.fa1
    public final Object get() {
        return this.OooO0o0.get();
    }
}
