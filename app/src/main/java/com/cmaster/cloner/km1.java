package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class km1 {
    public final ColorStateList OooO;
    public final ColorStateList OooO00o;
    public final String OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final float OooO0o;
    public final float OooO0o0;
    public final float OooO0oO;
    public final float OooO0oo;
    public final float OooOO0;
    public final int OooOO0O;
    public Typeface OooOOO;
    public boolean OooOO0o = false;
    public boolean OooOOO0 = false;

    public km1(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, l61.OooOo);
        this.OooOO0 = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.OooO = wv2.OooO00o(context, typedArrayObtainStyledAttributes, 3);
        wv2.OooO00o(context, typedArrayObtainStyledAttributes, 4);
        wv2.OooO00o(context, typedArrayObtainStyledAttributes, 5);
        this.OooO0OO = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.OooO0Oo = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.OooOO0O = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.OooO0O0 = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.OooO00o = wv2.OooO00o(context, typedArrayObtainStyledAttributes, 6);
        this.OooO0o0 = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.OooO0o = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.OooO0oO = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, k61.OooOOo0);
        typedArrayObtainStyledAttributes2.hasValue(0);
        this.OooO0oo = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void OooO00o() {
        String str;
        Typeface typeface = this.OooOOO;
        int i = this.OooO0OO;
        if (typeface == null && (str = this.OooO0O0) != null) {
            this.OooOOO = Typeface.create(str, i);
        }
        if (this.OooOOO == null) {
            int i2 = this.OooO0Oo;
            if (i2 == 1) {
                this.OooOOO = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.OooOOO = Typeface.SERIF;
            } else if (i2 != 3) {
                this.OooOOO = Typeface.DEFAULT;
            } else {
                this.OooOOO = Typeface.MONOSPACE;
            }
            this.OooOOO = Typeface.create(this.OooOOO, i);
        }
    }
}
