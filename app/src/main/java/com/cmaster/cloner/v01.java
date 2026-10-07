package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class v01 {
    public static final String OooO00o = ep0.OooO("PackageManagerHelper");

    public static void OooO00o(Context context, Class cls, boolean z) {
        String str = OooO00o;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            ep0.OooO0oO().OooO0Oo(str, cls.getName() + " " + (z ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e) {
            ep0.OooO0oO().OooO0Oo(str, rj.OooO0Oo(cls.getName(), " could not be ", z ? "enabled" : "disabled"), e);
        }
    }
}
