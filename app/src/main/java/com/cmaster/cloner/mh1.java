package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mh1 implements jh {
    public final /* synthetic */ oh1 OooO00o;

    public mh1(oh1 oh1Var) {
        this.OooO00o = oh1Var;
    }

    @Override // com.cmaster.cloner.jh
    public final void OooO00o(boolean z) {
        ArrayList arrayList;
        pr1.OooO00o();
        synchronized (this.OooO00o) {
            arrayList = new ArrayList((HashSet) this.OooO00o.OooO0oO);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((jh) obj).OooO00o(z);
        }
    }
}
