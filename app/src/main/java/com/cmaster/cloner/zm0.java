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
public final class zm0 extends o0Oo0oo implements RandomAccess, Serializable {
    public static final zm0 OooO0oO;
    public Object[] OooO0Oo;
    public boolean OooO0o;
    public int OooO0o0;

    static {
        zm0 zm0Var = new zm0(0);
        zm0Var.OooO0o = true;
        OooO0oO = zm0Var;
    }

    public zm0(int i) {
        if (i >= 0) {
            this.OooO0Oo = new Object[i];
        } else {
            ra.OooOOO("capacity must be non-negative.");
            throw null;
        }
    }

    public final void OooO(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.OooO0Oo;
        o3.OooO0O0(objArr, i, objArr, i + i2, this.OooO0o0);
        Object[] objArr2 = this.OooO0Oo;
        int i3 = this.OooO0o0;
        lv2.OooO0O0(objArr2, i3 - i2, i3);
        this.OooO0o0 -= i2;
    }

    @Override // com.cmaster.cloner.o0Oo0oo
    public final int OooO00o() {
        return this.OooO0o0;
    }

    @Override // com.cmaster.cloner.o0Oo0oo
    public final Object OooO0O0(int i) {
        OooO0o();
        int i2 = this.OooO0o0;
        if (i >= 0 && i < i2) {
            return OooO0oo(i);
        }
        ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void OooO0Oo(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        OooO0oO(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.OooO0Oo[i + i3] = it.next();
        }
    }

    public final void OooO0o() {
        if (this.OooO0o) {
            throw new UnsupportedOperationException();
        }
    }

    public final void OooO0o0(int i, Object obj) {
        ((AbstractList) this).modCount++;
        OooO0oO(i, 1);
        this.OooO0Oo[i] = obj;
    }

    public final void OooO0oO(int i, int i2) {
        int i3 = this.OooO0o0 + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.OooO0Oo;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.OooO0Oo = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.OooO0Oo;
        o3.OooO0O0(objArr2, i + i2, objArr2, i, this.OooO0o0);
        this.OooO0o0 += i2;
    }

    public final Object OooO0oo(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.OooO0Oo;
        Object obj = objArr[i];
        o3.OooO0O0(objArr, i, objArr, i + 1, this.OooO0o0);
        Object[] objArr2 = this.OooO0Oo;
        int i2 = this.OooO0o0 - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.OooO0o0--;
        return obj;
    }

    public final int OooOO0(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.OooO0Oo;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.OooO0Oo;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        o3.OooO0O0(objArr, i + i4, objArr, i2 + i, this.OooO0o0);
        Object[] objArr3 = this.OooO0Oo;
        int i7 = this.OooO0o0;
        lv2.OooO0O0(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.OooO0o0 -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        OooO0o();
        int i2 = this.OooO0o0;
        if (i < 0 || i > i2) {
            ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        OooO0oO(i, 1);
        this.OooO0Oo[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        OooO0o();
        int i2 = this.OooO0o0;
        if (i < 0 || i > i2) {
            ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        OooO0Oo(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        OooO0o();
        OooO(0, this.OooO0o0);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.OooO0Oo;
            int i = this.OooO0o0;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (ij0.OooO00o(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.OooO0o0;
        if (i >= 0 && i < i2) {
            return this.OooO0Oo[i];
        }
        ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.OooO0Oo;
        int i = this.OooO0o0;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.OooO0o0; i++) {
            if (ij0.OooO00o(this.OooO0Oo[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.OooO0o0 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.OooO0o0 - 1; i >= 0; i--) {
            if (ij0.OooO00o(this.OooO0Oo[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.OooO0o0;
        if (i >= 0 && i <= i2) {
            return new xm0(this, i);
        }
        ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        OooO0o();
        return OooOO0(0, this.OooO0o0, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        OooO0o();
        return OooOO0(0, this.OooO0o0, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooO0o();
        int i2 = this.OooO0o0;
        if (i < 0 || i >= i2) {
            ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.OooO0Oo;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        fl2.OooO00o(i, i2, this.OooO0o0);
        return new ym0(this.OooO0Oo, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.OooO0o0;
        Object[] objArr2 = this.OooO0Oo;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        o3.OooO0O0(objArr2, 0, objArr, 0, i);
        int i2 = this.OooO0o0;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return lv2.OooO00o(this.OooO0Oo, 0, this.OooO0o0, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        OooO0o();
        int i = this.OooO0o0;
        ((AbstractList) this).modCount++;
        OooO0oO(i, 1);
        this.OooO0Oo[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return o3.OooO0Oo(this.OooO0Oo, 0, this.OooO0o0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        OooO0o();
        int size = collection.size();
        OooO0Oo(this.OooO0o0, collection, size);
        return size > 0;
    }
}
