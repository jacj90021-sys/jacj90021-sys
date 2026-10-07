package com.cmaster.cloner;

import android.os.LocaleList;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class p0 {
    public static LocaleList OooO00o(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void OooO0O0(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
