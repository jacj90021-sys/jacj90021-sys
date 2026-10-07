package com.cmaster.cloner;

import android.app.job.IJobService;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class lx extends rf1 {
    public ex1 OooO;
    public int OooO0Oo;
    public int OooO0o;
    public JobParameters OooO0o0;
    public String OooO0oO;
    public IBinder OooO0oo;
    public IJobService OooOO0;
    public mx OooOO0O;

    static {
        DexUtils.classesInit0(55);
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
