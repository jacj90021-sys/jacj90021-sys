package com.cmaster.cloner;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zb3 extends d73 {
    public final transient hg2 OooO0o;
    public final transient Object[] OooO0oO;
    public final transient int OooO0oo = 1;

    public zb3(hg2 hg2Var, Object[] objArr) {
        this.OooO0o = hg2Var;
        this.OooO0oO = objArr;
    }

    @Override // com.cmaster.cloner.dx2
    public final int OooO00o(Object[] objArr) {
        u33 ra3Var = this.OooO0o0;
        if (ra3Var == null) {
            ra3Var = new ra3(this);
            this.OooO0o0 = ra3Var;
        }
        return ra3Var.OooO00o(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.OooO0o.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        u33 ra3Var = this.OooO0o0;
        if (ra3Var == null) {
            ra3Var = new ra3(this);
            this.OooO0o0 = ra3Var;
        }
        return ra3Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.OooO0oo;
    }
}
