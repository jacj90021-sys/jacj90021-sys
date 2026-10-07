package com.cmaster.cloner;

import java.util.ListIterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00oO0o extends oo000o implements ListIterator {
    public final /* synthetic */ o0OOO0o OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(o0OOO0o o0ooo0o, int i) {
        super(o0ooo0o, 0);
        this.OooO0oO = o0ooo0o;
        int iOooO00o = o0ooo0o.OooO00o();
        if (i < 0 || i > iOooO00o) {
            ra.OooO0oO(px0.OooOOO0(i, iOooO00o, "index: ", ", size: "));
            throw null;
        }
        this.OooO0o0 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.OooO0o0 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.OooO0o0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            sa.OooOO0O();
            return null;
        }
        int i = this.OooO0o0 - 1;
        this.OooO0o0 = i;
        return this.OooO0oO.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.OooO0o0 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
