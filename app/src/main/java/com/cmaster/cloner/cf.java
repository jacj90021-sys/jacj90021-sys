package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cf implements hx {
    public static final String OooO0oO = ep0.OooO("CommandHandler");
    public final Context OooO0Oo;
    public final HashMap OooO0o0 = new HashMap();
    public final Object OooO0o = new Object();

    public cf(Context context) {
        this.OooO0Oo = context;
    }

    public static Intent OooO00o(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // com.cmaster.cloner.hx
    public final void OooO0O0(String str, boolean z) {
        synchronized (this.OooO0o) {
            try {
                hx hxVar = (hx) this.OooO0o0.remove(str);
                if (hxVar != null) {
                    hxVar.OooO0O0(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO(Intent intent, int i, el1 el1Var) {
        String action = intent.getAction();
        int i2 = 5;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            ep0.OooO0oO().OooO0Oo(OooO0oO, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.OooO0Oo;
            li liVar = new li(context, i, el1Var);
            g02 g02Var = liVar.OooO0O0;
            ArrayList arrayListOooO0Oo = el1Var.OooO0oo.OooO0OO.OooOo0o().OooO0Oo();
            String str = yh.OooO00o;
            int size = arrayListOooO0Oo.size();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListOooO0Oo.get(i3);
                i3++;
                ji jiVar = ((w02) obj).OooOO0;
                z |= jiVar.OooO0Oo;
                z2 |= jiVar.OooO0O0;
                z3 |= jiVar.OooO0o0;
                z4 |= jiVar.OooO00o != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.OooO00o;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            g02Var.OooO0O0(arrayListOooO0Oo);
            ArrayList arrayList = new ArrayList(arrayListOooO0Oo.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListOooO0Oo.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayListOooO0Oo.get(i4);
                i4++;
                w02 w02Var = (w02) obj2;
                String str3 = w02Var.OooO00o;
                if (jCurrentTimeMillis >= w02Var.OooO00o() && (!w02Var.OooO0O0() || g02Var.OooO00o(str3))) {
                    arrayList.add(w02Var);
                }
            }
            int size3 = arrayList.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList.get(i5);
                i5++;
                String str4 = ((w02) obj3).OooO00o;
                Intent intentOooO00o = OooO00o(context, str4);
                ep0.OooO0oO().OooO0Oo(li.OooO0OO, px0.OooOOOO("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                el1Var.OooO0o0(new n0(el1Var, intentOooO00o, liVar.OooO00o, i2));
            }
            g02Var.OooO0OO();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            ep0.OooO0oO().OooO0Oo(OooO0oO, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            el1Var.OooO0oo.OooO0o0();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            ep0.OooO0oO().OooO0o(OooO0oO, px0.OooOOOO("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.OooO0o) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        ep0 ep0VarOooO0oO = ep0.OooO0oO();
                        String str5 = OooO0oO;
                        ep0VarOooO0oO.OooO0Oo(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.OooO0o0.containsKey(string)) {
                            ep0.OooO0oO().OooO0Oo(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            jp jpVar = new jp(this.OooO0Oo, i, string, el1Var);
                            this.OooO0o0.put(string, jpVar);
                            jpVar.OooO0OO();
                        }
                    } finally {
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    ep0.OooO0oO().OooOOO(OooO0oO, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z5 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                ep0.OooO0oO().OooO0Oo(OooO0oO, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
                OooO0O0(string2, z5);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            ep0.OooO0oO().OooO0Oo(OooO0oO, rj.OooO0OO("Handing stopWork work for ", string3), new Throwable[0]);
            el1Var.OooO0oo.OooO0oO(string3);
            Context context2 = this.OooO0Oo;
            q02 q02Var = el1Var.OooO0oo;
            String str6 = oO00o000.OooO00o;
            hx2 hx2VarOooOo00 = q02Var.OooO0OO.OooOo00();
            gl1 gl1VarOooOOo = hx2VarOooOo00.OooOOo(string3);
            if (gl1VarOooOOo != null) {
                oO00o000.OooO00o(context2, string3, gl1VarOooOOo.OooO0O0);
                ep0.OooO0oO().OooO0Oo(oO00o000.OooO00o, px0.OooOOOO("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                hx2VarOooOo00.OooOoO(string3);
            }
            el1Var.OooO0O0(string3, false);
            return;
        }
        Context context3 = this.OooO0Oo;
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        ep0 ep0VarOooO0oO2 = ep0.OooO0oO();
        String str7 = OooO0oO;
        ep0VarOooO0oO2.OooO0Oo(str7, rj.OooO0OO("Handling schedule work for ", string4), new Throwable[0]);
        q02 q02Var2 = el1Var.OooO0oo;
        WorkDatabase workDatabase = q02Var2.OooO0OO;
        workDatabase.OooO0OO();
        try {
            w02 w02VarOooO0oo = workDatabase.OooOo0o().OooO0oo(string4);
            if (w02VarOooO0oo == null) {
                ep0.OooO0oO().OooOOO(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (px0.OooO0Oo(w02VarOooO0oo.OooO0O0)) {
                ep0.OooO0oO().OooOOO(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
                return;
            }
            long jOooO00o = w02VarOooO0oo.OooO00o();
            if (w02VarOooO0oo.OooO0O0()) {
                ep0.OooO0oO().OooO0Oo(str7, "Opportunistically setting an alarm for " + string4 + " at " + jOooO00o, new Throwable[0]);
                oO00o000.OooO0O0(context3, q02Var2, string4, jOooO00o);
                Intent intent3 = new Intent(context3, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                el1Var.OooO0o0(new n0(el1Var, intent3, i, i2));
            } else {
                ep0.OooO0oO().OooO0Oo(str7, "Setting up Alarms for " + string4 + " at " + jOooO00o, new Throwable[0]);
                oO00o000.OooO0O0(context3, q02Var2, string4, jOooO00o);
            }
            workDatabase.OooOOo0();
        } finally {
            workDatabase.OooOOO();
        }
    }
}
