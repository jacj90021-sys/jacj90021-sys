package com.cmaster.cloner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class d3 implements Collection {
    public final /* synthetic */ int OooO0Oo;
    public final Object OooO0o0;

    public /* synthetic */ d3(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((k3) this.OooO0o0).clear();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i;
        int i2 = this.OooO0Oo;
        Object obj2 = this.OooO0o0;
        switch (i2) {
            case 0:
                Object[] objArr = (Object[]) obj2;
                if (obj == null) {
                    int length = objArr.length;
                    i = 0;
                    while (i < length) {
                        if (objArr[i] != null) {
                            i++;
                        }
                    }
                    i = -1;
                } else {
                    int length2 = objArr.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (obj.equals(objArr[i3])) {
                            i = i3;
                        }
                    }
                    i = -1;
                }
                if (i >= 0) {
                    break;
                }
                break;
            default:
                if (((k3) obj2).OooO00o(obj) >= 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.OooO0Oo) {
            case 0:
                collection.getClass();
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                return ((Object[]) obj).length == 0;
            default:
                return ((k3) obj).isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                return new f3((Object[]) obj, 0);
            default:
                return new h3((k3) obj, 1);
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                k3 k3Var = (k3) this.OooO0o0;
                int iOooO00o = k3Var.OooO00o(obj);
                if (iOooO00o < 0) {
                    return false;
                }
                k3Var.OooO0oo(iOooO00o);
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                k3 k3Var = (k3) this.OooO0o0;
                int i = k3Var.OooO0o;
                int i2 = 0;
                boolean z = false;
                while (i2 < i) {
                    if (collection.contains(k3Var.OooOO0(i2))) {
                        k3Var.OooO0oo(i2);
                        i2--;
                        i--;
                        z = true;
                    }
                    i2++;
                }
                return z;
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                k3 k3Var = (k3) this.OooO0o0;
                int i = k3Var.OooO0o;
                int i2 = 0;
                boolean z = false;
                while (i2 < i) {
                    if (!collection.contains(k3Var.OooOO0(i2))) {
                        k3Var.OooO0oo(i2);
                        i2--;
                        i--;
                        z = true;
                    }
                    i2++;
                }
                return z;
        }
    }

    @Override // java.util.Collection
    public final int size() {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                return ((Object[]) obj).length;
            default:
                return ((k3) obj).OooO0o;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.OooO0Oo) {
            case 0:
                objArr.getClass();
                return i50.OooO0O0(this, objArr);
            default:
                k3 k3Var = (k3) this.OooO0o0;
                int i = k3Var.OooO0o;
                if (objArr.length < i) {
                    objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
                }
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = k3Var.OooOO0(i2);
                }
                if (objArr.length > i) {
                    objArr[i] = null;
                }
                return objArr;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) obj;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
                objArrCopyOf.getClass();
                return objArrCopyOf;
            default:
                k3 k3Var = (k3) obj;
                int i2 = k3Var.OooO0o;
                Object[] objArr2 = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr2[i3] = k3Var.OooOO0(i3);
                }
                return objArr2;
        }
    }
}
