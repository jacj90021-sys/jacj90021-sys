package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import com.cmaster.cloner.c12;
import com.cmaster.cloner.cn;
import com.cmaster.cloner.e10;
import com.cmaster.cloner.hx2;
import com.cmaster.cloner.nn0;
import com.cmaster.cloner.o02;
import com.cmaster.cloner.p02;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.sb;
import com.cmaster.cloner.t02;
import com.cmaster.cloner.uf1;
import com.cmaster.cloner.zl1;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ListenableWorker {
    public final Context OooO0Oo;
    public volatile boolean OooO0o;
    public final WorkerParameters OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            ra.OooOOO("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            ra.OooOOO("WorkerParameters is null");
            throw null;
        }
        this.OooO0Oo = context;
        this.OooO0o0 = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.OooO0Oo;
    }

    public Executor getBackgroundExecutor() {
        return this.OooO0o0.OooO0o;
    }

    public nn0 getForegroundInfoAsync() {
        uf1 uf1Var = new uf1();
        uf1Var.OooO(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return uf1Var;
    }

    public final UUID getId() {
        return this.OooO0o0.OooO00o;
    }

    public final cn getInputData() {
        return this.OooO0o0.OooO0O0;
    }

    public final Network getNetwork() {
        return (Network) this.OooO0o0.OooO0Oo.OooO0oO;
    }

    public final int getRunAttemptCount() {
        return this.OooO0o0.OooO0o0;
    }

    public final Set<String> getTags() {
        return this.OooO0o0.OooO0OO;
    }

    public zl1 getTaskExecutor() {
        return this.OooO0o0.OooO0oO;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.OooO0o0.OooO0Oo.OooO0o0;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.OooO0o0.OooO0Oo.OooO0o;
    }

    public c12 getWorkerFactory() {
        return this.OooO0o0.OooO0oo;
    }

    public boolean isRunInForeground() {
        return this.OooO0oo;
    }

    public final boolean isStopped() {
        return this.OooO0o;
    }

    public final boolean isUsed() {
        return this.OooO0oO;
    }

    public void onStopped() {
    }

    public final nn0 setForegroundAsync(e10 e10Var) {
        this.OooO0oo = true;
        p02 p02Var = this.OooO0o0.OooOO0;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        p02Var.getClass();
        uf1 uf1Var = new uf1();
        ((hx2) p02Var.OooO00o).OooOOOo(new o02(p02Var, uf1Var, id, e10Var, applicationContext));
        return uf1Var;
    }

    public nn0 setProgressAsync(cn cnVar) {
        t02 t02Var = this.OooO0o0.OooO;
        getApplicationContext();
        UUID id = getId();
        t02Var.getClass();
        uf1 uf1Var = new uf1();
        ((hx2) t02Var.OooO0O0).OooOOOo(new sb(t02Var, id, cnVar, uf1Var, 2));
        return uf1Var;
    }

    public void setRunInForeground(boolean z) {
        this.OooO0oo = z;
    }

    public final void setUsed() {
        this.OooO0oO = true;
    }

    public abstract nn0 startWork();

    public final void stop() {
        this.OooO0o = true;
        onStopped();
    }
}
