package com.cmaster.cloner;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y82 {
    public static /* synthetic */ NotificationChannel OooO0Oo(int i) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i);
    }

    public static /* synthetic */ AudioFocusRequest.Builder OooO0oO() {
        return new AudioFocusRequest.Builder(1);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest OooOO0o(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* synthetic */ void OooOOO() {
    }
}
