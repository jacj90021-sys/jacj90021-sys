package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sl extends m {
    public BottomSheetBehavior OooO;
    public FrameLayout OooOO0;
    public CoordinatorLayout OooOO0O;
    public FrameLayout OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public boolean OooOOOO;
    public c9 OooOOOo;
    public hx2 OooOOo;
    public final boolean OooOOo0;
    public final b9 OooOOoo;
    public i2 OooOo;
    public final gy0 OooOo0;
    public final m1 OooOo00;
    public final boolean OooOo0O;
    public final wu1 OooOo0o;
    public final xj0 OooOoO;
    public Object OooOoO0;

    public sl(Context context, xj0 xj0Var, boolean z) {
        TypedValue typedValue = new TypedValue();
        super(context, context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog);
        this.OooOOO0 = true;
        this.OooOOO = true;
        this.OooOOoo = new b9(this);
        OooO0OO().OooO0oo(1);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.OooOOo0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.OooOOo0 = typedArrayObtainStyledAttributes2.getBoolean(0, false);
        typedArrayObtainStyledAttributes2.recycle();
        this.OooOoO = xj0Var;
        wu1 wu1Var = (wu1) xj0Var.OooOo0O;
        this.OooOo0o = wu1Var;
        this.OooOo0 = new gy0(((String) wu1Var.OooO0o.OooO0o0) + sn2.OooO00o("CQ==\n", "JC8IWGTnk0Q=\n") + (wu1Var.OooOOO + 1));
        this.OooOo0O = z;
        this.OooOo00 = (m1) j1.OooO00o(getContext());
    }

    public final void OooO(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public final void OooO0oO(int i) {
        if (i == -1) {
            gy0 gy0Var = this.OooOo0;
            if (TextUtils.isEmpty((CharSequence) gy0Var.OooO0o0)) {
                e2.OooO0Oo(sn2.OooO00o("TQxzrh/T3KVrCnU=\n", "GWUHwnrzmdc=\n"));
                return;
            }
            String str = (String) gy0Var.OooO0o0;
            PackageInfo packageInfo = this.OooOo0o.OooOO0o;
            if (packageInfo == null) {
                return;
            } else {
                h1.OooO0Oo.execute(new l1(this, packageInfo, str, 2));
            }
        }
        dismiss();
    }

    public final void OooO0oo() throws Resources.NotFoundException {
        if (this.OooOO0 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.OooOO0 = frameLayout;
            this.OooOO0O = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.OooOO0.findViewById(R.id.design_bottom_sheet);
            this.OooOO0o = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorOooOoo0 = BottomSheetBehavior.OooOoo0(frameLayout2);
            this.OooO = bottomSheetBehaviorOooOoo0;
            ArrayList arrayList = bottomSheetBehaviorOooOoo0.OoooOo0;
            b9 b9Var = this.OooOOoo;
            if (!arrayList.contains(b9Var)) {
                arrayList.add(b9Var);
            }
            this.OooO.Oooo00o(this.OooOOO0);
            this.OooOOo = new hx2(this.OooO, this.OooOO0o);
        }
    }

    public final void OooOO0(Object obj) {
        this.OooOoO0 = obj;
        o53.OooO00o(this.OooOo.OooOOo0, obj);
    }

    public final FrameLayout OooOO0O(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        OooO0oo();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.OooOO0.findViewById(R.id.coordinator);
        int i2 = 0;
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.OooOOo0) {
            FrameLayout frameLayout = this.OooOO0;
            ay1 ay1Var = new ay1(this, 11);
            WeakHashMap weakHashMap = nt1.OooO00o;
            ft1.OooOO0O(frameLayout, ay1Var);
        }
        this.OooOO0o.removeAllViews();
        FrameLayout frameLayout2 = this.OooOO0o;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new a9(this, i2));
        nt1.OooOOO0(this.OooOO0o, new b7(this, 1));
        this.OooOO0o.setOnTouchListener(new d7(1));
        return this.OooOO0;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.OooO == null) {
            OooO0oo();
        }
        super.cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.OooOOo0 && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.OooOO0;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.OooOO0O;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            h63.OooO00o(window, !z);
            c9 c9Var = this.OooOOOo;
            if (c9Var != null) {
                c9Var.OooO0o0(window);
            }
        }
        hx2 hx2Var = this.OooOOo;
        if (hx2Var == null) {
            return;
        }
        View view = (View) hx2Var.OooO0oO;
        boolean z2 = this.OooOOO0;
        eq0 eq0Var = (eq0) hx2Var.OooO0o0;
        if (z2) {
            if (eq0Var != null) {
                eq0Var.OooO0O0((dq0) hx2Var.OooO0o, view, false);
            }
        } else if (eq0Var != null) {
            eq0Var.OooO0OO(view);
        }
    }

    @Override // com.cmaster.cloner.m, com.cmaster.cloner.gg, android.app.Dialog
    public final void onCreate(Bundle bundle) throws Throwable {
        OooO(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = i2.OooOo;
        i2 i2Var = (i2) en.OooO00o(layoutInflater, R.layout.app_shortcut_custom, null);
        this.OooOo = i2Var;
        setContentView(i2Var.OooO0oo);
        this.OooOo.OooOo0O.setOnClickListener(new a9(this, 1));
        this.OooOo.OooOOoo.setOnClickListener(new a9(this, 2));
        this.OooOo.OooOo00.setOnClickListener(new a9(this, 3));
        this.OooOo.OooOOo.setOnClickListener(new a9(this, 4));
        this.OooOo.OooOo0.setOnClickListener(new a9(this, 5));
        i2 i2Var2 = this.OooOo;
        gy0 gy0Var = this.OooOo0;
        j2 j2Var = (j2) i2Var2;
        j2Var.OooOO0O(0, gy0Var);
        j2Var.OooOo0o = gy0Var;
        synchronized (j2Var) {
            j2Var.OooOoOO |= 1;
        }
        j2Var.OooO0OO(1);
        j2Var.OooO();
        OooOO0(this.OooOo0o.OooO0Oo());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        eq0 eq0Var;
        c9 c9Var = this.OooOOOo;
        if (c9Var != null) {
            c9Var.OooO0o0(null);
        }
        hx2 hx2Var = this.OooOOo;
        if (hx2Var == null || (eq0Var = (eq0) hx2Var.OooO0o0) == null) {
            return;
        }
        eq0Var.OooO0OO((View) hx2Var.OooO0oO);
    }

    @Override // com.cmaster.cloner.gg, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.OooO;
        if (bottomSheetBehavior == null || bottomSheetBehavior.Oooo0oO != 5) {
            return;
        }
        bottomSheetBehavior.Oooo0O0(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) throws Resources.NotFoundException {
        hx2 hx2Var;
        super.setCancelable(z);
        if (this.OooOOO0 != z) {
            this.OooOOO0 = z;
            BottomSheetBehavior bottomSheetBehavior = this.OooO;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.Oooo00o(z);
            }
            if (getWindow() == null || (hx2Var = this.OooOOo) == null) {
                return;
            }
            View view = (View) hx2Var.OooO0oO;
            boolean z2 = this.OooOOO0;
            eq0 eq0Var = (eq0) hx2Var.OooO0o0;
            if (z2) {
                if (eq0Var != null) {
                    eq0Var.OooO0O0((dq0) hx2Var.OooO0o, view, false);
                }
            } else if (eq0Var != null) {
                eq0Var.OooO0OO(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.OooOOO0) {
            this.OooOOO0 = true;
        }
        this.OooOOO = z;
        this.OooOOOO = true;
    }

    @Override // com.cmaster.cloner.m, com.cmaster.cloner.gg, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(OooOO0O(view, 0, null));
    }

    @Override // com.cmaster.cloner.m, com.cmaster.cloner.gg, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(OooOO0O(null, i, null));
    }

    @Override // com.cmaster.cloner.m, com.cmaster.cloner.gg, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(OooOO0O(view, 0, layoutParams));
    }
}
