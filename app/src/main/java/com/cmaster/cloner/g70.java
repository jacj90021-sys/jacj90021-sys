package com.cmaster.cloner;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class g70 {
    private static volatile Choreographer choreographer;

    static {
        Object bb1Var;
        try {
            bb1Var = new f70(OooO00o(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            bb1Var = new bb1(th);
        }
        if (bb1Var instanceof bb1) {
            bb1Var = null;
        }
    }

    public static final Handler OooO00o(Looper looper) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        objInvoke.getClass();
        return (Handler) objInvoke;
    }
}
