package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class op2 {
    public static final void OooO00o(vj vjVar, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable runtimeException;
        Iterator it = ak.OooO00o.iterator();
        while (it.hasNext()) {
            try {
                ((oO0O00O) it.next()).OooOOOO(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    fr2.OooO00o(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            fr2.OooO00o(th, new zq(vjVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
