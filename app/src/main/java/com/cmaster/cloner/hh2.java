package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hh2 extends w73 {
    @Override // com.cmaster.cloner.w73
    public final eh2 OooO00o(lh2 lh2Var) {
        eh2 eh2Var;
        eh2 eh2Var2 = eh2.OooO0Oo;
        synchronized (lh2Var) {
            try {
                eh2Var = lh2Var.OooO0o0;
                if (eh2Var != eh2Var2) {
                    lh2Var.OooO0o0 = eh2Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eh2Var;
    }

    @Override // com.cmaster.cloner.w73
    public final kh2 OooO0O0(lh2 lh2Var) {
        kh2 kh2Var;
        kh2 kh2Var2 = kh2.OooO0OO;
        synchronized (lh2Var) {
            try {
                kh2Var = lh2Var.OooO0o;
                if (kh2Var != kh2Var2) {
                    lh2Var.OooO0o = kh2Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kh2Var;
    }

    @Override // com.cmaster.cloner.w73
    public final void OooO0OO(kh2 kh2Var, kh2 kh2Var2) {
        kh2Var.OooO0O0 = kh2Var2;
    }

    @Override // com.cmaster.cloner.w73
    public final void OooO0Oo(kh2 kh2Var, Thread thread) {
        kh2Var.OooO00o = thread;
    }

    @Override // com.cmaster.cloner.w73
    public final boolean OooO0o(lh2 lh2Var, Object obj, Object obj2) {
        synchronized (lh2Var) {
            try {
                if (lh2Var.OooO0Oo != obj) {
                    return false;
                }
                lh2Var.OooO0Oo = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.w73
    public final boolean OooO0o0(lh2 lh2Var, eh2 eh2Var, eh2 eh2Var2) {
        synchronized (lh2Var) {
            try {
                if (lh2Var.OooO0o0 != eh2Var) {
                    return false;
                }
                lh2Var.OooO0o0 = eh2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.w73
    public final boolean OooO0oO(lh2 lh2Var, kh2 kh2Var, kh2 kh2Var2) {
        synchronized (lh2Var) {
            try {
                if (lh2Var.OooO0o != kh2Var) {
                    return false;
                }
                lh2Var.OooO0o = kh2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
