package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b01 {
    public final int OooO00o;
    public ArrayList OooO0O0;
    public int OooO0OO = -1;
    public int OooO0Oo;
    public final int OooO0o0;

    public b01(im2 im2Var, int i, int i2, int i3) {
        this.OooO00o = i2;
        this.OooO0O0 = new ArrayList(i);
        this.OooO0o0 = i3;
    }

    public final void OooO00o(zm zmVar) {
        this.OooO0O0.add(zmVar);
        zmVar.OooO0OO.getClass();
        if (zmVar instanceof mo0) {
            throw null;
        }
    }

    public final void OooO0O0() {
        int iOooO0o;
        int size = this.OooO0O0.size();
        int i = this.OooO00o + this.OooO0OO + this.OooO0Oo;
        int i2 = i - this.OooO0o0;
        oOo000Oo ooo000oo = new oOo000Oo(i);
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 >= i2) {
                ooo000oo.OooO0O0(i3, i3 + 1);
            } else {
                ooo000oo.OooO0O0(i3, i3);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            zm zmVar = (zm) this.OooO0O0.get(i4);
            if (!(zmVar instanceof ke)) {
                ArrayList arrayList = this.OooO0O0;
                v81 v81Var = zmVar.OooO0Oo;
                int length = v81Var.OooO0o0.length;
                v81 v81Var2 = new v81(length);
                for (int i5 = 0; i5 < length; i5++) {
                    u81 u81VarOooO0Oo = (u81) v81Var.OooO0o0(i5);
                    u81 u81Var = null;
                    if (u81VarOooO0Oo != null) {
                        try {
                            iOooO0o = ((ti0) ooo000oo.OooO0o0).OooO0o(u81VarOooO0Oo.OooO0Oo);
                        } catch (IndexOutOfBoundsException unused) {
                            iOooO0o = -1;
                        }
                        if (iOooO0o >= 0) {
                            if (u81VarOooO0Oo.OooO0Oo != iOooO0o) {
                                u81VarOooO0Oo = u81.OooO0Oo(iOooO0o, u81VarOooO0Oo.OooO0o0);
                            }
                            u81Var = u81VarOooO0Oo;
                        } else {
                            ra.OooOOO0(u7.OooO00o(new byte[]{103, -81, -27, 19, 78, 57, -63, 31, 103, -89, -27, 13, 95, 44, -46, 31, 111, -87, -96, 26, 15, 47, -34, 4, 41, -78, -96, 25, 70, 58, -59, 19, 123}, new byte[]{9, -64, -59, 126, 47, 73, -79, 118}));
                        }
                    }
                    v81Var2.OooO0o(i5, u81Var);
                }
                v81Var2.OooO0Oo = false;
                if (!v81Var2.equals(v81Var)) {
                    v81Var = v81Var2;
                }
                arrayList.set(i4, zmVar.OooOO0O(v81Var));
            }
        }
        this.OooO0Oo++;
    }

    public final void OooO0OO() {
        int size = this.OooO0O0.size();
        for (int i = 0; i < size; i++) {
            zm zmVar = (zm) this.OooO0O0.get(i);
            if (!(zmVar instanceof ke)) {
                this.OooO0O0.set(i, zmVar.OooOO0(1));
            }
        }
        this.OooO0OO++;
    }

    public final os OooO0Oo(zm zmVar) {
        v81 v81Var = zmVar.OooO0Oo;
        os osVar = zmVar.OooO0O0;
        os osVarOooO0o0 = OooO0o0(zmVar.OooOO0O(v81Var.OooOO0O(osVar.OooO0o0, null)), osVar);
        if (osVarOooO0o0 != null) {
            return osVarOooO0o0;
        }
        throw new mq(u7.OooO00o(new byte[]{48, -63, 114, 62, 13, 81, -51, 73, 26, -53, 54, 123, 26, 81, -49, 72, 26, -53, 114, 61, 26, 83, -116}, new byte[]{126, -82, 82, 91, 117, 33, -84, 39}) + zmVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0o(os[] osVarArr) {
        int i = this.OooO0OO;
        if (i < 0) {
            i = 0;
        }
        boolean z = false;
        while (true) {
            int size = this.OooO0O0.size();
            int i2 = this.OooO0OO;
            for (int i3 = 0; i3 < size; i3++) {
                zm zmVar = (zm) this.OooO0O0.get(i3);
                os osVar = osVarArr[i3];
                os osVarOooO0o0 = OooO0o0(zmVar, osVar);
                if (osVarOooO0o0 == null) {
                    BitSet bitSetOooO0o = OooO0Oo(zmVar).OooO0Oo.OooO0o(zmVar);
                    boolean z2 = zmVar.OooO0O0.OooO0o0;
                    v81 v81Var = zmVar.OooO0Oo;
                    int length = v81Var.OooO0o0.length;
                    int iOooO0OO = (z2 == 0 || bitSetOooO0o.get(0)) ? 0 : ((u81) v81Var.OooO0o0(0)).OooO0OO();
                    int iOooO0OO2 = 0;
                    for (int i4 = z2; i4 < length; i4++) {
                        if (!bitSetOooO0o.get(i4)) {
                            iOooO0OO2 += ((u81) v81Var.OooO0o0(i4)).OooO0OO();
                        }
                    }
                    int iMax = Math.max(iOooO0OO2, iOooO0OO);
                    if (iMax > i2) {
                        i2 = iMax;
                    }
                } else {
                    if (osVar == osVarOooO0o0) {
                    }
                }
                osVarArr[i3] = osVarOooO0o0;
            }
            if (i >= i2) {
                this.OooO0OO = i;
                return z;
            }
            int i5 = i2 - i;
            int size2 = this.OooO0O0.size();
            for (int i6 = 0; i6 < size2; i6++) {
                zm zmVar2 = (zm) this.OooO0O0.get(i6);
                if (!(zmVar2 instanceof ke)) {
                    this.OooO0O0.set(i6, zmVar2.OooOO0(i5));
                }
            }
            z = true;
            i = i2;
        }
    }

    public final os OooO0o0(zm zmVar, os osVar) {
        os osVar2;
        while (osVar != null) {
            if (osVar.OooO0Oo.OooO(zmVar)) {
                return osVar;
            }
            os[] osVarArr = ps.OooO00o;
            int i = osVar.OooO0OO;
            if (i == -1) {
                osVar = null;
            } else {
                try {
                    osVar2 = ps.OooO00o[i + 1];
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (osVar2 == null) {
                    ra.OooOOO(u7.OooO00o(new byte[]{-47, -11, 83, 7, -102, 64, -117, 68, -48, -11, 80, 23}, new byte[]{-77, -102, 52, 114, -23, 96, -28, 52}));
                    return null;
                }
                osVar = osVar2;
            }
        }
        return osVar;
    }
}
