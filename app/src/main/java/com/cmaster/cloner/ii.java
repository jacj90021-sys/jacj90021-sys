package com.cmaster.cloner;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ii extends hi {
    public WeakReference o00000;
    public boolean o000000;
    public WeakReference o000000O;
    public WeakReference o000000o;
    public final HashSet o00000O;
    public WeakReference o00000O0;
    public final k7 o00000OO;
    public boolean o000OOo;
    public ArrayList o00Ooo = new ArrayList();
    public final hx2 o00o0O = new hx2(this);
    public boolean o00oO0O;
    public wh o00oO0o;
    public final tp o00ooo;
    public int o0O0O00;
    public fc[] o0OO00O;
    public int o0OOO0o;
    public int o0Oo0oo;
    public final vm0 o0ooOO0;
    public int o0ooOOo;
    public int o0ooOoO;
    public int oo000o;
    public fc[] oo0o0Oo;

    public ii() {
        tp tpVar = new tp();
        tpVar.OooO0O0 = true;
        tpVar.OooO0OO = true;
        tpVar.OooO0o0 = new ArrayList();
        new ArrayList();
        tpVar.OooO0o = null;
        tpVar.OooO0oO = new k7();
        tpVar.OooO0oo = new ArrayList();
        tpVar.OooO00o = this;
        tpVar.OooO0Oo = this;
        this.o00ooo = tpVar;
        this.o00oO0o = null;
        this.o00oO0O = false;
        this.o0ooOO0 = new vm0();
        this.o0OOO0o = 0;
        this.o0Oo0oo = 0;
        this.o0OO00O = new fc[4];
        this.oo0o0Oo = new fc[4];
        this.o0O0O00 = 257;
        this.o000OOo = false;
        this.o000000 = false;
        this.o000000O = null;
        this.o000000o = null;
        this.o00000 = null;
        this.o00000O0 = null;
        this.o00000O = new HashSet();
        this.o00000OO = new k7();
    }

    public static void Oooo0o(hi hiVar, wh whVar, k7 k7Var) {
        int i;
        int i2;
        if (whVar == null) {
            return;
        }
        int i3 = hiVar.OooooOO;
        int[] iArr = hiVar.OooOOoo;
        if (i3 == 8 || (hiVar instanceof b70) || (hiVar instanceof e6)) {
            k7Var.OooO0o0 = 0;
            k7Var.OooO0o = 0;
            return;
        }
        int[] iArr2 = hiVar.o00Oo0;
        k7Var.OooO00o = iArr2[0];
        k7Var.OooO0O0 = iArr2[1];
        k7Var.OooO0OO = hiVar.OooOO0o();
        k7Var.OooO0Oo = hiVar.OooO();
        k7Var.OooO = false;
        k7Var.OooOO0 = 0;
        boolean z = k7Var.OooO00o == 3;
        boolean z2 = k7Var.OooO0O0 == 3;
        boolean z3 = z && hiVar.OoooOO0 > 0.0f;
        boolean z4 = z2 && hiVar.OoooOO0 > 0.0f;
        if (z && hiVar.OooOOOO(0) && hiVar.OooOOo0 == 0 && !z3) {
            k7Var.OooO00o = 2;
            if (z2 && hiVar.OooOOo == 0) {
                k7Var.OooO00o = 1;
            }
            z = false;
        }
        if (z2 && hiVar.OooOOOO(1) && hiVar.OooOOo == 0 && !z4) {
            k7Var.OooO0O0 = 2;
            if (z && hiVar.OooOOo0 == 0) {
                k7Var.OooO0O0 = 1;
            }
            z2 = false;
        }
        if (hiVar.OooOo0O()) {
            k7Var.OooO00o = 1;
            z = false;
        }
        if (hiVar.OooOo0o()) {
            k7Var.OooO0O0 = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                k7Var.OooO00o = 1;
            } else if (!z2) {
                if (k7Var.OooO0O0 == 1) {
                    i2 = k7Var.OooO0Oo;
                } else {
                    k7Var.OooO00o = 2;
                    whVar.OooO0O0(hiVar, k7Var);
                    i2 = k7Var.OooO0o;
                }
                k7Var.OooO00o = 1;
                k7Var.OooO0OO = (int) (hiVar.OoooOO0 * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                k7Var.OooO0O0 = 1;
            } else if (!z) {
                if (k7Var.OooO00o == 1) {
                    i = k7Var.OooO0OO;
                } else {
                    k7Var.OooO0O0 = 2;
                    whVar.OooO0O0(hiVar, k7Var);
                    i = k7Var.OooO0o0;
                }
                k7Var.OooO0O0 = 1;
                int i4 = hiVar.o000oOoO;
                float f = hiVar.OoooOO0;
                if (i4 == -1) {
                    k7Var.OooO0Oo = (int) (i / f);
                } else {
                    k7Var.OooO0Oo = (int) (f * i);
                }
            }
        }
        whVar.OooO0O0(hiVar, k7Var);
        hiVar.Oooo000(k7Var.OooO0o0);
        hiVar.OooOoo(k7Var.OooO0o);
        hiVar.OooOooO = k7Var.OooO0oo;
        int i5 = k7Var.OooO0oO;
        hiVar.OoooOo0 = i5;
        hiVar.OooOooO = i5 > 0;
        k7Var.OooOO0 = 0;
    }

    @Override // com.cmaster.cloner.hi
    public final void OooOo() {
        this.o0ooOO0.OooOo00();
        this.o0ooOOo = 0;
        this.o0ooOoO = 0;
        this.o00Ooo.clear();
        super.OooOo();
    }

    @Override // com.cmaster.cloner.hi
    public final void OooOoO(hx2 hx2Var) {
        super.OooOoO(hx2Var);
        int size = this.o00Ooo.size();
        for (int i = 0; i < size; i++) {
            ((hi) this.o00Ooo.get(i)).OooOoO(hx2Var);
        }
    }

    public final void Oooo0(hi hiVar, int i) {
        if (i == 0) {
            int i2 = this.o0OOO0o + 1;
            fc[] fcVarArr = this.oo0o0Oo;
            if (i2 >= fcVarArr.length) {
                this.oo0o0Oo = (fc[]) Arrays.copyOf(fcVarArr, fcVarArr.length * 2);
            }
            fc[] fcVarArr2 = this.oo0o0Oo;
            int i3 = this.o0OOO0o;
            fcVarArr2[i3] = new fc(hiVar, 0, this.o00oO0O);
            this.o0OOO0o = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.o0Oo0oo + 1;
            fc[] fcVarArr3 = this.o0OO00O;
            if (i4 >= fcVarArr3.length) {
                this.o0OO00O = (fc[]) Arrays.copyOf(fcVarArr3, fcVarArr3.length * 2);
            }
            fc[] fcVarArr4 = this.o0OO00O;
            int i5 = this.o0Oo0oo;
            fcVarArr4[i5] = new fc(hiVar, 1, this.o00oO0O);
            this.o0Oo0oo = i5 + 1;
        }
    }

    @Override // com.cmaster.cloner.hi
    public final void Oooo00O(boolean z, boolean z2) {
        super.Oooo00O(z, z2);
        int size = this.o00Ooo.size();
        for (int i = 0; i < size; i++) {
            ((hi) this.o00Ooo.get(i)).Oooo00O(z, z2);
        }
    }

    public final void Oooo0O0(vm0 vm0Var) {
        ii iiVar;
        vm0 vm0Var2;
        boolean zOooo0oO = Oooo0oO(64);
        OooO0O0(vm0Var, zOooo0oO);
        int size = this.o00Ooo.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            hi hiVar = (hi) this.o00Ooo.get(i);
            boolean[] zArr = hiVar.OoooO00;
            zArr[0] = false;
            zArr[1] = false;
            if (hiVar instanceof e6) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                hi hiVar2 = (hi) this.o00Ooo.get(i2);
                if (hiVar2 instanceof e6) {
                    e6 e6Var = (e6) hiVar2;
                    for (int i3 = 0; i3 < e6Var.o00o0O; i3++) {
                        hi hiVar3 = e6Var.o00Ooo[i3];
                        if (e6Var.oo000o || hiVar3.OooO0OO()) {
                            int i4 = e6Var.o00ooo;
                            if (i4 == 0 || i4 == 1) {
                                hiVar3.OoooO00[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                hiVar3.OoooO00[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.o00000O;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            hi hiVar4 = (hi) this.o00Ooo.get(i5);
            hiVar4.getClass();
            if (hiVar4 instanceof b70) {
                hiVar4.OooO0O0(vm0Var, zOooo0oO);
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            if (it.hasNext()) {
                ((hi) it.next()).getClass();
                ra.OooOO0o();
                return;
            } else if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((hi) it2.next()).OooO0O0(vm0Var, zOooo0oO);
                }
                hashSet.clear();
            }
        }
        if (vm0.OooOOOo) {
            HashSet hashSet2 = new HashSet();
            for (int i6 = 0; i6 < size; i6++) {
                hi hiVar5 = (hi) this.o00Ooo.get(i6);
                hiVar5.getClass();
                if (!(hiVar5 instanceof b70)) {
                    hashSet2.add(hiVar5);
                }
            }
            iiVar = this;
            vm0Var2 = vm0Var;
            iiVar.OooO00o(this, vm0Var2, hashSet2, this.o00Oo0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                hi hiVar6 = (hi) it3.next();
                o72.OooO00o(iiVar, vm0Var2, hiVar6);
                hiVar6.OooO0O0(vm0Var2, zOooo0oO);
            }
        } else {
            iiVar = this;
            vm0Var2 = vm0Var;
            for (int i7 = 0; i7 < size; i7++) {
                hi hiVar7 = (hi) iiVar.o00Ooo.get(i7);
                if (hiVar7 instanceof ii) {
                    int[] iArr = hiVar7.o00Oo0;
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    if (i8 == 2) {
                        hiVar7.OooOooO(1);
                    }
                    if (i9 == 2) {
                        hiVar7.OooOooo(1);
                    }
                    hiVar7.OooO0O0(vm0Var2, zOooo0oO);
                    if (i8 == 2) {
                        hiVar7.OooOooO(i8);
                    }
                    if (i9 == 2) {
                        hiVar7.OooOooo(i9);
                    }
                } else {
                    o72.OooO00o(iiVar, vm0Var2, hiVar7);
                    if (!(hiVar7 instanceof b70)) {
                        hiVar7.OooO0O0(vm0Var2, zOooo0oO);
                    }
                }
            }
        }
        if (iiVar.o0OOO0o > 0) {
            ko2.OooO00o(iiVar, vm0Var2, null, 0);
        }
        if (iiVar.o0Oo0oo > 0) {
            ko2.OooO00o(iiVar, vm0Var2, null, 1);
        }
    }

    public final boolean Oooo0OO(int i, boolean z) {
        boolean z2;
        tp tpVar = this.o00ooo;
        ArrayList arrayList = tpVar.OooO0o0;
        ii iiVar = tpVar.OooO00o;
        boolean z3 = false;
        int iOooO0oo = iiVar.OooO0oo(0);
        int iOooO0oo2 = iiVar.OooO0oo(1);
        int iOooOOO0 = iiVar.OooOOO0();
        int iOooOOO = iiVar.OooOOO();
        if (z && (iOooO0oo == 2 || iOooO0oo2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                ly1 ly1Var = (ly1) obj;
                if (ly1Var.OooO0o == i && !ly1Var.OooOO0O()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iOooO0oo == 2) {
                    iiVar.OooOooO(1);
                    iiVar.Oooo000(tpVar.OooO0Oo(iiVar, 0));
                    iiVar.OooO0Oo.OooO0o0.OooO0Oo(iiVar.OooOO0o());
                }
            } else if (z && iOooO0oo2 == 2) {
                iiVar.OooOooo(1);
                iiVar.OooOoo(tpVar.OooO0Oo(iiVar, 1));
                iiVar.OooO0o0.OooO0o0.OooO0Oo(iiVar.OooO());
            }
        }
        int[] iArr = iiVar.o00Oo0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int iOooOO0o = iiVar.OooOO0o() + iOooOOO0;
                iiVar.OooO0Oo.OooO.OooO0Oo(iOooOO0o);
                iiVar.OooO0Oo.OooO0o0.OooO0Oo(iOooOO0o - iOooOOO0);
                z2 = true;
            }
            z2 = false;
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int iOooO = iiVar.OooO() + iOooOOO;
                iiVar.OooO0o0.OooO.OooO0Oo(iOooO);
                iiVar.OooO0o0.OooO0o0.OooO0Oo(iOooO - iOooOOO);
                z2 = true;
            }
            z2 = false;
        }
        tpVar.OooO0oO();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            ly1 ly1Var2 = (ly1) obj2;
            if (ly1Var2.OooO0o == i && (ly1Var2.OooO0O0 != iiVar || ly1Var2.OooO0oO)) {
                ly1Var2.OooO0o0();
            }
        }
        int size3 = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                z3 = true;
                break;
            }
            Object obj3 = arrayList.get(i6);
            i6++;
            ly1 ly1Var3 = (ly1) obj3;
            if (ly1Var3.OooO0o == i && (z2 || ly1Var3.OooO0O0 != iiVar)) {
                if (!ly1Var3.OooO0oo.OooOO0 || !ly1Var3.OooO.OooOO0 || (!(ly1Var3 instanceof gc) && !ly1Var3.OooO0o0.OooOO0)) {
                    break;
                }
            }
        }
        iiVar.OooOooO(iOooO0oo);
        iiVar.OooOooo(iOooO0oo2);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0810 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x081d A[LOOP:14: B:481:0x081b->B:482:0x081d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oooo0o0() {
        /*
            Method dump skipped, instructions count: 2316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ii.Oooo0o0():void");
    }

    public final boolean Oooo0oO(int i) {
        return (this.o0O0O00 & i) == i;
    }
}
