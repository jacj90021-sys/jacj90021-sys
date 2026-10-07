package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.cmaster.cloner.ep0;
import com.cmaster.cloner.f02;
import com.cmaster.cloner.nn0;
import com.cmaster.cloner.o00OOO00;
import com.cmaster.cloner.q02;
import com.cmaster.cloner.uf1;
import com.cmaster.cloner.zl1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements f02 {
    public static final String OooOOO = ep0.OooO("ConstraintTrkngWrkr");
    public final WorkerParameters OooO;
    public final Object OooOO0;
    public volatile boolean OooOO0O;
    public final uf1 OooOO0o;
    public ListenableWorker OooOOO0;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.OooO = workerParameters;
        this.OooOO0 = new Object();
        this.OooOO0O = false;
        this.OooOO0o = new uf1();
    }

    @Override // com.cmaster.cloner.f02
    public final void OooO0Oo(ArrayList arrayList) {
        ep0.OooO0oO().OooO0Oo(OooOOO, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.OooOO0) {
            this.OooOO0O = true;
        }
    }

    @Override // com.cmaster.cloner.f02
    public final void OooO0o(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final zl1 getTaskExecutor() {
        return q02.OooO0O0(getApplicationContext()).OooO0Oo;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.OooOOO0;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.OooOOO0;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.OooOOO0.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final nn0 startWork() {
        getBackgroundExecutor().execute(new o00OOO00(this, 11));
        return this.OooOO0o;
    }
}
