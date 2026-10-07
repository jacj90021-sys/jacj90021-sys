package com.cmaster.cloner;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ow2 {
    public static float OooO00o(int i, String[] strArr) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static boolean OooO0O0(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int OooO0OO(Context context, int i, int i2) {
        TypedValue typedValueOooO00o = sv2.OooO00o(context, i);
        return (typedValueOooO00o == null || typedValueOooO00o.type != 16) ? i2 : typedValueOooO00o.data;
    }

    public static TimeInterpolator OooO0Oo(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            ra.OooOOO("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!OooO0O0(strValueOf, "cubic-bezier") && !OooO0O0(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (OooO0O0(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(OooO00o(0, strArrSplit), OooO00o(1, strArrSplit), OooO00o(2, strArrSplit), OooO00o(3, strArrSplit));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!OooO0O0(strValueOf, "path")) {
            ra.OooOOO("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            o21.OooO0O0(px2.OooO0O0(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            qa.OooO0oO("Error in parsing ".concat(strSubstring), e);
            return null;
        }
    }
}
