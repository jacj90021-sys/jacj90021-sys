package com.cmaster.cloner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.cmaster.cloner.ui.HomeActivity;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a2 extends fh1 {
    public static final a2 OooO0oO = new a2();
    public boolean OooO0Oo;
    public boolean OooO0o;
    public boolean OooO0o0;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity instanceof HomeActivity) {
            if (!this.OooO0o) {
                int i = 1;
                cr0 cr0VarOooO0O0 = dr0.OooO00o().OooO0O0(1, (er0) kn2.OooO00o.OooO0o0);
                if (this.OooO0o0 && this.OooO0Oo && !i81.OooO0oo.OooO0O0() && System.currentTimeMillis() - kn2.OooO0O0 > 30000) {
                    View decorView = activity.getWindow().getDecorView();
                    m1 m1Var = (m1) activity;
                    oOO0OO0O ooo0oo0o = new oOO0OO0O(i);
                    eb1 eb1Var = cr0VarOooO0O0.OooO0O0;
                    h1.OooO00o();
                    if (cr0VarOooO0O0.OooO0o == 3) {
                        eb1Var.OooOOO(m1Var, ooo0oo0o);
                    } else if (cr0VarOooO0O0.OooO0OO()) {
                        cr0VarOooO0O0.OooO0oO(decorView);
                        eb1Var.OooOOO(m1Var, ooo0oo0o);
                    } else {
                        cr0VarOooO0O0.OooO0o();
                        eb1.OooOOOo(m1Var, ooo0oo0o, wa1.OooO00o(-1, new o0O0O0Oo("ad is loading", 1), null));
                    }
                }
            }
            this.OooO0Oo = false;
            this.OooO0o0 = false;
            this.OooO0o = false;
        }
    }

    @Override // com.cmaster.cloner.fh1, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.OooO0Oo = j1.OooO00o.size() == 1 && (activity instanceof HomeActivity);
    }

    @Override // com.cmaster.cloner.fh1, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.OooO0o0 = ((Activity) j1.OooO0O0.OooO0Oo()) == null && (activity instanceof HomeActivity);
    }
}
