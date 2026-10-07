package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class si1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO0O0 = AtomicReferenceFieldUpdater.newUpdater(si1.class, Object.class, "_state$volatile");
    public int OooO00o;
    private volatile /* synthetic */ Object _state$volatile;

    public si1(Object obj) {
        this._state$volatile = obj;
    }

    public final boolean OooO00o(Object obj, Object obj2) {
        int i;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO0O0;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !ij0.OooO00o(obj3, obj)) {
                return false;
            }
            if (ij0.OooO00o(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.OooO00o;
            if ((i2 & 1) != 0) {
                this.OooO00o = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.OooO00o = i3;
            while (true) {
                synchronized (this) {
                    i = this.OooO00o;
                    if (i == i3) {
                        this.OooO00o = i3 + 1;
                        return true;
                    }
                }
                i3 = i;
            }
        }
    }
}
