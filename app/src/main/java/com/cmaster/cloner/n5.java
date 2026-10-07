package com.cmaster.cloner;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n5 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final n5 OooO0oo = new n5();
    public final AtomicBoolean OooO0Oo = new AtomicBoolean();
    public final AtomicBoolean OooO0o0 = new AtomicBoolean();
    public final ArrayList OooO0o = new ArrayList();
    public boolean OooO0oO = false;

    public final void OooO00o(boolean z) {
        synchronized (OooO0oo) {
            try {
                ArrayList arrayList = this.OooO0o;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    xi1 xi1Var = ((r12) obj).OooO00o.OooOOOo;
                    xi1Var.sendMessage(xi1Var.obtainMessage(1, Boolean.valueOf(z)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.OooO0Oo.compareAndSet(true, false);
        this.OooO0o0.set(true);
        if (zCompareAndSet) {
            OooO00o(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.OooO0Oo.compareAndSet(true, false);
        this.OooO0o0.set(true);
        if (zCompareAndSet) {
            OooO00o(false);
        }
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

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.OooO0Oo.compareAndSet(false, true)) {
            this.OooO0o0.set(true);
            OooO00o(true);
        }
    }
}
