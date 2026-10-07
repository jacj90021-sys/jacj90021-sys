package com.cmaster.cloner;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ry0 {
    public static final ry0 OooO00o = new ry0();

    public final OnBackInvokedCallback OooO00o(p30 p30Var) {
        p30Var.getClass();
        return new c(p30Var, 2);
    }

    public final void OooO0O0(Object obj, int i, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void OooO0OO(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
