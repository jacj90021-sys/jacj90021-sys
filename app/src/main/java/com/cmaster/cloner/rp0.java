package com.cmaster.cloner;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rp0 implements Map.Entry {
    public final tp0 OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;

    public rp0(tp0 tp0Var, int i) {
        tp0Var.getClass();
        this.OooO0Oo = tp0Var;
        this.OooO0o0 = i;
        this.OooO0o = tp0Var.OooOO0O;
    }

    public final void OooO00o() {
        if (this.OooO0Oo.OooOO0O != this.OooO0o) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ij0.OooO00o(entry.getKey(), getKey()) && ij0.OooO00o(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        OooO00o();
        return this.OooO0Oo.OooO0Oo[this.OooO0o0];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        OooO00o();
        Object[] objArr = this.OooO0Oo.OooO0o0;
        objArr.getClass();
        return objArr[this.OooO0o0];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        OooO00o();
        tp0 tp0Var = this.OooO0Oo;
        tp0Var.OooO0OO();
        Object[] objArr = tp0Var.OooO0o0;
        if (objArr == null) {
            int length = tp0Var.OooO0Oo.length;
            if (length < 0) {
                ra.OooOOO("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            tp0Var.OooO0o0 = objArr;
        }
        int i = this.OooO0o0;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
