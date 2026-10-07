package com.cmaster.cloner;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vd2 implements Iterator {
    public static final vd2 OooO0Oo;
    public static final /* synthetic */ vd2[] OooO0o0;

    static {
        vd2 vd2Var = new vd2("INSTANCE", 0);
        OooO0Oo = vd2Var;
        OooO0o0 = new vd2[]{vd2Var};
    }

    public static vd2[] values() {
        return (vd2[]) OooO0o0.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        f73.OooO0OO("no calls to next() since the last call to remove()", false);
    }
}
