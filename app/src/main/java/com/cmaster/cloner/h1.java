package com.cmaster.cloner;

import android.os.Looper;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class h1 {
    public static final ThreadPoolExecutor OooO00o;
    public static final g1 OooO0O0;
    public static final oo00 OooO0OO;
    public static final oo00 OooO0Oo;

    static {
        int iMax = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
        f1 f1Var = new f1(0);
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        OooO0O0 = new g1(Looper.getMainLooper(), 0);
        OooO0OO = new oo00(3);
        OooO0Oo = new oo00(1);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, synchronousQueue, f1Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        OooO00o = threadPoolExecutor;
    }

    public static void OooO00o() {
        if (OooO0O0()) {
            return;
        }
        qa.OooO0o("must be main thread");
    }

    public static boolean OooO0O0() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
