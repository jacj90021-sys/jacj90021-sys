package com.cmaster.cloner;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fp extends j43 {
    public final Object OooO00o = new Object();
    public final ExecutorService OooO0O0 = Executors.newFixedThreadPool(4, new f1(1));
    public volatile Handler OooO0OO;

    public static Handler OooO00o(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ep.OooO00o(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
