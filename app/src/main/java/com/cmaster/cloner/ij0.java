package com.cmaster.cloner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ij0 {
    public static final k7 OooO00o = new k7();

    public static void OooO(String str) {
        tf tfVar = new tf(px0.OooOOOO("lateinit property ", str, " has not been initialized"));
        OooO0Oo(tfVar, ij0.class.getName());
        throw tfVar;
    }

    public static boolean OooO00o(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean OooO0O0(hi hiVar) {
        int[] iArr = hiVar.o00Oo0;
        int i = iArr[0];
        int i2 = iArr[1];
        hi hiVar2 = hiVar.OoooO0;
        ii iiVar = hiVar2 != null ? (ii) hiVar2 : null;
        if (iiVar != null) {
            int i3 = iiVar.o00Oo0[0];
        }
        if (iiVar != null) {
            int i4 = iiVar.o00Oo0[1];
        }
        boolean z = i == 1 || hiVar.OooOo0O() || i == 2 || (i == 3 && hiVar.OooOOo0 == 0 && hiVar.OoooOO0 == 0.0f && hiVar.OooOOOO(0)) || (i == 3 && hiVar.OooOOo0 == 1 && hiVar.OooOOOo(0, hiVar.OooOO0o()));
        boolean z2 = i2 == 1 || hiVar.OooOo0o() || i2 == 2 || (i2 == 3 && hiVar.OooOOo == 0 && hiVar.OoooOO0 == 0.0f && hiVar.OooOOOO(1)) || (i == 3 && hiVar.OooOOo == 1 && hiVar.OooOOOo(1, hiVar.OooO()));
        return (hiVar.OoooOO0 > 0.0f && (z || z2)) || (z && z2);
    }

    public static void OooO0OO(int i, wh whVar, hi hiVar, boolean z) {
        qh qhVar;
        qh qhVar2;
        char c;
        qh qhVar3;
        qh qhVar4;
        qh qhVar5;
        if (hiVar.OooOO0o) {
            return;
        }
        if (!(hiVar instanceof ii) && hiVar.OooOo0() && OooO0O0(hiVar)) {
            ii.Oooo0o(hiVar, whVar, new k7());
        }
        qh qhVarOooO0oO = hiVar.OooO0oO(2);
        qh qhVarOooO0oO2 = hiVar.OooO0oO(4);
        int iOooO0OO = qhVarOooO0oO.OooO0OO();
        int iOooO0OO2 = qhVarOooO0oO2.OooO0OO();
        HashSet hashSet = qhVarOooO0oO.OooO00o;
        if (hashSet != null && qhVarOooO0oO.OooO0OO) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                qh qhVar6 = (qh) it.next();
                hi hiVar2 = qhVar6.OooO0Oo;
                int i2 = i + 1;
                boolean zOooO0O0 = OooO0O0(hiVar2);
                qh qhVar7 = hiVar2.Oooo00O;
                qh qhVar8 = hiVar2.Oooo0;
                if (hiVar2.OooOo0() && zOooO0O0) {
                    c = 0;
                    ii.Oooo0o(hiVar2, whVar, new k7());
                } else {
                    c = 0;
                }
                int i3 = hiVar2.o00Oo0[c];
                if (i3 != 3 || zOooO0O0) {
                    if (!hiVar2.OooOo0()) {
                        if (qhVar6 == qhVar7 && qhVar8.OooO0o == null) {
                            int iOooO0Oo = qhVar7.OooO0Oo() + iOooO0OO;
                            hiVar2.OooOoOO(iOooO0Oo, hiVar2.OooOO0o() + iOooO0Oo);
                            OooO0OO(i2, whVar, hiVar2, z);
                        } else if (qhVar6 == qhVar8 && qhVar7.OooO0o == null) {
                            int iOooO0Oo2 = iOooO0OO - qhVar8.OooO0Oo();
                            hiVar2.OooOoOO(iOooO0Oo2 - hiVar2.OooOO0o(), iOooO0Oo2);
                            OooO0OO(i2, whVar, hiVar2, z);
                        } else if (qhVar6 == qhVar7 && (qhVar3 = qhVar8.OooO0o) != null && qhVar3.OooO0OO && !hiVar2.OooOOoo()) {
                            OooO0o0(i2, whVar, hiVar2, z);
                        }
                    }
                } else if (i3 == 3 && hiVar2.OooOo0 >= 0 && hiVar2.OooOo00 >= 0 && (hiVar2.OooooOO == 8 || (hiVar2.OooOOo0 == 0 && hiVar2.OoooOO0 == 0.0f))) {
                    if (!hiVar2.OooOOoo() && ((qhVar6 == qhVar7 && (qhVar5 = qhVar8.OooO0o) != null && qhVar5.OooO0OO) || (qhVar6 == qhVar8 && (qhVar4 = qhVar7.OooO0o) != null && qhVar4.OooO0OO))) {
                        if (!hiVar2.OooOOoo()) {
                            OooO0o(i2, hiVar, whVar, hiVar2, z);
                        }
                    }
                }
            }
        }
        if (hiVar instanceof b70) {
            return;
        }
        HashSet hashSet2 = qhVarOooO0oO2.OooO00o;
        if (hashSet2 != null && qhVarOooO0oO2.OooO0OO) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                qh qhVar9 = (qh) it2.next();
                hi hiVar3 = qhVar9.OooO0Oo;
                int i4 = i + 1;
                boolean zOooO0O02 = OooO0O0(hiVar3);
                qh qhVar10 = hiVar3.Oooo00O;
                qh qhVar11 = hiVar3.Oooo0;
                if (hiVar3.OooOo0() && zOooO0O02) {
                    ii.Oooo0o(hiVar3, whVar, new k7());
                }
                boolean z2 = (qhVar9 == qhVar10 && (qhVar2 = qhVar11.OooO0o) != null && qhVar2.OooO0OO) || (qhVar9 == qhVar11 && (qhVar = qhVar10.OooO0o) != null && qhVar.OooO0OO);
                int i5 = hiVar3.o00Oo0[0];
                if (i5 != 3 || zOooO0O02) {
                    if (!hiVar3.OooOo0()) {
                        if (qhVar9 == qhVar10 && qhVar11.OooO0o == null) {
                            int iOooO0Oo3 = qhVar10.OooO0Oo() + iOooO0OO2;
                            hiVar3.OooOoOO(iOooO0Oo3, hiVar3.OooOO0o() + iOooO0Oo3);
                            OooO0OO(i4, whVar, hiVar3, z);
                        } else if (qhVar9 == qhVar11 && qhVar10.OooO0o == null) {
                            int iOooO0Oo4 = iOooO0OO2 - qhVar11.OooO0Oo();
                            hiVar3.OooOoOO(iOooO0Oo4 - hiVar3.OooOO0o(), iOooO0Oo4);
                            OooO0OO(i4, whVar, hiVar3, z);
                        } else if (z2 && !hiVar3.OooOOoo()) {
                            OooO0o0(i4, whVar, hiVar3, z);
                        }
                    }
                } else if (i5 == 3 && hiVar3.OooOo0 >= 0 && hiVar3.OooOo00 >= 0 && (hiVar3.OooooOO == 8 || (hiVar3.OooOOo0 == 0 && hiVar3.OoooOO0 == 0.0f))) {
                    if (!hiVar3.OooOOoo() && z2 && !hiVar3.OooOOoo()) {
                        OooO0o(i4, hiVar, whVar, hiVar3, z);
                    }
                }
            }
        }
        hiVar.OooOO0o = true;
    }

    public static void OooO0Oo(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void OooO0o(int i, hi hiVar, wh whVar, hi hiVar2, boolean z) {
        float f = hiVar2.Ooooo00;
        qh qhVar = hiVar2.Oooo00O;
        int iOooO0Oo = qhVar.OooO0Oo() + qhVar.OooO0o.OooO0OO();
        qh qhVar2 = hiVar2.Oooo0;
        int iOooO0OO = qhVar2.OooO0o.OooO0OO() - qhVar2.OooO0Oo();
        if (iOooO0OO >= iOooO0Oo) {
            int iOooOO0o = hiVar2.OooOO0o();
            if (hiVar2.OooooOO != 8) {
                int i2 = hiVar2.OooOOo0;
                if (i2 == 2) {
                    iOooOO0o = (int) (hiVar2.Ooooo00 * 0.5f * (hiVar instanceof ii ? hiVar.OooOO0o() : hiVar.OoooO0.OooOO0o()));
                } else if (i2 == 0) {
                    iOooOO0o = iOooO0OO - iOooO0Oo;
                }
                iOooOO0o = Math.max(hiVar2.OooOo00, iOooOO0o);
                int i3 = hiVar2.OooOo0;
                if (i3 > 0) {
                    iOooOO0o = Math.min(i3, iOooOO0o);
                }
            }
            int i4 = iOooO0Oo + ((int) ((f * ((iOooO0OO - iOooO0Oo) - iOooOO0o)) + 0.5f));
            hiVar2.OooOoOO(i4, iOooOO0o + i4);
            OooO0OO(i + 1, whVar, hiVar2, z);
        }
    }

    public static void OooO0o0(int i, wh whVar, hi hiVar, boolean z) {
        float f = hiVar.Ooooo00;
        qh qhVar = hiVar.Oooo00O;
        int iOooO0OO = qhVar.OooO0o.OooO0OO();
        qh qhVar2 = hiVar.Oooo0;
        int iOooO0OO2 = qhVar2.OooO0o.OooO0OO();
        int iOooO0Oo = qhVar.OooO0Oo() + iOooO0OO;
        int iOooO0Oo2 = iOooO0OO2 - qhVar2.OooO0Oo();
        if (iOooO0OO == iOooO0OO2) {
            f = 0.5f;
        } else {
            iOooO0OO = iOooO0Oo;
            iOooO0OO2 = iOooO0Oo2;
        }
        int iOooOO0o = hiVar.OooOO0o();
        int i2 = (iOooO0OO2 - iOooO0OO) - iOooOO0o;
        if (iOooO0OO > iOooO0OO2) {
            i2 = (iOooO0OO - iOooO0OO2) - iOooOO0o;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iOooO0OO;
        int i4 = i3 + iOooOO0o;
        if (iOooO0OO > iOooO0OO2) {
            i4 = i3 - iOooOO0o;
        }
        hiVar.OooOoOO(i3, i4);
        OooO0OO(i + 1, whVar, hiVar, z);
    }

    public static void OooO0oO(int i, wh whVar, hi hiVar) {
        float f = hiVar.Ooooo0o;
        qh qhVar = hiVar.Oooo00o;
        int iOooO0OO = qhVar.OooO0o.OooO0OO();
        qh qhVar2 = hiVar.Oooo0O0;
        int iOooO0OO2 = qhVar2.OooO0o.OooO0OO();
        int iOooO0Oo = qhVar.OooO0Oo() + iOooO0OO;
        int iOooO0Oo2 = iOooO0OO2 - qhVar2.OooO0Oo();
        if (iOooO0OO == iOooO0OO2) {
            f = 0.5f;
        } else {
            iOooO0OO = iOooO0Oo;
            iOooO0OO2 = iOooO0Oo2;
        }
        int iOooO = hiVar.OooO();
        int i2 = (iOooO0OO2 - iOooO0OO) - iOooO;
        if (iOooO0OO > iOooO0OO2) {
            i2 = (iOooO0OO - iOooO0OO2) - iOooO;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iOooO0OO + i3;
        int i5 = i4 + iOooO;
        if (iOooO0OO > iOooO0OO2) {
            i4 = iOooO0OO - i3;
            i5 = i4 - iOooO;
        }
        hiVar.OooOoo0(i4, i5);
        OooOO0(i + 1, whVar, hiVar);
    }

    public static void OooO0oo(int i, hi hiVar, wh whVar, hi hiVar2) {
        float f = hiVar2.Ooooo0o;
        qh qhVar = hiVar2.Oooo00o;
        int iOooO0Oo = qhVar.OooO0Oo() + qhVar.OooO0o.OooO0OO();
        qh qhVar2 = hiVar2.Oooo0O0;
        int iOooO0OO = qhVar2.OooO0o.OooO0OO() - qhVar2.OooO0Oo();
        if (iOooO0OO >= iOooO0Oo) {
            int iOooO = hiVar2.OooO();
            if (hiVar2.OooooOO != 8) {
                int i2 = hiVar2.OooOOo;
                if (i2 == 2) {
                    iOooO = (int) (f * 0.5f * (hiVar instanceof ii ? hiVar.OooO() : hiVar.OoooO0.OooO()));
                } else if (i2 == 0) {
                    iOooO = iOooO0OO - iOooO0Oo;
                }
                iOooO = Math.max(hiVar2.OooOo0o, iOooO);
                int i3 = hiVar2.OooOo;
                if (i3 > 0) {
                    iOooO = Math.min(i3, iOooO);
                }
            }
            int i4 = iOooO0Oo + ((int) ((f * ((iOooO0OO - iOooO0Oo) - iOooO)) + 0.5f));
            hiVar2.OooOoo0(i4, iOooO + i4);
            OooOO0(i + 1, whVar, hiVar2);
        }
    }

    public static void OooOO0(int i, wh whVar, hi hiVar) {
        qh qhVar;
        qh qhVar2;
        float f;
        qh qhVar3;
        qh qhVar4;
        qh qhVar5;
        if (hiVar.OooOOO0) {
            return;
        }
        if (!(hiVar instanceof ii) && hiVar.OooOo0() && OooO0O0(hiVar)) {
            ii.Oooo0o(hiVar, whVar, new k7());
        }
        qh qhVarOooO0oO = hiVar.OooO0oO(3);
        qh qhVarOooO0oO2 = hiVar.OooO0oO(5);
        int iOooO0OO = qhVarOooO0oO.OooO0OO();
        int iOooO0OO2 = qhVarOooO0oO2.OooO0OO();
        HashSet hashSet = qhVarOooO0oO.OooO00o;
        if (hashSet != null && qhVarOooO0oO.OooO0OO) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                qh qhVar6 = (qh) it.next();
                hi hiVar2 = qhVar6.OooO0Oo;
                int i2 = i + 1;
                boolean zOooO0O0 = OooO0O0(hiVar2);
                qh qhVar7 = hiVar2.Oooo00o;
                qh qhVar8 = hiVar2.Oooo0O0;
                if (hiVar2.OooOo0() && zOooO0O0) {
                    f = 0.0f;
                    ii.Oooo0o(hiVar2, whVar, new k7());
                } else {
                    f = 0.0f;
                }
                int i3 = hiVar2.o00Oo0[1];
                if (i3 != 3 || zOooO0O0) {
                    if (!hiVar2.OooOo0()) {
                        if (qhVar6 == qhVar7 && qhVar8.OooO0o == null) {
                            int iOooO0Oo = qhVar7.OooO0Oo() + iOooO0OO;
                            hiVar2.OooOoo0(iOooO0Oo, hiVar2.OooO() + iOooO0Oo);
                            OooOO0(i2, whVar, hiVar2);
                        } else if (qhVar6 == qhVar8 && qhVar8.OooO0o == null) {
                            int iOooO0Oo2 = iOooO0OO - qhVar8.OooO0Oo();
                            hiVar2.OooOoo0(iOooO0Oo2 - hiVar2.OooO(), iOooO0Oo2);
                            OooOO0(i2, whVar, hiVar2);
                        } else if (qhVar6 == qhVar7 && (qhVar3 = qhVar8.OooO0o) != null && qhVar3.OooO0OO) {
                            OooO0oO(i2, whVar, hiVar2);
                        }
                    }
                } else if (i3 == 3 && hiVar2.OooOo >= 0 && hiVar2.OooOo0o >= 0 && (hiVar2.OooooOO == 8 || (hiVar2.OooOOo == 0 && hiVar2.OoooOO0 == f))) {
                    if (!hiVar2.OooOo00() && ((qhVar6 == qhVar7 && (qhVar5 = qhVar8.OooO0o) != null && qhVar5.OooO0OO) || (qhVar6 == qhVar8 && (qhVar4 = qhVar7.OooO0o) != null && qhVar4.OooO0OO))) {
                        if (!hiVar2.OooOo00()) {
                            OooO0oo(i2, hiVar, whVar, hiVar2);
                        }
                    }
                }
            }
        }
        if (hiVar instanceof b70) {
            return;
        }
        HashSet hashSet2 = qhVarOooO0oO2.OooO00o;
        if (hashSet2 != null && qhVarOooO0oO2.OooO0OO) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                qh qhVar9 = (qh) it2.next();
                hi hiVar3 = qhVar9.OooO0Oo;
                int i4 = i + 1;
                boolean zOooO0O02 = OooO0O0(hiVar3);
                qh qhVar10 = hiVar3.Oooo00o;
                qh qhVar11 = hiVar3.Oooo0O0;
                if (hiVar3.OooOo0() && zOooO0O02) {
                    ii.Oooo0o(hiVar3, whVar, new k7());
                }
                boolean z = (qhVar9 == qhVar10 && (qhVar2 = qhVar11.OooO0o) != null && qhVar2.OooO0OO) || (qhVar9 == qhVar11 && (qhVar = qhVar10.OooO0o) != null && qhVar.OooO0OO);
                int i5 = hiVar3.o00Oo0[1];
                if (i5 != 3 || zOooO0O02) {
                    if (!hiVar3.OooOo0()) {
                        if (qhVar9 == qhVar10 && qhVar11.OooO0o == null) {
                            int iOooO0Oo3 = qhVar10.OooO0Oo() + iOooO0OO2;
                            hiVar3.OooOoo0(iOooO0Oo3, hiVar3.OooO() + iOooO0Oo3);
                            OooOO0(i4, whVar, hiVar3);
                        } else if (qhVar9 == qhVar11 && qhVar10.OooO0o == null) {
                            int iOooO0Oo4 = iOooO0OO2 - qhVar11.OooO0Oo();
                            hiVar3.OooOoo0(iOooO0Oo4 - hiVar3.OooO(), iOooO0Oo4);
                            OooOO0(i4, whVar, hiVar3);
                        } else if (z && !hiVar3.OooOo00()) {
                            OooO0oO(i4, whVar, hiVar3);
                        }
                    }
                } else if (i5 == 3 && hiVar3.OooOo >= 0 && hiVar3.OooOo0o >= 0 && (hiVar3.OooooOO == 8 || (hiVar3.OooOOo == 0 && hiVar3.OoooOO0 == 0.0f))) {
                    if (!hiVar3.OooOo00() && z && !hiVar3.OooOo00()) {
                        OooO0oo(i4, hiVar, whVar, hiVar3);
                    }
                }
            }
        }
        qh qhVarOooO0oO3 = hiVar.OooO0oO(6);
        if (qhVarOooO0oO3.OooO00o != null && qhVarOooO0oO3.OooO0OO) {
            int iOooO0OO3 = qhVarOooO0oO3.OooO0OO();
            Iterator it3 = qhVarOooO0oO3.OooO00o.iterator();
            while (it3.hasNext()) {
                qh qhVar12 = (qh) it3.next();
                hi hiVar4 = qhVar12.OooO0Oo;
                int i6 = i + 1;
                boolean zOooO0O03 = OooO0O0(hiVar4);
                qh qhVar13 = hiVar4.Oooo0OO;
                if (hiVar4.OooOo0() && zOooO0O03) {
                    ii.Oooo0o(hiVar4, whVar, new k7());
                }
                if (hiVar4.o00Oo0[1] != 3 || zOooO0O03) {
                    if (!hiVar4.OooOo0() && qhVar12 == qhVar13) {
                        int iOooO0Oo5 = qhVar12.OooO0Oo() + iOooO0OO3;
                        if (hiVar4.OooOooO) {
                            int i7 = iOooO0Oo5 - hiVar4.OoooOo0;
                            int i8 = hiVar4.OoooO + i7;
                            hiVar4.OoooOOo = i7;
                            hiVar4.Oooo00o.OooO(i7);
                            hiVar4.Oooo0O0.OooO(i8);
                            qhVar13.OooO(iOooO0Oo5);
                            hiVar4.OooOO0O = true;
                        }
                        OooOO0(i6, whVar, hiVar4);
                    }
                }
            }
        }
        hiVar.OooOOO0 = true;
    }
}
