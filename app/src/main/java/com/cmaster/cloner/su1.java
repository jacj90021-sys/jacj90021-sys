package com.cmaster.cloner;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class su1 extends s53 {
    public static boolean OooO0Oo = true;
    public static boolean OooO0o = true;
    public static boolean OooO0o0 = true;
    public static boolean OooO0oO = true;

    public void OooO0OO(View view, int i, int i2, int i3, int i4) {
        if (OooO0o) {
            try {
                qu1.OooO00o(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                OooO0o = false;
            }
        }
    }

    public void OooO0Oo(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT != 28) {
            if (OooO0oO) {
                try {
                    ru1.OooO00o(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    OooO0oO = false;
                    return;
                }
            }
            return;
        }
        if (!s53.OooO0OO) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                s53.OooO0O0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            s53.OooO0OO = true;
        }
        Field field = s53.OooO0O0;
        if (field != null) {
            try {
                s53.OooO0O0.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void OooO0o(ViewGroup viewGroup, Matrix matrix) {
        if (OooO0o0) {
            try {
                pu1.OooO0OO(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                OooO0o0 = false;
            }
        }
    }

    public void OooO0o0(View view, Matrix matrix) {
        if (OooO0Oo) {
            try {
                pu1.OooO0O0(view, matrix);
            } catch (NoSuchMethodError unused) {
                OooO0Oo = false;
            }
        }
    }
}
