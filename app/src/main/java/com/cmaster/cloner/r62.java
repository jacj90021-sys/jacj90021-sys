package com.cmaster.cloner;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r62 implements Application.ActivityLifecycleCallbacks {
    public final Activity OooO0Oo;
    public final /* synthetic */ q72 OooO0o0;

    public r62(q72 q72Var, Activity activity) {
        this.OooO0o0 = q72Var;
        this.OooO0Oo = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        q72 q72Var = this.OooO0o0;
        Dialog dialog = q72Var.OooO0o;
        AtomicReference atomicReference = q72Var.OooOO0O;
        if (dialog == null || !q72Var.OooOO0o) {
            return;
        }
        dialog.setOwnerActivity(activity);
        qa2 qa2Var = q72Var.OooO0O0;
        if (qa2Var != null) {
            qa2Var.OooO00o = activity;
        }
        r62 r62Var = (r62) atomicReference.getAndSet(null);
        if (r62Var != null) {
            r62Var.OooO0o0.OooO00o.unregisterActivityLifecycleCallbacks(r62Var);
            r62 r62Var2 = new r62(q72Var, activity);
            q72Var.OooO00o.registerActivityLifecycleCallbacks(r62Var2);
            atomicReference.set(r62Var2);
        }
        Dialog dialog2 = q72Var.OooO0o;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.OooO0Oo) {
            return;
        }
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        q72 q72Var = this.OooO0o0;
        if (zIsChangingConfigurations && q72Var.OooOO0o && (dialog = q72Var.OooO0o) != null) {
            dialog.dismiss();
            return;
        }
        hm2 hm2Var = new hm2(3, "Activity is destroyed.");
        Dialog dialog2 = q72Var.OooO0o;
        if (dialog2 != null) {
            dialog2.dismiss();
            q72Var.OooO0o = null;
        }
        q72Var.OooO0O0.OooO00o = null;
        r62 r62Var = (r62) q72Var.OooOO0O.getAndSet(null);
        if (r62Var != null) {
            r62Var.OooO0o0.OooO00o.unregisterActivityLifecycleCallbacks(r62Var);
        }
        oO0o0o oo0o0o = (oO0o0o) q72Var.OooOO0.getAndSet(null);
        if (oo0o0o == null) {
            return;
        }
        oo0o0o.OooO00o(hm2Var.OooO00o());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
