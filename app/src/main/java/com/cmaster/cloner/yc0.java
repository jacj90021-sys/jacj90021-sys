package com.cmaster.cloner;

import android.os.WorkSource;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yc0 extends ef1 {
    static {
        u7.OooO00o(new byte[]{-63, -20, 83, 63, -40, -104, 96, -110, -49, -15, 25, 4, -25, -98, 115, -39, -46, -49, 86, 35, -42, -106, 97, -50}, new byte[]{-96, -126, 55, 77, -73, -15, 4, -68});
    }

    public yc0() {
        super(u7.OooO00o(new byte[]{-84, 41, -34, -83, -117, -24, 115, -92, -94, 52, -108, -106, -76, -18, 96, -17, -65, 10, -37, -79, -123, -26, 114, -8}, new byte[]{-51, 71, -70, -33, -28, -127, 23, -118}));
    }

    @Override // com.cmaster.cloner.x7, com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        WorkSource workSource;
        t43.OooO0Oo(yqVar.OooO0o, true);
        int iOooO0Oo = yqVar.OooO0Oo(WorkSource.class);
        if (iOooO0Oo < 0 || (workSource = (WorkSource) yqVar.OooO0o[iOooO0Oo]) == null) {
            return;
        }
        workSource.clear();
    }

    @Override // com.cmaster.cloner.i80
    public final boolean OooO0OO() {
        return true;
    }
}
