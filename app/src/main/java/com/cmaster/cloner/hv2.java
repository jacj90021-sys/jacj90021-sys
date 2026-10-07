package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class hv2 {
    public static final void OooO00o(yt1 yt1Var, o0O000O o0o000o, jm0 jm0Var) {
        AutoCloseable autoCloseable;
        o0o000o.getClass();
        jm0Var.getClass();
        zt1 zt1Var = yt1Var.OooO0Oo;
        if (zt1Var != null) {
            synchronized (zt1Var.OooO00o) {
                autoCloseable = (AutoCloseable) zt1Var.OooO0O0.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        cd1 cd1Var = (cd1) autoCloseable;
        if (cd1Var == null || cd1Var.OooO0o) {
            return;
        }
        cd1Var.OooO0OO(o0o000o, jm0Var);
        xl0 xl0Var = jm0Var.OooO0o;
        if (xl0Var == xl0.OooO0o0 || xl0Var.compareTo(xl0.OooO0oO) >= 0) {
            o0o000o.OoooOOO();
        } else {
            jm0Var.OooO0OO(new so(o0o000o, jm0Var));
        }
    }
}
