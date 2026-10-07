package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class s62 {
    public static final int[] OooO00o = {android.R.attr.theme, R.attr.theme};
    public static final int[] OooO0O0 = {R.attr.materialThemeOverlay};

    public static Context OooO00o(Context context, AttributeSet attributeSet, int i, int i2) {
        return OooO0O0(context, attributeSet, i, i2, new int[0]);
    }

    public static Context OooO0O0(Context context, AttributeSet attributeSet, int i, int i2, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0O0, i, i2);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i3 = iArr2[0];
        boolean z = (context instanceof ej) && ((ej) context).OooO00o == i3;
        if (i3 == 0 || z) {
            return context;
        }
        ej ejVar = new ej(context, i3);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i4 = 0; i4 < iArr.length; i4++) {
                iArr3[i4] = typedArrayObtainStyledAttributes2.getResourceId(i4, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr3[i5];
            if (i6 != 0) {
                ejVar.getTheme().applyStyle(i6, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, OooO00o);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            ejVar.getTheme().applyStyle(resourceId, true);
        }
        return ejVar;
    }
}
