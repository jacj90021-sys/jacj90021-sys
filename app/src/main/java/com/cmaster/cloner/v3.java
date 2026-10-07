package com.cmaster.cloner;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v3 implements Executor {
    public final /* synthetic */ int OooO0Oo;
    public final Handler OooO0o0;

    public v3() {
        this.OooO0Oo = 0;
        this.OooO0o0 = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.OooO0Oo;
        Handler handler = this.OooO0o0;
        switch (i) {
            case 0:
                handler.post(runnable);
                return;
            case 1:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 2:
                handler.post(runnable);
                return;
            default:
                handler.post(runnable);
                return;
        }
    }

    public /* synthetic */ v3(Handler handler, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = handler;
    }
}
