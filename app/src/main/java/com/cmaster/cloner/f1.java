package com.cmaster.cloner;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f1 implements ThreadFactory {
    public final /* synthetic */ int OooO00o;
    public final AtomicInteger OooO0O0;

    public f1(int i) {
        this.OooO00o = i;
        switch (i) {
            case 1:
                this.OooO0O0 = new AtomicInteger(0);
                break;
            case 2:
                this.OooO0O0 = new AtomicInteger(1);
                break;
            default:
                this.OooO0O0 = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.OooO00o;
        AtomicInteger atomicInteger = this.OooO0O0;
        switch (i) {
            case 0:
                return new Thread(runnable, "AppSync #" + atomicInteger.getAndIncrement());
            case 1:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + atomicInteger.getAndIncrement());
                return thread;
            default:
                return new Thread(runnable, u7.OooO00o(new byte[]{100, 116, -88, -82, -119, -35, -80}, new byte[]{37, 7, -47, -64, -22, -3, -109, -61}) + atomicInteger.getAndIncrement());
        }
    }
}
