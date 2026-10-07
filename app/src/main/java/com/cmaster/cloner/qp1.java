package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qp1 extends sk1 implements e40 {
    public rp1 OooO;
    public hy0[] OooO0oo;
    public lo1 OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public final /* synthetic */ hy0[] OooOOOO;
    public final /* synthetic */ rp1 OooOOOo;
    public final /* synthetic */ lo1 OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp1(hy0[] hy0VarArr, rp1 rp1Var, lo1 lo1Var, gj gjVar) {
        super(gjVar);
        this.OooOOOO = hy0VarArr;
        this.OooOOOo = rp1Var;
        this.OooOOo0 = lo1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (com.cmaster.cloner.rp1.OooO0OO(r6, r5, r11, r10) == r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0074 -> B:27:0x0075). Please report as a decompilation issue!!! */
    @Override // com.cmaster.cloner.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooO(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = r10.OooOOO
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L21
            if (r0 == r2) goto La
            if (r0 != r1) goto L1a
        La:
            int r0 = r10.OooOOO0
            int r3 = r10.OooOO0o
            int r4 = r10.OooOO0O
            com.cmaster.cloner.lo1 r5 = r10.OooOO0
            com.cmaster.cloner.rp1 r6 = r10.OooO
            com.cmaster.cloner.hy0[] r7 = r10.OooO0oo
            com.cmaster.cloner.ty2.OooO0O0(r11)
            goto L57
        L1a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.cmaster.cloner.qa.OooO0o(r10)
            r10 = 0
            return r10
        L21:
            com.cmaster.cloner.ty2.OooO0O0(r11)
            com.cmaster.cloner.hy0[] r11 = r10.OooOOOO
            int r0 = r11.length
            r3 = 0
            com.cmaster.cloner.rp1 r4 = r10.OooOOOo
            com.cmaster.cloner.lo1 r5 = r10.OooOOo0
            r7 = r11
            r11 = r3
            r6 = r4
        L2f:
            if (r3 >= r0) goto L77
            r4 = r7[r3]
            int r8 = r11 + 1
            int r4 = r4.ordinal()
            if (r4 == 0) goto L74
            com.cmaster.cloner.gk r9 = com.cmaster.cloner.gk.OooO0Oo
            if (r4 == r2) goto L5f
            if (r4 != r1) goto L59
            r10.OooO0oo = r7
            r10.OooO = r6
            r10.OooOO0 = r5
            r10.OooOO0O = r8
            r10.OooOO0o = r3
            r10.OooOOO0 = r0
            r10.OooOOO = r1
            java.lang.Object r11 = com.cmaster.cloner.rp1.OooO0Oo(r6, r5, r11, r10)
            if (r11 != r9) goto L56
            goto L73
        L56:
            r4 = r8
        L57:
            r11 = r4
            goto L75
        L59:
            com.cmaster.cloner.tf r10 = new com.cmaster.cloner.tf
            r10.<init>()
            throw r10
        L5f:
            r10.OooO0oo = r7
            r10.OooO = r6
            r10.OooOO0 = r5
            r10.OooOO0O = r8
            r10.OooOO0o = r3
            r10.OooOOO0 = r0
            r10.OooOOO = r2
            java.lang.Object r11 = com.cmaster.cloner.rp1.OooO0OO(r6, r5, r11, r10)
            if (r11 != r9) goto L56
        L73:
            return r9
        L74:
            r11 = r8
        L75:
            int r3 = r3 + r2
            goto L2f
        L77:
            com.cmaster.cloner.vq1 r10 = com.cmaster.cloner.vq1.OooO00o
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.qp1.OooO(java.lang.Object):java.lang.Object");
    }

    @Override // com.cmaster.cloner.e40
    public final Object OooO0oO(Object obj, Object obj2) {
        return ((qp1) OooO0oo((gj) obj2, (j31) obj)).OooO(vq1.OooO00o);
    }

    @Override // com.cmaster.cloner.h6
    public final gj OooO0oo(gj gjVar, Object obj) {
        return new qp1(this.OooOOOO, this.OooOOOo, this.OooOOo0, gjVar);
    }
}
