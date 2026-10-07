package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vl1 implements fm0 {
    public final Set OooO0Oo = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.cmaster.cloner.fm0
    public final void OooO() {
        ArrayList arrayListOooO0o0 = pr1.OooO0o0(this.OooO0Oo);
        int size = arrayListOooO0o0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListOooO0o0.get(i);
            i++;
            ((sl1) obj).OooO();
        }
    }

    @Override // com.cmaster.cloner.fm0
    public final void OooO0o0() {
        ArrayList arrayListOooO0o0 = pr1.OooO0o0(this.OooO0Oo);
        int size = arrayListOooO0o0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListOooO0o0.get(i);
            i++;
            ((sl1) obj).OooO0o0();
        }
    }

    @Override // com.cmaster.cloner.fm0
    public final void onDestroy() {
        ArrayList arrayListOooO0o0 = pr1.OooO0o0(this.OooO0Oo);
        int size = arrayListOooO0o0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListOooO0o0.get(i);
            i++;
            ((sl1) obj).onDestroy();
        }
    }
}
