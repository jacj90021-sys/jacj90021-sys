package com.cmaster.cloner;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ym0 extends o0Oo0oo implements RandomAccess, Serializable {
    public Object[] OooO0Oo;
    public int OooO0o;
    public final int OooO0o0;
    public final ym0 OooO0oO;
    public final zm0 OooO0oo;

    public ym0(Object[] objArr, int i, int i2, ym0 ym0Var, zm0 zm0Var) {
        objArr.getClass();
        zm0Var.getClass();
        this.OooO0Oo = objArr;
        this.OooO0o0 = i;
        this.OooO0o = i2;
        this.OooO0oO = ym0Var;
        this.OooO0oo = zm0Var;
        ((AbstractList) this).modCount = ((AbstractList) zm0Var).modCount;
    }

    public final void OooO(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        ym0 ym0Var = this.OooO0oO;
        if (ym0Var != null) {
            ym0Var.OooO(i, i2);
        } else {
            zm0 zm0Var = zm0.OooO0oO;
            this.OooO0oo.OooO(i, i2);
        }
        this.OooO0o -= i2;
    }

    @Override // com.cmaster.cloner.o0Oo0oo
    public final int OooO00o() {
        OooO0o();
        return this.OooO0o;
    }

    @Override // com.cmaster.cloner.o0Oo0oo
    public final Object OooO0O0(int i) {
        OooO0oO();
        OooO0o();
        int i2 = this.OooO0o;
        if (i >= 0 && i < i2) {
            return OooO0oo(this.OooO0o0 + i);
        }
        ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void OooO0Oo(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        zm0 zm0Var = this.OooO0oo;
        ym0 ym0Var = this.OooO0oO;
        if (ym0Var != null) {
            ym0Var.OooO0Oo(i, collection, i2);
        } else {
            zm0 zm0Var2 = zm0.OooO0oO;
            zm0Var.OooO0Oo(i, collection, i2);
        }
        this.OooO0Oo = zm0Var.OooO0Oo;
        this.OooO0o += i2;
    }

    public final void OooO0o() {
        if (((AbstractList) this.OooO0oo).modCount == ((AbstractList) this).modCount) {
            return;
        }
        sa.OooO0O0();
    }

    public final void OooO0o0(int i, Object obj) {
        ((AbstractList) this).modCount++;
        zm0 zm0Var = this.OooO0oo;
        ym0 ym0Var = this.OooO0oO;
        if (ym0Var != null) {
            ym0Var.OooO0o0(i, obj);
        } else {
            zm0 zm0Var2 = zm0.OooO0oO;
            zm0Var.OooO0o0(i, obj);
        }
        this.OooO0Oo = zm0Var.OooO0Oo;
        this.OooO0o++;
    }

    public final void OooO0oO() {
        if (this.OooO0oo.OooO0o) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object OooO0oo(int i) {
        Object objOooO0oo;
        ((AbstractList) this).modCount++;
        ym0 ym0Var = this.OooO0oO;
        if (ym0Var != null) {
            objOooO0oo = ym0Var.OooO0oo(i);
        } else {
            zm0 zm0Var = zm0.OooO0oO;
            objOooO0oo = this.OooO0oo.OooO0oo(i);
        }
        this.OooO0o--;
        return objOooO0oo;
    }

    public final int OooOO0(int i, int i2, Collection collection, boolean z) {
        int iOooOO0;
        ym0 ym0Var = this.OooO0oO;
        if (ym0Var != null) {
            iOooOO0 = ym0Var.OooOO0(i, i2, collection, z);
        } else {
            zm0 zm0Var = zm0.OooO0oO;
            iOooOO0 = this.OooO0oo.OooOO0(i, i2, collection, z);
        }
        if (iOooOO0 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.OooO0o -= iOooOO0;
        return iOooOO0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        OooO0oO();
        OooO0o();
        int i2 = this.OooO0o;
        if (i < 0 || i > i2) {
            ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
        } else {
            OooO0o0(this.OooO0o0 + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        OooO0oO();
        OooO0o();
        int i2 = this.OooO0o;
        if (i < 0 || i > i2) {
            ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        OooO0Oo(this.OooO0o0 + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        OooO0oO();
        OooO0o();
        OooO(this.OooO0o0, this.OooO0o);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        OooO0o();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.OooO0Oo;
            int i = this.OooO0o;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (ij0.OooO00o(objArr[this.OooO0o0 + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0o();
        int i2 = this.OooO0o;
        if (i >= 0 && i < i2) {
            return this.OooO0Oo[this.OooO0o0 + i];
        }
        ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        OooO0o();
        Object[] objArr = this.OooO0Oo;
        int i = this.OooO0o;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.OooO0o0 + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        OooO0o();
        for (int i = 0; i < this.OooO0o; i++) {
            if (ij0.OooO00o(this.OooO0Oo[this.OooO0o0 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        OooO0o();
        return this.OooO0o == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        OooO0o();
        for (int i = this.OooO0o - 1; i >= 0; i--) {
            if (ij0.OooO00o(this.OooO0Oo[this.OooO0o0 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        OooO0o();
        int i2 = this.OooO0o;
        if (i >= 0 && i <= i2) {
            return new xm0(this, i);
        }
        ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        OooO0oO();
        OooO0o();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            OooO0O0(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        OooO0oO();
        OooO0o();
        return OooOO0(this.OooO0o0, this.OooO0o, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        OooO0oO();
        OooO0o();
        return OooOO0(this.OooO0o0, this.OooO0o, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooO0oO();
        OooO0o();
        int i2 = this.OooO0o;
        if (i < 0 || i >= i2) {
            ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.OooO0Oo;
        int i3 = this.OooO0o0;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        fl2.OooO00o(i, i2, this.OooO0o);
        return new ym0(this.OooO0Oo, this.OooO0o0 + i, i2 - i, this, this.OooO0oo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        OooO0o();
        int length = objArr.length;
        int i = this.OooO0o;
        Object[] objArr2 = this.OooO0Oo;
        int i2 = this.OooO0o0;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        o3.OooO0O0(objArr2, 0, objArr, i2, i + i2);
        int i3 = this.OooO0o;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        OooO0o();
        return lv2.OooO00o(this.OooO0Oo, this.OooO0o0, this.OooO0o, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        OooO0oO();
        OooO0o();
        OooO0o0(this.OooO0o0 + this.OooO0o, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        OooO0o();
        Object[] objArr = this.OooO0Oo;
        int i = this.OooO0o;
        int i2 = this.OooO0o0;
        return o3.OooO0Oo(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        OooO0oO();
        OooO0o();
        int size = collection.size();
        OooO0Oo(this.OooO0o0 + this.OooO0o, collection, size);
        return size > 0;
    }
}
