package com.cmaster.cloner;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class by2 {
    public static void OooO(Object obj, String str) {
        if (obj != null) {
            return;
        }
        qa.OooOOO0(str);
    }

    public static void OooO00o(String str, boolean z) {
        if (z) {
            return;
        }
        ra.OooOOO(str);
    }

    public static void OooO0O0(boolean z) {
        if (z) {
            return;
        }
        qa.OooOO0();
    }

    public static void OooO0OO(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            sa.OooO0oo("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper", ".");
        }
    }

    public static void OooO0Oo(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        qa.OooO0o(str);
    }

    public static void OooO0o(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ra.OooOOO(str2);
        }
    }

    public static void OooO0o0(String str) {
        if (TextUtils.isEmpty(str)) {
            ra.OooOOO("Given String is empty or null");
        }
    }

    public static void OooO0oO(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        qa.OooO0o(str);
    }

    public static void OooO0oo(Object obj) {
        if (obj != null) {
            return;
        }
        qa.OooOOO0("null reference");
    }

    public static void OooOO0(String str, boolean z) {
        if (z) {
            return;
        }
        qa.OooO0o(str);
    }

    public static void OooOO0O(boolean z) {
        if (z) {
            return;
        }
        ra.OooO0O0();
    }
}
