package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jp implements f02, hx {
    public static final String OooOOO0 = ep0.OooO("DelayMetCommandHandler");
    public final Context OooO0Oo;
    public final String OooO0o;
    public final int OooO0o0;
    public final el1 OooO0oO;
    public final g02 OooO0oo;
    public PowerManager.WakeLock OooOO0O;
    public boolean OooOO0o = false;
    public int OooOO0 = 0;
    public final Object OooO = new Object();

    public jp(Context context, int i, String str, el1 el1Var) {
        this.OooO0Oo = context;
        this.OooO0o0 = i;
        this.OooO0oO = el1Var;
        this.OooO0o = str;
        this.OooO0oo = new g02(context, el1Var.OooO0o0, this);
    }

    public final void OooO00o() {
        synchronized (this.OooO) {
            try {
                this.OooO0oo.OooO0OO();
                this.OooO0oO.OooO0o.OooO0O0(this.OooO0o);
                PowerManager.WakeLock wakeLock = this.OooOO0O;
                if (wakeLock != null && wakeLock.isHeld()) {
                    ep0.OooO0oO().OooO0Oo(OooOOO0, "Releasing wakelock " + this.OooOO0O + " for WorkSpec " + this.OooO0o, new Throwable[0]);
                    this.OooOO0O.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.hx
    public final void OooO0O0(String str, boolean z) {
        ep0.OooO0oO().OooO0Oo(OooOOO0, "onExecuted " + str + ", " + z, new Throwable[0]);
        OooO00o();
        int i = 5;
        int i2 = this.OooO0o0;
        el1 el1Var = this.OooO0oO;
        Context context = this.OooO0Oo;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            intent.putExtra("KEY_WORKSPEC_ID", this.OooO0o);
            el1Var.OooO0o0(new n0(el1Var, intent, i2, i));
        }
        if (this.OooOO0o) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            el1Var.OooO0o0(new n0(el1Var, intent2, i2, i));
        }
    }

    public final void OooO0OO() {
        StringBuilder sb = new StringBuilder();
        String str = this.OooO0o;
        sb.append(str);
        sb.append(" (");
        sb.append(this.OooO0o0);
        sb.append(")");
        this.OooOO0O = xx1.OooO00o(this.OooO0Oo, sb.toString());
        ep0 ep0VarOooO0oO = ep0.OooO0oO();
        PowerManager.WakeLock wakeLock = this.OooOO0O;
        String str2 = OooOOO0;
        ep0VarOooO0oO.OooO0Oo(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.OooOO0O.acquire();
        w02 w02VarOooO0oo = this.OooO0oO.OooO0oo.OooO0OO.OooOo0o().OooO0oo(str);
        if (w02VarOooO0oo == null) {
            OooO0o0();
            return;
        }
        boolean zOooO0O0 = w02VarOooO0oo.OooO0O0();
        this.OooOO0o = zOooO0O0;
        if (zOooO0O0) {
            this.OooO0oo.OooO0O0(Collections.singletonList(w02VarOooO0oo));
        } else {
            ep0.OooO0oO().OooO0Oo(str2, rj.OooO0OO("No constraints for ", str), new Throwable[0]);
            OooO0o(Collections.singletonList(str));
        }
    }

    @Override // com.cmaster.cloner.f02
    public final void OooO0Oo(ArrayList arrayList) {
        OooO0o0();
    }

    @Override // com.cmaster.cloner.f02
    public final void OooO0o(List list) {
        if (list.contains(this.OooO0o)) {
            synchronized (this.OooO) {
                try {
                    if (this.OooOO0 == 0) {
                        this.OooOO0 = 1;
                        ep0.OooO0oO().OooO0Oo(OooOOO0, "onAllConstraintsMet for " + this.OooO0o, new Throwable[0]);
                        if (this.OooO0oO.OooO0oO.OooO0oO(this.OooO0o, null)) {
                            this.OooO0oO.OooO0o.OooO00o(this.OooO0o, this);
                        } else {
                            OooO00o();
                        }
                    } else {
                        ep0.OooO0oO().OooO0Oo(OooOOO0, "Already started work for " + this.OooO0o, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void OooO0o0() {
        synchronized (this.OooO) {
            try {
                if (this.OooOO0 < 2) {
                    this.OooOO0 = 2;
                    ep0 ep0VarOooO0oO = ep0.OooO0oO();
                    String str = OooOOO0;
                    ep0VarOooO0oO.OooO0Oo(str, "Stopping work for WorkSpec " + this.OooO0o, new Throwable[0]);
                    Context context = this.OooO0Oo;
                    String str2 = this.OooO0o;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    el1 el1Var = this.OooO0oO;
                    int i = 5;
                    el1Var.OooO0o0(new n0(el1Var, intent, this.OooO0o0, i));
                    if (this.OooO0oO.OooO0oO.OooO0Oo(this.OooO0o)) {
                        ep0.OooO0oO().OooO0Oo(str, "WorkSpec " + this.OooO0o + " needs to be rescheduled", new Throwable[0]);
                        Context context2 = this.OooO0Oo;
                        String str3 = this.OooO0o;
                        Intent intent2 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent2.setAction("ACTION_SCHEDULE_WORK");
                        intent2.putExtra("KEY_WORKSPEC_ID", str3);
                        el1 el1Var2 = this.OooO0oO;
                        el1Var2.OooO0o0(new n0(el1Var2, intent2, this.OooO0o0, i));
                    } else {
                        ep0.OooO0oO().OooO0Oo(str, "Processor does not have WorkSpec " + this.OooO0o + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    ep0.OooO0oO().OooO0Oo(OooOOO0, "Already stopped work for " + this.OooO0o, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
