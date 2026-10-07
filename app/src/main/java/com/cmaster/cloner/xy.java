package com.cmaster.cloner;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xy extends AbstractSet {
    public f3 OooO0Oo;
    public final Object[] OooO0o0;

    public xy(Object[] objArr) {
        this.OooO0o0 = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f3 f3Var = this.OooO0Oo;
        if (f3Var != null) {
            f3Var.OooO0o = 0;
            return f3Var;
        }
        f3 f3Var2 = new f3(this.OooO0o0, 1);
        this.OooO0Oo = f3Var2;
        return f3Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.OooO0o0.length;
    }
}
