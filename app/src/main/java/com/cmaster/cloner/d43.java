package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class d43 {
    public static boolean OooO00o(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ug1.OooO00o(context.getSystemService(ug1.OooO0O0())).isRequestPinShortcutSupported();
        }
        if (ep2.OooO00o(context, "com.android.launcher.permission.INSTALL_SHORTCUT") == 0) {
            Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
            while (it.hasNext()) {
                String str = it.next().activityInfo.permission;
                if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
