package com.cmaster.cloner;

import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class yt1 {
    public final zt1 OooO0Oo = new zt1();

    public final void OooO00o() {
        zt1 zt1Var = this.OooO0Oo;
        if (zt1Var != null && !zt1Var.OooO0Oo) {
            zt1Var.OooO0Oo = true;
            synchronized (zt1Var.OooO00o) {
                try {
                    Iterator it = zt1Var.OooO0O0.values().iterator();
                    while (it.hasNext()) {
                        zt1.OooO00o((AutoCloseable) it.next());
                    }
                    Iterator it2 = zt1Var.OooO0OO.iterator();
                    while (it2.hasNext()) {
                        zt1.OooO00o((AutoCloseable) it2.next());
                    }
                    zt1Var.OooO0OO.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        OooO0O0();
    }

    public void OooO0O0() {
    }
}
