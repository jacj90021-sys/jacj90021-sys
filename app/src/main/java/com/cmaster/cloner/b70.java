package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b70 extends hi {
    public boolean o00oO0O;
    public float o00Ooo = -1.0f;
    public int o00o0O = -1;
    public int o00ooo = -1;
    public qh oo000o = this.Oooo00o;
    public int o00oO0o = 0;

    public b70() {
        this.Oooo.clear();
        this.Oooo.add(this.oo000o);
        int length = this.Oooo0oo.length;
        for (int i = 0; i < length; i++) {
            this.Oooo0oo[i] = this.oo000o;
        }
    }

    @Override // com.cmaster.cloner.hi
    public final void OooO0O0(vm0 vm0Var, boolean z) {
        ii iiVar = (ii) this.OoooO0;
        if (iiVar == null) {
            return;
        }
        Object objOooO0oO = iiVar.OooO0oO(2);
        Object objOooO0oO2 = iiVar.OooO0oO(4);
        hi hiVar = this.OoooO0;
        boolean z2 = hiVar != null && hiVar.o00Oo0[0] == 2;
        if (this.o00oO0o == 0) {
            objOooO0oO = iiVar.OooO0oO(3);
            objOooO0oO2 = iiVar.OooO0oO(5);
            hi hiVar2 = this.OoooO0;
            z2 = hiVar2 != null && hiVar2.o00Oo0[1] == 2;
        }
        if (this.o00oO0O) {
            qh qhVar = this.oo000o;
            if (qhVar.OooO0OO) {
                wh1 wh1VarOooOO0O = vm0Var.OooOO0O(qhVar);
                vm0Var.OooO0Oo(wh1VarOooOO0O, this.oo000o.OooO0OO());
                if (this.o00o0O != -1) {
                    if (z2) {
                        vm0Var.OooO0o(vm0Var.OooOO0O(objOooO0oO2), wh1VarOooOO0O, 0, 5);
                    }
                } else if (this.o00ooo != -1 && z2) {
                    wh1 wh1VarOooOO0O2 = vm0Var.OooOO0O(objOooO0oO2);
                    vm0Var.OooO0o(wh1VarOooOO0O, vm0Var.OooOO0O(objOooO0oO), 0, 5);
                    vm0Var.OooO0o(wh1VarOooOO0O2, wh1VarOooOO0O, 0, 5);
                }
                this.o00oO0O = false;
                return;
            }
        }
        if (this.o00o0O != -1) {
            wh1 wh1VarOooOO0O3 = vm0Var.OooOO0O(this.oo000o);
            vm0Var.OooO0o0(wh1VarOooOO0O3, vm0Var.OooOO0O(objOooO0oO), this.o00o0O, 8);
            if (z2) {
                vm0Var.OooO0o(vm0Var.OooOO0O(objOooO0oO2), wh1VarOooOO0O3, 0, 5);
                return;
            }
            return;
        }
        if (this.o00ooo != -1) {
            wh1 wh1VarOooOO0O4 = vm0Var.OooOO0O(this.oo000o);
            wh1 wh1VarOooOO0O5 = vm0Var.OooOO0O(objOooO0oO2);
            vm0Var.OooO0o0(wh1VarOooOO0O4, wh1VarOooOO0O5, -this.o00ooo, 8);
            if (z2) {
                vm0Var.OooO0o(wh1VarOooOO0O4, vm0Var.OooOO0O(objOooO0oO), 0, 5);
                vm0Var.OooO0o(wh1VarOooOO0O5, wh1VarOooOO0O4, 0, 5);
                return;
            }
            return;
        }
        if (this.o00Ooo != -1.0f) {
            wh1 wh1VarOooOO0O6 = vm0Var.OooOO0O(this.oo000o);
            wh1 wh1VarOooOO0O7 = vm0Var.OooOO0O(objOooO0oO2);
            float f = this.o00Ooo;
            l3 l3VarOooOO0o = vm0Var.OooOO0o();
            l3VarOooOO0o.OooO0Oo.OooO0oO(wh1VarOooOO0O6, -1.0f);
            l3VarOooOO0o.OooO0Oo.OooO0oO(wh1VarOooOO0O7, f);
            vm0Var.OooO0OO(l3VarOooOO0o);
        }
    }

    @Override // com.cmaster.cloner.hi
    public final boolean OooO0OO() {
        return true;
    }

    @Override // com.cmaster.cloner.hi
    public final qh OooO0oO(int i) {
        int iOooOOoo = rj.OooOOoo(i);
        if (iOooOOoo != 1) {
            if (iOooOOoo != 2) {
                if (iOooOOoo != 3) {
                    if (iOooOOoo != 4) {
                        return null;
                    }
                }
            }
            if (this.o00oO0o == 0) {
                return this.oo000o;
            }
            return null;
        }
        if (this.o00oO0o == 1) {
            return this.oo000o;
        }
        return null;
    }

    @Override // com.cmaster.cloner.hi
    public final boolean OooOo0O() {
        return this.o00oO0O;
    }

    @Override // com.cmaster.cloner.hi
    public final boolean OooOo0o() {
        return this.o00oO0O;
    }

    public final void Oooo0(int i) {
        this.oo000o.OooO(i);
        this.o00oO0O = true;
    }

    @Override // com.cmaster.cloner.hi
    public final void Oooo00o(vm0 vm0Var, boolean z) {
        if (this.OoooO0 == null) {
            return;
        }
        qh qhVar = this.oo000o;
        vm0Var.getClass();
        int iOooOOO = vm0.OooOOO(qhVar);
        if (this.o00oO0o == 1) {
            this.OoooOOO = iOooOOO;
            this.OoooOOo = 0;
            OooOoo(this.OoooO0.OooO());
            Oooo000(0);
            return;
        }
        this.OoooOOO = 0;
        this.OoooOOo = iOooOOO;
        Oooo000(this.OoooO0.OooOO0o());
        OooOoo(0);
    }

    public final void Oooo0O0(int i) {
        if (this.o00oO0o == i) {
            return;
        }
        this.o00oO0o = i;
        ArrayList arrayList = this.Oooo;
        arrayList.clear();
        if (this.o00oO0o == 1) {
            this.oo000o = this.Oooo00O;
        } else {
            this.oo000o = this.Oooo00o;
        }
        arrayList.add(this.oo000o);
        qh[] qhVarArr = this.Oooo0oo;
        int length = qhVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            qhVarArr[i2] = this.oo000o;
        }
    }
}
