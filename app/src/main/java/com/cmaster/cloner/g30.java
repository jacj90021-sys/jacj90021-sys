package com.cmaster.cloner;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g30 extends SQLiteOpenHelper {
    public static final /* synthetic */ int OooOO0 = 0;
    public boolean OooO;
    public final Context OooO0Oo;
    public final qb OooO0o;
    public final ay1 OooO0o0;
    public boolean OooO0oO;
    public final a51 OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g30(Context context, String str, final ay1 ay1Var, final qb qbVar) {
        String string;
        super(context, str, null, qbVar.OooO00o, new DatabaseErrorHandler() { // from class: com.cmaster.cloner.d30
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = g30.OooOO0;
                sQLiteDatabase.getClass();
                ay1 ay1Var2 = ay1Var;
                c30 c30Var = (c30) ay1Var2.OooO0o0;
                if (c30Var == null || !c30Var.OooO0Oo.equals(sQLiteDatabase)) {
                    c30Var = new c30(sQLiteDatabase);
                    ay1Var2.OooO0o0 = c30Var;
                }
                SQLiteDatabase sQLiteDatabase2 = c30Var.OooO0Oo;
                qbVar.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + c30Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        qb.OooO00o(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                qb.OooO00o((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                qb.OooO00o(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    c30Var.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        context.getClass();
        qbVar.getClass();
        this.OooO0Oo = context;
        this.OooO0o0 = ay1Var;
        this.OooO0o = qbVar;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.OooO0oo = new a51(context.getCacheDir(), string, false);
    }

    public final c30 OooO0OO(boolean z) throws IOException {
        a51 a51Var = this.OooO0oo;
        try {
            a51Var.OooO00o((this.OooO || getDatabaseName() == null) ? false : true);
            this.OooO0oO = false;
            SQLiteDatabase sQLiteDatabaseOooO0oo = OooO0oo(z);
            if (!this.OooO0oO) {
                c30 c30VarOooO0o = OooO0o(sQLiteDatabaseOooO0oo);
                a51Var.OooO0O0();
                return c30VarOooO0o;
            }
            close();
            c30 c30VarOooO0OO = OooO0OO(z);
            a51Var.OooO0O0();
            return c30VarOooO0OO;
        } catch (Throwable th) {
            a51Var.OooO0O0();
            throw th;
        }
    }

    public final c30 OooO0o(SQLiteDatabase sQLiteDatabase) {
        ay1 ay1Var = this.OooO0o0;
        ay1Var.getClass();
        c30 c30Var = (c30) ay1Var.OooO0o0;
        if (c30Var != null && c30Var.OooO0Oo.equals(sQLiteDatabase)) {
            return c30Var;
        }
        c30 c30Var2 = new c30(sQLiteDatabase);
        ay1Var.OooO0o0 = c30Var2;
        return c30Var2;
    }

    public final SQLiteDatabase OooO0oo(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.OooO;
        if (databaseName != null && !z2 && (parentFile = this.OooO0Oo.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            readableDatabase2.getClass();
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase = getWritableDatabase();
                    readableDatabase.getClass();
                } else {
                    readableDatabase = getReadableDatabase();
                    readableDatabase.getClass();
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof e30) {
                    e30 e30Var = (e30) th;
                    int iOrdinal = e30Var.OooO0Oo.ordinal();
                    th = e30Var.OooO0o0;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        throw new tf();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        a51 a51Var = this.OooO0oo;
        try {
            a51Var.OooO00o(a51Var.OooO00o);
            super.close();
            this.OooO0o0.OooO0o0 = null;
            this.OooO = false;
        } finally {
            a51Var.OooO0O0();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.OooO0oO;
        qb qbVar = this.OooO0o;
        if (!z && qbVar.OooO00o != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            qbVar.OooO0oO(OooO0o(sQLiteDatabase));
        } catch (Throwable th) {
            throw new e30(f30.OooO0Oo, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.OooO0o.OooO0oo(OooO0o(sQLiteDatabase));
        } catch (Throwable th) {
            throw new e30(f30.OooO0o0, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.OooO0oO = true;
        try {
            this.OooO0o.OooO(OooO0o(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new e30(f30.OooO0oO, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.OooO0oO) {
            try {
                this.OooO0o.OooOO0(OooO0o(sQLiteDatabase));
            } catch (Throwable th) {
                throw new e30(f30.OooO0oo, th);
            }
        }
        this.OooO = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.OooO0oO = true;
        try {
            this.OooO0o.OooOO0O(OooO0o(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new e30(f30.OooO0o, th);
        }
    }
}
