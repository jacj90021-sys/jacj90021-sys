package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ft1 {
    public static void OooO(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void OooO00o(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static qz1 OooO0O0(View view, qz1 qz1Var, Rect rect) {
        WindowInsets windowInsetsOooO0o = qz1Var.OooO0o();
        if (windowInsetsOooO0o != null) {
            return qz1.OooO0oO(view.computeSystemWindowInsets(windowInsetsOooO0o, rect), view);
        }
        rect.setEmpty();
        return qz1Var;
    }

    public static ColorStateList OooO0OO(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode OooO0Oo(View view) {
        return view.getBackgroundTintMode();
    }

    public static String OooO0o(View view) {
        return view.getTransitionName();
    }

    public static float OooO0o0(View view) {
        return view.getElevation();
    }

    public static float OooO0oO(View view) {
        return view.getZ();
    }

    public static void OooO0oo(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void OooOO0(View view, float f) {
        view.setElevation(f);
    }

    public static void OooOO0O(View view, oy0 oy0Var) {
        et1 et1Var = oy0Var != null ? new et1(view, oy0Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, et1Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (et1Var != null) {
            view.setOnApplyWindowInsetsListener(et1Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void OooOO0o(View view) {
        view.stopNestedScroll();
    }
}
