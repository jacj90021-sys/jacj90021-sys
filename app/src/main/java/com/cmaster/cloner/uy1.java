package com.cmaster.cloner;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class uy1 extends xy1 {
    public static final PathInterpolator OooO0o0 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final yy OooO0o = new yy(0);
    public static final DecelerateInterpolator OooO0oO = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator OooO0oo = new AccelerateInterpolator(1.5f);

    public static ah0 OooO(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ty1) {
            return ((ty1) tag).OooO00o;
        }
        return null;
    }

    public static void OooO0o(View view, qz1 qz1Var, boolean z) {
        ah0 ah0VarOooO = OooO(view);
        if (ah0VarOooO != null) {
            ah0VarOooO.OooO0OO = qz1Var;
            if (!z) {
                View view2 = (View) ah0VarOooO.OooO0Oo;
                int[] iArr = (int[]) ah0VarOooO.OooO0o0;
                view2.getLocationOnScreen(iArr);
                z = true;
                ah0VarOooO.OooO00o = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0o(viewGroup.getChildAt(i), qz1Var, z);
            }
        }
    }

    public static void OooO0o0(View view) {
        ah0 ah0VarOooO = OooO(view);
        if (ah0VarOooO != null) {
            ((View) ah0VarOooO.OooO0Oo).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0o0(viewGroup.getChildAt(i));
            }
        }
    }

    public static void OooO0oO(View view, qz1 qz1Var, List list) {
        ah0 ah0VarOooO = OooO(view);
        if (ah0VarOooO != null) {
            ah0VarOooO.OooO00o(qz1Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0oO(viewGroup.getChildAt(i), qz1Var, list);
            }
        }
    }

    public static void OooO0oo(View view, vr1 vr1Var) {
        ah0 ah0VarOooO = OooO(view);
        if (ah0VarOooO != null) {
            View view2 = (View) ah0VarOooO.OooO0Oo;
            int[] iArr = (int[]) ah0VarOooO.OooO0o0;
            view2.getLocationOnScreen(iArr);
            int i = ah0VarOooO.OooO00o - iArr[1];
            ah0VarOooO.OooO0O0 = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                OooO0oo(viewGroup.getChildAt(i2), vr1Var);
            }
        }
    }
}
