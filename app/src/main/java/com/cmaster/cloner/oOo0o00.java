package com.cmaster.cloner;

import android.app.LocaleManager;
import android.os.LocaleList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class oOo0o00 {
    public static LocaleList OooO00o(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void OooO0O0(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
