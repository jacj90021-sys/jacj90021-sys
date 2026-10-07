package com.google.android.material.sidesheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.OooOO0;
import com.cmaster.cloner.R;
import com.cmaster.cloner.a80;
import com.cmaster.cloner.ag1;
import com.cmaster.cloner.dq0;
import com.cmaster.cloner.ft1;
import com.cmaster.cloner.j5;
import com.cmaster.cloner.k61;
import com.cmaster.cloner.lj;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.o00;
import com.cmaster.cloner.o000;
import com.cmaster.cloner.oO0oO000;
import com.cmaster.cloner.oOO00O;
import com.cmaster.cloner.oj;
import com.cmaster.cloner.ol0;
import com.cmaster.cloner.px0;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.rj;
import com.cmaster.cloner.st1;
import com.cmaster.cloner.w8;
import com.cmaster.cloner.wq0;
import com.cmaster.cloner.wv2;
import com.cmaster.cloner.xq0;
import com.cmaster.cloner.yf1;
import com.cmaster.cloner.yq0;
import com.cmaster.cloner.yy;
import com.cmaster.cloner.z8;
import com.cmaster.cloner.zg1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends lj implements dq0 {
    public st1 OooO;
    public ol0 OooO00o;
    public final wq0 OooO0O0;
    public final ColorStateList OooO0OO;
    public final ag1 OooO0Oo;
    public final float OooO0o;
    public final z8 OooO0o0;
    public final boolean OooO0oO;
    public int OooO0oo;
    public boolean OooOO0;
    public final float OooOO0O;
    public int OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public int OooOOOO;
    public WeakReference OooOOOo;
    public final int OooOOo;
    public WeakReference OooOOo0;
    public VelocityTracker OooOOoo;
    public int OooOo0;
    public yq0 OooOo00;
    public final LinkedHashSet OooOo0O;
    public final w8 OooOo0o;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.OooO0o0 = new z8(this);
        this.OooO0oO = true;
        this.OooO0oo = 5;
        this.OooOO0O = 0.1f;
        this.OooOOo = -1;
        this.OooOo0O = new LinkedHashSet();
        this.OooOo0o = new w8(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k61.OooOo0);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.OooO0OO = wv2.OooO00o(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.OooO0Oo = ag1.OooO0O0(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).OooO00o();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.OooOOo = resourceId;
            WeakReference weakReference = this.OooOOo0;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.OooOOo0 = null;
            WeakReference weakReference2 = this.OooOOOo;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        ag1 ag1Var = this.OooO0Oo;
        if (ag1Var != null) {
            wq0 wq0Var = new wq0(ag1Var);
            this.OooO0O0 = wq0Var;
            wq0Var.OooO(context);
            ColorStateList colorStateList = this.OooO0OO;
            if (colorStateList != null) {
                this.OooO0O0.OooOO0o(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.OooO0O0.setTint(typedValue.data);
            }
        }
        this.OooO0o = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.OooO0oO = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // com.cmaster.cloner.dq0
    public final void OooO00o(j5 j5Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        yq0 yq0Var = this.OooOo00;
        if (yq0Var == null) {
            return;
        }
        ol0 ol0Var = this.OooO00o;
        int i = (ol0Var == null || ol0Var.OooO0Oo() == 0) ? 5 : 3;
        if (yq0Var.OooO0o == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        j5 j5Var2 = yq0Var.OooO0o;
        yq0Var.OooO0o = j5Var;
        if (j5Var2 != null) {
            yq0Var.OooO00o(j5Var.OooO0OO, j5Var.OooO0Oo == 0, i);
        }
        WeakReference weakReference = this.OooOOOo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.OooOOOo.get();
        WeakReference weakReference2 = this.OooOOo0;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.OooO00o.OooO0o0(marginLayoutParams, (int) ((view.getScaleX() * this.OooOO0o) + this.OooOOOO));
        view2.requestLayout();
    }

    @Override // com.cmaster.cloner.dq0
    public final void OooO0O0(j5 j5Var) {
        yq0 yq0Var = this.OooOo00;
        if (yq0Var == null) {
            return;
        }
        yq0Var.OooO0o = j5Var;
    }

    @Override // com.cmaster.cloner.dq0
    public final void OooO0OO() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i2;
        yq0 yq0Var = this.OooOo00;
        if (yq0Var == null) {
            return;
        }
        j5 j5Var = yq0Var.OooO0o;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        yq0Var.OooO0o = null;
        int i3 = 5;
        if (j5Var == null || Build.VERSION.SDK_INT < 34) {
            OooOo0o(5);
            return;
        }
        ol0 ol0Var = this.OooO00o;
        if (ol0Var != null && ol0Var.OooO0Oo() != 0) {
            i3 = 3;
        }
        oOO00O ooo00o = new oOO00O(this, 10);
        WeakReference weakReference = this.OooOOo0;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            switch (this.OooO00o.OooO00o) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.cmaster.cloner.yg1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.OooO00o.OooO00o.OooO0o0(marginLayoutParams, oO0oO000.OooO0OO(i2, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        View view2 = yq0Var.OooO0O0;
        boolean z = j5Var.OooO0Oo == 0;
        boolean z2 = (Gravity.getAbsoluteGravity(i3, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new yy(1));
        objectAnimatorOfFloat.setDuration(oO0oO000.OooO0OO(yq0Var.OooO0OO, yq0Var.OooO0Oo, j5Var.OooO0OO));
        objectAnimatorOfFloat.addListener(new xq0(yq0Var, z, i3));
        objectAnimatorOfFloat.addListener(ooo00o);
        objectAnimatorOfFloat.start();
    }

    @Override // com.cmaster.cloner.dq0
    public final void OooO0Oo() {
        yq0 yq0Var = this.OooOo00;
        if (yq0Var == null) {
            return;
        }
        View view = yq0Var.OooO0O0;
        if (yq0Var.OooO0o == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        j5 j5Var = yq0Var.OooO0o;
        yq0Var.OooO0o = null;
        if (j5Var == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(yq0Var.OooO0o0);
        animatorSet.start();
    }

    @Override // com.cmaster.cloner.lj
    public final void OooO0oO(oj ojVar) {
        this.OooOOOo = null;
        this.OooO = null;
        this.OooOo00 = null;
    }

    @Override // com.cmaster.cloner.lj
    public final void OooOO0() {
        this.OooOOOo = null;
        this.OooO = null;
        this.OooOo00 = null;
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOO0O(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        st1 st1Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && nt1.OooO0o0(view) == null) || !this.OooO0oO) {
            this.OooOO0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.OooOOoo) != null) {
            velocityTracker.recycle();
            this.OooOOoo = null;
        }
        if (this.OooOOoo == null) {
            this.OooOOoo = VelocityTracker.obtain();
        }
        this.OooOOoo.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.OooOo0 = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.OooOO0) {
            this.OooOO0 = false;
            return false;
        }
        return (this.OooOO0 || (st1Var = this.OooO) == null || !st1Var.OooOOOo(motionEvent)) ? false : true;
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOO0o(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int left;
        int i2;
        int iOooO0OO;
        int i3;
        View viewFindViewById;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.OooOOOo;
        wq0 wq0Var = this.OooO0O0;
        if (weakReference == null) {
            this.OooOOOo = new WeakReference(view);
            this.OooOo00 = new yq0(view);
            if (wq0Var != null) {
                view.setBackground(wq0Var);
                float elevation = this.OooO0o;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                wq0Var.OooOO0O(elevation);
            } else {
                ColorStateList colorStateList = this.OooO0OO;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = nt1.OooO00o;
                    ft1.OooO0oo(view, colorStateList);
                }
            }
            int i4 = this.OooO0oo == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            OooOoOO();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (nt1.OooO0o0(view) == null) {
                nt1.OooOOO(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((oj) view.getLayoutParams()).OooO0OO, i) == 3 ? 1 : 0;
        ol0 ol0Var = this.OooO00o;
        if (ol0Var == null || ol0Var.OooO0Oo() != i5) {
            oj ojVar = null;
            ag1 ag1Var = this.OooO0Oo;
            if (i5 == 0) {
                this.OooO00o = new ol0(this, 1);
                if (ag1Var != null) {
                    WeakReference weakReference2 = this.OooOOOo;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof oj)) {
                        ojVar = (oj) view3.getLayoutParams();
                    }
                    if (ojVar == null || ((ViewGroup.MarginLayoutParams) ojVar).rightMargin <= 0) {
                        yf1 yf1VarOooO0o = ag1Var.OooO0o();
                        yf1VarOooO0o.OooO0o = new OooOO0(0.0f);
                        yf1VarOooO0o.OooO0oO = new OooOO0(0.0f);
                        ag1 ag1VarOooO00o = yf1VarOooO0o.OooO00o();
                        if (wq0Var != null) {
                            wq0Var.setShapeAppearanceModel(ag1VarOooO00o);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    ra.OooOOO(rj.OooO00o(i5, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.OooO00o = new ol0(this, 0);
                if (ag1Var != null) {
                    WeakReference weakReference3 = this.OooOOOo;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof oj)) {
                        ojVar = (oj) view2.getLayoutParams();
                    }
                    if (ojVar == null || ((ViewGroup.MarginLayoutParams) ojVar).leftMargin <= 0) {
                        yf1 yf1VarOooO0o2 = ag1Var.OooO0o();
                        yf1VarOooO0o2.OooO0o0 = new OooOO0(0.0f);
                        yf1VarOooO0o2.OooO0oo = new OooOO0(0.0f);
                        ag1 ag1VarOooO00o2 = yf1VarOooO0o2.OooO00o();
                        if (wq0Var != null) {
                            wq0Var.setShapeAppearanceModel(ag1VarOooO00o2);
                        }
                    }
                }
            }
        }
        if (this.OooO == null) {
            this.OooO = new st1(coordinatorLayout.getContext(), coordinatorLayout, this.OooOo0o);
        }
        int iOooO0OO2 = this.OooO00o.OooO0OO(view);
        coordinatorLayout.OooOOo(view, i);
        this.OooOOO0 = coordinatorLayout.getWidth();
        switch (this.OooO00o.OooO00o) {
            case 0:
                left = coordinatorLayout.getLeft();
                break;
            default:
                left = coordinatorLayout.getRight();
                break;
        }
        this.OooOOO = left;
        this.OooOO0o = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.OooO00o.OooO00o) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i2 = 0;
        }
        this.OooOOOO = i2;
        int i6 = this.OooO0oo;
        if (i6 == 1 || i6 == 2) {
            iOooO0OO = iOooO0OO2 - this.OooO00o.OooO0OO(view);
        } else if (i6 == 3) {
            iOooO0OO = 0;
        } else {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.OooO0oo);
            }
            iOooO0OO = this.OooO00o.OooO0O0();
        }
        WeakHashMap weakHashMap2 = nt1.OooO00o;
        view.offsetLeftAndRight(iOooO0OO);
        if (this.OooOOo0 == null && (i3 = this.OooOOo) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.OooOOo0 = new WeakReference(viewFindViewById);
        }
        Iterator it = this.OooOo0O.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                ra.OooOO0o();
                return false;
            }
        }
        return true;
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOOO0(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // com.cmaster.cloner.lj
    public final void OooOOo(View view, Parcelable parcelable) {
        int i = ((zg1) parcelable).OooO0o;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.OooO0oo = i;
    }

    @Override // com.cmaster.cloner.lj
    public final Parcelable OooOOoo(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new zg1(this);
    }

    public final void OooOo(int i) {
        View view;
        if (this.OooO0oo == i) {
            return;
        }
        this.OooO0oo = i;
        WeakReference weakReference = this.OooOOOo;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.OooO0oo == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.OooOo0O.iterator();
        if (it.hasNext()) {
            throw px0.OooOO0o(it);
        }
        OooOoOO();
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOo0O(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.OooO0oo == 1 && actionMasked == 0) {
            return true;
        }
        if (OooOoO0()) {
            this.OooO.OooOO0(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.OooOOoo) != null) {
            velocityTracker.recycle();
            this.OooOOoo = null;
        }
        if (this.OooOOoo == null) {
            this.OooOOoo = VelocityTracker.obtain();
        }
        this.OooOOoo.addMovement(motionEvent);
        if (OooOoO0() && actionMasked == 2 && !this.OooOO0 && OooOoO0()) {
            float fAbs = Math.abs(this.OooOo0 - motionEvent.getX());
            st1 st1Var = this.OooO;
            if (fAbs > st1Var.OooO0O0) {
                st1Var.OooO0O0(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.OooOO0;
    }

    public final void OooOo0o(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(rj.OooO0oO(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.OooOOOo;
        if (weakReference == null || weakReference.get() == null) {
            OooOo(i);
            return;
        }
        View view = (View) this.OooOOOo.get();
        a80 a80Var = new a80(i, 2, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(a80Var);
        } else {
            a80Var.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1.OooOOOO(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        OooOo(2);
        r2.OooO0o0.OooO0O0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOoO(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L17
            r0 = 5
            if (r4 != r0) goto Ld
            com.cmaster.cloner.ol0 r0 = r2.OooO00o
            int r0 = r0.OooO0O0()
            goto L1d
        Ld:
            java.lang.String r2 = "Invalid state to get outer edge offset: "
            java.lang.String r2 = com.cmaster.cloner.px0.OooOOO(r4, r2)
            com.cmaster.cloner.ra.OooOOO(r2)
            return
        L17:
            com.cmaster.cloner.ol0 r0 = r2.OooO00o
            int r0 = r0.OooO00o()
        L1d:
            com.cmaster.cloner.st1 r1 = r2.OooO
            if (r1 == 0) goto L55
            if (r5 == 0) goto L2e
            int r3 = r3.getTop()
            boolean r3 = r1.OooOOOO(r0, r3)
            if (r3 == 0) goto L55
            goto L4b
        L2e:
            int r5 = r3.getTop()
            r1.OooOOo = r3
            r3 = -1
            r1.OooO0OO = r3
            r3 = 0
            boolean r3 = r1.OooO0oo(r0, r5, r3, r3)
            if (r3 != 0) goto L49
            int r5 = r1.OooO00o
            if (r5 != 0) goto L49
            android.view.View r5 = r1.OooOOo
            if (r5 == 0) goto L49
            r5 = 0
            r1.OooOOo = r5
        L49:
            if (r3 == 0) goto L55
        L4b:
            r3 = 2
            r2.OooOo(r3)
            com.cmaster.cloner.z8 r2 = r2.OooO0o0
            r2.OooO0O0(r4)
            return
        L55:
            r2.OooOo(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.OooOoO(android.view.View, int, boolean):void");
    }

    public final boolean OooOoO0() {
        if (this.OooO != null) {
            return this.OooO0oO || this.OooO0oo == 1;
        }
        return false;
    }

    public final void OooOoOO() {
        View view;
        WeakReference weakReference = this.OooOOOo;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        nt1.OooOO0(view, 262144);
        nt1.OooO0oo(view, 0);
        nt1.OooOO0(view, 1048576);
        nt1.OooO0oo(view, 0);
        final int i = 5;
        if (this.OooO0oo != 5) {
            nt1.OooOO0O(view, o000.OooO, new o00() { // from class: com.cmaster.cloner.xg1
                @Override // com.cmaster.cloner.o00
                public final boolean OooO00o(View view2) {
                    this.OooO0Oo.OooOo0o(i);
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.OooO0oo != 3) {
            nt1.OooOO0O(view, o000.OooO0oO, new o00() { // from class: com.cmaster.cloner.xg1
                @Override // com.cmaster.cloner.o00
                public final boolean OooO00o(View view2) {
                    this.OooO0Oo.OooOo0o(i2);
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior() {
        this.OooO0o0 = new z8(this);
        this.OooO0oO = true;
        this.OooO0oo = 5;
        this.OooOO0O = 0.1f;
        this.OooOOo = -1;
        this.OooOo0O = new LinkedHashSet();
        this.OooOo0o = new w8(this, 1);
    }
}
