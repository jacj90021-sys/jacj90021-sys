package com.cmaster.cloner;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ct {
    public static final int[] OooO00o = {android.R.attr.state_checked};
    public static final int[] OooO0O0 = new int[0];
    public static final Rect OooO0OO = new Rect();

    public static void OooO00o(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(OooO00o);
        } else {
            drawable.setState(OooO0O0);
        }
        drawable.setState(state);
    }

    public static Rect OooO0O0(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsOooO00o = zs.OooO00o(drawable);
            return new Rect(insetsOooO00o.left, insetsOooO00o.top, insetsOooO00o.right, insetsOooO00o.bottom);
        }
        if (i >= 29) {
            boolean z = ys.OooO00o;
        } else if (ys.OooO00o) {
            try {
                Object objInvoke = ys.OooO0O0.invoke(drawable, null);
                if (objInvoke != null) {
                    return new Rect(ys.OooO0OO.getInt(objInvoke), ys.OooO0Oo.getInt(objInvoke), ys.OooO0o0.getInt(objInvoke), ys.OooO0o.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return OooO0OO;
    }

    public static PorterDuff.Mode OooO0OO(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
