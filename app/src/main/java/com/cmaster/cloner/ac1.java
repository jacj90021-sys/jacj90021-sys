package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ac1 extends ThreadGroup {
    public static final /* synthetic */ int OooO0o0 = 0;
    public final zb1 OooO0Oo;

    public ac1(ThreadGroup threadGroup, zb1 zb1Var) {
        super(threadGroup, u7.OooO00o(new byte[]{-38, 77, 72, 60, -30, -111, 57, -26}, new byte[]{-69, 35, 44, 78, -115, -8, 93, -98}));
        this.OooO0Oo = zb1Var;
    }

    @Override // java.lang.ThreadGroup, java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.OooO0Oo.uncaughtException(thread, th);
    }
}
