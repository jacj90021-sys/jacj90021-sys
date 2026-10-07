package com.cmaster.cloner;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.os.HandlerThread;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lx1 {
    public final HandlerThread OooO00o = new HandlerThread(OooO0OO);
    public NotificationManager OooO0O0;
    public static final String OooO0Oo = u7.OooO00o(new byte[]{-91, -62, -43, -104, -36, 113, -30, 125, -65, -37, -43, -97, -47, 118, -19, 102, -74, -61, -43, -107, -35}, new byte[]{-45, -81, -118, -4, -71, 23, -125, 8});
    public static final String OooO0o0 = u7.OooO00o(new byte[]{63, 89, -46, -50, 58, -6, 77}, new byte[]{123, 60, -76, -81, 79, -106, 57, 123});
    public static final String OooO0OO = lx1.class.getSimpleName();
    public static final oO00OOOo OooO0o = new oO00OOOo(19);

    public static void OooO00o(lx1 lx1Var) {
        List notificationChannelGroups = lx1Var.OooO0O0.getNotificationChannelGroups();
        if (notificationChannelGroups != null) {
            Iterator it = notificationChannelGroups.iterator();
            while (it.hasNext()) {
                NotificationChannelGroup notificationChannelGroupOooO0Oo = c60.OooO0Oo(it.next());
                String[] strArrOooOOo0 = ec0.OooOOo0(notificationChannelGroupOooO0Oo.getId());
                if (strArrOooOOo0 != null) {
                    if (!ox1.o0O0ooO().o000OooO(Integer.parseInt(strArrOooOOo0[1]), strArrOooOOo0[0])) {
                        lx1Var.OooO0O0.deleteNotificationChannelGroup(notificationChannelGroupOooO0Oo.getId());
                    }
                }
            }
        }
        List notificationChannels = lx1Var.OooO0O0.getNotificationChannels();
        if (notificationChannels != null) {
            Iterator it2 = notificationChannels.iterator();
            while (it2.hasNext()) {
                NotificationChannel notificationChannelOooO0O0 = c60.OooO0O0(it2.next());
                String[] strArrOooOOo02 = ec0.OooOOo0(notificationChannelOooO0O0.getId());
                if (strArrOooOOo02 != null) {
                    if (!ox1.o0O0ooO().o000OooO(Integer.parseInt(strArrOooOOo02[1]), strArrOooOOo02[0])) {
                        lx1Var.OooO0O0.deleteNotificationChannel(notificationChannelOooO0O0.getId());
                    }
                }
            }
        }
    }
}
