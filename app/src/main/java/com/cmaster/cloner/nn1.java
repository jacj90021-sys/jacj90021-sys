package com.cmaster.cloner;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class nn1 {
    public static OnBackInvokedDispatcher OooO00o(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback OooO0O0(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new c(runnable, 3);
    }

    public static void OooO0OO(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void OooO0Oo(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
