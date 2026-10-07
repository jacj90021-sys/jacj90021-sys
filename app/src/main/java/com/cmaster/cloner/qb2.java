package com.cmaster.cloner;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qb2 extends AbstractSet {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Map OooO0o0;

    public /* synthetic */ qb2(int i, Map map) {
        this.OooO0Oo = i;
        this.OooO0o0 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.OooO0Oo;
        Map map = this.OooO0o0;
        switch (i) {
            case 0:
                ((fc2) map).clear();
                break;
            case 1:
                ((fc2) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.OooO0Oo;
        Map map = this.OooO0o0;
        switch (i) {
            case 0:
                fc2 fc2Var = (fc2) map;
                Map mapOooO0Oo = fc2Var.OooO0Oo();
                if (mapOooO0Oo != null) {
                    return mapOooO0Oo.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iOooO0oo = fc2Var.OooO0oo(entry.getKey());
                    if (iOooO0oo != -1 && e73.OooO00o(fc2Var.OooO0OO()[iOooO0oo], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((fc2) map).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.OooO0Oo;
        Map map = this.OooO0o0;
        switch (i) {
            case 0:
                fc2 fc2Var = (fc2) map;
                Map mapOooO0Oo = fc2Var.OooO0Oo();
                return mapOooO0Oo != null ? mapOooO0Oo.entrySet().iterator() : new xa2(fc2Var, 1);
            case 1:
                fc2 fc2Var2 = (fc2) map;
                Map mapOooO0Oo2 = fc2Var2.OooO0Oo();
                return mapOooO0Oo2 != null ? mapOooO0Oo2.keySet().iterator() : new xa2(fc2Var2, 0);
            default:
                return new j3((k3) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.OooO0Oo;
        Map map = this.OooO0o0;
        switch (i) {
            case 0:
                fc2 fc2Var = (fc2) map;
                Map mapOooO0Oo = fc2Var.OooO0Oo();
                if (mapOooO0Oo != null) {
                    return mapOooO0Oo.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!fc2Var.OooO0o()) {
                        int iOooO0oO = fc2Var.OooO0oO();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = fc2Var.OooO0Oo;
                        Objects.requireNonNull(obj2);
                        int iOooO00o = k73.OooO00o(key, value, iOooO0oO, obj2, fc2Var.OooO00o(), fc2Var.OooO0O0(), fc2Var.OooO0OO());
                        if (iOooO00o != -1) {
                            fc2Var.OooO0o0(iOooO00o, iOooO0oO);
                            fc2Var.OooO--;
                            fc2Var.OooO0oo += 32;
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                fc2 fc2Var2 = (fc2) map;
                Map mapOooO0Oo2 = fc2Var2.OooO0Oo();
                return mapOooO0Oo2 != null ? mapOooO0Oo2.keySet().remove(obj) : fc2Var2.OooOO0(obj) != fc2.OooOOO0;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.OooO0Oo;
        Map map = this.OooO0o0;
        switch (i) {
            case 0:
                return ((fc2) map).size();
            case 1:
                return ((fc2) map).size();
            default:
                return ((k3) map).OooO0o;
        }
    }
}
