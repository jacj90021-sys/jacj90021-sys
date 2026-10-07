package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ou2 {
    public static final void OooO00o(vj vjVar, CancellationException cancellationException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        nk0 nk0Var = (nk0) vjVar.OooO0oo(gu0.OooO0o0);
        if (nk0Var != null) {
            nk0Var.OooOOO0(cancellationException);
        }
    }

    public static ks OooO0O0(nk0 nk0Var, boolean z, gk0 gk0Var, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        if (nk0Var instanceof nk0) {
            return nk0Var.Oooo000(z, z2, gk0Var);
        }
        kj0 kj0Var = new kj0(1, gk0Var, fj0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 1);
        nk0Var.getClass();
        return nk0Var.Oooo000(z, z2, new ej0(kj0Var));
    }
}
