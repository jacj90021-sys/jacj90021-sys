package com.cmaster.cloner;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class tx2 {
    public static int OooO00o(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, b2.OooO0O0(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }
}
