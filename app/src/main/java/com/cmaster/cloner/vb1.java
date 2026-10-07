package com.cmaster.cloner;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vb1 extends qb {
    public on OooO0O0;
    public final List OooO0OO;
    public final nz0 OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb1(on onVar, nz0 nz0Var) {
        super(12);
        onVar.getClass();
        this.OooO0OO = onVar.OooO0o0;
        this.OooO0O0 = onVar;
        this.OooO0Oo = nz0Var;
    }

    @Override // com.cmaster.cloner.qb
    public final void OooO(c30 c30Var, int i, int i2) throws Exception {
        OooOO0O(c30Var, i, i2);
    }

    @Override // com.cmaster.cloner.qb
    public final void OooO0oO(c30 c30Var) {
    }

    @Override // com.cmaster.cloner.qb
    public final void OooO0oo(c30 c30Var) throws IllegalAccessException, IOException, SQLException, IllegalArgumentException, InvocationTargetException {
        Cursor cursorOooOOoo = c30Var.OooOOoo(new cv("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            boolean z = false;
            if (cursorOooOOoo.moveToFirst()) {
                if (cursorOooOOoo.getInt(0) == 0) {
                    z = true;
                }
            }
            cursorOooOOoo.close();
            nz0.OooOO0o(c30Var);
            if (!z) {
                ub1 ub1VarOooOOO = nz0.OooOOO(c30Var);
                if (!ub1VarOooOOO.OooO00o) {
                    sa.OooOOO(ub1VarOooOOO.OooO0O0, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            SQLiteDatabase sQLiteDatabase = c30Var.OooO0Oo;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            List list = this.OooO0OO;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((rb1) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                oo2.OooO00o(cursorOooOOoo, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // com.cmaster.cloner.qb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOO0(com.cmaster.cloner.c30 r6) throws java.lang.Exception {
        /*
            r5 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.OooO0Oo
            com.cmaster.cloner.cv r1 = new com.cmaster.cloner.cv
            java.lang.String r2 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            r1.<init>(r2)
            android.database.Cursor r1 = r6.OooOOoo(r1)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1c
            r3 = 0
            if (r2 == 0) goto L1f
            int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1f
            r2 = 1
            goto L20
        L1c:
            r5 = move-exception
            goto Lab
        L1f:
            r2 = r3
        L20:
            r1.close()
            r1 = 0
            if (r2 == 0) goto L63
            com.cmaster.cloner.cv r2 = new com.cmaster.cloner.cv
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r2.<init>(r4)
            android.database.Cursor r2 = r6.OooOOoo(r2)
            boolean r4 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L3e
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L3c:
            r5 = move-exception
            goto L5d
        L3e:
            r3 = r1
        L3f:
            r2.close()
            java.lang.String r2 = "c103703e120ae8cc73c9248622f3cd1e"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L75
            java.lang.String r2 = "49f946663a8deb7054212b8adda248c6"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L53
            goto L75
        L53:
            java.lang.String r5 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: c103703e120ae8cc73c9248622f3cd1e, found: "
            java.lang.String r5 = com.cmaster.cloner.rj.OooO0OO(r5, r3)
            com.cmaster.cloner.qa.OooO0o(r5)
            return
        L5d:
            throw r5     // Catch: java.lang.Throwable -> L5e
        L5e:
            r6 = move-exception
            com.cmaster.cloner.oo2.OooO00o(r2, r5)
            throw r6
        L63:
            com.cmaster.cloner.ub1 r2 = com.cmaster.cloner.nz0.OooOOO(r6)
            boolean r3 = r2.OooO00o
            if (r3 == 0) goto La3
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r0.execSQL(r2)
            java.lang.String r2 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')"
            r0.execSQL(r2)
        L75:
            com.cmaster.cloner.nz0 r2 = r5.OooO0Oo
            java.lang.Object r2 = r2.OooO0o0
            androidx.work.impl.WorkDatabase_Impl r2 = (androidx.work.impl.WorkDatabase_Impl) r2
            java.lang.String r3 = "PRAGMA foreign_keys = ON"
            r0.execSQL(r3)
            com.cmaster.cloner.hk1 r0 = new com.cmaster.cloner.hk1
            r0.<init>(r6)
            r2.OooOOOO(r0)
            java.util.List r0 = r5.OooO0OO
            if (r0 == 0) goto La0
            java.util.Iterator r0 = r0.iterator()
        L90:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La0
            java.lang.Object r2 = r0.next()
            com.cmaster.cloner.rb1 r2 = (com.cmaster.cloner.rb1) r2
            r2.OooO00o(r6)
            goto L90
        La0:
            r5.OooO0O0 = r1
            return
        La3:
            java.lang.String r5 = "Pre-packaged database has an invalid schema: "
            java.lang.String r6 = r2.OooO0O0
            com.cmaster.cloner.sa.OooOOO(r6, r5)
            return
        Lab:
            throw r5     // Catch: java.lang.Throwable -> Lac
        Lac:
            r6 = move-exception
            com.cmaster.cloner.oo2.OooO00o(r1, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.vb1.OooOO0(com.cmaster.cloner.c30):void");
    }

    @Override // com.cmaster.cloner.qb
    public final void OooOO0O(c30 c30Var, int i, int i2) throws Exception {
        SQLiteDatabase sQLiteDatabase = c30Var.OooO0Oo;
        on onVar = this.OooO0O0;
        if (onVar != null) {
            o00OO000 o00oo000 = onVar.OooO0Oo;
            o00oo000.getClass();
            List<xt0> listOooO00o = kw2.OooO00o(o00oo000, i, i2);
            if (listOooO00o != null) {
                aq2.OooO00o(new hk1(c30Var));
                for (xt0 xt0Var : listOooO00o) {
                    xt0Var.getClass();
                    xt0Var.OooO00o(c30Var);
                }
                ub1 ub1VarOooOOO = nz0.OooOOO(c30Var);
                if (!ub1VarOooOOO.OooO00o) {
                    sa.OooOOO(ub1VarOooOOO.OooO0O0, "Migration didn't properly handle: ");
                    return;
                } else {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
                    return;
                }
            }
        }
        on onVar2 = this.OooO0O0;
        if (onVar2 == null || kw2.OooO0O0(onVar2, i, i2)) {
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        if (onVar2.OooOOoo) {
            Cursor cursorOooOOoo = c30Var.OooOOoo(new cv("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                zm0 zm0Var = new zm0(10);
                while (cursorOooOOoo.moveToNext()) {
                    String string = cursorOooOOoo.getString(0);
                    string.getClass();
                    if (!string.startsWith("sqlite_") && !string.equals("android_metadata")) {
                        zm0Var.add(new k21(string, Boolean.valueOf(ij0.OooO00o(cursorOooOOoo.getString(1), "view"))));
                    }
                }
                zm0 zm0VarOooO00o = te.OooO00o(zm0Var);
                cursorOooOOoo.close();
                ListIterator listIterator = zm0VarOooO00o.listIterator(0);
                while (true) {
                    xm0 xm0Var = (xm0) listIterator;
                    if (!xm0Var.hasNext()) {
                        break;
                    }
                    k21 k21Var = (k21) xm0Var.next();
                    String str = (String) k21Var.OooO0Oo;
                    if (((Boolean) k21Var.OooO0o0).booleanValue()) {
                        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
        }
        List list = this.OooO0OO;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((rb1) it.next()).getClass();
            }
        }
        nz0.OooOO0o(c30Var);
    }
}
