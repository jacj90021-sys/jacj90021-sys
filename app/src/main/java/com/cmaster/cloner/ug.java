package com.cmaster.cloner;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ug {
    public static final Method OooO00o;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        OooO00o = method;
    }
}
