package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class j62 {
    public static final uk1 OooO00o = new uk1("COMPLETING_ALREADY", 0);
    public static final uk1 OooO0O0 = new uk1("COMPLETING_WAITING_CHILDREN", 0);
    public static final uk1 OooO0OO = new uk1("COMPLETING_RETRY", 0);
    public static final uk1 OooO0Oo = new uk1("TOO_LATE_TO_CANCEL", 0);
    public static final uk1 OooO0o0 = new uk1("SEALED", 0);
    public static final jv OooO0o = new jv(false);
    public static final jv OooO0oO = new jv(true);

    public static final Object OooO00o(Object obj) {
        bg0 bg0Var;
        cg0 cg0Var = obj instanceof cg0 ? (cg0) obj : null;
        return (cg0Var == null || (bg0Var = cg0Var.OooO00o) == null) ? obj : bg0Var;
    }
}
