package com.cmaster.cloner;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nr implements Executor {
    public static final nr OooO0Oo;
    public static final /* synthetic */ nr[] OooO0o0;

    static {
        nr nrVar = new nr("INSTANCE", 0);
        OooO0Oo = nrVar;
        OooO0o0 = new nr[]{nrVar};
    }

    public static nr valueOf(String str) {
        return (nr) Enum.valueOf(nr.class, str);
    }

    public static nr[] values() {
        return (nr[]) OooO0o0.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
