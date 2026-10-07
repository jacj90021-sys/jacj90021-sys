package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i31 implements rc1 {
    public final rc1 OooO0Oo;
    public final /* synthetic */ p31 OooO0o;
    public final long OooO0o0;

    public i31(p31 p31Var, rc1 rc1Var) {
        rc1Var.getClass();
        this.OooO0o = p31Var;
        this.OooO0Oo = rc1Var;
        this.OooO0o0 = p43.OooO00o();
    }

    @Override // com.cmaster.cloner.rc1
    public final void OooO00o(int i, long j) {
        if (this.OooO0o.OooO0Oo.get()) {
            zy2.OooO0O0(21, "Statement is recycled");
            throw null;
        }
        if (this.OooO0o0 == p43.OooO00o()) {
            this.OooO0Oo.OooO00o(i, j);
        } else {
            zy2.OooO0O0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // com.cmaster.cloner.rc1
    public final void OooO0O0(int i) {
        if (this.OooO0o.OooO0Oo.get()) {
            zy2.OooO0O0(21, "Statement is recycled");
            throw null;
        }
        if (this.OooO0o0 == p43.OooO00o()) {
            this.OooO0Oo.OooO0O0(i);
        } else {
            zy2.OooO0O0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // com.cmaster.cloner.rc1
    public final void OooO0oO(int i, String str) {
        str.getClass();
        if (this.OooO0o.OooO0Oo.get()) {
            zy2.OooO0O0(21, "Statement is recycled");
            throw null;
        }
        if (this.OooO0o0 == p43.OooO00o()) {
            this.OooO0Oo.OooO0oO(i, str);
        } else {
            zy2.OooO0O0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // com.cmaster.cloner.rc1
    public final String OooOO0o(int i) {
        if (this.OooO0o.OooO0Oo.get()) {
            zy2.OooO0O0(21, "Statement is recycled");
            throw null;
        }
        if (this.OooO0o0 == p43.OooO00o()) {
            return this.OooO0Oo.OooOO0o(i);
        }
        zy2.OooO0O0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // com.cmaster.cloner.rc1
    public final boolean OooOOOo() {
        if (this.OooO0o.OooO0Oo.get()) {
            zy2.OooO0O0(21, "Statement is recycled");
            throw null;
        }
        if (this.OooO0o0 == p43.OooO00o()) {
            return this.OooO0Oo.OooOOOo();
        }
        zy2.OooO0O0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.OooO0o.OooO0Oo.get()) {
            zy2.OooO0O0(21, "Statement is recycled");
            throw null;
        }
        if (this.OooO0o0 == p43.OooO00o()) {
            this.OooO0Oo.close();
        } else {
            zy2.OooO0O0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // com.cmaster.cloner.rc1
    public final int getColumnCount() {
        if (this.OooO0o.OooO0Oo.get()) {
            zy2.OooO0O0(21, "Statement is recycled");
            throw null;
        }
        if (this.OooO0o0 == p43.OooO00o()) {
            return this.OooO0Oo.getColumnCount();
        }
        zy2.OooO0O0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // com.cmaster.cloner.rc1
    public final String getColumnName(int i) {
        if (this.OooO0o.OooO0Oo.get()) {
            zy2.OooO0O0(21, "Statement is recycled");
            throw null;
        }
        if (this.OooO0o0 == p43.OooO00o()) {
            return this.OooO0Oo.getColumnName(i);
        }
        zy2.OooO0O0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // com.cmaster.cloner.rc1
    public final long getLong(int i) {
        if (this.OooO0o.OooO0Oo.get()) {
            zy2.OooO0O0(21, "Statement is recycled");
            throw null;
        }
        if (this.OooO0o0 == p43.OooO00o()) {
            return this.OooO0Oo.getLong(i);
        }
        zy2.OooO0O0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // com.cmaster.cloner.rc1
    public final boolean isNull(int i) {
        if (this.OooO0o.OooO0Oo.get()) {
            zy2.OooO0O0(21, "Statement is recycled");
            throw null;
        }
        if (this.OooO0o0 == p43.OooO00o()) {
            return this.OooO0Oo.isNull(i);
        }
        zy2.OooO0O0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // com.cmaster.cloner.rc1
    public final void reset() {
        if (this.OooO0o.OooO0Oo.get()) {
            zy2.OooO0O0(21, "Statement is recycled");
            throw null;
        }
        if (this.OooO0o0 == p43.OooO00o()) {
            this.OooO0Oo.reset();
        } else {
            zy2.OooO0O0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
