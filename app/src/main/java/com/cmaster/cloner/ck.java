package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ck extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooOO0o = AtomicIntegerFieldUpdater.newUpdater(ck.class, "workerCtl$volatile");
    public int OooO;
    public final u02 OooO0Oo;
    public dk OooO0o;
    public final k81 OooO0o0;
    public long OooO0oO;
    public long OooO0oo;
    public boolean OooOO0;
    public final /* synthetic */ ek OooOO0O;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public ck(ek ekVar, int i) {
        this.OooOO0O = ekVar;
        setDaemon(true);
        setContextClassLoader(ek.class.getClassLoader());
        this.OooO0Oo = new u02();
        this.OooO0o0 = new k81();
        this.OooO0o = dk.OooO0oO;
        this.nextParkedWorker = ek.OooOOO;
        int iNanoTime = (int) System.nanoTime();
        this.OooO = iNanoTime == 0 ? 42 : iNanoTime;
        OooO0o(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.cmaster.cloner.wl1 OooO(int r26) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ck.OooO(int):com.cmaster.cloner.wl1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r12 = com.cmaster.cloner.u02.OooO0Oo.get(r9);
        r0 = com.cmaster.cloner.u02.OooO0OO.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r12 == r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (com.cmaster.cloner.u02.OooO0o0.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = r0 - 1;
        r1 = r9.OooO0O0(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.cmaster.cloner.wl1 OooO00o(boolean r12) {
        /*
            r11 = this;
            com.cmaster.cloner.dk r0 = r11.OooO0o
            com.cmaster.cloner.ek r2 = r11.OooOO0O
            r7 = 0
            r8 = 1
            com.cmaster.cloner.u02 r9 = r11.OooO0Oo
            com.cmaster.cloner.dk r10 = com.cmaster.cloner.dk.OooO0Oo
            if (r0 != r10) goto Le
            goto L87
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = com.cmaster.cloner.ek.OooOO0o
        L10:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L76
            r9.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = com.cmaster.cloner.u02.OooO0O0
            java.lang.Object r0 = r12.get(r9)
            com.cmaster.cloner.wl1 r0 = (com.cmaster.cloner.wl1) r0
            if (r0 != 0) goto L2e
            goto L43
        L2e:
            com.cmaster.cloner.ep0 r1 = r0.OooO0o0
            int r1 = r1.OooO0Oo
            if (r1 != r8) goto L43
        L34:
            boolean r1 = r12.compareAndSet(r9, r0, r7)
            if (r1 == 0) goto L3c
            r7 = r0
            goto L63
        L3c:
            java.lang.Object r1 = r12.get(r9)
            if (r1 == r0) goto L34
            goto L23
        L43:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = com.cmaster.cloner.u02.OooO0Oo
            int r12 = r12.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = com.cmaster.cloner.u02.OooO0OO
            int r0 = r0.get(r9)
        L4f:
            if (r12 == r0) goto L63
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = com.cmaster.cloner.u02.OooO0o0
            int r1 = r1.get(r9)
            if (r1 != 0) goto L5a
            goto L63
        L5a:
            int r0 = r0 + (-1)
            com.cmaster.cloner.wl1 r1 = r9.OooO0O0(r0, r8)
            if (r1 == 0) goto L4f
            r7 = r1
        L63:
            if (r7 != 0) goto L75
            com.cmaster.cloner.t50 r12 = r2.OooO
            java.lang.Object r12 = r12.OooO0Oo()
            com.cmaster.cloner.wl1 r12 = (com.cmaster.cloner.wl1) r12
            if (r12 != 0) goto L74
            com.cmaster.cloner.wl1 r11 = r11.OooO(r8)
            return r11
        L74:
            return r12
        L75:
            return r7
        L76:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = com.cmaster.cloner.ek.OooOO0o
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L10
            r11.OooO0o = r10
        L87:
            if (r12 == 0) goto Lbb
            int r12 = r2.OooO0Oo
            int r12 = r12 * 2
            int r12 = r11.OooO0Oo(r12)
            if (r12 != 0) goto L94
            goto L95
        L94:
            r8 = 0
        L95:
            if (r8 == 0) goto L9e
            com.cmaster.cloner.wl1 r12 = r11.OooO0o0()
            if (r12 == 0) goto L9e
            return r12
        L9e:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = com.cmaster.cloner.u02.OooO0O0
            java.lang.Object r12 = r12.getAndSet(r9, r7)
            com.cmaster.cloner.wl1 r12 = (com.cmaster.cloner.wl1) r12
            if (r12 != 0) goto Laf
            com.cmaster.cloner.wl1 r12 = r9.OooO00o()
        Laf:
            if (r12 == 0) goto Lb2
            return r12
        Lb2:
            if (r8 != 0) goto Lc2
            com.cmaster.cloner.wl1 r12 = r11.OooO0o0()
            if (r12 == 0) goto Lc2
            return r12
        Lbb:
            com.cmaster.cloner.wl1 r12 = r11.OooO0o0()
            if (r12 == 0) goto Lc2
            return r12
        Lc2:
            r12 = 3
            com.cmaster.cloner.wl1 r11 = r11.OooO(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ck.OooO00o(boolean):com.cmaster.cloner.wl1");
    }

    public final int OooO0O0() {
        return this.indexInArray;
    }

    public final Object OooO0OO() {
        return this.nextParkedWorker;
    }

    public final int OooO0Oo(int i) {
        int i2 = this.OooO;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.OooO = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final void OooO0o(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.OooOO0O.OooO0oO);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final wl1 OooO0o0() {
        int iOooO0Oo = OooO0Oo(2);
        ek ekVar = this.OooOO0O;
        t50 t50Var = ekVar.OooO;
        t50 t50Var2 = ekVar.OooO0oo;
        if (iOooO0Oo == 0) {
            wl1 wl1Var = (wl1) t50Var2.OooO0Oo();
            return wl1Var != null ? wl1Var : (wl1) t50Var.OooO0Oo();
        }
        wl1 wl1Var2 = (wl1) t50Var.OooO0Oo();
        return wl1Var2 != null ? wl1Var2 : (wl1) t50Var2.OooO0Oo();
    }

    public final void OooO0oO(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean OooO0oo(dk dkVar) {
        dk dkVar2 = this.OooO0o;
        boolean z = dkVar2 == dk.OooO0Oo;
        if (z) {
            ek.OooOO0o.addAndGet(this.OooOO0O, 4398046511104L);
        }
        if (dkVar2 != dkVar) {
            this.OooO0o = dkVar;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ck.run():void");
    }
}
