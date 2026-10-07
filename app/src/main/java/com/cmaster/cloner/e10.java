package com.cmaster.cloner;

import android.app.Notification;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e10 {
    public final int OooO00o;
    public final int OooO0O0;
    public final Notification OooO0OO;

    public e10(int i, Notification notification, int i2) {
        this.OooO00o = i;
        this.OooO0OO = notification;
        this.OooO0O0 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e10.class != obj.getClass()) {
            return false;
        }
        e10 e10Var = (e10) obj;
        if (this.OooO00o == e10Var.OooO00o && this.OooO0O0 == e10Var.OooO0O0) {
            return this.OooO0OO.equals(e10Var.OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0OO.hashCode() + (((this.OooO00o * 31) + this.OooO0O0) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.OooO00o + ", mForegroundServiceType=" + this.OooO0O0 + ", mNotification=" + this.OooO0OO + '}';
    }
}
