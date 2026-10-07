package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bm1 extends wl1 {
    public final Runnable OooO0o;

    public bm1(Runnable runnable, long j, ep0 ep0Var) {
        super(j, ep0Var);
        this.OooO0o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.OooO0o.run();
        } finally {
            this.OooO0o0.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.OooO0o;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(rn.OooO00o(runnable));
        sb.append(", ");
        sb.append(this.OooO0Oo);
        sb.append(", ");
        sb.append(this.OooO0o0);
        sb.append(']');
        return sb.toString();
    }
}
