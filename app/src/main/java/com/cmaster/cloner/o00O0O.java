package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00O0O extends dl2 {
    @Override // com.cmaster.cloner.dl2
    public final boolean OooO00o(o00Ooo o00ooo, Oooo0 oooo0, Oooo0 oooo02) {
        synchronized (o00ooo) {
            try {
                if (o00ooo.OooO0o0 != oooo0) {
                    return false;
                }
                o00ooo.OooO0o0 = oooo02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.dl2
    public final boolean OooO0O0(o00Ooo o00ooo, Object obj, Object obj2) {
        synchronized (o00ooo) {
            try {
                if (o00ooo.OooO0Oo != obj) {
                    return false;
                }
                o00ooo.OooO0Oo = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.dl2
    public final boolean OooO0OO(o00Ooo o00ooo, o00Oo0 o00oo0, o00Oo0 o00oo02) {
        synchronized (o00ooo) {
            try {
                if (o00ooo.OooO0o != o00oo0) {
                    return false;
                }
                o00ooo.OooO0o = o00oo02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.dl2
    public final void OooO0Oo(o00Oo0 o00oo0, o00Oo0 o00oo02) {
        o00oo0.OooO0O0 = o00oo02;
    }

    @Override // com.cmaster.cloner.dl2
    public final void OooO0o0(o00Oo0 o00oo0, Thread thread) {
        o00oo0.OooO00o = thread;
    }
}
