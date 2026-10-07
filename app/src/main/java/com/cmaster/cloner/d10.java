package com.cmaster.cloner;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class d10 implements Runnable {
    public static final String OooO0oO = ep0.OooO("ForceStopRunnable");
    public static final long OooO0oo = 315360000000L;
    public final Context OooO0Oo;
    public int OooO0o = 0;
    public final q02 OooO0o0;

    public d10(Context context, q02 q02Var) {
        this.OooO0Oo = context.getApplicationContext();
        this.OooO0o0 = q02Var;
    }

    public static void OooO0OO(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = l9.OooO00o() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + OooO0oo;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO00o() {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.d10.OooO00o():void");
    }

    public final boolean OooO0O0() {
        xf1 xf1Var = this.OooO0o0.OooO0O0;
        xf1Var.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = OooO0oO;
        if (zIsEmpty) {
            ep0.OooO0oO().OooO0Oo(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zOooO00o = f51.OooO00o(this.OooO0Oo, xf1Var);
        ep0.OooO0oO().OooO0Oo(str, "Is default app process = " + zOooO00o, new Throwable[0]);
        return zOooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = OooO0oO;
        q02 q02Var = this.OooO0o0;
        try {
            if (!OooO0O0()) {
                return;
            }
            while (true) {
                l02.OooO00o(this.OooO0Oo);
                ep0.OooO0oO().OooO0Oo(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    OooO00o();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i = this.OooO0o + 1;
                    this.OooO0o = i;
                    if (i >= 3) {
                        ep0.OooO0oO().OooO0o(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        q02Var.OooO0O0.getClass();
                        throw illegalStateException;
                    }
                    long j = i * 300;
                    ep0.OooO0oO().OooO0Oo(str, "Retrying after " + j, e);
                    try {
                        Thread.sleep(this.OooO0o * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            q02Var.OooO0Oo();
        }
    }
}
