package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class t82 {
    public static final int[] OooO00o = {R.attr.colorPrimary};
    public static final int[] OooO0O0 = {R.attr.colorPrimaryVariant};

    public static void OooO00o(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k61.OooOoO0, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                OooO0OO(context, OooO0O0, "Theme.MaterialComponents");
            }
        }
        OooO0OO(context, OooO00o, "Theme.AppCompat");
    }

    public static void OooO0O0(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k61.OooOoO0, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        ra.OooOOO("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void OooO0OO(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                ra.OooOOO(px0.OooOOOO("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static TypedArray OooO0Oo(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        OooO00o(context, attributeSet, i, i2);
        OooO0O0(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
