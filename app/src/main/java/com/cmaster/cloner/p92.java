package com.cmaster.cloner;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class p92 extends AbstractCollection implements List {
    public final /* synthetic */ ma2 OooO;
    public final Object OooO0Oo;
    public final p92 OooO0o;
    public Collection OooO0o0;
    public final Collection OooO0oO;
    public final /* synthetic */ ma2 OooO0oo;

    public p92(ma2 ma2Var, Object obj, List list, p92 p92Var) {
        this.OooO = ma2Var;
        this.OooO0oo = ma2Var;
        this.OooO0Oo = obj;
        this.OooO0o0 = list;
        this.OooO0o = p92Var;
        this.OooO0oO = p92Var == null ? null : p92Var.OooO0o0;
    }

    public final void OooO00o() {
        p92 p92Var = this.OooO0o;
        if (p92Var != null) {
            p92Var.OooO00o();
            return;
        }
        this.OooO0oo.OooO0oO.put(this.OooO0Oo, this.OooO0o0);
    }

    public final void OooO0O0() {
        p92 p92Var = this.OooO0o;
        if (p92Var != null) {
            p92Var.OooO0O0();
        } else if (this.OooO0o0.isEmpty()) {
            this.OooO0oo.OooO0oO.remove(this.OooO0Oo);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.OooO0o0.isEmpty();
        boolean zAdd = this.OooO0o0.add(obj);
        if (zAdd) {
            this.OooO0oo.OooO0oo++;
            if (zIsEmpty) {
                OooO00o();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.OooO0o0).addAll(i, collection);
        if (zAddAll) {
            this.OooO.OooO0oo += this.OooO0o0.size() - size;
            if (size == 0) {
                OooO00o();
                return true;
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.OooO0o0.clear();
        this.OooO0oo.OooO0oo -= size;
        OooO0O0();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        zzb();
        return this.OooO0o0.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.OooO0o0.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.OooO0o0.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.OooO0o0).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        zzb();
        return this.OooO0o0.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.OooO0o0).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        zzb();
        return new g82(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.OooO0o0).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new l92(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object objRemove = ((List) this.OooO0o0).remove(i);
        ma2 ma2Var = this.OooO;
        ma2Var.OooO0oo--;
        OooO0O0();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.OooO0o0.removeAll(collection);
        if (zRemoveAll) {
            this.OooO0oo.OooO0oo += this.OooO0o0.size() - size;
            OooO0O0();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.OooO0o0.retainAll(collection);
        if (zRetainAll) {
            this.OooO0oo.OooO0oo += this.OooO0o0.size() - size;
            OooO0O0();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.OooO0o0).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzb();
        return this.OooO0o0.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List listSubList = ((List) this.OooO0o0).subList(i, i2);
        p92 p92Var = this.OooO0o;
        if (p92Var == null) {
            p92Var = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.OooO0Oo;
        ma2 ma2Var = this.OooO;
        return z ? new b92(ma2Var, obj, listSubList, p92Var) : new p92(ma2Var, obj, listSubList, p92Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.OooO0o0.toString();
    }

    public final void zzb() {
        p92 p92Var = this.OooO0o;
        if (p92Var != null) {
            p92Var.zzb();
            if (p92Var.OooO0o0 == this.OooO0oO) {
                return;
            }
            sa.OooO0O0();
            return;
        }
        if (this.OooO0o0.isEmpty()) {
            Collection collection = (Collection) this.OooO0oo.OooO0oO.get(this.OooO0Oo);
            if (collection != null) {
                this.OooO0o0 = collection;
            }
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new l92(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.OooO0o0.remove(obj);
        if (zRemove) {
            ma2 ma2Var = this.OooO0oo;
            ma2Var.OooO0oo--;
            OooO0O0();
        }
        return zRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean zIsEmpty = this.OooO0o0.isEmpty();
        ((List) this.OooO0o0).add(i, obj);
        this.OooO.OooO0oo++;
        if (zIsEmpty) {
            OooO00o();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.OooO0o0.addAll(collection);
        if (zAddAll) {
            this.OooO0oo.OooO0oo += this.OooO0o0.size() - size;
            if (size == 0) {
                OooO00o();
                return true;
            }
        }
        return zAddAll;
    }
}
