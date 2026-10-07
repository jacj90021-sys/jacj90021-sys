package com.cmaster.cloner;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class O0OO00 implements oy0, ht0 {
    public final /* synthetic */ k OooO0Oo;

    public /* synthetic */ O0OO00(k kVar) {
        this.OooO0Oo = kVar;
    }

    @Override // com.cmaster.cloner.ht0
    public void OooO0OO(ss0 ss0Var, boolean z) {
        j jVar;
        ss0 ss0VarOooOO0O = ss0Var.OooOO0O();
        int i = 0;
        boolean z2 = ss0VarOooOO0O != ss0Var;
        if (z2) {
            ss0Var = ss0VarOooOO0O;
        }
        k kVar = this.OooO0Oo;
        j[] jVarArr = kVar.Oooo0oo;
        int length = jVarArr != null ? jVarArr.length : 0;
        while (true) {
            if (i < length) {
                jVar = jVarArr[i];
                if (jVar != null && jVar.OooO0oo == ss0Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                jVar = null;
                break;
            }
        }
        if (jVar != null) {
            if (!z2) {
                kVar.OooOOoo(jVar, z);
            } else {
                kVar.OooOOo0(jVar.OooO00o, jVar, ss0VarOooOO0O);
                kVar.OooOOoo(jVar, true);
            }
        }
    }

    @Override // com.cmaster.cloner.oy0
    public qz1 OooOOO(View view, qz1 qz1Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        int i2;
        boolean z;
        qz1 qz1VarOooO0O0;
        boolean z2;
        int iOooO0Oo = qz1Var.OooO0Oo();
        k kVar = this.OooO0Oo;
        Context context = kVar.OooOOO;
        int iOooO0Oo2 = qz1Var.OooO0Oo();
        ActionBarContextView actionBarContextView = kVar.OooOo;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            i2 = 8;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kVar.OooOo.getLayoutParams();
            if (kVar.OooOo.isShown()) {
                if (kVar.OooooOo == null) {
                    kVar.OooooOo = new Rect();
                    kVar.Oooooo0 = new Rect();
                }
                Rect rect = kVar.OooooOo;
                Rect rect2 = kVar.Oooooo0;
                rect.set(qz1Var.OooO0O0(), qz1Var.OooO0Oo(), qz1Var.OooO0OO(), qz1Var.OooO00o());
                ViewGroup viewGroup = kVar.OooOooO;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = nu1.OooO00o;
                    lu1.OooO00o(viewGroup, rect, rect2);
                } else {
                    if (!nu1.OooO00o) {
                        nu1.OooO00o = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            nu1.OooO0O0 = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                nu1.OooO0O0.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = nu1.OooO0O0;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup2 = kVar.OooOooO;
                WeakHashMap weakHashMap = nt1.OooO00o;
                qz1 qz1VarOooO00o = gt1.OooO00o(viewGroup2);
                int iOooO0O0 = qz1VarOooO00o == null ? 0 : qz1VarOooO00o.OooO0O0();
                int iOooO0OO = qz1VarOooO00o == null ? 0 : qz1VarOooO00o.OooO0OO();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || kVar.Oooo000 != null) {
                    i2 = 8;
                    View view2 = kVar.Oooo000;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != iOooO0O0 || marginLayoutParams2.rightMargin != iOooO0OO) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = iOooO0O0;
                            marginLayoutParams2.rightMargin = iOooO0OO;
                            kVar.Oooo000.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    kVar.Oooo000 = view3;
                    i2 = 8;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iOooO0O0;
                    layoutParams.rightMargin = iOooO0OO;
                    kVar.OooOooO.addView(kVar.Oooo000, -1, layoutParams);
                }
                View view4 = kVar.Oooo000;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = kVar.Oooo000;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!kVar.Oooo0OO && z) {
                    iOooO0Oo2 = 0;
                }
                i = 0;
                z = z;
                z = z2;
            } else {
                i2 = 8;
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    z = false;
                }
            }
            if (z) {
                kVar.OooOo.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = kVar.Oooo000;
        if (view6 != null) {
            if (z) {
                i2 = i;
            }
            view6.setVisibility(i2);
        }
        if (iOooO0Oo != iOooO0Oo2) {
            int iOooO0O02 = qz1Var.OooO0O0();
            int iOooO0OO2 = qz1Var.OooO0OO();
            int iOooO00o = qz1Var.OooO00o();
            int i8 = Build.VERSION.SDK_INT;
            ez1 dz1Var = i8 >= 34 ? new dz1(qz1Var) : i8 >= 31 ? new cz1(qz1Var) : i8 >= 30 ? new bz1(qz1Var) : i8 >= 29 ? new az1(qz1Var) : new zy1(qz1Var);
            dz1Var.OooO0oO(zg0.OooO0O0(iOooO0O02, iOooO0Oo2, iOooO0OO2, iOooO00o));
            qz1VarOooO0O0 = dz1Var.OooO0O0();
        } else {
            qz1VarOooO0O0 = qz1Var;
        }
        WeakHashMap weakHashMap2 = nt1.OooO00o;
        WindowInsets windowInsetsOooO0o = qz1VarOooO0O0.OooO0o();
        if (windowInsetsOooO0o == null) {
            return qz1VarOooO0O0;
        }
        WindowInsets windowInsetsOooO0O0 = dt1.OooO0O0(view, windowInsetsOooO0o);
        return !windowInsetsOooO0O0.equals(windowInsetsOooO0o) ? qz1.OooO0oO(windowInsetsOooO0O0, view) : qz1VarOooO0O0;
    }

    @Override // com.cmaster.cloner.ht0
    public boolean OooOOOO(ss0 ss0Var) {
        Window.Callback callback;
        if (ss0Var != ss0Var.OooOO0O()) {
            return true;
        }
        k kVar = this.OooO0Oo;
        if (!kVar.Oooo0 || (callback = kVar.OooOOOO.getCallback()) == null || kVar.OoooO) {
            return true;
        }
        callback.onMenuOpened(108, ss0Var);
        return true;
    }
}
