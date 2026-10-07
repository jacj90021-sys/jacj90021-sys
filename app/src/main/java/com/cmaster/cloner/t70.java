package com.cmaster.cloner;

import android.content.Intent;
import com.cmaster.cloner.ui.HomeActivity;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t70 implements iy0 {
    public final /* synthetic */ yu1 OooO0Oo;
    public final /* synthetic */ HomeActivity OooO0o;
    public final /* synthetic */ Intent OooO0o0;

    public t70(HomeActivity homeActivity, yu1 yu1Var, Intent intent) {
        this.OooO0o = homeActivity;
        this.OooO0Oo = yu1Var;
        this.OooO0o0 = intent;
    }

    @Override // com.cmaster.cloner.iy0
    public final void OooO00o(Object obj) {
        Boolean bool = (Boolean) obj;
        a2.OooO0oO.OooO0o = true;
        if (bool == Boolean.FALSE) {
            this.OooO0Oo.OooO0o.OooOO0O(this);
            String str = hz.OooO0Oo;
            Intent intent = this.OooO0o0;
            if (str.equals(intent.getAction())) {
                hv1.OooO0OO.OooO00o(this.OooO0o, intent.getStringExtra(sn2.OooO00o("dLEiIeQq4ll8sTI25TeoEm2rNDKlE8c0Xp4BFtQNxzpQ\n", "Fd9GU4tDhnc=\n")), intent.getIntExtra(sn2.OooO00o("0VDNDEh+zJ/ZUN0bSWOG1MhK2x8JQvv04g==\n", "sD6pficXqLE=\n"), -1));
            }
        }
    }
}
