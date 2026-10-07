package com.cmaster.cloner;

import android.content.ComponentName;
import android.os.Binder;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class oO00Oo0 extends Binder implements IBinder.DeathRecipient {
    public final String OooO0Oo;
    public final String OooO0o0;
    public final ComponentName OooO0oO;
    public final int OooOO0;
    public volatile w90 OooOO0O;
    public final oO00Oo00 OooOOO;
    public b51 OooOOO0;
    public int OooO0oo = -1;
    public final ConditionVariable OooO = new ConditionVariable();
    public volatile int OooOO0o = 0;
    public final oO00OOO OooO0o = new oO00OOO(this);

    public oO00Oo0(oO00Oo00 oo00oo00, int i, String str, String str2, ComponentName componentName) {
        this.OooOOO = oo00oo00;
        this.OooO0Oo = str;
        this.OooO0o0 = str2;
        this.OooO0oO = componentName;
        this.OooOO0 = i;
    }

    public final native void OooO00o(int i, IBinder iBinder, String str);

    @Override // android.os.IBinder.DeathRecipient
    public final native void binderDied();

    static {
        DexUtils.classesInit0(88);
        new ze1(1);
        new Handler(cx1.OooO0OO.getLooper());
    }
}
