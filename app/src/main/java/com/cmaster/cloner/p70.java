package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p70 extends ly1 {
    @Override // com.cmaster.cloner.qp
    public final void OooO00o(qp qpVar) {
        e6 e6Var = (e6) this.OooO0O0;
        int i = e6Var.o00ooo;
        up upVar = this.OooO0oo;
        ArrayList arrayList = upVar.OooOO0o;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((up) obj).OooO0oO;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            upVar.OooO0Oo(i3 + e6Var.o00oO0o);
        } else {
            upVar.OooO0Oo(i2 + e6Var.o00oO0o);
        }
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0Oo() {
        hi hiVar = this.OooO0O0;
        if (hiVar instanceof e6) {
            up upVar = this.OooO0oo;
            upVar.OooO0O0 = true;
            ArrayList arrayList = upVar.OooOO0o;
            e6 e6Var = (e6) hiVar;
            int i = e6Var.o00ooo;
            boolean z = e6Var.oo000o;
            int i2 = 0;
            if (i == 0) {
                upVar.OooO0o0 = 4;
                while (i2 < e6Var.o00o0O) {
                    hi hiVar2 = e6Var.o00Ooo[i2];
                    if (z || hiVar2.OooooOO != 8) {
                        up upVar2 = hiVar2.OooO0Oo.OooO0oo;
                        upVar2.OooOO0O.add(upVar);
                        arrayList.add(upVar2);
                    }
                    i2++;
                }
                OooOOO0(this.OooO0O0.OooO0Oo.OooO0oo);
                OooOOO0(this.OooO0O0.OooO0Oo.OooO);
                return;
            }
            if (i == 1) {
                upVar.OooO0o0 = 5;
                while (i2 < e6Var.o00o0O) {
                    hi hiVar3 = e6Var.o00Ooo[i2];
                    if (z || hiVar3.OooooOO != 8) {
                        up upVar3 = hiVar3.OooO0Oo.OooO;
                        upVar3.OooOO0O.add(upVar);
                        arrayList.add(upVar3);
                    }
                    i2++;
                }
                OooOOO0(this.OooO0O0.OooO0Oo.OooO0oo);
                OooOOO0(this.OooO0O0.OooO0Oo.OooO);
                return;
            }
            if (i == 2) {
                upVar.OooO0o0 = 6;
                while (i2 < e6Var.o00o0O) {
                    hi hiVar4 = e6Var.o00Ooo[i2];
                    if (z || hiVar4.OooooOO != 8) {
                        up upVar4 = hiVar4.OooO0o0.OooO0oo;
                        upVar4.OooOO0O.add(upVar);
                        arrayList.add(upVar4);
                    }
                    i2++;
                }
                OooOOO0(this.OooO0O0.OooO0o0.OooO0oo);
                OooOOO0(this.OooO0O0.OooO0o0.OooO);
                return;
            }
            if (i != 3) {
                return;
            }
            upVar.OooO0o0 = 7;
            while (i2 < e6Var.o00o0O) {
                hi hiVar5 = e6Var.o00Ooo[i2];
                if (z || hiVar5.OooooOO != 8) {
                    up upVar5 = hiVar5.OooO0o0.OooO;
                    upVar5.OooOO0O.add(upVar);
                    arrayList.add(upVar5);
                }
                i2++;
            }
            OooOOO0(this.OooO0O0.OooO0o0.OooO0oo);
            OooOOO0(this.OooO0O0.OooO0o0.OooO);
        }
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0o() {
        this.OooO0OO = null;
        this.OooO0oo.OooO0OO();
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0o0() {
        hi hiVar = this.OooO0O0;
        if (hiVar instanceof e6) {
            int i = ((e6) hiVar).o00ooo;
            up upVar = this.OooO0oo;
            if (i == 0 || i == 1) {
                hiVar.OoooOOO = upVar.OooO0oO;
            } else {
                hiVar.OoooOOo = upVar.OooO0oO;
            }
        }
    }

    @Override // com.cmaster.cloner.ly1
    public final boolean OooOO0O() {
        return false;
    }

    public final void OooOOO0(up upVar) {
        up upVar2 = this.OooO0oo;
        upVar2.OooOO0O.add(upVar);
        upVar.OooOO0o.add(upVar2);
    }
}
