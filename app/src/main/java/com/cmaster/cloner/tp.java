package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tp {
    public ii OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;
    public ii OooO0Oo;
    public wh OooO0o;
    public ArrayList OooO0o0;
    public k7 OooO0oO;
    public ArrayList OooO0oo;

    public final void OooO00o(up upVar, int i, ArrayList arrayList, kc1 kc1Var) {
        ly1 ly1Var = upVar.OooO0Oo;
        kc1 kc1Var2 = ly1Var.OooO0OO;
        up upVar2 = ly1Var.OooO;
        up upVar3 = ly1Var.OooO0oo;
        if (kc1Var2 == null) {
            ii iiVar = this.OooO00o;
            if (ly1Var == iiVar.OooO0Oo || ly1Var == iiVar.OooO0o0) {
                return;
            }
            if (kc1Var == null) {
                kc1Var = new kc1();
                kc1Var.OooO00o = null;
                kc1Var.OooO0O0 = new ArrayList();
                kc1Var.OooO00o = ly1Var;
                arrayList.add(kc1Var);
            }
            ly1Var.OooO0OO = kc1Var;
            kc1Var.OooO0O0.add(ly1Var);
            ArrayList arrayList2 = upVar3.OooOO0O;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                qp qpVar = (qp) obj;
                if (qpVar instanceof up) {
                    OooO00o((up) qpVar, i, arrayList, kc1Var);
                }
            }
            ArrayList arrayList3 = upVar2.OooOO0O;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                qp qpVar2 = (qp) obj2;
                if (qpVar2 instanceof up) {
                    OooO00o((up) qpVar2, i, arrayList, kc1Var);
                }
            }
            if (i == 1 && (ly1Var instanceof qs1)) {
                ArrayList arrayList4 = ((qs1) ly1Var).OooOO0O.OooOO0O;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    qp qpVar3 = (qp) obj3;
                    if (qpVar3 instanceof up) {
                        OooO00o((up) qpVar3, i, arrayList, kc1Var);
                    }
                }
            }
            ArrayList arrayList5 = upVar3.OooOO0o;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                OooO00o((up) obj4, i, arrayList, kc1Var);
            }
            ArrayList arrayList6 = upVar2.OooOO0o;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                OooO00o((up) obj5, i, arrayList, kc1Var);
            }
            if (i == 1 && (ly1Var instanceof qs1)) {
                ArrayList arrayList7 = ((qs1) ly1Var).OooOO0O.OooOO0o;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    OooO00o((up) obj6, i, arrayList, kc1Var);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0O0(com.cmaster.cloner.ii r25) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.tp.OooO0O0(com.cmaster.cloner.ii):void");
    }

    public final void OooO0OO() {
        ii iiVar = this.OooO00o;
        ArrayList arrayList = this.OooO0oo;
        ArrayList arrayList2 = this.OooO0o0;
        arrayList2.clear();
        ii iiVar2 = this.OooO0Oo;
        iiVar2.OooO0Oo.OooO0o();
        iiVar2.OooO0o0.OooO0o();
        arrayList2.add(iiVar2.OooO0Oo);
        arrayList2.add(iiVar2.OooO0o0);
        ArrayList arrayList3 = iiVar2.o00Ooo;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            hi hiVar = (hi) obj;
            if (hiVar instanceof b70) {
                c70 c70Var = new c70(hiVar);
                hiVar.OooO0Oo.OooO0o();
                hiVar.OooO0o0.OooO0o();
                c70Var.OooO0o = ((b70) hiVar).o00oO0o;
                arrayList2.add(c70Var);
            } else {
                if (hiVar.OooOOoo()) {
                    if (hiVar.OooO0O0 == null) {
                        hiVar.OooO0O0 = new gc(hiVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(hiVar.OooO0O0);
                } else {
                    arrayList2.add(hiVar.OooO0Oo);
                }
                if (hiVar.OooOo00()) {
                    if (hiVar.OooO0OO == null) {
                        hiVar.OooO0OO = new gc(hiVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(hiVar.OooO0OO);
                } else {
                    arrayList2.add(hiVar.OooO0o0);
                }
                if (hiVar instanceof e6) {
                    arrayList2.add(new p70(hiVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((ly1) obj2).OooO0o();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            ly1 ly1Var = (ly1) obj3;
            if (ly1Var.OooO0O0 != iiVar2) {
                ly1Var.OooO0Oo();
            }
        }
        arrayList.clear();
        OooO0o0(iiVar.OooO0Oo, 0, arrayList);
        OooO0o0(iiVar.OooO0o0, 1, arrayList);
        this.OooO0O0 = false;
    }

    public final int OooO0Oo(ii iiVar, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f;
        ii iiVar2 = iiVar;
        ArrayList arrayList2 = this.OooO0oo;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            ly1 ly1Var = ((kc1) arrayList2.get(i3)).OooO00o;
            if (!(ly1Var instanceof gc) ? !(i != 0 ? (ly1Var instanceof qs1) : (ly1Var instanceof j80)) : ((gc) ly1Var).OooO0o != i) {
                up upVar = (i == 0 ? iiVar2.OooO0Oo : iiVar2.OooO0o0).OooO0oo;
                up upVar2 = (i == 0 ? iiVar2.OooO0Oo : iiVar2.OooO0o0).OooO;
                up upVar3 = ly1Var.OooO0oo;
                up upVar4 = ly1Var.OooO;
                boolean zContains = upVar3.OooOO0o.contains(upVar);
                boolean zContains2 = upVar4.OooOO0o.contains(upVar2);
                long jOooOO0 = ly1Var.OooOO0();
                if (zContains && zContains2) {
                    long jOooO0O0 = kc1.OooO0O0(upVar3, j);
                    arrayList = arrayList2;
                    long jOooO00o = kc1.OooO00o(upVar4, j);
                    long j2 = jOooO0O0 - jOooOO0;
                    int i4 = upVar4.OooO0o;
                    i2 = i3;
                    if (j2 >= (-i4)) {
                        j2 += i4;
                    }
                    long j3 = upVar3.OooO0o;
                    long j4 = ((-jOooO00o) - jOooOO0) - j3;
                    if (j4 >= j3) {
                        j4 -= j3;
                    }
                    hi hiVar = ly1Var.OooO0O0;
                    if (i == 0) {
                        f = hiVar.Ooooo00;
                    } else if (i == 1) {
                        f = hiVar.Ooooo0o;
                    } else {
                        hiVar.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j2 / (1.0f - f)) + (j4 / f)) : 0L;
                    jMax = (upVar3.OooO0o + ((((long) ((f2 * f) + 0.5f)) + jOooOO0) + ((long) (((1.0f - f) * f2) + 0.5f)))) - upVar4.OooO0o;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    jMax = zContains ? Math.max(kc1.OooO0O0(upVar3, upVar3.OooO0o), upVar3.OooO0o + jOooOO0) : zContains2 ? Math.max(-kc1.OooO00o(upVar4, upVar4.OooO0o), (-upVar4.OooO0o) + jOooOO0) : (ly1Var.OooOO0() + upVar3.OooO0o) - upVar4.OooO0o;
                }
            } else {
                arrayList = arrayList2;
                jMax = j;
                i2 = i3;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            iiVar2 = iiVar;
            j = 0;
        }
        return (int) jMax2;
    }

    public final void OooO0o(int i, int i2, int i3, int i4, hi hiVar) {
        k7 k7Var = this.OooO0oO;
        k7Var.OooO00o = i;
        k7Var.OooO0O0 = i3;
        k7Var.OooO0OO = i2;
        k7Var.OooO0Oo = i4;
        this.OooO0o.OooO0O0(hiVar, k7Var);
        hiVar.Oooo000(k7Var.OooO0o0);
        hiVar.OooOoo(k7Var.OooO0o);
        hiVar.OooOooO = k7Var.OooO0oo;
        int i5 = k7Var.OooO0oO;
        hiVar.OoooOo0 = i5;
        hiVar.OooOooO = i5 > 0;
    }

    public final void OooO0o0(ly1 ly1Var, int i, ArrayList arrayList) {
        up upVar = ly1Var.OooO0oo;
        up upVar2 = ly1Var.OooO;
        ArrayList arrayList2 = upVar.OooOO0O;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            qp qpVar = (qp) obj;
            if (qpVar instanceof up) {
                OooO00o((up) qpVar, i, arrayList, null);
            } else if (qpVar instanceof ly1) {
                OooO00o(((ly1) qpVar).OooO0oo, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = upVar2.OooOO0O;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            qp qpVar2 = (qp) obj2;
            if (qpVar2 instanceof up) {
                OooO00o((up) qpVar2, i, arrayList, null);
            } else if (qpVar2 instanceof ly1) {
                OooO00o(((ly1) qpVar2).OooO, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((qs1) ly1Var).OooOO0O.OooOO0O;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                qp qpVar3 = (qp) obj3;
                if (qpVar3 instanceof up) {
                    OooO00o((up) qpVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void OooO0oO() {
        h7 h7Var;
        tp tpVar = this;
        ArrayList arrayList = tpVar.OooO00o.o00Ooo;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            hi hiVar = (hi) arrayList.get(i);
            if (!hiVar.OooO00o) {
                int[] iArr = hiVar.o00Oo0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = hiVar.OooOOo0;
                int i6 = hiVar.OooOOo;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                mr mrVar = hiVar.OooO0Oo.OooO0o0;
                boolean z3 = mrVar.OooOO0;
                mr mrVar2 = hiVar.OooO0o0.OooO0o0;
                boolean z4 = mrVar2.OooOO0;
                boolean z5 = z;
                if (z3 && z4) {
                    tpVar.OooO0o(1, mrVar.OooO0oO, 1, mrVar2.OooO0oO, hiVar);
                    hiVar.OooO00o = true;
                } else if (z3 && z2) {
                    OooO0o(1, mrVar.OooO0oO, 2, mrVar2.OooO0oO, hiVar);
                    qs1 qs1Var = hiVar.OooO0o0;
                    if (i4 == 3) {
                        qs1Var.OooO0o0.OooOOO0 = hiVar.OooO();
                    } else {
                        qs1Var.OooO0o0.OooO0Oo(hiVar.OooO());
                        hiVar.OooO00o = true;
                    }
                } else if (z4 && z5) {
                    OooO0o(2, mrVar.OooO0oO, 1, mrVar2.OooO0oO, hiVar);
                    j80 j80Var = hiVar.OooO0Oo;
                    if (i3 == 3) {
                        j80Var.OooO0o0.OooOOO0 = hiVar.OooOO0o();
                    } else {
                        j80Var.OooO0o0.OooO0Oo(hiVar.OooOO0o());
                        hiVar.OooO00o = true;
                    }
                }
                if (hiVar.OooO00o && (h7Var = hiVar.OooO0o0.OooOO0o) != null) {
                    h7Var.OooO0Oo(hiVar.OoooOo0);
                }
                tpVar = this;
            }
            i = i2;
        }
    }
}
