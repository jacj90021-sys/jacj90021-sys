package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class mq2 {
    public static ColorStateList OooO00o(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !o0000O0O.OooOo00(drawable)) {
            return null;
        }
        return o0000O0O.OooO0oo(drawable).getColorStateList();
    }

    public static void OooO0O0(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            bt.OooO00o(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                at.OooO00o(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            at.OooO00o(outline, path);
        }
    }
}
