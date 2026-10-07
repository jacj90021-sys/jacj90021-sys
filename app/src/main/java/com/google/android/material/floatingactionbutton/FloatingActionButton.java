package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.OooO0O0;
import com.cmaster.cloner.R;
import com.cmaster.cloner.ag1;
import com.cmaster.cloner.dy;
import com.cmaster.cloner.ey;
import com.cmaster.cloner.hy;
import com.cmaster.cloner.k61;
import com.cmaster.cloner.kj;
import com.cmaster.cloner.lb1;
import com.cmaster.cloner.lg1;
import com.cmaster.cloner.lj;
import com.cmaster.cloner.m00;
import com.cmaster.cloner.n;
import com.cmaster.cloner.n00;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.nv1;
import com.cmaster.cloner.o00OO000;
import com.cmaster.cloner.o00Oo00;
import com.cmaster.cloner.oOO00O;
import com.cmaster.cloner.oj;
import com.cmaster.cloner.r53;
import com.cmaster.cloner.r8;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.ru0;
import com.cmaster.cloner.s62;
import com.cmaster.cloner.t82;
import com.cmaster.cloner.vp;
import com.cmaster.cloner.wv2;
import com.cmaster.cloner.yv2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class FloatingActionButton extends nv1 implements dy, lg1, kj {
    public ColorStateList OooO;
    public PorterDuff.Mode OooO0o;
    public ColorStateList OooO0o0;
    public ColorStateList OooO0oO;
    public PorterDuff.Mode OooO0oo;
    public int OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public boolean OooOOO;
    public int OooOOO0;
    public final Rect OooOOOO;
    public final Rect OooOOOo;
    public final OooO0O0 OooOOo;
    public final o00Oo00 OooOOo0;
    public n00 OooOOoo;

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable layerDrawable;
        int resourceId;
        int resourceId2;
        super(s62.OooO00o(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.OooO0Oo = getVisibility();
        this.OooOOOO = new Rect();
        this.OooOOOo = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = t82.OooO0Oo(context2, attributeSet, k61.OooO0oo, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.OooO0o0 = wv2.OooO00o(context2, typedArrayOooO0Oo, 1);
        this.OooO0o = r53.OooO00o(typedArrayOooO0Oo.getInt(2, -1), null);
        this.OooO = wv2.OooO00o(context2, typedArrayOooO0Oo, 12);
        this.OooOO0 = typedArrayOooO0Oo.getInt(7, -1);
        this.OooOO0O = typedArrayOooO0Oo.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayOooO0Oo.getDimensionPixelSize(3, 0);
        float dimension = typedArrayOooO0Oo.getDimension(4, 0.0f);
        float dimension2 = typedArrayOooO0Oo.getDimension(9, 0.0f);
        float dimension3 = typedArrayOooO0Oo.getDimension(11, 0.0f);
        this.OooOOO = typedArrayOooO0Oo.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayOooO0Oo.getDimensionPixelSize(10, 0));
        ru0 ru0VarOooO00o = (!typedArrayOooO0Oo.hasValue(15) || (resourceId2 = typedArrayOooO0Oo.getResourceId(15, 0)) == 0) ? null : ru0.OooO00o(context2, resourceId2);
        ru0 ru0VarOooO00o2 = (!typedArrayOooO0Oo.hasValue(8) || (resourceId = typedArrayOooO0Oo.getResourceId(8, 0)) == 0) ? null : ru0.OooO00o(context2, resourceId);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, k61.OooOOOO, i, R.style.Widget_Design_FloatingActionButton);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        ru0 ru0Var = ru0VarOooO00o2;
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ag1 ag1VarOooO00o = ag1.OooO00o(context2, resourceId3, resourceId4, ag1.OooOOO0).OooO00o();
        boolean z = typedArrayOooO0Oo.getBoolean(5, false);
        setEnabled(typedArrayOooO0Oo.getBoolean(0, true));
        typedArrayOooO0Oo.recycle();
        o00Oo00 o00oo00 = new o00Oo00(this);
        this.OooOOo0 = o00oo00;
        o00oo00.OooO0oo(attributeSet, i);
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.OooO00o = false;
        oooO0O0.OooO0O0 = 0;
        oooO0O0.OooO0OO = this;
        this.OooOOo = oooO0O0;
        getImpl().OooO0oO(ag1VarOooO00o);
        n00 impl = getImpl();
        ColorStateList colorStateList2 = this.OooO0o0;
        PorterDuff.Mode mode = this.OooO0o;
        ColorStateList colorStateList3 = this.OooO;
        FloatingActionButton floatingActionButton = impl.OooOOoo;
        ag1 ag1Var = impl.OooO00o;
        ag1Var.getClass();
        m00 m00Var = new m00(ag1Var);
        impl.OooO0O0 = m00Var;
        m00Var.setTintList(colorStateList2);
        if (mode != null) {
            impl.OooO0O0.setTintMode(mode);
        }
        impl.OooO0O0.OooO(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            ag1 ag1Var2 = impl.OooO00o;
            ag1Var2.getClass();
            r8 r8Var = new r8(ag1Var2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            colorStateList = colorStateList3;
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            r8Var.OooO = color;
            r8Var.OooOO0 = color2;
            r8Var.OooOO0O = color3;
            r8Var.OooOO0o = color4;
            float f = dimensionPixelSize;
            if (r8Var.OooO0oo != f) {
                r8Var.OooO0oo = f;
                r8Var.OooO0O0.setStrokeWidth(f * 1.3333f);
                r8Var.OooOOO = true;
                r8Var.invalidateSelf();
            }
            if (colorStateList2 != null) {
                r8Var.OooOOO0 = colorStateList2.getColorForState(r8Var.getState(), r8Var.OooOOO0);
            }
            r8Var.OooOOOo = colorStateList2;
            r8Var.OooOOO = true;
            r8Var.invalidateSelf();
            impl.OooO0Oo = r8Var;
            r8 r8Var2 = impl.OooO0Oo;
            r8Var2.getClass();
            m00 m00Var2 = impl.OooO0O0;
            m00Var2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{r8Var2, m00Var2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            impl.OooO0Oo = null;
            layerDrawable = impl.OooO0O0;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(lb1.OooO00o(colorStateList), layerDrawable, drawable);
        impl.OooO0OO = rippleDrawable;
        impl.OooO0o0 = rippleDrawable;
        getImpl().OooOO0O = dimensionPixelSize2;
        n00 impl2 = getImpl();
        if (impl2.OooO0oo != dimension) {
            impl2.OooO0oo = dimension;
            impl2.OooO0o0(dimension, impl2.OooO, impl2.OooOO0);
        }
        n00 impl3 = getImpl();
        if (impl3.OooO != dimension2) {
            impl3.OooO = dimension2;
            impl3.OooO0o0(impl3.OooO0oo, dimension2, impl3.OooOO0);
        }
        n00 impl4 = getImpl();
        if (impl4.OooOO0 != dimension3) {
            impl4.OooOO0 = dimension3;
            impl4.OooO0o0(impl4.OooO0oo, impl4.OooO, dimension3);
        }
        getImpl().OooOOO = ru0VarOooO00o;
        getImpl().OooOOOO = ru0Var;
        getImpl().OooO0o = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private n00 getImpl() {
        if (this.OooOOoo == null) {
            this.OooOOoo = new n00(this, new o00OO000(this, 14));
        }
        return this.OooOOoo;
    }

    public final int OooO0OO(int i) {
        int i2 = this.OooOO0O;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? OooO0OO(1) : OooO0OO(0);
    }

    public final void OooO0Oo() {
        n00 impl = getImpl();
        FloatingActionButton floatingActionButton = impl.OooOOoo;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.OooOOo;
        if (visibility == 0) {
            if (i == 1) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        Animator animator = impl.OooOOO0;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.OooOOoo;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.OooO00o(4, false);
            return;
        }
        ru0 ru0Var = impl.OooOOOO;
        AnimatorSet animatorSetOooO0O0 = ru0Var != null ? impl.OooO0O0(ru0Var, 0.0f, 0.0f, 0.0f) : impl.OooO0OO(0.0f, 0.4f, 0.4f, n00.OooOoo0, n00.OooOoo);
        animatorSetOooO0O0.addListener(new hy(impl));
        animatorSetOooO0O0.start();
    }

    public final void OooO0o() {
        n00 impl = getImpl();
        FloatingActionButton floatingActionButton = impl.OooOOoo;
        Matrix matrix = impl.OooOo;
        FloatingActionButton floatingActionButton2 = impl.OooOOoo;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.OooOOo;
        if (visibility != 0) {
            if (i == 2) {
                return;
            }
        } else if (i != 1) {
            return;
        }
        Animator animator = impl.OooOOO0;
        if (animator != null) {
            animator.cancel();
        }
        boolean z = impl.OooOOO == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.OooO00o(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.OooOOOo = 1.0f;
            impl.OooO00o(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z ? 0.4f : 0.0f);
            float f = z ? 0.4f : 0.0f;
            impl.OooOOOo = f;
            impl.OooO00o(f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        ru0 ru0Var = impl.OooOOO;
        AnimatorSet animatorSetOooO0O0 = ru0Var != null ? impl.OooO0O0(ru0Var, 1.0f, 1.0f, 1.0f) : impl.OooO0OO(1.0f, 1.0f, 1.0f, n00.OooOoO, n00.OooOoOO);
        animatorSetOooO0O0.addListener(new oOO00O(impl, 6));
        animatorSetOooO0O0.start();
    }

    public final void OooO0o0() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.OooO0oO;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.OooO0oo;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(n.OooO0OO(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.OooO0o0;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.OooO0o;
    }

    @Override // com.cmaster.cloner.kj
    public lj getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().OooOOoo.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().OooO;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().OooOO0;
    }

    public Drawable getContentBackground() {
        return getImpl().OooO0o0;
    }

    public int getCustomSize() {
        return this.OooOO0O;
    }

    public int getExpandedComponentIdHint() {
        return this.OooOOo.OooO0O0;
    }

    public ru0 getHideMotionSpec() {
        return getImpl().OooOOOO;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.OooO;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.OooO;
    }

    @Override // com.cmaster.cloner.lg1
    public ag1 getShapeAppearanceModel() {
        ag1 ag1Var = getImpl().OooO00o;
        ag1Var.getClass();
        return ag1Var;
    }

    public ru0 getShowMotionSpec() {
        return getImpl().OooOOO;
    }

    public int getSize() {
        return this.OooOO0;
    }

    public int getSizeDimension() {
        return OooO0OO(this.OooOO0);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.OooO0oO;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.OooO0oo;
    }

    public boolean getUseCompatPadding() {
        return this.OooOOO;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n00 impl = getImpl();
        m00 m00Var = impl.OooO0O0;
        if (m00Var != null) {
            yv2.OooO0O0(impl.OooOOoo, m00Var);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().OooOOoo.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.OooOO0o = (sizeDimension - this.OooOOO0) / 2;
        getImpl().OooO0oo();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.OooOOOO;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ey)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ey eyVar = (ey) parcelable;
        super.onRestoreInstanceState(eyVar.OooO0Oo);
        Bundle bundle = (Bundle) eyVar.OooO0o.get("expandableWidgetHelper");
        bundle.getClass();
        OooO0O0 oooO0O0 = this.OooOOo;
        oooO0O0.getClass();
        oooO0O0.OooO00o = bundle.getBoolean("expanded", false);
        oooO0O0.OooO0O0 = bundle.getInt("expandedComponentIdHint", 0);
        if (oooO0O0.OooO00o) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) oooO0O0.OooO0OO;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).OooO(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ey eyVar = new ey(parcelableOnSaveInstanceState);
        OooO0O0 oooO0O0 = this.OooOOo;
        oooO0O0.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", oooO0O0.OooO00o);
        bundle.putInt("expandedComponentIdHint", oooO0O0.OooO0O0);
        eyVar.OooO0o.put("expandableWidgetHelper", bundle);
        return eyVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.OooOOOo;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i = rect.left;
            Rect rect2 = this.OooOOOO;
            rect.left = i + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            n00 n00Var = this.OooOOoo;
            int i2 = -(n00Var.OooO0o ? Math.max((n00Var.OooOO0O - n00Var.OooOOoo.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i2, i2);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.OooO0o0 != colorStateList) {
            this.OooO0o0 = colorStateList;
            n00 impl = getImpl();
            m00 m00Var = impl.OooO0O0;
            if (m00Var != null) {
                m00Var.setTintList(colorStateList);
            }
            r8 r8Var = impl.OooO0Oo;
            if (r8Var != null) {
                if (colorStateList != null) {
                    r8Var.OooOOO0 = colorStateList.getColorForState(r8Var.getState(), r8Var.OooOOO0);
                }
                r8Var.OooOOOo = colorStateList;
                r8Var.OooOOO = true;
                r8Var.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.OooO0o != mode) {
            this.OooO0o = mode;
            m00 m00Var = getImpl().OooO0O0;
            if (m00Var != null) {
                m00Var.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        n00 impl = getImpl();
        if (impl.OooO0oo != f) {
            impl.OooO0oo = f;
            impl.OooO0o0(f, impl.OooO, impl.OooOO0);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        n00 impl = getImpl();
        if (impl.OooO != f) {
            impl.OooO = f;
            impl.OooO0o0(impl.OooO0oo, f, impl.OooOO0);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        n00 impl = getImpl();
        if (impl.OooOO0 != f) {
            impl.OooOO0 = f;
            impl.OooO0o0(impl.OooO0oo, impl.OooO, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            ra.OooOOO("Custom size must be non-negative");
        } else if (i != this.OooOO0O) {
            this.OooOO0O = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m00 m00Var = getImpl().OooO0O0;
        if (m00Var != null) {
            m00Var.OooOO0O(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().OooO0o) {
            getImpl().OooO0o = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.OooOOo.OooO0O0 = i;
    }

    public void setHideMotionSpec(ru0 ru0Var) {
        getImpl().OooOOOO = ru0Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(ru0.OooO00o(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            n00 impl = getImpl();
            float f = impl.OooOOOo;
            impl.OooOOOo = f;
            Matrix matrix = impl.OooOo;
            impl.OooO00o(f, matrix);
            impl.OooOOoo.setImageMatrix(matrix);
            if (this.OooO0oO != null) {
                OooO0o0();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.OooOOo0.OooOOO0(i);
        OooO0o0();
    }

    public void setMaxImageSize(int i) {
        this.OooOOO0 = i;
        n00 impl = getImpl();
        if (impl.OooOOo0 != i) {
            impl.OooOOo0 = i;
            float f = impl.OooOOOo;
            impl.OooOOOo = f;
            Matrix matrix = impl.OooOo;
            impl.OooO00o(f, matrix);
            impl.OooOOoo.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.OooO != colorStateList) {
            this.OooO = colorStateList;
            n00 impl = getImpl();
            ColorStateList colorStateList2 = this.OooO;
            RippleDrawable rippleDrawable = impl.OooO0OO;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(lb1.OooO00o(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(lb1.OooO00o(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z) {
        n00 impl = getImpl();
        impl.OooO0oO = z;
        impl.OooO0oo();
    }

    @Override // com.cmaster.cloner.lg1
    public void setShapeAppearanceModel(ag1 ag1Var) {
        getImpl().OooO0oO(ag1Var);
    }

    public void setShowMotionSpec(ru0 ru0Var) {
        getImpl().OooOOO = ru0Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(ru0.OooO00o(getContext(), i));
    }

    public void setSize(int i) {
        this.OooOO0O = 0;
        if (i != this.OooOO0) {
            this.OooOO0 = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.OooO0oO != colorStateList) {
            this.OooO0oO = colorStateList;
            OooO0o0();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.OooO0oo != mode) {
            this.OooO0oo = mode;
            OooO0o0();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().OooO0o();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().OooO0o();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().OooO0o();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.OooOOO != z) {
            this.OooOOO = z;
            getImpl().OooO0oo();
        }
    }

    @Override // com.cmaster.cloner.nv1, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static class BaseBehavior<T extends FloatingActionButton> extends lj {
        public Rect OooO00o;
        public final boolean OooO0O0;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k61.OooO);
            this.OooO0O0 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // com.cmaster.cloner.lj
        public final boolean OooO0o0(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.OooOOOO;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // com.cmaster.cloner.lj
        public final void OooO0oO(oj ojVar) {
            if (ojVar.OooO0oo == 0) {
                ojVar.OooO0oo = 80;
            }
        }

        @Override // com.cmaster.cloner.lj
        public final boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                OooOo0o(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof oj ? ((oj) layoutParams).OooO00o instanceof BottomSheetBehavior : false) {
                    OooOo(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // com.cmaster.cloner.lj
        public final boolean OooOO0o(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListOooOO0O = coordinatorLayout.OooOO0O(floatingActionButton);
            int size = arrayListOooOO0O.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) arrayListOooOO0O.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof oj ? ((oj) layoutParams).OooO00o instanceof BottomSheetBehavior : false) && OooOo(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (OooOo0o(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.OooOOo(floatingActionButton, i);
            Rect rect = floatingActionButton.OooOOOO;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                oj ojVar = (oj) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) ojVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) ojVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) ojVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) ojVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap = nt1.OooO00o;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap2 = nt1.OooO00o;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean OooOo(View view, FloatingActionButton floatingActionButton) {
            oj ojVar = (oj) floatingActionButton.getLayoutParams();
            if (!this.OooO0O0 || ojVar.OooO0o != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((oj) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.OooO0Oo();
                return true;
            }
            floatingActionButton.OooO0o();
            return true;
        }

        public final boolean OooOo0o(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            oj ojVar = (oj) floatingActionButton.getLayoutParams();
            if (!this.OooO0O0 || ojVar.OooO0o != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.OooO00o == null) {
                this.OooO00o = new Rect();
            }
            Rect rect = this.OooO00o;
            vp.OooO00o(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.OooO0Oo();
                return true;
            }
            floatingActionButton.OooO0o();
            return true;
        }

        public BaseBehavior() {
            this.OooO0O0 = true;
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }
}
