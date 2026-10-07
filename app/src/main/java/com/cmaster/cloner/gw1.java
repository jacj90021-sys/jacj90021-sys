package com.cmaster.cloner;

import android.content.ComponentName;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class gw1 extends rf1 {
    public final /* synthetic */ hw1 OooO0Oo;

    static {
        DexUtils.classesInit0(69);
    }

    public gw1(hw1 hw1Var) {
        this.OooO0Oo = hw1Var;
    }

    @Override // com.cmaster.cloner.sf1
    public final native void onBindingDied(ComponentName componentName);

    @Override // com.cmaster.cloner.sf1
    public final native void onNullBinding(ComponentName componentName);

    @Override // com.cmaster.cloner.sf1
    public final native void onServiceConnected(ComponentName componentName, IBinder iBinder);

    @Override // com.cmaster.cloner.sf1
    public final native void onServiceDisconnected(ComponentName componentName);
}
