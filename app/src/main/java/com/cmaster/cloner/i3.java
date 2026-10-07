package com.cmaster.cloner;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i3 implements Set {
    public final /* synthetic */ k3 OooO0Oo;

    public i3(k3 k3Var) {
        this.OooO0Oo = k3Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.OooO0Oo.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.OooO0Oo.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.OooO0Oo.OooOO0O(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        k3 k3Var = this.OooO0Oo;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (k3Var.OooO0o == set.size()) {
                return k3Var.OooOO0O(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        k3 k3Var = this.OooO0Oo;
        int iHashCode = 0;
        for (int i = k3Var.OooO0o - 1; i >= 0; i--) {
            Object objOooO0o = k3Var.OooO0o(i);
            iHashCode += objOooO0o == null ? 0 : objOooO0o.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.OooO0Oo.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h3(this.OooO0Oo, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        k3 k3Var = this.OooO0Oo;
        int iOooO0Oo = k3Var.OooO0Oo(obj);
        if (iOooO0Oo < 0) {
            return false;
        }
        k3Var.OooO0oo(iOooO0Oo);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.OooO0Oo.OooOO0o(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        k3 k3Var = this.OooO0Oo;
        int i = k3Var.OooO0o;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(k3Var.OooO0o(i2))) {
                k3Var.OooO0oo(i2);
            }
        }
        return i != k3Var.OooO0o;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.OooO0Oo.OooO0o;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        k3 k3Var = this.OooO0Oo;
        int i = k3Var.OooO0o;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = k3Var.OooO0o(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        k3 k3Var = this.OooO0Oo;
        int i = k3Var.OooO0o;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = k3Var.OooO0o(i2);
        }
        return objArr;
    }
}
