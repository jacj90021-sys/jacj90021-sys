package com.cmaster.cloner;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class fz1 extends mz1 {
    public static boolean OooO;
    public static Method OooOO0;
    public static Class OooOO0O;
    public static Field OooOO0o;
    public static Field OooOOO0;
    public final WindowInsets OooO0OO;
    public zg0[] OooO0Oo;
    public qz1 OooO0o;
    public zg0 OooO0o0;
    public zg0 OooO0oO;
    public int OooO0oo;

    public fz1(qz1 qz1Var, WindowInsets windowInsets) {
        super(qz1Var);
        this.OooO0o0 = null;
        this.OooO0OO = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private zg0 OooOOoo(int i, boolean z) {
        zg0 zg0VarOooO00o = zg0.OooO0o0;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                zg0VarOooO00o = zg0.OooO00o(zg0VarOooO00o, OooOo00(i2, z));
            }
        }
        return zg0VarOooO00o;
    }

    private zg0 OooOo0() {
        qz1 qz1Var = this.OooO0o;
        return qz1Var != null ? qz1Var.OooO00o.OooO0oo() : zg0.OooO0o0;
    }

    private zg0 OooOo0O(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            sa.OooO0oO("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!OooO) {
            OooOo0o();
        }
        Method method = OooOO0;
        if (method != null && OooOO0O != null && OooOO0o != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) OooOO0o.get(OooOOO0.get(objInvoke));
                if (rect != null) {
                    return zg0.OooO0O0(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void OooOo0o() throws ClassNotFoundException, SecurityException {
        try {
            OooOO0 = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            OooOO0O = cls;
            OooOO0o = cls.getDeclaredField("mVisibleInsets");
            OooOOO0 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            OooOO0o.setAccessible(true);
            OooOOO0.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        OooO = true;
    }

    public static boolean OooOoO0(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // com.cmaster.cloner.mz1
    public void OooO0Oo(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zg0 zg0VarOooOo0O = OooOo0O(view);
        if (zg0VarOooOo0O == null) {
            zg0VarOooOo0O = zg0.OooO0o0;
        }
        OooOo(zg0VarOooOo0O);
    }

    @Override // com.cmaster.cloner.mz1
    public zg0 OooO0o(int i) {
        return OooOOoo(i, false);
    }

    @Override // com.cmaster.cloner.mz1
    public final zg0 OooOO0() {
        if (this.OooO0o0 == null) {
            WindowInsets windowInsets = this.OooO0OO;
            this.OooO0o0 = zg0.OooO0O0(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.OooO0o0;
    }

    @Override // com.cmaster.cloner.mz1
    public qz1 OooOO0o(int i, int i2, int i3, int i4) {
        qz1 qz1VarOooO0oO = qz1.OooO0oO(this.OooO0OO, null);
        int i5 = Build.VERSION.SDK_INT;
        ez1 dz1Var = i5 >= 34 ? new dz1(qz1VarOooO0oO) : i5 >= 31 ? new cz1(qz1VarOooO0oO) : i5 >= 30 ? new bz1(qz1VarOooO0oO) : i5 >= 29 ? new az1(qz1VarOooO0oO) : new zy1(qz1VarOooO0oO);
        dz1Var.OooO0oO(qz1.OooO0o0(OooOO0(), i, i2, i3, i4));
        dz1Var.OooO0o0(qz1.OooO0o0(OooO0oo(), i, i2, i3, i4));
        return dz1Var.OooO0O0();
    }

    @Override // com.cmaster.cloner.mz1
    public boolean OooOOO() {
        return this.OooO0OO.isRound();
    }

    @Override // com.cmaster.cloner.mz1
    public void OooOOOO(zg0[] zg0VarArr) {
        this.OooO0Oo = zg0VarArr;
    }

    @Override // com.cmaster.cloner.mz1
    public void OooOOOo(qz1 qz1Var) {
        this.OooO0o = qz1Var;
    }

    @Override // com.cmaster.cloner.mz1
    public void OooOOo(int i) {
        this.OooO0oo = i;
    }

    public void OooOo(zg0 zg0Var) {
        this.OooO0oO = zg0Var;
    }

    public zg0 OooOo00(int i, boolean z) {
        zg0 zg0VarOooO0oo;
        int i2;
        zg0 zg0Var = zg0.OooO0o0;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    zg0[] zg0VarArr = this.OooO0Oo;
                    zg0VarOooO0oo = zg0VarArr != null ? zg0VarArr[i63.OooO00o(8)] : null;
                    if (zg0VarOooO0oo != null) {
                        return zg0VarOooO0oo;
                    }
                    zg0 zg0VarOooOO0 = OooOO0();
                    zg0 zg0VarOooOo0 = OooOo0();
                    int i3 = zg0VarOooOO0.OooO0Oo;
                    if (i3 > zg0VarOooOo0.OooO0Oo) {
                        return zg0.OooO0O0(0, 0, 0, i3);
                    }
                    zg0 zg0Var2 = this.OooO0oO;
                    if (zg0Var2 != null && !zg0Var2.equals(zg0Var) && (i2 = this.OooO0oO.OooO0Oo) > zg0VarOooOo0.OooO0Oo) {
                        return zg0.OooO0O0(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return OooO();
                    }
                    if (i == 32) {
                        return OooO0oO();
                    }
                    if (i == 64) {
                        return OooOO0O();
                    }
                    if (i == 128) {
                        qz1 qz1Var = this.OooO0o;
                        hs hsVarOooO0o0 = qz1Var != null ? qz1Var.OooO00o.OooO0o0() : OooO0o0();
                        if (hsVarOooO0o0 != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return zg0.OooO0O0(i4 >= 28 ? ep.OooO0oO(hsVarOooO0o0.OooO00o) : 0, i4 >= 28 ? ep.OooO(hsVarOooO0o0.OooO00o) : 0, i4 >= 28 ? ep.OooO0oo(hsVarOooO0o0.OooO00o) : 0, i4 >= 28 ? ep.OooO0o(hsVarOooO0o0.OooO00o) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    zg0 zg0VarOooOo02 = OooOo0();
                    zg0 zg0VarOooO0oo2 = OooO0oo();
                    return zg0.OooO0O0(Math.max(zg0VarOooOo02.OooO00o, zg0VarOooO0oo2.OooO00o), 0, Math.max(zg0VarOooOo02.OooO0OO, zg0VarOooO0oo2.OooO0OO), Math.max(zg0VarOooOo02.OooO0Oo, zg0VarOooO0oo2.OooO0Oo));
                }
                if ((this.OooO0oo & 2) == 0) {
                    zg0 zg0VarOooOO02 = OooOO0();
                    qz1 qz1Var2 = this.OooO0o;
                    zg0VarOooO0oo = qz1Var2 != null ? qz1Var2.OooO00o.OooO0oo() : null;
                    int iMin = zg0VarOooOO02.OooO0Oo;
                    if (zg0VarOooO0oo != null) {
                        iMin = Math.min(iMin, zg0VarOooO0oo.OooO0Oo);
                    }
                    return zg0.OooO0O0(zg0VarOooOO02.OooO00o, 0, zg0VarOooOO02.OooO0OO, iMin);
                }
            }
        } else {
            if (z) {
                return zg0.OooO0O0(0, Math.max(OooOo0().OooO0O0, OooOO0().OooO0O0), 0, 0);
            }
            if ((this.OooO0oo & 4) == 0) {
                return zg0.OooO0O0(0, OooOO0().OooO0O0, 0, 0);
            }
        }
        return zg0Var;
    }

    @Override // com.cmaster.cloner.mz1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        fz1 fz1Var = (fz1) obj;
        return Objects.equals(this.OooO0oO, fz1Var.OooO0oO) && OooOoO0(this.OooO0oo, fz1Var.OooO0oo);
    }
}
