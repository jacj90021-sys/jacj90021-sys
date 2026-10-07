package com.cmaster.cloner;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class kt {
    public static final Method OooO00o;
    public static final Method OooO0O0;
    public static final Method OooO0OO;
    public static final boolean OooO0Oo;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            OooO00o = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            OooO0O0 = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            OooO0OO = declaredMethod3;
            declaredMethod3.setAccessible(true);
            OooO0Oo = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
