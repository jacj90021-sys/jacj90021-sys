package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u41 extends l3 {
    public o0O000O OooO;
    public wh1[] OooO0o;
    public wh1[] OooO0oO;
    public int OooO0oo;

    @Override // com.cmaster.cloner.l3
    public final void OooO(vm0 vm0Var, l3 l3Var, boolean z) {
        wh1 wh1Var = l3Var.OooO00o;
        if (wh1Var == null) {
            return;
        }
        float[] fArr = wh1Var.OooOO0O;
        g3 g3Var = l3Var.OooO0Oo;
        int iOooO0Oo = g3Var.OooO0Oo();
        for (int i = 0; i < iOooO0Oo; i++) {
            wh1 wh1VarOooO0o0 = g3Var.OooO0o0(i);
            float fOooO0o = g3Var.OooO0o(i);
            o0O000O o0o000o = this.OooO;
            o0o000o.OooO0o0 = wh1VarOooO0o0;
            if (wh1VarOooO0o0.OooO0Oo) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((wh1) o0o000o.OooO0o0).OooOO0O;
                    float f = (fArr[i2] * fOooO0o) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((wh1) o0o000o.OooO0o0).OooOO0O[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((u41) o0o000o.OooO0o).OooOO0O((wh1) o0o000o.OooO0o0);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fOooO0o;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((wh1) o0o000o.OooO0o0).OooOO0O[i3] = f3;
                    } else {
                        ((wh1) o0o000o.OooO0o0).OooOO0O[i3] = 0.0f;
                    }
                }
                OooOO0(wh1VarOooO0o0);
            }
            this.OooO0O0 = (l3Var.OooO0O0 * fOooO0o) + this.OooO0O0;
        }
        OooOO0O(wh1Var);
    }

    @Override // com.cmaster.cloner.l3
    public final wh1 OooO0Oo(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.OooO0oo; i2++) {
            wh1[] wh1VarArr = this.OooO0o;
            wh1 wh1Var = wh1VarArr[i2];
            if (!zArr[wh1Var.OooO0o0]) {
                o0O000O o0o000o = this.OooO;
                o0o000o.OooO0o0 = wh1Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((wh1) o0o000o.OooO0o0).OooOO0O[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    wh1 wh1Var2 = wh1VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = wh1Var2.OooOO0O[i3];
                            float f3 = ((wh1) o0o000o.OooO0o0).OooOO0O[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.OooO0o[i];
    }

    @Override // com.cmaster.cloner.l3
    public final boolean OooO0o0() {
        return this.OooO0oo == 0;
    }

    public final void OooOO0(wh1 wh1Var) {
        int i;
        wh1[] wh1VarArr;
        int i2 = this.OooO0oo + 1;
        wh1[] wh1VarArr2 = this.OooO0o;
        if (i2 > wh1VarArr2.length) {
            wh1[] wh1VarArr3 = (wh1[]) Arrays.copyOf(wh1VarArr2, wh1VarArr2.length * 2);
            this.OooO0o = wh1VarArr3;
            this.OooO0oO = (wh1[]) Arrays.copyOf(wh1VarArr3, wh1VarArr3.length * 2);
        }
        wh1[] wh1VarArr4 = this.OooO0o;
        int i3 = this.OooO0oo;
        wh1VarArr4[i3] = wh1Var;
        int i4 = i3 + 1;
        this.OooO0oo = i4;
        if (i4 > 1 && wh1VarArr4[i3].OooO0o0 > wh1Var.OooO0o0) {
            int i5 = 0;
            while (true) {
                i = this.OooO0oo;
                wh1VarArr = this.OooO0oO;
                if (i5 >= i) {
                    break;
                }
                wh1VarArr[i5] = this.OooO0o[i5];
                i5++;
            }
            Arrays.sort(wh1VarArr, 0, i, new p12(6));
            for (int i6 = 0; i6 < this.OooO0oo; i6++) {
                this.OooO0o[i6] = this.OooO0oO[i6];
            }
        }
        wh1Var.OooO0Oo = true;
        wh1Var.OooO00o(this);
    }

    public final void OooOO0O(wh1 wh1Var) {
        int i = 0;
        while (i < this.OooO0oo) {
            if (this.OooO0o[i] == wh1Var) {
                while (true) {
                    int i2 = this.OooO0oo;
                    if (i >= i2 - 1) {
                        this.OooO0oo = i2 - 1;
                        wh1Var.OooO0Oo = false;
                        return;
                    } else {
                        wh1[] wh1VarArr = this.OooO0o;
                        int i3 = i + 1;
                        wh1VarArr[i] = wh1VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // com.cmaster.cloner.l3
    public final String toString() {
        o0O000O o0o000o = this.OooO;
        String str = " goal -> (" + this.OooO0O0 + ") : ";
        for (int i = 0; i < this.OooO0oo; i++) {
            o0o000o.OooO0o0 = this.OooO0o[i];
            str = str + o0o000o + " ";
        }
        return str;
    }
}
