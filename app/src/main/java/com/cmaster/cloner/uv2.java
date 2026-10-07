package com.cmaster.cloner;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class uv2 {
    public static int OooO00o(int i, int i2) {
        return ye.OooO0Oo(i, (Color.alpha(i) * i2) / 255);
    }

    public static int OooO0O0(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueOooO00o = sv2.OooO00o(context, i);
        if (typedValueOooO00o != null) {
            int i3 = typedValueOooO00o.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? context.getColor(i3) : typedValueOooO00o.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    public static int OooO0OO(View view, int i) {
        Context context = view.getContext();
        Context context2 = view.getContext();
        String canonicalName = view.getClass().getCanonicalName();
        TypedValue typedValueOooO00o = sv2.OooO00o(context2, i);
        if (typedValueOooO00o == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", canonicalName, context2.getResources().getResourceName(i)));
        }
        int i2 = typedValueOooO00o.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValueOooO00o.data;
    }

    public static boolean OooO0Oo(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = ye.OooO00o;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            ra.OooOOO("outXyz must have a length of 3.");
            return false;
        }
        double d = iRed / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = iGreen / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = iBlue / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    public static int OooO0o0(int i, int i2, float f) {
        return ye.OooO0O0(ye.OooO0Oo(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}
