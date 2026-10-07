package com.cmaster.cloner;

import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class if2 extends bf2 {
    public static final if2 OooOO0 = new if2(new Object[0], 0);
    public final transient int OooO;
    public final transient Object[] OooO0oo;

    public if2(Object[] objArr, int i) {
        super(1);
        this.OooO0oo = objArr;
        this.OooO = i;
    }

    @Override // com.cmaster.cloner.bf2, com.cmaster.cloner.m32
    public final int OooO00o(Object[] objArr) {
        Object[] objArr2 = this.OooO0oo;
        int i = this.OooO;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.cmaster.cloner.m32
    public final int OooO0O0() {
        return this.OooO;
    }

    @Override // com.cmaster.cloner.m32
    public final int OooO0OO() {
        return 0;
    }

    @Override // com.cmaster.cloner.m32
    public final Object[] OooO0Oo() {
        return this.OooO0oo;
    }

    @Override // java.util.List
    public final Object get(int i) {
        p73.OooO00o(i, this.OooO);
        Object obj = this.OooO0oo[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.OooO;
    }
}
