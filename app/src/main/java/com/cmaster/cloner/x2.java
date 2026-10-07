package com.cmaster.cloner;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements Executor {
    public final /* synthetic */ int OooO0Oo;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.OooO0Oo) {
            case 0:
                y2.OooO00o().OooO00o.OooO0O0.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
