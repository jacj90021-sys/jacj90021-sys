package com.cmaster.cloner;

import android.content.Context;
import android.util.TypedValue;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class sv2 {
    public static TypedValue OooO00o(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean OooO0O0(Context context, int i, boolean z) {
        TypedValue typedValueOooO00o = OooO00o(context, i);
        return (typedValueOooO00o == null || typedValueOooO00o.type != 18) ? z : typedValueOooO00o.data != 0;
    }
}
