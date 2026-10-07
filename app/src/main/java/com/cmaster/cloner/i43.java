package com.cmaster.cloner;

import java.util.Collection;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class i43 {
    public static final boolean OooO00o(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return ij0.OooO00o(uj1.OooO(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final String OooO0O0(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? pj1.OooO0O0(se.OooO0o0(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }
}
