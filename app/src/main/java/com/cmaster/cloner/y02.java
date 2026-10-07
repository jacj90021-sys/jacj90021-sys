package com.cmaster.cloner;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y02 implements ThreadFactory {
    public int OooO00o;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.OooO00o);
        this.OooO00o = this.OooO00o + 1;
        return threadNewThread;
    }
}
