package com.cmaster.cloner;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k82 extends AbstractMap {
    public transient c82 OooO0Oo;
    public final transient Map OooO0o;
    public transient ba2 OooO0o0;
    public final /* synthetic */ ma2 OooO0oO;

    public k82(ma2 ma2Var, Map map) {
        this.OooO0oO = ma2Var;
        this.OooO0o = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final p92 get(Object obj) {
        Object obj2;
        Map map = this.OooO0o;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        ma2 ma2Var = this.OooO0oO;
        ma2Var.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new b92(ma2Var, obj, list, null) : new p92(ma2Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.OooO0o;
        ma2 ma2Var = this.OooO0oO;
        if (map == ma2Var.OooO0oO) {
            ma2Var.OooO0OO();
            return;
        }
        g82 g82Var = new g82(this);
        while (g82Var.hasNext()) {
            g82Var.next();
            g82Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.OooO0o;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        c82 c82Var = this.OooO0Oo;
        if (c82Var != null) {
            return c82Var;
        }
        c82 c82Var2 = new c82(this);
        this.OooO0Oo = c82Var2;
        return c82Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.OooO0o.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.OooO0o.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.OooO0oO.OooO0O0();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.OooO0o.remove(obj);
        if (collection == null) {
            return null;
        }
        ma2 ma2Var = this.OooO0oO;
        ma2Var.getClass();
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(collection);
        ma2Var.OooO0oo -= collection.size();
        collection.clear();
        return arrayList;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.OooO0o.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.OooO0o.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        ba2 ba2Var = this.OooO0o0;
        if (ba2Var != null) {
            return ba2Var;
        }
        ba2 ba2Var2 = new ba2(this);
        this.OooO0o0 = ba2Var2;
        return ba2Var2;
    }
}
