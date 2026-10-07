package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class e7 extends FrameLayout {
    public static final d7 OooOOOO = new d7(0);
    public final int OooO;
    public f7 OooO0Oo;
    public int OooO0o;
    public final ag1 OooO0o0;
    public final float OooO0oO;
    public final float OooO0oo;
    public final int OooOO0;
    public ColorStateList OooOO0O;
    public PorterDuff.Mode OooOO0o;
    public boolean OooOOO;
    public Rect OooOOO0;

    /* JADX WARN: Multi-variable type inference failed */
    public e7(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(s62.OooO00o(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, k61.OooOo0O);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.OooO0o = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.OooO0o0 = ag1.OooO0O0(context2, attributeSet, 0, 0).OooO00o();
        }
        this.OooO0oO = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(wv2.OooO00o(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(r53.OooO00o(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.OooO0oo = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.OooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.OooOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(OooOOOO);
        setFocusable(true);
        if (getBackground() == null) {
            int iOooO0o0 = uv2.OooO0o0(uv2.OooO0OO(this, R.attr.colorSurface), uv2.OooO0OO(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            ag1 ag1Var = this.OooO0o0;
            if (ag1Var != null) {
                yy yyVar = f7.OooOo00;
                wq0 wq0Var = new wq0(ag1Var);
                wq0Var.OooOO0o(ColorStateList.valueOf(iOooO0o0));
                gradientDrawable = wq0Var;
            } else {
                Resources resources = getResources();
                yy yyVar2 = f7.OooOo00;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iOooO0o0);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.OooOO0O;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(f7 f7Var) {
        this.OooO0Oo = f7Var;
    }

    public float getActionTextColorAlpha() {
        return this.OooO0oo;
    }

    public int getAnimationMode() {
        return this.OooO0o;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.OooO0oO;
    }

    public int getMaxInlineActionWidth() {
        return this.OooOO0;
    }

    public int getMaxWidth() {
        return this.OooO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        f7 f7Var = this.OooO0Oo;
        if (f7Var != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = f7Var.OooO.getRootWindowInsets()) != null) {
            f7Var.OooOOOO = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            f7Var.OooO0o0();
        }
        requestApplyInsets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDetachedFromWindow() {
        /*
            r5 = this;
            super.onDetachedFromWindow()
            com.cmaster.cloner.f7 r5 = r5.OooO0Oo
            if (r5 == 0) goto L3d
            com.cmaster.cloner.ho1 r0 = com.cmaster.cloner.ho1.OooOoO0()
            com.cmaster.cloner.c7 r1 = r5.OooOOoo
            java.lang.Object r2 = r0.OooO0o0
            monitor-enter(r2)
            boolean r3 = r0.OooOooO(r1)     // Catch: java.lang.Throwable -> L3a
            r4 = 1
            if (r3 != 0) goto L2b
            java.lang.Object r0 = r0.OooO0oo     // Catch: java.lang.Throwable -> L3a
            com.cmaster.cloner.uh1 r0 = (com.cmaster.cloner.uh1) r0     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            if (r0 == 0) goto L28
            java.lang.ref.WeakReference r0 = r0.OooO00o     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L3a
            if (r0 != r1) goto L28
            r0 = r4
            goto L29
        L28:
            r0 = r3
        L29:
            if (r0 == 0) goto L2c
        L2b:
            r3 = r4
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L3d
            android.os.Handler r0 = com.cmaster.cloner.f7.OooOo0o
            com.cmaster.cloner.a7 r1 = new com.cmaster.cloner.a7
            r1.<init>(r5, r4)
            r0.post(r1)
            return
        L3a:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
            throw r5
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.e7.onDetachedFromWindow():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f7 f7Var = this.OooO0Oo;
        if (f7Var == null || !f7Var.OooOOo0) {
            return;
        }
        f7Var.OooO0Oo();
        f7Var.OooOOo0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.OooO;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.OooO0o = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.OooOO0O != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.OooOO0O);
            drawable.setTintMode(this.OooOO0o);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.OooOO0O = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.OooOO0o);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.OooOO0o = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.OooOOO || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.OooOOO0 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        f7 f7Var = this.OooO0Oo;
        if (f7Var != null) {
            yy yyVar = f7.OooOo00;
            f7Var.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : OooOOOO);
        super.setOnClickListener(onClickListener);
    }
}
