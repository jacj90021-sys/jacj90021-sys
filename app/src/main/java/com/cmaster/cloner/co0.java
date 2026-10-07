package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class co0 {
    public final rp1 OooO00o;
    public final xp1 OooO0O0;
    public int OooO0OO = -1;
    public u81 OooO0Oo;

    public co0(rp1 rp1Var, xp1 xp1Var) {
        this.OooO00o = rp1Var;
        this.OooO0O0 = xp1Var;
    }

    public final u81 OooO00o() {
        if (this.OooO0Oo == null) {
            this.OooO00o.OooOO0O();
            if (this.OooO0Oo == null) {
                throw new AssertionError();
            }
        }
        return this.OooO0Oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{-18}, new byte[]{-104, -35, -93, 47, 4, 19, -53, -27}));
        sb.append(this.OooO0OO);
        sb.append(u7.OooO00o(new byte[]{-41}, new byte[]{-1, -112, 23, -28, 3, -98, -46, 61}));
        sb.append(this.OooO0O0);
        return rj.OooO0oo(new byte[]{-91}, new byte[]{-116, -85, 39, 116, 44, -77, -22, -38}, sb);
    }
}
