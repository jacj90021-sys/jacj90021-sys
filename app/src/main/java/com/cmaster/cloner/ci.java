package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ci {
    public static final SparseIntArray OooOO0;
    public int OooO;
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public float OooO0Oo;
    public float OooO0o;
    public float OooO0o0;
    public int OooO0oO;
    public String OooO0oo;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        OooOO0 = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e61.OooO0o);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (OooOO0.get(index)) {
                case 1:
                    this.OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.OooO0o0);
                    break;
                case 2:
                    this.OooO0OO = typedArrayObtainStyledAttributes.getInt(index, this.OooO0OO);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = em1.OooO00o[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.OooO00o = fi.OooO0o0(typedArrayObtainStyledAttributes, index, this.OooO00o);
                    break;
                case 6:
                    this.OooO0O0 = typedArrayObtainStyledAttributes.getInteger(index, this.OooO0O0);
                    break;
                case 7:
                    this.OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.OooO0Oo);
                    break;
                case 8:
                    this.OooO0oO = typedArrayObtainStyledAttributes.getInteger(index, this.OooO0oO);
                    break;
                case 9:
                    this.OooO0o = typedArrayObtainStyledAttributes.getFloat(index, this.OooO0o);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.OooO = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.OooO0oo = string;
                        if (string.indexOf("/") > 0) {
                            this.OooO = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.OooO);
                        break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
