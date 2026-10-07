package com.cmaster.cloner;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yc1 implements Executor {
    public final /* synthetic */ int OooO0Oo;
    public final Object OooO0o0;

    public yc1() {
        this.OooO0Oo = 2;
        xi1 xi1Var = new xi1(Looper.getMainLooper(), 4, false);
        Looper.getMainLooper();
        this.OooO0o0 = xi1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                ((Executor) obj).execute(new oo0O(1, runnable));
                break;
            case 1:
                ((Handler) ((hx2) obj).OooO0o).post(runnable);
                break;
            default:
                ((xi1) obj).post(runnable);
                break;
        }
    }

    public /* synthetic */ yc1(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }
}
