package com.cmaster.cloner;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gt0 extends hn0 implements us0 {
    public static final Method Oooo00O;
    public xb1 Oooo000;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Oooo00O = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // com.cmaster.cloner.us0
    public final void OooOO0O(ss0 ss0Var, MenuItem menuItem) {
        xb1 xb1Var = this.Oooo000;
        if (xb1Var != null) {
            xb1Var.OooOO0O(ss0Var, menuItem);
        }
    }

    @Override // com.cmaster.cloner.hn0
    public final ot OooOOOo(Context context, boolean z) {
        ft0 ft0Var = new ft0(context, z);
        ft0Var.setHoverListener(this);
        return ft0Var;
    }

    @Override // com.cmaster.cloner.us0
    public final void OooOo0(ss0 ss0Var, vs0 vs0Var) {
        xb1 xb1Var = this.Oooo000;
        if (xb1Var != null) {
            xb1Var.OooOo0(ss0Var, vs0Var);
        }
    }
}
