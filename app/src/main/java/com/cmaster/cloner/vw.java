package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vw implements r91, m91 {
    public final Object OooO00o;
    public final r91 OooO0O0;
    public volatile m91 OooO0OO;
    public volatile m91 OooO0Oo;
    public int OooO0o0 = 3;
    public int OooO0o = 3;

    public vw(Object obj, r91 r91Var) {
        this.OooO00o = obj;
        this.OooO0O0 = r91Var;
    }

    @Override // com.cmaster.cloner.r91
    public final void OooO(m91 m91Var) {
        synchronized (this.OooO00o) {
            try {
                if (m91Var.equals(this.OooO0Oo)) {
                    this.OooO0o = 5;
                    r91 r91Var = this.OooO0O0;
                    if (r91Var != null) {
                        r91Var.OooO(this);
                    }
                    return;
                }
                this.OooO0o0 = 5;
                if (this.OooO0o != 1) {
                    this.OooO0o = 1;
                    this.OooO0Oo.OooO0oo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.r91, com.cmaster.cloner.m91
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.OooO00o) {
            try {
                z = this.OooO0OO.OooO00o() || this.OooO0Oo.OooO00o();
            } finally {
            }
        }
        return z;
    }

    @Override // com.cmaster.cloner.r91
    public final boolean OooO0O0(m91 m91Var) {
        boolean z;
        synchronized (this.OooO00o) {
            r91 r91Var = this.OooO0O0;
            z = r91Var == null || r91Var.OooO0O0(this);
        }
        return z;
    }

    @Override // com.cmaster.cloner.r91
    public final boolean OooO0OO(m91 m91Var) {
        boolean z;
        int i;
        synchronized (this.OooO00o) {
            r91 r91Var = this.OooO0O0;
            z = false;
            if (r91Var == null || r91Var.OooO0OO(this)) {
                if (this.OooO0o0 != 5 ? m91Var.equals(this.OooO0OO) : m91Var.equals(this.OooO0Oo) && ((i = this.OooO0o) == 4 || i == 5)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.cmaster.cloner.m91
    public final void OooO0Oo() {
        synchronized (this.OooO00o) {
            try {
                if (this.OooO0o0 == 1) {
                    this.OooO0o0 = 2;
                    this.OooO0OO.OooO0Oo();
                }
                if (this.OooO0o == 1) {
                    this.OooO0o = 2;
                    this.OooO0Oo.OooO0Oo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.m91
    public final boolean OooO0o() {
        boolean z;
        synchronized (this.OooO00o) {
            try {
                z = this.OooO0o0 == 3 && this.OooO0o == 3;
            } finally {
            }
        }
        return z;
    }

    @Override // com.cmaster.cloner.r91
    public final boolean OooO0o0(m91 m91Var) {
        boolean z;
        synchronized (this.OooO00o) {
            r91 r91Var = this.OooO0O0;
            z = (r91Var == null || r91Var.OooO0o0(this)) && m91Var.equals(this.OooO0OO);
        }
        return z;
    }

    @Override // com.cmaster.cloner.r91
    public final void OooO0oO(m91 m91Var) {
        synchronized (this.OooO00o) {
            try {
                if (m91Var.equals(this.OooO0OO)) {
                    this.OooO0o0 = 4;
                } else if (m91Var.equals(this.OooO0Oo)) {
                    this.OooO0o = 4;
                }
                r91 r91Var = this.OooO0O0;
                if (r91Var != null) {
                    r91Var.OooO0oO(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.m91
    public final void OooO0oo() {
        synchronized (this.OooO00o) {
            try {
                if (this.OooO0o0 != 1) {
                    this.OooO0o0 = 1;
                    this.OooO0OO.OooO0oo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.m91
    public final boolean OooOO0() {
        boolean z;
        synchronized (this.OooO00o) {
            try {
                z = this.OooO0o0 == 4 || this.OooO0o == 4;
            } finally {
            }
        }
        return z;
    }

    @Override // com.cmaster.cloner.m91
    public final boolean OooOO0O(m91 m91Var) {
        if (m91Var instanceof vw) {
            vw vwVar = (vw) m91Var;
            if (this.OooO0OO.OooOO0O(vwVar.OooO0OO) && this.OooO0Oo.OooOO0O(vwVar.OooO0Oo)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.m91
    public final void clear() {
        synchronized (this.OooO00o) {
            try {
                this.OooO0o0 = 3;
                this.OooO0OO.clear();
                if (this.OooO0o != 3) {
                    this.OooO0o = 3;
                    this.OooO0Oo.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.cmaster.cloner.r91] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.cmaster.cloner.r91
    public final r91 getRoot() {
        r91 root = this;
        synchronized (this.OooO00o) {
            try {
                r91 r91Var = this.OooO0O0;
                if (r91Var != null) {
                    root = r91Var.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.cmaster.cloner.m91
    public final boolean isRunning() {
        boolean z;
        synchronized (this.OooO00o) {
            try {
                z = true;
                if (this.OooO0o0 != 1 && this.OooO0o != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }
}
