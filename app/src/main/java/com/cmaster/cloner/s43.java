package com.cmaster.cloner;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class s43 {
    public static long OooO00o;
    public static Method OooO0O0;

    public static void OooO00o(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static boolean OooO0O0() {
        if (Build.VERSION.SDK_INT >= 29) {
            return eo1.OooO00o();
        }
        try {
            if (OooO0O0 == null) {
                OooO00o = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                OooO0O0 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) OooO0O0.invoke(null, Long.valueOf(OooO00o))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            sa.OooOO0(cause);
            return false;
        }
    }
}
