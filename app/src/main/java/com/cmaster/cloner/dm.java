package com.cmaster.cloner;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dm implements Runnable {
    public final /* synthetic */ int OooO0Oo = 1;
    public final /* synthetic */ int OooO0o;
    public final /* synthetic */ int OooO0o0;
    public final /* synthetic */ Parcelable OooO0oO;
    public final /* synthetic */ Object OooO0oo;

    public dm(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.OooO0oo = systemForegroundService;
        this.OooO0o0 = i;
        this.OooO0oO = notification;
        this.OooO0o = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        int i2 = this.OooO0o;
        Object obj = this.OooO0oo;
        int i3 = this.OooO0o0;
        Parcelable parcelable = this.OooO0oO;
        switch (i) {
            case 0:
                ((fm) obj).OooO0o0.onActivityResized(i3, i2, (Bundle) parcelable);
                break;
            default:
                Notification notification = (Notification) parcelable;
                SystemForegroundService systemForegroundService = (SystemForegroundService) obj;
                if (Build.VERSION.SDK_INT < 29) {
                    systemForegroundService.startForeground(i3, notification);
                    break;
                } else {
                    systemForegroundService.startForeground(i3, notification, i2);
                    break;
                }
        }
    }

    public dm(fm fmVar, int i, int i2, Bundle bundle) {
        this.OooO0oo = fmVar;
        this.OooO0o0 = i;
        this.OooO0o = i2;
        this.OooO0oO = bundle;
    }
}
