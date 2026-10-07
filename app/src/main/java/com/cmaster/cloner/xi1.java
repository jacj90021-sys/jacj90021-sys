package com.cmaster.cloner;

import android.accounts.IAccountManagerResponse;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class xi1 extends Handler {
    public final /* synthetic */ int OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi1(Looper looper, int i) {
        super(looper);
        this.OooO00o = i;
        switch (i) {
            case 5:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.OooO00o) {
            case 1:
                if (message.what == 0) {
                    IAccountManagerResponse iAccountManagerResponseO000oooo = ((hw1) message.obj).o000oooo();
                    if (iAccountManagerResponseO000oooo != null) {
                        try {
                            iAccountManagerResponseO000oooo.onError(1, u7.OooO00o(new byte[]{114, -7, -28, -109, 119, -80, -112}, new byte[]{6, -112, -119, -10, 24, -59, -28, -36}));
                            return;
                        } catch (RemoteException unused) {
                            return;
                        }
                    }
                    return;
                }
                throw new IllegalStateException(u7.OooO00o(new byte[]{20, 40, 112, 23, -62, -71, -35, -124, 5, 102, 117, 19, -33, -82, -48, -122, 4, 124, 56}, new byte[]{97, 70, 24, 118, -84, -35, -79, -31}) + message.what);
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi1(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.OooO00o = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi1(Looper looper, int i, boolean z) {
        super(looper);
        this.OooO00o = i;
    }
}
