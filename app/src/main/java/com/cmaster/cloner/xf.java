package com.cmaster.cloner;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class xf implements gd1 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ oOOO00 OooO0O0;

    public /* synthetic */ xf(oOOO00 oooo00, int i) {
        this.OooO00o = i;
        this.OooO0O0 = oooo00;
    }

    @Override // com.cmaster.cloner.gd1
    public final Bundle OooO00o() {
        int i = this.OooO00o;
        oOOO00 oooo00 = this.OooO0O0;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                zf zfVar = oooo00.OooOOOO;
                zfVar.getClass();
                HashMap map = zfVar.OooO0O0;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(zfVar.OooO0Oo));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) zfVar.OooO0oO.clone());
                return bundle;
        }
        while (oOOO00.OooOOOO(oooo00.OooOOO())) {
        }
        oooo00.OooOo.OooO(wl0.ON_STOP);
        return new Bundle();
    }
}
