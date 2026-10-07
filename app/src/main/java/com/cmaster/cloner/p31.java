package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p31 implements lo1, s61 {
    public final ih OooO00o;
    public final boolean OooO0O0;
    public final e3 OooO0OO = new e3();
    public final AtomicBoolean OooO0Oo = new AtomicBoolean(false);

    public p31(ih ihVar, boolean z) {
        this.OooO00o = ihVar;
        this.OooO0O0 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.cmaster.cloner.h31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooO00o(java.lang.String r6, com.cmaster.cloner.a40 r7, com.cmaster.cloner.ij r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.cmaster.cloner.o31
            if (r0 == 0) goto L13
            r0 = r8
            com.cmaster.cloner.o31 r0 = (com.cmaster.cloner.o31) r0
            int r1 = r0.OooOOO0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.OooOOO0 = r1
            goto L18
        L13:
            com.cmaster.cloner.o31 r0 = new com.cmaster.cloner.o31
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.OooOO0O
            int r1 = r0.OooOOO0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L30
            com.cmaster.cloner.ih r5 = r0.OooOO0
            com.cmaster.cloner.a40 r7 = r0.OooO
            java.lang.String r6 = r0.OooO0oo
            com.cmaster.cloner.p31 r0 = r0.OooO0oO
            com.cmaster.cloner.ty2.OooO0O0(r8)
            r8 = r5
            r5 = r0
            goto L6d
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.cmaster.cloner.qa.OooO0o(r5)
            return r3
        L36:
            com.cmaster.cloner.ty2.OooO0O0(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r5.OooO0Oo
            boolean r8 = r8.get()
            r1 = 21
            if (r8 != 0) goto L96
            com.cmaster.cloner.vj r8 = r0.OooO0o0
            r8.getClass()
            com.cmaster.cloner.d83 r4 = com.cmaster.cloner.yg.OooO0o0
            com.cmaster.cloner.tj r8 = r8.OooO0oo(r4)
            com.cmaster.cloner.yg r8 = (com.cmaster.cloner.yg) r8
            if (r8 == 0) goto L90
            com.cmaster.cloner.p31 r8 = r8.OooO0Oo
            if (r8 != r5) goto L90
            r0.OooO0oO = r5
            r0.OooO0oo = r6
            r0.OooO = r7
            com.cmaster.cloner.ih r8 = r5.OooO00o
            r0.OooOO0 = r8
            r0.OooOOO0 = r2
            com.cmaster.cloner.kv0 r1 = r8.OooO0o0
            java.lang.Object r0 = r1.OooO0OO(r0)
            com.cmaster.cloner.gk r1 = com.cmaster.cloner.gk.OooO0Oo
            if (r0 != r1) goto L6d
            return r1
        L6d:
            com.cmaster.cloner.i31 r0 = new com.cmaster.cloner.i31     // Catch: java.lang.Throwable -> L83
            com.cmaster.cloner.ih r1 = r5.OooO00o     // Catch: java.lang.Throwable -> L83
            com.cmaster.cloner.rc1 r6 = r1.OooOOo0(r6)     // Catch: java.lang.Throwable -> L83
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r5 = r7.OooO0o(r0)     // Catch: java.lang.Throwable -> L85
            com.cmaster.cloner.in2.OooO00o(r0, r3)     // Catch: java.lang.Throwable -> L83
            r8.unlock()
            return r5
        L83:
            r5 = move-exception
            goto L8c
        L85:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L87
        L87:
            r6 = move-exception
            com.cmaster.cloner.in2.OooO00o(r0, r5)     // Catch: java.lang.Throwable -> L83
            throw r6     // Catch: java.lang.Throwable -> L83
        L8c:
            r8.unlock()
            throw r5
        L90:
            java.lang.String r5 = "Attempted to use connection on a different coroutine"
            com.cmaster.cloner.zy2.OooO0O0(r1, r5)
            throw r3
        L96:
            java.lang.String r5 = "Connection is recycled"
            com.cmaster.cloner.zy2.OooO0O0(r1, r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.p31.OooO00o(java.lang.String, com.cmaster.cloner.a40, com.cmaster.cloner.ij):java.lang.Object");
    }

    @Override // com.cmaster.cloner.lo1
    public final Object OooO0O0(sk1 sk1Var) {
        if (this.OooO0Oo.get()) {
            zy2.OooO0O0(21, "Connection is recycled");
            throw null;
        }
        vj vjVar = sk1Var.OooO0o0;
        vjVar.getClass();
        yg ygVar = (yg) vjVar.OooO0oo(yg.OooO0o0);
        if (ygVar != null && ygVar.OooO0Oo == this) {
            return Boolean.valueOf(!this.OooO0OO.isEmpty());
        }
        zy2.OooO0O0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // com.cmaster.cloner.s61
    public final mc1 OooO0OO() {
        return this.OooO00o;
    }

    @Override // com.cmaster.cloner.lo1
    public final Object OooO0Oo(ko1 ko1Var, e40 e40Var, sk1 sk1Var) {
        if (this.OooO0Oo.get()) {
            zy2.OooO0O0(21, "Connection is recycled");
            throw null;
        }
        vj vjVar = sk1Var.OooO0o0;
        vjVar.getClass();
        yg ygVar = (yg) vjVar.OooO0oo(yg.OooO0o0);
        if (ygVar != null && ygVar.OooO0Oo == this) {
            return OooO0oO(ko1Var, e40Var, sk1Var);
        }
        zy2.OooO0O0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooO0o(boolean r7, com.cmaster.cloner.ij r8) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r1 = "RELEASE SAVEPOINT '"
            boolean r2 = r8 instanceof com.cmaster.cloner.m31
            if (r2 == 0) goto L17
            r2 = r8
            com.cmaster.cloner.m31 r2 = (com.cmaster.cloner.m31) r2
            int r3 = r2.OooOO0o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.OooOO0o = r3
            goto L1c
        L17:
            com.cmaster.cloner.m31 r2 = new com.cmaster.cloner.m31
            r2.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r2.OooOO0
            int r3 = r2.OooOO0o
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L31
            boolean r7 = r2.OooO
            com.cmaster.cloner.ih r6 = r2.OooO0oo
            com.cmaster.cloner.p31 r2 = r2.OooO0oO
            com.cmaster.cloner.ty2.OooO0O0(r8)
            r8 = r6
            r6 = r2
            goto L50
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.cmaster.cloner.qa.OooO0o(r6)
            r6 = 0
            return r6
        L38:
            com.cmaster.cloner.ty2.OooO0O0(r8)
            r2.OooO0oO = r6
            com.cmaster.cloner.ih r8 = r6.OooO00o
            r2.OooO0oo = r8
            r2.OooO = r7
            r2.OooOO0o = r4
            com.cmaster.cloner.kv0 r3 = r8.OooO0o0
            java.lang.Object r2 = r3.OooO0OO(r2)
            com.cmaster.cloner.gk r3 = com.cmaster.cloner.gk.OooO0Oo
            if (r2 != r3) goto L50
            return r3
        L50:
            com.cmaster.cloner.e3 r2 = r6.OooO0OO     // Catch: java.lang.Throwable -> L81
            com.cmaster.cloner.ih r6 = r6.OooO00o     // Catch: java.lang.Throwable -> L81
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L81
            if (r3 != 0) goto Lc6
            r2.getClass()     // Catch: java.lang.Throwable -> L81
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L81
            if (r3 != 0) goto Lbe
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L81
            int r3 = r3 - r4
            java.lang.Object r3 = r2.remove(r3)     // Catch: java.lang.Throwable -> L81
            com.cmaster.cloner.k31 r3 = (com.cmaster.cloner.k31) r3     // Catch: java.lang.Throwable -> L81
            r4 = 39
            if (r7 == 0) goto L98
            r3.getClass()     // Catch: java.lang.Throwable -> L81
            boolean r7 = r2.isEmpty()     // Catch: java.lang.Throwable -> L81
            if (r7 == 0) goto L83
            java.lang.String r7 = "END TRANSACTION"
            com.cmaster.cloner.zy2.OooO00o(r6, r7)     // Catch: java.lang.Throwable -> L81
            goto Lb8
        L81:
            r6 = move-exception
            goto Lce
        L83:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L81
            int r0 = r3.OooO00o     // Catch: java.lang.Throwable -> L81
            r7.append(r0)     // Catch: java.lang.Throwable -> L81
            r7.append(r4)     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L81
            com.cmaster.cloner.zy2.OooO00o(r6, r7)     // Catch: java.lang.Throwable -> L81
            goto Lb8
        L98:
            boolean r7 = r2.isEmpty()     // Catch: java.lang.Throwable -> L81
            if (r7 == 0) goto La4
            java.lang.String r7 = "ROLLBACK TRANSACTION"
            com.cmaster.cloner.zy2.OooO00o(r6, r7)     // Catch: java.lang.Throwable -> L81
            goto Lb8
        La4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L81
            int r0 = r3.OooO00o     // Catch: java.lang.Throwable -> L81
            r7.append(r0)     // Catch: java.lang.Throwable -> L81
            r7.append(r4)     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L81
            com.cmaster.cloner.zy2.OooO00o(r6, r7)     // Catch: java.lang.Throwable -> L81
        Lb8:
            com.cmaster.cloner.vq1 r6 = com.cmaster.cloner.vq1.OooO00o     // Catch: java.lang.Throwable -> L81
            r8.unlock()
            return r6
        Lbe:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = "List is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L81
            throw r6     // Catch: java.lang.Throwable -> L81
        Lc6:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = "Not in a transaction"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L81
            throw r6     // Catch: java.lang.Throwable -> L81
        Lce:
            r8.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.p31.OooO0o(boolean, com.cmaster.cloner.ij):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooO0o0(com.cmaster.cloner.ko1 r6, com.cmaster.cloner.ij r7) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r7 instanceof com.cmaster.cloner.l31
            if (r1 == 0) goto L15
            r1 = r7
            com.cmaster.cloner.l31 r1 = (com.cmaster.cloner.l31) r1
            int r2 = r1.OooOO0o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.OooOO0o = r2
            goto L1a
        L15:
            com.cmaster.cloner.l31 r1 = new com.cmaster.cloner.l31
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.OooOO0
            int r2 = r1.OooOO0o
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            com.cmaster.cloner.ih r5 = r1.OooO
            com.cmaster.cloner.ko1 r6 = r1.OooO0oo
            com.cmaster.cloner.p31 r1 = r1.OooO0oO
            com.cmaster.cloner.ty2.OooO0O0(r7)
            r7 = r5
            r5 = r1
            goto L4e
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.cmaster.cloner.qa.OooO0o(r5)
            r5 = 0
            return r5
        L36:
            com.cmaster.cloner.ty2.OooO0O0(r7)
            r1.OooO0oO = r5
            r1.OooO0oo = r6
            com.cmaster.cloner.ih r7 = r5.OooO00o
            r1.OooO = r7
            r1.OooOO0o = r3
            com.cmaster.cloner.kv0 r2 = r7.OooO0o0
            java.lang.Object r1 = r2.OooO0OO(r1)
            com.cmaster.cloner.gk r2 = com.cmaster.cloner.gk.OooO0Oo
            if (r1 != r2) goto L4e
            return r2
        L4e:
            com.cmaster.cloner.e3 r1 = r5.OooO0OO     // Catch: java.lang.Throwable -> L6b
            com.cmaster.cloner.ih r5 = r5.OooO00o     // Catch: java.lang.Throwable -> L6b
            int r2 = r1.OooO0o     // Catch: java.lang.Throwable -> L6b
            boolean r4 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L7f
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L6b
            if (r6 == 0) goto L79
            if (r6 == r3) goto L73
            r0 = 2
            if (r6 != r0) goto L6d
            java.lang.String r6 = "BEGIN EXCLUSIVE TRANSACTION"
            com.cmaster.cloner.zy2.OooO00o(r5, r6)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L6b:
            r5 = move-exception
            goto La1
        L6d:
            com.cmaster.cloner.tf r5 = new com.cmaster.cloner.tf     // Catch: java.lang.Throwable -> L6b
            r5.<init>()     // Catch: java.lang.Throwable -> L6b
            throw r5     // Catch: java.lang.Throwable -> L6b
        L73:
            java.lang.String r6 = "BEGIN IMMEDIATE TRANSACTION"
            com.cmaster.cloner.zy2.OooO00o(r5, r6)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L79:
            java.lang.String r6 = "BEGIN DEFERRED TRANSACTION"
            com.cmaster.cloner.zy2.OooO00o(r5, r6)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L7f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            r6.append(r2)     // Catch: java.lang.Throwable -> L6b
            r0 = 39
            r6.append(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L6b
            com.cmaster.cloner.zy2.OooO00o(r5, r6)     // Catch: java.lang.Throwable -> L6b
        L93:
            com.cmaster.cloner.k31 r5 = new com.cmaster.cloner.k31     // Catch: java.lang.Throwable -> L6b
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L6b
            r1.addLast(r5)     // Catch: java.lang.Throwable -> L6b
            com.cmaster.cloner.vq1 r5 = com.cmaster.cloner.vq1.OooO00o     // Catch: java.lang.Throwable -> L6b
            r7.unlock()
            return r5
        La1:
            r7.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.p31.OooO0o0(com.cmaster.cloner.ko1, com.cmaster.cloner.ij):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooO0oO(com.cmaster.cloner.ko1 r11, com.cmaster.cloner.e40 r12, com.cmaster.cloner.ij r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.p31.OooO0oO(com.cmaster.cloner.ko1, com.cmaster.cloner.e40, com.cmaster.cloner.ij):java.lang.Object");
    }
}
