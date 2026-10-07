package com.cmaster.cloner;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class cx1 {
    public static final ThreadPoolExecutor OooO00o;
    public static final g1 OooO0O0;
    public static final HandlerThread OooO0OO;
    public static final oo00 OooO0Oo;
    public static final oo00 OooO0o;
    public static final oo00 OooO0o0;

    static {
        int iMax = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
        f1 f1Var = new f1(2);
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        OooO0O0 = new g1(Looper.getMainLooper(), 1);
        OooO0Oo = new oo00(7);
        OooO0o0 = new oo00(8);
        OooO0o = new oo00(6);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, synchronousQueue, f1Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        OooO00o = threadPoolExecutor;
        HandlerThread handlerThread = new HandlerThread(u7.OooO00o(new byte[]{-102, 16, -55, 71, -81, 48}, new byte[]{-62, 79, -98, 8, -3, 123, -71, 98}));
        OooO0OO = handlerThread;
        handlerThread.start();
    }

    public static boolean OooO00o() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
