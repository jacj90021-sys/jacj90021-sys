package com.cmaster.cloner;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jh2 extends w73 {
    public static final Unsafe OooO00o;
    public static final long OooO0O0;
    public static final long OooO0OO;
    public static final long OooO0Oo;
    public static final long OooO0o;
    public static final long OooO0o0;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new ih2());
            }
            try {
                OooO0OO = unsafe.objectFieldOffset(lh2.class.getDeclaredField("OooO0o"));
                OooO0O0 = unsafe.objectFieldOffset(lh2.class.getDeclaredField("OooO0o0"));
                OooO0Oo = unsafe.objectFieldOffset(lh2.class.getDeclaredField("OooO0Oo"));
                OooO0o0 = unsafe.objectFieldOffset(kh2.class.getDeclaredField("OooO00o"));
                OooO0o = unsafe.objectFieldOffset(kh2.class.getDeclaredField("OooO0O0"));
                OooO00o = unsafe;
            } catch (NoSuchFieldException e) {
                sa.OooOO0(e);
            }
        } catch (PrivilegedActionException e2) {
            qa.OooO0oO("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // com.cmaster.cloner.w73
    public final eh2 OooO00o(lh2 lh2Var) {
        eh2 eh2Var;
        eh2 eh2Var2 = eh2.OooO0Oo;
        do {
            eh2Var = lh2Var.OooO0o0;
            if (eh2Var2 == eh2Var) {
                break;
            }
        } while (!OooO0o0(lh2Var, eh2Var, eh2Var2));
        return eh2Var;
    }

    @Override // com.cmaster.cloner.w73
    public final kh2 OooO0O0(lh2 lh2Var) {
        kh2 kh2Var;
        kh2 kh2Var2 = kh2.OooO0OO;
        do {
            kh2Var = lh2Var.OooO0o;
            if (kh2Var2 == kh2Var) {
                break;
            }
        } while (!OooO0oO(lh2Var, kh2Var, kh2Var2));
        return kh2Var;
    }

    @Override // com.cmaster.cloner.w73
    public final void OooO0OO(kh2 kh2Var, kh2 kh2Var2) {
        OooO00o.putObject(kh2Var, OooO0o, kh2Var2);
    }

    @Override // com.cmaster.cloner.w73
    public final void OooO0Oo(kh2 kh2Var, Thread thread) {
        OooO00o.putObject(kh2Var, OooO0o0, thread);
    }

    @Override // com.cmaster.cloner.w73
    public final boolean OooO0o(lh2 lh2Var, Object obj, Object obj2) {
        return ci2.OooO00o(OooO00o, lh2Var, OooO0Oo, obj, obj2);
    }

    @Override // com.cmaster.cloner.w73
    public final boolean OooO0o0(lh2 lh2Var, eh2 eh2Var, eh2 eh2Var2) {
        return ci2.OooO00o(OooO00o, lh2Var, OooO0O0, eh2Var, eh2Var2);
    }

    @Override // com.cmaster.cloner.w73
    public final boolean OooO0oO(lh2 lh2Var, kh2 kh2Var, kh2 kh2Var2) {
        return ci2.OooO00o(OooO00o, lh2Var, OooO0OO, kh2Var, kh2Var2);
    }
}
