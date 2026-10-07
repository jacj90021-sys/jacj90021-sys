package com.cmaster.cloner;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class yf implements az0 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ oOOO00 OooO0O0;

    public /* synthetic */ yf(oOOO00 oooo00, int i) {
        this.OooO00o = i;
        this.OooO0O0 = oooo00;
    }

    @Override // com.cmaster.cloner.az0
    public final void OooO00o() {
        int i = this.OooO00o;
        oOOO00 oooo00 = this.OooO0O0;
        switch (i) {
            case 0:
                Bundle bundleOooO0o = ((o0O000O) oooo00.OooO0oo.OooO0o).OooO0o("android:support:activity-result");
                if (bundleOooO0o != null) {
                    zf zfVar = oooo00.OooOOOO;
                    HashMap map = zfVar.OooO0O0;
                    HashMap map2 = zfVar.OooO00o;
                    Bundle bundle = zfVar.OooO0oO;
                    ArrayList<Integer> integerArrayList = bundleOooO0o.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleOooO0o.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        zfVar.OooO0Oo = bundleOooO0o.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bundle.putAll(bundleOooO0o.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                            String str = stringArrayList.get(i2);
                            if (map.containsKey(str)) {
                                Integer num = (Integer) map.remove(str);
                                if (!bundle.containsKey(str)) {
                                    map2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            map2.put(num2, str2);
                            zfVar.OooO0O0.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                q10 q10Var = (q10) oooo00.OooOo0o.OooO0o0;
                q10Var.OooO0oO.OooO0O0(q10Var, q10Var, null);
                break;
        }
    }
}
