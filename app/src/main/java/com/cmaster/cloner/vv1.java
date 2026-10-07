package com.cmaster.cloner;

import android.accounts.Account;
import android.os.RemoteException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vv1 {
    public static final oO00OOOo OooO0O0 = new oO00OOOo(8);
    public te0 OooO00o;

    public static vv1 OooO00o() {
        return (vv1) OooO0O0.OooO0O0();
    }

    public static void OooO0OO(Exception exc) {
        u7.OooO00o(new byte[]{-98, 11, -59}, new byte[]{-51, 82, -106, 60, 125, -63, -35, 77});
        Thread.currentThread();
        oO00OOOo oo00oooo = lw1.OooO0O0;
        if (exc instanceof RemoteException) {
            exc.printStackTrace();
        } else {
            if (exc instanceof RuntimeException) {
                throw ((RuntimeException) exc);
            }
            sa.OooOO0(exc);
        }
    }

    public final Account[] OooO0O0(String str) {
        try {
            return this.OooO00o.OooO0O0(qx1.OooO0oO(), str);
        } catch (Exception e) {
            OooO0OO(e);
            return null;
        }
    }
}
