package com.cmaster.cloner;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tf2 extends ld2 {
    public final /* synthetic */ wf2 OooO0o;

    public tf2(wf2 wf2Var) {
        this.OooO0o = wf2Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        wf2 wf2Var = this.OooO0o;
        f73.OooO00o(i, wf2Var.OooO0oo);
        Object[] objArr = wf2Var.OooO0oO;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.OooO0o.OooO0oo;
    }
}
