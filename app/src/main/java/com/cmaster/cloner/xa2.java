package com.cmaster.cloner;

import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xa2 implements Iterator {
    public final /* synthetic */ fc2 OooO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public final /* synthetic */ fc2 OooO0oO;
    public final /* synthetic */ int OooO0oo;

    public xa2(fc2 fc2Var, int i) {
        this.OooO0oo = i;
        this.OooO = fc2Var;
        this.OooO0oO = fc2Var;
        this.OooO0Oo = fc2Var.OooO0oo;
        this.OooO0o0 = fc2Var.isEmpty() ? -1 : 0;
        this.OooO0o = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OooO0o0 >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object ac2Var;
        fc2 fc2Var = this.OooO0oO;
        if (fc2Var.OooO0oo != this.OooO0Oo) {
            sa.OooO0O0();
            return null;
        }
        if (!hasNext()) {
            sa.OooOO0O();
            return null;
        }
        int i = this.OooO0o0;
        this.OooO0o = i;
        int i2 = this.OooO0oo;
        fc2 fc2Var2 = this.OooO;
        switch (i2) {
            case 0:
                Object obj = fc2.OooOOO0;
                ac2Var = fc2Var2.OooO0O0()[i];
                break;
            case 1:
                ac2Var = new ac2(fc2Var2, i);
                break;
            default:
                Object obj2 = fc2.OooOOO0;
                ac2Var = fc2Var2.OooO0OO()[i];
                break;
        }
        int i3 = this.OooO0o0 + 1;
        if (i3 >= fc2Var.OooO) {
            i3 = -1;
        }
        this.OooO0o0 = i3;
        return ac2Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        fc2 fc2Var = this.OooO0oO;
        if (fc2Var.OooO0oo != this.OooO0Oo) {
            sa.OooO0O0();
            return;
        }
        f73.OooO0OO("no calls to next() since the last call to remove()", this.OooO0o >= 0);
        this.OooO0Oo += 32;
        fc2Var.remove(fc2Var.OooO0O0()[this.OooO0o]);
        this.OooO0o0--;
        this.OooO0o = -1;
    }
}
