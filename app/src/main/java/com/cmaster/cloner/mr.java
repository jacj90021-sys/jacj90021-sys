package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class mr extends up {
    public int OooOOO0;

    public mr(ly1 ly1Var) {
        super(ly1Var);
        if (ly1Var instanceof j80) {
            this.OooO0o0 = 2;
        } else {
            this.OooO0o0 = 3;
        }
    }

    @Override // com.cmaster.cloner.up
    public final void OooO0Oo(int i) {
        if (this.OooOO0) {
            return;
        }
        this.OooOO0 = true;
        this.OooO0oO = i;
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            qp qpVar = (qp) obj;
            qpVar.OooO00o(qpVar);
        }
    }
}
