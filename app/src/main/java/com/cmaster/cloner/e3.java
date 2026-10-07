package com.cmaster.cloner;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e3 extends o0Oo0oo {
    public static final Object[] OooO0oO = new Object[0];
    public int OooO0Oo;
    public int OooO0o;
    public Object[] OooO0o0 = OooO0oO;

    public final void OooO() {
        ((AbstractList) this).modCount++;
    }

    @Override // com.cmaster.cloner.o0Oo0oo
    public final int OooO00o() {
        return this.OooO0o;
    }

    @Override // com.cmaster.cloner.o0Oo0oo
    public final Object OooO0O0(int i) {
        int i2 = this.OooO0o;
        if (i < 0 || i >= i2) {
            ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == OooO00o() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        OooO();
        int iOooO0oo = OooO0oo(this.OooO0Oo + i);
        Object[] objArr = this.OooO0o0;
        Object obj = objArr[iOooO0oo];
        int i3 = this.OooO0o >> 1;
        int i4 = this.OooO0Oo;
        if (i < i3) {
            if (iOooO0oo >= i4) {
                o3.OooO0O0(objArr, i4 + 1, objArr, i4, iOooO0oo);
            } else {
                o3.OooO0O0(objArr, 1, objArr, 0, iOooO0oo);
                Object[] objArr2 = this.OooO0o0;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.OooO0Oo;
                o3.OooO0O0(objArr2, i5 + 1, objArr2, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.OooO0o0;
            int i6 = this.OooO0Oo;
            objArr3[i6] = null;
            this.OooO0Oo = OooO0o0(i6);
        } else {
            int iOooO0oo2 = OooO0oo((OooO00o() - 1) + i4);
            Object[] objArr4 = this.OooO0o0;
            if (iOooO0oo <= iOooO0oo2) {
                o3.OooO0O0(objArr4, iOooO0oo, objArr4, iOooO0oo + 1, iOooO0oo2 + 1);
            } else {
                o3.OooO0O0(objArr4, iOooO0oo, objArr4, iOooO0oo + 1, objArr4.length);
                Object[] objArr5 = this.OooO0o0;
                objArr5[objArr5.length - 1] = objArr5[0];
                o3.OooO0O0(objArr5, 0, objArr5, 1, iOooO0oo2 + 1);
            }
            this.OooO0o0[iOooO0oo2] = null;
        }
        this.OooO0o--;
        return obj;
    }

    public final void OooO0OO(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.OooO0o0.length;
        while (i < length && it.hasNext()) {
            this.OooO0o0[i] = it.next();
            i++;
        }
        int i2 = this.OooO0Oo;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.OooO0o0[i3] = it.next();
        }
        this.OooO0o = collection.size() + this.OooO0o;
    }

    public final void OooO0Oo(int i) {
        if (i < 0) {
            qa.OooO0o("Deque is too big.");
            return;
        }
        Object[] objArr = this.OooO0o0;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == OooO0oO) {
            if (i < 10) {
                i = 10;
            }
            this.OooO0o0 = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        o3.OooO0O0(objArr, 0, objArr2, this.OooO0Oo, objArr.length);
        Object[] objArr3 = this.OooO0o0;
        int length2 = objArr3.length;
        int i3 = this.OooO0Oo;
        o3.OooO0O0(objArr3, length2 - i3, objArr2, 0, i3);
        this.OooO0Oo = 0;
        this.OooO0o0 = objArr2;
    }

    public final int OooO0o(int i) {
        return i < 0 ? i + this.OooO0o0.length : i;
    }

    public final int OooO0o0(int i) {
        this.OooO0o0.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final void OooO0oO(int i, int i2) {
        Object[] objArr = this.OooO0o0;
        if (i < i2) {
            objArr.getClass();
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Object[] objArr2 = this.OooO0o0;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, i2, (Object) null);
        }
    }

    public final int OooO0oo(int i) {
        Object[] objArr = this.OooO0o0;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.OooO0o;
        if (i < 0 || i > i2) {
            ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        OooO();
        OooO0Oo(this.OooO0o + 1);
        int iOooO0oo = OooO0oo(this.OooO0Oo + i);
        int i3 = this.OooO0o;
        if (i < ((i3 + 1) >> 1)) {
            if (iOooO0oo == 0) {
                Object[] objArr = this.OooO0o0;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iOooO0oo - 1;
            }
            int length2 = this.OooO0Oo;
            if (length2 == 0) {
                Object[] objArr2 = this.OooO0o0;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.OooO0Oo;
            Object[] objArr3 = this.OooO0o0;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                o3.OooO0O0(objArr3, i5, objArr3, i5 + 1, length + 1);
            } else {
                o3.OooO0O0(objArr3, i5 - 1, objArr3, i5, objArr3.length);
                Object[] objArr4 = this.OooO0o0;
                objArr4[objArr4.length - 1] = objArr4[0];
                o3.OooO0O0(objArr4, 0, objArr4, 1, length + 1);
            }
            this.OooO0o0[length] = obj;
            this.OooO0Oo = i4;
        } else {
            int iOooO0oo2 = OooO0oo(i3 + this.OooO0Oo);
            Object[] objArr5 = this.OooO0o0;
            if (iOooO0oo < iOooO0oo2) {
                o3.OooO0O0(objArr5, iOooO0oo + 1, objArr5, iOooO0oo, iOooO0oo2);
            } else {
                o3.OooO0O0(objArr5, 1, objArr5, 0, iOooO0oo2);
                Object[] objArr6 = this.OooO0o0;
                objArr6[0] = objArr6[objArr6.length - 1];
                o3.OooO0O0(objArr6, iOooO0oo + 1, objArr6, iOooO0oo, objArr6.length - 1);
            }
            this.OooO0o0[iOooO0oo] = obj;
        }
        this.OooO0o++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.OooO0o;
        if (i < 0 || i > i2) {
            ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.OooO0o) {
            return addAll(collection);
        }
        OooO();
        OooO0Oo(collection.size() + this.OooO0o);
        int iOooO0oo = OooO0oo(this.OooO0o + this.OooO0Oo);
        int iOooO0oo2 = OooO0oo(this.OooO0Oo + i);
        int size = collection.size();
        if (i >= ((this.OooO0o + 1) >> 1)) {
            int i3 = iOooO0oo2 + size;
            Object[] objArr = this.OooO0o0;
            if (iOooO0oo2 < iOooO0oo) {
                int i4 = size + iOooO0oo;
                if (i4 <= objArr.length) {
                    o3.OooO0O0(objArr, i3, objArr, iOooO0oo2, iOooO0oo);
                } else if (i3 >= objArr.length) {
                    o3.OooO0O0(objArr, i3 - objArr.length, objArr, iOooO0oo2, iOooO0oo);
                } else {
                    int length = iOooO0oo - (i4 - objArr.length);
                    o3.OooO0O0(objArr, 0, objArr, length, iOooO0oo);
                    Object[] objArr2 = this.OooO0o0;
                    o3.OooO0O0(objArr2, i3, objArr2, iOooO0oo2, length);
                }
            } else {
                o3.OooO0O0(objArr, size, objArr, 0, iOooO0oo);
                Object[] objArr3 = this.OooO0o0;
                if (i3 >= objArr3.length) {
                    o3.OooO0O0(objArr3, i3 - objArr3.length, objArr3, iOooO0oo2, objArr3.length);
                } else {
                    o3.OooO0O0(objArr3, 0, objArr3, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.OooO0o0;
                    o3.OooO0O0(objArr4, i3, objArr4, iOooO0oo2, objArr4.length - size);
                }
            }
            OooO0OO(iOooO0oo2, collection);
            return true;
        }
        int i5 = this.OooO0Oo;
        int length2 = i5 - size;
        Object[] objArr5 = this.OooO0o0;
        if (iOooO0oo2 < i5) {
            o3.OooO0O0(objArr5, length2, objArr5, i5, objArr5.length);
            Object[] objArr6 = this.OooO0o0;
            if (size >= iOooO0oo2) {
                o3.OooO0O0(objArr6, objArr6.length - size, objArr6, 0, iOooO0oo2);
            } else {
                o3.OooO0O0(objArr6, objArr6.length - size, objArr6, 0, size);
                Object[] objArr7 = this.OooO0o0;
                o3.OooO0O0(objArr7, 0, objArr7, size, iOooO0oo2);
            }
        } else if (length2 >= 0) {
            o3.OooO0O0(objArr5, length2, objArr5, i5, iOooO0oo2);
        } else {
            length2 += objArr5.length;
            int i6 = iOooO0oo2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                o3.OooO0O0(objArr5, length2, objArr5, i5, iOooO0oo2);
            } else {
                o3.OooO0O0(objArr5, length2, objArr5, i5, i5 + length3);
                Object[] objArr8 = this.OooO0o0;
                o3.OooO0O0(objArr8, 0, objArr8, this.OooO0Oo + length3, iOooO0oo2);
            }
        }
        this.OooO0Oo = length2;
        OooO0OO(OooO0o(iOooO0oo2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        OooO();
        OooO0Oo(this.OooO0o + 1);
        int length = this.OooO0Oo;
        if (length == 0) {
            Object[] objArr = this.OooO0o0;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.OooO0Oo = i;
        this.OooO0o0[i] = obj;
        this.OooO0o++;
    }

    public final void addLast(Object obj) {
        OooO();
        OooO0Oo(OooO00o() + 1);
        this.OooO0o0[OooO0oo(OooO00o() + this.OooO0Oo)] = obj;
        this.OooO0o = OooO00o() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            OooO();
            OooO0oO(this.OooO0Oo, OooO0oo(OooO00o() + this.OooO0Oo));
        }
        this.OooO0Oo = 0;
        this.OooO0o = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iOooO00o = OooO00o();
        if (i >= 0 && i < iOooO00o) {
            return this.OooO0o0[OooO0oo(this.OooO0Oo + i)];
        }
        ra.OooO0oO(px0.OooOOO0(i, iOooO00o, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iOooO0oo = OooO0oo(OooO00o() + this.OooO0Oo);
        int length = this.OooO0Oo;
        if (length < iOooO0oo) {
            while (length < iOooO0oo) {
                if (ij0.OooO00o(obj, this.OooO0o0[length])) {
                    i = this.OooO0Oo;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iOooO0oo) {
            return -1;
        }
        int length2 = this.OooO0o0.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iOooO0oo; i2++) {
                    if (ij0.OooO00o(obj, this.OooO0o0[i2])) {
                        length = i2 + this.OooO0o0.length;
                        i = this.OooO0Oo;
                    }
                }
                return -1;
            }
            if (ij0.OooO00o(obj, this.OooO0o0[length])) {
                i = this.OooO0Oo;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return OooO00o() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iOooO0oo = OooO0oo(this.OooO0o + this.OooO0Oo);
        int i2 = this.OooO0Oo;
        if (i2 < iOooO0oo) {
            length = iOooO0oo - 1;
            if (i2 <= length) {
                while (!ij0.OooO00o(obj, this.OooO0o0[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.OooO0Oo;
                return length - i;
            }
            return -1;
        }
        if (i2 > iOooO0oo) {
            while (true) {
                iOooO0oo--;
                Object[] objArr = this.OooO0o0;
                if (-1 >= iOooO0oo) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.OooO0Oo;
                    if (i3 <= length) {
                        while (!ij0.OooO00o(obj, this.OooO0o0[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.OooO0Oo;
                    }
                } else if (ij0.OooO00o(obj, objArr[iOooO0oo])) {
                    length = iOooO0oo + this.OooO0o0.length;
                    i = this.OooO0Oo;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        OooO0O0(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iOooO0oo;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.OooO0o0.length != 0) {
            int iOooO0oo2 = OooO0oo(this.OooO0o + this.OooO0Oo);
            int i = this.OooO0Oo;
            if (i < iOooO0oo2) {
                iOooO0oo = i;
                while (true) {
                    objArr = this.OooO0o0;
                    if (i >= iOooO0oo2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.OooO0o0[iOooO0oo] = obj;
                        iOooO0oo++;
                    }
                    i++;
                }
                objArr.getClass();
                Arrays.fill(objArr, iOooO0oo, iOooO0oo2, (Object) null);
            } else {
                int length = this.OooO0o0.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.OooO0o0;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.OooO0o0[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iOooO0oo = OooO0oo(i2);
                for (int i3 = 0; i3 < iOooO0oo2; i3++) {
                    Object[] objArr3 = this.OooO0o0;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.OooO0o0[iOooO0oo] = obj3;
                        iOooO0oo = OooO0o0(iOooO0oo);
                    }
                }
                z = z2;
            }
            if (z) {
                OooO();
                this.OooO0o = OooO0o(iOooO0oo - this.OooO0Oo);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        OooO();
        Object[] objArr = this.OooO0o0;
        int i = this.OooO0Oo;
        Object obj = objArr[i];
        objArr[i] = null;
        this.OooO0Oo = OooO0o0(i);
        this.OooO0o = OooO00o() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        OooO();
        int iOooO0oo = OooO0oo((size() - 1) + this.OooO0Oo);
        Object[] objArr = this.OooO0o0;
        Object obj = objArr[iOooO0oo];
        objArr[iOooO0oo] = null;
        this.OooO0o = OooO00o() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        fl2.OooO00o(i, i2, this.OooO0o);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.OooO0o) {
            clear();
            return;
        }
        if (i3 == 1) {
            OooO0O0(i);
            return;
        }
        OooO();
        int i4 = this.OooO0o - i2;
        int i5 = this.OooO0Oo;
        if (i < i4) {
            int iOooO0oo = OooO0oo((i - 1) + i5);
            int iOooO0oo2 = OooO0oo(this.OooO0Oo + (i2 - 1));
            while (i > 0) {
                int i6 = iOooO0oo + 1;
                int iMin = Math.min(i, Math.min(i6, iOooO0oo2 + 1));
                Object[] objArr = this.OooO0o0;
                int i7 = iOooO0oo2 - iMin;
                int i8 = iOooO0oo - iMin;
                o3.OooO0O0(objArr, i7 + 1, objArr, i8 + 1, i6);
                iOooO0oo = OooO0o(i8);
                iOooO0oo2 = OooO0o(i7);
                i -= iMin;
            }
            int iOooO0oo3 = OooO0oo(this.OooO0Oo + i3);
            OooO0oO(this.OooO0Oo, iOooO0oo3);
            this.OooO0Oo = iOooO0oo3;
        } else {
            int iOooO0oo4 = OooO0oo(i5 + i2);
            int iOooO0oo5 = OooO0oo(this.OooO0Oo + i);
            int i9 = this.OooO0o;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.OooO0o0;
                i2 = Math.min(i9, Math.min(objArr2.length - iOooO0oo4, objArr2.length - iOooO0oo5));
                Object[] objArr3 = this.OooO0o0;
                int i10 = iOooO0oo4 + i2;
                o3.OooO0O0(objArr3, iOooO0oo5, objArr3, iOooO0oo4, i10);
                iOooO0oo4 = OooO0oo(i10);
                iOooO0oo5 = OooO0oo(iOooO0oo5 + i2);
            }
            int iOooO0oo6 = OooO0oo(this.OooO0o + this.OooO0Oo);
            OooO0oO(OooO0o(iOooO0oo6 - i3), iOooO0oo6);
        }
        this.OooO0o -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iOooO0oo;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.OooO0o0.length != 0) {
            int iOooO0oo2 = OooO0oo(this.OooO0o + this.OooO0Oo);
            int i = this.OooO0Oo;
            if (i < iOooO0oo2) {
                iOooO0oo = i;
                while (true) {
                    objArr = this.OooO0o0;
                    if (i >= iOooO0oo2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.OooO0o0[iOooO0oo] = obj;
                        iOooO0oo++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                objArr.getClass();
                Arrays.fill(objArr, iOooO0oo, iOooO0oo2, (Object) null);
            } else {
                int length = this.OooO0o0.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.OooO0o0;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.OooO0o0[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iOooO0oo = OooO0oo(i2);
                for (int i3 = 0; i3 < iOooO0oo2; i3++) {
                    Object[] objArr3 = this.OooO0o0;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.OooO0o0[iOooO0oo] = obj3;
                        iOooO0oo = OooO0o0(iOooO0oo);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                OooO();
                this.OooO0o = OooO0o(iOooO0oo - this.OooO0Oo);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iOooO00o = OooO00o();
        if (i < 0 || i >= iOooO00o) {
            ra.OooO0oO(px0.OooOOO0(i, iOooO00o, "index: ", ", size: "));
            return null;
        }
        int iOooO0oo = OooO0oo(this.OooO0Oo + i);
        Object[] objArr = this.OooO0o0;
        Object obj2 = objArr[iOooO0oo];
        objArr[iOooO0oo] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        objArr.getClass();
        int length = objArr.length;
        int i = this.OooO0o;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iOooO0oo = OooO0oo(this.OooO0o + this.OooO0Oo);
        int i2 = this.OooO0Oo;
        if (i2 < iOooO0oo) {
            o3.OooO0OO(this.OooO0o0, i2, objArr, iOooO0oo, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.OooO0o0;
            o3.OooO0O0(objArr2, 0, objArr, this.OooO0Oo, objArr2.length);
            Object[] objArr3 = this.OooO0o0;
            o3.OooO0O0(objArr3, objArr3.length - this.OooO0Oo, objArr, 0, iOooO0oo);
        }
        int i3 = this.OooO0o;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[OooO00o()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        OooO();
        OooO0Oo(collection.size() + OooO00o());
        OooO0OO(OooO0oo(OooO00o() + this.OooO0Oo), collection);
        return true;
    }
}
