package com.cmaster.cloner;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteCallbackList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sw1 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int OooO0oo = 0;
    public final Handler OooO00o;
    public volatile Message OooO0O0;
    public Message OooO0OO;
    public final l81 OooO0Oo;
    public final RemoteCallbackList OooO0o = new RemoteCallbackList();
    public final ConnectivityManager OooO0o0;
    public NetworkRequest OooO0oO;

    public sw1() {
        HandlerThread handlerThread = new HandlerThread("sw1");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.OooO00o = handler;
        handler.post(new bf1(this));
        this.OooO0Oo = l81.OooO0o(ConnectivityManager.NetworkCallback.class, u7.OooO00o(new byte[]{-13, 40, -93, -73, 76, 10, -25, 72, -8, 60, -94, -91, 80, 12}, new byte[]{-99, 77, -41, -64, 35, 120, -116, 26}));
        if (Build.VERSION.SDK_INT < 26) {
            this.OooO0o0 = null;
        } else {
            this.OooO0o0 = (ConnectivityManager) e92.OooO00o.getSystemService(ConnectivityManager.class);
            handler.post(new o00OOOOo(this, 17));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        super.onAvailable(network);
        this.OooO0O0 = this.OooO0OO;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
        this.OooO0O0 = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        super.onUnavailable();
        this.OooO0O0 = null;
    }
}
