package com.cmaster.cloner;

import android.accounts.AuthenticatorException;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tv1 extends IAccountManagerResponse.Stub {
    public final /* synthetic */ uv1 OooO0Oo;

    public tv1(uv1 uv1Var) {
        this.OooO0Oo = uv1Var;
    }

    public final void onError(int i, String str) {
        uv1 uv1Var = this.OooO0Oo;
        if (i == 4 || i == 100 || i == 101) {
            uv1Var.cancel(true);
        } else {
            Exception authenticatorException = i == 3 ? new IOException(str) : i == 6 ? new UnsupportedOperationException(str) : (i != 5 && i == 7) ? new IllegalArgumentException(str) : new AuthenticatorException(str);
            uv1Var.setException(authenticatorException);
        }
    }

    public final void onResult(Bundle bundle) {
        if (bundle == null) {
            onError(5, u7.OooO00o(new byte[]{45, -11, -59, -77, 0, 21, 1, -120, 39, -20, -52, -1, 82, 18, 0, -109, 49, -18, -52, -69}, new byte[]{67, -128, -87, -33, 32, 119, 116, -26}));
            return;
        }
        boolean z = bundle.getBoolean(u7.OooO00o(new byte[]{22, 110, 63, -118, -20}, new byte[]{100, 11, 75, -8, -107, -63, 14, -55}));
        uv1 uv1Var = this.OooO0Oo;
        if (!z) {
            uv1Var.set(bundle);
            return;
        }
        try {
            uv1Var.OooO0O0();
        } catch (RemoteException e) {
            sa.OooOO0(e);
        }
    }
}
