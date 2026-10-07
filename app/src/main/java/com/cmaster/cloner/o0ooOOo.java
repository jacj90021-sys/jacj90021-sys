package com.cmaster.cloner;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0ooOOo extends o0OOO0o implements RandomAccess {
    public final o0OOO0o OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;

    public o0ooOOo(o0OOO0o o0ooo0o, int i, int i2) {
        this.OooO0Oo = o0ooo0o;
        this.OooO0o0 = i;
        fl2.OooO00o(i, i2, o0ooo0o.OooO00o());
        this.OooO0o = i2 - i;
    }

    @Override // com.cmaster.cloner.o0OOO0o
    public final int OooO00o() {
        return this.OooO0o;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.OooO0o;
        if (i < 0 || i >= i2) {
            ra.OooO0oO(px0.OooOOO0(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.OooO0Oo.get(this.OooO0o0 + i);
    }

    @Override // com.cmaster.cloner.o0OOO0o, java.util.List
    public final List subList(int i, int i2) {
        fl2.OooO00o(i, i2, this.OooO0o);
        int i3 = this.OooO0o0;
        return new o0ooOOo(this.OooO0Oo, i + i3, i3 + i2);
    }
}
