package com.cmaster.cloner;

import android.app.job.JobParameters;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class p6 {
    public static final String OooO0OO;
    public final o6 OooO00o = new o6(this);
    public final oOo00o0o OooO0O0 = new oOo00o0o(this, Looper.getMainLooper(), 1);

    static {
        DexUtils.classesInit0(9);
        OooO0OO = u7.OooO00o(new byte[]{-103, 3, 100}, new byte[]{-13, 108, 6, -7, 13, -71, -124, 127});
    }

    public final native void OooO00o(JobParameters jobParameters, boolean z);
}
