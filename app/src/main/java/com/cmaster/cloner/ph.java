package com.cmaster.cloner;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ph implements ue1 {
    public final AtomicReference OooO00o;

    public ph(xe1 xe1Var) {
        this.OooO00o = new AtomicReference(xe1Var);
    }

    @Override // com.cmaster.cloner.ue1
    public final Iterator iterator() {
        ue1 ue1Var = (ue1) this.OooO00o.getAndSet(null);
        if (ue1Var != null) {
            return ue1Var.iterator();
        }
        qa.OooO0o("This sequence can be consumed only once.");
        return null;
    }
}
