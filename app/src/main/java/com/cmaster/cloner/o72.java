package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class o72 {
    public static final boolean[] OooO00o = new boolean[3];

    public static void OooO00o(ii iiVar, vm0 vm0Var, hi hiVar) {
        hiVar.OooOOO = -1;
        qh qhVar = hiVar.Oooo0OO;
        int[] iArr = hiVar.o00Oo0;
        qh qhVar2 = hiVar.Oooo0O0;
        qh qhVar3 = hiVar.Oooo00o;
        qh qhVar4 = hiVar.Oooo0;
        qh qhVar5 = hiVar.Oooo00O;
        hiVar.OooOOOO = -1;
        int[] iArr2 = iiVar.o00Oo0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = qhVar5.OooO0oO;
            int iOooOO0o = iiVar.OooOO0o() - qhVar4.OooO0oO;
            qhVar5.OooO = vm0Var.OooOO0O(qhVar5);
            qhVar4.OooO = vm0Var.OooOO0O(qhVar4);
            vm0Var.OooO0Oo(qhVar5.OooO, i);
            vm0Var.OooO0Oo(qhVar4.OooO, iOooOO0o);
            hiVar.OooOOO = 2;
            hiVar.OoooOOO = i;
            int i2 = iOooOO0o - i;
            hiVar.OoooO0O = i2;
            int i3 = hiVar.OoooOoO;
            if (i2 < i3) {
                hiVar.OoooO0O = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = qhVar3.OooO0oO;
        int iOooO = iiVar.OooO() - qhVar2.OooO0oO;
        qhVar3.OooO = vm0Var.OooOO0O(qhVar3);
        qhVar2.OooO = vm0Var.OooOO0O(qhVar2);
        vm0Var.OooO0Oo(qhVar3.OooO, i4);
        vm0Var.OooO0Oo(qhVar2.OooO, iOooO);
        if (hiVar.OoooOo0 > 0 || hiVar.OooooOO == 8) {
            wh1 wh1VarOooOO0O = vm0Var.OooOO0O(qhVar);
            qhVar.OooO = wh1VarOooOO0O;
            vm0Var.OooO0Oo(wh1VarOooOO0O, hiVar.OoooOo0 + i4);
        }
        hiVar.OooOOOO = 2;
        hiVar.OoooOOo = i4;
        int i5 = iOooO - i4;
        hiVar.OoooO = i5;
        int i6 = hiVar.OoooOoo;
        if (i5 < i6) {
            hiVar.OoooO = i6;
        }
    }

    public static final boolean OooO0O0(int i, int i2) {
        return (i & i2) == i2;
    }
}
