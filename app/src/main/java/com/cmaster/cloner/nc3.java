package com.cmaster.cloner;

import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nc3 extends d73 {
    public final transient hg2 OooO0o;
    public final transient jd3 OooO0oO;

    public nc3(hg2 hg2Var, jd3 jd3Var) {
        this.OooO0o = hg2Var;
        this.OooO0oO = jd3Var;
    }

    @Override // com.cmaster.cloner.dx2
    public final int OooO00o(Object[] objArr) {
        return this.OooO0oO.OooO00o(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.OooO0o.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.OooO0oO.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.OooO0o.getClass();
        return 1;
    }
}
