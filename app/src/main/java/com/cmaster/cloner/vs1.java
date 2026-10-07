package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vs1 implements ia1 {
    public final us1 OooO00o;
    public final k8 OooO0O0;
    public final s60 OooO0OO = OooO0o;
    public static final tz0 OooO0Oo = new tz0("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new y9());
    public static final tz0 OooO0o0 = new tz0("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new nz0(10));
    public static final s60 OooO0o = new s60();
    public static final List OooO0oO = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    public vs1(k8 k8Var, us1 us1Var) {
        this.OooO0O0 = k8Var;
        this.OooO00o = us1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.ia1
    public final fa1 OooO00o(Object obj, int i, int i2, xz0 xz0Var) throws Exception {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        long jLongValue = ((Long) xz0Var.OooO0OO(OooO0Oo)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        int i3 = (Integer) xz0Var.OooO0OO(OooO0o0);
        if (i3 == null) {
            i3 = 2;
        }
        ss ssVar = (ss) xz0Var.OooO0OO(ss.OooO0oO);
        if (ssVar == null) {
            ssVar = ss.OooO0o;
        }
        ss ssVar2 = ssVar;
        this.OooO0OO.getClass();
        Integer num = i3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        boolean z = false;
        try {
            this.OooO00o.OooO(mediaMetadataRetriever, obj);
            Bitmap bitmapOooO0OO = OooO0OO(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, ssVar2);
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated2) {
                        try {
                            zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
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
            } else {
                mediaMetadataRetriever.release();
            }
            return l8.OooO0OO(bitmapOooO0OO, this.OooO0O0);
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService2 = (ExecutorService) mediaMetadataRetriever;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z) {
                                executorService2.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
    }

    @Override // com.cmaster.cloner.ia1
    public final boolean OooO0O0(Object obj, xz0 xz0Var) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap OooO0OO(java.lang.Object r14, android.media.MediaMetadataRetriever r15, long r16, int r18, int r19, int r20, com.cmaster.cloner.ss r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.vs1.OooO0OO(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, com.cmaster.cloner.ss):android.graphics.Bitmap");
    }
}
