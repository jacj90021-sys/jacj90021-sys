package com.cmaster.cloner;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yw0 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ yw0(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.OooO00o) {
            case 1:
                pr1.OooO0o().post(new nh1(0, this, true));
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.OooO00o) {
            case 0:
                ep0.OooO0oO().OooO0Oo(zw0.OooO, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                zw0 zw0Var = (zw0) this.OooO0O0;
                zw0Var.OooO0OO(zw0Var.OooO0o());
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i = 0;
        Object[] objArr = 0;
        switch (this.OooO00o) {
            case 0:
                ep0.OooO0oO().OooO0Oo(zw0.OooO, "Network connection lost", new Throwable[0]);
                zw0 zw0Var = (zw0) this.OooO0O0;
                zw0Var.OooO0OO(zw0Var.OooO0o());
                break;
            default:
                pr1.OooO0o().post(new nh1(i, this, objArr == true ? 1 : 0));
                break;
        }
    }
}
