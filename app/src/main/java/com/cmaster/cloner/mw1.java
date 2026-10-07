package com.cmaster.cloner;

import android.content.Intent;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class mw1 implements Runnable {
    public final /* synthetic */ pw1 OooO0Oo;
    public final /* synthetic */ Intent OooO0o;
    public final /* synthetic */ List OooO0o0;
    public final /* synthetic */ int OooO0oO;

    public /* synthetic */ mw1(pw1 pw1Var, List list, Intent intent, int i) {
        this.OooO0Oo = pw1Var;
        this.OooO0o0 = list;
        this.OooO0o = intent;
        this.OooO0oO = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (String str : this.OooO0o0) {
            Intent intent = this.OooO0o;
            if (str == null) {
                str = intent.getPackage();
            }
            Intent intent2 = (Intent) intent.clone();
            String action = intent.getAction();
            if (action != null) {
                intent2.setAction(u61.OooO00o(this.OooO0oO, action, str));
                intent2.setPackage(null);
                this.OooO0Oo.OooO0o0.sendBroadcast(intent2);
            }
        }
    }
}
