package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ov0 extends pe1 implements kv0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooOO0O = AtomicReferenceFieldUpdater.newUpdater(ov0.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public ov0() {
        super(1);
        this.owner$volatile = y62.OooO0O0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r1.OooO0o0(r5.OooO0o0);
     */
    @Override // com.cmaster.cloner.kv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooO0OO(com.cmaster.cloner.ij r6) throws java.lang.Throwable {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = com.cmaster.cloner.pe1.OooOO0
            int r1 = r0.get(r5)
            int r2 = r5.OooO0Oo
            if (r1 <= r2) goto L17
        La:
            int r1 = r0.get(r5)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r5, r1, r2)
            if (r1 == 0) goto La
            goto L0
        L17:
            com.cmaster.cloner.vq1 r3 = com.cmaster.cloner.vq1.OooO00o
            if (r1 > 0) goto L4f
            com.cmaster.cloner.gj r6 = com.cmaster.cloner.gu2.OooO00o(r6)
            com.cmaster.cloner.gb r6 = com.cmaster.cloner.eo2.OooO00o(r6)
            com.cmaster.cloner.mv0 r1 = new com.cmaster.cloner.mv0     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4a
        L28:
            int r4 = r0.getAndDecrement(r5)     // Catch: java.lang.Throwable -> L4a
            if (r4 > r2) goto L28
            if (r4 <= 0) goto L36
            com.cmaster.cloner.lv0 r5 = r5.OooO0o0     // Catch: java.lang.Throwable -> L4a
            r1.OooO0o0(r5)     // Catch: java.lang.Throwable -> L4a
            goto L3c
        L36:
            boolean r4 = r5.OooO00o(r1)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L28
        L3c:
            java.lang.Object r5 = r6.OooOo00()
            com.cmaster.cloner.gk r6 = com.cmaster.cloner.gk.OooO0Oo
            if (r5 != r6) goto L45
            goto L46
        L45:
            r5 = r3
        L46:
            if (r5 != r6) goto L49
            return r5
        L49:
            return r3
        L4a:
            r5 = move-exception
            r6.OooOoOO()
            throw r5
        L4f:
            int r2 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r5, r1, r2)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = com.cmaster.cloner.ov0.OooOO0O
            r0 = 0
            r6.set(r5, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ov0.OooO0OO(com.cmaster.cloner.ij):java.lang.Object");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(rn.OooO00o(this));
        sb.append("[isLocked=");
        sb.append(Math.max(pe1.OooOO0.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(OooOO0O.get(this));
        sb.append(']');
        return sb.toString();
    }

    @Override // com.cmaster.cloner.kv0
    public final void unlock() {
        while (Math.max(pe1.OooOO0.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooOO0O;
            Object obj = atomicReferenceFieldUpdater.get(this);
            uk1 uk1Var = y62.OooO0O0;
            if (obj != uk1Var) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uk1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                OooO0O0();
                return;
            }
        }
        qa.OooO0o("This mutex is not locked");
    }
}
