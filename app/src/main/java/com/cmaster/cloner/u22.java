package com.cmaster.cloner;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u22 extends u50 {
    public final hm1 OooO0o0;

    public u22(Context context, Looper looper, oO0Ooooo oo0ooooo, hm1 hm1Var, s12 s12Var, s12 s12Var2) {
        super(context, looper, 270, oo0ooooo, s12Var, s12Var2);
        this.OooO0o0 = hm1Var;
    }

    @Override // com.cmaster.cloner.m6
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof p22 ? (p22) iInterfaceQueryLocalInterface : new p22(0, iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.cmaster.cloner.m6
    public final iz[] getApiFeatures() {
        return m92.OooO0O0;
    }

    @Override // com.cmaster.cloner.m6
    public final Bundle getGetServiceRequestExtraArgs() {
        hm1 hm1Var = this.OooO0o0;
        hm1Var.getClass();
        Bundle bundle = new Bundle();
        String str = hm1Var.OooO0O0;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.cmaster.cloner.m6, com.cmaster.cloner.oOO000
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.cmaster.cloner.m6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.cmaster.cloner.m6
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.cmaster.cloner.m6
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
