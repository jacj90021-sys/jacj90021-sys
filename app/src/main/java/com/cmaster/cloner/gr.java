package com.cmaster.cloner;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gr {
    public final ArrayList OooO00o;
    public final int[] OooO0O0;
    public final int[] OooO0OO;
    public final ay1 OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final boolean OooO0oO;

    public gr(ay1 ay1Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        fr frVar;
        int i2;
        this.OooO00o = arrayList;
        this.OooO0O0 = iArr;
        this.OooO0OO = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.OooO0Oo = ay1Var;
        int iOooOOo0 = ay1Var.OooOOo0();
        this.OooO0o0 = iOooOOo0;
        int iOooOOOo = ay1Var.OooOOOo();
        this.OooO0o = iOooOOOo;
        this.OooO0oO = true;
        fr frVar2 = arrayList.isEmpty() ? null : (fr) arrayList.get(0);
        if (frVar2 == null || frVar2.OooO00o != 0 || frVar2.OooO0O0 != 0) {
            arrayList.add(0, new fr(0, 0, 0));
        }
        arrayList.add(new fr(iOooOOo0, iOooOOOo, 0));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            fr frVar3 = (fr) obj;
            for (int i4 = 0; i4 < frVar3.OooO0OO; i4++) {
                int i5 = frVar3.OooO00o + i4;
                int i6 = frVar3.OooO0O0 + i4;
                ay1Var.OooO0o(i5, i6);
                iArr[i5] = (i6 << 4) | 1;
                iArr2[i6] = (i5 << 4) | 1;
            }
        }
        if (this.OooO0oO) {
            int size2 = arrayList.size();
            int i7 = 0;
            int i8 = 0;
            while (i8 < size2) {
                Object obj2 = arrayList.get(i8);
                i8++;
                fr frVar4 = (fr) obj2;
                while (true) {
                    i = frVar4.OooO00o;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size3 = arrayList.size();
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                if (i9 < size3) {
                                    frVar = (fr) arrayList.get(i9);
                                    while (true) {
                                        i2 = frVar.OooO0O0;
                                        if (i10 < i2) {
                                            if (iArr2[i10] == 0 && ay1Var.OooO0oo(i7, i10)) {
                                                ay1Var.OooO0o(i7, i10);
                                                iArr[i7] = (i10 << 4) | 8;
                                                iArr2[i10] = (i7 << 4) | 8;
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                }
                                i10 = frVar.OooO0OO + i2;
                                i9++;
                            }
                        }
                        i7++;
                    }
                }
                i7 = frVar4.OooO0OO + i;
            }
        }
    }

    public static hr OooO00o(ArrayDeque arrayDeque, int i, boolean z) {
        hr hrVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                hrVar = null;
                break;
            }
            hrVar = (hr) it.next();
            if (hrVar.OooO00o == i && hrVar.OooO0OO == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            hr hrVar2 = (hr) it.next();
            if (z) {
                hrVar2.OooO0O0--;
            } else {
                hrVar2.OooO0O0++;
            }
        }
        return hrVar;
    }
}
