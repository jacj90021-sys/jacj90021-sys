package com.cmaster.cloner;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final /* synthetic */ class nx1 implements Runnable {
    public final /* synthetic */ ox1 OooO0Oo;
    public final /* synthetic */ int OooO0o;
    public final /* synthetic */ ComponentName OooO0o0;
    public final /* synthetic */ int OooO0oO;

    static {
        DexUtils.classesInit0(49);
    }

    public /* synthetic */ nx1(ox1 ox1Var, ComponentName componentName, int i, int i2) {
        this.OooO0Oo = ox1Var;
        this.OooO0o0 = componentName;
        this.OooO0o = i;
        this.OooO0oO = i2;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
