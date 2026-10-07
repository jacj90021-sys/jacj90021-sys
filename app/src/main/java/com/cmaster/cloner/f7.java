package com.cmaster.cloner;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class f7 {
    public final e7 OooO;
    public final int OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final TimeInterpolator OooO0Oo;
    public final TimeInterpolator OooO0o;
    public final TimeInterpolator OooO0o0;
    public final ViewGroup OooO0oO;
    public final Context OooO0oo;
    public final SnackbarContentLayout OooOO0;
    public final a7 OooOO0O;
    public int OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public int OooOOOO;
    public int OooOOOo;
    public final AccessibilityManager OooOOo;
    public boolean OooOOo0;
    public final c7 OooOOoo = new c7(this);
    public static final yy OooOo00 = oO0oO000.OooO0O0;
    public static final LinearInterpolator OooOo0 = oO0oO000.OooO00o;
    public static final yy OooOo0O = oO0oO000.OooO0Oo;
    public static final int[] OooOo = {R.attr.snackbarStyle};
    public static final String OooOoO0 = f7.class.getSimpleName();
    public static final Handler OooOo0o = new Handler(Looper.getMainLooper(), new z6(0));

    public f7(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        int i = 0;
        this.OooOO0O = new a7(this, i);
        if (view == null) {
            ra.OooOOO("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            ra.OooOOO("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.OooO0oO = viewGroup;
        this.OooOO0 = snackbarContentLayout;
        this.OooO0oo = context;
        t82.OooO0OO(context, t82.OooO00o, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(OooOo);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        e7 e7Var = (e7) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.OooO = e7Var;
        e7Var.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            float actionTextColorAlpha = e7Var.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout2.OooO0o0.setTextColor(uv2.OooO0o0(uv2.OooO0OO(snackbarContentLayout2, R.attr.colorSurface), snackbarContentLayout2.OooO0o0.getCurrentTextColor(), actionTextColorAlpha));
            }
            snackbarContentLayout2.setMaxInlineActionWidth(e7Var.getMaxInlineActionWidth());
        }
        e7Var.addView(view);
        e7Var.setAccessibilityLiveRegion(1);
        e7Var.setImportantForAccessibility(1);
        e7Var.setFitsSystemWindows(true);
        o00OO000 o00oo000 = new o00OO000(this, 7);
        WeakHashMap weakHashMap = nt1.OooO00o;
        ft1.OooOO0O(e7Var, o00oo000);
        nt1.OooOOO0(e7Var, new b7(this, i));
        this.OooOOo = (AccessibilityManager) context.getSystemService("accessibility");
        this.OooO0OO = ow2.OooO0OO(context, R.attr.motionDurationLong2, 250);
        this.OooO00o = ow2.OooO0OO(context, R.attr.motionDurationLong2, 150);
        this.OooO0O0 = ow2.OooO0OO(context, R.attr.motionDurationMedium1, 75);
        this.OooO0Oo = ow2.OooO0Oo(context, R.attr.motionEasingEmphasizedInterpolator, OooOo0);
        this.OooO0o = ow2.OooO0Oo(context, R.attr.motionEasingEmphasizedInterpolator, OooOo0O);
        this.OooO0o0 = ow2.OooO0Oo(context, R.attr.motionEasingEmphasizedInterpolator, OooOo00);
    }

    public final void OooO00o(int i) {
        ho1 ho1VarOooOoO0 = ho1.OooOoO0();
        c7 c7Var = this.OooOOoo;
        synchronized (ho1VarOooOoO0.OooO0o0) {
            try {
                if (ho1VarOooOoO0.OooOooO(c7Var)) {
                    ho1VarOooOoO0.OooOOO((uh1) ho1VarOooOoO0.OooO0oO, i);
                } else {
                    uh1 uh1Var = (uh1) ho1VarOooOoO0.OooO0oo;
                    if (uh1Var != null && uh1Var.OooO00o.get() == c7Var) {
                        ho1VarOooOoO0.OooOOO((uh1) ho1VarOooOoO0.OooO0oo, i);
                    }
                }
            } finally {
            }
        }
    }

    public final void OooO0O0() {
        ho1 ho1VarOooOoO0 = ho1.OooOoO0();
        c7 c7Var = this.OooOOoo;
        synchronized (ho1VarOooOoO0.OooO0o0) {
            try {
                if (ho1VarOooOoO0.OooOooO(c7Var)) {
                    ho1VarOooOoO0.OooO0oO = null;
                    if (((uh1) ho1VarOooOoO0.OooO0oo) != null) {
                        ho1VarOooOoO0.Oooo0oO();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.OooO.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.OooO);
        }
    }

    public final void OooO0OO() {
        ho1 ho1VarOooOoO0 = ho1.OooOoO0();
        c7 c7Var = this.OooOOoo;
        synchronized (ho1VarOooOoO0.OooO0o0) {
            try {
                if (ho1VarOooOoO0.OooOooO(c7Var)) {
                    ho1VarOooOoO0.Oooo0o((uh1) ho1VarOooOoO0.OooO0oO);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0Oo() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.OooOOo;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        e7 e7Var = this.OooO;
        if (z) {
            e7Var.post(new a7(this, 2));
            return;
        }
        if (e7Var.getParent() != null) {
            e7Var.setVisibility(0);
        }
        OooO0OO();
    }

    public final void OooO0o0() {
        e7 e7Var = this.OooO;
        ViewGroup.LayoutParams layoutParams = e7Var.getLayoutParams();
        boolean z = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = OooOoO0;
        if (!z) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (e7Var.OooOOO0 == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (e7Var.getParent() == null) {
            return;
        }
        int i = this.OooOO0o;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = e7Var.OooOOO0;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.OooOOO0;
        int i4 = rect.right + this.OooOOO;
        int i5 = rect.top;
        boolean z2 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z2) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            e7Var.requestLayout();
        }
        if ((z2 || this.OooOOOo != this.OooOOOO) && Build.VERSION.SDK_INT >= 29 && this.OooOOOO > 0) {
            ViewGroup.LayoutParams layoutParams2 = e7Var.getLayoutParams();
            if ((layoutParams2 instanceof oj) && (((oj) layoutParams2).OooO00o instanceof SwipeDismissBehavior)) {
                a7 a7Var = this.OooOO0O;
                e7Var.removeCallbacks(a7Var);
                e7Var.post(a7Var);
            }
        }
    }
}
