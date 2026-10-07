package com.cmaster.cloner;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class m32 extends AbstractCollection implements Serializable {
    public final /* synthetic */ int OooO0Oo;
    public static final Object[] OooO0o0 = new Object[0];
    public static final Object[] OooO0o = new Object[0];

    public abstract int OooO00o(Object[] objArr);

    public int OooO0O0() {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int OooO0OO() {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Object[] OooO0Oo() {
        switch (this.OooO0Oo) {
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        switch (this.OooO0Oo) {
        }
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.OooO0Oo) {
            case 0:
                objArr.getClass();
                int size = size();
                int length = objArr.length;
                if (length < size) {
                    Object[] objArrOooO0Oo = OooO0Oo();
                    if (objArrOooO0Oo != null) {
                        break;
                    } else {
                        if (length != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size);
                    }
                } else if (length > size) {
                    objArr[size] = null;
                }
                OooO00o(objArr);
                break;
            default:
                objArr.getClass();
                int size2 = size();
                int length2 = objArr.length;
                if (length2 < size2) {
                    Object[] objArrOooO0Oo2 = OooO0Oo();
                    if (objArrOooO0Oo2 != null) {
                        break;
                    } else {
                        if (length2 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size2);
                    }
                } else if (length2 > size2) {
                    objArr[size2] = null;
                }
                OooO00o(objArr);
                break;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        switch (this.OooO0Oo) {
            case 0:
                return toArray(OooO0o0);
            default:
                return toArray(OooO0o);
        }
    }
}
