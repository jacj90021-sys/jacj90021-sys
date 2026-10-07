package com.cmaster.cloner;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class l9 {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            o000O000.OooO0O0(30);
        }
        if (i >= 30) {
            o000O000.OooO0O0(31);
        }
        if (i >= 30) {
            o000O000.OooO0O0(33);
        }
        if (i >= 30) {
            o000O000.OooO0O0(1000000);
        }
    }

    public static final boolean OooO00o() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i >= 30) {
            String str = Build.VERSION.CODENAME;
            str.getClass();
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                String upperCase = str.toUpperCase(locale);
                upperCase.getClass();
                Integer num = upperCase.equals("BAKLAVA") ? num : null;
                String upperCase2 = "S".toUpperCase(locale);
                upperCase2.getClass();
                num = upperCase2.equals("BAKLAVA") ? 0 : null;
                if (num == null || num == null) {
                    if (num == null && num == null) {
                        String upperCase3 = str.toUpperCase(locale);
                        upperCase3.getClass();
                        String upperCase4 = "S".toUpperCase(locale);
                        upperCase4.getClass();
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    } else if (num != null) {
                        return true;
                    }
                } else if (num.intValue() >= num.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
