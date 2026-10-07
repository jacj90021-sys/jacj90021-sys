package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ti1 {
    public final int OooO00o;
    public final ag1 OooO0O0;
    public final int[][] OooO0OO;
    public final ag1[] OooO0Oo;

    public ti1(ho0 ho0Var) {
        this.OooO00o = ho0Var.OooO00o;
        this.OooO0O0 = (ag1) ho0Var.OooO0O0;
        this.OooO0OO = (int[][]) ho0Var.OooO0OO;
        this.OooO0Oo = (ag1[]) ho0Var.OooO0Oo;
    }

    public static void OooO00o(ho0 ho0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = k61.OooOOOO;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                ag1 ag1VarOooO00o = ag1.OooO00o(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new OooOO0(0.0f)).OooO00o();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i);
                int i4 = ho0Var.OooO00o;
                if (i4 == 0 || iArrTrimStateSet.length == 0) {
                    ho0Var.OooO0O0 = ag1VarOooO00o;
                }
                int[][] iArr3 = (int[][]) ho0Var.OooO0OO;
                if (i4 >= iArr3.length) {
                    int i5 = i4 + 10;
                    int[][] iArr4 = new int[i5][];
                    System.arraycopy(iArr3, 0, iArr4, 0, i4);
                    ho0Var.OooO0OO = iArr4;
                    ag1[] ag1VarArr = new ag1[i5];
                    System.arraycopy((ag1[]) ho0Var.OooO0Oo, 0, ag1VarArr, 0, i4);
                    ho0Var.OooO0Oo = ag1VarArr;
                }
                int[][] iArr5 = (int[][]) ho0Var.OooO0OO;
                int i6 = ho0Var.OooO00o;
                iArr5[i6] = iArrTrimStateSet;
                ((ag1[]) ho0Var.OooO0Oo)[i6] = ag1VarOooO00o;
                ho0Var.OooO00o = i6 + 1;
            }
        }
    }
}
