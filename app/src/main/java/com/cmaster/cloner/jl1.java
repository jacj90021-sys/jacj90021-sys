package com.cmaster.cloner;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jl1 implements od1 {
    public static final String OooO0oo = ep0.OooO("SystemJobScheduler");
    public final Context OooO0Oo;
    public final q02 OooO0o;
    public final JobScheduler OooO0o0;
    public final il1 OooO0oO;

    public jl1(Context context, q02 q02Var) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        il1 il1Var = new il1(context);
        this.OooO0Oo = context;
        this.OooO0o = q02Var;
        this.OooO0o0 = jobScheduler;
        this.OooO0oO = il1Var;
    }

    public static void OooO0O0(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            ep0.OooO0oO().OooO0o(OooO0oo, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList OooO0Oo(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            ep0.OooO0oO().OooO0o(OooO0oo, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // com.cmaster.cloner.od1
    public final boolean OooO00o() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    @Override // com.cmaster.cloner.od1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0OO(java.lang.String r12) {
        /*
            r11 = this;
            android.content.Context r0 = r11.OooO0Oo
            android.app.job.JobScheduler r1 = r11.OooO0o0
            java.util.ArrayList r0 = OooO0Oo(r0, r1)
            r2 = 0
            r3 = 0
            if (r0 != 0) goto Ld
            goto L49
        Ld:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 2
            r4.<init>(r5)
            int r5 = r0.size()
            r6 = r3
        L18:
            if (r6 >= r5) goto L48
            java.lang.Object r7 = r0.get(r6)
            int r6 = r6 + 1
            android.app.job.JobInfo r7 = (android.app.job.JobInfo) r7
            java.lang.String r8 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r9 = r7.getExtras()
            if (r9 == 0) goto L35
            boolean r10 = r9.containsKey(r8)     // Catch: java.lang.NullPointerException -> L35
            if (r10 == 0) goto L35
            java.lang.String r8 = r9.getString(r8)     // Catch: java.lang.NullPointerException -> L35
            goto L36
        L35:
            r8 = r2
        L36:
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L18
            int r7 = r7.getId()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.add(r7)
            goto L18
        L48:
            r2 = r4
        L49:
            if (r2 == 0) goto L72
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L72
            int r0 = r2.size()
        L55:
            if (r3 >= r0) goto L67
            java.lang.Object r4 = r2.get(r3)
            int r3 = r3 + 1
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            OooO0O0(r1, r4)
            goto L55
        L67:
            com.cmaster.cloner.q02 r11 = r11.OooO0o
            androidx.work.impl.WorkDatabase r11 = r11.OooO0OO
            com.cmaster.cloner.hx2 r11 = r11.OooOo00()
            r11.OooOoO(r12)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.jl1.OooO0OO(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o(w02 w02Var, int i) {
        int i2;
        JobScheduler jobScheduler = this.OooO0o0;
        il1 il1Var = this.OooO0oO;
        il1Var.getClass();
        ji jiVar = w02Var.OooOO0;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", w02Var.OooO00o);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", w02Var.OooO0OO());
        JobInfo.Builder extras = new JobInfo.Builder(i, il1Var.OooO00o).setRequiresCharging(jiVar.OooO0O0).setRequiresDeviceIdle(jiVar.OooO0OO).setExtras(persistableBundle);
        int i3 = jiVar.OooO00o;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 || i3 != 6) {
            int iOooOOoo = rj.OooOOoo(i3);
            if (iOooOOoo == 0) {
                i2 = 0;
            } else if (iOooOOoo == 1) {
                i2 = 1;
            } else if (iOooOOoo != 2) {
                i2 = 3;
                if (iOooOOoo != 3) {
                    i2 = 4;
                    if (iOooOOoo != 4 || i4 < 26) {
                        ep0.OooO0oO().OooO0Oo(il1.OooO0O0, "API version too low. Cannot convert network type value ".concat(rj.OooOo0O(i3)), new Throwable[0]);
                        i2 = 1;
                    }
                }
            } else {
                i2 = 2;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!jiVar.OooO0OO) {
            extras.setBackoffCriteria(w02Var.OooOOO0, w02Var.OooOO0o == 2 ? 0 : 1);
        }
        long jMax = Math.max(w02Var.OooO00o() - System.currentTimeMillis(), 0L);
        if (i4 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!w02Var.OooOOo0) {
            extras.setImportantWhileForeground(true);
        }
        if (jiVar.OooO0oo.OooO00o.size() > 0) {
            Iterator it = jiVar.OooO0oo.OooO00o.iterator();
            while (it.hasNext()) {
                zi ziVar = (zi) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(ziVar.OooO00o, ziVar.OooO0O0 ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(jiVar.OooO0o);
            extras.setTriggerContentMaxDelay(jiVar.OooO0oO);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(jiVar.OooO0Oo);
            extras.setRequiresStorageNotLow(jiVar.OooO0o0);
        }
        Object[] objArr = w02Var.OooOO0O > 0;
        if (l9.OooO00o() && w02Var.OooOOo0 && objArr == false) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        ep0 ep0VarOooO0oO = ep0.OooO0oO();
        String str = w02Var.OooO00o;
        String str2 = OooO0oo;
        ep0VarOooO0oO.OooO0Oo(str2, "Scheduling work ID " + str + " Job ID " + i, new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                ep0.OooO0oO().OooOOO(str2, "Unable to schedule work ID " + w02Var.OooO00o, new Throwable[0]);
                if (w02Var.OooOOo0 && w02Var.OooOOo == 1) {
                    w02Var.OooOOo0 = false;
                    ep0.OooO0oO().OooO0Oo(str2, "Scheduling a non-expedited job (work ID " + w02Var.OooO00o + ")", new Throwable[0]);
                    OooO0o(w02Var, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList arrayListOooO0Oo = OooO0Oo(this.OooO0Oo, jobScheduler);
            int size = arrayListOooO0Oo != null ? arrayListOooO0Oo.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            q02 q02Var = this.OooO0o;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(q02Var.OooO0OO.OooOo0o().OooO0Oo().size()), Integer.valueOf(q02Var.OooO0O0.OooO0OO));
            ep0.OooO0oO().OooO0o(str2, str3, new Throwable[0]);
            throw new IllegalStateException(str3, e);
        } catch (Throwable th) {
            ep0.OooO0oO().OooO0o(str2, "Unable to schedule " + w02Var, th);
        }
    }

    @Override // com.cmaster.cloner.od1
    public final void OooO0o0(w02... w02VarArr) {
        int i;
        int i2;
        WorkDatabase workDatabase = this.OooO0o.OooO0OO;
        int length = w02VarArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            w02 w02Var = w02VarArr[i4];
            workDatabase.OooO0OO();
            try {
                w02 w02VarOooO0oo = workDatabase.OooOo0o().OooO0oo(w02Var.OooO00o);
                if (w02VarOooO0oo == null) {
                    ep0.OooO0oO().OooOOO(OooO0oo, "Skipping scheduling " + w02Var.OooO00o + " because it's no longer in the DB", new Throwable[i3]);
                    workDatabase.OooOOo0();
                } else if (w02VarOooO0oo.OooO0O0 != 1) {
                    ep0.OooO0oO().OooOOO(OooO0oo, "Skipping scheduling " + w02Var.OooO00o + " because it is no longer enqueued", new Throwable[i3]);
                    workDatabase.OooOOo0();
                } else {
                    gl1 gl1VarOooOOo = workDatabase.OooOo00().OooOOo(w02Var.OooO00o);
                    if (gl1VarOooOOo != null) {
                        i2 = gl1VarOooOOo.OooO0O0;
                        i = i4;
                    } else {
                        this.OooO0o.OooO0O0.getClass();
                        int i5 = this.OooO0o.OooO0O0.OooO0O0;
                        synchronized (tf0.class) {
                            workDatabase.OooO0OO();
                            try {
                                Long lOooOooO = workDatabase.OooOOoo().OooOooO("next_job_scheduler_id");
                                int iIntValue = lOooOooO != null ? lOooOooO.intValue() : i3;
                                i = i4;
                                workDatabase.OooOOoo().Oooo0o0(new f41("next_job_scheduler_id", iIntValue == Integer.MAX_VALUE ? i3 : iIntValue + 1));
                                workDatabase.OooOOo0();
                                workDatabase.OooOOO();
                                if (iIntValue < 0 || iIntValue > i5) {
                                    workDatabase.OooOOoo().Oooo0o0(new f41("next_job_scheduler_id", 1L));
                                    i2 = 0;
                                } else {
                                    i2 = iIntValue;
                                }
                            } finally {
                            }
                        }
                    }
                    if (gl1VarOooOOo == null) {
                        this.OooO0o.OooO0OO.OooOo00().OooOo0O(new gl1(w02Var.OooO00o, i2));
                    }
                    OooO0o(w02Var, i2);
                    workDatabase.OooOOo0();
                    i4 = i + 1;
                    i3 = 0;
                }
                workDatabase.OooOOO();
                i = i4;
                i4 = i + 1;
                i3 = 0;
            } finally {
                workDatabase.OooOOO();
            }
        }
    }
}
