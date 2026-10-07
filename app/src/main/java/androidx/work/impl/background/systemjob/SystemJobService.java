package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.cmaster.cloner.a02;
import com.cmaster.cloner.ep0;
import com.cmaster.cloner.g51;
import com.cmaster.cloner.hx;
import com.cmaster.cloner.q02;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.rj;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements hx {
    public static final String OooO0o = ep0.OooO("SystemJobService");
    public q02 OooO0Oo;
    public final HashMap OooO0o0 = new HashMap();

    @Override // com.cmaster.cloner.hx
    public final void OooO0O0(String str, boolean z) {
        JobParameters jobParameters;
        ep0.OooO0oO().OooO0Oo(OooO0o, str + " executed on JobScheduler", new Throwable[0]);
        synchronized (this.OooO0o0) {
            jobParameters = (JobParameters) this.OooO0o0.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            q02 q02VarOooO0O0 = q02.OooO0O0(getApplicationContext());
            this.OooO0Oo = q02VarOooO0O0;
            q02VarOooO0O0.OooO0o.OooO00o(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                qa.OooO0o("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            } else {
                ep0.OooO0oO().OooOOO(OooO0o, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        q02 q02Var = this.OooO0Oo;
        if (q02Var != null) {
            q02Var.OooO0o.OooO0o0(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.OooO0Oo == null) {
            ep0.OooO0oO().OooO0Oo(OooO0o, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            ep0.OooO0oO().OooO0o(OooO0o, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.OooO0o0) {
            try {
                if (this.OooO0o0.containsKey(string)) {
                    ep0.OooO0oO().OooO0Oo(OooO0o, "Job is already being executed by SystemJobService: " + string, new Throwable[0]);
                    return false;
                }
                ep0.OooO0oO().OooO0Oo(OooO0o, "onStartJob for " + string, new Throwable[0]);
                this.OooO0o0.put(string, jobParameters);
                a02 a02Var = new a02(24);
                if (jobParameters.getTriggeredContentUris() != null) {
                    a02Var.OooO0o = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    a02Var.OooO0o0 = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    a02Var.OooO0oO = jobParameters.getNetwork();
                }
                this.OooO0Oo.OooO0o(string, a02Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        PersistableBundle extras;
        if (this.OooO0Oo == null) {
            ep0.OooO0oO().OooO0Oo(OooO0o, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            ep0.OooO0oO().OooO0o(OooO0o, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        ep0.OooO0oO().OooO0Oo(OooO0o, rj.OooO0OO("onStopJob for ", string), new Throwable[0]);
        synchronized (this.OooO0o0) {
            this.OooO0o0.remove(string);
        }
        this.OooO0Oo.OooO0oO(string);
        g51 g51Var = this.OooO0Oo.OooO0o;
        synchronized (g51Var.OooOOO) {
            zContains = g51Var.OooOO0o.contains(string);
        }
        return !zContains;
    }
}
