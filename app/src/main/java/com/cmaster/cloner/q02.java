package com.cmaster.cloner;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q02 {
    public static q02 OooOO0;
    public static q02 OooOO0O;
    public static final Object OooOO0o;
    public BroadcastReceiver.PendingResult OooO;
    public final Context OooO00o;
    public final xf1 OooO0O0;
    public final WorkDatabase OooO0OO;
    public final hx2 OooO0Oo;
    public final g51 OooO0o;
    public final List OooO0o0;
    public final xb1 OooO0oO;
    public boolean OooO0oo;

    static {
        ep0.OooO("WorkManagerImpl");
        OooOO0 = null;
        OooOO0O = null;
        OooOO0o = new Object();
    }

    public q02(Context context, xf1 xf1Var, hx2 hx2Var) throws Resources.NotFoundException {
        qb1 qb1VarOooO00o;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        af1 af1Var = (af1) hx2Var.OooO0o0;
        if (z) {
            applicationContext.getClass();
            qb1VarOooO00o = new qb1(applicationContext, WorkDatabase.class, null);
            qb1VarOooO00o.OooO = true;
        } else {
            String str = l02.OooO00o;
            qb1VarOooO00o = vy2.OooO00o(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            qb1VarOooO00o.OooO0oo = new or(applicationContext, 3);
        }
        af1Var.getClass();
        qb1VarOooO00o.OooO0o = af1Var;
        qb1VarOooO00o.OooO0Oo.add(new i02());
        qb1VarOooO00o.OooO00o(i92.OooO00o);
        qb1VarOooO00o.OooO00o(new k02(applicationContext, 2, 3));
        qb1VarOooO00o.OooO00o(i92.OooO0O0);
        qb1VarOooO00o.OooO00o(i92.OooO0OO);
        qb1VarOooO00o.OooO00o(new k02(applicationContext, 5, 6));
        qb1VarOooO00o.OooO00o(i92.OooO0Oo);
        qb1VarOooO00o.OooO00o(i92.OooO0o0);
        qb1VarOooO00o.OooO00o(i92.OooO0o);
        qb1VarOooO00o.OooO00o(new k02(applicationContext));
        qb1VarOooO00o.OooO00o(new k02(applicationContext, 10, 11));
        qb1VarOooO00o.OooO00o(i92.OooO0oO);
        qb1VarOooO00o.OooOOOo = false;
        qb1VarOooO00o.OooOOo0 = true;
        WorkDatabase workDatabase = (WorkDatabase) qb1VarOooO00o.OooO0O0();
        Context applicationContext2 = context.getApplicationContext();
        ep0 ep0Var = new ep0(xf1Var.OooO00o);
        synchronized (ep0.class) {
            ep0.OooO0o0 = ep0Var;
        }
        String str2 = qd1.OooO00o;
        jl1 jl1Var = new jl1(applicationContext2, this);
        v01.OooO00o(applicationContext2, SystemJobService.class, true);
        ep0.OooO0oO().OooO0Oo(qd1.OooO00o, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List listAsList = Arrays.asList(jl1Var, new x60(applicationContext2, xf1Var, hx2Var, this));
        g51 g51Var = new g51(context, xf1Var, hx2Var, workDatabase, listAsList);
        Context applicationContext3 = context.getApplicationContext();
        this.OooO00o = applicationContext3;
        this.OooO0O0 = xf1Var;
        this.OooO0Oo = hx2Var;
        this.OooO0OO = workDatabase;
        this.OooO0o0 = listAsList;
        this.OooO0o = g51Var;
        this.OooO0oO = new xb1(workDatabase, 26);
        this.OooO0oo = false;
        if (applicationContext3.isDeviceProtectedStorage()) {
            qa.OooO0o("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        this.OooO0Oo.OooOOOo(new d10(applicationContext3, this));
    }

    public static q02 OooO0O0(Context context) {
        q02 q02Var;
        Object obj = OooOO0o;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    q02Var = OooOO0;
                    if (q02Var == null) {
                        q02Var = OooOO0O;
                    }
                }
                return q02Var;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (q02Var != null) {
            return q02Var;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public static void OooO0OO(Context context, xf1 xf1Var) {
        synchronized (OooOO0o) {
            try {
                q02 q02Var = OooOO0;
                if (q02Var != null && OooOO0O != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (q02Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (OooOO0O == null) {
                        OooOO0O = new q02(applicationContext, xf1Var, new hx2((ExecutorService) xf1Var.OooO0o0));
                    }
                    OooOO0 = OooOO0O;
                }
            } finally {
            }
        }
    }

    public final void OooO00o(mz0 mz0Var) {
        List listSingletonList = Collections.singletonList(mz0Var);
        if (listSingletonList.isEmpty()) {
            ra.OooOOO("enqueue needs at least one WorkRequest.");
            return;
        }
        h02 h02Var = new h02(this, listSingletonList);
        if (h02Var.OooO0o0) {
            ep0.OooO0oO().OooOOO(h02.OooO0o, px0.OooOOOO("Already enqueued work ids (", TextUtils.join(", ", h02Var.OooO0OO), ")"), new Throwable[0]);
        } else {
            this.OooO0Oo.OooOOOo(new rw(h02Var));
        }
    }

    public final void OooO0Oo() {
        synchronized (OooOO0o) {
            try {
                this.OooO0oo = true;
                BroadcastReceiver.PendingResult pendingResult = this.OooO;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.OooO = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0o(String str, a02 a02Var) {
        l1 l1Var = new l1(8);
        l1Var.OooO0o0 = this;
        l1Var.OooO0o = str;
        l1Var.OooO0oO = a02Var;
        this.OooO0Oo.OooOOOo(l1Var);
    }

    public final void OooO0o0() {
        ArrayList arrayListOooO0Oo;
        String str = jl1.OooO0oo;
        Context context = this.OooO00o;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListOooO0Oo = jl1.OooO0Oo(context, jobScheduler)) != null && !arrayListOooO0Oo.isEmpty()) {
            int size = arrayListOooO0Oo.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListOooO0Oo.get(i);
                i++;
                jl1.OooO0O0(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.OooO0OO;
        o0O00000 o0o00000OooOo0o = workDatabase.OooOo0o();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) o0o00000OooOo0o.OooO0Oo;
        workDatabase_Impl.OooO0O0();
        hl1 hl1Var = (hl1) o0o00000OooOo0o.OooOO0o;
        j30 j30VarOooO00o = hl1Var.OooO00o();
        workDatabase_Impl.OooO0OO();
        try {
            j30VarOooO00o.OooO0OO();
            workDatabase_Impl.OooOOo0();
            workDatabase_Impl.OooOOO();
            hl1Var.OooO0OO(j30VarOooO00o);
            qd1.OooO00o(this.OooO0O0, workDatabase, this.OooO0o0);
        } catch (Throwable th) {
            workDatabase_Impl.OooOOO();
            hl1Var.OooO0OO(j30VarOooO00o);
            throw th;
        }
    }

    public final void OooO0oO(String str) {
        this.OooO0Oo.OooOOOo(new dj1(this, str, false));
    }
}
