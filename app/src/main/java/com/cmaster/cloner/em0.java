package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class em0 implements yl0, gm0 {
    public final HashSet OooO0Oo = new HashSet();
    public final jm0 OooO0o0;

    public em0(jm0 jm0Var) {
        this.OooO0o0 = jm0Var;
        jm0Var.OooO0OO(this);
    }

    @Override // com.cmaster.cloner.yl0
    public final void OooO00o(fm0 fm0Var) {
        this.OooO0Oo.remove(fm0Var);
    }

    @Override // com.cmaster.cloner.yl0
    public final void OooO0O0(fm0 fm0Var) {
        this.OooO0Oo.add(fm0Var);
        xl0 xl0Var = this.OooO0o0.OooO0o;
        if (xl0Var == xl0.OooO0Oo) {
            fm0Var.onDestroy();
        } else if (xl0Var.compareTo(xl0.OooO0oO) >= 0) {
            fm0Var.OooO();
        } else {
            fm0Var.OooO0o0();
        }
    }

    @gz0(wl0.ON_DESTROY)
    public void onDestroy(hm0 hm0Var) {
        ArrayList arrayListOooO0o0 = pr1.OooO0o0(this.OooO0Oo);
        int size = arrayListOooO0o0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListOooO0o0.get(i);
            i++;
            ((fm0) obj).onDestroy();
        }
        hm0Var.OooO0o().OooOOOO(this);
    }

    @gz0(wl0.ON_START)
    public void onStart(hm0 hm0Var) {
        ArrayList arrayListOooO0o0 = pr1.OooO0o0(this.OooO0Oo);
        int size = arrayListOooO0o0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListOooO0o0.get(i);
            i++;
            ((fm0) obj).OooO();
        }
    }

    @gz0(wl0.ON_STOP)
    public void onStop(hm0 hm0Var) {
        ArrayList arrayListOooO0o0 = pr1.OooO0o0(this.OooO0Oo);
        int size = arrayListOooO0o0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListOooO0o0.get(i);
            i++;
            ((fm0) obj).OooO0o0();
        }
    }
}
