package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e6 extends hi {
    public hi[] o00Ooo;
    public int o00o0O;
    public boolean o00oO0O;
    public int o00oO0o;
    public int o00ooo;
    public boolean oo000o;

    @Override // com.cmaster.cloner.hi
    public final void OooO0O0(vm0 vm0Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        qh[] qhVarArr = this.Oooo0oo;
        qh qhVar = this.Oooo00O;
        qhVarArr[0] = qhVar;
        int i3 = 2;
        qh qhVar2 = this.Oooo00o;
        qhVarArr[2] = qhVar2;
        qh qhVar3 = this.Oooo0;
        qhVarArr[1] = qhVar3;
        qh qhVar4 = this.Oooo0O0;
        qhVarArr[3] = qhVar4;
        for (qh qhVar5 : qhVarArr) {
            qhVar5.OooO = vm0Var.OooOO0O(qhVar5);
        }
        int i4 = this.o00ooo;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        qh qhVar6 = qhVarArr[i4];
        if (!this.o00oO0O) {
            Oooo0O0();
        }
        if (this.o00oO0O) {
            this.o00oO0O = false;
            int i5 = this.o00ooo;
            if (i5 == 0 || i5 == 1) {
                vm0Var.OooO0Oo(qhVar.OooO, this.OoooOOO);
                vm0Var.OooO0Oo(qhVar3.OooO, this.OoooOOO);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    vm0Var.OooO0Oo(qhVar2.OooO, this.OoooOOo);
                    vm0Var.OooO0Oo(qhVar4.OooO, this.OoooOOo);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.o00o0O; i6++) {
            hi hiVar = this.o00Ooo[i6];
            if ((this.oo000o || hiVar.OooO0OO()) && ((((i2 = this.o00ooo) == 0 || i2 == 1) && hiVar.o00Oo0[0] == 3 && hiVar.Oooo00O.OooO0o != null && hiVar.Oooo0.OooO0o != null) || ((i2 == 2 || i2 == 3) && hiVar.o00Oo0[1] == 3 && hiVar.Oooo00o.OooO0o != null && hiVar.Oooo0O0.OooO0o != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = qhVar.OooO0o0() || qhVar3.OooO0o0();
        boolean z4 = qhVar2.OooO0o0() || qhVar4.OooO0o0();
        int i7 = !(!z2 && (((i = this.o00ooo) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.o00o0O) {
            hi hiVar2 = this.o00Ooo[i8];
            if (this.oo000o || hiVar2.OooO0OO()) {
                wh1 wh1VarOooOO0O = vm0Var.OooOO0O(hiVar2.Oooo0oo[this.o00ooo]);
                qh[] qhVarArr2 = hiVar2.Oooo0oo;
                int i9 = this.o00ooo;
                qh qhVar7 = qhVarArr2[i9];
                qhVar7.OooO = wh1VarOooOO0O;
                qh qhVar8 = qhVar7.OooO0o;
                int i10 = (qhVar8 == null || qhVar8.OooO0Oo != this) ? 0 : qhVar7.OooO0oO;
                if (i9 == 0 || i9 == i3) {
                    wh1 wh1Var = qhVar6.OooO;
                    int i11 = this.o00oO0o - i10;
                    l3 l3VarOooOO0o = vm0Var.OooOO0o();
                    wh1 wh1VarOooOOO0 = vm0Var.OooOOO0();
                    wh1VarOooOOO0.OooO0oO = 0;
                    l3VarOooOO0o.OooO0OO(wh1Var, wh1VarOooOO0O, wh1VarOooOOO0, i11);
                    vm0Var.OooO0OO(l3VarOooOO0o);
                } else {
                    wh1 wh1Var2 = qhVar6.OooO;
                    int i12 = this.o00oO0o + i10;
                    l3 l3VarOooOO0o2 = vm0Var.OooOO0o();
                    wh1 wh1VarOooOOO02 = vm0Var.OooOOO0();
                    wh1VarOooOOO02.OooO0oO = 0;
                    l3VarOooOO0o2.OooO0O0(wh1Var2, wh1VarOooOO0O, wh1VarOooOOO02, i12);
                    vm0Var.OooO0OO(l3VarOooOO0o2);
                }
                vm0Var.OooO0o0(qhVar6.OooO, wh1VarOooOO0O, this.o00oO0o + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.o00ooo;
        if (i13 == 0) {
            vm0Var.OooO0o0(qhVar3.OooO, qhVar.OooO, 0, 8);
            vm0Var.OooO0o0(qhVar.OooO, this.OoooO0.Oooo0.OooO, 0, 4);
            vm0Var.OooO0o0(qhVar.OooO, this.OoooO0.Oooo00O.OooO, 0, 0);
            return;
        }
        if (i13 == 1) {
            vm0Var.OooO0o0(qhVar.OooO, qhVar3.OooO, 0, 8);
            vm0Var.OooO0o0(qhVar.OooO, this.OoooO0.Oooo00O.OooO, 0, 4);
            vm0Var.OooO0o0(qhVar.OooO, this.OoooO0.Oooo0.OooO, 0, 0);
        } else if (i13 == 2) {
            vm0Var.OooO0o0(qhVar4.OooO, qhVar2.OooO, 0, 8);
            vm0Var.OooO0o0(qhVar2.OooO, this.OoooO0.Oooo0O0.OooO, 0, 4);
            vm0Var.OooO0o0(qhVar2.OooO, this.OoooO0.Oooo00o.OooO, 0, 0);
        } else if (i13 == 3) {
            vm0Var.OooO0o0(qhVar2.OooO, qhVar4.OooO, 0, 8);
            vm0Var.OooO0o0(qhVar2.OooO, this.OoooO0.Oooo00o.OooO, 0, 4);
            vm0Var.OooO0o0(qhVar2.OooO, this.OoooO0.Oooo0O0.OooO, 0, 0);
        }
    }

    @Override // com.cmaster.cloner.hi
    public final boolean OooO0OO() {
        return true;
    }

    @Override // com.cmaster.cloner.hi
    public final boolean OooOo0O() {
        return this.o00oO0O;
    }

    @Override // com.cmaster.cloner.hi
    public final boolean OooOo0o() {
        return this.o00oO0O;
    }

    public final void Oooo0(int i, ky1 ky1Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.o00o0O; i2++) {
            hi hiVar = this.o00Ooo[i2];
            ArrayList arrayList2 = ky1Var.OooO00o;
            if (!arrayList2.contains(hiVar)) {
                arrayList2.add(hiVar);
            }
        }
        for (int i3 = 0; i3 < this.o00o0O; i3++) {
            fs2.OooO00o(this.o00Ooo[i3], i, arrayList, ky1Var);
        }
    }

    public final boolean Oooo0O0() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.o00o0O;
            if (i4 >= i) {
                break;
            }
            hi hiVar = this.o00Ooo[i4];
            if ((this.oo000o || hiVar.OooO0OO()) && ((((i2 = this.o00ooo) == 0 || i2 == 1) && !hiVar.OooOo0O()) || (((i3 = this.o00ooo) == 2 || i3 == 3) && !hiVar.OooOo0o()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.o00o0O; i5++) {
            hi hiVar2 = this.o00Ooo[i5];
            if (this.oo000o || hiVar2.OooO0OO()) {
                if (!z2) {
                    int i6 = this.o00ooo;
                    if (i6 == 0) {
                        iMax = hiVar2.OooO0oO(2).OooO0OO();
                    } else if (i6 == 1) {
                        iMax = hiVar2.OooO0oO(4).OooO0OO();
                    } else if (i6 == 2) {
                        iMax = hiVar2.OooO0oO(3).OooO0OO();
                    } else if (i6 == 3) {
                        iMax = hiVar2.OooO0oO(5).OooO0OO();
                    }
                    z2 = true;
                }
                int i7 = this.o00ooo;
                if (i7 == 0) {
                    iMax = Math.min(iMax, hiVar2.OooO0oO(2).OooO0OO());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, hiVar2.OooO0oO(4).OooO0OO());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, hiVar2.OooO0oO(3).OooO0OO());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, hiVar2.OooO0oO(5).OooO0OO());
                }
            }
        }
        int i8 = iMax + this.o00oO0o;
        int i9 = this.o00ooo;
        if (i9 == 0 || i9 == 1) {
            OooOoOO(i8, i8);
        } else {
            OooOoo0(i8, i8);
        }
        this.o00oO0O = true;
        return true;
    }

    public final int Oooo0OO() {
        int i = this.o00ooo;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // com.cmaster.cloner.hi
    public final String toString() {
        String strOooO0oO = rj.OooO0oO(new StringBuilder("[Barrier] "), this.OooooOo, " {");
        for (int i = 0; i < this.o00o0O; i++) {
            hi hiVar = this.o00Ooo[i];
            if (i > 0) {
                strOooO0oO = strOooO0oO.concat(", ");
            }
            StringBuilder sbOooOO0 = rj.OooOO0(strOooO0oO);
            sbOooOO0.append(hiVar.OooooOo);
            strOooO0oO = sbOooOO0.toString();
        }
        return strOooO0oO.concat("}");
    }
}
