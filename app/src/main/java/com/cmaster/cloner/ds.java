package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ds extends td1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooO0oo = AtomicIntegerFieldUpdater.newUpdater(ds.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // com.cmaster.cloner.td1, com.cmaster.cloner.nk0
    public final void OooO0oO(Object obj) {
        OooOO0o(obj);
    }

    @Override // com.cmaster.cloner.td1, com.cmaster.cloner.nk0
    public final void OooOO0o(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = OooO0oo;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    uu0.OooO00o(gu2.OooO00o(this.OooO0oO), cp2.OooO00o(obj));
                    return;
                } else {
                    qa.OooO0o("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
