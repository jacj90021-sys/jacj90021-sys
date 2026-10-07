package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.cmaster.cloner.dr1;
import com.cmaster.cloner.g5;
import com.cmaster.cloner.ip1;
import com.cmaster.cloner.pi2;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.s41;
import com.cmaster.cloner.v41;
import com.cmaster.cloner.yn1;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int OooO0Oo = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        ip1.OooO0O0(getApplicationContext());
        if (string == null) {
            qa.OooOOO0("Null backendName");
            return false;
        }
        s41 s41VarOooO0O0 = v41.OooO0O0(i);
        byte[] bArrDecode = string2 != null ? Base64.decode(string2, 0) : null;
        yn1 yn1Var = ip1.OooO00o().OooO0Oo;
        ((Executor) yn1Var.OooO0oo).execute(new dr1(yn1Var, new g5(string, bArrDecode, s41VarOooO0O0), i2, new pi2(this, jobParameters, 23)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
