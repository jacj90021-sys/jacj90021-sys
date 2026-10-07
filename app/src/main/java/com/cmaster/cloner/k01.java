package com.cmaster.cloner;

import android.content.Intent;
import android.content.pm.IPackageInstallObserver2;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class k01 extends IPackageInstallObserver2.Stub {
    public final /* synthetic */ ho0 OooO0Oo;

    static {
        DexUtils.classesInit0(52);
    }

    public k01(ho0 ho0Var) {
        this.OooO0Oo = ho0Var;
    }

    public final native void onPackageInstalled(String str, int i, String str2, Bundle bundle);

    public final native void onUserActionRequired(Intent intent);
}
