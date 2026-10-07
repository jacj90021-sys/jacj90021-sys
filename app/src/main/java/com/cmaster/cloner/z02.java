package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z02 implements Runnable {
    public final a12 OooO0Oo;
    public final String OooO0o0;

    public z02(a12 a12Var, String str) {
        this.OooO0Oo = a12Var;
        this.OooO0o0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.OooO0Oo.OooO0Oo) {
            try {
                if (((z02) this.OooO0Oo.OooO0O0.remove(this.OooO0o0)) != null) {
                    jp jpVar = (jp) this.OooO0Oo.OooO0OO.remove(this.OooO0o0);
                    if (jpVar != null) {
                        String str = this.OooO0o0;
                        ep0.OooO0oO().OooO0Oo(jp.OooOOO0, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        jpVar.OooO0o0();
                    }
                } else {
                    ep0.OooO0oO().OooO0Oo("WrkTimerRunnable", "Timer with " + this.OooO0o0 + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
