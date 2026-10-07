package com.cmaster.cloner;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class in2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO00o(rc1 rc1Var, Throwable th) throws Exception {
        boolean zIsTerminated;
        if (rc1Var != 0) {
            if (th != null) {
                try {
                    rj.OooOOO(rc1Var);
                    return;
                } catch (Throwable th2) {
                    fr2.OooO00o(th, th2);
                    return;
                }
            }
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
    }
}
