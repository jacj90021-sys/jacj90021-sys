package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wa1 {
    public int OooO00o = 0;
    public Object OooO0O0;
    public Object OooO0OO;
    public transient Throwable OooO0Oo;

    public static wa1 OooO00o(int i, Object obj, Throwable th) {
        wa1 wa1Var = new wa1();
        wa1Var.OooO00o = i;
        wa1Var.OooO0OO = obj;
        wa1Var.OooO0Oo = th;
        return wa1Var;
    }

    public static wa1 OooO0O0(wa1 wa1Var) {
        wa1 wa1Var2 = new wa1();
        wa1Var2.OooO00o = wa1Var.OooO00o;
        wa1Var2.OooO0OO = wa1Var.OooO0OO;
        wa1Var2.OooO0Oo = wa1Var.OooO0Oo;
        return wa1Var2;
    }

    public static wa1 OooO0OO(Throwable th) {
        return OooO00o(-1, String.valueOf(th), th);
    }

    public static wa1 OooO0o0(Object obj) {
        wa1 wa1Var = new wa1();
        wa1Var.OooO00o = 0;
        wa1Var.OooO0OO = "success";
        wa1Var.OooO0O0 = obj;
        return wa1Var;
    }

    public final boolean OooO0Oo() {
        return this.OooO00o == 0;
    }

    public final String toString() {
        return "Response{code=" + this.OooO00o + ", data=" + this.OooO0O0 + ", message='" + this.OooO0OO + "', throwable=" + this.OooO0Oo + '}';
    }
}
