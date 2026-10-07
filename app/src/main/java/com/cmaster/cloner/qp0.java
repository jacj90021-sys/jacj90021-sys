package com.cmaster.cloner;

import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qp0 extends sp0 implements Iterator {
    public final /* synthetic */ int OooO0oo;

    public qp0(tp0 tp0Var, int i) {
        this.OooO0oo = i;
        tp0Var.getClass();
        this.OooO0oO = tp0Var;
        this.OooO0o0 = -1;
        this.OooO0o = tp0Var.OooOO0O;
        OooO0o0();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.OooO0oo) {
            case 0:
                OooO0O0();
                int i = this.OooO0Oo;
                tp0 tp0Var = (tp0) this.OooO0oO;
                if (i >= tp0Var.OooO) {
                    sa.OooOO0O();
                    break;
                } else {
                    this.OooO0Oo = i + 1;
                    this.OooO0o0 = i;
                    rp0 rp0Var = new rp0(tp0Var, i);
                    OooO0o0();
                    break;
                }
            case 1:
                OooO0O0();
                int i2 = this.OooO0Oo;
                tp0 tp0Var2 = (tp0) this.OooO0oO;
                if (i2 >= tp0Var2.OooO) {
                    sa.OooOO0O();
                    break;
                } else {
                    this.OooO0Oo = i2 + 1;
                    this.OooO0o0 = i2;
                    Object obj = tp0Var2.OooO0Oo[i2];
                    OooO0o0();
                    break;
                }
            default:
                OooO0O0();
                int i3 = this.OooO0Oo;
                tp0 tp0Var3 = (tp0) this.OooO0oO;
                if (i3 >= tp0Var3.OooO) {
                    sa.OooOO0O();
                    break;
                } else {
                    this.OooO0Oo = i3 + 1;
                    this.OooO0o0 = i3;
                    Object[] objArr = tp0Var3.OooO0o0;
                    objArr.getClass();
                    Object obj2 = objArr[this.OooO0o0];
                    OooO0o0();
                    break;
                }
        }
        return null;
    }
}
