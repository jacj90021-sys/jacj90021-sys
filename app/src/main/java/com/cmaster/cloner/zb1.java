package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.os.Process;
import java.lang.Thread;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zb1 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        PackageInfo packageInfoO000o0oo;
        long j;
        oO00OOOo oo00oooo = lw1.OooO0O0;
        try {
            mx1 mx1VarOooO0oO = mx1.OooO0oO();
            int iOooO0oO = qx1.OooO0oO();
            String strOooO00o = qx1.OooO00o();
            mx1VarOooO0oO.getClass();
            try {
                packageInfoO000o0oo = mx1VarOooO0oO.OooO00o.o000o0oo(iOooO0oO, 0, qx1.OooO00o(), strOooO00o);
            } catch (Throwable unused) {
                packageInfoO000o0oo = null;
            }
            String str = "";
            if (packageInfoO000o0oo != null) {
                str = packageInfoO000o0oo.versionName;
                j = packageInfoO000o0oo.versionCode;
            } else {
                j = 0;
            }
            String str2 = str;
            long j2 = j;
            String str3 = ((ProviderInfo) e92.OooO0OO.OooO0o0).processName;
            int iMyPid = Process.myPid();
            long id = thread.getId();
            String strOooO00o2 = qx1.OooO00o();
            p2 p2Var = qx1.OooO0Oo;
            kk kkVar = new kk(str3, iMyPid, id, strOooO00o2, j2, str2, p2Var != null ? p2Var.OooOO0O : null, qx1.OooO0oO(), th);
            we0 we0Var = ((lw1) lw1.OooO0O0.OooO0O0()).OooO00o;
            String str4 = ((ProviderInfo) e92.OooO0OO.OooO0o0).processName;
            String strOooO00o3 = qx1.OooO00o();
            p2 p2Var2 = qx1.OooO0Oo;
            we0Var.OoooOoo(str4, strOooO00o3, j2, p2Var2 != null ? p2Var2.OooOO0O : null, qx1.OooO0oO(), kkVar.OooO00o());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        ((Thread.UncaughtExceptionHandler) e92.OooO0oO).uncaughtException(thread, th);
        if (m63.OooO00o()) {
            lw1.OooO0O0().OooO0o(qx1.OooO0oO(), qx1.OooO00o(), u7.OooO00o(new byte[]{-54, -123, 50, -24, 24}, new byte[]{-87, -9, 83, -101, 112, 16, 3, 120}));
        }
        System.exit(0);
    }
}
