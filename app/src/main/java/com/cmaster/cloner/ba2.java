package com.cmaster.cloner;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ba2 extends AbstractCollection {
    public final /* synthetic */ int OooO0Oo;
    public final Object OooO0o0;

    public ba2(k82 k82Var) {
        this.OooO0Oo = 2;
        this.OooO0o0 = k82Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                ((ma2) ((ia2) obj)).OooO0OO();
                break;
            case 1:
                ((fc2) obj).clear();
                break;
            default:
                ((k82) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        int i = this.OooO0Oo;
        Object obj2 = this.OooO0o0;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    p92 p92VarOooO00o = ((k82) ((ia2) obj2).OooO00o()).get(key);
                    if (p92VarOooO00o != null && p92VarOooO00o.contains(value)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((k82) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.OooO0Oo) {
            case 2:
                return ((k82) this.OooO0o0).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                ma2 ma2Var = (ma2) ((ia2) obj);
                ma2Var.getClass();
                return new z72(ma2Var);
            case 1:
                fc2 fc2Var = (fc2) obj;
                Map mapOooO0Oo = fc2Var.OooO0Oo();
                return mapOooO0Oo != null ? mapOooO0Oo.values().iterator() : new xa2(fc2Var, 2);
            default:
                return new pe2(((k82) obj).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        int i = this.OooO0Oo;
        Object obj2 = this.OooO0o0;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                p92 p92VarOooO00o = ((k82) ((ia2) obj2).OooO00o()).get(key);
                return p92VarOooO00o != null && p92VarOooO00o.remove(value);
            case 1:
            default:
                return super.remove(obj);
            case 2:
                k82 k82Var = (k82) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry2 : k82Var.entrySet()) {
                        if (e73.OooO00o(obj, entry2.getValue())) {
                            k82Var.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.OooO0Oo) {
            case 2:
                k82 k82Var = (k82) this.OooO0o0;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : k82Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return k82Var.OooO0oO.OooO0O0().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.OooO0Oo) {
            case 2:
                k82 k82Var = (k82) this.OooO0o0;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : k82Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return k82Var.OooO0oO.OooO0O0().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                return ((ma2) ((ia2) obj)).OooO0oo;
            case 1:
                return ((fc2) obj).size();
            default:
                return ((k82) obj).OooO0o.size();
        }
    }

    public /* synthetic */ ba2(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }
}
