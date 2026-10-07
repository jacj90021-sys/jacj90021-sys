package com.cmaster.cloner;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class d60 extends e60 {
    public static final Object OooO0OO = new Object();
    public static final d60 OooO0Oo = new d60();

    public static void OooO0o(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof oOOO00) {
                k20 k20VarOooOOO = ((oOOO00) activity).OooOOO();
                ck1 ck1Var = new ck1();
                by2.OooO(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                ck1Var.o00Oo0 = alertDialog;
                if (onCancelListener != null) {
                    ck1Var.o00Ooo = onCancelListener;
                }
                ck1Var.o0OoOo0 = false;
                ck1Var.ooOO = true;
                k20VarOooOOO.getClass();
                k5 k5Var = new k5(k20VarOooOOO);
                k5Var.OooOOOo = true;
                k5Var.OooO0o0(0, ck1Var, str, 1);
                k5Var.OooO0Oo(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        uw uwVar = new uw();
        by2.OooO(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        uwVar.OooO0Oo = alertDialog;
        if (onCancelListener != null) {
            uwVar.OooO0o0 = onCancelListener;
        }
        uwVar.show(fragmentManager, str);
    }

    public static AlertDialog OooO0o0(Activity activity, int i, l22 l22Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(x12.OooO0O0(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(android.R.string.ok) : resources.getString(R.string.common_google_play_services_enable_button) : resources.getString(R.string.common_google_play_services_update_button) : resources.getString(R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, l22Var);
        }
        String strOooO0OO = x12.OooO0OO(activity, i);
        if (strOooO0OO != null) {
            builder.setTitle(strOooO0OO);
        }
        Log.w("GoogleApiAvailability", px0.OooOOO(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public final void OooO0Oo(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogOooO0o0 = OooO0o0(googleApiActivity, i, new f22(super.OooO0O0(googleApiActivity, "d", i), googleApiActivity), googleApiActivity2);
        if (alertDialogOooO0o0 == null) {
            return;
        }
        OooO0o(googleApiActivity, alertDialogOooO0o0, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void OooO0oO(Context context, int i, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i2;
        Log.w("GoogleApiAvailability", rj.OooO00o(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new h22(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strOooO0o0 = i == 6 ? x12.OooO0o0(context, "common_google_play_services_resolution_required_title") : x12.OooO0OO(context, i);
        if (strOooO0o0 == null) {
            strOooO0o0 = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
        }
        String strOooO0Oo = (i == 6 || i == 19) ? x12.OooO0Oo(context, "common_google_play_services_resolution_required_text", x12.OooO00o(context)) : x12.OooO0O0(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        by2.OooO0oo(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        nx0 nx0Var = new nx0(context, null);
        nx0Var.OooOO0o = true;
        nx0Var.OooO0OO(true);
        nx0Var.OooO0o0 = nx0.OooO0O0(strOooO0o0);
        mx0 mx0Var = new mx0();
        mx0Var.OooO0o0 = nx0.OooO0O0(strOooO0Oo);
        nx0Var.OooO0o0(mx0Var);
        PackageManager packageManager = context.getPackageManager();
        if (eq2.OooO00o == null) {
            eq2.OooO00o = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (eq2.OooO00o.booleanValue()) {
            nx0Var.OooOOOo.icon = context.getApplicationInfo().icon;
            nx0Var.OooO = 2;
            if (eq2.OooO0O0(context)) {
                nx0Var.OooO0O0.add(new ix0(resources.getString(R.string.common_open_on_phone), pendingIntent));
            } else {
                nx0Var.OooO0oO = pendingIntent;
            }
        } else {
            nx0Var.OooOOOo.icon = android.R.drawable.stat_sys_warning;
            nx0Var.OooOOOo.tickerText = nx0.OooO0O0(resources.getString(R.string.common_google_play_services_notification_ticker));
            nx0Var.OooOOOo.when = System.currentTimeMillis();
            nx0Var.OooO0oO = pendingIntent;
            nx0Var.OooO0o = nx0.OooO0O0(strOooO0Oo);
        }
        if (vx2.OooO00o()) {
            by2.OooOO0O(vx2.OooO00o());
            synchronized (OooO0OO) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(c60.OooO0OO(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            nx0Var.OooOOO = "com.google.android.gms.availability";
        }
        Notification notificationOooO00o = nx0Var.OooO00o();
        if (i == 1 || i == 2 || i == 3) {
            n60.OooO00o.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationOooO00o);
    }

    public final void OooO0oo(Activity activity, dm0 dm0Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogOooO0o0 = OooO0o0(activity, i, new k22(super.OooO0O0(activity, "d", i), dm0Var), onCancelListener);
        if (alertDialogOooO0o0 == null) {
            return;
        }
        OooO0o(activity, alertDialogOooO0o0, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
