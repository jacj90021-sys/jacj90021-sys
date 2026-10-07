package com.cmaster.cloner;

import android.database.sqlite.SQLiteProgram;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class i30 implements nk1 {
    public final SQLiteProgram OooO0Oo;

    public i30(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.OooO0Oo = sQLiteProgram;
    }

    @Override // com.cmaster.cloner.nk1
    public final void OooO00o(int i, long j) {
        this.OooO0Oo.bindLong(i, j);
    }

    @Override // com.cmaster.cloner.nk1
    public final void OooO0O0(int i) {
        this.OooO0Oo.bindNull(i);
    }

    @Override // com.cmaster.cloner.nk1
    public final void OooO0Oo(int i, String str) {
        str.getClass();
        this.OooO0Oo.bindString(i, str);
    }

    @Override // com.cmaster.cloner.nk1
    public final void OooO0o0(int i, double d) {
        this.OooO0Oo.bindDouble(i, d);
    }

    @Override // com.cmaster.cloner.nk1
    public final void OooOO0(int i, byte[] bArr) {
        this.OooO0Oo.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.OooO0Oo.close();
    }
}
