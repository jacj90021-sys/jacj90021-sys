package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.OooO;
import com.cmaster.cloner.R;
import com.cmaster.cloner.ay1;
import com.cmaster.cloner.c92;
import com.cmaster.cloner.cw2;
import com.cmaster.cloner.e81;
import com.cmaster.cloner.ed;
import com.cmaster.cloner.ft1;
import com.cmaster.cloner.k61;
import com.cmaster.cloner.k70;
import com.cmaster.cloner.kj;
import com.cmaster.cloner.lj;
import com.cmaster.cloner.m70;
import com.cmaster.cloner.mq2;
import com.cmaster.cloner.mw0;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.oO0oO000;
import com.cmaster.cloner.oOO0Oo00;
import com.cmaster.cloner.oOO0OoO0;
import com.cmaster.cloner.oj;
import com.cmaster.cloner.ow2;
import com.cmaster.cloner.qz1;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.s62;
import com.cmaster.cloner.sv2;
import com.cmaster.cloner.t82;
import com.cmaster.cloner.wq0;
import com.cmaster.cloner.wv2;
import com.cmaster.cloner.ym2;
import com.cmaster.cloner.yv2;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements kj {
    public static final /* synthetic */ int OooOooO = 0;
    public int OooO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public boolean OooO0oo;
    public qz1 OooOO0;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public ColorStateList OooOOOO;
    public int OooOOOo;
    public ValueAnimator OooOOo;
    public WeakReference OooOOo0;
    public ValueAnimator.AnimatorUpdateListener OooOOoo;
    public int[] OooOo;
    public final LinkedHashSet OooOo0;
    public final ArrayList OooOo00;
    public final long OooOo0O;
    public final TimeInterpolator OooOo0o;
    public Drawable OooOoO;
    public int OooOoO0;
    public Integer OooOoOO;
    public Behavior OooOoo;
    public final float OooOoo0;

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(s62.OooO00o(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.OooO0o0 = -1;
        this.OooO0o = -1;
        this.OooO0oO = -1;
        this.OooO = 0;
        this.OooOo00 = new ArrayList();
        this.OooOo0 = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayOooO0Oo = t82.OooO0Oo(context3, attributeSet, c92.OooO00o, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayOooO0Oo.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayOooO0Oo.getResourceId(0, 0)));
            }
            typedArrayOooO0Oo.recycle();
            TypedArray typedArrayOooO0Oo2 = t82.OooO0Oo(context2, attributeSet, k61.OooO00o, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.OooOOOO = wv2.OooO00o(context2, typedArrayOooO0Oo2, 6);
            this.OooOo0O = ow2.OooO0OO(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.OooOo0o = ow2.OooO0Oo(context2, R.attr.motionEasingStandardInterpolator, oO0oO000.OooO00o);
            if (typedArrayOooO0Oo2.hasValue(4)) {
                OooO0Oo(typedArrayOooO0Oo2.getBoolean(4, false), false, false);
            }
            if (typedArrayOooO0Oo2.hasValue(3)) {
                c92.OooO00o(this, typedArrayOooO0Oo2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayOooO0Oo2.getDrawable(0));
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayOooO0Oo2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayOooO0Oo2.getBoolean(2, false));
                }
                if (typedArrayOooO0Oo2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayOooO0Oo2.getBoolean(1, false));
                }
            }
            this.OooOoo0 = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.OooOOO = typedArrayOooO0Oo2.getBoolean(5, false);
            this.OooOOOo = typedArrayOooO0Oo2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayOooO0Oo2.getDrawable(8));
            typedArrayOooO0Oo2.recycle();
            ay1 ay1Var = new ay1(this, 5);
            WeakHashMap weakHashMap = nt1.OooO00o;
            ft1.OooOO0O(this, ay1Var);
        } catch (Throwable th) {
            typedArrayOooO0Oo.recycle();
            throw th;
        }
    }

    public static oOO0OoO0 OooO0O0(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            oOO0OoO0 ooo0ooo0 = new oOO0OoO0((LinearLayout.LayoutParams) layoutParams);
            ooo0ooo0.OooO00o = 1;
            return ooo0ooo0;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            oOO0OoO0 ooo0ooo02 = new oOO0OoO0((ViewGroup.MarginLayoutParams) layoutParams);
            ooo0ooo02.OooO00o = 1;
            return ooo0ooo02;
        }
        oOO0OoO0 ooo0ooo03 = new oOO0OoO0(layoutParams);
        ooo0ooo03.OooO00o = 1;
        return ooo0ooo03;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final oOO0OoO0 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        oOO0OoO0 ooo0ooo0 = new oOO0OoO0(context, attributeSet);
        ooo0ooo0.OooO00o = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k61.OooO0O0);
        ooo0ooo0.OooO00o = typedArrayObtainStyledAttributes.getInt(1, 0);
        ooo0ooo0.OooO0O0 = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new e81(4);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            ooo0ooo0.OooO0OO = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return ooo0ooo0;
    }

    public final void OooO0OO() {
        Behavior behavior = this.OooOoo;
        OooO0o oooO0oOooo000 = (behavior == null || this.OooO0o0 == -1 || this.OooO != 0) ? null : behavior.Oooo000(OooO.OooO0o0, this);
        this.OooO0o0 = -1;
        this.OooO0o = -1;
        this.OooO0oO = -1;
        if (oooO0oOooo000 != null) {
            Behavior behavior2 = this.OooOoo;
            if (behavior2.OooOOO0 != null) {
                return;
            }
            behavior2.OooOOO0 = oooO0oOooo000;
        }
    }

    public final void OooO0Oo(boolean z, boolean z2, boolean z3) {
        this.OooO = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public final boolean OooO0o(View view) {
        int i;
        if (this.OooOOo0 == null && (i = this.OooOOOo) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.OooOOOo);
            }
            if (viewFindViewById != null) {
                this.OooOOo0 = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.OooOOo0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final boolean OooO0o0(boolean z) {
        if (this.OooOO0O || this.OooOOO0 == z) {
            return false;
        }
        this.OooOOO0 = z;
        refreshDrawableState();
        if (!(getBackground() instanceof wq0)) {
            return true;
        }
        if (this.OooOOOO != null) {
            OooO0oO(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.OooOOO) {
            return true;
        }
        float f = this.OooOoo0;
        OooO0oO(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    public final void OooO0oO(float f, float f2) {
        ValueAnimator valueAnimator = this.OooOOo;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.OooOOo = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.OooOo0O);
        this.OooOOo.setInterpolator(this.OooOo0o);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.OooOOoo;
        if (animatorUpdateListener != null) {
            this.OooOOo.addUpdateListener(animatorUpdateListener);
        }
        this.OooOOo.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof oOO0OoO0;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.OooOoO == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.OooO0Oo);
        this.OooOoO.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.OooOoO;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }


    @Override // com.cmaster.cloner.kj
    public lj getBehavior() {
        Behavior behavior = new Behavior();
        this.OooOoo = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.OooO0o;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                oOO0OoO0 ooo0ooo0 = (oOO0OoO0) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = ooo0ooo0.OooO00o;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) ooo0ooo0).topMargin + ((LinearLayout.LayoutParams) ooo0ooo0).bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i3 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i4 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.OooO0o = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.OooO0oO;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                oOO0OoO0 ooo0ooo0 = (oOO0OoO0) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) ooo0ooo0).topMargin + ((LinearLayout.LayoutParams) ooo0ooo0).bottomMargin + childAt.getMeasuredHeight();
                int i3 = ooo0ooo0.OooO00o;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.OooO0oO = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.OooOOOo;
    }

    public wq0 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof wq0) {
            return (wq0) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight * 2) + topInset;
            return i < getHeight() ? i : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = (minimumHeight2 * 2) + topInset;
        return i2 < getHeight() ? i2 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.OooO;
    }

    public Drawable getStatusBarForeground() {
        return this.OooOoO;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        qz1 qz1Var = this.OooOO0;
        if (qz1Var != null) {
            return qz1Var.OooO0Oo();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.OooO0o0;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                oOO0OoO0 ooo0ooo0 = (oOO0OoO0) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = ooo0ooo0.OooO00o;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) ooo0ooo0).topMargin + ((LinearLayout.LayoutParams) ooo0ooo0).bottomMargin + minimumHeight;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    topInset -= getTopInset();
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.OooO0o0 = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof wq0) {
            yv2.OooO0O0(this, (wq0) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.OooOo == null) {
            this.OooOo = new int[4];
        }
        int[] iArr = this.OooOo;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.OooOO0o;
        int i2 = R.attr.state_liftable;
        if (!z) {
            i2 = -R.attr.state_liftable;
        }
        iArr[0] = i2;
        int i3 = R.attr.state_lifted;
        if (!z || !this.OooOOO0) {
            i3 = -R.attr.state_lifted;
        }
        iArr[1] = i3;
        int i4 = R.attr.state_collapsible;
        if (!z) {
            i4 = -R.attr.state_collapsible;
        }
        iArr[2] = i4;
        int i5 = R.attr.state_collapsed;
        if (!z || !this.OooOOO0) {
            i5 = -R.attr.state_collapsed;
        }
        iArr[3] = i5;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.OooOOo0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.OooOOo0 = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = nt1.OooO00o;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        OooO0OO();
        this.OooO0oo = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((oOO0OoO0) getChildAt(i5).getLayoutParams()).OooO0OO != null) {
                this.OooO0oo = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.OooOoO;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.OooOO0O) {
            return;
        }
        if (!this.OooOOO) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((oOO0OoO0) getChildAt(i6).getLayoutParams()).OooO00o;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.OooOO0o != z2) {
            this.OooOO0o = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = cw2.OooO0O0(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        OooO0OO();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final wq0 wq0Var;
        ColorStateList colorStateList;
        Context context = getContext();
        final Integer numValueOf = null;
        if (drawable instanceof wq0) {
            wq0Var = (wq0) drawable;
        } else {
            ColorStateList colorStateListOooO00o = mq2.OooO00o(drawable);
            if (colorStateListOooO00o == null) {
                wq0Var = null;
            } else {
                wq0 wq0Var2 = new wq0();
                wq0Var2.OooOO0o(colorStateListOooO00o);
                wq0Var = wq0Var2;
            }
        }
        if (wq0Var != null && (colorStateList = wq0Var.OooO0o0.OooO0Oo) != null) {
            this.OooOoO0 = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.OooOOOO;
            if (colorStateList2 != null) {
                Context context2 = getContext();
                TypedValue typedValueOooO00o = sv2.OooO00o(context2, R.attr.colorSurface);
                if (typedValueOooO00o != null) {
                    int i = typedValueOooO00o.resourceId;
                    numValueOf = Integer.valueOf(i != 0 ? context2.getColor(i) : typedValueOooO00o.data);
                }
                this.OooOOoo = new ValueAnimator.AnimatorUpdateListener() { // from class: com.cmaster.cloner.oOO0OOO
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        AppBarLayout appBarLayout = this.OooO00o;
                        LinkedHashSet linkedHashSet = appBarLayout.OooOo0;
                        ArrayList arrayList = appBarLayout.OooOo00;
                        int iOooO0o0 = uv2.OooO0o0(appBarLayout.OooOoO0, colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iOooO0o0);
                        wq0 wq0Var3 = wq0Var;
                        wq0Var3.OooOO0o(colorStateListValueOf);
                        if (appBarLayout.OooOoO != null && (num = appBarLayout.OooOoOO) != null && num.equals(numValueOf)) {
                            appBarLayout.OooOoO.setTint(iOooO0o0);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                if (obj != null) {
                                    ra.OooOO0o();
                                    return;
                                } else if (wq0Var3.OooO0o0.OooO0Oo != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it = linkedHashSet.iterator();
                        if (it.hasNext()) {
                            throw px0.OooOO0o(it);
                        }
                    }
                };
            } else {
                wq0Var.OooO(context);
                this.OooOOoo = new oOO0Oo00(this, wq0Var, 0);
            }
            drawable = wq0Var;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof wq0) {
            ((wq0) background).OooOO0O(f);
        }
    }

    public void setExpanded(boolean z) {
        OooO0Oo(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.OooOOO = z;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.OooOOOO != colorStateList) {
            this.OooOOOO = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.OooOOOo = -1;
        if (view != null) {
            this.OooOOo0 = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.OooOOo0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.OooOOo0 = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.OooOOOo = i;
        WeakReference weakReference = this.OooOOo0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.OooOOo0 = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.OooOO0O = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            ra.OooOOO("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setPendingAction(int i) {
        this.OooO = i;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.OooOoO;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.OooOoO = drawableMutate;
            if (drawableMutate instanceof wq0) {
                numValueOf = Integer.valueOf(((wq0) drawableMutate).OooOoO0);
            } else {
                ColorStateList colorStateListOooO00o = mq2.OooO00o(drawableMutate);
                if (colorStateListOooO00o != null) {
                    numValueOf = Integer.valueOf(colorStateListOooO00o.getDefaultColor());
                }
            }
            this.OooOoOO = numValueOf;
            Drawable drawable3 = this.OooOoO;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.OooOoO.setState(getDrawableState());
                }
                this.OooOoO.setLayoutDirection(getLayoutDirection());
                this.OooOoO.setVisible(getVisibility() == 0, false);
                this.OooOoO.setCallback(this);
            }
            if (this.OooOoO != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(ym2.OooO00o(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) throws Resources.NotFoundException {
        c92.OooO00o(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.OooOoO;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.OooOoO;
    }

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooO0O0(layoutParams);
    }

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static class BaseBehavior<T extends AppBarLayout> extends k70 {
        public int OooOO0;
        public int OooOO0O;
        public ValueAnimator OooOO0o;
        public WeakReference OooOOO;
        public OooO0o OooOOO0;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.OooO0o = -1;
            this.OooO0oo = -1;
        }

        public static View OooOoo0(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((oj) childAt.getLayoutParams()).OooO00o instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View OooOooO(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof mw0) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void Oooo00o(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = r2
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                if (r4 == 0) goto L5a
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.cmaster.cloner.oOO0OoO0 r0 = (com.cmaster.cloner.oOO0OoO0) r0
                int r0 = r0.OooO00o
                r1 = r0 & 1
                if (r1 == 0) goto L5a
                int r1 = r4.getMinimumHeight()
                r3 = 1
                if (r9 <= 0) goto L48
                r9 = r0 & 12
                if (r9 == 0) goto L48
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L5a
                goto L5b
            L48:
                r9 = r0 & 2
                if (r9 == 0) goto L5a
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L5a
                goto L5b
            L5a:
                r3 = r2
            L5b:
                boolean r8 = r7.OooOOO
                if (r8 == 0) goto L67
                android.view.View r8 = OooOooO(r6)
                boolean r3 = r7.OooO0o(r8)
            L67:
                boolean r8 = r7.OooO0o0(r3)
                if (r10 != 0) goto La7
                if (r8 == 0) goto Lce
                com.cmaster.cloner.ho1 r8 = r6.OooO0o0
                java.lang.Object r8 = r8.OooO0o
                com.cmaster.cloner.gh1 r8 = (com.cmaster.cloner.gh1) r8
                java.lang.Object r8 = r8.get(r7)
                java.util.List r8 = (java.util.List) r8
                java.util.ArrayList r6 = r6.OooO0oO
                r6.clear()
                if (r8 == 0) goto L85
                r6.addAll(r8)
            L85:
                int r8 = r6.size()
            L89:
                if (r2 >= r8) goto Lce
                java.lang.Object r9 = r6.get(r2)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                com.cmaster.cloner.oj r9 = (com.cmaster.cloner.oj) r9
                com.cmaster.cloner.lj r9 = r9.OooO00o
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 == 0) goto La4
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r6 = r9.OooO0o
                if (r6 == 0) goto Lce
                goto La7
            La4:
                int r2 = r2 + 1
                goto L89
            La7:
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                if (r6 == 0) goto Lb4
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                r6.jumpToCurrentState()
            Lb4:
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                if (r6 == 0) goto Lc1
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                r6.jumpToCurrentState()
            Lc1:
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                if (r6 == 0) goto Lce
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                r6.jumpToCurrentState()
            Lce:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.Oooo00o(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // com.cmaster.cloner.fu1, com.cmaster.cloner.lj
        public final boolean OooOO0o(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.OooOO0o(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            OooO0o oooO0o = this.OooOOO0;
            if (oooO0o == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            OooOoo(coordinatorLayout, appBarLayout, i2);
                        } else {
                            OooOoOO(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            OooOoo(coordinatorLayout, appBarLayout, 0);
                        } else {
                            OooOoOO(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (oooO0o.OooO0o) {
                OooOoOO(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (oooO0o.OooO0oO) {
                OooOoOO(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(oooO0o.OooO0oo);
                int i3 = -childAt.getBottom();
                OooOoOO(coordinatorLayout, appBarLayout, this.OooOOO0.OooOO0 ? appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3 : Math.round(childAt.getHeight() * this.OooOOO0.OooO) + i3);
            }
            appBarLayout.OooO = 0;
            this.OooOOO0 = null;
            int iOooO0O0 = cw2.OooO0O0(OooOo0o(), -appBarLayout.getTotalScrollRange(), 0);
            ed edVar = this.OooO00o;
            if (edVar == null) {
                this.OooO0O0 = iOooO0O0;
            } else if (edVar.OooO0OO != iOooO0O0) {
                edVar.OooO0OO = iOooO0O0;
                edVar.OooO0OO();
            }
            Oooo00o(coordinatorLayout, appBarLayout, OooOo0o(), 0, true);
            appBarLayout.OooO0Oo = OooOo0o();
            if (!appBarLayout.willNotDraw()) {
                appBarLayout.postInvalidateOnAnimation();
            }
            if (nt1.OooO0Oo(coordinatorLayout) != null) {
                return true;
            }
            nt1.OooOOO0(coordinatorLayout, new OooO0O0(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // com.cmaster.cloner.lj
        public final boolean OooOOO0(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((oj) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.OooOOoo(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // com.cmaster.cloner.lj
        public final /* bridge */ /* synthetic */ void OooOOOO(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            OooOooo(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // com.cmaster.cloner.lj
        public final void OooOOOo(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = baseBehavior.OooOoO(coordinatorLayout2, appBarLayout, OooOoO0() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0 && nt1.OooO0Oo(coordinatorLayout2) == null) {
                nt1.OooOOO0(coordinatorLayout2, new OooO0O0(coordinatorLayout2, baseBehavior, appBarLayout));
            }
        }

        @Override // com.cmaster.cloner.lj
        public final void OooOOo(View view, Parcelable parcelable) {
            if (parcelable instanceof OooO0o) {
                this.OooOOO0 = (OooO0o) parcelable;
            } else {
                this.OooOOO0 = null;
            }
        }

        @Override // com.cmaster.cloner.lj
        public final Parcelable OooOOoo(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            OooO0o oooO0oOooo000 = Oooo000(absSavedState, (AppBarLayout) view);
            return oooO0oOooo000 == null ? absSavedState : oooO0oOooo000;
        }

        @Override // com.cmaster.cloner.lj
        public final void OooOo0(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.OooOO0O == 0 || i == 1) {
                Oooo00O(coordinatorLayout, appBarLayout);
                if (appBarLayout.OooOOO) {
                    appBarLayout.OooO0o0(appBarLayout.OooO0o(view2));
                }
            }
            this.OooOOO = new WeakReference(view2);
        }

        @Override // com.cmaster.cloner.lj
        public final boolean OooOo00(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.OooOOO || appBarLayout.OooOOO0 || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.OooOO0o) != null) {
                valueAnimator.cancel();
            }
            this.OooOOO = null;
            this.OooOO0O = i2;
            return z;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x015e  */
        @Override // com.cmaster.cloner.k70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int OooOoO(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 374
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.OooOoO(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        @Override // com.cmaster.cloner.k70
        public final int OooOoO0() {
            return OooOo0o() + this.OooOO0;
        }

        public final void OooOoo(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(OooOoO0() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iOooOoO0 = OooOoO0();
            ValueAnimator valueAnimator = this.OooOO0o;
            if (iOooOoO0 == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.OooOO0o.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.OooOO0o = valueAnimator2;
                valueAnimator2.setInterpolator(oO0oO000.OooO0o0);
                this.OooOO0o.addUpdateListener(new OooO00o(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.OooOO0o.setDuration(Math.min(iRound, 600));
            this.OooOO0o.setIntValues(iOooOoO0, i);
            this.OooOO0o.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void OooOooo(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
            /*
                r8 = this;
                if (r12 == 0) goto L2b
                if (r12 >= 0) goto L11
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                int r1 = r10.getDownNestedPreScrollRange()
                int r1 = r1 + r0
            Le:
                r6 = r0
                r7 = r1
                goto L18
            L11:
                int r0 = r10.getUpNestedPreScrollRange()
                int r0 = -r0
                r1 = 0
                goto Le
            L18:
                if (r6 == r7) goto L2b
                int r0 = r8.OooOoO0()
                int r5 = r0 - r12
                r2 = r8
                r3 = r9
                r4 = r10
                int r8 = r2.OooOoO(r3, r4, r5, r6, r7)
                r9 = 1
                r13[r9] = r8
                goto L2c
            L2b:
                r4 = r10
            L2c:
                boolean r8 = r4.OooOOO
                if (r8 == 0) goto L37
                boolean r8 = r4.OooO0o(r11)
                r4.OooO0o0(r8)
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.OooOooo(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        public final OooO0o Oooo000(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iOooOo0o = OooOo0o();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iOooOo0o;
                if (childAt.getTop() + iOooOo0o <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = OooO.OooO0o0;
                    }
                    OooO0o oooO0o = new OooO0o(parcelable);
                    boolean z = iOooOo0o == 0;
                    oooO0o.OooO0oO = z;
                    oooO0o.OooO0o = !z && (-iOooOo0o) >= appBarLayout.getTotalScrollRange();
                    oooO0o.OooO0oo = i;
                    oooO0o.OooOO0 = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    oooO0o.OooO = bottom / childAt.getHeight();
                    return oooO0o;
                }
            }
            return null;
        }

        public final void Oooo00O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iOooOoO0 = OooOoO0() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                oOO0OoO0 ooo0ooo0 = (oOO0OoO0) childAt.getLayoutParams();
                if ((ooo0ooo0.OooO00o & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) ooo0ooo0).topMargin;
                    bottom += ((LinearLayout.LayoutParams) ooo0ooo0).bottomMargin;
                }
                int i2 = -iOooOoO0;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                oOO0OoO0 ooo0ooo02 = (oOO0OoO0) childAt2.getLayoutParams();
                int i3 = ooo0ooo02.OooO00o;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iOooOoO0 < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) ooo0ooo02).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) ooo0ooo02).bottomMargin;
                    }
                    if (iOooOoO0 < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    OooOoo(coordinatorLayout, appBarLayout, cw2.OooO0O0(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        public BaseBehavior() {
            this.OooO0o = -1;
            this.OooO0oo = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        oOO0OoO0 ooo0ooo0 = new oOO0OoO0(-1, -2);
        ooo0ooo0.OooO00o = 1;
        return ooo0ooo0;
    }

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static class ScrollingViewBehavior extends m70 {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k61.OooOOoo);
            this.OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public static AppBarLayout OooOoO(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.cmaster.cloner.lj
        public final void OooO(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                nt1.OooOOO0(coordinatorLayout, null);
            }
        }

        @Override // com.cmaster.cloner.lj
        public final boolean OooO0o(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // com.cmaster.cloner.lj
        public boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, View view2) {
            lj ljVar = ((oj) view2.getLayoutParams()).OooO00o;
            if (ljVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) ljVar).OooOO0) + this.OooO0o0) - OooOoO0(view2);
                WeakHashMap weakHashMap = nt1.OooO00o;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.OooOOO) {
                return false;
            }
            appBarLayout.OooO0o0(appBarLayout.OooO0o(view));
            return false;
        }

        @Override // com.cmaster.cloner.lj
        public final boolean OooOOo0(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutOooOoO = OooOoO(coordinatorLayout.OooOO0O(view));
            if (appBarLayoutOooOoO != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.OooO0OO;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutOooOoO.OooO0Oo(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
