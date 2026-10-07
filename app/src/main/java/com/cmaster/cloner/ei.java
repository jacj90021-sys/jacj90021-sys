package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ei {
    public static final SparseIntArray OooOOO;
    public float OooO;
    public float OooO00o;
    public float OooO0O0;
    public float OooO0OO;
    public float OooO0Oo;
    public float OooO0o;
    public float OooO0o0;
    public float OooO0oO;
    public int OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public boolean OooOO0o;
    public float OooOOO0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        OooOOO = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e61.OooO);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (OooOOO.get(index)) {
                case 1:
                    this.OooO00o = typedArrayObtainStyledAttributes.getFloat(index, this.OooO00o);
                    break;
                case 2:
                    this.OooO0O0 = typedArrayObtainStyledAttributes.getFloat(index, this.OooO0O0);
                    break;
                case 3:
                    this.OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, this.OooO0OO);
                    break;
                case 4:
                    this.OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.OooO0Oo);
                    break;
                case 5:
                    this.OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.OooO0o0);
                    break;
                case 6:
                    this.OooO0o = typedArrayObtainStyledAttributes.getDimension(index, this.OooO0o);
                    break;
                case 7:
                    this.OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, this.OooO0oO);
                    break;
                case 8:
                    this.OooO = typedArrayObtainStyledAttributes.getDimension(index, this.OooO);
                    break;
                case 9:
                    this.OooOO0 = typedArrayObtainStyledAttributes.getDimension(index, this.OooOO0);
                    break;
                case 10:
                    this.OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, this.OooOO0O);
                    break;
                case 11:
                    this.OooOO0o = true;
                    this.OooOOO0 = typedArrayObtainStyledAttributes.getDimension(index, this.OooOOO0);
                    break;
                case 12:
                    this.OooO0oo = fi.OooO0o0(typedArrayObtainStyledAttributes, index, this.OooO0oo);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
