package com.cmaster.cloner;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zy1 extends ez1 {
    public static boolean OooO0o;
    public static Field OooO0o0;
    public static Constructor OooO0oO;
    public static boolean OooO0oo;
    public WindowInsets OooO0OO;
    public zg0 OooO0Oo;

    public zy1() {
        this.OooO0OO = OooO();
    }

    private static WindowInsets OooO() {
        if (!OooO0o) {
            try {
                OooO0o0 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            OooO0o = true;
        }
        Field field = OooO0o0;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!OooO0oo) {
            try {
                OooO0oO = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            OooO0oo = true;
        }
        Constructor constructor = OooO0oO;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // com.cmaster.cloner.ez1
    public qz1 OooO0O0() {
        OooO00o();
        qz1 qz1VarOooO0oO = qz1.OooO0oO(this.OooO0OO, null);
        zg0[] zg0VarArr = this.OooO0O0;
        mz1 mz1Var = qz1VarOooO0oO.OooO00o;
        mz1Var.OooOOOO(zg0VarArr);
        mz1Var.OooOOo0(this.OooO0Oo);
        return qz1VarOooO0oO;
    }

    @Override // com.cmaster.cloner.ez1
    public void OooO0o0(zg0 zg0Var) {
        this.OooO0Oo = zg0Var;
    }

    @Override // com.cmaster.cloner.ez1
    public void OooO0oO(zg0 zg0Var) {
        WindowInsets windowInsets = this.OooO0OO;
        if (windowInsets != null) {
            this.OooO0OO = windowInsets.replaceSystemWindowInsets(zg0Var.OooO00o, zg0Var.OooO0O0, zg0Var.OooO0OO, zg0Var.OooO0Oo);
        }
    }

    public zy1(qz1 qz1Var) {
        super(qz1Var);
        this.OooO0OO = qz1Var.OooO0o();
    }
}
