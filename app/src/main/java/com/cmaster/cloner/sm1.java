package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class sm1 {
    public static final ThreadLocal OooO00o = new ThreadLocal();
    public static final int[] OooO0O0 = {-16842910};
    public static final int[] OooO0OO = {android.R.attr.state_focused};
    public static final int[] OooO0Oo = {android.R.attr.state_pressed};
    public static final int[] OooO0o0 = {android.R.attr.state_checked};
    public static final int[] OooO0o = new int[0];
    public static final int[] OooO0oO = new int[1];

    public static void OooO00o(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(l61.OooOO0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int OooO0O0(Context context, int i) {
        ColorStateList colorStateListOooO0Oo = OooO0Oo(context, i);
        if (colorStateListOooO0Oo != null && colorStateListOooO0Oo.isStateful()) {
            return colorStateListOooO0Oo.getColorForState(OooO0O0, colorStateListOooO0Oo.getDefaultColor());
        }
        ThreadLocal threadLocal = OooO00o;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return ye.OooO0Oo(OooO0OO(context, i), Math.round(Color.alpha(r4) * f));
    }

    public static int OooO0OO(Context context, int i) {
        int[] iArr = OooO0oO;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList OooO0Oo(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = OooO0oO;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = ep2.OooO0O0(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
