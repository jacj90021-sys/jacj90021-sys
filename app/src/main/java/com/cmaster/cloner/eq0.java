package com.cmaster.cloner;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class eq0 {
    public OnBackInvokedCallback OooO00o;

    public OnBackInvokedCallback OooO00o(dq0 dq0Var) {
        Objects.requireNonNull(dq0Var);
        return new c(dq0Var, 1);
    }

    public void OooO0O0(dq0 dq0Var, View view, boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.OooO00o == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback onBackInvokedCallbackOooO00o = OooO00o(dq0Var);
            this.OooO00o = onBackInvokedCallbackOooO00o;
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, onBackInvokedCallbackOooO00o);
        }
    }

    public void OooO0OO(View view) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.OooO00o == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.OooO00o);
        this.OooO00o = null;
    }
}
