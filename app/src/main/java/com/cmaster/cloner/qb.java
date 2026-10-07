package com.cmaster.cloner;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class qb {
    public final int OooO00o;

    public static void OooO00o(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z ? i : length);
            boolean z2 = cCharAt < ' ' || cCharAt == ' ';
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public abstract void OooO(c30 c30Var, int i, int i2);

    public abstract int OooO0O0();

    public abstract int OooO0OO();

    public abstract int OooO0Oo();

    public abstract int OooO0o();

    public abstract int OooO0o0();

    public void OooO0oO(c30 c30Var) {
    }

    public abstract void OooO0oo(c30 c30Var);

    public abstract void OooOO0(c30 c30Var);

    public abstract void OooOO0O(c30 c30Var, int i, int i2);
}
