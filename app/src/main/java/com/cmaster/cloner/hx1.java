package com.cmaster.cloner;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.Context;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class hx1 extends df0 {
    public static final oO00OOOo OooOO0;
    public gx1 OooO;
    public final HashMap OooO0o;
    public Context OooO0o0;
    public int OooO0oO;
    public JobScheduler OooO0oo;

    static {
        DexUtils.classesInit0(85);
        u7.OooO00o(new byte[]{57, 127, 81}, new byte[]{83, 16, 51, 31, 0, 60, -45, 39});
        OooOO0 = new oO00OOOo(17);
    }

    public hx1() {
        attachInterface(this, u7.OooO00o(new byte[]{-22, -22, -122, -81, -30, 73, -106, -73, -3, -32, -103, -81, -30, 72, -104, -86, -20, -9, -59, -49, -52, 104, -66, -105, -63, -41, -67, -61, -52, 111, -74, -120, -63}, new byte[]{-119, -123, -21, -127, -127, 36, -9, -60}));
        this.OooO0o = new HashMap();
        this.OooO0oO = 10000;
    }

    public static native hx1 o0000o0O();

    public static native String o00O000(int i, String str);

    public static native String o00O0000(int i, String str, String str2);

    @Override // com.cmaster.cloner.ef0
    public final native HashMap OooO00o(String str, int i, String str2, boolean z);

    @Override // com.cmaster.cloner.ef0
    public final native int OooOOo0(String str, JobInfo jobInfo, String str2, int i, JobWorkItem jobWorkItem);

    @Override // com.cmaster.cloner.ef0
    public final native int Oooo0o(int i, int i2, String str, String str2);

    @Override // com.cmaster.cloner.ef0
    public final native int OoooOo0(String str, JobInfo jobInfo, String str2, int i);

    public final native JobScheduler o00(String str);

    @Override // com.cmaster.cloner.ef0
    public final native void o0000O0(int i, String str, String str2);

    @Override // com.cmaster.cloner.ef0
    public final native JobInfo o0000oo(int i, int i2, String str, String str2);

    public final native ex1 o000oooo(String str, JobInfo jobInfo, String str2, int i);

    public final native Set o00oOoo(int i, String str, String str2);

    @Override // com.cmaster.cloner.ef0
    public final native int o0O0O00(int i, int i2, String str, String str2);

    public final native ex1 o0O0ooO(int i);
}
