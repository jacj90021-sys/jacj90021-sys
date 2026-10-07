package com.cmaster.cloner;

import android.content.Context;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e12 {
    public static final e12 OooO0O0;
    public or OooO00o;

    static {
        e12 e12Var = new e12();
        e12Var.OooO00o = null;
        OooO0O0 = e12Var;
    }

    public static or OooO00o(Context context) {
        or orVar;
        e12 e12Var = OooO0O0;
        synchronized (e12Var) {
            try {
                if (e12Var.OooO00o == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    e12Var.OooO00o = new or(context, 2);
                }
                orVar = e12Var.OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return orVar;
    }
}
