package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e30 extends RuntimeException {
    public final f30 OooO0Oo;
    public final Throwable OooO0o0;

    public e30(f30 f30Var, Throwable th) {
        super(th);
        this.OooO0Oo = f30Var;
        this.OooO0o0 = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.OooO0o0;
    }
}
