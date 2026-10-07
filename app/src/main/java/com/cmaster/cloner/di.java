package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class di {
    public int OooO00o;
    public int OooO0O0;
    public float OooO0OO;
    public float OooO0Oo;

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e61.OooO0oO);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, this.OooO0OO);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.OooO00o);
                this.OooO00o = i2;
                this.OooO00o = fi.OooO0Oo[i2];
            } else if (index == 4) {
                this.OooO0O0 = typedArrayObtainStyledAttributes.getInt(index, this.OooO0O0);
            } else if (index == 3) {
                this.OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.OooO0Oo);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
