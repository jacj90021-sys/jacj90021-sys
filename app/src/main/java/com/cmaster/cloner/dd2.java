package com.cmaster.cloner;

import java.util.ListIterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dd2 extends o32 implements ListIterator {
    public int OooO0o;
    public final int OooO0o0;
    public final ld2 OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd2(ld2 ld2Var, int i) {
        super(3);
        int size = ld2Var.size();
        if (i < 0 || i > size) {
            ra.OooO0oO(f73.OooO0Oo(i, size, "index"));
            throw null;
        }
        this.OooO0o0 = size;
        this.OooO0o = i;
        this.OooO0oO = ld2Var;
    }

    public final Object OooO00o(int i) {
        return this.OooO0oO.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.OooO0o < this.OooO0o0;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.OooO0o > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            sa.OooOO0O();
            return null;
        }
        int i = this.OooO0o;
        this.OooO0o = i + 1;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.OooO0o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            sa.OooOO0O();
            return null;
        }
        int i = this.OooO0o - 1;
        this.OooO0o = i;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.OooO0o - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
