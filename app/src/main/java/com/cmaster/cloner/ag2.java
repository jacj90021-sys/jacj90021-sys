package com.cmaster.cloner;

import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ag2 extends sd2 {
    public final transient hg2 OooO0o;
    public final transient eg2 OooO0oO;

    public ag2(hg2 hg2Var, eg2 eg2Var) {
        this.OooO0o = hg2Var;
        this.OooO0oO = eg2Var;
    }

    @Override // com.cmaster.cloner.uc2
    public final int OooO00o(Object[] objArr, int i) {
        return this.OooO0oO.OooO00o(objArr, i);
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
        return 1;
    }
}
