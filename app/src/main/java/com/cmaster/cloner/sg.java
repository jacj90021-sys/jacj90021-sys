package com.cmaster.cloner;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class sg implements ThreadFactory {
    public final /* synthetic */ String OooO00o;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.OooO00o);
        thread.setPriority(10);
        return thread;
    }
}
