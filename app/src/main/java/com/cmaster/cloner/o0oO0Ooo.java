package com.cmaster.cloner;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0oO0Ooo implements Application.ActivityLifecycleCallbacks {
    public Object OooO0Oo;
    public final int OooO0o;
    public Activity OooO0o0;
    public boolean OooO0oO = false;
    public boolean OooO0oo = false;
    public boolean OooO = false;

    public o0oO0Ooo(Activity activity) {
        this.OooO0o0 = activity;
        this.OooO0o = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.OooO0o0 == activity) {
            this.OooO0o0 = null;
            this.OooO0oo = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.OooO0oo || this.OooO || this.OooO0oO) {
            return;
        }
        Object obj = this.OooO0Oo;
        try {
            Object obj2 = o0O00o00.OooO0OO.get(activity);
            if (obj2 == obj && activity.hashCode() == this.OooO0o) {
                o0O00o00.OooO0oO.postAtFrontOfQueue(new pi2(o0O00o00.OooO0O0.get(activity), obj2, 5));
                this.OooO = true;
                this.OooO0Oo = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.OooO0o0 == activity) {
            this.OooO0oO = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
