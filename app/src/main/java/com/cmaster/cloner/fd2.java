package com.cmaster.cloner;

import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class fd2 implements ThreadFactory {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ fd2(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                gd2 gd2Var = (gd2) obj;
                Thread thread = new Thread(runnable, px0.OooOOO(gd2Var.OooO0Oo.getAndIncrement(), "Google consent worker #"));
                gd2Var.OooO0o = new WeakReference(thread);
                return thread;
            default:
                return ((ThreadFactory) obj).newThread(new oo0O(3, runnable));
        }
    }
}
