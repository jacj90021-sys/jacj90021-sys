package com.cmaster.cloner;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class FIEL$PS extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        o63.OooO0OO(this, intent, 4);
        stopSelf();
        return 2;
    }
}
