package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class eo2 {
    public static final gb OooO00o(gj gjVar) {
        gb gbVar;
        gb gbVar2;
        if (!(gjVar instanceof cs)) {
            return new gb(gjVar, 1);
        }
        cs csVar = (cs) gjVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cs.OooOO0O;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(csVar);
            gbVar = null;
            uk1 uk1Var = uu0.OooO0O0;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(csVar, uk1Var);
                gbVar2 = null;
                break;
            }
            if (obj instanceof gb) {
                while (!atomicReferenceFieldUpdater.compareAndSet(csVar, obj, uk1Var)) {
                    if (atomicReferenceFieldUpdater.get(csVar) != obj) {
                        break;
                    }
                }
                gbVar2 = (gb) obj;
                break loop0;
            }
            if (obj != uk1Var && !(obj instanceof Throwable)) {
                qa.OooO0Oo(obj, "Inconsistent state ");
                return null;
            }
        }
        if (gbVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = gb.OooOO0;
            Object obj2 = atomicReferenceFieldUpdater2.get(gbVar2);
            if (!(obj2 instanceof pf) || ((pf) obj2).OooO0Oo == null) {
                gb.OooO.set(gbVar2, 536870911);
                atomicReferenceFieldUpdater2.set(gbVar2, o00OO0OO.OooO00o);
                gbVar = gbVar2;
            } else {
                gbVar2.OooOOo0();
            }
            if (gbVar != null) {
                return gbVar;
            }
        }
        return new gb(gjVar, 2);
    }
}
