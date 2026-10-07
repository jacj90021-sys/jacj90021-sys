package com.cmaster.cloner;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class fo1 {
    public static final long OooO00o;
    public static final Method OooO0O0;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                OooO00o = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                OooO0O0 = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    public static boolean OooO00o() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b2.OooO0OO();
        }
        try {
            return ((Boolean) OooO0O0.invoke(null, Long.valueOf(OooO00o))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
