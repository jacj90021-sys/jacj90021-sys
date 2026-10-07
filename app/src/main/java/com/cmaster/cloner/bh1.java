package com.cmaster.cloner;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bh1 extends u50 {
    public final oO0Ooooo OooO0o;
    public final boolean OooO0o0;
    public final Bundle OooO0oO;
    public final Integer OooO0oo;

    public bh1(Context context, Looper looper, oO0Ooooo oo0ooooo, Bundle bundle, f60 f60Var, g60 g60Var) {
        super(context, looper, 44, oo0ooooo, f60Var, g60Var);
        this.OooO0o0 = true;
        this.OooO0o = oo0ooooo;
        this.OooO0oO = bundle;
        this.OooO0oo = (Integer) oo0ooooo.OooOO0;
    }

    @Override // com.cmaster.cloner.m6
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof j22 ? (j22) iInterfaceQueryLocalInterface : new j22(0, iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.cmaster.cloner.m6
    public final Bundle getGetServiceRequestExtraArgs() {
        oO0Ooooo oo0ooooo = this.OooO0o;
        boolean zEquals = getContext().getPackageName().equals((String) oo0ooooo.OooO0oO);
        Bundle bundle = this.OooO0oO;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) oo0ooooo.OooO0oO);
        }
        return bundle;
    }

    @Override // com.cmaster.cloner.m6, com.cmaster.cloner.oOO000
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.cmaster.cloner.m6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.cmaster.cloner.m6
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.cmaster.cloner.m6, com.cmaster.cloner.oOO000
    public final boolean requiresSignIn() {
        return this.OooO0o0;
    }
}
