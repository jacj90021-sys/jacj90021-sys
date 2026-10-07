package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qw implements fa1 {
    public int OooO;
    public final boolean OooO0Oo;
    public final fa1 OooO0o;
    public final boolean OooO0o0;
    public final kw OooO0oO;
    public final zk0 OooO0oo;
    public boolean OooOO0;

    public qw(fa1 fa1Var, boolean z, boolean z2, zk0 zk0Var, kw kwVar) {
        zx2.OooO0OO(fa1Var, "Argument must not be null");
        this.OooO0o = fa1Var;
        this.OooO0Oo = z;
        this.OooO0o0 = z2;
        this.OooO0oo = zk0Var;
        zx2.OooO0OO(kwVar, "Argument must not be null");
        this.OooO0oO = kwVar;
    }

    public final synchronized void OooO00o() {
        if (this.OooOO0) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.OooO++;
    }

    @Override // com.cmaster.cloner.fa1
    public final synchronized void OooO0O0() {
        if (this.OooO > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.OooOO0) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.OooOO0 = true;
        if (this.OooO0o0) {
            this.OooO0o.OooO0O0();
        }
    }

    public final void OooO0OO() {
        boolean z;
        synchronized (this) {
            int i = this.OooO;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.OooO = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.OooO0oO.OooO0o0(this.OooO0oo, this);
        }
    }

    @Override // com.cmaster.cloner.fa1
    public final int OooO0Oo() {
        return this.OooO0o.OooO0Oo();
    }

    @Override // com.cmaster.cloner.fa1
    public final Class OooO0o0() {
        return this.OooO0o.OooO0o0();
    }

    @Override // com.cmaster.cloner.fa1
    public final Object get() {
        return this.OooO0o.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.OooO0Oo + ", listener=" + this.OooO0oO + ", key=" + this.OooO0oo + ", acquired=" + this.OooO + ", isRecycled=" + this.OooOO0 + ", resource=" + this.OooO0o + '}';
    }
}
