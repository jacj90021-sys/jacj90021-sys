package com.cmaster.cloner;

import android.database.Cursor;
import android.database.SQLException;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0O00000 implements xs1 {

    public o0O00000() {
    }
    public Object OooO;
    public Object OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;
    public Object OooO0oO;
    public Object OooO0oo;
    public Object OooOO0;
    public Object OooOO0O;
    public Object OooOO0o;

    public o0O00000(WorkDatabase_Impl workDatabase_Impl) {
        this.OooO0Oo = workDatabase_Impl;
        int i = 5;
        this.OooO0o0 = new sp(workDatabase_Impl, i);
        this.OooO0o = new hl1(workDatabase_Impl, 3);
        this.OooO0oO = new hl1(workDatabase_Impl, 4);
        this.OooO0oo = new hl1(workDatabase_Impl, i);
        this.OooO = new hl1(workDatabase_Impl, 6);
        this.OooOO0 = new hl1(workDatabase_Impl, 7);
        this.OooOO0O = new hl1(workDatabase_Impl, 8);
        this.OooOO0o = new hl1(workDatabase_Impl, 9);
        new hl1(workDatabase_Impl, 10);
    }

    public void OooO(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0Oo;
        workDatabase_Impl.OooO0O0();
        hl1 hl1Var = (hl1) this.OooOO0O;
        j30 j30VarOooO00o = hl1Var.OooO00o();
        j30VarOooO00o.OooO00o(1, j);
        if (str == null) {
            j30VarOooO00o.OooO0O0(2);
        } else {
            j30VarOooO00o.OooO0Oo(2, str);
        }
        workDatabase_Impl.OooO0OO();
        try {
            j30VarOooO00o.OooO0OO();
            workDatabase_Impl.OooOOo0();
        } finally {
            workDatabase_Impl.OooOOO();
            hl1Var.OooO0OO(j30VarOooO00o);
        }
    }

    public ArrayList OooO00o() throws Throwable {
        wb1 wb1Var;
        int iOooO00o;
        int iOooO00o2;
        int iOooO00o3;
        int iOooO00o4;
        int iOooO00o5;
        int iOooO00o6;
        int iOooO00o7;
        int iOooO00o8;
        int iOooO00o9;
        int iOooO00o10;
        int iOooO00o11;
        int iOooO00o12;
        int iOooO00o13;
        int iOooO00o14;
        wb1 wb1VarOooO0OO = wb1.OooO0OO(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        wb1VarOooO0OO.OooO00o(1, 200L);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0Oo;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO0OO = aq2.OooO0OO(workDatabase_Impl, wb1VarOooO0OO);
        try {
            iOooO00o = wp2.OooO00o(cursorOooO0OO, "required_network_type");
            iOooO00o2 = wp2.OooO00o(cursorOooO0OO, "requires_charging");
            iOooO00o3 = wp2.OooO00o(cursorOooO0OO, "requires_device_idle");
            iOooO00o4 = wp2.OooO00o(cursorOooO0OO, "requires_battery_not_low");
            iOooO00o5 = wp2.OooO00o(cursorOooO0OO, "requires_storage_not_low");
            iOooO00o6 = wp2.OooO00o(cursorOooO0OO, "trigger_content_update_delay");
            iOooO00o7 = wp2.OooO00o(cursorOooO0OO, "trigger_max_content_delay");
            iOooO00o8 = wp2.OooO00o(cursorOooO0OO, "content_uri_triggers");
            iOooO00o9 = wp2.OooO00o(cursorOooO0OO, "id");
            iOooO00o10 = wp2.OooO00o(cursorOooO0OO, "state");
            iOooO00o11 = wp2.OooO00o(cursorOooO0OO, "worker_class_name");
            iOooO00o12 = wp2.OooO00o(cursorOooO0OO, "input_merger_class_name");
            iOooO00o13 = wp2.OooO00o(cursorOooO0OO, "input");
            iOooO00o14 = wp2.OooO00o(cursorOooO0OO, "output");
            wb1Var = wb1VarOooO0OO;
        } catch (Throwable th) {
            th = th;
            wb1Var = wb1VarOooO0OO;
        }
        try {
            int iOooO00o15 = wp2.OooO00o(cursorOooO0OO, "initial_delay");
            int iOooO00o16 = wp2.OooO00o(cursorOooO0OO, "interval_duration");
            int iOooO00o17 = wp2.OooO00o(cursorOooO0OO, "flex_duration");
            int iOooO00o18 = wp2.OooO00o(cursorOooO0OO, "run_attempt_count");
            int iOooO00o19 = wp2.OooO00o(cursorOooO0OO, "backoff_policy");
            int iOooO00o20 = wp2.OooO00o(cursorOooO0OO, "backoff_delay_duration");
            int iOooO00o21 = wp2.OooO00o(cursorOooO0OO, "period_start_time");
            int iOooO00o22 = wp2.OooO00o(cursorOooO0OO, "minimum_retention_duration");
            int iOooO00o23 = wp2.OooO00o(cursorOooO0OO, "schedule_requested_at");
            int iOooO00o24 = wp2.OooO00o(cursorOooO0OO, "run_in_foreground");
            int iOooO00o25 = wp2.OooO00o(cursorOooO0OO, "out_of_quota_policy");
            int i = iOooO00o14;
            ArrayList arrayList = new ArrayList(cursorOooO0OO.getCount());
            while (cursorOooO0OO.moveToNext()) {
                String string = cursorOooO0OO.getString(iOooO00o9);
                int i2 = iOooO00o9;
                String string2 = cursorOooO0OO.getString(iOooO00o11);
                int i3 = iOooO00o11;
                ji jiVar = new ji();
                int i4 = iOooO00o;
                jiVar.OooO00o = v63.OooO0OO(cursorOooO0OO.getInt(iOooO00o));
                jiVar.OooO0O0 = cursorOooO0OO.getInt(iOooO00o2) != 0;
                jiVar.OooO0OO = cursorOooO0OO.getInt(iOooO00o3) != 0;
                jiVar.OooO0Oo = cursorOooO0OO.getInt(iOooO00o4) != 0;
                jiVar.OooO0o0 = cursorOooO0OO.getInt(iOooO00o5) != 0;
                int i5 = iOooO00o2;
                jiVar.OooO0o = cursorOooO0OO.getLong(iOooO00o6);
                jiVar.OooO0oO = cursorOooO0OO.getLong(iOooO00o7);
                jiVar.OooO0oo = v63.OooO00o(cursorOooO0OO.getBlob(iOooO00o8));
                w02 w02Var = new w02(string, string2);
                w02Var.OooO0O0 = v63.OooO0o0(cursorOooO0OO.getInt(iOooO00o10));
                w02Var.OooO0Oo = cursorOooO0OO.getString(iOooO00o12);
                w02Var.OooO0o0 = cn.OooO00o(cursorOooO0OO.getBlob(iOooO00o13));
                int i6 = i;
                w02Var.OooO0o = cn.OooO00o(cursorOooO0OO.getBlob(i6));
                int i7 = iOooO00o15;
                int i8 = iOooO00o3;
                int i9 = iOooO00o4;
                w02Var.OooO0oO = cursorOooO0OO.getLong(i7);
                int i10 = iOooO00o16;
                int i11 = iOooO00o5;
                w02Var.OooO0oo = cursorOooO0OO.getLong(i10);
                int i12 = iOooO00o17;
                w02Var.OooO = cursorOooO0OO.getLong(i12);
                int i13 = iOooO00o18;
                w02Var.OooOO0O = cursorOooO0OO.getInt(i13);
                int i14 = iOooO00o19;
                i = i6;
                w02Var.OooOO0o = v63.OooO0O0(cursorOooO0OO.getInt(i14));
                iOooO00o18 = i13;
                iOooO00o19 = i14;
                int i15 = iOooO00o20;
                w02Var.OooOOO0 = cursorOooO0OO.getLong(i15);
                int i16 = iOooO00o21;
                w02Var.OooOOO = cursorOooO0OO.getLong(i16);
                int i17 = iOooO00o22;
                w02Var.OooOOOO = cursorOooO0OO.getLong(i17);
                iOooO00o22 = i17;
                int i18 = iOooO00o23;
                w02Var.OooOOOo = cursorOooO0OO.getLong(i18);
                int i19 = iOooO00o24;
                w02Var.OooOOo0 = cursorOooO0OO.getInt(i19) != 0;
                int i20 = iOooO00o25;
                w02Var.OooOOo = v63.OooO0Oo(cursorOooO0OO.getInt(i20));
                w02Var.OooOO0 = jiVar;
                arrayList.add(w02Var);
                iOooO00o25 = i20;
                iOooO00o23 = i18;
                iOooO00o4 = i9;
                iOooO00o9 = i2;
                iOooO00o11 = i3;
                iOooO00o = i4;
                iOooO00o3 = i8;
                iOooO00o15 = i7;
                iOooO00o21 = i16;
                iOooO00o5 = i11;
                iOooO00o16 = i10;
                iOooO00o17 = i12;
                iOooO00o20 = i15;
                iOooO00o24 = i19;
                iOooO00o2 = i5;
            }
            cursorOooO0OO.close();
            wb1Var.OooO0o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorOooO0OO.close();
            wb1Var.OooO0o();
            throw th;
        }
    }

    public ArrayList OooO0O0(int i) throws Throwable {
        wb1 wb1Var;
        int iOooO00o;
        int iOooO00o2;
        int iOooO00o3;
        int iOooO00o4;
        int iOooO00o5;
        int iOooO00o6;
        int iOooO00o7;
        int iOooO00o8;
        int iOooO00o9;
        int iOooO00o10;
        int iOooO00o11;
        int iOooO00o12;
        int iOooO00o13;
        int iOooO00o14;
        wb1 wb1VarOooO0OO = wb1.OooO0OO(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        wb1VarOooO0OO.OooO00o(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0Oo;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO0OO = aq2.OooO0OO(workDatabase_Impl, wb1VarOooO0OO);
        try {
            iOooO00o = wp2.OooO00o(cursorOooO0OO, "required_network_type");
            iOooO00o2 = wp2.OooO00o(cursorOooO0OO, "requires_charging");
            iOooO00o3 = wp2.OooO00o(cursorOooO0OO, "requires_device_idle");
            iOooO00o4 = wp2.OooO00o(cursorOooO0OO, "requires_battery_not_low");
            iOooO00o5 = wp2.OooO00o(cursorOooO0OO, "requires_storage_not_low");
            iOooO00o6 = wp2.OooO00o(cursorOooO0OO, "trigger_content_update_delay");
            iOooO00o7 = wp2.OooO00o(cursorOooO0OO, "trigger_max_content_delay");
            iOooO00o8 = wp2.OooO00o(cursorOooO0OO, "content_uri_triggers");
            iOooO00o9 = wp2.OooO00o(cursorOooO0OO, "id");
            iOooO00o10 = wp2.OooO00o(cursorOooO0OO, "state");
            iOooO00o11 = wp2.OooO00o(cursorOooO0OO, "worker_class_name");
            iOooO00o12 = wp2.OooO00o(cursorOooO0OO, "input_merger_class_name");
            iOooO00o13 = wp2.OooO00o(cursorOooO0OO, "input");
            iOooO00o14 = wp2.OooO00o(cursorOooO0OO, "output");
            wb1Var = wb1VarOooO0OO;
        } catch (Throwable th) {
            th = th;
            wb1Var = wb1VarOooO0OO;
        }
        try {
            int iOooO00o15 = wp2.OooO00o(cursorOooO0OO, "initial_delay");
            int iOooO00o16 = wp2.OooO00o(cursorOooO0OO, "interval_duration");
            int iOooO00o17 = wp2.OooO00o(cursorOooO0OO, "flex_duration");
            int iOooO00o18 = wp2.OooO00o(cursorOooO0OO, "run_attempt_count");
            int iOooO00o19 = wp2.OooO00o(cursorOooO0OO, "backoff_policy");
            int iOooO00o20 = wp2.OooO00o(cursorOooO0OO, "backoff_delay_duration");
            int iOooO00o21 = wp2.OooO00o(cursorOooO0OO, "period_start_time");
            int iOooO00o22 = wp2.OooO00o(cursorOooO0OO, "minimum_retention_duration");
            int iOooO00o23 = wp2.OooO00o(cursorOooO0OO, "schedule_requested_at");
            int iOooO00o24 = wp2.OooO00o(cursorOooO0OO, "run_in_foreground");
            int iOooO00o25 = wp2.OooO00o(cursorOooO0OO, "out_of_quota_policy");
            int i2 = iOooO00o14;
            ArrayList arrayList = new ArrayList(cursorOooO0OO.getCount());
            while (cursorOooO0OO.moveToNext()) {
                String string = cursorOooO0OO.getString(iOooO00o9);
                int i3 = iOooO00o9;
                String string2 = cursorOooO0OO.getString(iOooO00o11);
                int i4 = iOooO00o11;
                ji jiVar = new ji();
                int i5 = iOooO00o;
                jiVar.OooO00o = v63.OooO0OO(cursorOooO0OO.getInt(iOooO00o));
                jiVar.OooO0O0 = cursorOooO0OO.getInt(iOooO00o2) != 0;
                jiVar.OooO0OO = cursorOooO0OO.getInt(iOooO00o3) != 0;
                jiVar.OooO0Oo = cursorOooO0OO.getInt(iOooO00o4) != 0;
                jiVar.OooO0o0 = cursorOooO0OO.getInt(iOooO00o5) != 0;
                int i6 = iOooO00o2;
                jiVar.OooO0o = cursorOooO0OO.getLong(iOooO00o6);
                jiVar.OooO0oO = cursorOooO0OO.getLong(iOooO00o7);
                jiVar.OooO0oo = v63.OooO00o(cursorOooO0OO.getBlob(iOooO00o8));
                w02 w02Var = new w02(string, string2);
                w02Var.OooO0O0 = v63.OooO0o0(cursorOooO0OO.getInt(iOooO00o10));
                w02Var.OooO0Oo = cursorOooO0OO.getString(iOooO00o12);
                w02Var.OooO0o0 = cn.OooO00o(cursorOooO0OO.getBlob(iOooO00o13));
                int i7 = i2;
                w02Var.OooO0o = cn.OooO00o(cursorOooO0OO.getBlob(i7));
                int i8 = iOooO00o15;
                int i9 = iOooO00o3;
                int i10 = iOooO00o4;
                w02Var.OooO0oO = cursorOooO0OO.getLong(i8);
                int i11 = iOooO00o16;
                int i12 = iOooO00o5;
                w02Var.OooO0oo = cursorOooO0OO.getLong(i11);
                int i13 = iOooO00o17;
                w02Var.OooO = cursorOooO0OO.getLong(i13);
                int i14 = iOooO00o18;
                w02Var.OooOO0O = cursorOooO0OO.getInt(i14);
                int i15 = iOooO00o19;
                i2 = i7;
                w02Var.OooOO0o = v63.OooO0O0(cursorOooO0OO.getInt(i15));
                iOooO00o18 = i14;
                iOooO00o19 = i15;
                int i16 = iOooO00o20;
                w02Var.OooOOO0 = cursorOooO0OO.getLong(i16);
                int i17 = iOooO00o21;
                w02Var.OooOOO = cursorOooO0OO.getLong(i17);
                int i18 = iOooO00o22;
                w02Var.OooOOOO = cursorOooO0OO.getLong(i18);
                iOooO00o22 = i18;
                int i19 = iOooO00o23;
                w02Var.OooOOOo = cursorOooO0OO.getLong(i19);
                int i20 = iOooO00o24;
                w02Var.OooOOo0 = cursorOooO0OO.getInt(i20) != 0;
                int i21 = iOooO00o25;
                w02Var.OooOOo = v63.OooO0Oo(cursorOooO0OO.getInt(i21));
                w02Var.OooOO0 = jiVar;
                arrayList.add(w02Var);
                iOooO00o25 = i21;
                iOooO00o23 = i19;
                iOooO00o4 = i10;
                iOooO00o9 = i3;
                iOooO00o11 = i4;
                iOooO00o = i5;
                iOooO00o3 = i9;
                iOooO00o15 = i8;
                iOooO00o21 = i17;
                iOooO00o5 = i12;
                iOooO00o16 = i11;
                iOooO00o17 = i13;
                iOooO00o20 = i16;
                iOooO00o24 = i20;
                iOooO00o2 = i6;
            }
            cursorOooO0OO.close();
            wb1Var.OooO0o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorOooO0OO.close();
            wb1Var.OooO0o();
            throw th;
        }
    }

    public ArrayList OooO0OO() throws Throwable {
        wb1 wb1Var;
        wb1 wb1VarOooO0OO = wb1.OooO0OO(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0Oo;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO0OO = aq2.OooO0OO(workDatabase_Impl, wb1VarOooO0OO);
        try {
            int iOooO00o = wp2.OooO00o(cursorOooO0OO, "required_network_type");
            int iOooO00o2 = wp2.OooO00o(cursorOooO0OO, "requires_charging");
            int iOooO00o3 = wp2.OooO00o(cursorOooO0OO, "requires_device_idle");
            int iOooO00o4 = wp2.OooO00o(cursorOooO0OO, "requires_battery_not_low");
            int iOooO00o5 = wp2.OooO00o(cursorOooO0OO, "requires_storage_not_low");
            int iOooO00o6 = wp2.OooO00o(cursorOooO0OO, "trigger_content_update_delay");
            int iOooO00o7 = wp2.OooO00o(cursorOooO0OO, "trigger_max_content_delay");
            int iOooO00o8 = wp2.OooO00o(cursorOooO0OO, "content_uri_triggers");
            int iOooO00o9 = wp2.OooO00o(cursorOooO0OO, "id");
            int iOooO00o10 = wp2.OooO00o(cursorOooO0OO, "state");
            int iOooO00o11 = wp2.OooO00o(cursorOooO0OO, "worker_class_name");
            int iOooO00o12 = wp2.OooO00o(cursorOooO0OO, "input_merger_class_name");
            int iOooO00o13 = wp2.OooO00o(cursorOooO0OO, "input");
            int iOooO00o14 = wp2.OooO00o(cursorOooO0OO, "output");
            wb1Var = wb1VarOooO0OO;
            try {
                int iOooO00o15 = wp2.OooO00o(cursorOooO0OO, "initial_delay");
                int iOooO00o16 = wp2.OooO00o(cursorOooO0OO, "interval_duration");
                int iOooO00o17 = wp2.OooO00o(cursorOooO0OO, "flex_duration");
                int iOooO00o18 = wp2.OooO00o(cursorOooO0OO, "run_attempt_count");
                int iOooO00o19 = wp2.OooO00o(cursorOooO0OO, "backoff_policy");
                int iOooO00o20 = wp2.OooO00o(cursorOooO0OO, "backoff_delay_duration");
                int iOooO00o21 = wp2.OooO00o(cursorOooO0OO, "period_start_time");
                int iOooO00o22 = wp2.OooO00o(cursorOooO0OO, "minimum_retention_duration");
                int iOooO00o23 = wp2.OooO00o(cursorOooO0OO, "schedule_requested_at");
                int iOooO00o24 = wp2.OooO00o(cursorOooO0OO, "run_in_foreground");
                int iOooO00o25 = wp2.OooO00o(cursorOooO0OO, "out_of_quota_policy");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0OO.getCount());
                while (cursorOooO0OO.moveToNext()) {
                    String string = cursorOooO0OO.getString(iOooO00o9);
                    int i2 = iOooO00o9;
                    String string2 = cursorOooO0OO.getString(iOooO00o11);
                    int i3 = iOooO00o11;
                    ji jiVar = new ji();
                    int i4 = iOooO00o;
                    jiVar.OooO00o = v63.OooO0OO(cursorOooO0OO.getInt(iOooO00o));
                    jiVar.OooO0O0 = cursorOooO0OO.getInt(iOooO00o2) != 0;
                    jiVar.OooO0OO = cursorOooO0OO.getInt(iOooO00o3) != 0;
                    jiVar.OooO0Oo = cursorOooO0OO.getInt(iOooO00o4) != 0;
                    jiVar.OooO0o0 = cursorOooO0OO.getInt(iOooO00o5) != 0;
                    int i5 = iOooO00o2;
                    jiVar.OooO0o = cursorOooO0OO.getLong(iOooO00o6);
                    jiVar.OooO0oO = cursorOooO0OO.getLong(iOooO00o7);
                    jiVar.OooO0oo = v63.OooO00o(cursorOooO0OO.getBlob(iOooO00o8));
                    w02 w02Var = new w02(string, string2);
                    w02Var.OooO0O0 = v63.OooO0o0(cursorOooO0OO.getInt(iOooO00o10));
                    w02Var.OooO0Oo = cursorOooO0OO.getString(iOooO00o12);
                    w02Var.OooO0o0 = cn.OooO00o(cursorOooO0OO.getBlob(iOooO00o13));
                    int i6 = i;
                    w02Var.OooO0o = cn.OooO00o(cursorOooO0OO.getBlob(i6));
                    int i7 = iOooO00o15;
                    int i8 = iOooO00o3;
                    int i9 = iOooO00o4;
                    w02Var.OooO0oO = cursorOooO0OO.getLong(i7);
                    int i10 = iOooO00o16;
                    int i11 = iOooO00o5;
                    w02Var.OooO0oo = cursorOooO0OO.getLong(i10);
                    int i12 = iOooO00o17;
                    w02Var.OooO = cursorOooO0OO.getLong(i12);
                    int i13 = iOooO00o18;
                    w02Var.OooOO0O = cursorOooO0OO.getInt(i13);
                    int i14 = iOooO00o19;
                    i = i6;
                    w02Var.OooOO0o = v63.OooO0O0(cursorOooO0OO.getInt(i14));
                    iOooO00o18 = i13;
                    iOooO00o19 = i14;
                    int i15 = iOooO00o20;
                    w02Var.OooOOO0 = cursorOooO0OO.getLong(i15);
                    int i16 = iOooO00o21;
                    w02Var.OooOOO = cursorOooO0OO.getLong(i16);
                    int i17 = iOooO00o22;
                    w02Var.OooOOOO = cursorOooO0OO.getLong(i17);
                    iOooO00o22 = i17;
                    int i18 = iOooO00o23;
                    w02Var.OooOOOo = cursorOooO0OO.getLong(i18);
                    int i19 = iOooO00o24;
                    w02Var.OooOOo0 = cursorOooO0OO.getInt(i19) != 0;
                    int i20 = iOooO00o25;
                    w02Var.OooOOo = v63.OooO0Oo(cursorOooO0OO.getInt(i20));
                    w02Var.OooOO0 = jiVar;
                    arrayList.add(w02Var);
                    iOooO00o25 = i20;
                    iOooO00o23 = i18;
                    iOooO00o4 = i9;
                    iOooO00o9 = i2;
                    iOooO00o11 = i3;
                    iOooO00o = i4;
                    iOooO00o3 = i8;
                    iOooO00o15 = i7;
                    iOooO00o21 = i16;
                    iOooO00o5 = i11;
                    iOooO00o16 = i10;
                    iOooO00o17 = i12;
                    iOooO00o20 = i15;
                    iOooO00o24 = i19;
                    iOooO00o2 = i5;
                }
                cursorOooO0OO.close();
                wb1Var.OooO0o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorOooO0OO.close();
                wb1Var.OooO0o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            wb1Var = wb1VarOooO0OO;
        }
    }

    public ArrayList OooO0Oo() {
        wb1 wb1Var;
        wb1 wb1VarOooO0OO = wb1.OooO0OO(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0Oo;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO0OO = aq2.OooO0OO(workDatabase_Impl, wb1VarOooO0OO);
        try {
            int iOooO00o = wp2.OooO00o(cursorOooO0OO, "required_network_type");
            int iOooO00o2 = wp2.OooO00o(cursorOooO0OO, "requires_charging");
            int iOooO00o3 = wp2.OooO00o(cursorOooO0OO, "requires_device_idle");
            int iOooO00o4 = wp2.OooO00o(cursorOooO0OO, "requires_battery_not_low");
            int iOooO00o5 = wp2.OooO00o(cursorOooO0OO, "requires_storage_not_low");
            int iOooO00o6 = wp2.OooO00o(cursorOooO0OO, "trigger_content_update_delay");
            int iOooO00o7 = wp2.OooO00o(cursorOooO0OO, "trigger_max_content_delay");
            int iOooO00o8 = wp2.OooO00o(cursorOooO0OO, "content_uri_triggers");
            int iOooO00o9 = wp2.OooO00o(cursorOooO0OO, "id");
            int iOooO00o10 = wp2.OooO00o(cursorOooO0OO, "state");
            int iOooO00o11 = wp2.OooO00o(cursorOooO0OO, "worker_class_name");
            int iOooO00o12 = wp2.OooO00o(cursorOooO0OO, "input_merger_class_name");
            int iOooO00o13 = wp2.OooO00o(cursorOooO0OO, "input");
            int iOooO00o14 = wp2.OooO00o(cursorOooO0OO, "output");
            wb1Var = wb1VarOooO0OO;
            try {
                int iOooO00o15 = wp2.OooO00o(cursorOooO0OO, "initial_delay");
                int iOooO00o16 = wp2.OooO00o(cursorOooO0OO, "interval_duration");
                int iOooO00o17 = wp2.OooO00o(cursorOooO0OO, "flex_duration");
                int iOooO00o18 = wp2.OooO00o(cursorOooO0OO, "run_attempt_count");
                int iOooO00o19 = wp2.OooO00o(cursorOooO0OO, "backoff_policy");
                int iOooO00o20 = wp2.OooO00o(cursorOooO0OO, "backoff_delay_duration");
                int iOooO00o21 = wp2.OooO00o(cursorOooO0OO, "period_start_time");
                int iOooO00o22 = wp2.OooO00o(cursorOooO0OO, "minimum_retention_duration");
                int iOooO00o23 = wp2.OooO00o(cursorOooO0OO, "schedule_requested_at");
                int iOooO00o24 = wp2.OooO00o(cursorOooO0OO, "run_in_foreground");
                int iOooO00o25 = wp2.OooO00o(cursorOooO0OO, "out_of_quota_policy");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0OO.getCount());
                while (cursorOooO0OO.moveToNext()) {
                    String string = cursorOooO0OO.getString(iOooO00o9);
                    int i2 = iOooO00o9;
                    String string2 = cursorOooO0OO.getString(iOooO00o11);
                    int i3 = iOooO00o11;
                    ji jiVar = new ji();
                    int i4 = iOooO00o;
                    jiVar.OooO00o = v63.OooO0OO(cursorOooO0OO.getInt(iOooO00o));
                    jiVar.OooO0O0 = cursorOooO0OO.getInt(iOooO00o2) != 0;
                    jiVar.OooO0OO = cursorOooO0OO.getInt(iOooO00o3) != 0;
                    jiVar.OooO0Oo = cursorOooO0OO.getInt(iOooO00o4) != 0;
                    jiVar.OooO0o0 = cursorOooO0OO.getInt(iOooO00o5) != 0;
                    int i5 = iOooO00o2;
                    jiVar.OooO0o = cursorOooO0OO.getLong(iOooO00o6);
                    jiVar.OooO0oO = cursorOooO0OO.getLong(iOooO00o7);
                    jiVar.OooO0oo = v63.OooO00o(cursorOooO0OO.getBlob(iOooO00o8));
                    w02 w02Var = new w02(string, string2);
                    w02Var.OooO0O0 = v63.OooO0o0(cursorOooO0OO.getInt(iOooO00o10));
                    w02Var.OooO0Oo = cursorOooO0OO.getString(iOooO00o12);
                    w02Var.OooO0o0 = cn.OooO00o(cursorOooO0OO.getBlob(iOooO00o13));
                    int i6 = i;
                    w02Var.OooO0o = cn.OooO00o(cursorOooO0OO.getBlob(i6));
                    int i7 = iOooO00o15;
                    int i8 = iOooO00o3;
                    int i9 = iOooO00o4;
                    w02Var.OooO0oO = cursorOooO0OO.getLong(i7);
                    int i10 = iOooO00o16;
                    int i11 = iOooO00o5;
                    w02Var.OooO0oo = cursorOooO0OO.getLong(i10);
                    int i12 = iOooO00o17;
                    w02Var.OooO = cursorOooO0OO.getLong(i12);
                    int i13 = iOooO00o18;
                    w02Var.OooOO0O = cursorOooO0OO.getInt(i13);
                    int i14 = iOooO00o19;
                    i = i6;
                    w02Var.OooOO0o = v63.OooO0O0(cursorOooO0OO.getInt(i14));
                    iOooO00o18 = i13;
                    iOooO00o19 = i14;
                    int i15 = iOooO00o20;
                    w02Var.OooOOO0 = cursorOooO0OO.getLong(i15);
                    int i16 = iOooO00o21;
                    w02Var.OooOOO = cursorOooO0OO.getLong(i16);
                    int i17 = iOooO00o22;
                    w02Var.OooOOOO = cursorOooO0OO.getLong(i17);
                    iOooO00o22 = i17;
                    int i18 = iOooO00o23;
                    w02Var.OooOOOo = cursorOooO0OO.getLong(i18);
                    int i19 = iOooO00o24;
                    w02Var.OooOOo0 = cursorOooO0OO.getInt(i19) != 0;
                    int i20 = iOooO00o25;
                    w02Var.OooOOo = v63.OooO0Oo(cursorOooO0OO.getInt(i20));
                    w02Var.OooOO0 = jiVar;
                    arrayList.add(w02Var);
                    iOooO00o25 = i20;
                    iOooO00o23 = i18;
                    iOooO00o4 = i9;
                    iOooO00o9 = i2;
                    iOooO00o11 = i3;
                    iOooO00o = i4;
                    iOooO00o3 = i8;
                    iOooO00o15 = i7;
                    iOooO00o21 = i16;
                    iOooO00o5 = i11;
                    iOooO00o16 = i10;
                    iOooO00o17 = i12;
                    iOooO00o20 = i15;
                    iOooO00o24 = i19;
                    iOooO00o2 = i5;
                }
                cursorOooO0OO.close();
                wb1Var.OooO0o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorOooO0OO.close();
                wb1Var.OooO0o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            wb1Var = wb1VarOooO0OO;
        }
    }

    public ArrayList OooO0o() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0Oo;
        wb1 wb1VarOooO0OO = wb1.OooO0OO(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        wb1VarOooO0OO.OooO0O0(1);
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO0OO = aq2.OooO0OO(workDatabase_Impl, wb1VarOooO0OO);
        try {
            ArrayList arrayList = new ArrayList(cursorOooO0OO.getCount());
            while (cursorOooO0OO.moveToNext()) {
                arrayList.add(cursorOooO0OO.getString(0));
            }
            return arrayList;
        } finally {
            cursorOooO0OO.close();
            wb1VarOooO0OO.OooO0o();
        }
    }

    public int OooO0o0(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0Oo;
        wb1 wb1VarOooO0OO = wb1.OooO0OO(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            wb1VarOooO0OO.OooO0O0(1);
        } else {
            wb1VarOooO0OO.OooO0Oo(1, str);
        }
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO0OO = aq2.OooO0OO(workDatabase_Impl, wb1VarOooO0OO);
        try {
            return cursorOooO0OO.moveToFirst() ? v63.OooO0o0(cursorOooO0OO.getInt(0)) : 0;
        } finally {
            cursorOooO0OO.close();
            wb1VarOooO0OO.OooO0o();
        }
    }

    public ArrayList OooO0oO() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0Oo;
        wb1 wb1VarOooO0OO = wb1.OooO0OO(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        wb1VarOooO0OO.OooO0Oo(1, "offline_ping_sender_work");
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO0OO = aq2.OooO0OO(workDatabase_Impl, wb1VarOooO0OO);
        try {
            ArrayList arrayList = new ArrayList(cursorOooO0OO.getCount());
            while (cursorOooO0OO.moveToNext()) {
                arrayList.add(cursorOooO0OO.getString(0));
            }
            return arrayList;
        } finally {
            cursorOooO0OO.close();
            wb1VarOooO0OO.OooO0o();
        }
    }

    public w02 OooO0oo(String str) {
        wb1 wb1Var;
        int iOooO00o;
        int iOooO00o2;
        int iOooO00o3;
        int iOooO00o4;
        int iOooO00o5;
        int iOooO00o6;
        int iOooO00o7;
        int iOooO00o8;
        int iOooO00o9;
        int iOooO00o10;
        int iOooO00o11;
        int iOooO00o12;
        int iOooO00o13;
        int iOooO00o14;
        w02 w02Var;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0Oo;
        wb1 wb1VarOooO0OO = wb1.OooO0OO(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            wb1VarOooO0OO.OooO0O0(1);
        } else {
            wb1VarOooO0OO.OooO0Oo(1, str);
        }
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO0OO = aq2.OooO0OO(workDatabase_Impl, wb1VarOooO0OO);
        try {
            iOooO00o = wp2.OooO00o(cursorOooO0OO, "required_network_type");
            iOooO00o2 = wp2.OooO00o(cursorOooO0OO, "requires_charging");
            iOooO00o3 = wp2.OooO00o(cursorOooO0OO, "requires_device_idle");
            iOooO00o4 = wp2.OooO00o(cursorOooO0OO, "requires_battery_not_low");
            iOooO00o5 = wp2.OooO00o(cursorOooO0OO, "requires_storage_not_low");
            iOooO00o6 = wp2.OooO00o(cursorOooO0OO, "trigger_content_update_delay");
            iOooO00o7 = wp2.OooO00o(cursorOooO0OO, "trigger_max_content_delay");
            iOooO00o8 = wp2.OooO00o(cursorOooO0OO, "content_uri_triggers");
            iOooO00o9 = wp2.OooO00o(cursorOooO0OO, "id");
            iOooO00o10 = wp2.OooO00o(cursorOooO0OO, "state");
            iOooO00o11 = wp2.OooO00o(cursorOooO0OO, "worker_class_name");
            iOooO00o12 = wp2.OooO00o(cursorOooO0OO, "input_merger_class_name");
            iOooO00o13 = wp2.OooO00o(cursorOooO0OO, "input");
            iOooO00o14 = wp2.OooO00o(cursorOooO0OO, "output");
            wb1Var = wb1VarOooO0OO;
        } catch (Throwable th) {
            th = th;
            wb1Var = wb1VarOooO0OO;
        }
        try {
            int iOooO00o15 = wp2.OooO00o(cursorOooO0OO, "initial_delay");
            int iOooO00o16 = wp2.OooO00o(cursorOooO0OO, "interval_duration");
            int iOooO00o17 = wp2.OooO00o(cursorOooO0OO, "flex_duration");
            int iOooO00o18 = wp2.OooO00o(cursorOooO0OO, "run_attempt_count");
            int iOooO00o19 = wp2.OooO00o(cursorOooO0OO, "backoff_policy");
            int iOooO00o20 = wp2.OooO00o(cursorOooO0OO, "backoff_delay_duration");
            int iOooO00o21 = wp2.OooO00o(cursorOooO0OO, "period_start_time");
            int iOooO00o22 = wp2.OooO00o(cursorOooO0OO, "minimum_retention_duration");
            int iOooO00o23 = wp2.OooO00o(cursorOooO0OO, "schedule_requested_at");
            int iOooO00o24 = wp2.OooO00o(cursorOooO0OO, "run_in_foreground");
            int iOooO00o25 = wp2.OooO00o(cursorOooO0OO, "out_of_quota_policy");
            if (cursorOooO0OO.moveToFirst()) {
                String string = cursorOooO0OO.getString(iOooO00o9);
                String string2 = cursorOooO0OO.getString(iOooO00o11);
                ji jiVar = new ji();
                jiVar.OooO00o = v63.OooO0OO(cursorOooO0OO.getInt(iOooO00o));
                jiVar.OooO0O0 = cursorOooO0OO.getInt(iOooO00o2) != 0;
                jiVar.OooO0OO = cursorOooO0OO.getInt(iOooO00o3) != 0;
                jiVar.OooO0Oo = cursorOooO0OO.getInt(iOooO00o4) != 0;
                jiVar.OooO0o0 = cursorOooO0OO.getInt(iOooO00o5) != 0;
                jiVar.OooO0o = cursorOooO0OO.getLong(iOooO00o6);
                jiVar.OooO0oO = cursorOooO0OO.getLong(iOooO00o7);
                jiVar.OooO0oo = v63.OooO00o(cursorOooO0OO.getBlob(iOooO00o8));
                w02Var = new w02(string, string2);
                w02Var.OooO0O0 = v63.OooO0o0(cursorOooO0OO.getInt(iOooO00o10));
                w02Var.OooO0Oo = cursorOooO0OO.getString(iOooO00o12);
                w02Var.OooO0o0 = cn.OooO00o(cursorOooO0OO.getBlob(iOooO00o13));
                w02Var.OooO0o = cn.OooO00o(cursorOooO0OO.getBlob(iOooO00o14));
                w02Var.OooO0oO = cursorOooO0OO.getLong(iOooO00o15);
                w02Var.OooO0oo = cursorOooO0OO.getLong(iOooO00o16);
                w02Var.OooO = cursorOooO0OO.getLong(iOooO00o17);
                w02Var.OooOO0O = cursorOooO0OO.getInt(iOooO00o18);
                w02Var.OooOO0o = v63.OooO0O0(cursorOooO0OO.getInt(iOooO00o19));
                w02Var.OooOOO0 = cursorOooO0OO.getLong(iOooO00o20);
                w02Var.OooOOO = cursorOooO0OO.getLong(iOooO00o21);
                w02Var.OooOOOO = cursorOooO0OO.getLong(iOooO00o22);
                w02Var.OooOOOo = cursorOooO0OO.getLong(iOooO00o23);
                w02Var.OooOOo0 = cursorOooO0OO.getInt(iOooO00o24) != 0;
                w02Var.OooOOo = v63.OooO0Oo(cursorOooO0OO.getInt(iOooO00o25));
                w02Var.OooOO0 = jiVar;
            } else {
                w02Var = null;
            }
            cursorOooO0OO.close();
            wb1Var.OooO0o();
            return w02Var;
        } catch (Throwable th2) {
            th = th2;
            cursorOooO0OO.close();
            wb1Var.OooO0o();
            throw th;
        }
    }

    public void OooOO0(String str, cn cnVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0Oo;
        workDatabase_Impl.OooO0O0();
        hl1 hl1Var = (hl1) this.OooO0oO;
        j30 j30VarOooO00o = hl1Var.OooO00o();
        byte[] bArrOooO0OO = cn.OooO0OO(cnVar);
        if (bArrOooO0OO == null) {
            j30VarOooO00o.OooO0O0(1);
        } else {
            j30VarOooO00o.OooOO0(1, bArrOooO0OO);
        }
        if (str == null) {
            j30VarOooO00o.OooO0O0(2);
        } else {
            j30VarOooO00o.OooO0Oo(2, str);
        }
        workDatabase_Impl.OooO0OO();
        try {
            j30VarOooO00o.OooO0OO();
            workDatabase_Impl.OooOOo0();
        } finally {
            workDatabase_Impl.OooOOO();
            hl1Var.OooO0OO(j30VarOooO00o);
        }
    }

    public void OooOO0O(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0Oo;
        workDatabase_Impl.OooO0O0();
        hl1 hl1Var = (hl1) this.OooO0oo;
        j30 j30VarOooO00o = hl1Var.OooO00o();
        j30VarOooO00o.OooO00o(1, j);
        if (str == null) {
            j30VarOooO00o.OooO0O0(2);
        } else {
            j30VarOooO00o.OooO0Oo(2, str);
        }
        workDatabase_Impl.OooO0OO();
        try {
            j30VarOooO00o.OooO0OO();
            workDatabase_Impl.OooOOo0();
        } finally {
            workDatabase_Impl.OooOOO();
            hl1Var.OooO0OO(j30VarOooO00o);
        }
    }

    public void OooOO0o(int i, String... strArr) throws SQLException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0Oo;
        workDatabase_Impl.OooO0O0();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append("?");
            if (i2 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String string = sb.toString();
        workDatabase_Impl.OooO00o();
        workDatabase_Impl.OooO0O0();
        j30 j30VarOooO0oo = workDatabase_Impl.OooO().OooOO0O().OooO0oo(string);
        j30VarOooO0oo.OooO00o(1, v63.OooO0o(i));
        int i3 = 2;
        for (String str : strArr) {
            if (str == null) {
                j30VarOooO0oo.OooO0O0(i3);
            } else {
                j30VarOooO0oo.OooO0Oo(i3, str);
            }
            i3++;
        }
        workDatabase_Impl.OooO0OO();
        try {
            j30VarOooO0oo.OooO0OO();
            workDatabase_Impl.OooOOo0();
        } finally {
            workDatabase_Impl.OooOOO();
        }
    }

    @Override // com.cmaster.cloner.xs1
    public View getRoot() {
        return (CoordinatorLayout) this.OooO0Oo;
    }
}
