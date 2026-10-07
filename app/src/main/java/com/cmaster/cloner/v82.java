package com.cmaster.cloner;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v82 extends mg2 {
    public final Map OooO0Oo;
    public final /* synthetic */ ma2 OooO0o0;

    public v82(ma2 ma2Var, Map map) {
        this.OooO0o0 = ma2Var;
        this.OooO0Oo = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            g82 g82Var = (g82) it;
            if (!g82Var.hasNext()) {
                return;
            }
            g82Var.next();
            g82Var.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.OooO0Oo.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.OooO0Oo.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.OooO0Oo.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.OooO0Oo.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.OooO0Oo.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new g82(this, this.OooO0Oo.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.OooO0Oo.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.OooO0o0.OooO0oo -= size;
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.OooO0Oo.size();
    }
}
