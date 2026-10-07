package com.cmaster.cloner;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00OO implements ThreadFactory {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ o00OO(int i) {
        this.OooO00o = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.OooO00o) {
            case 0:
                return new Thread(new oo0O(0, runnable), "glide-active-resources");
            case 1:
                return new o50(runnable);
            default:
                return new s91(runnable);
        }
    }
}
