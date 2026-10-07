package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class el1 implements hx {
    public static final String OooOOO = ep0.OooO("SystemAlarmDispatcher");
    public final cf OooO;
    public final Context OooO0Oo;
    public final a12 OooO0o;
    public final zl1 OooO0o0;
    public final g51 OooO0oO;
    public final q02 OooO0oo;
    public final Handler OooOO0;
    public final ArrayList OooOO0O;
    public Intent OooOO0o;
    public SystemAlarmService OooOOO0;

    public el1(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.OooO0Oo = applicationContext;
        this.OooO = new cf(applicationContext);
        this.OooO0o = new a12();
        q02 q02VarOooO0O0 = q02.OooO0O0(systemAlarmService);
        this.OooO0oo = q02VarOooO0O0;
        g51 g51Var = q02VarOooO0O0.OooO0o;
        this.OooO0oO = g51Var;
        this.OooO0o0 = q02VarOooO0O0.OooO0Oo;
        g51Var.OooO00o(this);
        this.OooOO0O = new ArrayList();
        this.OooOO0o = null;
        this.OooOO0 = new Handler(Looper.getMainLooper());
    }

    public final void OooO00o(int i, Intent intent) {
        ep0 ep0VarOooO0oO = ep0.OooO0oO();
        String str = OooOOO;
        int i2 = 0;
        ep0VarOooO0oO.OooO0Oo(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        OooO0OO();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            ep0.OooO0oO().OooOOO(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            OooO0OO();
            synchronized (this.OooOO0O) {
                try {
                    ArrayList arrayList = this.OooOO0O;
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.OooOO0O) {
            try {
                boolean zIsEmpty = this.OooOO0O.isEmpty();
                this.OooOO0O.add(intent);
                if (zIsEmpty) {
                    OooO0o();
                }
            } finally {
            }
        }
    }

    @Override // com.cmaster.cloner.hx
    public final void OooO0O0(String str, boolean z) {
        String str2 = cf.OooO0oO;
        Intent intent = new Intent(this.OooO0Oo, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        OooO0o0(new n0(this, intent, 0, 5));
    }

    public final void OooO0OO() {
        if (this.OooOO0.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        qa.OooO0o("Needs to be invoked on the main thread.");
    }

    public final void OooO0Oo() {
        ep0.OooO0oO().OooO0Oo(OooOOO, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.OooO0oO.OooO0o0(this);
        ScheduledExecutorService scheduledExecutorService = this.OooO0o.OooO00o;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.OooOOO0 = null;
    }

    public final void OooO0o() {
        OooO0OO();
        PowerManager.WakeLock wakeLockOooO00o = xx1.OooO00o(this.OooO0Oo, "ProcessCommand");
        try {
            wakeLockOooO00o.acquire();
            this.OooO0oo.OooO0Oo.OooOOOo(new dl1(this, 0));
        } finally {
            wakeLockOooO00o.release();
        }
    }

    public final void OooO0o0(Runnable runnable) {
        this.OooOO0.post(runnable);
    }
}
