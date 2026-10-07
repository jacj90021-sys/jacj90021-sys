package com.cmaster.cloner;

import android.content.IntentFilter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lh extends eb1 {
    public final IntentFilter OooOOo;
    public final g OooOOo0;

    public lh(String... strArr) {
        this.OooOOo0 = new g(this, 2);
        this.OooOOo = new IntentFilter();
        for (String str : strArr) {
            this.OooOOo.addAction(str);
        }
    }

    @Override // com.cmaster.cloner.gv0
    public final void OooO() {
        e2.OooO.OooO00o.unregisterReceiver(this.OooOOo0);
        OooOOOO();
    }

    @Override // com.cmaster.cloner.gv0
    public final void OooO0oo() {
        e2.OooO.OooO00o.registerReceiver(this.OooOOo0, this.OooOOo);
    }

    public lh() {
        this("android.intent.action.PACKAGE_REMOVED", "android.intent.action.PACKAGE_ADDED", "android.intent.action.PACKAGE_REPLACED");
        this.OooOOo.addDataScheme("package");
    }
}
