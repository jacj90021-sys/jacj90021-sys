package com.cmaster.cloner;

import android.view.View;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class s53 {
    public static boolean OooO00o = true;
    public static Field OooO0O0;
    public static boolean OooO0OO;

    public float OooO00o(View view) {
        if (OooO00o) {
            try {
                return ou1.OooO00o(view);
            } catch (NoSuchMethodError unused) {
                OooO00o = false;
            }
        }
        return view.getAlpha();
    }

    public void OooO0O0(View view, float f) {
        if (OooO00o) {
            try {
                ou1.OooO0O0(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                OooO00o = false;
            }
        }
        view.setAlpha(f);
    }
}
