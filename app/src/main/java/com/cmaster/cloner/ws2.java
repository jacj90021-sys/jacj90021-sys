package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ws2 {
    public final s52 OooO00o;
    public final k42 OooO0O0;
    public final Object OooO0OO = new Object();
    public boolean OooO0Oo = false;

    public ws2(s52 s52Var, k42 k42Var) {
        this.OooO00o = s52Var;
        this.OooO0O0 = k42Var;
    }

    public final boolean OooO00o() {
        boolean z;
        s52 s52Var = this.OooO00o;
        if (!s52Var.OooO0O0.getBoolean("is_pub_misconfigured", false)) {
            synchronized (this.OooO0OO) {
                z = this.OooO0Oo;
            }
            int i = !z ? 0 : s52Var.OooO0O0.getInt("consent_status", 0);
            if (i != 1 && i != 3) {
                return false;
            }
        }
        return true;
    }
}
