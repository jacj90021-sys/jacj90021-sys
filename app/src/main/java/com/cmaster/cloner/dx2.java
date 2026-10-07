package com.cmaster.cloner;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class dx2 extends AbstractCollection implements Serializable {
    public static final Object[] OooO0Oo = new Object[0];

    public abstract int OooO00o(Object[] objArr);

    public int OooO0O0() {
        throw new UnsupportedOperationException();
    }

    public int OooO0OO() {
        throw new UnsupportedOperationException();
    }

    public Object[] OooO0Oo() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrOooO0Oo = OooO0Oo();
            if (objArrOooO0Oo != null) {
                return Arrays.copyOfRange(objArrOooO0Oo, OooO0OO(), OooO0O0(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        OooO00o(objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(OooO0Oo);
    }
}
