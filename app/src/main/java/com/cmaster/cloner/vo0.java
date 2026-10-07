package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class vo0 {
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO0Oo = AtomicReferenceFieldUpdater.newUpdater(vo0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO0o0 = AtomicReferenceFieldUpdater.newUpdater(vo0.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO0o = AtomicReferenceFieldUpdater.newUpdater(vo0.class, Object.class, "_removedRef$volatile");

    public final vo0 OooO() {
        Object objOooO0oo = OooO0oo();
        h91 h91Var = objOooO0oo instanceof h91 ? (h91) objOooO0oo : null;
        if (h91Var != null) {
            return h91Var.OooO00o;
        }
        objOooO0oo.getClass();
        return (vo0) objOooO0oo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r6 = ((com.cmaster.cloner.h91) r6).OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.cmaster.cloner.vo0 OooO0o() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = com.cmaster.cloner.vo0.OooO0o0
            java.lang.Object r1 = r0.get(r9)
            com.cmaster.cloner.vo0 r1 = (com.cmaster.cloner.vo0) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = com.cmaster.cloner.vo0.OooO0Oo
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L2d
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            goto L2d
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.OooOO0()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
        L2d:
            return r3
        L2e:
            boolean r7 = r6 instanceof com.cmaster.cloner.x3
            if (r7 == 0) goto L38
            com.cmaster.cloner.x3 r6 = (com.cmaster.cloner.x3) r6
            r6.OooO0O0(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof com.cmaster.cloner.h91
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            com.cmaster.cloner.h91 r6 = (com.cmaster.cloner.h91) r6
            com.cmaster.cloner.vo0 r6 = r6.OooO00o
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            com.cmaster.cloner.vo0 r3 = (com.cmaster.cloner.vo0) r3
            goto Lb
        L58:
            r6.getClass()
            r4 = r6
            com.cmaster.cloner.vo0 r4 = (com.cmaster.cloner.vo0) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.vo0.OooO0o():com.cmaster.cloner.vo0");
    }

    public final void OooO0oO(vo0 vo0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO0o0;
            vo0 vo0Var2 = (vo0) atomicReferenceFieldUpdater.get(vo0Var);
            if (OooO0oo() != vo0Var) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(vo0Var, vo0Var2, this)) {
                if (atomicReferenceFieldUpdater.get(vo0Var) != vo0Var2) {
                    break;
                }
            }
            if (OooOO0()) {
                vo0Var.OooO0o();
                return;
            }
            return;
        }
    }

    public final Object OooO0oo() {
        while (true) {
            Object obj = OooO0Oo.get(this);
            if (!(obj instanceof x3)) {
                return obj;
            }
            ((x3) obj).OooO0O0(this);
        }
    }

    public boolean OooOO0() {
        return OooO0oo() instanceof h91;
    }

    public String toString() {
        return new uo0(this, rn.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + rn.OooO00o(this);
    }
}
