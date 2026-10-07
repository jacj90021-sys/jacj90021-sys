package com.cmaster.cloner;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wf2 extends sd2 {
    public final transient hg2 OooO0o;
    public final transient Object[] OooO0oO;
    public final transient int OooO0oo = 1;

    public wf2(hg2 hg2Var, Object[] objArr) {
        this.OooO0o = hg2Var;
        this.OooO0oO = objArr;
    }

    @Override // com.cmaster.cloner.uc2
    public final int OooO00o(Object[] objArr, int i) {
        ld2 tf2Var = this.OooO0o0;
        if (tf2Var == null) {
            tf2Var = new tf2(this);
            this.OooO0o0 = tf2Var;
        }
        return tf2Var.OooO00o(objArr, i);
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
        ld2 tf2Var = this.OooO0o0;
        if (tf2Var == null) {
            tf2Var = new tf2(this);
            this.OooO0o0 = tf2Var;
        }
        return tf2Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.OooO0oo;
    }
}
