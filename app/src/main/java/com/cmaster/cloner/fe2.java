package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fe2 extends u50 {
    @Override // com.cmaster.cloner.m6
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof gm2 ? (gm2) iInterfaceQueryLocalInterface : new gm2(iBinder);
    }

    @Override // com.cmaster.cloner.m6
    public final iz[] getApiFeatures() {
        return od2.OooO0OO;
    }

    @Override // com.cmaster.cloner.m6, com.cmaster.cloner.oOO000
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // com.cmaster.cloner.m6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.cmaster.cloner.m6
    public final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.cmaster.cloner.m6
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.cmaster.cloner.m6
    public final boolean usesClientTelemetry() {
        return true;
    }
}
