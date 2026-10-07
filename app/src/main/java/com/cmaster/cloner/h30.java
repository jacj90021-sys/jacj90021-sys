package com.cmaster.cloner;

import android.content.Context;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h30 implements kk1 {
    public boolean OooO;
    public final Context OooO0Oo;
    public final qb OooO0o;
    public final String OooO0o0;
    public final boolean OooO0oO;
    public final cl1 OooO0oo;

    public h30(Context context, String str, qb qbVar, boolean z) {
        context.getClass();
        qbVar.getClass();
        this.OooO0Oo = context;
        this.OooO0o0 = str;
        this.OooO0o = qbVar;
        this.OooO0oO = z;
        this.OooO0oo = new cl1(new wf(this, 2));
    }

    @Override // com.cmaster.cloner.kk1
    public final c30 OooOO0O() {
        return ((g30) this.OooO0oo.getValue()).OooO0OO(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.OooO0oo.OooO0o0 != oOO0OO.OooO0o) {
            ((g30) this.OooO0oo.getValue()).close();
        }
    }

    @Override // com.cmaster.cloner.kk1
    public final String getDatabaseName() {
        return this.OooO0o0;
    }

    @Override // com.cmaster.cloner.kk1
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.OooO0oo.OooO0o0 != oOO0OO.OooO0o) {
            ((g30) this.OooO0oo.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.OooO = z;
    }
}
