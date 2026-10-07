package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.cmaster.cloner.aq2;
import com.cmaster.cloner.cn;
import com.cmaster.cloner.ep0;
import com.cmaster.cloner.er1;
import com.cmaster.cloner.gl1;
import com.cmaster.cloner.hx2;
import com.cmaster.cloner.ji;
import com.cmaster.cloner.o0O00000;
import com.cmaster.cloner.q02;
import com.cmaster.cloner.qn0;
import com.cmaster.cloner.rn0;
import com.cmaster.cloner.v63;
import com.cmaster.cloner.vr1;
import com.cmaster.cloner.w02;
import com.cmaster.cloner.wb1;
import com.cmaster.cloner.wp2;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String OooOO0 = ep0.OooO("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String OooO00o(er1 er1Var, vr1 vr1Var, hx2 hx2Var, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w02 w02Var = (w02) obj;
            gl1 gl1VarOooOOo = hx2Var.OooOOo(w02Var.OooO00o);
            Integer numValueOf = gl1VarOooOOo != null ? Integer.valueOf(gl1VarOooOOo.OooO0O0) : null;
            String str2 = w02Var.OooO00o;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) er1Var.OooO0o0;
            wb1 wb1VarOooO0OO = wb1.OooO0OO(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                wb1VarOooO0OO.OooO0O0(1);
            } else {
                wb1VarOooO0OO.OooO0Oo(1, str2);
            }
            workDatabase_Impl.OooO0O0();
            Cursor cursorOooO0OO = aq2.OooO0OO(workDatabase_Impl, wb1VarOooO0OO);
            try {
                ArrayList arrayList2 = new ArrayList(cursorOooO0OO.getCount());
                while (cursorOooO0OO.moveToNext()) {
                    arrayList2.add(cursorOooO0OO.getString(0));
                }
                cursorOooO0OO.close();
                wb1VarOooO0OO.OooO0o();
                ArrayList arrayListOooO0Oo = vr1Var.OooO0Oo(w02Var.OooO00o);
                String strJoin = TextUtils.join(",", arrayList2);
                String strJoin2 = TextUtils.join(",", arrayListOooO0Oo);
                String str3 = w02Var.OooO00o;
                String str4 = w02Var.OooO0OO;
                switch (w02Var.OooO0O0) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                sb.append("\n" + str3 + "\t " + str4 + "\t " + numValueOf + "\t " + str + "\t " + strJoin + "\t " + strJoin2 + "\t");
            } catch (Throwable th) {
                cursorOooO0OO.close();
                wb1VarOooO0OO.OooO0o();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final rn0 doWork() throws Throwable {
        wb1 wb1Var;
        hx2 hx2Var;
        er1 er1Var;
        vr1 vr1Var;
        int i;
        WorkDatabase workDatabase = q02.OooO0O0(getApplicationContext()).OooO0OO;
        o0O00000 o0o00000OooOo0o = workDatabase.OooOo0o();
        er1 er1VarOooOo0 = workDatabase.OooOo0();
        vr1 vr1VarOooOo = workDatabase.OooOo();
        hx2 hx2VarOooOo00 = workDatabase.OooOo00();
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        o0o00000OooOo0o.getClass();
        wb1 wb1VarOooO0OO = wb1.OooO0OO(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        wb1VarOooO0OO.OooO00o(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) o0o00000OooOo0o.OooO0Oo;
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
            wb1Var = wb1VarOooO0OO;
            try {
                int iOooO00o12 = wp2.OooO00o(cursorOooO0OO, "input_merger_class_name");
                int iOooO00o13 = wp2.OooO00o(cursorOooO0OO, "input");
                int iOooO00o14 = wp2.OooO00o(cursorOooO0OO, "output");
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
                    int i7 = iOooO00o3;
                    jiVar.OooO0o = cursorOooO0OO.getLong(iOooO00o6);
                    jiVar.OooO0oO = cursorOooO0OO.getLong(iOooO00o7);
                    jiVar.OooO0oo = v63.OooO00o(cursorOooO0OO.getBlob(iOooO00o8));
                    w02 w02Var = new w02(string, string2);
                    w02Var.OooO0O0 = v63.OooO0o0(cursorOooO0OO.getInt(iOooO00o10));
                    w02Var.OooO0Oo = cursorOooO0OO.getString(iOooO00o12);
                    w02Var.OooO0o0 = cn.OooO00o(cursorOooO0OO.getBlob(iOooO00o13));
                    int i8 = i2;
                    w02Var.OooO0o = cn.OooO00o(cursorOooO0OO.getBlob(i8));
                    int i9 = iOooO00o10;
                    int i10 = iOooO00o15;
                    w02Var.OooO0oO = cursorOooO0OO.getLong(i10);
                    int i11 = iOooO00o16;
                    int i12 = iOooO00o12;
                    w02Var.OooO0oo = cursorOooO0OO.getLong(i11);
                    int i13 = iOooO00o4;
                    int i14 = iOooO00o17;
                    w02Var.OooO = cursorOooO0OO.getLong(i14);
                    int i15 = iOooO00o18;
                    w02Var.OooOO0O = cursorOooO0OO.getInt(i15);
                    int i16 = iOooO00o19;
                    int i17 = iOooO00o13;
                    w02Var.OooOO0o = v63.OooO0O0(cursorOooO0OO.getInt(i16));
                    int i18 = iOooO00o20;
                    w02Var.OooOOO0 = cursorOooO0OO.getLong(i18);
                    int i19 = iOooO00o21;
                    w02Var.OooOOO = cursorOooO0OO.getLong(i19);
                    int i20 = iOooO00o22;
                    w02Var.OooOOOO = cursorOooO0OO.getLong(i20);
                    int i21 = iOooO00o23;
                    w02Var.OooOOOo = cursorOooO0OO.getLong(i21);
                    int i22 = iOooO00o24;
                    w02Var.OooOOo0 = cursorOooO0OO.getInt(i22) != 0;
                    int i23 = iOooO00o25;
                    w02Var.OooOOo = v63.OooO0Oo(cursorOooO0OO.getInt(i23));
                    w02Var.OooOO0 = jiVar;
                    arrayList.add(w02Var);
                    iOooO00o18 = i15;
                    iOooO00o12 = i12;
                    iOooO00o16 = i11;
                    iOooO00o21 = i19;
                    iOooO00o4 = i13;
                    i2 = i8;
                    iOooO00o24 = i22;
                    iOooO00o2 = i6;
                    iOooO00o15 = i10;
                    iOooO00o13 = i17;
                    iOooO00o17 = i14;
                    iOooO00o19 = i16;
                    iOooO00o22 = i20;
                    iOooO00o20 = i18;
                    iOooO00o11 = i4;
                    iOooO00o = i5;
                    iOooO00o25 = i23;
                    iOooO00o23 = i21;
                    iOooO00o10 = i9;
                    iOooO00o9 = i3;
                    iOooO00o3 = i7;
                }
                cursorOooO0OO.close();
                wb1Var.OooO0o();
                ArrayList arrayListOooO0OO = o0o00000OooOo0o.OooO0OO();
                ArrayList arrayListOooO00o = o0o00000OooOo0o.OooO00o();
                boolean zIsEmpty = arrayList.isEmpty();
                String str = OooOO0;
                if (zIsEmpty) {
                    hx2Var = hx2VarOooOo00;
                    er1Var = er1VarOooOo0;
                    vr1Var = vr1VarOooOo;
                    i = 0;
                } else {
                    i = 0;
                    ep0.OooO0oO().OooO0oo(str, "Recently completed work:\n\n", new Throwable[0]);
                    hx2Var = hx2VarOooOo00;
                    er1Var = er1VarOooOo0;
                    vr1Var = vr1VarOooOo;
                    ep0.OooO0oO().OooO0oo(str, OooO00o(er1Var, vr1Var, hx2Var, arrayList), new Throwable[0]);
                }
                if (!arrayListOooO0OO.isEmpty()) {
                    ep0.OooO0oO().OooO0oo(str, "Running work:\n\n", new Throwable[i]);
                    ep0.OooO0oO().OooO0oo(str, OooO00o(er1Var, vr1Var, hx2Var, arrayListOooO0OO), new Throwable[i]);
                }
                if (!arrayListOooO00o.isEmpty()) {
                    ep0.OooO0oO().OooO0oo(str, "Enqueued work:\n\n", new Throwable[i]);
                    ep0.OooO0oO().OooO0oo(str, OooO00o(er1Var, vr1Var, hx2Var, arrayListOooO00o), new Throwable[i]);
                }
                return new qn0(cn.OooO0OO);
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
}
