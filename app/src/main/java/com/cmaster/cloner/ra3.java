package com.cmaster.cloner;

import java.util.AbstractMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ra3 extends u33 {
    public final /* synthetic */ zb3 OooO0o;

    public ra3(zb3 zb3Var) {
        this.OooO0o = zb3Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        zb3 zb3Var = this.OooO0o;
        y73.OooO00o(i, zb3Var.OooO0oo);
        Object[] objArr = zb3Var.OooO0oO;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.OooO0o.OooO0oo;
    }
}
