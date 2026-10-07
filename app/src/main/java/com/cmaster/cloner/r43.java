package com.cmaster.cloner;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class r43 {
    public static void OooO00o(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            vn1.OooO00o(view, charSequence);
            return;
        }
        xn1 xn1Var = xn1.OooOOO;
        if (xn1Var != null && xn1Var.OooO0Oo == view) {
            xn1.OooO0O0(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new xn1(view, charSequence);
            return;
        }
        xn1 xn1Var2 = xn1.OooOOOO;
        if (xn1Var2 != null && xn1Var2.OooO0Oo == view) {
            xn1Var2.OooO00o();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
