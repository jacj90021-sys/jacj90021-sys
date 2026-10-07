package com.cmaster.cloner;

import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qf2 extends ld2 {
    public static final qf2 OooO0oo = new qf2(new Object[0], 0);
    public final transient Object[] OooO0o;
    public final transient int OooO0oO;

    public qf2(Object[] objArr, int i) {
        this.OooO0o = objArr;
        this.OooO0oO = i;
    }

    @Override // com.cmaster.cloner.ld2, com.cmaster.cloner.uc2
    public final int OooO00o(Object[] objArr, int i) {
        Object[] objArr2 = this.OooO0o;
        int i2 = this.OooO0oO;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.cmaster.cloner.uc2
    public final int OooO0O0() {
        return this.OooO0oO;
    }

    @Override // com.cmaster.cloner.uc2
    public final int OooO0OO() {
        return 0;
    }

    @Override // com.cmaster.cloner.uc2
    public final Object[] OooO0Oo() {
        return this.OooO0o;
    }

    @Override // java.util.List
    public final Object get(int i) {
        f73.OooO00o(i, this.OooO0oO);
        Object obj = this.OooO0o[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.OooO0oO;
    }
}
