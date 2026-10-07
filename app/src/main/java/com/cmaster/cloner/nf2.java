package com.cmaster.cloner;

import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nf2 extends cf2 {
    public final transient Object OooO0oo;

    public nf2(Object obj) {
        super(1);
        this.OooO0oo = obj;
    }

    @Override // com.cmaster.cloner.m32
    public final int OooO00o(Object[] objArr) {
        objArr[0] = this.OooO0oo;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.OooO0oo.equals(obj);
    }

    @Override // com.cmaster.cloner.cf2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.OooO0oo.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new ff2(this.OooO0oo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return px0.OooOOOO("[", this.OooO0oo.toString(), "]");
    }
}
