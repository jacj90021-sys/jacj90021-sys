package com.cmaster.cloner;

import android.app.ActivityManager;
import android.os.Build;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class k43 {
    public static ActivityManager.AppTask OooO00o(int i) {
        ActivityManager.RecentTaskInfo taskInfo;
        ActivityManager.AppTask next;
        Iterator<ActivityManager.AppTask> it = ((ActivityManager) e92.OooO00o.getSystemService(u7.OooO00o(new byte[]{119, 37, 120, 123, 24, 0, 25, -14}, new byte[]{22, 70, 12, 18, 110, 105, 109, -117}))).getAppTasks().iterator();
        do {
            taskInfo = null;
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            try {
                taskInfo = next.getTaskInfo();
            } catch (Throwable unused) {
            }
        } while ((taskInfo == null ? -1 : Build.VERSION.SDK_INT >= 29 ? taskInfo.taskId : taskInfo.id) != i);
        return next;
    }
}
