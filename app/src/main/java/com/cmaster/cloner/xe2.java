package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xe2 extends bf2 {
    public final transient int OooO;
    public final transient int OooO0oo;
    public final /* synthetic */ bf2 OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe2(bf2 bf2Var, int i, int i2) {
        super(1);
        this.OooOO0 = bf2Var;
        this.OooO0oo = i;
        this.OooO = i2;
    }

    @Override // com.cmaster.cloner.m32
    public final int OooO0O0() {
        return this.OooOO0.OooO0OO() + this.OooO0oo + this.OooO;
    }

    @Override // com.cmaster.cloner.m32
    public final int OooO0OO() {
        return this.OooOO0.OooO0OO() + this.OooO0oo;
    }

    @Override // com.cmaster.cloner.m32
    public final Object[] OooO0Oo() {
        return this.OooOO0.OooO0Oo();
    }

    @Override // com.cmaster.cloner.bf2, java.util.List
    /* renamed from: OooO0o0 */
    public final bf2 subList(int i, int i2) {
        p73.OooO0O0(i, i2, this.OooO);
        int i3 = this.OooO0oo;
        return this.OooOO0.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        p73.OooO00o(i, this.OooO);
        return this.OooOO0.get(i + this.OooO0oo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.OooO;
    }
}
