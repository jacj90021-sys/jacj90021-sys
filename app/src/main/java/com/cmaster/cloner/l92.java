package com.cmaster.cloner;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l92 extends g82 implements ListIterator {
    public final /* synthetic */ p92 OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l92(p92 p92Var, int i) {
        super(p92Var, ((List) p92Var.OooO0o0).listIterator(i));
        this.OooO0oo = p92Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        p92 p92Var = this.OooO0oo;
        boolean zIsEmpty = p92Var.isEmpty();
        OooO00o();
        ((ListIterator) this.OooO0o0).add(obj);
        p92Var.OooO.OooO0oo++;
        if (zIsEmpty) {
            p92Var.OooO00o();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        OooO00o();
        return ((ListIterator) this.OooO0o0).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        OooO00o();
        return ((ListIterator) this.OooO0o0).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        OooO00o();
        return ((ListIterator) this.OooO0o0).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        OooO00o();
        return ((ListIterator) this.OooO0o0).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        OooO00o();
        ((ListIterator) this.OooO0o0).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l92(p92 p92Var) {
        super(p92Var);
        this.OooO0oo = p92Var;
    }
}
