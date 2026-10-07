package com.cmaster.cloner;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class dq1 {
    public static final String OooO;
    public static final String OooO0o;
    public static final String OooO0oO;
    public static final String OooO0oo;
    public static final String OooOO0;
    public static final String OooOO0O;
    public final fj1 OooO0Oo;
    public boolean OooO0o0 = false;

    static {
        u7.OooO00o(new byte[]{72}, new byte[]{4, 72, 99, -115, -104, -26, -32, 96});
        u7.OooO00o(new byte[]{76}, new byte[]{6, 71, 49, 126, -27, -53, 6, -40});
        u7.OooO00o(new byte[]{7}, new byte[]{73, -126, 27, -47, 122, 15, -124, -123});
        u7.OooO00o(new byte[]{-63}, new byte[]{-110, -91, 39, 119, -25, -81, -47, 98});
        OooO0o = u7.OooO00o(new byte[]{-91}, new byte[]{-122, 26, -118, -48, -119, 33, -37, 71});
        OooO0oO = u7.OooO00o(new byte[]{8, -117, 127, -120, -95}, new byte[]{97, -1, 26, -27, -46, 9, 9, 70});
        OooO0oo = u7.OooO00o(new byte[]{49, -49, -80, -90, -103, 114, -110}, new byte[]{110, -94, -33, -62, -20, 30, -9, 100});
        OooO = u7.OooO00o(new byte[]{-29, -44, -50, 102}, new byte[]{-68, -65, -85, 31, 52, 75, -124, -55});
        u7.OooO00o(new byte[]{-6, -30, -91, -51, 124}, new byte[]{-91, -106, -36, -67, 25, 65, 85, -109});
        OooOO0 = u7.OooO00o(new byte[]{-9, -84, 126, 91, 44, -78}, new byte[]{-88, -38, 31, 55, 89, -41, 6, -110});
        u7.OooO00o(new byte[]{-32, -2, -22, 9, 39, 100, -91, 41, -30, -18, -29, 13, 83, 104, -61, 93, -19, -29, -5, 104, 54, 121, -52, 46, -9, -1, -113, 33, 7, 68, -24, 14, -125, -124, -113, 23, 30, 78, -31, 8, -49, -55, -113, 28, 54, 121, -47, 93, -19, -29, -5, 104, 61, 116, -55, 49, -113, -116, -16, 35, 22, 88, -91, 41, -26, -12, -5, 104, 61, 110, -47, 93, -19, -7, -29, 4, 95, 1, -38, 11, -62, -64, -38, 45, 83, 99, -55, 50, -31, -128, -113, 23, 7, 88, -11, 24, -125, -8, -22, 16, 39, 13, -91, 93, -13, -2, -26, 5, 50, 115, -36, 93, -24, -23, -10, 96, 44, 76, -22, 25, -42, -64, -54, 100, 83, 126, -18, 24, -38, -123, -122, 115}, new byte[]{-93, -84, -81, 72, 115, 33, -123, 125});
        u7.OooO00o(new byte[]{41, 7, 14, -124, -73, -6, -22, -6, 33, 16, 97, -99, -47, -114, -18, -32, 36, 6, 21, -121, -73, -57, -33, -35, 0, 38, 122}, new byte[]{109, 85, 65, -44, -105, -82, -85, -72});
        OooOO0O = u7.OooO00o(new byte[]{45, -28, -73, -32, 61, 88, 73, -68, 126, -25, -87, -22, 51, 12, 0, -30, 59, -20, -88, -91}, new byte[]{94, -127, -37, -123, 94, 44, 105, -106});
    }

    public dq1(File file) {
        fj1 fj1Var = new fj1(e92.OooO00o, file.getAbsolutePath(), null, 1, 1);
        fj1Var.setWriteAheadLoggingEnabled(true);
        this.OooO0Oo = fj1Var;
    }

    public void OooO0O0() {
        if (this.OooO0o0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(OooOO0O);
        try {
            Cursor cursorRawQuery = this.OooO0Oo.getWritableDatabase().rawQuery(rj.OooO0oo(new byte[]{52}, new byte[]{15, 62, 13, 4, -31, 58, -6, -114}, sb), new String[0]);
            try {
                cursorRawQuery.moveToFirst();
                while (!cursorRawQuery.isAfterLast()) {
                    int columnIndex = cursorRawQuery.getColumnIndex(OooO0oo);
                    if (columnIndex != -1) {
                        String string = cursorRawQuery.getString(columnIndex);
                        int columnIndex2 = cursorRawQuery.getColumnIndex(OooO);
                        if (columnIndex2 != -1) {
                            String string2 = cursorRawQuery.getString(columnIndex2);
                            int columnIndex3 = cursorRawQuery.getColumnIndex(OooOO0);
                            if (columnIndex3 != -1) {
                                try {
                                    OooO0Oo(string, cursorRawQuery.getBlob(columnIndex3), string2);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                    cursorRawQuery.moveToNext();
                }
                cursorRawQuery.close();
            } finally {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        OooO0OO();
        this.OooO0o0 = true;
    }

    public void OooO0OO() {
    }

    public abstract void OooO0Oo(String str, byte[] bArr, String str2);

    public final void OooO0o(String str, byte[] bArr, String str2) {
        String str3 = OooO0o;
        if (str == null) {
            str = str3;
        }
        if (str2 == null) {
            str2 = str3;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(OooO0oo, str);
        contentValues.put(OooO, str2);
        contentValues.put(OooOO0, bArr);
        SQLiteDatabase writableDatabase = this.OooO0Oo.getWritableDatabase();
        writableDatabase.beginTransaction();
        if (writableDatabase.insertWithOnConflict(OooO0oO, null, contentValues, 5) != -1) {
            writableDatabase.setTransactionSuccessful();
        }
        writableDatabase.endTransaction();
    }

    public final void OooO0o0(String str, String str2) {
        SQLiteDatabase writableDatabase = this.OooO0Oo.getWritableDatabase();
        writableDatabase.beginTransaction();
        writableDatabase.delete(OooO0oO, u7.OooO00o(new byte[]{-9, -1, -74, -1, -96, -44, 115, 89, -9, -99, -5, -81, -28, -64, 113, 88, -9, -1, -80, -11, -67, -127, 34, 28, -24}, new byte[]{-41, -96, -37, -112, -60, -95, 31, 60}), new String[]{str, str2});
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
    }
}
