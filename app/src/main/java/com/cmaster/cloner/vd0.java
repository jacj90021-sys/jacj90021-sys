package com.cmaster.cloner;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vd0 extends t2 {
    public final /* synthetic */ int OooO0O0 = 0;

    public /* synthetic */ vd0(boolean z) {
        super(z, 4);
    }

    @Override // com.cmaster.cloner.t2, com.cmaster.cloner.jo1
    public void OooO00o(yq yqVar) {
        Context context;
        switch (this.OooO0O0) {
            case 1:
                if (Build.VERSION.SDK_INT >= 31) {
                    if (qx1.OooO0o0() >= 31 && qx1.OooO0O0() < 31 && (context = e92.OooO00o) != null && context.checkCallingPermission(u7.OooO00o(new byte[]{-47, 118, 95, -42, -33, 28, -89, 105, -64, 125, 73, -55, -39, 6, -80, 46, -33, 118, 21, -10, -11, 52, -121, 24, -32, 80, 116, -22, -11, 42, -112, 19, -15, 76, 126}, new byte[]{-80, 24, 59, -92, -80, 117, -61, 71})) == -1) {
                        yqVar.OooO0oo(0);
                        break;
                    }
                } else {
                    Integer num = qx1.OooO00o;
                }
                super.OooO00o(yqVar);
                break;
            default:
                super.OooO00o(yqVar);
                break;
        }
    }

    public vd0(String str) {
        super(false, 4);
    }
}
