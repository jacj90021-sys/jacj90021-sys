package com.cmaster.cloner;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class oOO0O00O {
    public static TracingController OooO00o() {
        return TracingController.getInstance();
    }

    public static ClassLoader OooO0O0() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper OooO0OO(WebView webView) {
        return webView.getWebViewLooper();
    }

    public static boolean OooO0Oo(TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void OooO0o(TracingController tracingController, go1 go1Var) {
        o0000oo.OooOOO();
        throw null;
    }

    public static void OooO0o0(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static boolean OooO0oO(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
