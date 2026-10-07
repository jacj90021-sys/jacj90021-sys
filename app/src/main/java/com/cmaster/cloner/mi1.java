package com.cmaster.cloner;

import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mi1 implements vh1 {
    public final /* synthetic */ int OooO00o;

    public mi1(Class cls) throws NoSuchMethodException, SecurityException {
        this.OooO00o = 0;
        cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE).getClass();
        cls.getMethod("setHostname", String.class);
        cls.getMethod("getAlpnSelectedProtocol", null);
        cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // com.cmaster.cloner.vh1
    public final boolean OooO00o() {
        switch (this.OooO00o) {
            case 0:
                boolean z = oO0O0O00.OooO0O0;
                return oO0O0O00.OooO0O0;
            case 1:
                z21 z21Var = z21.OooO00o;
                return Build.VERSION.SDK_INT >= 29;
            default:
                return true;
        }
    }

    public /* synthetic */ mi1(int i) {
        this.OooO00o = i;
    }
}
