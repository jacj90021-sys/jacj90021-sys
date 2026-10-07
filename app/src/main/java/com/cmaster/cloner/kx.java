package com.cmaster.cloner;

import android.app.Notification;
import android.app.job.IJobCallback;
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;

/* loaded from: classes.dex */
public final class kx extends IJobCallback.Stub {
    public final IJobCallback OooO0Oo;
    public final lx OooO0o;
    public final int OooO0o0;
    public final JobParameters OooO0oO;
    public final /* synthetic */ mx OooO0oo;

    static {
        DexUtils.classesInit0(35);
    }

    public kx(mx mxVar, int i, JobParameters jobParameters, IJobCallback iJobCallback, lx lxVar) {
        this.OooO0oo = mxVar;
        this.OooO0o0 = i;
        this.OooO0Oo = iJobCallback;
        this.OooO0o = lxVar;
        this.OooO0oO = jobParameters;
    }

    public final native void acknowledgeGetTransferredDownloadBytesMessage(int i, int i2, long j);

    public final native void acknowledgeGetTransferredUploadBytesMessage(int i, int i2, long j);

    public final native void acknowledgeStartMessage(int i, boolean z);

    public final native void acknowledgeStopMessage(int i, boolean z);

    public final native boolean completeWork(int i, int i2);

    public final native JobWorkItem dequeueWork(int i);

    public final native void handleAbandonedJob(int i);

    public final native void jobFinished(int i, boolean z);

    public final native void setNotification(int i, int i2, Notification notification, int i3);

    public final native void updateEstimatedNetworkBytes(int i, JobWorkItem jobWorkItem, long j, long j2);

    public final native void updateTransferredNetworkBytes(int i, JobWorkItem jobWorkItem, long j, long j2);
}
