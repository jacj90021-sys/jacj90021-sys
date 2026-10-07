package com.cmaster.cloner;

import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o52 extends d42 {
    public final transient int OooO;
    public final transient Object[] OooO0oo;
    public final transient int OooOO0;

    public o52(Object[] objArr, int i, int i2) {
        super(0);
        this.OooO0oo = objArr;
        this.OooO = i;
        this.OooOO0 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        e83.OooO00o(i, this.OooOO0);
        Object obj = this.OooO0oo[i + i + this.OooO];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.OooOO0;
    }
}
