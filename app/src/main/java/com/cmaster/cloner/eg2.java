package com.cmaster.cloner;

import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class eg2 extends ld2 {
    public final transient Object[] OooO0o;
    public final transient int OooO0oO;
    public final transient int OooO0oo = 1;

    public eg2(Object[] objArr, int i) {
        this.OooO0o = objArr;
        this.OooO0oO = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        f73.OooO00o(i, this.OooO0oo);
        Object obj = this.OooO0o[i + i + this.OooO0oO];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.OooO0oo;
    }
}
