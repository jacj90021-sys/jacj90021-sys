package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class co {
    public static final ip OooO00o;

    static {
        String property;
        ip ipVar;
        int i = kl1.OooO00o;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            wo woVar = gs.OooO00o;
            f70 f70Var = pp0.OooO00o;
            f70 f70Var2 = f70Var.OooO0oo;
            ipVar = f70Var;
            if (f70Var == null) {
                ipVar = bo.OooOOO0;
            }
        } else {
            ipVar = bo.OooOOO0;
        }
        OooO00o = ipVar;
    }
}
