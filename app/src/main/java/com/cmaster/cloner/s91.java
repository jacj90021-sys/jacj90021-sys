package com.cmaster.cloner;

import android.os.Process;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s91 extends Thread {
    public final int OooO0Oo;

    public s91(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.OooO0Oo = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.OooO0Oo);
        super.run();
    }
}
