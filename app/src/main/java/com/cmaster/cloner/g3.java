package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g3 {
    public final l3 OooO0O0;
    public final hx2 OooO0OO;
    public int OooO00o = 0;
    public int OooO0Oo = 8;
    public int[] OooO0o0 = new int[8];
    public int[] OooO0o = new int[8];
    public float[] OooO0oO = new float[8];
    public int OooO0oo = -1;
    public int OooO = -1;
    public boolean OooOO0 = false;

    public g3(l3 l3Var, hx2 hx2Var) {
        this.OooO0O0 = l3Var;
        this.OooO0OO = hx2Var;
    }

    public final void OooO00o(wh1 wh1Var, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.OooO0oo;
            l3 l3Var = this.OooO0O0;
            if (i == -1) {
                this.OooO0oo = 0;
                this.OooO0oO[0] = f;
                this.OooO0o0[0] = wh1Var.OooO0o0;
                this.OooO0o[0] = -1;
                wh1Var.OooOOO++;
                wh1Var.OooO00o(l3Var);
                this.OooO00o++;
                if (this.OooOO0) {
                    return;
                }
                int i2 = this.OooO + 1;
                this.OooO = i2;
                int[] iArr = this.OooO0o0;
                if (i2 >= iArr.length) {
                    this.OooOO0 = true;
                    this.OooO = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.OooO00o; i4++) {
                int i5 = this.OooO0o0[i];
                int i6 = wh1Var.OooO0o0;
                if (i5 == i6) {
                    float[] fArr = this.OooO0oO;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.OooO0oo;
                        int[] iArr2 = this.OooO0o;
                        if (i == i7) {
                            this.OooO0oo = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            wh1Var.OooO0O0(l3Var);
                        }
                        if (this.OooOO0) {
                            this.OooO = i;
                        }
                        wh1Var.OooOOO--;
                        this.OooO00o--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.OooO0o[i];
            }
            int length = this.OooO;
            int i8 = length + 1;
            if (this.OooOO0) {
                int[] iArr3 = this.OooO0o0;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.OooO0o0;
            if (length >= iArr4.length && this.OooO00o < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.OooO0o0;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.OooO0o0;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.OooO0Oo * 2;
                this.OooO0Oo = i10;
                this.OooOO0 = false;
                this.OooO = length - 1;
                this.OooO0oO = Arrays.copyOf(this.OooO0oO, i10);
                this.OooO0o0 = Arrays.copyOf(this.OooO0o0, this.OooO0Oo);
                this.OooO0o = Arrays.copyOf(this.OooO0o, this.OooO0Oo);
            }
            this.OooO0o0[length] = wh1Var.OooO0o0;
            this.OooO0oO[length] = f;
            int[] iArr7 = this.OooO0o;
            if (i3 != -1) {
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                iArr7[length] = this.OooO0oo;
                this.OooO0oo = length;
            }
            wh1Var.OooOOO++;
            wh1Var.OooO00o(l3Var);
            this.OooO00o++;
            if (!this.OooOO0) {
                this.OooO++;
            }
            int i11 = this.OooO;
            int[] iArr8 = this.OooO0o0;
            if (i11 >= iArr8.length) {
                this.OooOO0 = true;
                this.OooO = iArr8.length - 1;
            }
        }
    }

    public final void OooO0O0() {
        int i = this.OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.OooO00o; i2++) {
            wh1 wh1Var = ((wh1[]) this.OooO0OO.OooO0oO)[this.OooO0o0[i]];
            if (wh1Var != null) {
                wh1Var.OooO0O0(this.OooO0O0);
            }
            i = this.OooO0o[i];
        }
        this.OooO0oo = -1;
        this.OooO = -1;
        this.OooOO0 = false;
        this.OooO00o = 0;
    }

    public final float OooO0OO(wh1 wh1Var) {
        int i = this.OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.OooO00o; i2++) {
            if (this.OooO0o0[i] == wh1Var.OooO0o0) {
                return this.OooO0oO[i];
            }
            i = this.OooO0o[i];
        }
        return 0.0f;
    }

    public final int OooO0Oo() {
        return this.OooO00o;
    }

    public final float OooO0o(int i) {
        int i2 = this.OooO0oo;
        for (int i3 = 0; i2 != -1 && i3 < this.OooO00o; i3++) {
            if (i3 == i) {
                return this.OooO0oO[i2];
            }
            i2 = this.OooO0o[i2];
        }
        return 0.0f;
    }

    public final wh1 OooO0o0(int i) {
        int i2 = this.OooO0oo;
        for (int i3 = 0; i2 != -1 && i3 < this.OooO00o; i3++) {
            if (i3 == i) {
                return ((wh1[]) this.OooO0OO.OooO0oO)[this.OooO0o0[i2]];
            }
            i2 = this.OooO0o[i2];
        }
        return null;
    }

    public final void OooO0oO(wh1 wh1Var, float f) {
        if (f == 0.0f) {
            OooO0oo(wh1Var, true);
            return;
        }
        int i = this.OooO0oo;
        l3 l3Var = this.OooO0O0;
        if (i == -1) {
            this.OooO0oo = 0;
            this.OooO0oO[0] = f;
            this.OooO0o0[0] = wh1Var.OooO0o0;
            this.OooO0o[0] = -1;
            wh1Var.OooOOO++;
            wh1Var.OooO00o(l3Var);
            this.OooO00o++;
            if (this.OooOO0) {
                return;
            }
            int i2 = this.OooO + 1;
            this.OooO = i2;
            int[] iArr = this.OooO0o0;
            if (i2 >= iArr.length) {
                this.OooOO0 = true;
                this.OooO = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.OooO00o; i4++) {
            int i5 = this.OooO0o0[i];
            int i6 = wh1Var.OooO0o0;
            if (i5 == i6) {
                this.OooO0oO[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.OooO0o[i];
        }
        int length = this.OooO;
        int i7 = length + 1;
        if (this.OooOO0) {
            int[] iArr2 = this.OooO0o0;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.OooO0o0;
        if (length >= iArr3.length && this.OooO00o < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.OooO0o0;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.OooO0o0;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.OooO0Oo * 2;
            this.OooO0Oo = i9;
            this.OooOO0 = false;
            this.OooO = length - 1;
            this.OooO0oO = Arrays.copyOf(this.OooO0oO, i9);
            this.OooO0o0 = Arrays.copyOf(this.OooO0o0, this.OooO0Oo);
            this.OooO0o = Arrays.copyOf(this.OooO0o, this.OooO0Oo);
        }
        this.OooO0o0[length] = wh1Var.OooO0o0;
        this.OooO0oO[length] = f;
        int[] iArr6 = this.OooO0o;
        if (i3 != -1) {
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            iArr6[length] = this.OooO0oo;
            this.OooO0oo = length;
        }
        wh1Var.OooOOO++;
        wh1Var.OooO00o(l3Var);
        int i10 = this.OooO00o + 1;
        this.OooO00o = i10;
        if (!this.OooOO0) {
            this.OooO++;
        }
        int[] iArr7 = this.OooO0o0;
        if (i10 >= iArr7.length) {
            this.OooOO0 = true;
        }
        if (this.OooO >= iArr7.length) {
            this.OooOO0 = true;
            this.OooO = iArr7.length - 1;
        }
    }

    public final float OooO0oo(wh1 wh1Var, boolean z) {
        int i = this.OooO0oo;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.OooO00o) {
            if (this.OooO0o0[i] == wh1Var.OooO0o0) {
                int i4 = this.OooO0oo;
                int[] iArr = this.OooO0o;
                if (i == i4) {
                    this.OooO0oo = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    wh1Var.OooO0O0(this.OooO0O0);
                }
                wh1Var.OooOOO--;
                this.OooO00o--;
                this.OooO0o0[i] = -1;
                if (this.OooOO0) {
                    this.OooO = i;
                }
                return this.OooO0oO[i];
            }
            i2++;
            i3 = i;
            i = this.OooO0o[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.OooO0oo;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.OooO00o; i2++) {
            StringBuilder sbOooOO0 = rj.OooOO0(string.concat(" -> "));
            sbOooOO0.append(this.OooO0oO[i]);
            sbOooOO0.append(" : ");
            StringBuilder sbOooOO02 = rj.OooOO0(sbOooOO0.toString());
            sbOooOO02.append(((wh1[]) this.OooO0OO.OooO0oO)[this.OooO0o0[i]]);
            string = sbOooOO02.toString();
            i = this.OooO0o[i];
        }
        return string;
    }
}
