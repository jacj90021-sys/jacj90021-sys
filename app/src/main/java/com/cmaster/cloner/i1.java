package com.cmaster.cloner;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i1 extends fh1 {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        j1.OooO00o.add(0, activity);
    }

    @Override // com.cmaster.cloner.fh1, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        j1.OooO00o.remove(activity);
    }

    @Override // com.cmaster.cloner.fh1, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        gv0 gv0Var = j1.OooO0O0;
        if (gv0Var.OooO0Oo() == activity) {
            gv0Var.OooOO0o(null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        j1.OooO0O0.OooOO0o(activity);
    }
}
