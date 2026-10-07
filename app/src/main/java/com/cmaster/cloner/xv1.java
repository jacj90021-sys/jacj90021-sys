package com.cmaster.cloner;

import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class xv1 implements Runnable {
    public final /* synthetic */ Bundle OooO;
    public final /* synthetic */ yv1 OooO0Oo;
    public final /* synthetic */ String OooO0o;
    public final /* synthetic */ int OooO0o0;
    public final /* synthetic */ String OooO0oO;
    public final /* synthetic */ String[] OooO0oo;

    static {
        DexUtils.classesInit0(18);
    }

    public /* synthetic */ xv1(yv1 yv1Var, int i, String str, String str2, String[] strArr, Bundle bundle) {
        this.OooO0Oo = yv1Var;
        this.OooO0o0 = i;
        this.OooO0o = str;
        this.OooO0oO = str2;
        this.OooO0oo = strArr;
        this.OooO = bundle;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
