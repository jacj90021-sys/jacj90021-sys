package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n {
    public static final PorterDuff.Mode OooO0O0 = PorterDuff.Mode.SRC_IN;
    public static n OooO0OO;
    public pa1 OooO00o;

    public static synchronized n OooO00o() {
        try {
            if (OooO0OO == null) {
                OooO0Oo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return OooO0OO;
    }

    public static synchronized PorterDuffColorFilter OooO0OO(int i, PorterDuff.Mode mode) {
        return pa1.OooO0o(i, mode);
    }

    public static synchronized void OooO0Oo() {
        if (OooO0OO == null) {
            n nVar = new n();
            OooO0OO = nVar;
            nVar.OooO00o = pa1.OooO0OO();
            pa1 pa1Var = OooO0OO.OooO00o;
            oO0Ooooo oo0ooooo = new oO0Ooooo();
            synchronized (pa1Var) {
                pa1Var.OooO0o0 = oo0ooooo;
            }
        }
    }

    public static void OooO0o0(Drawable drawable, in1 in1Var, int[] iArr) {
        PorterDuff.Mode mode = pa1.OooO0o;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = in1Var.OooO0Oo;
        if (!z && !in1Var.OooO0OO) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterOooO0o = null;
        ColorStateList colorStateList = z ? in1Var.OooO00o : null;
        PorterDuff.Mode mode2 = in1Var.OooO0OO ? in1Var.OooO0O0 : pa1.OooO0o;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterOooO0o = pa1.OooO0o(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterOooO0o);
    }

    public final synchronized Drawable OooO0O0(Context context, int i) {
        return this.OooO00o.OooO0Oo(context, i);
    }
}
