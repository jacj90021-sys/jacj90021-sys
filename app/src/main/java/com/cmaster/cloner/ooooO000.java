package com.cmaster.cloner;

import android.os.Build;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ooooO000 {
    public static final HashSet OooO0OO = new HashSet();
    public final String OooO00o;
    public final String OooO0O0;

    public ooooO000(String str, String str2) {
        this.OooO00o = str;
        this.OooO0O0 = str2;
        OooO0OO.add(this);
    }

    public abstract boolean OooO00o();

    public boolean OooO0O0() {
        HashSet hashSet = oOO00O0.OooO00o;
        String str = this.OooO0O0;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
