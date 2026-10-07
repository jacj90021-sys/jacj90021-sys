package com.cmaster.cloner;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hi2 implements Executor {
    public static final hi2 OooO0Oo;
    public static final /* synthetic */ hi2[] OooO0o0;

    static {
        hi2 hi2Var = new hi2("INSTANCE", 0);
        OooO0Oo = hi2Var;
        OooO0o0 = new hi2[]{hi2Var};
    }

    public static hi2[] values() {
        return (hi2[]) OooO0o0.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
