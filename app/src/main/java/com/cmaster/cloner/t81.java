package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t81 {
    public int OooO00o;
    public wp1 OooO0O0;

    public final boolean equals(Object obj) {
        if (!(obj instanceof u81)) {
            return false;
        }
        u81 u81Var = (u81) obj;
        int i = this.OooO00o;
        wp1 wp1Var = this.OooO0O0;
        String str = u81.OooO0o;
        return u81Var.OooO0Oo == i && u81Var.OooO0o0.equals(wp1Var);
    }

    public final int hashCode() {
        int i = this.OooO00o;
        wp1 wp1Var = this.OooO0O0;
        String str = u81.OooO0o;
        return (wp1Var.hashCode() * 31) + i;
    }
}
