package com.cmaster.cloner;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m3 implements Collection, Set {
    public int[] OooO0Oo;
    public int OooO0o;
    public Object[] OooO0o0;

    public m3(int i) {
        this.OooO0Oo = tf0.OooO00o;
        this.OooO0o0 = tf0.OooO0O0;
        if (i > 0) {
            this.OooO0Oo = new int[i];
            this.OooO0o0 = new Object[i];
        }
    }

    public final void OooO00o(int i) {
        int i2 = this.OooO0o;
        Object[] objArr = this.OooO0o0;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.OooO0Oo;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                o3.OooO00o(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.OooO0o0;
                o3.OooO0O0(objArr2, i, objArr2, i4, i2);
            }
            this.OooO0o0[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.OooO0Oo = iArr2;
            this.OooO0o0 = new Object[i5];
            if (i > 0) {
                o3.OooO00o(0, 0, i, iArr, iArr2);
                o3.OooO0OO(objArr, 0, this.OooO0o0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                o3.OooO00o(i, i6, i2, iArr, this.OooO0Oo);
                o3.OooO0O0(objArr, i, this.OooO0o0, i6, i2);
            }
        }
        if (i2 == this.OooO0o) {
            this.OooO0o = i3;
        } else {
            sa.OooO0O0();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iOooO00o;
        int i2 = this.OooO0o;
        if (obj == null) {
            iOooO00o = dn2.OooO00o(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iOooO00o = dn2.OooO00o(this, obj, iHashCode);
        }
        if (iOooO00o >= 0) {
            return false;
        }
        int i3 = ~iOooO00o;
        int[] iArr = this.OooO0Oo;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.OooO0o0;
            int[] iArr2 = new int[i4];
            this.OooO0Oo = iArr2;
            this.OooO0o0 = new Object[i4];
            if (i2 != this.OooO0o) {
                sa.OooO0O0();
                return false;
            }
            if (iArr2.length != 0) {
                o3.OooO00o(0, 0, iArr.length, iArr, iArr2);
                o3.OooO0OO(objArr, 0, this.OooO0o0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.OooO0Oo;
            int i5 = i3 + 1;
            o3.OooO00o(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.OooO0o0;
            o3.OooO0O0(objArr2, i5, objArr2, i3, i2);
        }
        int i6 = this.OooO0o;
        if (i2 == i6) {
            int[] iArr4 = this.OooO0Oo;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.OooO0o0[i3] = obj;
                this.OooO0o = i6 + 1;
                return true;
            }
        }
        sa.OooO0O0();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.OooO0o;
        int i = this.OooO0o;
        int[] iArr = this.OooO0Oo;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.OooO0o0;
            int[] iArr2 = new int[size];
            this.OooO0Oo = iArr2;
            this.OooO0o0 = new Object[size];
            if (i > 0) {
                o3.OooO00o(0, 0, i, iArr, iArr2);
                o3.OooO0OO(objArr, 0, this.OooO0o0, this.OooO0o, 6);
            }
        }
        if (this.OooO0o != i) {
            sa.OooO0O0();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.OooO0o != 0) {
            this.OooO0Oo = tf0.OooO00o;
            this.OooO0o0 = tf0.OooO0O0;
            this.OooO0o = 0;
        }
        if (this.OooO0o == 0) {
            return;
        }
        sa.OooO0O0();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? dn2.OooO00o(this, null, 0) : dn2.OooO00o(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.OooO0o != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.OooO0o;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.OooO0o0[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.OooO0Oo;
        int i = this.OooO0o;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.OooO0o <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h3(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iOooO00o = obj == null ? dn2.OooO00o(this, null, 0) : dn2.OooO00o(this, obj, obj.hashCode());
        if (iOooO00o < 0) {
            return false;
        }
        OooO00o(iOooO00o);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.OooO0o - 1; -1 < i; i--) {
            if (!collection.contains(this.OooO0o0[i])) {
                OooO00o(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.OooO0o;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.OooO0o;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        o3.OooO0O0(this.OooO0o0, 0, objArr, 0, this.OooO0o);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.OooO0o * 14);
        sb.append('{');
        int i = this.OooO0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.OooO0o0[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return o3.OooO0Oo(this.OooO0o0, 0, this.OooO0o);
    }
}
