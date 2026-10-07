package com.cmaster.cloner;

import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ox0 {
    public static final String OooO0OO = u7.OooO00o(new byte[]{-48, 4, -109, 0, -116, 117, 58, 74, -48, 26, -121, 59, -115, 122, 49}, new byte[]{-79, 106, -9, 114, -29, 28, 94, 100});
    public int OooO00o;
    public String OooO0O0;

    public static void OooO00o(Icon icon, Context context, boolean z) throws IllegalAccessException, IllegalArgumentException {
        if (icon == null) {
            return;
        }
        l81 l81Var = sf0.OooO0OO;
        if ((l81Var != null ? ((Integer) l81Var.OooO0O0(icon)).intValue() : -1) == 2) {
            if (z) {
                Resources resources = context.getResources();
                l81 l81Var2 = sf0.OooO00o;
                if (l81Var2 != null) {
                    l81Var2.OooO0oo(icon, resources);
                }
                String packageName = context.getPackageName();
                l81 l81Var3 = sf0.OooO0O0;
                if (l81Var3 != null) {
                    l81Var3.OooO0oo(icon, packageName);
                    return;
                }
                return;
            }
            Bitmap bitmapOooO00o = iq2.OooO00o(icon.loadDrawable(context));
            l81 l81Var4 = sf0.OooO00o;
            if (l81Var4 != null) {
                l81Var4.OooO0oo(icon, bitmapOooO00o);
            }
            l81 l81Var5 = sf0.OooO0O0;
            if (l81Var5 != null) {
                l81Var5.OooO0oo(icon, null);
            }
            if (l81Var != null) {
                l81Var.OooO0oo(icon, 1);
            }
        }
    }

    public final void OooO0O0(Notification notification) {
        Bundle bundle;
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        o00OO000 o00oo000 = vx0.OooO0Oo;
        Object objOooOooo = o00oo000 != null ? o00oo000.OooOooo(notification, new Object[0]) : null;
        if (objOooOooo == null || !objOooOooo.equals(Notification.MessagingStyle.class) || (bundle = notification.extras) == null) {
            return;
        }
        OooO0OO(notification, bundle.getParcelableArray(u7.OooO00o(new byte[]{-66, 68, -9, -82, 35, -67, 18, -33, -78, 79, -32, -81, 45, -77, 19, -126}, new byte[]{-33, 42, -109, -36, 76, -44, 118, -15})));
        OooO0OO(notification, notification.extras.getParcelableArray(u7.OooO00o(new byte[]{38, -123, -56, -7, 55, -3, 97, 5, 42, -114, -33, -8, 57, -13, 96, 88, 105, -125, -59, -8, 44, -5, 119, 66, 36}, new byte[]{71, -21, -84, -117, 88, -108, 5, 43})));
    }

    public final void OooO0OO(Notification notification, Parcelable[] parcelableArr) {
        if (notification == null || parcelableArr == null) {
            return;
        }
        a02 a02Var = tx0.OooO00o;
        List<Notification.MessagingStyle.Message> arrayList = a02Var != null ? (List) a02Var.OooO0o0(parcelableArr) : new ArrayList();
        if (!fn2.OooO0o0(parcelableArr)) {
            for (Notification.MessagingStyle.Message message : arrayList) {
                message.setData(message.getDataMimeType(), lr2.OooO0O0(this.OooO00o, message.getDataUri(), this.OooO0O0));
            }
        }
        boolean zOooO0oo = yn2.OooO0oo();
        Bundle bundle = notification.extras;
        if (zOooO0oo) {
            String strOooO00o = u7.OooO00o(new byte[]{90, 46, 47, -127, 91, 50, 64, 84, 86, 37, 56, -128, 85, 60, 65, 9}, new byte[]{59, 64, 75, -13, 52, 91, 36, 122});
            a02 a02Var2 = ux0.OooO00o;
            bundle.putParcelableArray(strOooO00o, (Parcelable[]) (a02Var2 != null ? a02Var2.OooO0o0(arrayList, Boolean.FALSE, 0) : new ArrayList()));
        } else {
            String strOooO00o2 = u7.OooO00o(new byte[]{-70, 107, -124, -31, -20, 104, 69, 73, -74, 96, -109, -32, -30, 102, 68, 20}, new byte[]{-37, 5, -32, -109, -125, 1, 33, 103});
            a02 a02Var3 = tx0.OooO0O0;
            bundle.putParcelableArray(strOooO00o2, (Parcelable[]) (a02Var3 != null ? a02Var3.OooO0o0(arrayList) : new ArrayList()));
        }
    }

    public final boolean OooO0Oo(Context context, String str, Notification notification) throws IllegalAccessException, IllegalArgumentException {
        l81 l81Var;
        l81 l81Var2;
        l81 l81Var3;
        l81 l81Var4;
        boolean z = false;
        if (notification != null) {
            ApplicationInfo applicationInfo = qx1.OooO0oO;
            if (applicationInfo == null) {
                applicationInfo = null;
            }
            PackageInfo packageInfoOooO0oo = mx1.OooO0oO().OooO0oo(this.OooO00o, 1024, str);
            Object objOooO00o = b8.OooO00o();
            try {
                try {
                    PackageInfo packageInfo = e92.OooO00o.getPackageManager().getPackageInfo(str, 1024);
                    if (packageInfoOooO0oo != null) {
                        if (packageInfo != null && packageInfoOooO0oo.versionCode == packageInfo.versionCode) {
                            z = true;
                        }
                        xb1 xb1Var = sx0.OooO00o;
                        Notification.Builder builder = xb1Var != null ? (Notification.Builder) xb1Var.Oooo000(context, notification) : null;
                        if (builder != null) {
                            Notification notificationBuild = builder.build();
                            if (notification.tickerView == null) {
                                notification.tickerView = notificationBuild.tickerView;
                            }
                            if (notification.contentView == null) {
                                notification.contentView = notificationBuild.contentView;
                            }
                            if (notification.bigContentView == null) {
                                notification.bigContentView = notificationBuild.bigContentView;
                            }
                            if (notification.headsUpContentView == null) {
                                notification.headsUpContentView = notificationBuild.headsUpContentView;
                            }
                        }
                        OooO00o(notification.getSmallIcon(), context, z);
                        OooO00o(notification.getLargeIcon(), context, z);
                        notification.icon = applicationInfo.icon;
                        ApplicationInfo applicationInfo2 = z ? packageInfo.applicationInfo : packageInfoOooO0oo.applicationInfo;
                        applicationInfo2.targetSdkVersion = 22;
                        RemoteViews remoteViews = notification.tickerView;
                        if (remoteViews != null && (l81Var4 = g91.OooO00o) != null) {
                            l81Var4.OooO0oo(remoteViews, applicationInfo2);
                        }
                        RemoteViews remoteViews2 = notification.contentView;
                        if (remoteViews2 != null && (l81Var3 = g91.OooO00o) != null) {
                            l81Var3.OooO0oo(remoteViews2, applicationInfo2);
                        }
                        RemoteViews remoteViews3 = notification.bigContentView;
                        if (remoteViews3 != null && (l81Var2 = g91.OooO00o) != null) {
                            l81Var2.OooO0oo(remoteViews3, applicationInfo2);
                        }
                        RemoteViews remoteViews4 = notification.headsUpContentView;
                        if (remoteViews4 != null && (l81Var = g91.OooO00o) != null) {
                            l81Var.OooO0oo(remoteViews4, applicationInfo2);
                        }
                        l81 l81Var5 = vx0.OooO0O0;
                        Bundle bundle = l81Var5 != null ? (Bundle) l81Var5.OooO0O0(notification) : null;
                        if (bundle != null) {
                            bundle.putParcelable(OooO0OO, applicationInfo2);
                        }
                        return true;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } finally {
                b8.OooO0O0(objOooO00o);
            }
        }
        return false;
    }
}
