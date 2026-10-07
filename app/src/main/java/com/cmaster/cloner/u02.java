package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u02 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO0O0 = AtomicReferenceFieldUpdater.newUpdater(u02.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooO0OO = AtomicIntegerFieldUpdater.newUpdater(u02.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooO0Oo = AtomicIntegerFieldUpdater.newUpdater(u02.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooO0o0 = AtomicIntegerFieldUpdater.newUpdater(u02.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray OooO00o = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final wl1 OooO00o() {
        wl1 wl1Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = OooO0Oo;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - OooO0OO.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (wl1Var = (wl1) this.OooO00o.getAndSet(i2, null)) != null) {
                if (wl1Var.OooO0o0.OooO0Oo == 1) {
                    OooO0o0.decrementAndGet(this);
                }
                return wl1Var;
            }
        }
    }

    public final wl1 OooO0O0(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.OooO00o;
        wl1 wl1Var = (wl1) atomicReferenceArray.get(i2);
        if (wl1Var != null) {
            if ((wl1Var.OooO0o0.OooO0Oo == 1) == z) {
                while (!atomicReferenceArray.compareAndSet(i2, wl1Var, null)) {
                    if (atomicReferenceArray.get(i2) != wl1Var) {
                    }
                }
                if (z) {
                    OooO0o0.decrementAndGet(this);
                }
                return wl1Var;
            }
        }
        return null;
    }
}
