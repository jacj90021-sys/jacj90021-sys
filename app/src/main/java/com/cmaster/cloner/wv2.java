package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.TypedValue;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class wv2 {
    public static ColorStateList OooO00o(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListOooO0O0;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListOooO0O0 = ep2.OooO0O0(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListOooO0O0;
    }

    public static ColorStateList OooO0O0(Context context, a02 a02Var, int i) {
        int resourceId;
        ColorStateList colorStateListOooO0O0;
        TypedArray typedArray = (TypedArray) a02Var.OooO0o;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListOooO0O0 = ep2.OooO0O0(context, resourceId)) == null) ? a02Var.OooOOOo(i) : colorStateListOooO0O0;
    }

    public static int OooO0OO(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static boolean OooO0Oo(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
