package com.cmaster.cloner;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oe implements ln0 {
    public final CopyOnWriteArrayList OooO00o = new CopyOnWriteArrayList();

    @Override // com.cmaster.cloner.ln0
    public final void OooO00o(int i, int i2) {
        Iterator it = this.OooO00o.iterator();
        while (it.hasNext()) {
            ((ln0) it.next()).OooO00o(i, i2);
        }
    }

    @Override // com.cmaster.cloner.ln0
    public final void OooO0O0(int i, int i2) {
        Iterator it = this.OooO00o.iterator();
        while (it.hasNext()) {
            ((ln0) it.next()).OooO0O0(i, i2);
        }
    }

    @Override // com.cmaster.cloner.ln0
    public final void OooO0OO(int i, int i2) {
        Iterator it = this.OooO00o.iterator();
        while (it.hasNext()) {
            ((ln0) it.next()).OooO0OO(i, i2);
        }
    }

    @Override // com.cmaster.cloner.ln0
    public final void OooO0Oo(int i, int i2, Object obj) {
        Iterator it = this.OooO00o.iterator();
        while (it.hasNext()) {
            ((ln0) it.next()).OooO0Oo(i, i2, obj);
        }
    }
}
