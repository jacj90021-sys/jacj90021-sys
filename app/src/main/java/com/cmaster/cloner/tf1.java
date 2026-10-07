package com.cmaster.cloner;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tf1 extends o0OO00O implements Serializable {
    public static final tf1 OooO0o0 = new tf1(tp0.OooOOo0);
    public final tp0 OooO0Oo;

    public tf1() {
        this.OooO0Oo = new tp0();
    }

    @Override // com.cmaster.cloner.o0OO00O
    public final int OooO00o() {
        return this.OooO0Oo.OooOO0o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.OooO0Oo.OooO00o(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.OooO0Oo.OooO0OO();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.OooO0Oo.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.OooO0Oo.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.OooO0Oo.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        tp0 tp0Var = this.OooO0Oo;
        tp0Var.getClass();
        return new qp0(tp0Var, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        tp0 tp0Var = this.OooO0Oo;
        tp0Var.OooO0OO();
        int iOooO0oO = tp0Var.OooO0oO(obj);
        if (iOooO0oO < 0) {
            return false;
        }
        tp0Var.OooOO0O(iOooO0oO);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.OooO0Oo.OooO0OO();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.OooO0Oo.OooO0OO();
        return super.retainAll(collection);
    }

    public tf1(tp0 tp0Var) {
        tp0Var.getClass();
        this.OooO0Oo = tp0Var;
    }
}
