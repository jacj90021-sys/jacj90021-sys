package com.cmaster.cloner;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class c30 implements Closeable {
    public final SQLiteDatabase OooO0Oo;
    public static final String[] OooO0o0 = new String[0];
    public static final hl0 OooO0o = wu2.OooO00o(new b30(0));
    public static final hl0 OooO0oO = wu2.OooO00o(new b30(1));

    public c30(SQLiteDatabase sQLiteDatabase) {
        this.OooO0Oo = sQLiteDatabase;
    }

    public final void OooO() {
        this.OooO0Oo.endTransaction();
    }

    public final void OooO0OO() {
        this.OooO0Oo.beginTransaction();
    }

    public final void OooO0o() {
        this.OooO0Oo.beginTransactionNonExclusive();
    }

    public final j30 OooO0oo(String str) throws SQLException {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.OooO0Oo.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new j30(sQLiteStatementCompileStatement);
    }

    public final void OooOOO(String str) throws SQLException {
        this.OooO0Oo.execSQL(str);
    }

    public final void OooOOOO(Object[] objArr) throws SQLException {
        this.OooO0Oo.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean OooOOo() {
        return this.OooO0Oo.inTransaction();
    }

    public final Cursor OooOOoo(ok1 ok1Var) {
        final z20 z20Var = new z20(ok1Var);
        Cursor cursorRawQueryWithFactory = this.OooO0Oo.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: com.cmaster.cloner.a30
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                ok1 ok1Var2 = z20Var.OooO0Oo;
                sQLiteQuery.getClass();
                ok1Var2.OooO(new i30(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, ok1Var.OooOOOO(), OooO0o0, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    public final void OooOo00() {
        this.OooO0Oo.setTransactionSuccessful();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.OooO0Oo.close();
    }
}
