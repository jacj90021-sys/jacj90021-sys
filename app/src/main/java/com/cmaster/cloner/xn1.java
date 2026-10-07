package com.cmaster.cloner;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xn1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static xn1 OooOOO;
    public static xn1 OooOOOO;
    public int OooO;
    public final View OooO0Oo;
    public final int OooO0o;
    public final CharSequence OooO0o0;
    public final wn1 OooO0oO;
    public final wn1 OooO0oo;
    public int OooOO0;
    public yn1 OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO0;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.cmaster.cloner.wn1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.cmaster.cloner.wn1] */
    public xn1(View view, CharSequence charSequence) {
        final int i = 0;
        this.OooO0oO = new Runnable(this) { // from class: com.cmaster.cloner.wn1
            public final /* synthetic */ xn1 OooO0o0;

            {
                this.OooO0o0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                int i2 = i;
                xn1 xn1Var = this.OooO0o0;
                switch (i2) {
                    case 0:
                        xn1Var.OooO0OO(false);
                        break;
                    default:
                        xn1Var.OooO00o();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.OooO0oo = new Runnable(this) { // from class: com.cmaster.cloner.wn1
            public final /* synthetic */ xn1 OooO0o0;

            {
                this.OooO0o0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                int i22 = i2;
                xn1 xn1Var = this.OooO0o0;
                switch (i22) {
                    case 0:
                        xn1Var.OooO0OO(false);
                        break;
                    default:
                        xn1Var.OooO00o();
                        break;
                }
            }
        };
        this.OooO0Oo = view;
        this.OooO0o0 = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = ot1.OooO00o;
        this.OooO0o = Build.VERSION.SDK_INT >= 28 ? ep.OooOO0(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.OooOOO0 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void OooO0O0(xn1 xn1Var) {
        xn1 xn1Var2 = OooOOO;
        if (xn1Var2 != null) {
            xn1Var2.OooO0Oo.removeCallbacks(xn1Var2.OooO0oO);
        }
        OooOOO = xn1Var;
        if (xn1Var != null) {
            xn1Var.OooO0Oo.postDelayed(xn1Var.OooO0oO, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void OooO00o() {
        xn1 xn1Var = OooOOOO;
        View view = this.OooO0Oo;
        if (xn1Var == this) {
            OooOOOO = null;
            yn1 yn1Var = this.OooOO0O;
            if (yn1Var != null) {
                View view2 = (View) yn1Var.OooO0o;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) yn1Var.OooO0o0).getSystemService("window")).removeView(view2);
                }
                this.OooOO0O = null;
                this.OooOOO0 = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (OooOOO == this) {
            OooO0O0(null);
        }
        view.removeCallbacks(this.OooO0oo);
    }

    public final void OooO0OO(boolean z) throws Resources.NotFoundException {
        int height;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.OooO0Oo;
        if (view.isAttachedToWindow()) {
            OooO0O0(null);
            xn1 xn1Var = OooOOOO;
            if (xn1Var != null) {
                xn1Var.OooO00o();
            }
            OooOOOO = this;
            this.OooOO0o = z;
            Context context = view.getContext();
            yn1 yn1Var = new yn1();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            yn1Var.OooO0oO = layoutParams;
            yn1Var.OooO0oo = new Rect();
            yn1Var.OooO = new int[2];
            yn1Var.OooOO0 = new int[2];
            yn1Var.OooO0o0 = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            yn1Var.OooO0o = viewInflate;
            yn1Var.OooO0Oo = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(yn1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) yn1Var.OooO0o;
            Context context2 = (Context) yn1Var.OooO0o0;
            this.OooOO0O = yn1Var;
            int width = this.OooO;
            int i5 = this.OooOO0;
            boolean z3 = this.OooOO0o;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) yn1Var.OooO0oO;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) yn1Var.OooO0Oo).setText(this.OooO0o0);
            int[] iArr = (int[]) yn1Var.OooOO0;
            int[] iArr2 = (int[]) yn1Var.OooO;
            Rect rect = (Rect) yn1Var.OooO0oo;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i5 + dimensionPixelOffset2;
                i = i5 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i6 = width;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i4 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = i;
                    z2 = z3;
                    i3 = 0;
                    i4 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i4 = 1;
                    i2 = i;
                    z2 = z3;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i7 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i7;
                iArr2[i4] = iArr2[i4] - iArr[i4];
                layoutParams2.x = (i7 + i6) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i8 = iArr2[i4];
                int i9 = ((i8 + i2) - dimensionPixelOffset3) - measuredHeight;
                int i10 = i8 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i9 >= 0) {
                        layoutParams2.y = i9;
                    } else {
                        layoutParams2.y = i10;
                    }
                } else if (measuredHeight + i10 <= rect.height()) {
                    layoutParams2.y = i10;
                } else {
                    layoutParams2.y = i9;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.OooOO0o) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = nt1.OooO00o;
                if ((view.getWindowSystemUiVisibility() & 1) == i4) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            wn1 wn1Var = this.OooO0oo;
            view.removeCallbacks(wn1Var);
            view.postDelayed(wn1Var, j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            com.cmaster.cloner.yn1 r4 = r3.OooOO0O
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.OooOO0o
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.OooO0Oo
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.OooOOO0 = r4
            r3.OooO00o()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            com.cmaster.cloner.yn1 r4 = r3.OooOO0O
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.OooOOO0
            if (r1 != 0) goto L66
            int r1 = r3.OooO
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.OooO0o
            if (r1 > r2) goto L66
            int r1 = r3.OooOO0
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.OooO = r4
            r3.OooOO0 = r5
            r3.OooOOO0 = r0
            OooO0O0(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.xn1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.OooO = view.getWidth() / 2;
        this.OooOO0 = view.getHeight() / 2;
        OooO0OO(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        OooO00o();
    }
}
