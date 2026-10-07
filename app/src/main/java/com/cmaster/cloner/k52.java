package com.cmaster.cloner;

import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k52 extends r42 {
    public final transient o52 OooO;
    public final transient t52 OooO0oo;

    public k52(t52 t52Var, o52 o52Var) {
        super(0);
        this.OooO0oo = t52Var;
        this.OooO = o52Var;
    }

    @Override // com.cmaster.cloner.m32
    public final int OooO00o(Object[] objArr) {
        return this.OooO.OooO00o(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.OooO0oo.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.OooO.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.OooO0oo.OooO;
    }
}
