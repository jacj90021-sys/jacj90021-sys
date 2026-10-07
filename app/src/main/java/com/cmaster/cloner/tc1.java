package com.cmaster.cloner;

import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tc1 implements Map.Entry {
    public final Object OooO0Oo;
    public tc1 OooO0o;
    public final Object OooO0o0;
    public tc1 OooO0oO;

    public tc1(Object obj, Object obj2) {
        this.OooO0Oo = obj;
        this.OooO0o0 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tc1)) {
            return false;
        }
        tc1 tc1Var = (tc1) obj;
        return this.OooO0Oo.equals(tc1Var.OooO0Oo) && this.OooO0o0.equals(tc1Var.OooO0o0);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.OooO0Oo;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.OooO0o0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.OooO0o0.hashCode() ^ this.OooO0Oo.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.OooO0Oo + "=" + this.OooO0o0;
    }
}
