package com.cmaster.cloner;

import java.util.LinkedList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cf1 extends eb1 {
    public Object OooOOo;
    public final LinkedList OooOOo0 = new LinkedList();

    @Override // com.cmaster.cloner.gv0
    public final void OooOO0(Object obj) {
        h1.OooO0OO.execute(new bf1(this, obj, 0));
    }

    @Override // com.cmaster.cloner.eb1, com.cmaster.cloner.gv0
    public final synchronized void OooOO0o(Object obj) {
        this.OooOOo0.addFirst(obj);
        LinkedList linkedList = this.OooOOo0;
        if (this.OooOOo == null) {
            if (linkedList.isEmpty()) {
                OooOOOO();
            } else {
                Object objRemoveLast = linkedList.removeLast();
                this.OooOOo = objRemoveLast;
                super.OooOO0o(objRemoveLast);
            }
        }
    }

    public final void OooOOo0(o0OoOoOo o0oooooo) {
        Object obj = this.OooOOo;
        LinkedList linkedList = this.OooOOo0;
        if (o0oooooo != obj) {
            linkedList.remove(o0oooooo);
            return;
        }
        this.OooOOo = null;
        if (linkedList.isEmpty()) {
            OooOOOO();
            return;
        }
        Object objRemoveLast = linkedList.removeLast();
        this.OooOOo = objRemoveLast;
        super.OooOO0o(objRemoveLast);
    }
}
