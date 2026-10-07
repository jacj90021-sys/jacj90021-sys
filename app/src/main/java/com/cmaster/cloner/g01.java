package com.cmaster.cloner;

import android.content.Intent;
import android.content.pm.IPackageDeleteObserver2;

/* loaded from: classes.dex */
public final class g01 extends IPackageDeleteObserver2.Stub {
    public final /* synthetic */ hx2 OooO0Oo;

    static {
        DexUtils.classesInit0(48);
    }

    public g01(hx2 hx2Var) {
        this.OooO0Oo = hx2Var;
    }

    public final native void onPackageDeleted(String str, int i, String str2);

    public final native void onUserActionRequired(Intent intent);
}
