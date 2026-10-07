package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dc1 {
    public final hx2 OooO00o;
    public final a02 OooO0O0;
    public final e81 OooO0OO;
    public final ho1 OooO0Oo;
    public int[] OooO0o = null;
    public final int OooO0o0;
    public final int OooO0oO;
    public final boolean OooO0oo;

    public dc1(hx2 hx2Var, int i, im2 im2Var) {
        this.OooO00o = hx2Var;
        this.OooO0O0 = new a02(hx2Var);
        this.OooO0oO = i;
        boolean[] zArr = {true};
        j7 j7Var = (j7) hx2Var.OooO0o0;
        Object[] objArr = j7Var.OooO0o0;
        if (j7Var.OooO0oO == -1) {
            ep0 ep0Var = new ep0();
            ep0Var.OooO0Oo = 0;
            int length = objArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                dh0 dh0Var = ((i7) j7Var.OooO0o0(i2)).OooO0O0;
                int length2 = dh0Var.OooO0o0.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    ((ch0) dh0Var.OooO0o0(i3)).OooO0OO(ep0Var);
                }
            }
            j7Var.OooO0oO = ep0Var.OooO0Oo;
        }
        aa aaVar = new aa(j7Var.OooO0oO, i, zArr);
        int length3 = objArr.length;
        for (int i4 = 0; i4 < length3; i4++) {
            dh0 dh0Var2 = ((i7) j7Var.OooO0o0(i4)).OooO0O0;
            int length4 = dh0Var2.OooO0o0.length;
            for (int i5 = 0; i5 < length4; i5++) {
                ((ch0) dh0Var2.OooO0o0(i5)).OooO0OO(aaVar);
            }
        }
        this.OooO0oo = zArr[0];
        int length5 = objArr.length * 3;
        int length6 = 0;
        for (Object obj : objArr) {
            i7 i7Var = (i7) obj;
            if (i7Var != null) {
                length6 += i7Var.OooO0O0.OooO0o0.length;
            }
        }
        int i6 = length5 + length6;
        if (j7Var.OooO0oO == -1) {
            ep0 ep0Var2 = new ep0();
            ep0Var2.OooO0Oo = 0;
            int length7 = objArr.length;
            for (int i7 = 0; i7 < length7; i7++) {
                dh0 dh0Var3 = ((i7) j7Var.OooO0o0(i7)).OooO0O0;
                int length8 = dh0Var3.OooO0o0.length;
                for (int i8 = 0; i8 < length8; i8++) {
                    ((ch0) dh0Var3.OooO0o0(i8)).OooO0OO(ep0Var2);
                }
            }
            j7Var.OooO0oO = ep0Var2.OooO0Oo;
        }
        int i9 = j7Var.OooO0oO + (this.OooO0oo ? 0 : this.OooO0oO);
        this.OooO0o0 = i9;
        e81 e81Var = new e81(im2Var, i6, length5, i9, i);
        this.OooO0OO = e81Var;
        this.OooO0Oo = new ho1(this, e81Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.cmaster.cloner.v81 OooO00o(com.cmaster.cloner.ch0 r5, com.cmaster.cloner.u81 r6) {
        /*
            com.cmaster.cloner.v81 r0 = r5.OooO0oO
            com.cmaster.cloner.bc1 r5 = r5.OooO0Oo
            int r5 = r5.OooO00o
            r1 = 14
            r2 = 0
            if (r5 == r1) goto L13
            r1 = 16
            if (r5 == r1) goto L13
            switch(r5) {
                case 20: goto L13;
                case 21: goto L13;
                case 22: goto L13;
                default: goto L12;
            }
        L12:
            goto L36
        L13:
            java.lang.Object[] r5 = r0.OooO0o0
            int r5 = r5.length
            r1 = 2
            if (r5 != r1) goto L36
            int r5 = r6.OooO0Oo
            r1 = 1
            java.lang.Object r3 = r0.OooO0o0(r1)
            com.cmaster.cloner.u81 r3 = (com.cmaster.cloner.u81) r3
            int r3 = r3.OooO0Oo
            if (r5 != r3) goto L36
            java.lang.Object r5 = r0.OooO0o0(r1)
            com.cmaster.cloner.u81 r5 = (com.cmaster.cloner.u81) r5
            java.lang.Object r0 = r0.OooO0o0(r2)
            com.cmaster.cloner.u81 r0 = (com.cmaster.cloner.u81) r0
            com.cmaster.cloner.v81 r0 = com.cmaster.cloner.v81.OooOO0(r5, r0)
        L36:
            if (r6 != 0) goto L39
            return r0
        L39:
            java.lang.Object[] r5 = r0.OooO0o0
            int r5 = r5.length
            com.cmaster.cloner.v81 r1 = new com.cmaster.cloner.v81
            int r3 = r5 + 1
            r1.<init>(r3)
            r3 = r2
        L44:
            if (r3 >= r5) goto L51
            int r4 = r3 + 1
            java.lang.Object r3 = r0.OooO0o0(r3)
            r1.OooO0o(r4, r3)
            r3 = r4
            goto L44
        L51:
            r1.OooO0o(r2, r6)
            boolean r5 = r0.OooO0Oo
            if (r5 != 0) goto L5a
            r1.OooO0Oo = r2
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.dc1.OooO00o(com.cmaster.cloner.ch0, com.cmaster.cloner.u81):com.cmaster.cloner.v81");
    }
}
