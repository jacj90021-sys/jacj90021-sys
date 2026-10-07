package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h23 extends u33 {
    public final transient int OooO0o;
    public final transient int OooO0oO;
    public final /* synthetic */ u33 OooO0oo;

    public h23(u33 u33Var, int i, int i2) {
        this.OooO0oo = u33Var;
        this.OooO0o = i;
        this.OooO0oO = i2;
    }

    @Override // com.cmaster.cloner.dx2
    public final int OooO0O0() {
        return this.OooO0oo.OooO0OO() + this.OooO0o + this.OooO0oO;
    }

    @Override // com.cmaster.cloner.dx2
    public final int OooO0OO() {
        return this.OooO0oo.OooO0OO() + this.OooO0o;
    }

    @Override // com.cmaster.cloner.dx2
    public final Object[] OooO0Oo() {
        return this.OooO0oo.OooO0Oo();
    }

    @Override // com.cmaster.cloner.u33, java.util.List
    /* renamed from: OooO0o0 */
    public final u33 subList(int i, int i2) {
        y73.OooO0O0(i, i2, this.OooO0oO);
        int i3 = this.OooO0o;
        return this.OooO0oo.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        y73.OooO00o(i, this.OooO0oO);
        return this.OooO0oo.get(i + this.OooO0o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.OooO0oO;
    }
}
