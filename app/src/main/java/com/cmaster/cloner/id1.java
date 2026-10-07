package com.cmaster.cloner;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class id1 {
    public final jd1 OooO00o;
    public final wf OooO0O0;
    public Bundle OooO0o;
    public boolean OooO0o0;
    public boolean OooO0oO;
    public final iu OooO0OO = new iu(13);
    public final LinkedHashMap OooO0Oo = new LinkedHashMap();
    public boolean OooO0oo = true;

    public id1(jd1 jd1Var, wf wfVar) {
        this.OooO00o = jd1Var;
        this.OooO0O0 = wfVar;
    }

    public final void OooO00o() {
        jd1 jd1Var = this.OooO00o;
        if (jd1Var.OooO0o().OooO0o != xl0.OooO0o0) {
            qa.OooO0o("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.OooO0o0) {
                qa.OooO0o("SavedStateRegistry was already attached.");
                return;
            }
            this.OooO0O0.OooO00o();
            jd1Var.OooO0o().OooO0OO(new cm0() { // from class: com.cmaster.cloner.hd1
                @Override // com.cmaster.cloner.cm0
                public final void OooO0o(hm0 hm0Var, wl0 wl0Var) {
                    wl0 wl0Var2 = wl0.ON_START;
                    id1 id1Var = this.OooO0Oo;
                    if (wl0Var == wl0Var2) {
                        id1Var.OooO0oo = true;
                    } else if (wl0Var == wl0.ON_STOP) {
                        id1Var.OooO0oo = false;
                    }
                }
            });
            this.OooO0o0 = true;
        }
    }
}
