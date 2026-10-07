package com.cmaster.cloner;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.provider.Settings;
import android.view.MenuItem;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class cj {
    public static void OooO(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static Notification.Builder OooO00o(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static NotificationChannel OooO0O0(String str, CharSequence charSequence) {
        return new NotificationChannel(str, charSequence, 3);
    }

    public static void OooO0OO(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static Icon OooO0Oo(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void OooO0o(NotificationChannel notificationChannel) {
        notificationChannel.enableVibration(false);
    }

    public static void OooO0o0(NotificationChannel notificationChannel) {
        notificationChannel.enableLights(false);
    }

    public static float OooO0oO(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float OooO0oo(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void OooOO0(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void OooOO0O(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void OooOO0o(NotificationChannel notificationChannel) {
        notificationChannel.setDescription(null);
    }

    public static void OooOOO(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void OooOOO0(NotificationChannel notificationChannel) {
        notificationChannel.setGroup(null);
    }

    public static void OooOOOO(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void OooOOOo(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void OooOOo(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void OooOOo0(NotificationChannel notificationChannel) {
        notificationChannel.setLightColor(0);
    }

    public static void OooOOoo(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void OooOo(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void OooOo0(NotificationChannel notificationChannel) {
        notificationChannel.setShowBadge(true);
    }

    public static void OooOo00(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void OooOo0O(NotificationChannel notificationChannel) {
        notificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
    }

    public static void OooOo0o(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void OooOoO(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static void OooOoO0(NotificationChannel notificationChannel) {
        notificationChannel.setVibrationPattern(null);
    }
}
