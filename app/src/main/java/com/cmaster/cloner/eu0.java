package com.cmaster.cloner;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class eu0 extends mp0 {
    @Override // com.cmaster.cloner.mp0
    public final void OooO0OO(Object obj, Object obj2) {
        fu0 fu0Var = (fu0) obj;
        fu0Var.getClass();
        ArrayDeque arrayDeque = fu0.OooO0O0;
        synchronized (arrayDeque) {
            arrayDeque.offer(fu0Var);
        }
    }
}
