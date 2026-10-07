package com.cmaster.cloner;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e52 extends d42 {
    public final /* synthetic */ h52 OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e52(h52 h52Var) {
        super(0);
        this.OooO0oo = h52Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        h52 h52Var = this.OooO0oo;
        e83.OooO00o(i, h52Var.OooOO0);
        Object[] objArr = h52Var.OooO;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.OooO0oo.OooOO0;
    }
}
