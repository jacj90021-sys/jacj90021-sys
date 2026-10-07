package com.cmaster.cloner;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fj1 extends SQLiteOpenHelper {
    public final /* synthetic */ int OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj1(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2) {
        super(context, str, cursorFactory, i);
        this.OooO0Oo = i2;
    }

    private final void OooO0OO(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void OooO0o(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        switch (this.OooO0Oo) {
            case 0:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS items ( _module TEXT NOT NULL, _key TEXT NOT NULL, _value BLOB, _type TEXT,  PRIMARY KEY(_module, _key));");
                break;
            default:
                sQLiteDatabase.execSQL(u7.OooO00o(new byte[]{82, 1, 16, -67, 70, 115, 97, 41, 80, 17, 25, -71, 50, 127, 7, 93, 95, 28, 1, -36, 87, 110, 8, 46, 69, 0, 117, -107, 102, 83, 44, 14, 49, 123, 117, -93, 127, 89, 37, 8, 125, 54, 117, -88, 87, 110, 21, 93, 95, 28, 1, -36, 92, 99, 13, 49, 61, 115, 10, -105, 119, 79, 97, 41, 84, 11, 1, -36, 92, 121, 21, 93, 95, 6, 25, -80, 62, 22, 30, 11, 112, 63, 32, -103, 50, 116, 13, 50, 83, 127, 117, -93, 102, 79, 49, 24, 49, 7, 16, -92, 70, 26, 97, 93, 65, 1, 28, -79, 83, 100, 24, 93, 90, 22, 12, -44, 77, 91, 46, 25, 100, 63, 48, -48, 50, 105, 42, 24, 104, 122, 124, -57}, new byte[]{17, 83, 85, -4, 18, 54, 65, 125}));
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.OooO0Oo;
    }
}
