package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class uu0 {
    public static final uk1 OooO00o = new uk1("UNDEFINED", 0);
    public static final uk1 OooO0O0 = new uk1("REUSABLE_CLAIMED", 0);

    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[Catch: all -> 0x0078, DONT_GENERATE, TryCatch #2 {all -> 0x0078, blocks: (B:19:0x0055, B:21:0x0062, B:23:0x0068, B:36:0x009b, B:26:0x007a, B:28:0x0087, B:33:0x0092, B:35:0x0098, B:41:0x00a8, B:44:0x00b1, B:43:0x00ae, B:31:0x008d), top: B:57:0x0055, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OooO00o(com.cmaster.cloner.gj r10, java.lang.Object r11) {
        /*
            boolean r0 = r10 instanceof com.cmaster.cloner.cs
            if (r0 == 0) goto Lbc
            com.cmaster.cloner.cs r10 = (com.cmaster.cloner.cs) r10
            com.cmaster.cloner.zj r0 = r10.OooO0oO
            com.cmaster.cloner.ij r1 = r10.OooO0oo
            java.lang.Throwable r2 = com.cmaster.cloner.cb1.OooO00o(r11)
            if (r2 != 0) goto L12
            r3 = r11
            goto L18
        L12:
            com.cmaster.cloner.rf r3 = new com.cmaster.cloner.rf
            r4 = 0
            r3.<init>(r4, r2)
        L18:
            r1.getContext()
            com.cmaster.cloner.vj r2 = r1.OooO0o0
            boolean r4 = r0.OooOOo()
            r5 = 1
            if (r4 == 0) goto L2f
            r10.OooO = r3
            r10.OooO0o = r5
            r2.getClass()
            r0.OooOOOO(r2, r10)
            return
        L2f:
            com.cmaster.cloner.xw r0 = com.cmaster.cloner.vm1.OooO00o()
            long r6 = r0.OooO0o
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L51
            r10.OooO = r3
            r10.OooO0o = r5
            com.cmaster.cloner.e3 r11 = r0.OooO0oo
            if (r11 != 0) goto L4d
            com.cmaster.cloner.e3 r11 = new com.cmaster.cloner.e3
            r11.<init>()
            r0.OooO0oo = r11
        L4d:
            r11.addLast(r10)
            goto Lb6
        L51:
            r0.OooOo00(r5)
            r4 = 0
            r2.getClass()     // Catch: java.lang.Throwable -> L78
            com.cmaster.cloner.gu0 r6 = com.cmaster.cloner.gu0.OooO0o0     // Catch: java.lang.Throwable -> L78
            com.cmaster.cloner.tj r6 = r2.OooO0oo(r6)     // Catch: java.lang.Throwable -> L78
            com.cmaster.cloner.nk0 r6 = (com.cmaster.cloner.nk0) r6     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L7a
            boolean r7 = r6.Oooo00O()     // Catch: java.lang.Throwable -> L78
            if (r7 != 0) goto L7a
            java.util.concurrent.CancellationException r11 = r6.OooOo0O()     // Catch: java.lang.Throwable -> L78
            r10.OooO0O0(r3, r11)     // Catch: java.lang.Throwable -> L78
            com.cmaster.cloner.bb1 r1 = new com.cmaster.cloner.bb1     // Catch: java.lang.Throwable -> L78
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L78
            r10.OooO0Oo(r1)     // Catch: java.lang.Throwable -> L78
            goto L9b
        L78:
            r11 = move-exception
            goto Lb2
        L7a:
            java.lang.Object r3 = r10.OooOO0     // Catch: java.lang.Throwable -> L78
            r2.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r3 = com.cmaster.cloner.w82.OooO0O0(r2, r3)     // Catch: java.lang.Throwable -> L78
            com.cmaster.cloner.uk1 r6 = com.cmaster.cloner.w82.OooO00o     // Catch: java.lang.Throwable -> L78
            if (r3 == r6) goto L8c
            com.cmaster.cloner.qq1 r6 = com.cmaster.cloner.mp2.OooO0O0(r1, r2, r3)     // Catch: java.lang.Throwable -> L78
            goto L8d
        L8c:
            r6 = r4
        L8d:
            r1.OooO0Oo(r11)     // Catch: java.lang.Throwable -> La5
            if (r6 == 0) goto L98
            boolean r11 = r6.OoooO()     // Catch: java.lang.Throwable -> L78
            if (r11 == 0) goto L9b
        L98:
            com.cmaster.cloner.w82.OooO00o(r2, r3)     // Catch: java.lang.Throwable -> L78
        L9b:
            boolean r11 = r0.OooOo0O()     // Catch: java.lang.Throwable -> L78
            if (r11 != 0) goto L9b
        La1:
            r0.OooOOoo(r5)
            goto Lb6
        La5:
            r11 = move-exception
            if (r6 == 0) goto Lae
            boolean r1 = r6.OoooO()     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto Lb1
        Lae:
            com.cmaster.cloner.w82.OooO00o(r2, r3)     // Catch: java.lang.Throwable -> L78
        Lb1:
            throw r11     // Catch: java.lang.Throwable -> L78
        Lb2:
            r10.OooO(r11, r4)     // Catch: java.lang.Throwable -> Lb7
            goto La1
        Lb6:
            return
        Lb7:
            r10 = move-exception
            r0.OooOOoo(r5)
            throw r10
        Lbc:
            r10.OooO0Oo(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.uu0.OooO00o(com.cmaster.cloner.gj, java.lang.Object):void");
    }
}
