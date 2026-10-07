package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class fs2 {
    public static ky1 OooO00o(hi hiVar, int i, ArrayList arrayList, ky1 ky1Var) {
        int i2;
        int i3 = i == 0 ? hiVar.ooOO : hiVar.o00O0O;
        if (i3 != -1 && (ky1Var == null || i3 != ky1Var.OooO0O0)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                ky1 ky1Var2 = (ky1) arrayList.get(i4);
                if (ky1Var2.OooO0O0 == i3) {
                    if (ky1Var != null) {
                        ky1Var.OooO0OO(i, ky1Var2);
                        arrayList.remove(ky1Var);
                    }
                    ky1Var = ky1Var2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return ky1Var;
        }
        if (ky1Var == null) {
            if (hiVar instanceof e6) {
                e6 e6Var = (e6) hiVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= e6Var.o00o0O) {
                        i2 = -1;
                        break;
                    }
                    hi hiVar2 = e6Var.o00Ooo[i5];
                    if ((i == 0 && (i2 = hiVar2.ooOO) != -1) || (i == 1 && (i2 = hiVar2.o00O0O) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        ky1 ky1Var3 = (ky1) arrayList.get(i6);
                        if (ky1Var3.OooO0O0 == i2) {
                            ky1Var = ky1Var3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (ky1Var == null) {
                ky1Var = new ky1();
                ky1Var.OooO00o = new ArrayList();
                ky1Var.OooO0Oo = null;
                ky1Var.OooO0o0 = -1;
                int i7 = ky1.OooO0o;
                ky1.OooO0o = i7 + 1;
                ky1Var.OooO0O0 = i7;
                ky1Var.OooO0OO = i;
            }
            arrayList.add(ky1Var);
        }
        ArrayList arrayList2 = ky1Var.OooO00o;
        if (arrayList2.contains(hiVar)) {
            return ky1Var;
        }
        arrayList2.add(hiVar);
        if (hiVar instanceof b70) {
            b70 b70Var = (b70) hiVar;
            b70Var.oo000o.OooO0O0(b70Var.o00oO0o == 0 ? 1 : 0, ky1Var, arrayList);
        }
        int i8 = ky1Var.OooO0O0;
        if (i == 0) {
            hiVar.ooOO = i8;
            hiVar.Oooo00O.OooO0O0(i, ky1Var, arrayList);
            hiVar.Oooo0.OooO0O0(i, ky1Var, arrayList);
        } else {
            hiVar.o00O0O = i8;
            hiVar.Oooo00o.OooO0O0(i, ky1Var, arrayList);
            hiVar.Oooo0OO.OooO0O0(i, ky1Var, arrayList);
            hiVar.Oooo0O0.OooO0O0(i, ky1Var, arrayList);
        }
        hiVar.Oooo0oO.OooO0O0(i, ky1Var, arrayList);
        return ky1Var;
    }

    public static boolean OooO0O0(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
