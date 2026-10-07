package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.cmaster.cloner.qn0;
import com.cmaster.cloner.rn0;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final rn0 doWork() {
        return new qn0(getInputData());
    }
}
