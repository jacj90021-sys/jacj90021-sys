package com.cmaster.cloner;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class rj {
    public static StringBuilder OooO(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static String OooO00o(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String OooO0O0(String str, o10 o10Var, String str2) {
        return str + o10Var + str2;
    }

    public static String OooO0OO(String str, String str2) {
        return str + str2;
    }

    public static String OooO0Oo(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String OooO0o(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String OooO0o0(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String OooO0oO(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String OooO0oo(byte[] bArr, byte[] bArr2, StringBuilder sb) {
        sb.append(u7.OooO00o(bArr, bArr2));
        return sb.toString();
    }

    public static StringBuilder OooOO0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static void OooOO0O(int i, String str, q9 q9Var, int i2) {
        q9Var.OooO0O0(i2, str.concat(js2.OooO0OO(i)));
    }

    public static void OooOO0o(os osVar, os osVar2, os osVar3, os osVar4, os osVar5) {
        ps.OooO00o(osVar);
        ps.OooO00o(osVar2);
        ps.OooO00o(osVar3);
        ps.OooO00o(osVar4);
        ps.OooO00o(osVar5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OooOOO(rc1 rc1Var) throws Exception {
        boolean zIsTerminated;
        if (rc1Var instanceof AutoCloseable) {
            rc1Var.close();
            return;
        }
        if (!(rc1Var instanceof ExecutorService)) {
            if (rc1Var instanceof TypedArray) {
                ((TypedArray) rc1Var).recycle();
                return;
            }
            if (rc1Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) rc1Var).release();
                return;
            } else if (rc1Var instanceof MediaDrm) {
                ((MediaDrm) rc1Var).release();
                return;
            } else {
                qa.OooOO0();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) rc1Var;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void OooOOO0(o90 o90Var, String str) {
        o90Var.OooO0O0(str, new f90(false, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OooOOOO(Closeable closeable) throws Exception {
        boolean zIsTerminated;
        if (closeable instanceof AutoCloseable) {
            closeable.close();
            return;
        }
        if (!(closeable instanceof ExecutorService)) {
            if (closeable instanceof TypedArray) {
                ((TypedArray) closeable).recycle();
                return;
            }
            if (closeable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) closeable).release();
                return;
            } else if (closeable instanceof MediaDrm) {
                ((MediaDrm) closeable).release();
                return;
            } else {
                qa.OooOO0();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) closeable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void OooOOOo(byte[] bArr, byte[] bArr2, StringBuilder sb, int i) {
        sb.append(u7.OooO00o(bArr, bArr2));
        sb.append(i);
    }

    public static /* synthetic */ String OooOOo(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static void OooOOo0(byte[] bArr, byte[] bArr2, StringBuilder sb, String str) {
        sb.append(u7.OooO00o(bArr, bArr2));
        sb.append(str);
    }

    public static /* synthetic */ int OooOOoo(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String OooOo0(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String OooOo00(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    public static /* synthetic */ String OooOo0O(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }
}
