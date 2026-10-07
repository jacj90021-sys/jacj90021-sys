package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s0 {
    public Object OooO;
    public int OooO00o;
    public boolean OooO0O0;
    public int OooO0OO;
    public final Object OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;
    public Object OooO0oO;
    public Object OooO0oo;
    public Object OooOO0;
    public Object OooOO0O;
    public Object OooOO0o;
    public Object OooOOO0;

    public s0() {
        this.OooO0Oo = new HashSet();
        this.OooO0o0 = new Bundle();
        this.OooO0o = new HashMap();
        this.OooO0oO = new HashSet();
        this.OooO0oo = new Bundle();
        this.OooO = new HashSet();
        this.OooOO0O = new ArrayList();
        this.OooO00o = -1;
        this.OooO0OO = 60000;
    }

    public static in1 OooO0OO(Context context, n nVar, int i) {
        ColorStateList colorStateListOooO0oO;
        synchronized (nVar) {
            colorStateListOooO0oO = nVar.OooO00o.OooO0oO(context, i);
        }
        if (colorStateListOooO0oO == null) {
            return null;
        }
        in1 in1Var = new in1();
        in1Var.OooO0Oo = true;
        in1Var.OooO00o = colorStateListOooO0oO;
        return in1Var;
    }

    public static void OooO0oo(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            o000O000.OooO0o(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            o000O000.OooO0o(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            zp1.OooO0OO(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & UnixStat.PERM_MASK;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            zp1.OooO0OO(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            zp1.OooO0OO(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        zp1.OooO0OO(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public void OooO(int i, int i2, int i3, int i4) {
        a1 a1Var = (a1) this.OooOO0o;
        if (a1Var.OooOO0()) {
            DisplayMetrics displayMetrics = a1Var.OooOO0.getResources().getDisplayMetrics();
            a1Var.OooOO0O(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (a1Var.OooO0oo()) {
                a1Var.OooO00o();
            }
        }
    }

    public void OooO00o(Drawable drawable, in1 in1Var) {
        if (drawable == null || in1Var == null) {
            return;
        }
        n.OooO0o0(drawable, in1Var, ((TextView) this.OooO0Oo).getDrawableState());
    }

    public void OooO0O0() {
        TextView textView = (TextView) this.OooO0Oo;
        if (((in1) this.OooO0o0) != null || ((in1) this.OooO0o) != null || ((in1) this.OooO0oO) != null || ((in1) this.OooO0oo) != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            OooO00o(compoundDrawables[0], (in1) this.OooO0o0);
            OooO00o(compoundDrawables[1], (in1) this.OooO0o);
            OooO00o(compoundDrawables[2], (in1) this.OooO0oO);
            OooO00o(compoundDrawables[3], (in1) this.OooO0oo);
        }
        if (((in1) this.OooO) == null && ((in1) this.OooOO0) == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        OooO00o(compoundDrawablesRelative[0], (in1) this.OooO);
        OooO00o(compoundDrawablesRelative[2], (in1) this.OooOO0);
    }

    public ColorStateList OooO0Oo() {
        in1 in1Var = (in1) this.OooOO0O;
        if (in1Var != null) {
            return in1Var.OooO00o;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooO0o(android.util.AttributeSet r25, int r26) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.s0.OooO0o(android.util.AttributeSet, int):void");
    }

    public PorterDuff.Mode OooO0o0() {
        in1 in1Var = (in1) this.OooOO0O;
        if (in1Var != null) {
            return in1Var.OooO0O0;
        }
        return null;
    }

    public void OooO0oO(Context context, int i) throws Resources.NotFoundException {
        String string;
        TextView textView = (TextView) this.OooO0Oo;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, l61.OooOo);
        a02 a02Var = new a02(context, typedArrayObtainStyledAttributes);
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        OooOOO(context, a02Var);
        if (Build.VERSION.SDK_INT >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            q0.OooO0Oo(textView, string);
        }
        a02Var.Oooo0oO();
        Typeface typeface = (Typeface) this.OooOOO0;
        if (typeface != null) {
            textView.setTypeface(typeface, this.OooO00o);
        }
    }

    public void OooOO0(int[] iArr, int i) {
        a1 a1Var = (a1) this.OooOO0o;
        if (a1Var.OooOO0()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = a1Var.OooOO0.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                a1Var.OooO0o = a1.OooO0O0(iArrCopyOf);
                if (!a1Var.OooO()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                a1Var.OooO0oO = false;
            }
            if (a1Var.OooO0oo()) {
                a1Var.OooO00o();
            }
        }
    }

    public void OooOO0O(int i) {
        a1 a1Var = (a1) this.OooOO0o;
        if (a1Var.OooOO0()) {
            if (i == 0) {
                a1Var.OooO00o = 0;
                a1Var.OooO0Oo = -1.0f;
                a1Var.OooO0o0 = -1.0f;
                a1Var.OooO0OO = -1.0f;
                a1Var.OooO0o = new int[0];
                a1Var.OooO0O0 = false;
                return;
            }
            if (i != 1) {
                ra.OooOOO(px0.OooOOO(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = a1Var.OooOO0.getResources().getDisplayMetrics();
            a1Var.OooOO0O(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (a1Var.OooO0oo()) {
                a1Var.OooO00o();
            }
        }
    }

    public void OooOO0o(ColorStateList colorStateList) {
        if (((in1) this.OooOO0O) == null) {
            this.OooOO0O = new in1();
        }
        in1 in1Var = (in1) this.OooOO0O;
        in1Var.OooO00o = colorStateList;
        in1Var.OooO0Oo = colorStateList != null;
        this.OooO0o0 = in1Var;
        this.OooO0o = in1Var;
        this.OooO0oO = in1Var;
        this.OooO0oo = in1Var;
        this.OooO = in1Var;
        this.OooOO0 = in1Var;
    }

    public void OooOOO(Context context, a02 a02Var) {
        String string;
        int i = this.OooO00o;
        TypedArray typedArray = (TypedArray) a02Var.OooO0o;
        this.OooO00o = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.OooO0OO = i3;
            if (i3 != -1) {
                this.OooO00o &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.OooO0O0 = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.OooOOO0 = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.OooOOO0 = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.OooOOO0 = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.OooOOO0 = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.OooO0OO;
        int i7 = this.OooO00o;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceOooOo0 = a02Var.OooOo0(i5, this.OooO00o, new m0(this, i6, i7, new WeakReference((TextView) this.OooO0Oo)));
                if (typefaceOooOo0 != null) {
                    if (i2 < 28 || this.OooO0OO == -1) {
                        this.OooOOO0 = typefaceOooOo0;
                    } else {
                        this.OooOOO0 = r0.OooO00o(Typeface.create(typefaceOooOo0, 0), this.OooO0OO, (this.OooO00o & 2) != 0);
                    }
                }
                this.OooO0O0 = ((Typeface) this.OooOOO0) == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (((Typeface) this.OooOOO0) != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.OooO0OO == -1) {
            this.OooOOO0 = Typeface.create(string, this.OooO00o);
        } else {
            this.OooOOO0 = r0.OooO00o(Typeface.create(string, 0), this.OooO0OO, (this.OooO00o & 2) != 0);
        }
    }

    public void OooOOO0(PorterDuff.Mode mode) {
        if (((in1) this.OooOO0O) == null) {
            this.OooOO0O = new in1();
        }
        in1 in1Var = (in1) this.OooOO0O;
        in1Var.OooO0O0 = mode;
        in1Var.OooO0OO = mode != null;
        this.OooO0o0 = in1Var;
        this.OooO0o = in1Var;
        this.OooO0oO = in1Var;
        this.OooO0oo = in1Var;
        this.OooO = in1Var;
        this.OooOO0 = in1Var;
    }

    public s0(TextView textView) {
        this.OooO00o = 0;
        this.OooO0OO = -1;
        this.OooO0Oo = textView;
        this.OooOO0o = new a1(textView);
    }
}
