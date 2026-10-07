package com.cmaster.cloner;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class wp2 {
    public static final int OooO00o(Cursor cursor, String str) {
        String string;
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    columnNames.getClass();
                    String strConcat = ".".concat(str);
                    String str2 = "." + str + '`';
                    int length = columnNames.length;
                    int i = 0;
                    int i2 = 0;
                    while (i2 < length) {
                        String str3 = columnNames[i2];
                        int i3 = i + 1;
                        if (str3.length() >= str.length() + 2 && (str3.endsWith(strConcat) || (str3.charAt(0) == '`' && str3.endsWith(str2)))) {
                            columnIndex = i;
                            break;
                        }
                        i2++;
                        i = i3;
                    }
                    columnIndex = -1;
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            columnNames2.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i4 = 0;
            for (String str4 : columnNames2) {
                i4++;
                if (i4 > 1) {
                    sb.append((CharSequence) ", ");
                }
                pj1.OooO00o(sb, str4, null);
            }
            sb.append((CharSequence) "");
            string = sb.toString();
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            string = "unknown";
        }
        ra.OooOOO(rj.OooO0o0("column '", str, "' does not exist. Available columns: ", string));
        return 0;
    }
}
