package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mk1 implements lo1, s61 {
    public final hk1 OooO00o;

    public mk1(hk1 hk1Var) {
        this.OooO00o = hk1Var;
    }

    @Override // com.cmaster.cloner.h31
    public final Object OooO00o(String str, a40 a40Var, ij ijVar) throws Exception {
        rk1 rk1VarOooOOo0 = this.OooO00o.OooOOo0(str);
        try {
            Object objOooO0o = a40Var.OooO0o(rk1VarOooOOo0);
            in2.OooO00o(rk1VarOooOOo0, null);
            return objOooO0o;
        } finally {
        }
    }

    @Override // com.cmaster.cloner.lo1
    public final Object OooO0O0(sk1 sk1Var) {
        return Boolean.valueOf(this.OooO00o.OooO0Oo.OooOOo());
    }

    @Override // com.cmaster.cloner.s61
    public final mc1 OooO0OO() {
        return this.OooO00o;
    }

    @Override // com.cmaster.cloner.lo1
    public final Object OooO0Oo(ko1 ko1Var, e40 e40Var, sk1 sk1Var) {
        return OooO0o0(ko1Var, e40Var, sk1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooO0o0(com.cmaster.cloner.ko1 r9, com.cmaster.cloner.e40 r10, com.cmaster.cloner.ij r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.cmaster.cloner.lk1
            if (r0 == 0) goto L13
            r0 = r11
            com.cmaster.cloner.lk1 r0 = (com.cmaster.cloner.lk1) r0
            int r1 = r0.OooOO0O
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.OooOO0O = r1
            goto L18
        L13:
            com.cmaster.cloner.lk1 r0 = new com.cmaster.cloner.lk1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.OooO
            int r1 = r0.OooOO0O
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            com.cmaster.cloner.c30 r8 = r0.OooO0oo
            com.cmaster.cloner.mk1 r9 = r0.OooO0oO
            com.cmaster.cloner.ty2.OooO0O0(r11)     // Catch: java.lang.Throwable -> L2b
            goto Lb3
        L2b:
            r10 = move-exception
            goto Lc6
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.cmaster.cloner.qa.OooO0o(r8)
            return r2
        L34:
            com.cmaster.cloner.ty2.OooO0O0(r11)
            com.cmaster.cloner.hk1 r11 = r8.OooO00o
            com.cmaster.cloner.c30 r11 = r11.OooO0Oo
            r11.OooOOo()
            int r9 = r9.ordinal()
            if (r9 == 0) goto L57
            if (r9 == r3) goto L53
            r1 = 2
            if (r9 != r1) goto L4d
            r11.OooO0OO()
            goto L9b
        L4d:
            com.cmaster.cloner.tf r8 = new com.cmaster.cloner.tf
            r8.<init>()
            throw r8
        L53:
            r11.OooO0o()
            goto L9b
        L57:
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.database.sqlite.SQLiteDatabase r1 = r11.OooO0Oo
            com.cmaster.cloner.hl0 r4 = com.cmaster.cloner.c30.OooO0oO
            java.lang.Object r5 = r4.getValue()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L98
            com.cmaster.cloner.hl0 r5 = com.cmaster.cloner.c30.OooO0o
            java.lang.Object r6 = r5.getValue()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L98
            java.lang.Object r4 = r4.getValue()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.getClass()
            java.lang.Object r5 = r5.getValue()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.getClass()
            java.lang.Object r1 = r5.invoke(r1, r2)
            if (r1 == 0) goto L92
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r2, r9, r2}
            r4.invoke(r1, r9)
            goto L9b
        L92:
            java.lang.String r9 = "Required value was null."
            com.cmaster.cloner.qa.OooO0o(r9)
            goto L9b
        L98:
            r11.OooO0OO()
        L9b:
            com.cmaster.cloner.j31 r9 = new com.cmaster.cloner.j31     // Catch: java.lang.Throwable -> Lc3
            r9.<init>(r8, r3)     // Catch: java.lang.Throwable -> Lc3
            r0.OooO0oO = r8     // Catch: java.lang.Throwable -> Lc3
            r0.OooO0oo = r11     // Catch: java.lang.Throwable -> Lc3
            r0.OooOO0O = r3     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r9 = r10.OooO0oO(r9, r0)     // Catch: java.lang.Throwable -> Lc3
            com.cmaster.cloner.gk r10 = com.cmaster.cloner.gk.OooO0Oo
            if (r9 != r10) goto Laf
            return r10
        Laf:
            r7 = r9
            r9 = r8
            r8 = r11
            r11 = r7
        Lb3:
            r8.OooOo00()     // Catch: java.lang.Throwable -> L2b
            r8.OooO()
            boolean r8 = r8.OooOOo()
            if (r8 != 0) goto Lc2
            r9.getClass()
        Lc2:
            return r11
        Lc3:
            r10 = move-exception
            r9 = r8
            r8 = r11
        Lc6:
            r8.OooO()
            boolean r8 = r8.OooOOo()
            if (r8 != 0) goto Ld2
            r9.getClass()
        Ld2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.mk1.OooO0o0(com.cmaster.cloner.ko1, com.cmaster.cloner.e40, com.cmaster.cloner.ij):java.lang.Object");
    }
}
