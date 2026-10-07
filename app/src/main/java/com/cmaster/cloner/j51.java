package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class j51 {
    public static final da1 OooO00o = new da1();
    public static final Object OooO0O0 = new Object();
    public static gu0 OooO0OO = null;

    public static long OooO00o(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? o000O0o.OooO00o(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static gu0 OooO0O0() {
        gu0 gu0Var = new gu0(11);
        OooO0OO = gu0Var;
        OooO00o.OooO(gu0Var);
        return OooO0OO;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OooO0OO(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.j51.OooO0OO(android.content.Context, boolean):void");
    }
}
