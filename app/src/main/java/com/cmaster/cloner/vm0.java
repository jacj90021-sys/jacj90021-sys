package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vm0 {
    public static boolean OooOOOo = false;
    public static int OooOOo0 = 1000;
    public final u41 OooO0OO;
    public l3[] OooO0o;
    public final hx2 OooOO0o;
    public l3 OooOOOO;
    public boolean OooO00o = false;
    public int OooO0O0 = 0;
    public int OooO0Oo = 32;
    public int OooO0o0 = 32;
    public boolean OooO0oO = false;
    public boolean[] OooO0oo = new boolean[32];
    public int OooO = 1;
    public int OooOO0 = 0;
    public int OooOO0O = 32;
    public wh1[] OooOOO0 = new wh1[OooOOo0];
    public int OooOOO = 0;

    public vm0() {
        this.OooO0o = null;
        this.OooO0o = new l3[32];
        OooOOoo();
        hx2 hx2Var = new hx2(4, false);
        hx2Var.OooO0o0 = new s31();
        hx2Var.OooO0o = new s31();
        hx2Var.OooO0oO = new wh1[32];
        this.OooOO0o = hx2Var;
        u41 u41Var = new u41(hx2Var);
        u41Var.OooO0o = new wh1[128];
        u41Var.OooO0oO = new wh1[128];
        u41Var.OooO0oo = 0;
        u41Var.OooO = new o0O000O(25, (Object) u41Var, false);
        this.OooO0OO = u41Var;
        this.OooOOOO = new l3(hx2Var);
    }

    public static int OooOOO(Object obj) {
        wh1 wh1Var = ((qh) obj).OooO;
        if (wh1Var != null) {
            return (int) (wh1Var.OooO0oo + 0.5f);
        }
        return 0;
    }

    public final void OooO() {
        for (int i = 0; i < this.OooOO0; i++) {
            l3 l3Var = this.OooO0o[i];
            l3Var.OooO00o.OooO0oo = l3Var.OooO0O0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final wh1 OooO00o(int i) {
        s31 s31Var = (s31) this.OooOO0o.OooO0o;
        int i2 = s31Var.OooO0o0;
        wh1 wh1Var = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] r3 = s31Var.OooO0Oo;
            wh1 r4 = (wh1) r3[i3];
            r3[i3] = null;
            s31Var.OooO0o0 = i3;
            wh1Var = r4;
        }
        wh1 wh1Var2 = wh1Var;
        if (wh1Var2 == null) {
            wh1Var2 = new wh1(i);
            wh1Var2.OooOOOO = i;
        } else {
            wh1Var2.OooO0OO();
            wh1Var2.OooOOOO = i;
        }
        int i4 = this.OooOOO;
        int i5 = OooOOo0;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            OooOOo0 = i6;
            this.OooOOO0 = (wh1[]) Arrays.copyOf(this.OooOOO0, i6);
        }
        wh1[] wh1VarArr = this.OooOOO0;
        int i7 = this.OooOOO;
        this.OooOOO = i7 + 1;
        wh1VarArr[i7] = wh1Var2;
        return wh1Var2;
    }

    public final void OooO0O0(wh1 wh1Var, wh1 wh1Var2, int i, float f, wh1 wh1Var3, wh1 wh1Var4, int i2, int i3) {
        l3 l3VarOooOO0o = OooOO0o();
        if (wh1Var2 == wh1Var3) {
            l3VarOooOO0o.OooO0Oo.OooO0oO(wh1Var, 1.0f);
            l3VarOooOO0o.OooO0Oo.OooO0oO(wh1Var4, 1.0f);
            l3VarOooOO0o.OooO0Oo.OooO0oO(wh1Var2, -2.0f);
        } else {
            g3 g3Var = l3VarOooOO0o.OooO0Oo;
            if (f == 0.5f) {
                g3Var.OooO0oO(wh1Var, 1.0f);
                l3VarOooOO0o.OooO0Oo.OooO0oO(wh1Var2, -1.0f);
                l3VarOooOO0o.OooO0Oo.OooO0oO(wh1Var3, -1.0f);
                l3VarOooOO0o.OooO0Oo.OooO0oO(wh1Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l3VarOooOO0o.OooO0O0 = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                g3Var.OooO0oO(wh1Var, -1.0f);
                l3VarOooOO0o.OooO0Oo.OooO0oO(wh1Var2, 1.0f);
                l3VarOooOO0o.OooO0O0 = i;
            } else if (f >= 1.0f) {
                g3Var.OooO0oO(wh1Var4, -1.0f);
                l3VarOooOO0o.OooO0Oo.OooO0oO(wh1Var3, 1.0f);
                l3VarOooOO0o.OooO0O0 = -i2;
            } else {
                float f2 = 1.0f - f;
                g3Var.OooO0oO(wh1Var, f2 * 1.0f);
                l3VarOooOO0o.OooO0Oo.OooO0oO(wh1Var2, f2 * (-1.0f));
                l3VarOooOO0o.OooO0Oo.OooO0oO(wh1Var3, (-1.0f) * f);
                l3VarOooOO0o.OooO0Oo.OooO0oO(wh1Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    l3VarOooOO0o.OooO0O0 = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            l3VarOooOO0o.OooO00o(this, i3);
        }
        OooO0OO(l3VarOooOO0o);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0OO(com.cmaster.cloner.l3 r18) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.vm0.OooO0OO(com.cmaster.cloner.l3):void");
    }

    public final void OooO0Oo(wh1 wh1Var, int i) {
        int i2 = wh1Var.OooO0o;
        if (i2 == -1) {
            wh1Var.OooO0Oo(this, i);
            for (int i3 = 0; i3 < this.OooO0O0 + 1; i3++) {
                wh1 wh1Var2 = ((wh1[]) this.OooOO0o.OooO0oO)[i3];
            }
            return;
        }
        if (i2 == -1) {
            l3 l3VarOooOO0o = OooOO0o();
            l3VarOooOO0o.OooO00o = wh1Var;
            float f = i;
            wh1Var.OooO0oo = f;
            l3VarOooOO0o.OooO0O0 = f;
            l3VarOooOO0o.OooO0o0 = true;
            OooO0OO(l3VarOooOO0o);
            return;
        }
        l3 l3Var = this.OooO0o[i2];
        if (l3Var.OooO0o0) {
            l3Var.OooO0O0 = i;
            return;
        }
        if (l3Var.OooO0Oo.OooO0Oo() == 0) {
            l3Var.OooO0o0 = true;
            l3Var.OooO0O0 = i;
            return;
        }
        l3 l3VarOooOO0o2 = OooOO0o();
        if (i < 0) {
            l3VarOooOO0o2.OooO0O0 = i * (-1);
            l3VarOooOO0o2.OooO0Oo.OooO0oO(wh1Var, 1.0f);
        } else {
            l3VarOooOO0o2.OooO0O0 = i;
            l3VarOooOO0o2.OooO0Oo.OooO0oO(wh1Var, -1.0f);
        }
        OooO0OO(l3VarOooOO0o2);
    }

    public final void OooO0o(wh1 wh1Var, wh1 wh1Var2, int i, int i2) {
        l3 l3VarOooOO0o = OooOO0o();
        wh1 wh1VarOooOOO0 = OooOOO0();
        wh1VarOooOOO0.OooO0oO = 0;
        l3VarOooOO0o.OooO0O0(wh1Var, wh1Var2, wh1VarOooOOO0, i);
        if (i2 != 8) {
            l3VarOooOO0o.OooO0Oo.OooO0oO(OooOO0(i2), (int) (l3VarOooOO0o.OooO0Oo.OooO0OO(wh1VarOooOOO0) * (-1.0f)));
        }
        OooO0OO(l3VarOooOO0o);
    }

    public final void OooO0o0(wh1 wh1Var, wh1 wh1Var2, int i, int i2) {
        if (i2 == 8 && wh1Var2.OooO && wh1Var.OooO0o == -1) {
            wh1Var.OooO0Oo(this, wh1Var2.OooO0oo + i);
            return;
        }
        l3 l3VarOooOO0o = OooOO0o();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l3VarOooOO0o.OooO0O0 = i;
        }
        g3 g3Var = l3VarOooOO0o.OooO0Oo;
        if (z) {
            g3Var.OooO0oO(wh1Var, 1.0f);
            l3VarOooOO0o.OooO0Oo.OooO0oO(wh1Var2, -1.0f);
        } else {
            g3Var.OooO0oO(wh1Var, -1.0f);
            l3VarOooOO0o.OooO0Oo.OooO0oO(wh1Var2, 1.0f);
        }
        if (i2 != 8) {
            l3VarOooOO0o.OooO00o(this, i2);
        }
        OooO0OO(l3VarOooOO0o);
    }

    public final void OooO0oO(wh1 wh1Var, wh1 wh1Var2, int i, int i2) {
        l3 l3VarOooOO0o = OooOO0o();
        wh1 wh1VarOooOOO0 = OooOOO0();
        wh1VarOooOOO0.OooO0oO = 0;
        l3VarOooOO0o.OooO0OO(wh1Var, wh1Var2, wh1VarOooOOO0, i);
        if (i2 != 8) {
            l3VarOooOO0o.OooO0Oo.OooO0oO(OooOO0(i2), (int) (l3VarOooOO0o.OooO0Oo.OooO0OO(wh1VarOooOOO0) * (-1.0f)));
        }
        OooO0OO(l3VarOooOO0o);
    }

    public final void OooO0oo(l3 l3Var) {
        int i;
        if (l3Var.OooO0o0) {
            l3Var.OooO00o.OooO0Oo(this, l3Var.OooO0O0);
        } else {
            l3[] l3VarArr = this.OooO0o;
            int i2 = this.OooOO0;
            l3VarArr[i2] = l3Var;
            wh1 wh1Var = l3Var.OooO00o;
            wh1Var.OooO0o = i2;
            this.OooOO0 = i2 + 1;
            wh1Var.OooO0o0(this, l3Var);
        }
        if (this.OooO00o) {
            int i3 = 0;
            while (i3 < this.OooOO0) {
                if (this.OooO0o[i3] == null) {
                    System.out.println("WTF");
                }
                l3 l3Var2 = this.OooO0o[i3];
                if (l3Var2 != null && l3Var2.OooO0o0) {
                    l3Var2.OooO00o.OooO0Oo(this, l3Var2.OooO0O0);
                    ((s31) this.OooOO0o.OooO0o0).OooO00o(l3Var2);
                    this.OooO0o[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.OooOO0;
                        if (i4 >= i) {
                            break;
                        }
                        l3[] l3VarArr2 = this.OooO0o;
                        int i6 = i4 - 1;
                        l3 l3Var3 = l3VarArr2[i4];
                        l3VarArr2[i6] = l3Var3;
                        wh1 wh1Var2 = l3Var3.OooO00o;
                        if (wh1Var2.OooO0o == i4) {
                            wh1Var2.OooO0o = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.OooO0o[i5] = null;
                    }
                    this.OooOO0 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.OooO00o = false;
        }
    }

    public final wh1 OooOO0(int i) {
        if (this.OooO + 1 >= this.OooO0o0) {
            OooOOOO();
        }
        wh1 wh1VarOooO00o = OooO00o(4);
        float[] fArr = wh1VarOooO00o.OooOO0O;
        int i2 = this.OooO0O0 + 1;
        this.OooO0O0 = i2;
        this.OooO++;
        wh1VarOooO00o.OooO0o0 = i2;
        wh1VarOooO00o.OooO0oO = i;
        ((wh1[]) this.OooOO0o.OooO0oO)[i2] = wh1VarOooO00o;
        u41 u41Var = this.OooO0OO;
        u41Var.OooO.OooO0o0 = wh1VarOooO00o;
        Arrays.fill(fArr, 0.0f);
        fArr[wh1VarOooO00o.OooO0oO] = 1.0f;
        u41Var.OooOO0(wh1VarOooO00o);
        return wh1VarOooO00o;
    }

    public final wh1 OooOO0O(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.OooO + 1 >= this.OooO0o0) {
            OooOOOO();
        }
        if (!(obj instanceof qh)) {
            return null;
        }
        qh qhVar = (qh) obj;
        wh1 wh1Var = qhVar.OooO;
        if (wh1Var == null) {
            qhVar.OooO0oo();
            wh1Var = qhVar.OooO;
        }
        int i = wh1Var.OooO0o0;
        hx2 hx2Var = this.OooOO0o;
        if (i != -1 && i <= this.OooO0O0 && ((wh1[]) hx2Var.OooO0oO)[i] != null) {
            return wh1Var;
        }
        if (i != -1) {
            wh1Var.OooO0OO();
        }
        int i2 = this.OooO0O0 + 1;
        this.OooO0O0 = i2;
        this.OooO++;
        wh1Var.OooO0o0 = i2;
        wh1Var.OooOOOO = 1;
        ((wh1[]) hx2Var.OooO0oO)[i2] = wh1Var;
        return wh1Var;
    }

    public final l3 OooOO0o() {
        Object obj;
        hx2 hx2Var = this.OooOO0o;
        s31 s31Var = (s31) hx2Var.OooO0o0;
        int i = s31Var.OooO0o0;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = s31Var.OooO0Oo;
            obj = objArr[i2];
            objArr[i2] = null;
            s31Var.OooO0o0 = i2;
        } else {
            obj = null;
        }
        l3 l3Var = (l3) obj;
        if (l3Var == null) {
            return new l3(hx2Var);
        }
        l3Var.OooO00o = null;
        l3Var.OooO0Oo.OooO0O0();
        l3Var.OooO0O0 = 0.0f;
        l3Var.OooO0o0 = false;
        return l3Var;
    }

    public final wh1 OooOOO0() {
        if (this.OooO + 1 >= this.OooO0o0) {
            OooOOOO();
        }
        wh1 wh1VarOooO00o = OooO00o(3);
        int i = this.OooO0O0 + 1;
        this.OooO0O0 = i;
        this.OooO++;
        wh1VarOooO00o.OooO0o0 = i;
        ((wh1[]) this.OooOO0o.OooO0oO)[i] = wh1VarOooO00o;
        return wh1VarOooO00o;
    }

    public final void OooOOOO() {
        int i = this.OooO0Oo * 2;
        this.OooO0Oo = i;
        this.OooO0o = (l3[]) Arrays.copyOf(this.OooO0o, i);
        hx2 hx2Var = this.OooOO0o;
        hx2Var.OooO0oO = (wh1[]) Arrays.copyOf((wh1[]) hx2Var.OooO0oO, this.OooO0Oo);
        int i2 = this.OooO0Oo;
        this.OooO0oo = new boolean[i2];
        this.OooO0o0 = i2;
        this.OooOO0O = i2;
    }

    public final void OooOOOo() {
        u41 u41Var = this.OooO0OO;
        if (u41Var.OooO0o0()) {
            OooO();
            return;
        }
        if (!this.OooO0oO) {
            OooOOo0(u41Var);
            return;
        }
        for (int i = 0; i < this.OooOO0; i++) {
            if (!this.OooO0o[i].OooO0o0) {
                OooOOo0(u41Var);
                return;
            }
        }
        OooO();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOo(com.cmaster.cloner.l3 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r2
        L6:
            int r4 = r0.OooO
            if (r3 >= r4) goto L11
            boolean[] r4 = r0.OooO0oo
            r4[r3] = r2
            int r3 = r3 + 1
            goto L6
        L11:
            r3 = r2
            r4 = r3
        L13:
            if (r3 != 0) goto Lae
            r5 = 1
            int r4 = r4 + r5
            int r6 = r0.OooO
            int r6 = r6 * 2
            if (r4 < r6) goto L1f
            goto Lae
        L1f:
            com.cmaster.cloner.wh1 r6 = r1.OooO00o
            if (r6 == 0) goto L29
            boolean[] r7 = r0.OooO0oo
            int r6 = r6.OooO0o0
            r7[r6] = r5
        L29:
            boolean[] r6 = r0.OooO0oo
            com.cmaster.cloner.wh1 r6 = r1.OooO0Oo(r6)
            if (r6 == 0) goto L3d
            boolean[] r7 = r0.OooO0oo
            int r8 = r6.OooO0o0
            boolean r9 = r7[r8]
            if (r9 == 0) goto L3b
            goto Lae
        L3b:
            r7[r8] = r5
        L3d:
            if (r6 == 0) goto Laa
            r7 = -1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = r2
            r10 = r7
        L45:
            int r11 = r0.OooOO0
            if (r9 >= r11) goto L95
            com.cmaster.cloner.l3[] r11 = r0.OooO0o
            r11 = r11[r9]
            com.cmaster.cloner.wh1 r12 = r11.OooO00o
            int r12 = r12.OooOOOO
            if (r12 != r5) goto L54
            goto L91
        L54:
            boolean r12 = r11.OooO0o0
            if (r12 == 0) goto L59
            goto L91
        L59:
            com.cmaster.cloner.g3 r12 = r11.OooO0Oo
            int r13 = r12.OooO0oo
            if (r13 != r7) goto L60
            goto L79
        L60:
            r14 = r2
        L61:
            if (r13 == r7) goto L79
            int r15 = r12.OooO00o
            if (r14 >= r15) goto L79
            int[] r15 = r12.OooO0o0
            r15 = r15[r13]
            int r2 = r6.OooO0o0
            if (r15 != r2) goto L71
            r2 = r5
            goto L7a
        L71:
            int[] r2 = r12.OooO0o
            r13 = r2[r13]
            int r14 = r14 + 1
            r2 = 0
            goto L61
        L79:
            r2 = 0
        L7a:
            if (r2 == 0) goto L91
            com.cmaster.cloner.g3 r2 = r11.OooO0Oo
            float r2 = r2.OooO0OO(r6)
            r12 = 0
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 >= 0) goto L91
            float r11 = r11.OooO0O0
            float r11 = -r11
            float r11 = r11 / r2
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 >= 0) goto L91
            r10 = r9
            r8 = r11
        L91:
            int r9 = r9 + 1
            r2 = 0
            goto L45
        L95:
            if (r10 <= r7) goto Lab
            com.cmaster.cloner.l3[] r2 = r0.OooO0o
            r2 = r2[r10]
            com.cmaster.cloner.wh1 r5 = r2.OooO00o
            r5.OooO0o = r7
            r2.OooO0oO(r6)
            com.cmaster.cloner.wh1 r5 = r2.OooO00o
            r5.OooO0o = r10
            r5.OooO0o0(r0, r2)
            goto Lab
        Laa:
            r3 = r5
        Lab:
            r2 = 0
            goto L13
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.vm0.OooOOo(com.cmaster.cloner.l3):void");
    }

    public final void OooOOo0(u41 u41Var) {
        int i = 0;
        while (true) {
            if (i >= this.OooOO0) {
                break;
            }
            l3 l3Var = this.OooO0o[i];
            int i2 = 1;
            if (l3Var.OooO00o.OooOOOO != 1) {
                float f = 0.0f;
                if (l3Var.OooO0O0 < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.OooOO0) {
                            l3 l3Var2 = this.OooO0o[i6];
                            if (l3Var2.OooO00o.OooOOOO != i2 && !l3Var2.OooO0o0 && l3Var2.OooO0O0 < f) {
                                int iOooO0Oo = l3Var2.OooO0Oo.OooO0Oo();
                                int i8 = 0;
                                while (i8 < iOooO0Oo) {
                                    wh1 wh1VarOooO0o0 = l3Var2.OooO0Oo.OooO0o0(i8);
                                    float fOooO0OO = l3Var2.OooO0Oo.OooO0OO(wh1VarOooO0o0);
                                    if (fOooO0OO > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = wh1VarOooO0o0.OooOO0[i9] / fOooO0OO;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = wh1VarOooO0o0.OooO0o0;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            l3 l3Var3 = this.OooO0o[i4];
                            l3Var3.OooO00o.OooO0o = -1;
                            l3Var3.OooO0oO(((wh1[]) this.OooOO0o.OooO0oO)[i5]);
                            wh1 wh1Var = l3Var3.OooO00o;
                            wh1Var.OooO0o = i4;
                            wh1Var.OooO0o0(this, l3Var3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.OooO / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        OooOOo(u41Var);
        OooO();
    }

    public final void OooOOoo() {
        for (int i = 0; i < this.OooOO0; i++) {
            l3 l3Var = this.OooO0o[i];
            if (l3Var != null) {
                ((s31) this.OooOO0o.OooO0o0).OooO00o(l3Var);
            }
            this.OooO0o[i] = null;
        }
    }

    public final void OooOo00() {
        hx2 hx2Var;
        int i = 0;
        while (true) {
            hx2Var = this.OooOO0o;
            wh1[] wh1VarArr = (wh1[]) hx2Var.OooO0oO;
            if (i >= wh1VarArr.length) {
                break;
            }
            wh1 wh1Var = wh1VarArr[i];
            if (wh1Var != null) {
                wh1Var.OooO0OO();
            }
            i++;
        }
        s31 s31Var = (s31) hx2Var.OooO0o;
        wh1[] wh1VarArr2 = this.OooOOO0;
        int length = this.OooOOO;
        s31Var.getClass();
        if (length > wh1VarArr2.length) {
            length = wh1VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            wh1 wh1Var2 = wh1VarArr2[i2];
            int i3 = s31Var.OooO0o0;
            Object[] objArr = s31Var.OooO0Oo;
            if (i3 < objArr.length) {
                objArr[i3] = wh1Var2;
                s31Var.OooO0o0 = i3 + 1;
            }
        }
        this.OooOOO = 0;
        Arrays.fill((wh1[]) hx2Var.OooO0oO, (Object) null);
        this.OooO0O0 = 0;
        u41 u41Var = this.OooO0OO;
        u41Var.OooO0oo = 0;
        u41Var.OooO0O0 = 0.0f;
        this.OooO = 1;
        for (int i4 = 0; i4 < this.OooOO0; i4++) {
            l3 l3Var = this.OooO0o[i4];
        }
        OooOOoo();
        this.OooOO0 = 0;
        this.OooOOOO = new l3(hx2Var);
    }
}
