package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0O00OOO extends tl0 {
    public static final WeakHashMap OooOooO;
    public final ComponentName OooO;
    public final int OooO0o;
    public final ActivityInfo OooO0o0;
    public final String OooO0oO;
    public final Intent OooO0oo;
    public final String OooOO0;
    public final String OooOO0O;
    public final String OooOO0o;
    public dm1 OooOOO;
    public final String OooOOO0;
    public o0O00OOO OooOOOO;
    public final String OooOOOo;
    public final int OooOOo;
    public final String OooOOo0;
    public final int OooOOoo;
    public final int OooOo;
    public b51 OooOo0;
    public final Bundle OooOo00;
    public final b51 OooOo0O;
    public boolean OooOo0o;
    public final int OooOoO;
    public boolean OooOoO0;
    public IBinder OooOoOO;
    public final ArrayList OooOoo0 = new ArrayList();
    public final ConditionVariable OooOoo = new ConditionVariable();

    static {
        DexUtils.classesInit0(33);
        u7.OooO00o(new byte[]{42, 41}, new byte[]{107, 100, -55, -112, -54, -79, -58, -3});
        OooOooO = new WeakHashMap();
    }

    public o0O00OOO(b51 b51Var, int i, String str, Intent intent, String str2, ActivityInfo activityInfo, o0O00OOO o0o00ooo, String str3, String str4, int i2, int i3, Bundle bundle, int i4) {
        int i5;
        int i6;
        this.OooOo0O = b51Var;
        this.OooO0o0 = activityInfo;
        this.OooO0o = i;
        ox1.o0O0ooO().o00O00OO(i4, activityInfo.packageName);
        this.OooO0oO = str;
        this.OooOoO = i4;
        this.OooO0oo = intent;
        intent.getComponent().flattenToShortString();
        this.OooOO0 = str2;
        this.OooOOOO = o0o00ooo;
        this.OooOOOo = str3;
        this.OooOOo = i2;
        this.OooOOoo = i3;
        this.OooOOo0 = str4;
        this.OooOo00 = bundle;
        this.OooOo0o = false;
        this.OooOoO0 = false;
        String str5 = activityInfo.targetActivity;
        if (str5 == null || (str5.equals(intent.getComponent().getClassName()) && ((i6 = activityInfo.launchMode) == 0 || i6 == 1))) {
            this.OooO = intent.getComponent();
        } else {
            this.OooO = new ComponentName(activityInfo.packageName, activityInfo.targetActivity);
        }
        this.OooOOO0 = activityInfo.taskAffinity;
        int i7 = activityInfo.flags;
        if ((i7 & 1) == 0 || b51Var == null || !((i5 = activityInfo.applicationInfo.uid) == 1000 || i5 == b51Var.OooO0Oo.uid)) {
            this.OooOO0o = activityInfo.processName;
        } else {
            this.OooOO0o = b51Var.OooOO0O;
        }
        if ((i7 & 32) != 0) {
            intent.addFlags(8388608);
        }
        this.OooOO0O = activityInfo.applicationInfo.packageName;
        this.OooOo = activityInfo.launchMode;
    }

    public static native o0O00OOO OooO0oO(IBinder iBinder);

    public static native o0O00OOO OooO0oo(IBinder iBinder);

    public final native void OooO(dm1 dm1Var);

    @Override // com.cmaster.cloner.tl0
    public final native void OooO0OO(int i);

    public final native void OooO0Oo();

    public final native void OooO0o(int i, Intent intent);

    public final native void OooO0o0(Intent intent, String str);

    public final native String toString();
}
