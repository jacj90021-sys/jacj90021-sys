package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class x3 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO00o = AtomicReferenceFieldUpdater.newUpdater(x3.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = g9.OooO00o;

    public abstract void OooO00o(Object obj, Object obj2);

    public final Object OooO0O0(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO00o;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        uk1 uk1Var = g9.OooO00o;
        if (obj2 == uk1Var) {
            uk1 uk1VarOooO0OO = OooO0OO(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == uk1Var) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, uk1Var, uk1VarOooO0OO)) {
                        obj2 = uk1VarOooO0OO;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != uk1Var) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        OooO00o(obj, obj2);
        return obj2;
    }

    public abstract uk1 OooO0OO(Object obj);

    public final String toString() {
        return getClass().getSimpleName() + '@' + rn.OooO00o(this);
    }
}
