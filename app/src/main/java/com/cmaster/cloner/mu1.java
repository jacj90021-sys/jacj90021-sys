package com.cmaster.cloner;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class mu1 {
    public static final su1 OooO00o;
    public static final hc OooO0O0;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            OooO00o = new tu1();
        } else {
            OooO00o = new su1();
        }
        OooO0O0 = new hc(Float.class, "translationAlpha", 11);
        new hc(Rect.class, "clipBounds", 12);
    }

    public static void OooO00o(View view, int i, int i2, int i3, int i4) {
        OooO00o.OooO0OO(view, i, i2, i3, i4);
    }

    public static void OooO0O0(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        OooO00o.OooO0Oo(view, i);
    }
}
