package com.cmaster.cloner;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class bi2 {
    public static /* synthetic */ boolean OooO00o(Unsafe unsafe, lh2 lh2Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(lh2Var, j, obj, obj2)) {
            if (unsafe.getObject(lh2Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
