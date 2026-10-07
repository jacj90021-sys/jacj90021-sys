package com.cmaster.cloner;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g1 extends Handler implements Executor {
    public final /* synthetic */ int OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(Looper looper, int i) {
        super(looper);
        this.OooO0Oo = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.OooO0Oo) {
            case 0:
                if (!h1.OooO0O0()) {
                    post(runnable);
                    break;
                } else {
                    runnable.run();
                    break;
                }
            default:
                if (!cx1.OooO00o()) {
                    post(runnable);
                    break;
                } else {
                    runnable.run();
                    break;
                }
        }
    }
}
