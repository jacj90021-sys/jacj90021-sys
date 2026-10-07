package com.cmaster.cloner;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class p03 {
    public static n03 OooO00o;

    public static final int OooO00o(rc1 rc1Var, String str) {
        rc1Var.getClass();
        int columnCount = rc1Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(rc1Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String str2 = "`" + str + '`';
        int columnCount2 = rc1Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (str2.equals(rc1Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = rc1Var.getColumnCount();
            String strConcat = ".".concat(str);
            String str3 = "." + str + '`';
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = rc1Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (columnName.endsWith(strConcat) || (columnName.charAt(0) == '`' && columnName.endsWith(str3)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static final int OooO0O0(rc1 rc1Var, String str) {
        rc1Var.getClass();
        int iOooO00o = OooO00o(rc1Var, str);
        if (iOooO00o >= 0) {
            return iOooO00o;
        }
        int columnCount = rc1Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(rc1Var.getColumnName(i));
        }
        ra.OooO("Column '", str, "' does not exist. Available columns: [", se.OooO0o0(arrayList, null, null, null, null, 63), 93);
        return 0;
    }
}
