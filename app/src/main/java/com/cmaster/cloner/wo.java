package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wo extends ix {
    public static final wo OooO0oO;
    public ek OooO0o;

    static {
        int i = fm1.OooO0OO;
        int i2 = fm1.OooO0Oo;
        long j = fm1.OooO0o0;
        String str = fm1.OooO00o;
        wo woVar = new wo();
        woVar.OooO0o = new ek(i, i2, j, str);
        OooO0oO = woVar;
    }

    @Override // com.cmaster.cloner.zj
    public final void OooOOOO(vj vjVar, Runnable runnable) {
        this.OooO0o.OooO0o(runnable, fm1.OooO0oO);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // com.cmaster.cloner.zj
    public final String toString() {
        return "Dispatchers.Default";
    }
}
