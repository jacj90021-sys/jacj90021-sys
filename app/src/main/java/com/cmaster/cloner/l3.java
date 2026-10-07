package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class l3 {
    public final g3 OooO0Oo;
    public wh1 OooO00o = null;
    public float OooO0O0 = 0.0f;
    public final ArrayList OooO0OO = new ArrayList();
    public boolean OooO0o0 = false;

    public l3(hx2 hx2Var) {
        this.OooO0Oo = new g3(this, hx2Var);
    }

    public void OooO(vm0 vm0Var, l3 l3Var, boolean z) {
        g3 g3Var = this.OooO0Oo;
        g3Var.getClass();
        float fOooO0OO = g3Var.OooO0OO(l3Var.OooO00o);
        g3Var.OooO0oo(l3Var.OooO00o, z);
        g3 g3Var2 = l3Var.OooO0Oo;
        int iOooO0Oo = g3Var2.OooO0Oo();
        for (int i = 0; i < iOooO0Oo; i++) {
            wh1 wh1VarOooO0o0 = g3Var2.OooO0o0(i);
            g3Var.OooO00o(wh1VarOooO0o0, g3Var2.OooO0OO(wh1VarOooO0o0) * fOooO0OO, z);
        }
        this.OooO0O0 = (l3Var.OooO0O0 * fOooO0OO) + this.OooO0O0;
        if (z) {
            l3Var.OooO00o.OooO0O0(this);
        }
        if (this.OooO00o == null || g3Var.OooO0Oo() != 0) {
            return;
        }
        this.OooO0o0 = true;
        vm0Var.OooO00o = true;
    }

    public final void OooO00o(vm0 vm0Var, int i) {
        wh1 wh1VarOooOO0 = vm0Var.OooOO0(i);
        g3 g3Var = this.OooO0Oo;
        g3Var.OooO0oO(wh1VarOooOO0, 1.0f);
        g3Var.OooO0oO(vm0Var.OooOO0(i), -1.0f);
    }

    public final void OooO0O0(wh1 wh1Var, wh1 wh1Var2, wh1 wh1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.OooO0O0 = i;
        }
        g3 g3Var = this.OooO0Oo;
        if (z) {
            g3Var.OooO0oO(wh1Var, 1.0f);
            g3Var.OooO0oO(wh1Var2, -1.0f);
            g3Var.OooO0oO(wh1Var3, -1.0f);
        } else {
            g3Var.OooO0oO(wh1Var, -1.0f);
            g3Var.OooO0oO(wh1Var2, 1.0f);
            g3Var.OooO0oO(wh1Var3, 1.0f);
        }
    }

    public final void OooO0OO(wh1 wh1Var, wh1 wh1Var2, wh1 wh1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.OooO0O0 = i;
        }
        g3 g3Var = this.OooO0Oo;
        if (z) {
            g3Var.OooO0oO(wh1Var, 1.0f);
            g3Var.OooO0oO(wh1Var2, -1.0f);
            g3Var.OooO0oO(wh1Var3, 1.0f);
        } else {
            g3Var.OooO0oO(wh1Var, -1.0f);
            g3Var.OooO0oO(wh1Var2, 1.0f);
            g3Var.OooO0oO(wh1Var3, -1.0f);
        }
    }

    public wh1 OooO0Oo(boolean[] zArr) {
        return OooO0o(zArr, null);
    }

    public final wh1 OooO0o(boolean[] zArr, wh1 wh1Var) {
        int i;
        g3 g3Var = this.OooO0Oo;
        int iOooO0Oo = g3Var.OooO0Oo();
        wh1 wh1Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iOooO0Oo; i2++) {
            float fOooO0o = g3Var.OooO0o(i2);
            if (fOooO0o < 0.0f) {
                wh1 wh1VarOooO0o0 = g3Var.OooO0o0(i2);
                if ((zArr == null || !zArr[wh1VarOooO0o0.OooO0o0]) && wh1VarOooO0o0 != wh1Var && (((i = wh1VarOooO0o0.OooOOOO) == 3 || i == 4) && fOooO0o < f)) {
                    f = fOooO0o;
                    wh1Var2 = wh1VarOooO0o0;
                }
            }
        }
        return wh1Var2;
    }

    public boolean OooO0o0() {
        return this.OooO00o == null && this.OooO0O0 == 0.0f && this.OooO0Oo.OooO0Oo() == 0;
    }

    public final void OooO0oO(wh1 wh1Var) {
        wh1 wh1Var2 = this.OooO00o;
        g3 g3Var = this.OooO0Oo;
        if (wh1Var2 != null) {
            g3Var.OooO0oO(wh1Var2, -1.0f);
            this.OooO00o.OooO0o = -1;
            this.OooO00o = null;
        }
        float fOooO0oo = g3Var.OooO0oo(wh1Var, true) * (-1.0f);
        this.OooO00o = wh1Var;
        if (fOooO0oo == 1.0f) {
            return;
        }
        this.OooO0O0 /= fOooO0oo;
        int i = g3Var.OooO0oo;
        for (int i2 = 0; i != -1 && i2 < g3Var.OooO00o; i2++) {
            float[] fArr = g3Var.OooO0oO;
            fArr[i] = fArr[i] / fOooO0oo;
            i = g3Var.OooO0o[i];
        }
    }

    public final void OooO0oo(vm0 vm0Var, wh1 wh1Var, boolean z) {
        if (wh1Var.OooO) {
            g3 g3Var = this.OooO0Oo;
            float fOooO0OO = g3Var.OooO0OO(wh1Var);
            this.OooO0O0 = (wh1Var.OooO0oo * fOooO0OO) + this.OooO0O0;
            g3Var.OooO0oo(wh1Var, z);
            if (z) {
                wh1Var.OooO0O0(this);
            }
            if (g3Var.OooO0Oo() == 0) {
                this.OooO0o0 = true;
                vm0Var.OooO00o = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            com.cmaster.cloner.wh1 r0 = r10.OooO00o
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            com.cmaster.cloner.wh1 r1 = r10.OooO00o
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r10.OooO0O0
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = com.cmaster.cloner.rj.OooOO0(r0)
            float r1 = r10.OooO0O0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            com.cmaster.cloner.g3 r10 = r10.OooO0Oo
            int r5 = r10.OooO0Oo()
        L3c:
            if (r3 >= r5) goto L98
            com.cmaster.cloner.wh1 r6 = r10.OooO0o0(r3)
            if (r6 != 0) goto L45
            goto L95
        L45:
            float r7 = r10.OooO0o(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L4e
            goto L95
        L4e:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L62
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L72
            java.lang.String r1 = "- "
            java.lang.String r0 = r0.concat(r1)
        L60:
            float r7 = r7 * r9
            goto L72
        L62:
            if (r8 <= 0) goto L6b
            java.lang.String r1 = " + "
            java.lang.String r0 = r0.concat(r1)
            goto L72
        L6b:
            java.lang.String r1 = " - "
            java.lang.String r0 = r0.concat(r1)
            goto L60
        L72:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L7d
            java.lang.String r0 = r0.concat(r6)
            goto L94
        L7d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L94:
            r1 = r4
        L95:
            int r3 = r3 + 1
            goto L3c
        L98:
            if (r1 != 0) goto La1
            java.lang.String r10 = "0.0"
            java.lang.String r10 = r0.concat(r10)
            return r10
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.l3.toString():java.lang.String");
    }
}
