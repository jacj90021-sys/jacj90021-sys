package com.cmaster.cloner;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class dm1 extends tl0 {
    public ComponentName OooO;
    public int OooO0o;
    public final o0O0o00O OooO0o0;
    public String OooO0oO;
    public Intent OooO0oo;
    public ComponentName OooOO0;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public int OooOOO0;
    public final ArrayList OooOOOO;
    public dm1 OooOOo;
    public dm1 OooOOoo;
    public final ConditionVariable OooOo0;
    public ActivityManager.AppTask OooOo00;
    public final ActivityManager.TaskDescription OooOOO = new ActivityManager.TaskDescription();
    public boolean OooOOOo = true;
    public boolean OooOOo0 = false;

    static {
        DexUtils.classesInit0(30);
    }

    public dm1(o0O0o00O o0o0o00o, ActivityInfo activityInfo, Intent intent, int i) {
        this.OooO0o = -1;
        new LinkedList();
        this.OooOo0 = new ConditionVariable();
        this.OooO0o0 = o0o0o00o;
        this.OooO0o = -1;
        this.OooOOOO = new ArrayList();
        int i2 = activityInfo.applicationInfo.uid;
        OooOO0O(intent, activityInfo);
        this.OooOOO0 = i;
    }

    public final native o0O00OOO OooO(o0O00OOO o0o00ooo, int i);

    public final native int OooO0Oo();

    public final native void OooO0o();

    public final native void OooO0o0();

    public final native o0O00OOO OooO0oO();

    public final native boolean OooO0oo();

    public final native void OooOO0(o0O00OOO o0o00ooo);

    public final native void OooOO0O(Intent intent, ActivityInfo activityInfo);

    public final native void OooOO0o(o0O00OOO o0o00ooo);

    public final native void OooOOO0();

    public final native String toString();
}
