package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ag1 {
    public static final z81 OooOOO0 = new z81(0.5f);
    public iu OooO;
    public iu OooOO0;
    public iu OooOO0O;
    public iu OooOO0o;
    public gp2 OooO00o = new hc1();
    public gp2 OooO0O0 = new hc1();
    public gp2 OooO0OO = new hc1();
    public gp2 OooO0Oo = new hc1();
    public qj OooO0o0 = new OooOO0(0.0f);
    public qj OooO0o = new OooOO0(0.0f);
    public qj OooO0oO = new OooOO0(0.0f);
    public qj OooO0oo = new OooOO0(0.0f);

    public ag1() {
        int i = 0;
        this.OooO = new iu(i);
        this.OooOO0 = new iu(i);
        this.OooOO0O = new iu(i);
        this.OooOO0o = new iu(i);
    }

    public static yf1 OooO00o(Context context, int i, int i2, qj qjVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(k61.OooOo00);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            qj qjVarOooO0OO = OooO0OO(typedArrayObtainStyledAttributes, 5, qjVar);
            qj qjVarOooO0OO2 = OooO0OO(typedArrayObtainStyledAttributes, 8, qjVarOooO0OO);
            qj qjVarOooO0OO3 = OooO0OO(typedArrayObtainStyledAttributes, 9, qjVarOooO0OO);
            qj qjVarOooO0OO4 = OooO0OO(typedArrayObtainStyledAttributes, 7, qjVarOooO0OO);
            qj qjVarOooO0OO5 = OooO0OO(typedArrayObtainStyledAttributes, 6, qjVarOooO0OO);
            yf1 yf1Var = new yf1();
            yf1Var.OooO00o = yv2.OooO00o(i4);
            yf1Var.OooO0o0 = qjVarOooO0OO2;
            yf1Var.OooO0O0 = yv2.OooO00o(i5);
            yf1Var.OooO0o = qjVarOooO0OO3;
            yf1Var.OooO0OO = yv2.OooO00o(i6);
            yf1Var.OooO0oO = qjVarOooO0OO4;
            yf1Var.OooO0Oo = yv2.OooO00o(i7);
            yf1Var.OooO0oo = qjVarOooO0OO5;
            return yf1Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static yf1 OooO0O0(Context context, AttributeSet attributeSet, int i, int i2) {
        OooOO0 oooOO0 = new OooOO0(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k61.OooOOOO, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return OooO00o(context, resourceId, resourceId2, oooOO0);
    }

    public static qj OooO0OO(TypedArray typedArray, int i, qj qjVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new OooOO0(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new z81(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return qjVar;
    }

    public final boolean OooO0Oo() {
        return (this.OooO0O0 instanceof hc1) && (this.OooO00o instanceof hc1) && (this.OooO0OO instanceof hc1) && (this.OooO0Oo instanceof hc1);
    }

    public final yf1 OooO0o() {
        yf1 yf1Var = new yf1();
        yf1Var.OooO00o = this.OooO00o;
        yf1Var.OooO0O0 = this.OooO0O0;
        yf1Var.OooO0OO = this.OooO0OO;
        yf1Var.OooO0Oo = this.OooO0Oo;
        yf1Var.OooO0o0 = this.OooO0o0;
        yf1Var.OooO0o = this.OooO0o;
        yf1Var.OooO0oO = this.OooO0oO;
        yf1Var.OooO0oo = this.OooO0oo;
        yf1Var.OooO = this.OooO;
        yf1Var.OooOO0 = this.OooOO0;
        yf1Var.OooOO0O = this.OooOO0O;
        yf1Var.OooOO0o = this.OooOO0o;
        return yf1Var;
    }

    public final boolean OooO0o0(RectF rectF) {
        boolean z = this.OooOO0o.getClass().equals(iu.class) && this.OooOO0.getClass().equals(iu.class) && this.OooO.getClass().equals(iu.class) && this.OooOO0O.getClass().equals(iu.class);
        float fOooO00o = this.OooO0o0.OooO00o(rectF);
        return z && ((this.OooO0o.OooO00o(rectF) > fOooO00o ? 1 : (this.OooO0o.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0 && (this.OooO0oo.OooO00o(rectF) > fOooO00o ? 1 : (this.OooO0oo.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0 && (this.OooO0oO.OooO00o(rectF) > fOooO00o ? 1 : (this.OooO0oO.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0) && OooO0Oo();
    }

    public final ag1 OooO0oO(zf1 zf1Var) {
        yf1 yf1VarOooO0o = OooO0o();
        yf1VarOooO0o.OooO0o0 = zf1Var.OooOOOo(this.OooO0o0);
        yf1VarOooO0o.OooO0o = zf1Var.OooOOOo(this.OooO0o);
        yf1VarOooO0o.OooO0oo = zf1Var.OooOOOo(this.OooO0oo);
        yf1VarOooO0o.OooO0oO = zf1Var.OooOOOo(this.OooO0oO);
        return yf1VarOooO0o.OooO00o();
    }

    public final String toString() {
        return "[" + this.OooO0o0 + ", " + this.OooO0o + ", " + this.OooO0oO + ", " + this.OooO0oo + "]";
    }
}
