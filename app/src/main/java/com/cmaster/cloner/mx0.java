package com.cmaster.cloner;

import android.app.Notification;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mx0 extends OooOO0O {
    public CharSequence OooO0o0;

    @Override // com.cmaster.cloner.OooOO0O
    public final void OooO0OO(ho1 ho1Var) {
        new Notification.BigTextStyle((Notification.Builder) ho1Var.OooO0o).setBigContentTitle(null).bigText(this.OooO0o0);
    }

    @Override // com.cmaster.cloner.OooOO0O
    public final String OooO0o() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
