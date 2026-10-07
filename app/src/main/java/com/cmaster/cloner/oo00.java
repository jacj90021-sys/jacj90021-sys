package com.cmaster.cloner;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oo00 implements Executor {
    public final /* synthetic */ int OooO0Oo;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.OooO0Oo) {
            case 0:
                new Thread(runnable).start();
                break;
            case 1:
                h1.OooO00o.execute(runnable);
                break;
            case 2:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                h1.OooO0O0.post(runnable);
                break;
            case 4:
                pr1.OooO0o().post(runnable);
                break;
            case 5:
                runnable.run();
                break;
            case 6:
                cx1.OooO00o.execute(runnable);
                break;
            case 7:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 8:
                cx1.OooO0O0.post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
