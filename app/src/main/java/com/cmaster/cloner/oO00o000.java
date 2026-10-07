package com.cmaster.cloner;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class oO00o000 {
    public static final String OooO00o = ep0.OooO("Alarms");

    public static void OooO00o(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, cf.OooO00o(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        ep0.OooO0oO().OooO0Oo(OooO00o, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void OooO0O0(Context context, q02 q02Var, String str, long j) {
        int iIntValue;
        WorkDatabase workDatabase = q02Var.OooO0OO;
        hx2 hx2VarOooOo00 = workDatabase.OooOo00();
        gl1 gl1VarOooOOo = hx2VarOooOo00.OooOOo(str);
        if (gl1VarOooOOo != null) {
            OooO00o(context, str, gl1VarOooOOo.OooO0O0);
            int i = gl1VarOooOOo.OooO0O0;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i, cf.OooO00o(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (tf0.class) {
            workDatabase.OooO0OO();
            try {
                Long lOooOooO = workDatabase.OooOOoo().OooOooO("next_alarm_manager_id");
                iIntValue = lOooOooO != null ? lOooOooO.intValue() : 0;
                workDatabase.OooOOoo().Oooo0o0(new f41("next_alarm_manager_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.OooOOo0();
                workDatabase.OooOOO();
            } catch (Throwable th) {
                workDatabase.OooOOO();
                throw th;
            }
        }
        hx2VarOooOo00.OooOo0O(new gl1(str, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, cf.OooO00o(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
