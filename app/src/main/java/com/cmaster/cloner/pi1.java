package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Intent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class pi1 {
    public static final ComponentName OooO00o = new ComponentName(e92.OooO00o, pi1.class.getName());
    public static xq OooO0O0;
    public static int OooO0OO;
    public static int OooO0Oo;
    public static int OooO0o;
    public static int OooO0o0;
    public static int OooO0oO;
    public static int OooO0oo;

    public static synchronized void OooO00o(o0O000 o0o000) {
        try {
            xq xqVar = OooO0O0;
            xqVar.OooO = null;
            xqVar.OooO0oo = false;
            xqVar.OooO0oO = yq.OooOO0;
            int i = OooO0OO;
            Intent intent = o0o000.OooO0Oo;
            Object[] objArr = xqVar.OooO0o;
            objArr[i] = intent;
            objArr[OooO0Oo] = o0o000.OooO0o0;
            objArr[OooO0o0] = o0o000.OooO0o;
            int i2 = OooO0oO;
            Integer numValueOf = Integer.valueOf(o0o000.OooO0oo);
            Object[] objArr2 = xqVar.OooO0o;
            objArr2[i2] = numValueOf;
            objArr2[OooO0o] = o0o000.OooO0oO;
            objArr2[OooO0oo] = o0o000.OooOO0;
            try {
                xqVar.OooO00o();
                ((Integer) xqVar.OooO0oO()).getClass();
            } catch (Exception unused) {
                lw1 lw1VarOooO0O0 = lw1.OooO0O0();
                o0O00OOO o0o00ooo = o0o000.OooOO0O;
                lw1VarOooO0O0.getClass();
                try {
                    lw1VarOooO0O0.OooO00o.o000Oooo(o0o00ooo, 102);
                } catch (Exception e) {
                    lw1.OooO00o(e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
