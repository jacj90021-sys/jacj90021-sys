package com.cmaster.cloner;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vp0 extends AbstractCollection implements Collection {
    public final tp0 OooO0Oo;

    public vp0(tp0 tp0Var) {
        this.OooO0Oo = tp0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.OooO0Oo.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.OooO0Oo.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.OooO0Oo.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        tp0 tp0Var = this.OooO0Oo;
        tp0Var.getClass();
        return new qp0(tp0Var, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        tp0 tp0Var = this.OooO0Oo;
        tp0Var.OooO0OO();
        int iOooO0oo = tp0Var.OooO0oo(obj);
        if (iOooO0oo < 0) {
            return false;
        }
        tp0Var.OooOO0O(iOooO0oo);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.OooO0Oo.OooO0OO();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.OooO0Oo.OooO0OO();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.OooO0Oo.OooOO0o;
    }
}
