package com.cmaster.cloner;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class de0 extends ef1 {
    static {
        u7.OooO00o(new byte[]{-61, -36, -91, -102, 57, 89, -125, -45, -49, -38, -84, -102, 49, 89, -109, -60, -46, -35, -87, -40, 118, 67, -126, -51, -59, -48, -89, -39, 118, 126, -77, -60, -52, -42, -85, -37, 53, 100, -126, -45, -42, -38, -85, -47}, new byte[]{-96, -77, -56, -76, 88, 55, -25, -95});
    }

    public de0() {
        super(u7.OooO00o(new byte[]{85, 71, -9, 13, 94, -39, -128, -117, 89, 65, -2, 13, 86, -39, -112, -100, 68, 70, -5, 79, 17, -61, -127, -107, 83, 75, -11, 78, 17, -2, -80, -100, 90, 77, -7, 76, 82, -28, -127, -117, 64, 65, -7, 70}, new byte[]{54, 40, -102, 35, 63, -73, -28, -7}));
    }

    @Override // com.cmaster.cloner.x7, com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        t43.OooO0Oo(yqVar.OooO0o, true);
        if ((!i21.OooO0OO(qx1.OooO00o()) && (Build.VERSION.SDK_INT < 31 || qx1.OooO0O0() < 28)) || yqVar.OooO00o()) {
            return;
        }
        t43.OooO0OO(yqVar);
    }

    @Override // com.cmaster.cloner.i80
    public final boolean OooO0OO() {
        return true;
    }

    @Override // com.cmaster.cloner.i80
    public final void OooO0Oo() {
        OooO0O0(u7.OooO00o(new byte[]{9, 43, 87, -98, -115, 64, -123, 16, 43, 38, 95, -103, -101, 117, -125, 1, 20, 59, 94, -125}, new byte[]{123, 78, 48, -9, -2, 52, -32, 98}), new nd0(new ArrayList(0), 1));
        OooO0O0(u7.OooO00o(new byte[]{-101, 10, -100, 35, -33, -45, 101, -114, -120, 14, -100, 5, -21, -52, 96, -77, -101, 63, -119, 3, -43, -34, 110, -72}, new byte[]{-4, 111, -24, 96, -66, -65, 9, -35}), new wd0(2));
        OooO0O0(u7.OooO00o(new byte[]{22, 71, -34, -107, -19, -54, 121, 115, 30, 76, -49, -107, -30, -59, 70, 110, 31, 86, -30, -75, -17, -62, 69, 126, 2}, new byte[]{113, 34, -86, -44, -127, -90, 41, 27}), new wd0(1));
    }
}
