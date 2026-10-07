package com.cmaster.cloner;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class FIEL$Job extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        try {
            return (IBinder) o63.OooO00o.invoke(null, 10002, new Object[]{this, intent});
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            o63.OooO00o.invoke(null, 10101, new Object[]{this});
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        try {
            o63.OooO00o.invoke(null, 10105, new Object[]{this});
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        try {
            o63.OooO00o.invoke(null, 10106, new Object[]{this, intent});
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        try {
            return ((Integer) o63.OooO00o.invoke(null, 10102, new Object[]{this, intent, Integer.valueOf(i), Integer.valueOf(i2)})).intValue();
        } catch (Throwable unused) {
            return 2;
        }
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        try {
            o63.OooO00o.invoke(null, 10107, new Object[]{this, intent});
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        try {
            return ((Boolean) o63.OooO00o.invoke(null, 10003, new Object[]{this, intent})).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }
}
