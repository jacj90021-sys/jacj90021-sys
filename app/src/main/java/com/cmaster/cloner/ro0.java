package com.cmaster.cloner;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ro0 {
    public static final ro0 OooO0O0 = new ro0(new so0(new LocaleList(new Locale[0])));
    public final so0 OooO00o;

    public ro0(so0 so0Var) {
        this.OooO00o = so0Var;
    }

    public static ro0 OooO00o(String str) {
        if (str == null || str.isEmpty()) {
            return OooO0O0;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = qo0.OooO00o;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new ro0(new so0(new LocaleList(localeArr)));
    }

    public final int OooO0O0() {
        return this.OooO00o.OooO00o.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ro0) {
            return this.OooO00o.equals(((ro0) obj).OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO00o.OooO00o.hashCode();
    }

    public final String toString() {
        return this.OooO00o.OooO00o.toString();
    }
}
