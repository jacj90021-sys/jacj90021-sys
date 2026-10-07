package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class x73 {
    public static /* synthetic */ boolean OooO00o(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, lh2 lh2Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lh2Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(lh2Var) != obj && atomicReferenceFieldUpdater.get(lh2Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
