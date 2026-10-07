package com.cmaster.cloner;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class AliveService extends Service {
    public static final String OooO0o0 = sn2.OooO00o("xuQlw/vQhczI6Tfe9NKM\n", "i4FWsJq34Ow=\n");
    public static final Binder OooO0Oo = new Binder();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intent intent2 = new Intent(this, (Class<?>) AliveService.class);
        intent2.putExtra(sn2.OooO00o("Z17EJiCIzoZvVQ==\n", "ATG2Q0f6ofM=\n"), true);
        intent2.putExtra(sn2.OooO00o("m/ohUQ==\n", "74NRNOLOe2Q=\n"), 1073741824);
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent2);
        }
        return OooO0Oo;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        NotificationChannel notificationChannelOooO0O0;
        if (!intent.getBooleanExtra(sn2.OooO00o("rmFyWBAg/FCmag==\n", "yA4APXdSkyU=\n"), false)) {
            return 3;
        }
        intent.getIntExtra(sn2.OooO00o("sg46gg==\n", "xndK5ypkGWY=\n"), 1073741824);
        rx0 rx0Var = new rx0(this);
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        String str = OooO0o0;
        str.getClass();
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            notificationChannelOooO0O0 = null;
        } else {
            notificationChannelOooO0O0 = cj.OooO0O0(str, str);
            cj.OooOO0o(notificationChannelOooO0O0);
            cj.OooOOO0(notificationChannelOooO0O0);
            cj.OooOo0(notificationChannelOooO0O0);
            cj.OooOo0O(notificationChannelOooO0O0);
            cj.OooO0o0(notificationChannelOooO0O0);
            cj.OooOOo0(notificationChannelOooO0O0);
            cj.OooOoO0(notificationChannelOooO0O0);
            cj.OooO0o(notificationChannelOooO0O0);
        }
        if (i3 >= 26) {
            cj.OooO0OO(rx0Var.OooO00o, notificationChannelOooO0O0);
        }
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        launchIntentForPackage.addFlags(268435456);
        PendingIntent activity = PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592);
        String strValueOf = String.valueOf(getApplicationInfo().loadLabel(getPackageManager()));
        nx0 nx0Var = new nx0(this, str);
        nx0Var.OooO0o0 = nx0.OooO0O0(strValueOf);
        nx0Var.OooO0o = nx0.OooO0O0(strValueOf.concat(sn2.OooO00o("TI1XzqBrxZQFikM=\n", "bOQk7tIeq/o=\n")));
        nx0Var.OooO0oO = activity;
        nx0Var.OooO0OO(false);
        nx0Var.OooOOOo.icon = R.mipmap.ic_launcher;
        Notification notificationOooO00o = nx0Var.OooO00o();
        notificationOooO00o.flags = 64;
        try {
            startForeground(1, notificationOooO00o);
            return 3;
        } catch (Exception e) {
            e.printStackTrace();
            return 3;
        }
    }
}
