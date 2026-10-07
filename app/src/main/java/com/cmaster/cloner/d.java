package com.cmaster.cloner;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class d {
    public static OnBackInvokedDispatcher OooO00o(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback OooO0O0(Object obj, k kVar) {
        Objects.requireNonNull(kVar);
        c cVar = new c(kVar, 0);
        o0000OO0.OooOO0o(obj).registerOnBackInvokedCallback(1000000, cVar);
        return cVar;
    }

    public static void OooO0OO(Object obj, Object obj2) {
        o0000OO0.OooOO0o(obj).unregisterOnBackInvokedCallback(o0000OO0.OooO0oo(obj2));
    }
}
