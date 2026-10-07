package com.cmaster.cloner;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m12 {
    public final /* synthetic */ int OooO00o;

    public oOO000 OooO00o(Context context, Looper looper, oO0Ooooo oo0ooooo, Object obj, f60 f60Var, g60 g60Var) {
        int i = this.OooO00o;
        switch (i) {
            case 0:
                oo0ooooo.getClass();
                Integer num = (Integer) oo0ooooo.OooOO0;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new bh1(context, looper, oo0ooooo, bundle, f60Var, g60Var);
            case 1:
                throw px0.OooOO0O(obj);
            default:
                s12 s12Var = (s12) f60Var;
                s12 s12Var2 = (s12) g60Var;
                switch (i) {
                    case 2:
                        return new u22(context, looper, oo0ooooo, (hm1) obj, s12Var, s12Var2);
                    case 3:
                        return new y22(context, looper, 308, oo0ooooo, s12Var, s12Var2);
                    case 4:
                        return new fe2(context, looper, 300, oo0ooooo, s12Var, s12Var2);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
        }
    }
}
