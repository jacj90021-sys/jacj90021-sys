package com.cmaster.cloner;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class k3 extends gh1 implements Map {

    public k3(int i2) {
        super(i2);
    }
    public d3 OooO;
    public qb2 OooO0oO;
    public i3 OooO0oo;

    public final boolean OooOO0O(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean OooOO0o(Collection collection) {
        int i = this.OooO0o;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.OooO0o;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        qb2 qb2Var = this.OooO0oO;
        if (qb2Var != null) {
            return qb2Var;
        }
        qb2 qb2Var2 = new qb2(2, this);
        this.OooO0oO = qb2Var2;
        return qb2Var2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        i3 i3Var = this.OooO0oo;
        if (i3Var != null) {
            return i3Var;
        }
        i3 i3Var2 = new i3(this);
        this.OooO0oo = i3Var2;
        return i3Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        OooO0O0(map.size() + this.OooO0o);
        for (Map.Entry entry : (java.util.Set<Map.Entry>) map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d3 d3Var = this.OooO;
        if (d3Var != null) {
            return d3Var;
        }
        d3 d3Var2 = new d3(this, 1);
        this.OooO = d3Var2;
        return d3Var2;
    }
}
