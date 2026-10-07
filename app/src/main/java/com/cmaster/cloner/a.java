package com.cmaster.cloner;

import android.os.PowerManager;
import java.util.Locale;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class a {
    public static boolean OooO00o(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String OooO0O0(Locale locale) {
        return locale.toLanguageTag();
    }
}
