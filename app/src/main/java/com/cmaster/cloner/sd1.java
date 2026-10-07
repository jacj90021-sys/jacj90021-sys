package com.cmaster.cloner;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sd1 extends SQLiteOpenHelper {
    public static final List OooO0o = Arrays.asList(rd1.OooO0O0, rd1.OooO0OO, rd1.OooO0Oo, rd1.OooO0o0);
    public final int OooO0Oo;
    public boolean OooO0o0;

    public sd1(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.OooO0o0 = false;
        this.OooO0Oo = i;
    }

    public static void OooO0OO(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        List list = OooO0o;
        if (i2 > list.size()) {
            StringBuilder sbOooO = rj.OooO(i, i2, "Migration from ", " to ", " was requested, but cannot be performed. Only ");
            sbOooO.append(list.size());
            sbOooO.append(" migrations are provided");
            throw new IllegalArgumentException(sbOooO.toString());
        }
        while (i < i2) {
            switch (((rd1) list.get(i)).OooO00o) {
                case 0:
                    sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                    sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                    break;
                case 1:
                    sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                    sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                    break;
                case 2:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                    break;
                default:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                    sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                    break;
            }
            i++;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.OooO0o0 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (!this.OooO0o0) {
            onConfigure(sQLiteDatabase);
        }
        OooO0OO(sQLiteDatabase, 0, this.OooO0Oo);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        if (!this.OooO0o0) {
            onConfigure(sQLiteDatabase);
        }
        OooO0OO(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.OooO0o0) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        if (!this.OooO0o0) {
            onConfigure(sQLiteDatabase);
        }
        OooO0OO(sQLiteDatabase, i, i2);
    }
}
