package com.cmaster.cloner;

import android.app.job.IJobService;
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class o6 extends IJobService.Stub {
    public final WeakReference OooO0Oo;

    static {
        DexUtils.classesInit0(75);
    }

    public o6(p6 p6Var) {
        this.OooO0Oo = new WeakReference(p6Var);
    }

    public static native void o0000o0O(JobParameters jobParameters);

    public final native void getTransferredDownloadBytes(JobParameters jobParameters, JobWorkItem jobWorkItem);

    public final native void getTransferredUploadBytes(JobParameters jobParameters, JobWorkItem jobWorkItem);

    public final native void onNetworkChanged(JobParameters jobParameters);

    public final native void startJob(JobParameters jobParameters);

    public final native void stopJob(JobParameters jobParameters);
}
