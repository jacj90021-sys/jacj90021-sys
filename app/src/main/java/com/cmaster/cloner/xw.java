package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class xw extends zj {
    public static final /* synthetic */ int OooO = 0;
    public long OooO0o;
    public boolean OooO0oO;
    public e3 OooO0oo;

    public final void OooOOoo(boolean z) {
        long j = this.OooO0o - (z ? 4294967296L : 1L);
        this.OooO0o = j;
        if (j <= 0 && this.OooO0oO) {
            shutdown();
        }
    }

    public abstract long OooOo0();

    public final void OooOo00(boolean z) {
        this.OooO0o = (z ? 4294967296L : 1L) + this.OooO0o;
        if (z) {
            return;
        }
        this.OooO0oO = true;
    }

    public final boolean OooOo0O() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        e3 e3Var = this.OooO0oo;
        if (e3Var == null) {
            return false;
        }
        es esVar = (es) (e3Var.isEmpty() ? null : e3Var.removeFirst());
        if (esVar == null) {
            return false;
        }
        esVar.run();
        return true;
    }

    public abstract void shutdown();
}
