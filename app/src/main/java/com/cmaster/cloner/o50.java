package com.cmaster.cloner;

import android.os.Process;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o50 extends Thread {
    public final /* synthetic */ int OooO0Oo = 0;

    public /* synthetic */ o50(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.OooO0Oo) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ o50(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
