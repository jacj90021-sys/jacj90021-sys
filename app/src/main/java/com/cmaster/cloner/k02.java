package com.cmaster.cloner;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k02 extends xt0 {
    public final /* synthetic */ int OooO0OO = 1;
    public final Context OooO0Oo;

    public k02(Context context) {
        super(9, 10);
        this.OooO0Oo = context;
    }

    @Override // com.cmaster.cloner.xt0
    public final void OooO00o(c30 c30Var) throws SQLException {
        int i = this.OooO0OO;
        Context context = this.OooO0Oo;
        switch (i) {
            case 0:
                if (this.OooO0O0 >= 10) {
                    c30Var.OooOOOO(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                c30Var.OooOOO("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    c30Var.OooO0OO();
                    try {
                        c30Var.OooOOOO(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        c30Var.OooOOOO(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        c30Var.OooOo00();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    c30Var.OooO0OO();
                    try {
                        c30Var.OooOOOO(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        c30Var.OooOOOO(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        c30Var.OooOo00();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public k02(Context context, int i, int i2) {
        super(i, i2);
        this.OooO0Oo = context;
    }
}
