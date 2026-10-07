package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a1 {
    public static final RectF OooOO0o = new RectF();
    public static final ConcurrentHashMap OooOOO0 = new ConcurrentHashMap();
    public final TextView OooO;
    public TextPaint OooO0oo;
    public final Context OooOO0;
    public final x0 OooOO0O;
    public int OooO00o = 0;
    public boolean OooO0O0 = false;
    public float OooO0OO = -1.0f;
    public float OooO0Oo = -1.0f;
    public float OooO0o0 = -1.0f;
    public int[] OooO0o = new int[0];
    public boolean OooO0oO = false;

    public a1(TextView textView) {
        this.OooO = textView;
        this.OooOO0 = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.OooOO0O = new y0();
        } else {
            this.OooOO0O = new x0();
        }
    }

    public static int[] OooO0O0(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method OooO0Oo(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = OooOOO0;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static Object OooO0o0(Object obj, String str, Object obj2) {
        try {
            return OooO0Oo(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    public final boolean OooO() {
        boolean z = this.OooO0o.length > 0;
        this.OooO0oO = z;
        if (z) {
            this.OooO00o = 1;
            this.OooO0Oo = r0[0];
            this.OooO0o0 = r0[r1 - 1];
            this.OooO0OO = -1.0f;
        }
        return z;
    }

    public final void OooO00o() {
        if (OooO0o()) {
            if (this.OooO0O0) {
                if (this.OooO.getMeasuredHeight() <= 0 || this.OooO.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.OooOO0O.OooO0O0(this.OooO) ? 1048576 : (this.OooO.getMeasuredWidth() - this.OooO.getTotalPaddingLeft()) - this.OooO.getTotalPaddingRight();
                int height = (this.OooO.getHeight() - this.OooO.getCompoundPaddingBottom()) - this.OooO.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = OooOO0o;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fOooO0OO = OooO0OO(rectF);
                        if (fOooO0OO != this.OooO.getTextSize()) {
                            OooO0oO(0, fOooO0OO);
                        }
                    } finally {
                    }
                }
            }
            this.OooO0O0 = true;
        }
    }

    public final int OooO0OO(RectF rectF) {
        CharSequence transformation;
        int length = this.OooO0o.length;
        if (length == 0) {
            qa.OooO0o("No available text sizes to choose from.");
            return 0;
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int[] iArr = this.OooO0o;
            if (i3 > i) {
                return iArr[i2];
            }
            int i4 = (i3 + i) / 2;
            int i5 = iArr[i4];
            TextView textView = this.OooO;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.OooO0oo;
            if (textPaint == null) {
                this.OooO0oo = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.OooO0oo.set(textView.getPaint());
            this.OooO0oo.setTextSize(i5);
            StaticLayout staticLayoutOooO00o = w0.OooO00o(charSequence, (Layout.Alignment) OooO0o0(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.OooO, this.OooO0oo, this.OooOO0O);
            if ((maxLines == -1 || (staticLayoutOooO00o.getLineCount() <= maxLines && staticLayoutOooO00o.getLineEnd(staticLayoutOooO00o.getLineCount() - 1) == charSequence.length())) && staticLayoutOooO00o.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
    }

    public final boolean OooO0o() {
        return OooOO0() && this.OooO00o != 0;
    }

    public final void OooO0oO(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.OooOO0;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.OooO;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.OooO0O0 = false;
                try {
                    Method methodOooO0Oo = OooO0Oo("nullLayouts");
                    if (methodOooO0Oo != null) {
                        methodOooO0Oo.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean OooO0oo() {
        if (OooOO0() && this.OooO00o == 1) {
            if (!this.OooO0oO || this.OooO0o.length == 0) {
                int iFloor = ((int) Math.floor((this.OooO0o0 - this.OooO0Oo) / this.OooO0OO)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.OooO0OO) + this.OooO0Oo);
                }
                this.OooO0o = OooO0O0(iArr);
            }
            this.OooO0O0 = true;
        } else {
            this.OooO0O0 = false;
        }
        return this.OooO0O0;
    }

    public final boolean OooOO0() {
        return !(this.OooO instanceof q);
    }

    public final void OooOO0O(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.OooO00o = 1;
        this.OooO0Oo = f;
        this.OooO0o0 = f2;
        this.OooO0OO = f3;
        this.OooO0oO = false;
    }
}
