package com.cmaster.cloner;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nm {
    public final Object OooO00o = new Object();
    public final ICustomTabsService OooO0O0;
    public final fm OooO0OO;
    public final ComponentName OooO0Oo;

    public nm(ICustomTabsService iCustomTabsService, fm fmVar, ComponentName componentName) {
        this.OooO0O0 = iCustomTabsService;
        this.OooO0OO = fmVar;
        this.OooO0Oo = componentName;
    }

    public final void OooO00o(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.OooO00o) {
            try {
                try {
                    this.OooO0O0.postMessage(this.OooO0OO, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
