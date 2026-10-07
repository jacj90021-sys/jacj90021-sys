package com.cmaster.cloner;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qo2 implements Executor {
    public static final qo2 OooO0Oo;
    public static final /* synthetic */ qo2[] OooO0o0;

    static {
        qo2 qo2Var = new qo2("INSTANCE", 0);
        OooO0Oo = qo2Var;
        OooO0o0 = new qo2[]{qo2Var};
    }

    public static qo2[] values() {
        return (qo2[]) OooO0o0.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((xi1) ay1.OooOOO0().OooO0o0).post(runnable);
    }
}
