package com.cmaster.cloner;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h52 extends r42 {
    public final transient Object[] OooO;
    public final transient t52 OooO0oo;
    public final transient int OooOO0;

    public h52(t52 t52Var, Object[] objArr, int i) {
        super(0);
        this.OooO0oo = t52Var;
        this.OooO = objArr;
        this.OooOO0 = i;
    }

    @Override // com.cmaster.cloner.m32
    public final int OooO00o(Object[] objArr) {
        d42 e52Var = this.OooO0oO;
        if (e52Var == null) {
            e52Var = new e52(this);
            this.OooO0oO = e52Var;
        }
        return e52Var.OooO00o(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.OooO0oo.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        d42 e52Var = this.OooO0oO;
        if (e52Var == null) {
            e52Var = new e52(this);
            this.OooO0oO = e52Var;
        }
        return e52Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.OooOO0;
    }
}
