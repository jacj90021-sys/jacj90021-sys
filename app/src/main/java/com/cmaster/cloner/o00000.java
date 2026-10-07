package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00000 extends il2 {
    @Override // com.cmaster.cloner.il2
    public final boolean OooO00o(o00000O o00000o, o000000 o000000Var, o000000 o000000Var2) {
        synchronized (o00000o) {
            try {
                if (o00000o.OooO0o0 != o000000Var) {
                    return false;
                }
                o00000o.OooO0o0 = o000000Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.il2
    public final boolean OooO0O0(o00000O o00000o, Object obj, Object obj2) {
        synchronized (o00000o) {
            try {
                if (o00000o.OooO0Oo != obj) {
                    return false;
                }
                o00000o.OooO0Oo = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.il2
    public final boolean OooO0OO(o00000O o00000o, o00000O0 o00000o0, o00000O0 o00000o02) {
        synchronized (o00000o) {
            try {
                if (o00000o.OooO0o != o00000o0) {
                    return false;
                }
                o00000o.OooO0o = o00000o02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.il2
    public final void OooO0Oo(o00000O0 o00000o0, o00000O0 o00000o02) {
        o00000o0.OooO0O0 = o00000o02;
    }

    @Override // com.cmaster.cloner.il2
    public final void OooO0o0(o00000O0 o00000o0, Thread thread) {
        o00000o0.OooO00o = thread;
    }
}
