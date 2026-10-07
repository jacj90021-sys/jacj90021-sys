package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class eh implements zg {
    public final f31 OooO0Oo;
    public final ThreadLocal OooO0o;
    public final f31 OooO0o0;
    public final AtomicBoolean OooO0oO;
    public final long OooO0oo;

    public eh(final o0O000O o0o000o, final String str, int i) {
        long jOooO0O0;
        str.getClass();
        this.OooO0o = new ThreadLocal();
        final int i2 = 0;
        this.OooO0oO = new AtomicBoolean(false);
        int i3 = vt.OooO0o;
        xt xtVar = xt.SECONDS;
        if (xtVar.compareTo(xtVar) <= 0) {
            int i4 = wt.OooO00o;
            jOooO0O0 = 60000000000L;
        } else {
            jOooO0O0 = oq2.OooO0O0(30L, xtVar);
        }
        this.OooO0oo = jOooO0O0;
        if (i <= 0) {
            ra.OooOOO("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.OooO0Oo = new f31(i, new p30() { // from class: com.cmaster.cloner.ah
            @Override // com.cmaster.cloner.p30
            public final Object OooO00o() throws Exception {
                int i5 = i2;
                String str2 = str;
                o0O000O o0o000o2 = o0o000o;
                switch (i5) {
                    case 0:
                        mc1 mc1VarOooO0oO = o0o000o2.OooO0oO(str2);
                        zy2.OooO00o(mc1VarOooO0oO, "PRAGMA query_only = 1");
                        return mc1VarOooO0oO;
                    default:
                        return o0o000o2.OooO0oO(str2);
                }
            }
        });
        final int i5 = 1;
        this.OooO0o0 = new f31(1, new p30() { // from class: com.cmaster.cloner.ah
            @Override // com.cmaster.cloner.p30
            public final Object OooO00o() throws Exception {
                int i52 = i5;
                String str2 = str;
                o0O000O o0o000o2 = o0o000o;
                switch (i52) {
                    case 0:
                        mc1 mc1VarOooO0oO = o0o000o2.OooO0oO(str2);
                        zy2.OooO00o(mc1VarOooO0oO, "PRAGMA query_only = 1");
                        return mc1VarOooO0oO;
                    default:
                        return o0o000o2.OooO0oO(str2);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0145 A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #3 {all -> 0x0194, blocks: (B:63:0x011e, B:68:0x013a, B:70:0x0145, B:83:0x0198, B:84:0x019f), top: B:111:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017e A[Catch: all -> 0x0193, TRY_LEAVE, TryCatch #2 {all -> 0x0193, blocks: (B:74:0x0178, B:76:0x017e, B:78:0x0189, B:79:0x018c), top: B:109:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0198 A[Catch: all -> 0x0194, TRY_ENTER, TryCatch #3 {all -> 0x0194, blocks: (B:63:0x011e, B:68:0x013a, B:70:0x0145, B:83:0x0198, B:84:0x019f), top: B:111:0x011e }] */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.cmaster.cloner.bh] */
    @Override // com.cmaster.cloner.zg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooOOO0(boolean r17, com.cmaster.cloner.e40 r18, com.cmaster.cloner.ij r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.eh.OooOOO0(boolean, com.cmaster.cloner.e40, com.cmaster.cloner.ij):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.OooO0oO.compareAndSet(false, true)) {
            this.OooO0Oo.OooO0OO();
            this.OooO0o0.OooO0OO();
        }
    }

    public eh(o0O000O o0o000o) {
        long jOooO0O0;
        this.OooO0o = new ThreadLocal();
        this.OooO0oO = new AtomicBoolean(false);
        int i = vt.OooO0o;
        xt xtVar = xt.SECONDS;
        if (xtVar.compareTo(xtVar) <= 0) {
            int i2 = wt.OooO00o;
            jOooO0O0 = 60000000000L;
        } else {
            jOooO0O0 = oq2.OooO0O0(30L, xtVar);
        }
        this.OooO0oo = jOooO0O0;
        f31 f31Var = new f31(1, new wf(o0o000o, 1));
        this.OooO0Oo = f31Var;
        this.OooO0o0 = f31Var;
    }
}
