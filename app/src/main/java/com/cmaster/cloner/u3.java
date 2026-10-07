package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u3 implements Runnable {
    public final /* synthetic */ List OooO0Oo;
    public final /* synthetic */ int OooO0o;
    public final /* synthetic */ ArrayList OooO0o0;
    public final /* synthetic */ Runnable OooO0oO;
    public final /* synthetic */ w3 OooO0oo;

    public u3(w3 w3Var, ArrayList arrayList, ArrayList arrayList2, int i, Runnable runnable) {
        this.OooO0oo = w3Var;
        this.OooO0Oo = arrayList;
        this.OooO0o0 = arrayList2;
        this.OooO0o = i;
        this.OooO0oO = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        jr jrVar;
        int i2;
        ir irVar;
        int i3;
        jr jrVar2;
        jr jrVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ay1 ay1Var = new ay1(this, 9);
        int iOooOOo0 = ay1Var.OooOOo0();
        int iOooOOOo = ay1Var.OooOOOo();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ir irVar2 = new ir();
        int i12 = 0;
        irVar2.OooO00o = 0;
        irVar2.OooO0O0 = iOooOOo0;
        irVar2.OooO0OO = 0;
        irVar2.OooO0Oo = iOooOOOo;
        arrayList2.add(irVar2);
        int i13 = iOooOOo0 + iOooOOOo;
        int i14 = 1;
        int i15 = (((i13 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i15];
        int i16 = i15 / 2;
        int[] iArr2 = new int[i15];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            ir irVar3 = (ir) arrayList2.remove(arrayList2.size() - i14);
            if (irVar3.OooO0O0() < i14 || irVar3.OooO00o() < i14) {
                i = i16;
                jrVar = null;
            } else {
                int iOooO00o = ((irVar3.OooO00o() + irVar3.OooO0O0()) + i14) / 2;
                int i17 = i14 + i16;
                iArr[i17] = irVar3.OooO00o;
                iArr2[i17] = irVar3.OooO0O0;
                int i18 = i12;
                while (i18 < iOooO00o) {
                    int i19 = Math.abs(irVar3.OooO0O0() - irVar3.OooO00o()) % 2 == i14 ? i14 : i12;
                    int iOooO0O0 = irVar3.OooO0O0() - irVar3.OooO00o();
                    int i20 = -i18;
                    int i21 = i20;
                    while (true) {
                        if (i21 > i18) {
                            i = i16;
                            i3 = iOooO00o;
                            jrVar2 = null;
                            break;
                        }
                        if (i21 == i20 || (i21 != i18 && iArr[i21 + 1 + i16] > iArr[(i21 - 1) + i16])) {
                            i8 = iArr[i21 + 1 + i16];
                            i9 = i8;
                        } else {
                            i8 = iArr[(i21 - 1) + i16];
                            i9 = i8 + 1;
                        }
                        int i22 = i21;
                        int i23 = ((i9 - irVar3.OooO00o) + irVar3.OooO0OO) - i22;
                        if (i18 == 0 || i9 != i8) {
                            i10 = i23;
                        } else {
                            i10 = i23;
                            i23--;
                        }
                        int i24 = i16;
                        int i25 = i9;
                        int i26 = i10;
                        i = i24;
                        i3 = iOooO00o;
                        while (i25 < irVar3.OooO0O0 && i26 < irVar3.OooO0Oo && ay1Var.OooO0oo(i25, i26)) {
                            i25++;
                            i26++;
                        }
                        iArr[i22 + i] = i25;
                        if (i19 != 0) {
                            int i27 = iOooO0O0 - i22;
                            i11 = i19;
                            if (i27 >= i20 + 1 && i27 <= i18 - 1 && iArr2[i27 + i] <= i25) {
                                jrVar2 = new jr();
                                jrVar2.OooO00o = i8;
                                jrVar2.OooO0O0 = i23;
                                jrVar2.OooO0OO = i25;
                                jrVar2.OooO0Oo = i26;
                                jrVar2.OooO0o0 = false;
                                break;
                            }
                        } else {
                            i11 = i19;
                        }
                        i21 = i22 + 2;
                        i16 = i;
                        iOooO00o = i3;
                        i19 = i11;
                    }
                    if (jrVar2 != null) {
                        jrVar = jrVar2;
                        break;
                    }
                    boolean z = (irVar3.OooO0O0() - irVar3.OooO00o()) % 2 == 0;
                    int iOooO0O02 = irVar3.OooO0O0() - irVar3.OooO00o();
                    int i28 = i20;
                    while (true) {
                        if (i28 > i18) {
                            jrVar3 = null;
                            break;
                        }
                        if (i28 == i20 || (i28 != i18 && iArr2[i28 + 1 + i] < iArr2[(i28 - 1) + i])) {
                            i4 = iArr2[i28 + 1 + i];
                            i5 = i4;
                        } else {
                            i4 = iArr2[(i28 - 1) + i];
                            i5 = i4 - 1;
                        }
                        boolean z2 = z;
                        int i29 = irVar3.OooO0Oo - ((irVar3.OooO0O0 - i5) - i28);
                        int i30 = (i18 == 0 || i5 != i4) ? i29 : i29 + 1;
                        int i31 = iOooO0O02;
                        while (i5 > irVar3.OooO00o && i29 > irVar3.OooO0OO) {
                            i6 = i28;
                            if (!ay1Var.OooO0oo(i5 - 1, i29 - 1)) {
                                break;
                            }
                            i5--;
                            i29--;
                            i28 = i6;
                        }
                        i6 = i28;
                        iArr2[i6 + i] = i5;
                        if (z2 && (i7 = i31 - i6) >= i20 && i7 <= i18 && iArr[i7 + i] >= i5) {
                            jrVar3 = new jr();
                            jrVar3.OooO00o = i5;
                            jrVar3.OooO0O0 = i29;
                            jrVar3.OooO0OO = i4;
                            jrVar3.OooO0Oo = i30;
                            jrVar3.OooO0o0 = true;
                            break;
                        }
                        i28 = i6 + 2;
                        z = z2;
                        iOooO0O02 = i31;
                    }
                    if (jrVar3 != null) {
                        jrVar = jrVar3;
                        break;
                    }
                    i18++;
                    i16 = i;
                    iOooO00o = i3;
                    i14 = 1;
                    i12 = 0;
                }
                i = i16;
                jrVar = null;
            }
            if (jrVar != null) {
                if (jrVar.OooO00o() > 0) {
                    int i32 = jrVar.OooO0Oo;
                    int i33 = jrVar.OooO0O0;
                    int i34 = i32 - i33;
                    int i35 = jrVar.OooO0OO;
                    int i36 = jrVar.OooO00o;
                    int i37 = i35 - i36;
                    arrayList.add(i34 != i37 ? jrVar.OooO0o0 ? new fr(i36, i33, jrVar.OooO00o()) : i34 > i37 ? new fr(i36, i33 + 1, jrVar.OooO00o()) : new fr(i36 + 1, i33, jrVar.OooO00o()) : new fr(i36, i33, i37));
                }
                if (arrayList3.isEmpty()) {
                    irVar = new ir();
                    i2 = 1;
                } else {
                    i2 = 1;
                    irVar = (ir) arrayList3.remove(arrayList3.size() - 1);
                }
                irVar.OooO00o = irVar3.OooO00o;
                irVar.OooO0OO = irVar3.OooO0OO;
                irVar.OooO0O0 = jrVar.OooO00o;
                irVar.OooO0Oo = jrVar.OooO0O0;
                arrayList2.add(irVar);
                irVar3.OooO0O0 = irVar3.OooO0O0;
                irVar3.OooO0Oo = irVar3.OooO0Oo;
                irVar3.OooO00o = jrVar.OooO0OO;
                irVar3.OooO0OO = jrVar.OooO0Oo;
                arrayList2.add(irVar3);
            } else {
                i2 = 1;
                arrayList3.add(irVar3);
            }
            i14 = i2;
            i16 = i;
            i12 = 0;
        }
        Collections.sort(arrayList, hh0.OooO0OO);
        this.OooO0oo.OooO0OO.execute(new pi2((Object) this, (Object) new gr(ay1Var, arrayList, iArr, iArr2), 9, false));
    }
}
