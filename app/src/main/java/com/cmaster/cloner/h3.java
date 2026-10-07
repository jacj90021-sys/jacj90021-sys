package com.cmaster.cloner;

import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h3 implements Iterator {
    public int OooO0Oo;
    public boolean OooO0o;
    public int OooO0o0;
    public final /* synthetic */ int OooO0oO;
    public final /* synthetic */ Object OooO0oo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h3(k3 k3Var, int i) {
        this(k3Var.OooO0o);
        this.OooO0oO = i;
        switch (i) {
            case 1:
                this.OooO0oo = k3Var;
                this(k3Var.OooO0o);
                break;
            default:
                this.OooO0oo = k3Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OooO0o0 < this.OooO0Oo;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objOooO0o;
        if (!hasNext()) {
            sa.OooOO0O();
            return null;
        }
        int i = this.OooO0o0;
        int i2 = this.OooO0oO;
        Object obj = this.OooO0oo;
        switch (i2) {
            case 0:
                objOooO0o = ((k3) obj).OooO0o(i);
                break;
            case 1:
                objOooO0o = ((k3) obj).OooOO0(i);
                break;
            default:
                objOooO0o = ((m3) obj).OooO0o0[i];
                break;
        }
        this.OooO0o0++;
        this.OooO0o = true;
        return objOooO0o;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.OooO0o) {
            qa.OooO0o("Call next() before removing an element.");
            return;
        }
        int i = this.OooO0o0 - 1;
        this.OooO0o0 = i;
        int i2 = this.OooO0oO;
        Object obj = this.OooO0oo;
        switch (i2) {
            case 0:
                ((k3) obj).OooO0oo(i);
                break;
            case 1:
                ((k3) obj).OooO0oo(i);
                break;
            default:
                ((m3) obj).OooO00o(i);
                break;
        }
        this.OooO0Oo--;
        this.OooO0o = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h3(m3 m3Var) {
        this(m3Var.OooO0o);
        this.OooO0oO = 2;
        this.OooO0oo = m3Var;
    }

    public h3(int i) {
        this.OooO0Oo = i;
    }
}
