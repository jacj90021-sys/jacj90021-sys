package com.cmaster.cloner;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class u6 extends ProgressBar {
    public boolean OooO;
    public final ld OooO0Oo;
    public final boolean OooO0o;
    public int OooO0o0;
    public final int OooO0oO;
    public oOo00o00 OooO0oo;
    public int OooOO0;
    public boolean OooOO0O;
    public final s6 OooOO0o;
    public final t6 OooOOO;
    public final s6 OooOOO0;
    public final t6 OooOOOO;

    public u6(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(s62.OooO00o(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.OooO = false;
        this.OooOO0 = 4;
        this.OooOO0o = new s6(this, 0);
        this.OooOOO0 = new s6(this, 1);
        this.OooOOO = new t6(this, 0);
        this.OooOOOO = new t6(this, 1);
        Context context2 = getContext();
        ld ldVar = new ld();
        ldVar.OooO0o0 = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        t82.OooO00o(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = k61.OooO0OO;
        t82.OooO0O0(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        ldVar.OooO00o = wv2.OooO0OO(context2, typedArrayObtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                ldVar.OooO0O0 = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), ldVar.OooO00o / 2);
                ldVar.OooO0Oo = false;
            } else if (i2 == 6) {
                ldVar.OooO0OO = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                ldVar.OooO0Oo = true;
            }
        }
        ldVar.OooO0oO = typedArrayObtainStyledAttributes.getInt(6, 0);
        ldVar.OooO0oo = typedArrayObtainStyledAttributes.getInt(1, 0);
        ldVar.OooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        int iAbs = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0));
        ldVar.OooOO0 = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(14, iAbs));
        ldVar.OooOO0O = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(15, iAbs));
        ldVar.OooOO0o = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0));
        ldVar.OooOOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        ldVar.OooOOO = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        if (!typedArrayObtainStyledAttributes.hasValue(3)) {
            ldVar.OooO0o0 = new int[]{uv2.OooO0O0(context2, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(3).type != 1) {
            ldVar.OooO0o0 = new int[]{typedArrayObtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(3, -1));
            ldVar.OooO0o0 = intArray;
            if (intArray.length == 0) {
                ra.OooOOO("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            ldVar.OooO0o = typedArrayObtainStyledAttributes.getColor(8, -1);
        } else {
            ldVar.OooO0o = ldVar.OooO0o0[0];
            TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            ldVar.OooO0o = uv2.OooO00o(ldVar.OooO0o, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        t82.OooO00o(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr2 = k61.OooO0o;
        t82.OooO0O0(context2, attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        ldVar.OooOOOO = typedArrayObtainStyledAttributes3.getInt(0, 0);
        ldVar.OooOOOo = Math.max(wv2.OooO0OO(context2, typedArrayObtainStyledAttributes3, 4, dimensionPixelSize2), ldVar.OooO00o * 2);
        ldVar.OooOOo0 = wv2.OooO0OO(context2, typedArrayObtainStyledAttributes3, 3, dimensionPixelSize3);
        ldVar.OooOOo = typedArrayObtainStyledAttributes3.getInt(2, 0);
        ldVar.OooOOoo = typedArrayObtainStyledAttributes3.getBoolean(1, true);
        typedArrayObtainStyledAttributes3.recycle();
        ldVar.OooO0O0();
        this.OooO0Oo = ldVar;
        t82.OooO00o(context2, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        t82.OooO0O0(context2, attributeSet, iArr, i, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        typedArrayObtainStyledAttributes4.getInt(7, -1);
        this.OooO0oO = Math.min(typedArrayObtainStyledAttributes4.getInt(5, -1), zzbcj.zzq.zzf);
        typedArrayObtainStyledAttributes4.recycle();
        this.OooO0oo = new oOo00o00();
        this.OooO0o = true;
    }

    private ht getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().OooOOo0;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().OooOOo0;
    }

    public final void OooO00o(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.OooO0o0 = i;
            this.OooO = true;
            if (getIndeterminateDrawable().isVisible()) {
                oOo00o00 ooo00o00 = this.OooO0oo;
                ContentResolver contentResolver = getContext().getContentResolver();
                ooo00o00.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().OooOOo.OooOOO0();
                    return;
                }
            }
            this.OooOOO.OooO00o(getIndeterminateDrawable());
        }
    }

    public final boolean OooO0O0() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.OooO0Oo.OooO0oo;
    }

    @Override // android.widget.ProgressBar
    public eg0 getIndeterminateDrawable() {
        return (eg0) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.OooO0Oo.OooO0o0;
    }

    public int getIndicatorTrackGapSize() {
        return this.OooO0Oo.OooO;
    }

    @Override // android.widget.ProgressBar
    public yp getProgressDrawable() {
        return (yp) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.OooO0Oo.OooO0oO;
    }

    public int getTrackColor() {
        return this.OooO0Oo.OooO0o;
    }

    public int getTrackCornerRadius() {
        return this.OooO0Oo.OooO0O0;
    }

    public float getTrackCornerRadiusFraction() {
        return this.OooO0Oo.OooO0OO;
    }

    public int getTrackThickness() {
        return this.OooO0Oo.OooO00o;
    }

    public int getWaveAmplitude() {
        return this.OooO0Oo.OooOO0o;
    }

    public int getWaveSpeed() {
        return this.OooO0Oo.OooOOO0;
    }

    public int getWavelengthDeterminate() {
        return this.OooO0Oo.OooOO0;
    }

    public int getWavelengthIndeterminate() {
        return this.OooO0Oo.OooOO0O;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().OooOOo.OooOO0o(this.OooOOO);
        }
        yp progressDrawable = getProgressDrawable();
        t6 t6Var = this.OooOOOO;
        if (progressDrawable != null) {
            yp progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.OooOO0 == null) {
                progressDrawable2.OooOO0 = new ArrayList();
            }
            if (!progressDrawable2.OooOO0.contains(t6Var)) {
                progressDrawable2.OooOO0.add(t6Var);
            }
        }
        if (getIndeterminateDrawable() != null) {
            eg0 indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.OooOO0 == null) {
                indeterminateDrawable.OooOO0 = new ArrayList();
            }
            if (!indeterminateDrawable.OooOO0.contains(t6Var)) {
                indeterminateDrawable.OooOO0.add(t6Var);
            }
        }
        if (OooO0O0()) {
            if (this.OooO0oO > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.OooOOO0);
        removeCallbacks(this.OooOO0o);
        ((et) getCurrentDrawable()).OooO0Oo(false, false, false);
        eg0 indeterminateDrawable = getIndeterminateDrawable();
        t6 t6Var = this.OooOOOO;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().OooO0o(t6Var);
            getIndeterminateDrawable().OooOOo.OooOOOo();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().OooO0o(t6Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getCurrentDrawingDelegate().OooO00o();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            ht currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(((fd) currentDrawingDelegate).OooO0oO() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : ((fd) currentDrawingDelegate).OooO0oO() + getPaddingLeft() + getPaddingRight(), ((fd) currentDrawingDelegate).OooO0oO() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : ((fd) currentDrawingDelegate).OooO0oO() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.OooO0o) {
            ((et) getCurrentDrawable()).OooO0Oo(OooO0O0(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.OooO0o) {
            ((et) getCurrentDrawable()).OooO0Oo(OooO0O0(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(oOo00o00 ooo00o00) {
        this.OooO0oo = ooo00o00;
        if (getProgressDrawable() != null) {
            getProgressDrawable().OooO0o = ooo00o00;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().OooO0o = ooo00o00;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.OooO0Oo.OooO0oo = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            et etVar = (et) getCurrentDrawable();
            if (etVar != null) {
                etVar.OooO0Oo(false, false, false);
            }
            super.setIndeterminate(z);
            et etVar2 = (et) getCurrentDrawable();
            if (etVar2 != null) {
                etVar2.OooO0Oo(OooO0O0(), false, false);
            }
            if ((etVar2 instanceof eg0) && OooO0O0()) {
                ((eg0) etVar2).OooOOo.OooOOOO();
            }
            this.OooO = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f) {
        ld ldVar = this.OooO0Oo;
        if (ldVar.OooOOO != f) {
            ldVar.OooOOO = f;
            getIndeterminateDrawable().OooOOo.OooOO0();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof eg0) {
            ((et) drawable).OooO0Oo(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else if (this.OooOO0O) {
            ra.OooOOO("Cannot set framework drawable as indeterminate drawable.");
        } else {
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{uv2.OooO0O0(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.OooO0Oo.OooO0o0 = iArr;
        getIndeterminateDrawable().OooOOo.OooOO0();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        ld ldVar = this.OooO0Oo;
        if (ldVar.OooO != i) {
            ldVar.OooO = i;
            ldVar.OooO0O0();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        OooO00o(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable instanceof yp) {
            yp ypVar = (yp) drawable;
            ypVar.OooO0Oo(false, false, false);
            super.setProgressDrawable(ypVar);
            ypVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        if (this.OooOO0O) {
            ra.OooOOO("Cannot set framework drawable as progress drawable.");
        } else {
            super.setProgressDrawable(drawable);
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.OooO0Oo.OooO0oO = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        ld ldVar = this.OooO0Oo;
        if (ldVar.OooO0o != i) {
            ldVar.OooO0o = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        ld ldVar = this.OooO0Oo;
        if (ldVar.OooO0O0 != i) {
            ldVar.OooO0O0 = Math.min(i, ldVar.OooO00o / 2);
            ldVar.OooO0Oo = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f) {
        ld ldVar = this.OooO0Oo;
        if (ldVar.OooO0OO != f) {
            ldVar.OooO0OO = Math.min(f, 0.5f);
            ldVar.OooO0Oo = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        ld ldVar = this.OooO0Oo;
        if (ldVar.OooO00o != i) {
            ldVar.OooO00o = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.OooOO0 = i;
        } else {
            ra.OooOOO("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public void setWaveAmplitude(int i) {
        ld ldVar = this.OooO0Oo;
        if (ldVar.OooOO0o != i) {
            ldVar.OooOO0o = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i) {
        ld ldVar = this.OooO0Oo;
        ldVar.OooOOO0 = i;
        yp progressDrawable = getProgressDrawable();
        boolean z = ldVar.OooOOO0 != 0;
        ValueAnimator valueAnimator = progressDrawable.OooOo0o;
        if (z && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        ld ldVar = this.OooO0Oo;
        if (ldVar.OooOO0 != i) {
            ldVar.OooOO0 = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        ld ldVar = this.OooO0Oo;
        if (ldVar.OooOO0O != i) {
            ldVar.OooOO0O = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }
}
