package com.cmaster.cloner;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class p53 {
    public static boolean OooO00o = true;

    public static void OooO00o(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            ut1.OooO0O0(viewGroup, z);
        } else if (OooO00o) {
            try {
                ut1.OooO0O0(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                OooO00o = false;
            }
        }
    }
}
