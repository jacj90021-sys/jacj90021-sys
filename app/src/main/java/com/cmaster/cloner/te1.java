package com.cmaster.cloner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class te1 extends m30 {
    public final /* synthetic */ int OooO0Oo;

    static {
        DexUtils.classesInit0(42);
    }

    private final native void OooO0Oo(Activity activity);

    private final native void OooO0o0(Activity activity);

    @Override // com.cmaster.cloner.m30
    public final native boolean OooO00o(Activity activity);

    @Override // com.cmaster.cloner.m30
    public native void OooO0O0(Activity activity, Intent intent);

    @Override // com.cmaster.cloner.m30
    public native void OooO0OO(Activity activity, int i, int i2, Intent intent);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityCreated(Activity activity, Bundle bundle);

    @Override // com.cmaster.cloner.m30, android.app.Application.ActivityLifecycleCallbacks
    public native void onActivityDestroyed(Activity activity);

    @Override // com.cmaster.cloner.m30, android.app.Application.ActivityLifecycleCallbacks
    public native void onActivityResumed(Activity activity);
}
