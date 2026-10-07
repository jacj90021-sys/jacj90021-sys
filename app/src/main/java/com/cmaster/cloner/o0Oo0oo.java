package com.cmaster.cloner;

import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class o0Oo0oo extends AbstractList implements List {
    public abstract int OooO00o();

    public abstract Object OooO0O0(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return OooO0O0(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return OooO00o();
    }
}
