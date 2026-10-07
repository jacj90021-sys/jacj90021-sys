package com.cmaster.cloner;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class m30 implements Application.ActivityLifecycleCallbacks {
    static {
        DexUtils.classesInit0(76);
    }

    public native boolean OooO00o(Activity activity);

    public native void OooO0O0(Activity activity, Intent intent);

    public native void OooO0OO(Activity activity, int i, int i2, Intent intent);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public native void onActivityDestroyed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public native void onActivityPaused(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public native void onActivityResumed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public native void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public native void onActivityStarted(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public native void onActivityStopped(Activity activity);
}
