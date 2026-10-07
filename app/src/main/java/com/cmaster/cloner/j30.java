package com.cmaster.cloner;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j30 extends i30 implements nk1 {
    public final SQLiteStatement OooO0o0;

    public j30(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.OooO0o0 = sQLiteStatement;
    }

    public final int OooO0OO() {
        return this.OooO0o0.executeUpdateDelete();
    }
}
