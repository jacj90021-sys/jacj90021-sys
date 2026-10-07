package com.cmaster.cloner;

import android.app.Notification;
import android.app.job.IJobCallback;
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.DialogInterface;
import android.content.pm.IPackageInstallerCallback;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.preference.PreferenceScreen;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.function.IntPredicate;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOo00o0o extends Handler {
    public static final /* synthetic */ int OooO0OO = 0;
    public final /* synthetic */ int OooO00o;
    public Object OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00o0o(Looper looper) {
        super(looper);
        this.OooO00o = 2;
        this.OooO0O0 = new RemoteCallbackList();
    }

    public static void OooO00o(JobParameters jobParameters, JobWorkItem jobWorkItem) {
        IJobCallback iJobCallbackAsInterface = IJobCallback.Stub.asInterface(hk0.OooO00o(jobParameters));
        int jobId = jobParameters.getJobId();
        int iOooO00o = jobWorkItem == null ? -1 : ok0.OooO00o.OooO00o(jobWorkItem);
        if (iJobCallbackAsInterface != null) {
            try {
                iJobCallbackAsInterface.acknowledgeGetTransferredDownloadBytesMessage(jobId, iOooO00o, 0L);
                return;
            } catch (RemoteException unused) {
                u7.OooO00o(new byte[]{-38, 121, 90}, new byte[]{-80, 22, 56, 30, -85, 31, 46, 104});
                u7.OooO00o(new byte[]{-115, 62, 120, 95, -59, 51, -25, 109, -80, 53, 110, 74, -61, 54, -90, 122, -78, 34, 43, 77, -49, 44, -25, 106, -69, 51, 126, 89, -50, 55, -87, 127, -2, 55, 121, 68, -57, 44, -94, 107, -83, 105}, new byte[]{-34, 71, 11, 43, -96, 94, -57, 24});
                int i = fp0.OooO00o;
                return;
            }
        }
        if (Log.isLoggable(u7.OooO00o(new byte[]{-32, -107, -21}, new byte[]{-118, -6, -119, 56, -94, 64, -78, 71}), 3)) {
            u7.OooO00o(new byte[]{-68, -114, -111}, new byte[]{-42, -31, -13, -11, -64, -92, -74, 11});
            u7.OooO00o(new byte[]{14, -68, -61, 21, -43, -14, 113, -77, 33, -81, -105, 4, -41, -94, 100, -71, 36, -24, -42, 80, -46, -19, 103, -6, 59, -96, -42, 4, -104, -22, 100, -87, 111, -87, -37, 2, -35, -29, 97, -93, 111, -86, -46, 21, -42, -94, 117, -88, 32, -85, -46, 3, -53, -25, 97, -12}, new byte[]{79, -56, -73, 112, -72, -126, 5, -38});
            int i2 = fp0.OooO00o;
        }
    }

    public static void OooO0O0(JobParameters jobParameters, JobWorkItem jobWorkItem) {
        IJobCallback iJobCallbackAsInterface = IJobCallback.Stub.asInterface(hk0.OooO00o(jobParameters));
        int jobId = jobParameters.getJobId();
        int iOooO00o = jobWorkItem == null ? -1 : ok0.OooO00o.OooO00o(jobWorkItem);
        if (iJobCallbackAsInterface != null) {
            try {
                iJobCallbackAsInterface.acknowledgeGetTransferredUploadBytesMessage(jobId, iOooO00o, 0L);
                return;
            } catch (RemoteException unused) {
                u7.OooO00o(new byte[]{-93, 61, 43}, new byte[]{-55, 82, 73, 127, -88, 127, 31, 54});
                u7.OooO00o(new byte[]{22, 18, -20, 49, 21, 82, -22, 67, 43, 25, -6, 36, 19, 87, -85, 84, 41, 14, -65, 35, 31, 77, -22, 68, 32, 31, -22, 55, 30, 86, -92, 81, 101, 27, -19, 42, 23, 77, -81, 69, 54, 69}, new byte[]{69, 107, -97, 69, 112, 63, -54, 54});
                int i = fp0.OooO00o;
                return;
            }
        }
        if (Log.isLoggable(u7.OooO00o(new byte[]{-82, -62, -36}, new byte[]{-60, -83, -66, -100, 17, 111, -73, -124}), 3)) {
            u7.OooO00o(new byte[]{-76, -50, -109}, new byte[]{-34, -95, -15, 99, -73, 123, -100, 66});
            u7.OooO00o(new byte[]{-42, 91, -87, 106, 118, 76, -125, 117, -7, 72, -3, 123, 116, 28, -106, 127, -4, 15, -68, 47, 113, 83, -107, 60, -29, 71, -68, 123, 59, 84, -106, 111, -73, 78, -79, 125, 126, 93, -109, 101, -73, 77, -72, 106, 117, 28, -121, 110, -8, 76, -72, 124, 104, 89, -109, 50}, new byte[]{-105, 47, -35, 15, 27, 60, -9, 28});
            int i2 = fp0.OooO00o;
        }
    }

    public static void OooO0OO(JobParameters jobParameters, boolean z) {
        IJobCallback iJobCallbackAsInterface = IJobCallback.Stub.asInterface(hk0.OooO00o(jobParameters));
        int jobId = jobParameters.getJobId();
        if (iJobCallbackAsInterface != null) {
            try {
                iJobCallbackAsInterface.acknowledgeStartMessage(jobId, z);
                return;
            } catch (RemoteException unused) {
                u7.OooO00o(new byte[]{-43, 66, 27}, new byte[]{-65, 45, 121, -58, -103, 110, -110, -112});
                u7.OooO00o(new byte[]{95, 99, -94, -122, -88, 103, -23, 29, 98, 104, -76, -109, -82, 98, -88, 10, 96, 127, -15, -108, -94, 120, -23, 27, 120, 123, -93, -122, -92, 100, -82, 72, 102, 117, -77, -36}, new byte[]{12, 26, -47, -14, -51, 10, -55, 104});
                int i = fp0.OooO00o;
                return;
            }
        }
        if (Log.isLoggable(u7.OooO00o(new byte[]{-97, 40, -9}, new byte[]{-11, 71, -107, 110, -80, 101, 42, 29}), 3)) {
            u7.OooO00o(new byte[]{-68, -57, -55}, new byte[]{-42, -88, -85, -80, -87, 11, -76, 112});
            u7.OooO00o(new byte[]{-104, -51, -79, -62, -88, 19, 91, -22, -73, -34, -27, -45, -86, 67, 78, -32, -78, -103, -92, -121, -81, 12, 77, -93, -83, -47, -92, -45, -27, 11, 78, -16, -7, -40, -87, -43, -96, 2, 75, -6, -7, -37, -96, -62, -85, 67, 95, -15, -74, -38, -96, -44, -74, 6, 75, -83}, new byte[]{-39, -71, -59, -89, -59, 99, 47, -125});
            int i2 = fp0.OooO00o;
        }
    }

    public static void OooO0Oo(JobParameters jobParameters) {
        IJobCallback iJobCallbackAsInterface = IJobCallback.Stub.asInterface(hk0.OooO00o(jobParameters));
        int jobId = jobParameters.getJobId();
        if (iJobCallbackAsInterface != null) {
            try {
                iJobCallbackAsInterface.acknowledgeStopMessage(jobId, false);
                return;
            } catch (RemoteException unused) {
                u7.OooO00o(new byte[]{-96, -65, 70}, new byte[]{-54, -48, 36, 5, -49, -22, 82, 25});
                u7.OooO00o(new byte[]{-75, -54, -85, 99, 118, -116, -10, 5, -120, -63, -67, 118, 112, -119, -73, 18, -118, -42, -8, 113, 124, -109, -10, 3, -110, -36, -88, 103, 122, -113, -79, 80, -116, -36, -70, 57}, new byte[]{-26, -77, -40, 23, 19, -31, -42, 112});
                int i = fp0.OooO00o;
                return;
            }
        }
        if (Log.isLoggable(u7.OooO00o(new byte[]{-81, -24, 64}, new byte[]{-59, -121, 34, -39, 52, -58, 22, 93}), 3)) {
            u7.OooO00o(new byte[]{-65, -77, 12}, new byte[]{-43, -36, 110, -40, 46, 4, 20, 45});
            u7.OooO00o(new byte[]{90, -61, 108, -68, 45, 35, -47, -77, 117, -48, 56, -83, 47, 115, -60, -71, 112, -105, 121, -7, 42, 60, -57, -6, 111, -33, 121, -83, 96, 59, -60, -87, 59, -42, 116, -85, 37, 50, -63, -93, 59, -43, 125, -68, 46, 115, -43, -88, 116, -44, 125, -86, 51, 54, -63, -12}, new byte[]{27, -73, 24, -39, 64, 83, -91, -38});
            int i2 = fp0.OooO00o;
        }
    }

    public static void OooO0o(IPackageInstallerCallback iPackageInstallerCallback, Message message) {
        int i = message.arg1;
        int i2 = message.what;
        if (i2 == 1) {
            iPackageInstallerCallback.onSessionCreated(i);
            return;
        }
        if (i2 == 2) {
            iPackageInstallerCallback.onSessionBadgingChanged(i);
            return;
        }
        if (i2 == 3) {
            iPackageInstallerCallback.onSessionActiveChanged(i, ((Boolean) message.obj).booleanValue());
        } else if (i2 == 4) {
            iPackageInstallerCallback.onSessionProgressChanged(i, ((Float) message.obj).floatValue());
        } else {
            if (i2 != 5) {
                return;
            }
            iPackageInstallerCallback.onSessionFinished(i, ((Boolean) message.obj).booleanValue());
        }
    }

    private final void OooO0o0(Message message) {
        p6 p6Var = (p6) this.OooO0O0;
        switch (message.what) {
            case 0:
                JobParameters jobParameters = (JobParameters) message.obj;
                try {
                    mx mxVar = (mx) p6Var;
                    u7.OooO00o(new byte[]{-44, 12, 34}, new byte[]{-66, 99, 64, 60, 107, -79, 111, 21});
                    u7.OooO00o(new byte[]{50, -124, -110, 125, 31, -118, 95, -4, 50, -120, -5, 41}, new byte[]{93, -22, -63, 9, 126, -8, 43, -74});
                    Objects.toString(jobParameters);
                    int i = fp0.OooO00o;
                    lx lxVarOooO0O0 = mxVar.OooO0O0(jobParameters);
                    if (lxVarOooO0O0 != null && mxVar.OooO0OO(lxVarOooO0O0, jobParameters)) {
                        mx.OooO0o0.execute(new l1(mxVar, lxVarOooO0O0, jobParameters, 4));
                    } else {
                        z = false;
                    }
                    OooO0OO(jobParameters, z);
                    break;
                } catch (Exception e) {
                    u7.OooO00o(new byte[]{58, 60, -47}, new byte[]{80, 83, -77, 117, 33, -105, -25, 9});
                    u7.OooO00o(new byte[]{87, -9, -49, 81, -88, 66, -59, 38, 123, -23, -40, 30, -65, 26, -41, 45, 103, -15, -44, 80, -67, 66, -40, 33, 112, -65, -99}, new byte[]{18, -123, -67, 62, -38, 98, -78, 78});
                    jobParameters.getJobId();
                    int i2 = fp0.OooO00o;
                    sa.OooOO0(e);
                    return;
                }
            case 1:
                JobParameters jobParameters2 = (JobParameters) message.obj;
                try {
                    mx mxVar2 = (mx) p6Var;
                    lx lxVarOooO0O02 = mxVar2.OooO0O0(jobParameters2);
                    if (lxVarOooO0O02 != null && mxVar2.OooO0OO(lxVarOooO0O02, jobParameters2)) {
                        u7.OooO00o(new byte[]{-87, -87, -124}, new byte[]{-61, -58, -26, -1, -18, 52, 118, -80});
                        u7.OooO00o(new byte[]{-121, 82, 82, 82, 125, -3, -12, -107, -118, 6, 33}, new byte[]{-24, 60, 1, 38, 18, -115, -66, -6});
                        jobParameters2.toString();
                        int i3 = fp0.OooO00o;
                        mx.OooO0o0.execute(new pi2(lxVarOooO0O02, jobParameters2, 18));
                    }
                    OooO0Oo(jobParameters2);
                    break;
                } catch (Exception e2) {
                    u7.OooO00o(new byte[]{0, 50, -15}, new byte[]{106, 93, -109, -50, 50, -20, -108, -15});
                    u7.OooO00o(new byte[]{-79, -62, 13, -91, 3, 69, -48, -60, -103, -35, 19, -23, 31, 72, -48, -46, -100, -41, 93, -67, 5, 6, -39, -47, -98, -42, 17, -84, 74, 73, -33, -29, -124, -35, 13, -125, 5, 68, -97}, new byte[]{-16, -78, 125, -55, 106, 38, -79, -80});
                    int i4 = fp0.OooO00o;
                    sa.OooOO0(e2);
                    return;
                }
            case 2:
                JobParameters jobParameters3 = (JobParameters) message.obj;
                z = message.arg2 == 1;
                IJobCallback iJobCallbackAsInterface = IJobCallback.Stub.asInterface(hk0.OooO00o(jobParameters3));
                if (iJobCallbackAsInterface == null) {
                    u7.OooO00o(new byte[]{-5, -115, 114}, new byte[]{-111, -30, 16, -6, 97, -45, 45, -35});
                    u7.OooO00o(new byte[]{-89, -79, -24, -107, -97, -53, -2, -39, -93, -16, -81, -36, -113, -62, -40, -38, -92, -68, -90, -102, -125, -47, -108, -41, -31, -74, -23, -110, -119, -37, -35, -59, -75, -67, -24, -120, -52, -55, -37, -44, -31, -79, -30, -46}, new byte[]{-63, -40, -122, -4, -20, -93, -76, -74});
                    int i5 = fp0.OooO00o;
                    break;
                } else {
                    try {
                        iJobCallbackAsInterface.jobFinished(jobParameters3.getJobId(), z);
                        break;
                    } catch (RemoteException unused) {
                        u7.OooO00o(new byte[]{127, -50, -81}, new byte[]{21, -95, -51, 36, 65, -6, 96, -46});
                        u7.OooO00o(new byte[]{7, 123, 10, 67, 53, -17, -111, -123, 50, 102, 10, 88, 46, -95, -124, -64, 40, 102, 26, 12, 33, -90, -115, -119, 49, 97, 88, 88, 40, -17, -112, -103, 49, 125, 29, 65, 125, -17, -127, -119, 44, 109, 29, 94, 103, -89, -126, -109, 98, 110, 23, 66, 34, -82, -108, -127, 59, 39}, new byte[]{66, 9, 120, 44, 71, -49, -29, -32});
                        int i6 = fp0.OooO00o;
                        return;
                    }
                }
            case 3:
                xh1 xh1Var = (xh1) message.obj;
                try {
                    OooO00o(xh1Var.OooO0OO, c60.OooO0o0(xh1Var.OooO0Oo));
                    xh1Var.OooO0O0();
                    break;
                } catch (Exception e3) {
                    u7.OooO00o(new byte[]{59, -104, 57}, new byte[]{81, -9, 91, 6, 77, 108, -17, 104});
                    u7.OooO00o(new byte[]{-119, 105, -86, 22, 3, 43, 1, -110, -95, 118, -76, 90, 31, 38, 1, -124, -92, 124, -6, 14, 5, 104, 8, -121, -90, 125, -74, 31, 74, 47, 5, -110, -100, 107, -69, 20, 25, 46, 5, -108, -70, 124, -66, 62, 5, 63, 14, -118, -89, 120, -66, 56, 19, 60, 5, -107, -26}, new byte[]{-56, 25, -38, 122, 106, 72, 96, -26});
                    int i7 = fp0.OooO00o;
                    sa.OooOO0(e3);
                    return;
                }
            case 4:
                xh1 xh1Var2 = (xh1) message.obj;
                try {
                    OooO0O0(xh1Var2.OooO0OO, c60.OooO0o0(xh1Var2.OooO0Oo));
                    xh1Var2.OooO0O0();
                    break;
                } catch (Exception e4) {
                    Log.e(u7.OooO00o(new byte[]{-119, -87, 89}, new byte[]{-29, -58, 59, -115, -126, -92, 104, 73}), u7.OooO00o(new byte[]{33, 71, 72, -122, -46, 55, -82, -66, 9, 88, 86, -54, -50, 58, -82, -88, 12, 82, 24, -98, -44, 116, -89, -85, 14, 83, 84, -113, -101, 51, -86, -66, 52, 69, 89, -124, -56, 50, -86, -72, 18, 82, 92, -65, -53, 56, -96, -85, 4, 117, 65, -98, -34, 39, -31}, new byte[]{96, 55, 56, -22, -69, 84, -49, -54}), e4);
                    sa.OooOO0(e4);
                    return;
                }
            case 5:
                xh1 xh1Var3 = (xh1) message.obj;
                JobParameters jobParameters4 = xh1Var3.OooO0OO;
                IJobCallback iJobCallbackAsInterface2 = IJobCallback.Stub.asInterface(hk0.OooO00o(jobParameters4));
                if (iJobCallbackAsInterface2 != null) {
                    try {
                        iJobCallbackAsInterface2.updateTransferredNetworkBytes(jobParameters4.getJobId(), c60.OooO0o0(xh1Var3.OooO0Oo), 0L, 0L);
                    } catch (RemoteException unused2) {
                        u7.OooO00o(new byte[]{-115, 80, -23}, new byte[]{-25, 63, -117, -81, -107, -113, -116, 12});
                        u7.OooO00o(new byte[]{-3, -42, 123, 0, -28, 16, -99, -93, -36, -59, 125, 6, -8, 87, -56, -73, -39, -48, 104, 79, -30, 66, -119, -67, -53, -62, 108, 29, -74, 64, -102, -68, -33, -42, 108, 28, -27, 16, -100, -68, -104, -41, 112, 28, -30, 85, -123, -23, -104, -58, 96, 1, -14, 85, -102, -13, -48, -59, 122, 79, -15, 95, -122, -74, -104, -59, 126, 14, -17, 30}, new byte[]{-72, -92, 9, 111, -106, 48, -24, -45});
                        int i8 = fp0.OooO00o;
                    }
                } else {
                    u7.OooO00o(new byte[]{-15, -18, 24}, new byte[]{-101, -127, 122, -63, 23, 80, 113, -66});
                    u7.OooO00o(new byte[]{-20, 38, 66, 110, 10, 96, -9, -103, -19, 55, 114, 125, 31, 107, -64, -98, -4, 36, 118, 125, 17, 98, -63, -99, -22, 37, 14, 38, 94, 102, -46, -108, -11, 51, 66, 47, 24, 106, -63, -40, -8, 118, 72, 96, 16, 96, -53, -111, -22, 34, 67, 97, 10, 37, -39, -105, -5, 118, 79, 107, 80}, new byte[]{-103, 86, 38, 15, 126, 5, -77, -8});
                    int i9 = fp0.OooO00o;
                }
                xh1Var3.OooO0O0();
                break;
            case 6:
                xh1 xh1Var4 = (xh1) message.obj;
                JobParameters jobParameters5 = xh1Var4.OooO0OO;
                IJobCallback iJobCallbackAsInterface3 = IJobCallback.Stub.asInterface(hk0.OooO00o(jobParameters5));
                if (iJobCallbackAsInterface3 != null) {
                    try {
                        iJobCallbackAsInterface3.updateEstimatedNetworkBytes(jobParameters5.getJobId(), c60.OooO0o0(xh1Var4.OooO0Oo), 0L, 0L);
                    } catch (RemoteException unused3) {
                        u7.OooO00o(new byte[]{-113, -92, 109}, new byte[]{-27, -53, 15, 59, -87, 108, -82, 39});
                        u7.OooO00o(new byte[]{-104, -54, -80, 84, -56, 108, 70, -47, -71, -39, -74, 82, -44, 43, 19, -60, -82, -52, -85, 86, -37, 56, 86, -59, -3, -52, -80, 90, -44, 63, 85, -60, -81, -104, -79, 82, -64, 41, 19, -43, -78, -104, -79, 66, -55, 56, 86, -52, -25, -104, -96, 82, -44, 40, 86, -45, -3, -48, -93, 72, -102, 43, 92, -49, -72, -104, -93, 76, -37, 53, 29}, new byte[]{-35, -72, -62, 59, -70, 76, 51, -95});
                        int i10 = fp0.OooO00o;
                    }
                } else {
                    u7.OooO00o(new byte[]{-66, -46, 89}, new byte[]{-44, -67, 59, -90, 107, 23, 87, -45});
                    u7.OooO00o(new byte[]{75, -45, -29, 100, -7, 127, -85, -112, 74, -54, -22, 100, -7, 127, -118, -83, 91, -41, -16, 106, -1, 113, -84, -102, 74, -58, -12, 45, -92, 58, -115, -126, 82, -49, -30, 97, -83, 124, -127, -111, 30, -62, -89, 107, -30, 116, -117, -101, 87, -48, -13, 96, -29, 110, -50, -119, 81, -63, -89, 108, -23, 52}, new byte[]{62, -93, -121, 5, -115, 26, -18, -29});
                    int i11 = fp0.OooO00o;
                }
                xh1Var4.OooO0O0();
                break;
            case 7:
                xh1 xh1Var5 = (xh1) message.obj;
                JobParameters jobParameters6 = xh1Var5.OooO0OO;
                Notification notification = (Notification) xh1Var5.OooO0Oo;
                IJobCallback iJobCallbackAsInterface4 = IJobCallback.Stub.asInterface(hk0.OooO00o(jobParameters6));
                if (iJobCallbackAsInterface4 != null) {
                    try {
                        iJobCallbackAsInterface4.setNotification(jobParameters6.getJobId(), 0, notification, 0);
                    } catch (RemoteException unused4) {
                        Log.e(u7.OooO00o(new byte[]{73, -58, 121}, new byte[]{35, -87, 27, -39, -26, 8, 75, 26}), u7.OooO00o(new byte[]{-19, 90, 107, -40, 42, -29, 70, 16, -57, 94, 112, -45, 49, -83, 81, 66, -58, 71, 109, -34, 62, -86, 85, 3, -36, 65, 118, -39, 98, -29, 84, 11, -58, 76, 124, -59, 120, -85, 87, 17, -120, 79, 118, -39, 61, -29, 87, 21, -55, 81, 55}, new byte[]{-88, 40, 25, -73, 88, -61, 54, 98}));
                    }
                } else {
                    Log.e(u7.OooO00o(new byte[]{-51, 27, 59}, new byte[]{-89, 116, 89, 45, 122, 91, 24, 77}), u7.OooO00o(new byte[]{-54, -75, 40, 0, -106, 12, 126, 40, -48, -77, 61, 58, -112, 23, 121, 102, -112, -16, 63, 47, -107, 20, 114, 42, -103, -74, 51, 60, -39, 25, 55, 32, -42, -66, 57, 54, -112, 11, 99, 43, -41, -92, 124, 36, -106, 26, 57}, new byte[]{-71, -48, 92, 78, -7, 120, 23, 78}));
                }
                xh1Var5.OooO0O0();
                break;
            case 8:
                JobParameters jobParameters7 = (JobParameters) message.obj;
                try {
                    Log.w(p6.OooO0OO, u7.OooO00o(new byte[]{-81, -88, 71, -39, 57, -57, 61, -30, -85, -123, 97, -35, 35, -41, 55, -12, -24, -17, 41, -46, 34, -60, 114, -7, -83, -74, 101, -39, 32, -43, 60, -28, -91, -94, 39, -100, 0, -59, 33, -28, -32, -87, 127, -39, 63, -62, 59, -12, -91, -26, 96, -46, 109, -47, 114, -29, -75, -92, 106, -48, 44, -61, 33, -66}, new byte[]{-64, -58, 9, -68, 77, -80, 82, -112}));
                    break;
                } catch (Exception e5) {
                    u7.OooO00o(new byte[]{38, -90, 50}, new byte[]{76, -55, 80, 66, -98, -65, 111, 13});
                    u7.OooO00o(new byte[]{-20, -98, -62, 0, 52, -61, -82, 50, -64, -128, -43, 79, 35, -101, -68, 57, -36, -104, -39, 1, 33, -61, -77, 53, -53, -42, -112}, new byte[]{-87, -20, -80, 111, 70, -29, -39, 90});
                    jobParameters7.getJobId();
                    int i12 = fp0.OooO00o;
                    sa.OooOO0(e5);
                    return;
                }
            default:
                u7.OooO00o(new byte[]{1, 73, 26}, new byte[]{107, 38, 120, -89, 52, -76, 18, -78});
                u7.OooO00o(new byte[]{-10, 100, 60, -66, 118, -59, -72, 75, -54, 121, 43, -65, 53, -57, -70, 86, -48, 107, 41, -66, 53, -40, -70, 70, -58, 99, 56, -66, 113, -124}, new byte[]{-93, 10, 78, -37, 21, -86, -33, 37});
                int i13 = fp0.OooO00o;
                break;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.OooO00o) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.OooO0O0).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 1:
                OooO0o0(message);
                return;
            case 2:
                int i2 = message.arg2;
                RemoteCallbackList remoteCallbackList = (RemoteCallbackList) this.OooO0O0;
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                    IPackageInstallerCallback broadcastItem = remoteCallbackList.getBroadcastItem(i3);
                    if (((IntPredicate) remoteCallbackList.getBroadcastCookie(i3)).test(i2)) {
                        try {
                            OooO0o(broadcastItem, message);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                remoteCallbackList.finishBroadcast();
                return;
            case 3:
                if (message.what != 1) {
                    return;
                }
                j41 j41Var = (j41) this.OooO0O0;
                PreferenceScreen preferenceScreen = j41Var.OoooOoo.OooO0o0;
                if (preferenceScreen != null) {
                    j41Var.Ooooo00.setAdapter(new m41(preferenceScreen));
                    preferenceScreen.OooO();
                    return;
                }
                return;
            case 4:
                if (message.what != 103) {
                    return;
                }
                int i4 = message.arg1;
                int i5 = message.arg2;
                Bundle bundle = (Bundle) message.obj;
                String string = bundle.getString(u7.OooO00o(new byte[]{61, 56, -111}, new byte[]{77, 83, -10, -112, -8, -25, 17, -41}));
                bundle.getString(u7.OooO00o(new byte[]{86, 31, -48, 66, -54, -114}, new byte[]{36, 122, -79, 49, -91, -32, -7, -5}));
                pw1 pw1Var = (pw1) this.OooO0O0;
                synchronized (pw1Var) {
                    pw1Var.o00(i4, i5, string);
                }
                return;
            case 5:
                if (message.what == 1) {
                    try {
                        if (yn2.OooO0O0()) {
                            ox1.o0O0ooO().OooOOO.block(0L);
                            lx1.OooO00o((lx1) this.OooO0O0);
                        }
                    } catch (Exception unused2) {
                    }
                }
                super.handleMessage(message);
                return;
            default:
                int i6 = message.what;
                if (i6 == 1) {
                    synchronized (sx1.class) {
                        try {
                            sx1.OooO00o((sx1) this.OooO0O0, message.arg1);
                            if (!((sx1) this.OooO0O0).OooO0oo.hasMessages(1)) {
                                ((sx1) this.OooO0O0).OooO0oo.sendEmptyMessageDelayed(2, 60000L);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                if (i6 != 2) {
                    return;
                }
                synchronized (sx1.class) {
                    try {
                        if (!hasMessages(1)) {
                            removeMessages(2);
                            HandlerThread handlerThread = ((sx1) this.OooO0O0).OooO0oO;
                            if (handlerThread != null) {
                                handlerThread.quit();
                            }
                            sx1 sx1Var = (sx1) this.OooO0O0;
                            sx1Var.OooO0oO = null;
                            sx1Var.OooO0oo = null;
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oOo00o0o(Object obj, Looper looper, int i) {
        super(looper);
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    public /* synthetic */ oOo00o0o() {
        this.OooO00o = 0;
    }
}
