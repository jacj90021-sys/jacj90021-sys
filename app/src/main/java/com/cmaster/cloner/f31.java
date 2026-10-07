package com.cmaster.cloner;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f31 {
    public final int OooO00o;
    public final p30 OooO0O0;
    public final ReentrantLock OooO0OO = new ReentrantLock();
    public int OooO0Oo;
    public final ih[] OooO0o;
    public boolean OooO0o0;
    public final pe1 OooO0oO;
    public final ed OooO0oo;

    public f31(int i, p30 p30Var) {
        this.OooO00o = i;
        this.OooO0O0 = p30Var;
        this.OooO0o = new ih[i];
        int i2 = qe1.OooO00o;
        this.OooO0oO = new pe1(i);
        ed edVar = new ed();
        if (i < 1) {
            ra.OooOOO("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            ra.OooOOO("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        edVar.OooO0OO = i - 1;
        edVar.OooO0Oo = new Object[i];
        this.OooO0oo = edVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        r0.OooO0o0(r8.OooO0o0);
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooO00o(com.cmaster.cloner.ij r8) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.f31.OooO00o(com.cmaster.cloner.ij):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:46|29|(1:(1:39)(2:35|(1:37)))(1:31)|38|19|44|20|21|(1:23)(11:24|25|46|29|(0)(0)|38|19|44|20|21|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r5 = r9;
        r9 = r10;
        r7 = r7;
        r6 = r6;
        r1 = r0;
        r0 = r1;
        r10 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x0075, TryCatch #1 {all -> 0x0075, blocks: (B:29:0x006d, B:31:0x0071, B:35:0x0079, B:39:0x0081), top: B:46:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.cmaster.cloner.p30] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0056 -> B:25:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooO0O0(long r7, com.cmaster.cloner.bh r9, com.cmaster.cloner.ij r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.cmaster.cloner.e31
            if (r0 == 0) goto L13
            r0 = r10
            com.cmaster.cloner.e31 r0 = (com.cmaster.cloner.e31) r0
            int r1 = r0.OooOOO0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.OooOOO0 = r1
            goto L18
        L13:
            com.cmaster.cloner.e31 r0 = new com.cmaster.cloner.e31
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.OooOO0O
            int r1 = r0.OooOOO0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L30
            long r6 = r0.OooOO0
            com.cmaster.cloner.k81 r8 = r0.OooO
            com.cmaster.cloner.p30 r9 = r0.OooO0oo
            com.cmaster.cloner.f31 r1 = r0.OooO0oO
            com.cmaster.cloner.ty2.OooO0O0(r10)     // Catch: java.lang.Throwable -> L2e
            goto L59
        L2e:
            r10 = move-exception
            goto L66
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.cmaster.cloner.qa.OooO0o(r6)
            return r3
        L36:
            com.cmaster.cloner.ty2.OooO0O0(r10)
        L39:
            com.cmaster.cloner.k81 r10 = new com.cmaster.cloner.k81
            r10.<init>()
            com.cmaster.cloner.nr0 r1 = new com.cmaster.cloner.nr0     // Catch: java.lang.Throwable -> L60
            r1.<init>(r10, r6, r3, r2)     // Catch: java.lang.Throwable -> L60
            r0.OooO0oO = r6     // Catch: java.lang.Throwable -> L60
            r0.OooO0oo = r9     // Catch: java.lang.Throwable -> L60
            r0.OooO = r10     // Catch: java.lang.Throwable -> L60
            r0.OooOO0 = r7     // Catch: java.lang.Throwable -> L60
            r0.OooOOO0 = r2     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = com.cmaster.cloner.q43.OooO00o(r7, r1, r0)     // Catch: java.lang.Throwable -> L60
            com.cmaster.cloner.gk r4 = com.cmaster.cloner.gk.OooO0Oo
            if (r1 != r4) goto L56
            return r4
        L56:
            r1 = r6
            r6 = r7
            r8 = r10
        L59:
            r10 = r9
            r9 = r8
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r3
            goto L6d
        L60:
            r1 = move-exception
            r5 = r1
            r1 = r6
            r6 = r7
            r8 = r10
            r10 = r5
        L66:
            r5 = r9
            r9 = r8
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r10
            r10 = r5
        L6d:
            boolean r4 = r0 instanceof com.cmaster.cloner.fn1     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L77
            r10.OooO00o()     // Catch: java.lang.Throwable -> L75
            goto L7e
        L75:
            r7 = move-exception
            goto L82
        L77:
            if (r0 != 0) goto L81
            java.lang.Object r9 = r9.OooO0Oo     // Catch: java.lang.Throwable -> L75
            if (r9 == 0) goto L7e
            return r9
        L7e:
            r9 = r10
            r0 = r1
            goto L39
        L81:
            throw r0     // Catch: java.lang.Throwable -> L75
        L82:
            java.lang.Object r8 = r9.OooO0Oo
            com.cmaster.cloner.ih r8 = (com.cmaster.cloner.ih) r8
            if (r8 == 0) goto L8b
            r6.OooO0o0(r8)
        L8b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.f31.OooO0O0(long, com.cmaster.cloner.bh, com.cmaster.cloner.ij):java.lang.Object");
    }

    public final void OooO0OO() {
        ReentrantLock reentrantLock = this.OooO0OO;
        reentrantLock.lock();
        try {
            this.OooO0o0 = true;
            for (ih ihVar : this.OooO0o) {
                if (ihVar != null) {
                    ihVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void OooO0Oo(StringBuilder sb) {
        ed edVar = this.OooO0oo;
        ReentrantLock reentrantLock = this.OooO0OO;
        reentrantLock.lock();
        try {
            zm0 zm0Var = new zm0(10);
            int i = (edVar.OooO0O0 - edVar.OooO00o) & edVar.OooO0OO;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = edVar.OooO0O0;
                    int i4 = edVar.OooO00o;
                    int i5 = edVar.OooO0OO;
                    if (i2 < ((i3 - i4) & i5)) {
                        Object obj = ((Object[]) edVar.OooO0Oo)[(i4 + i2) & i5];
                        obj.getClass();
                        zm0Var.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            zm0 zm0VarOooO00o = te.OooO00o(zm0Var);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.OooO00o + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            pe1 pe1Var = this.OooO0oO;
            pe1Var.getClass();
            sb2.append(Math.max(pe1.OooOO0.get(pe1Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + zm0VarOooO00o.OooO00o() + ")[" + se.OooO0o0(zm0VarOooO00o, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            ih[] ihVarArr = this.OooO0o;
            int length = ihVarArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                ih ihVar = ihVarArr[i7];
                i6++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i6);
                sb3.append("] - ");
                sb3.append(ihVar != null ? ihVar.OooO0Oo.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (ihVar != null) {
                    ihVar.OooO0o(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void OooO0o0(ih ihVar) {
        ihVar.getClass();
        ReentrantLock reentrantLock = this.OooO0OO;
        reentrantLock.lock();
        try {
            this.OooO0oo.OooO00o(ihVar);
            reentrantLock.unlock();
            this.OooO0oO.OooO0O0();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
