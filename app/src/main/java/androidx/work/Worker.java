package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.cmaster.cloner.nn0;
import com.cmaster.cloner.rn0;
import com.cmaster.cloner.u91;
import com.cmaster.cloner.uf1;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public uf1 OooO;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract rn0 doWork();

    @Override // androidx.work.ListenableWorker
    public final nn0 startWork() {
        this.OooO = new uf1();
        getBackgroundExecutor().execute(new u91(this, 14));
        return this.OooO;
    }
}
