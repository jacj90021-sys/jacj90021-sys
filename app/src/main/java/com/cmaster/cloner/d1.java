package com.cmaster.cloner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class d1 {
    public final Object[] OooO00o = new Object[2];
    public static final Class[] OooO0O0 = {Context.class, AttributeSet.class};
    public static final int[] OooO0OO = {android.R.attr.onClick};
    public static final int[] OooO0Oo = {android.R.attr.accessibilityHeading};
    public static final int[] OooO0o0 = {android.R.attr.accessibilityPaneTitle};
    public static final int[] OooO0o = {android.R.attr.screenReaderFocusable};
    public static final String[] OooO0oO = {"android.widget.", "android.view.", "android.webkit."};
    public static final gh1 OooO0oo = new gh1(0);

    public oOOO00Oo OooO00o(Context context, AttributeSet attributeSet) {
        return new oOOO00Oo(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public oOOO00o0 OooO0O0(Context context, AttributeSet attributeSet) {
        return new oOOO00o0(context, attributeSet, R.attr.buttonStyle);
    }

    public oOOO0OOO OooO0OO(Context context, AttributeSet attributeSet) {
        return new oOOO0OOO(context, attributeSet);
    }

    public v OooO0Oo(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet, 0);
    }

    public final View OooO0o(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        gh1 gh1Var = OooO0oo;
        Constructor constructor = (Constructor) gh1Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(OooO0O0);
            gh1Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.OooO00o);
    }

    public AppCompatTextView OooO0o0(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }
}
