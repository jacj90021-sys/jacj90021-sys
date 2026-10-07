package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class e53 {
    public static int OooO00o(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static o00Oo00 OooO0O0(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        o00Oo00 o00oo00OooO0o0;
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        int i2 = 2;
        Object obj = null;
        int i3 = 0;
        if (attributeValue != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new o00Oo00(obj, obj, typedValue.data, i2);
            }
            try {
                o00oo00OooO0o0 = o00Oo00.OooO0o0(typedArray.getResourceId(i, 0), theme, typedArray.getResources());
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                o00oo00OooO0o0 = null;
            }
            if (o00oo00OooO0o0 != null) {
                return o00oo00OooO0o0;
            }
        }
        return new o00Oo00(obj, obj, i3, i2);
    }

    public static boolean OooO0OO(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray OooO0Oo(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
