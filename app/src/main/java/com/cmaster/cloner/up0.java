package com.cmaster.cloner;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class up0 extends o0OO00O {
    public final /* synthetic */ int OooO0Oo;
    public final tp0 OooO0o0;

    public /* synthetic */ up0(tp0 tp0Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = tp0Var;
    }

    @Override // com.cmaster.cloner.o0OO00O
    public final int OooO00o() {
        switch (this.OooO0Oo) {
        }
        return this.OooO0o0.OooOO0o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.OooO0Oo) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.OooO0Oo;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.OooO0Oo) {
            case 0:
                this.OooO0o0.clear();
                break;
            default:
                this.OooO0o0.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.OooO0Oo;
        tp0 tp0Var = this.OooO0o0;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                tp0Var.getClass();
                int iOooO0oO = tp0Var.OooO0oO(entry.getKey());
                if (iOooO0oO < 0) {
                    return false;
                }
                Object[] objArr = tp0Var.OooO0o0;
                objArr.getClass();
                return ij0.OooO00o(objArr[iOooO0oO], entry.getValue());
            default:
                return tp0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.OooO0Oo) {
            case 0:
                collection.getClass();
                return this.OooO0o0.OooO0o0(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.OooO0Oo) {
        }
        return this.OooO0o0.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.OooO0Oo;
        tp0 tp0Var = this.OooO0o0;
        switch (i) {
            case 0:
                tp0Var.getClass();
                return new qp0(tp0Var, 0);
            default:
                tp0Var.getClass();
                return new qp0(tp0Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.OooO0Oo;
        tp0 tp0Var = this.OooO0o0;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    tp0Var.getClass();
                    tp0Var.OooO0OO();
                    int iOooO0oO = tp0Var.OooO0oO(entry.getKey());
                    if (iOooO0oO >= 0) {
                        Object[] objArr = tp0Var.OooO0o0;
                        objArr.getClass();
                        if (ij0.OooO00o(objArr[iOooO0oO], entry.getValue())) {
                            tp0Var.OooOO0O(iOooO0oO);
                            break;
                        }
                    }
                }
                break;
            default:
                tp0Var.OooO0OO();
                int iOooO0oO2 = tp0Var.OooO0oO(obj);
                if (iOooO0oO2 >= 0) {
                    tp0Var.OooOO0O(iOooO0oO2);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.OooO0Oo;
        tp0 tp0Var = this.OooO0o0;
        collection.getClass();
        switch (i) {
            case 0:
                tp0Var.OooO0OO();
                break;
            default:
                tp0Var.OooO0OO();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.OooO0Oo;
        tp0 tp0Var = this.OooO0o0;
        collection.getClass();
        switch (i) {
            case 0:
                tp0Var.OooO0OO();
                break;
            default:
                tp0Var.OooO0OO();
                break;
        }
        return super.retainAll(collection);
    }
}
