package com.cmaster.cloner;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class b {
    public static void OooO00o(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static ro0 OooO0O0(Configuration configuration) {
        return ro0.OooO00o(configuration.getLocales().toLanguageTags());
    }

    public static void OooO0OO(ro0 ro0Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(ro0Var.OooO00o.OooO00o.toLanguageTags()));
    }

    public static void OooO0Oo(Configuration configuration, ro0 ro0Var) {
        configuration.setLocales(LocaleList.forLanguageTags(ro0Var.OooO00o.OooO00o.toLanguageTags()));
    }
}
