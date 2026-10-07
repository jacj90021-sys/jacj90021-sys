package com.cmaster.cloner;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dj1 implements Runnable {
    public static final String OooO0oO = ep0.OooO("StopWorkRunnable");
    public final q02 OooO0Oo;
    public final boolean OooO0o;
    public final String OooO0o0;

    public dj1(q02 q02Var, String str, boolean z) {
        this.OooO0Oo = q02Var;
        this.OooO0o0 = str;
        this.OooO0o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zOooOO0;
        q02 q02Var = this.OooO0Oo;
        WorkDatabase workDatabase = q02Var.OooO0OO;
        g51 g51Var = q02Var.OooO0o;
        o0O00000 o0o00000OooOo0o = workDatabase.OooOo0o();
        workDatabase.OooO0OO();
        try {
            String str = this.OooO0o0;
            synchronized (g51Var.OooOOO) {
                zContainsKey = g51Var.OooO.containsKey(str);
            }
            if (this.OooO0o) {
                zOooOO0 = this.OooO0Oo.OooO0o.OooO(this.OooO0o0);
            } else {
                if (!zContainsKey && o0o00000OooOo0o.OooO0o0(this.OooO0o0) == 2) {
                    o0o00000OooOo0o.OooOO0o(1, this.OooO0o0);
                }
                zOooOO0 = this.OooO0Oo.OooO0o.OooOO0(this.OooO0o0);
            }
            ep0.OooO0oO().OooO0Oo(OooO0oO, "StopWorkRunnable for " + this.OooO0o0 + "; Processor.stopWork = " + zOooOO0, new Throwable[0]);
            workDatabase.OooOOo0();
            workDatabase.OooOOO();
        } catch (Throwable th) {
            workDatabase.OooOOO();
            throw th;
        }
    }
}
