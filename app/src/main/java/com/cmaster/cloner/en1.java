package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class en1 implements r91, m91 {
    public final r91 OooO00o;
    public final Object OooO0O0;
    public volatile kh1 OooO0OO;
    public volatile m91 OooO0Oo;
    public boolean OooO0oO;
    public int OooO0o0 = 3;
    public int OooO0o = 3;

    public en1(Object obj, r91 r91Var) {
        this.OooO0O0 = obj;
        this.OooO00o = r91Var;
    }

    @Override // com.cmaster.cloner.r91
    public final void OooO(m91 m91Var) {
        synchronized (this.OooO0O0) {
            try {
                if (!m91Var.equals(this.OooO0OO)) {
                    this.OooO0o = 5;
                    return;
                }
                this.OooO0o0 = 5;
                r91 r91Var = this.OooO00o;
                if (r91Var != null) {
                    r91Var.OooO(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.r91, com.cmaster.cloner.m91
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.OooO0O0) {
            try {
                z = this.OooO0Oo.OooO00o() || this.OooO0OO.OooO00o();
            } finally {
            }
        }
        return z;
    }

    @Override // com.cmaster.cloner.r91
    public final boolean OooO0O0(m91 m91Var) {
        boolean z;
        synchronized (this.OooO0O0) {
            try {
                r91 r91Var = this.OooO00o;
                z = (r91Var == null || r91Var.OooO0O0(this)) && (m91Var.equals(this.OooO0OO) || this.OooO0o0 != 4);
            } finally {
            }
        }
        return z;
    }

    @Override // com.cmaster.cloner.r91
    public final boolean OooO0OO(m91 m91Var) {
        boolean z;
        synchronized (this.OooO0O0) {
            try {
                r91 r91Var = this.OooO00o;
                z = (r91Var == null || r91Var.OooO0OO(this)) && m91Var.equals(this.OooO0OO) && !OooO00o();
            } finally {
            }
        }
        return z;
    }

    @Override // com.cmaster.cloner.m91
    public final void OooO0Oo() {
        synchronized (this.OooO0O0) {
            try {
                if (!px0.OooO0o0(this.OooO0o)) {
                    this.OooO0o = 2;
                    this.OooO0Oo.OooO0Oo();
                }
                if (!px0.OooO0o0(this.OooO0o0)) {
                    this.OooO0o0 = 2;
                    this.OooO0OO.OooO0Oo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.m91
    public final boolean OooO0o() {
        boolean z;
        synchronized (this.OooO0O0) {
            z = this.OooO0o0 == 3;
        }
        return z;
    }

    @Override // com.cmaster.cloner.r91
    public final boolean OooO0o0(m91 m91Var) {
        boolean z;
        synchronized (this.OooO0O0) {
            try {
                r91 r91Var = this.OooO00o;
                z = (r91Var == null || r91Var.OooO0o0(this)) && m91Var.equals(this.OooO0OO) && this.OooO0o0 != 2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.cmaster.cloner.r91
    public final void OooO0oO(m91 m91Var) {
        synchronized (this.OooO0O0) {
            try {
                if (m91Var.equals(this.OooO0Oo)) {
                    this.OooO0o = 4;
                    return;
                }
                this.OooO0o0 = 4;
                r91 r91Var = this.OooO00o;
                if (r91Var != null) {
                    r91Var.OooO0oO(this);
                }
                if (!px0.OooO0o0(this.OooO0o)) {
                    this.OooO0Oo.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.m91
    public final void OooO0oo() {
        synchronized (this.OooO0O0) {
            try {
                this.OooO0oO = true;
                try {
                    if (this.OooO0o0 != 4 && this.OooO0o != 1) {
                        this.OooO0o = 1;
                        this.OooO0Oo.OooO0oo();
                    }
                    if (this.OooO0oO && this.OooO0o0 != 1) {
                        this.OooO0o0 = 1;
                        this.OooO0OO.OooO0oo();
                    }
                    this.OooO0oO = false;
                } catch (Throwable th) {
                    this.OooO0oO = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.cmaster.cloner.m91
    public final boolean OooOO0() {
        boolean z;
        synchronized (this.OooO0O0) {
            z = this.OooO0o0 == 4;
        }
        return z;
    }

    @Override // com.cmaster.cloner.m91
    public final boolean OooOO0O(m91 m91Var) {
        if (!(m91Var instanceof en1)) {
            return false;
        }
        en1 en1Var = (en1) m91Var;
        if (this.OooO0OO == null) {
            if (en1Var.OooO0OO != null) {
                return false;
            }
        } else if (!this.OooO0OO.OooOO0O(en1Var.OooO0OO)) {
            return false;
        }
        return this.OooO0Oo == null ? en1Var.OooO0Oo == null : this.OooO0Oo.OooOO0O(en1Var.OooO0Oo);
    }

    @Override // com.cmaster.cloner.m91
    public final void clear() {
        synchronized (this.OooO0O0) {
            this.OooO0oO = false;
            this.OooO0o0 = 3;
            this.OooO0o = 3;
            this.OooO0Oo.clear();
            this.OooO0OO.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.cmaster.cloner.r91] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.cmaster.cloner.r91
    public final r91 getRoot() {
        r91 root = this;
        synchronized (this.OooO0O0) {
            try {
                r91 r91Var = this.OooO00o;
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
        synchronized (this.OooO0O0) {
            z = true;
            if (this.OooO0o0 != 1) {
                z = false;
            }
        }
        return z;
    }
}
