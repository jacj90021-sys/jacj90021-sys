package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fy1 extends ooooO000 {
    public final Pattern OooO0Oo;

    public fy1() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.OooO0Oo = Pattern.compile("\\A\\d+");
    }

    @Override // com.cmaster.cloner.ooooO000
    public final boolean OooO00o() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // com.cmaster.cloner.ooooO000
    public final boolean OooO0O0() {
        int i;
        PackageInfo packageInfoOooO00o;
        boolean zOooO0O0 = super.OooO0O0();
        if (!zOooO0O0 || (i = Build.VERSION.SDK_INT) >= 29) {
            return zOooO0O0;
        }
        int i2 = ey1.OooO00o;
        if (i >= 26) {
            packageInfoOooO00o = oOO0O000.OooO00o();
        } else {
            try {
                packageInfoOooO00o = ey1.OooO00o();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoOooO00o = null;
            }
        }
        if (packageInfoOooO00o == null) {
            return false;
        }
        Matcher matcher = this.OooO0Oo.matcher(packageInfoOooO00o.versionName);
        return matcher.find() && Integer.parseInt(packageInfoOooO00o.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
