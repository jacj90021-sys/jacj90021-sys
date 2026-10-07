package com.cmaster.cloner;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnBackInvokedCallback {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ c(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    public final void onBackInvoked() {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                ((k) obj).OooOooO();
                break;
            case 1:
                ((dq0) obj).OooO0OO();
                break;
            case 2:
                ((p30) obj).OooO00o();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
