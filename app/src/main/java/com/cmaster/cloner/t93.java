package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t93 extends u33 {
    public static final t93 OooO0oo = new t93(new Object[0], 0);
    public final transient Object[] OooO0o;
    public final transient int OooO0oO;

    public t93(Object[] objArr, int i) {
        this.OooO0o = objArr;
        this.OooO0oO = i;
    }

    @Override // com.cmaster.cloner.u33, com.cmaster.cloner.dx2
    public final int OooO00o(Object[] objArr) {
        Object[] objArr2 = this.OooO0o;
        int i = this.OooO0oO;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.cmaster.cloner.dx2
    public final int OooO0O0() {
        return this.OooO0oO;
    }

    @Override // com.cmaster.cloner.dx2
    public final int OooO0OO() {
        return 0;
    }

    @Override // com.cmaster.cloner.dx2
    public final Object[] OooO0Oo() {
        return this.OooO0o;
    }

    @Override // java.util.List
    public final Object get(int i) {
        y73.OooO00o(i, this.OooO0oO);
        Object obj = this.OooO0o[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.OooO0oO;
    }
}
