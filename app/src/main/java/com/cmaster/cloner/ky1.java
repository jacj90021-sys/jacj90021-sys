package com.cmaster.cloner;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ky1 {
    public static int OooO0o;
    public ArrayList OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public ArrayList OooO0Oo;
    public int OooO0o0;

    public final void OooO00o(ArrayList arrayList) {
        int size = this.OooO00o.size();
        if (this.OooO0o0 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                ky1 ky1Var = (ky1) arrayList.get(i);
                if (this.OooO0o0 == ky1Var.OooO0O0) {
                    OooO0OO(this.OooO0OO, ky1Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int OooO0O0(vm0 vm0Var, int i) {
        int iOooOOO;
        int iOooOOO2;
        ArrayList arrayList = this.OooO00o;
        if (arrayList.size() == 0) {
            return 0;
        }
        ii iiVar = (ii) ((hi) arrayList.get(0)).OoooO0;
        vm0Var.OooOo00();
        iiVar.OooO0O0(vm0Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((hi) arrayList.get(i2)).OooO0O0(vm0Var, false);
        }
        if (i == 0 && iiVar.o0OOO0o > 0) {
            ko2.OooO00o(iiVar, vm0Var, arrayList, 0);
        }
        if (i == 1 && iiVar.o0Oo0oo > 0) {
            ko2.OooO00o(iiVar, vm0Var, arrayList, 1);
        }
        try {
            vm0Var.OooOOOo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.OooO0Oo = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            hi hiVar = (hi) arrayList.get(i3);
            oOO0OO ooo0oo = new oOO0OO();
            new WeakReference(hiVar);
            vm0.OooOOO(hiVar.Oooo00O);
            vm0.OooOOO(hiVar.Oooo00o);
            vm0.OooOOO(hiVar.Oooo0);
            vm0.OooOOO(hiVar.Oooo0O0);
            vm0.OooOOO(hiVar.Oooo0OO);
            this.OooO0Oo.add(ooo0oo);
        }
        if (i == 0) {
            iOooOOO = vm0.OooOOO(iiVar.Oooo00O);
            iOooOOO2 = vm0.OooOOO(iiVar.Oooo0);
            vm0Var.OooOo00();
        } else {
            iOooOOO = vm0.OooOOO(iiVar.Oooo00o);
            iOooOOO2 = vm0.OooOOO(iiVar.Oooo0O0);
            vm0Var.OooOo00();
        }
        return iOooOOO2 - iOooOOO;
    }

    public final void OooO0OO(int i, ky1 ky1Var) {
        int i2 = ky1Var.OooO0O0;
        ArrayList arrayList = this.OooO00o;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            hi hiVar = (hi) obj;
            ArrayList arrayList2 = ky1Var.OooO00o;
            if (!arrayList2.contains(hiVar)) {
                arrayList2.add(hiVar);
            }
            if (i == 0) {
                hiVar.ooOO = i2;
            } else {
                hiVar.o00O0O = i2;
            }
        }
        this.OooO0o0 = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.OooO0OO;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strOooO0o = rj.OooO0o(sb, this.OooO0O0, "] <");
        ArrayList arrayList = this.OooO00o;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            strOooO0o = strOooO0o + " " + ((hi) obj).OooooOo;
        }
        return strOooO0o.concat(" >");
    }
}
