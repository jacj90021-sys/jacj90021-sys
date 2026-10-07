package com.cmaster.cloner;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qc1 implements Closeable {
    public static final dw OooO0oo = new dw("proto");
    public final sd1 OooO0Oo;
    public final ie OooO0o;
    public final ie OooO0o0;
    public final y4 OooO0oO;

    public qc1(ie ieVar, ie ieVar2, y4 y4Var, sd1 sd1Var) {
        this.OooO0Oo = sd1Var;
        this.OooO0o0 = ieVar;
        this.OooO0o = ieVar2;
        this.OooO0oO = y4Var;
    }

    public static Long OooO0o(SQLiteDatabase sQLiteDatabase, g5 g5Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(g5Var.OooO00o, String.valueOf(v41.OooO00o(g5Var.OooO0OO))));
        byte[] bArr = g5Var.OooO0O0;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String OooOOO(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((d5) it.next()).OooO00o);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object OooOOOO(Cursor cursor, oc1 oc1Var) {
        try {
            return oc1Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final Object OooO(bl1 bl1Var) {
        SQLiteDatabase sQLiteDatabaseOooO0OO = OooO0OO();
        ie ieVar = this.OooO0o;
        long jOooO0oo = ieVar.OooO0oo();
        while (true) {
            try {
                sQLiteDatabaseOooO0OO.beginTransaction();
                try {
                    Object objOooOO0O = bl1Var.OooOO0O();
                    sQLiteDatabaseOooO0OO.setTransactionSuccessful();
                    return objOooOO0O;
                } finally {
                    sQLiteDatabaseOooO0OO.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (ieVar.OooO0oo() >= this.OooO0oO.OooO0OO + jOooO0oo) {
                    throw new al1("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final SQLiteDatabase OooO0OO() {
        sd1 sd1Var = this.OooO0Oo;
        sd1Var.getClass();
        ie ieVar = this.OooO0o;
        long jOooO0oo = ieVar.OooO0oo();
        while (true) {
            try {
                return sd1Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (ieVar.OooO0oo() >= this.OooO0oO.OooO0OO + jOooO0oo) {
                    throw new al1("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object OooO0oo(oc1 oc1Var) {
        SQLiteDatabase sQLiteDatabaseOooO0OO = OooO0OO();
        sQLiteDatabaseOooO0OO.beginTransaction();
        try {
            Object objApply = oc1Var.apply(sQLiteDatabaseOooO0OO);
            sQLiteDatabaseOooO0OO.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseOooO0OO.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.OooO0Oo.close();
    }
}
