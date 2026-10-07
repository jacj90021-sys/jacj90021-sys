package com.cmaster.cloner;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ld2 extends uc2 implements List, RandomAccess {
    public static final dd2 OooO0o0 = new dd2(qf2.OooO0oo, 0);

    @Override // com.cmaster.cloner.uc2
    public int OooO00o(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public final dd2 listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return isEmpty() ? OooO0o0 : new dd2(this, i);
        }
        ra.OooO0oO(f73.OooO0Oo(i, size, "index"));
        return null;
    }

    @Override // java.util.List
    /* renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public ld2 subList(int i, int i2) {
        f73.OooO0O0(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? qf2.OooO0oo : new hd2(this, i, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (e73.OooO00o(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                dd2 dd2VarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (dd2VarListIterator.hasNext()) {
                        if (!it.hasNext() || !e73.OooO00o(dd2VarListIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
