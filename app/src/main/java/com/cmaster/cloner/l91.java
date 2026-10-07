package com.cmaster.cloner;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class l91 extends Fragment {
    public static final /* synthetic */ int OooO0o0 = 0;
    public o00OO000 OooO0Oo;

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static final class OooO00o implements Application.ActivityLifecycleCallbacks {
        public static final k91 Companion = new k91();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new OooO00o());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            int i = l91.OooO0o0;
            j91.OooO00o(activity, wl0.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = l91.OooO0o0;
            j91.OooO00o(activity, wl0.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = l91.OooO0o0;
            j91.OooO00o(activity, wl0.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = l91.OooO0o0;
            j91.OooO00o(activity, wl0.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = l91.OooO0o0;
            j91.OooO00o(activity, wl0.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = l91.OooO0o0;
            j91.OooO00o(activity, wl0.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    public final void OooO00o(wl0 wl0Var) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            j91.OooO00o(activity, wl0Var);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        OooO00o(wl0.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        OooO00o(wl0.ON_DESTROY);
        this.OooO0Oo = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        OooO00o(wl0.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        o00OO000 o00oo000 = this.OooO0Oo;
        if (o00oo000 != null) {
            ((z41) o00oo000.OooO0o0).OooO00o();
        }
        OooO00o(wl0.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        o00OO000 o00oo000 = this.OooO0Oo;
        if (o00oo000 != null) {
            z41 z41Var = (z41) o00oo000.OooO0o0;
            int i = z41Var.OooO0Oo + 1;
            z41Var.OooO0Oo = i;
            if (i == 1 && z41Var.OooO0oO) {
                z41Var.OooO.OooO(wl0.ON_START);
                z41Var.OooO0oO = false;
            }
        }
        OooO00o(wl0.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        OooO00o(wl0.ON_STOP);
    }
}
