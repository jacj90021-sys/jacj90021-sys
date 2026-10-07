package com.cmaster.cloner;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0O0O0o0 {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ o0O0O0o0(int i) {
        this.OooO00o = i;
    }

    public final Object OooO00o(int i, Intent intent) {
        switch (this.OooO00o) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    break;
                }
                break;
            case 1:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayListOooO0o0 = o3.OooO0o0(stringArrayExtra);
                        Iterator it = arrayListOooO0o0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(arrayListOooO0o0.size(), arrayList.size()));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new k21(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
        }
        return new o0oO0O0o(i, intent);
    }
}
