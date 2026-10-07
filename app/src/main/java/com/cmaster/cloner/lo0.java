package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class lo0 {
    public static final HashSet OooO00o;

    static {
        PackageInfo packageInfo;
        Object objOooO00o = b8.OooO00o();
        try {
            packageInfo = e92.OooO00o.getPackageManager().getPackageInfo(qx1.OooO0Oo(), 4096);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            try {
                if (fn2.OooO0o0(packageInfo.requestedPermissions)) {
                    OooO00o = new HashSet();
                } else {
                    HashSet hashSet = new HashSet(packageInfo.requestedPermissions.length);
                    OooO00o = hashSet;
                    hashSet.addAll(Arrays.asList(packageInfo.requestedPermissions));
                }
            } catch (Throwable th) {
                b8.OooO0O0(objOooO00o);
                throw th;
            }
        } else {
            OooO00o = new HashSet();
        }
        b8.OooO0O0(objOooO00o);
    }
}
