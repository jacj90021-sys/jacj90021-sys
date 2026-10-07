package com.cmaster.cloner;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y41 extends kv {
    final /* synthetic */ z41 this$0;

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static final class OooO00o extends kv {
        final /* synthetic */ z41 this$0;

        public OooO00o(z41 z41Var) {
            this.this$0 = z41Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.OooO00o();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            z41 z41Var = this.this$0;
            int i = z41Var.OooO0Oo + 1;
            z41Var.OooO0Oo = i;
            if (i == 1 && z41Var.OooO0oO) {
                z41Var.OooO.OooO(wl0.ON_START);
                z41Var.OooO0oO = false;
            }
        }
    }

    public y41(z41 z41Var) {
        this.this$0 = z41Var;
    }

    @Override // com.cmaster.cloner.kv, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = l91.OooO0o0;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((l91) fragmentFindFragmentByTag).OooO0Oo = this.this$0.OooOO0O;
        }
    }

    @Override // com.cmaster.cloner.kv, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        z41 z41Var = this.this$0;
        int i = z41Var.OooO0o0 - 1;
        z41Var.OooO0o0 = i;
        if (i == 0) {
            Handler handler = z41Var.OooO0oo;
            handler.getClass();
            handler.postDelayed(z41Var.OooOO0, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        b2.OooO0oO(activity, new OooO00o(this.this$0));
    }

    @Override // com.cmaster.cloner.kv, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        z41 z41Var = this.this$0;
        int i = z41Var.OooO0Oo - 1;
        z41Var.OooO0Oo = i;
        if (i == 0 && z41Var.OooO0o) {
            z41Var.OooO.OooO(wl0.ON_STOP);
            z41Var.OooO0oO = true;
        }
    }
}
