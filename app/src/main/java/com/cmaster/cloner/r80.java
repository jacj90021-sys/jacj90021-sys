package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class r80 {
    public static final uk1 OooO00o = new uk1("CLOSED", 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.cmaster.cloner.me1] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.cmaster.cloner.me1, java.lang.Object] */
    public static final Object OooO00o(re1 re1Var, long j, e40 e40Var) {
        me1 r0 = re1Var;
        while (true) {
            if (r0.OooO0OO >= j && !r0.OooO00o()) {
                return r0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vg.OooO00o;
            Object obj = atomicReferenceFieldUpdater.get(r0);
            uk1 uk1Var = OooO00o;
            if (obj == uk1Var) {
                return uk1Var;
            }
            me1 r1 = (me1) ((vg) obj);
            if (r1 == null) {
                r1 = (me1) e40Var.OooO0oO(Long.valueOf(r0.OooO0OO + 1), r0);
                while (!atomicReferenceFieldUpdater.compareAndSet(r0, null, r1)) {
                    if (atomicReferenceFieldUpdater.get(r0) != null) {
                        break;
                    }
                }
                if (r0.OooO00o()) {
                    r0.OooO0O0();
                }
            }
            r0 = r1;
        }
    }
}
