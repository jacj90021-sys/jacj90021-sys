package com.cmaster.cloner;

import android.os.RemoteException;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ma0 extends ef1 {
    public static final HashSet OooOO0O;

    static {
        u7.OooO00o(new byte[]{-8, 54, -127, 70, 64, 59, -29, 114, -9, 61, -111, 26, 102, 17, -24, 50, -9, 61, -122, 64, 70, 36, -18, 40, -32, 21, -124, 90, 78, 53, -30, 46}, new byte[]{-103, 88, -27, 52, 47, 82, -121, 92});
        OooOO0O = new HashSet();
    }

    public ma0() {
        super(u7.OooO00o(new byte[]{124, 114, -104, 64, -38, 21, 108, 86, 115, 121, -120, 28, -4, 63, 103, 22, 115, 121, -97, 70, -36, 10, 97, 12, 100, 81, -99, 92, -44, 27, 109, 10}, new byte[]{29, 28, -4, 50, -75, 124, 8, 120}));
    }

    @Override // com.cmaster.cloner.x7, com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        t43.OooO0Oo(yqVar.OooO0o, true);
    }

    @Override // com.cmaster.cloner.i80
    public final boolean OooO0OO() {
        return true;
    }

    @Override // com.cmaster.cloner.i80
    public final void OooO0Oo() {
        int iO0000OO0;
        OooO0O0(u7.OooO00o(new byte[]{5, 46, 8, -108, -96, 15, 93, -9, 5, 51, 59, -94, -95, 23, 72, -22, 30, 41, 57, -107}, new byte[]{108, 93, 92, -15, -44, 103, 56, -123}), new nd0(Boolean.TRUE, 1));
        rx1 rx1Var = (rx1) rx1.OooO0o.OooO0O0();
        rx1Var.getClass();
        try {
            iO0000OO0 = rx1Var.OooO0Oo.o0000OO0();
        } catch (RemoteException unused) {
            iO0000OO0 = 0;
        }
        if ((iO0000OO0 & 1) != 0) {
            OooO0O0(u7.OooO00o(new byte[]{19, 109, 125, 80, 123, 122, 122, 10, 4, 124, 123, 74, 108, 98}, new byte[]{97, 8, 12, 37, 30, 9, 14, 68}), new i90(25));
            OooO0O0(u7.OooO00o(new byte[]{-119, 99, -38, 28, -57, 97, 96, -88, -98, 114, -63, 22, -44, 121, 87, -125, -118, 115, -45, 10, -46}, new byte[]{-5, 6, -74, 121, -90, 18, 5, -26}), new i90(24));
        }
    }
}
