package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n00 {
    public float OooO;
    public ag1 OooO00o;
    public m00 OooO0O0;
    public RippleDrawable OooO0OO;
    public r8 OooO0Oo;
    public boolean OooO0o;
    public RippleDrawable OooO0o0;
    public float OooO0oo;
    public float OooOO0;
    public int OooOO0O;
    public StateListAnimator OooOO0o;
    public ru0 OooOOO;
    public Animator OooOOO0;
    public ru0 OooOOOO;
    public int OooOOo0;
    public final FloatingActionButton OooOOoo;
    public final o00OO000 OooOo00;
    public static final yy OooOoO0 = oO0oO000.OooO0OO;
    public static final int OooOoO = R.attr.motionDurationLong2;
    public static final int OooOoOO = R.attr.motionEasingEmphasizedInterpolator;
    public static final int OooOoo0 = R.attr.motionDurationMedium1;
    public static final int OooOoo = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] OooOooO = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] OooOooo = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] Oooo000 = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] Oooo00O = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] Oooo00o = {android.R.attr.state_enabled};
    public static final int[] Oooo0 = new int[0];
    public boolean OooO0oO = true;
    public float OooOOOo = 1.0f;
    public int OooOOo = 0;
    public final Rect OooOo0 = new Rect();
    public final RectF OooOo0O = new RectF();
    public final RectF OooOo0o = new RectF();
    public final Matrix OooOo = new Matrix();

    public n00(FloatingActionButton floatingActionButton, o00OO000 o00oo000) {
        this.OooOOoo = floatingActionButton;
        this.OooOo00 = o00oo000;
    }

    public final void OooO00o(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.OooOOoo.getDrawable();
        if (drawable == null || this.OooOOo0 == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.OooOo0O;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f2 = this.OooOOo0;
        RectF rectF2 = this.OooOo0o;
        rectF2.set(0.0f, 0.0f, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.OooOOo0 / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    public final AnimatorSet OooO0O0(ru0 ru0Var, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.OooOOoo;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        ru0Var.OooO0OO("opacity").OooO00o(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        ru0Var.OooO0OO("scale").OooO00o(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            objectAnimatorOfFloat2.setEvaluator(new l00());
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        ru0Var.OooO0OO("scale").OooO00o(objectAnimatorOfFloat3);
        if (i == 26) {
            objectAnimatorOfFloat3.setEvaluator(new l00());
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.OooOo;
        OooO00o(f3, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new xf0(), new k00(this), new Matrix(matrix));
        ru0Var.OooO0OO("iconScale").OooO00o(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        rm2.OooO00o(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet OooO0OO(final float f, final float f2, final float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.OooOOoo;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f4 = this.OooOOOo;
        final Matrix matrix = new Matrix(this.OooOo);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.cmaster.cloner.j00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n00 n00Var = this.OooO00o;
                FloatingActionButton floatingActionButton2 = n00Var.OooOOoo;
                floatingActionButton2.setAlpha(oO0oO000.OooO0O0(alpha, f, 0.0f, 0.2f, fFloatValue));
                float f5 = scaleX;
                float f6 = f2;
                floatingActionButton2.setScaleX(oO0oO000.OooO00o(f5, f6, fFloatValue));
                floatingActionButton2.setScaleY(oO0oO000.OooO00o(scaleY, f6, fFloatValue));
                float f7 = f4;
                float f8 = f3;
                n00Var.OooOOOo = oO0oO000.OooO00o(f7, f8, fFloatValue);
                float fOooO00o = oO0oO000.OooO00o(f7, f8, fFloatValue);
                Matrix matrix2 = matrix;
                n00Var.OooO00o(fOooO00o, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        rm2.OooO00o(animatorSet, arrayList);
        animatorSet.setDuration(ow2.OooO0OO(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(ow2.OooO0Oo(floatingActionButton.getContext(), i2, oO0oO000.OooO0O0));
        return animatorSet;
    }

    public final AnimatorSet OooO0Oo(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.OooOOoo;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(OooOoO0);
        return animatorSet;
    }

    public final void OooO0o() {
    }

    public final void OooO0o0(float f, float f2, float f3) {
        FloatingActionButton floatingActionButton = this.OooOOoo;
        if (floatingActionButton.getStateListAnimator() == this.OooOO0o) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(OooOooO, OooO0Oo(f, f3));
            stateListAnimator.addState(OooOooo, OooO0Oo(f, f2));
            stateListAnimator.addState(Oooo000, OooO0Oo(f, f2));
            stateListAnimator.addState(Oooo00O, OooO0Oo(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(OooOoO0);
            stateListAnimator.addState(Oooo00o, animatorSet);
            stateListAnimator.addState(Oooo0, OooO0Oo(0.0f, 0.0f));
            this.OooOO0o = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton) this.OooOo00.OooO0o0).OooOOO || (this.OooO0o && floatingActionButton.getSizeDimension() < this.OooOO0O)) {
            OooO0oo();
        }
    }

    public final void OooO0oO(ag1 ag1Var) {
        this.OooO00o = ag1Var;
        m00 m00Var = this.OooO0O0;
        if (m00Var != null) {
            m00Var.setShapeAppearanceModel(ag1Var);
        }
        Drawable.Callback callback = this.OooO0OO;
        if (callback instanceof lg1) {
            ((lg1) callback).setShapeAppearanceModel(ag1Var);
        }
        r8 r8Var = this.OooO0Oo;
        if (r8Var != null) {
            r8Var.OooOOOO = ag1Var;
            r8Var.invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0oo() {
        /*
            r11 = this;
            com.cmaster.cloner.o00OO000 r0 = r11.OooOo00
            java.lang.Object r1 = r0.OooO0o0
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
            java.lang.Object r2 = r0.OooO0o0
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            boolean r1 = r1.OooOOO
            boolean r3 = r11.OooO0o
            android.graphics.Rect r4 = r11.OooOo0
            com.google.android.material.floatingactionbutton.FloatingActionButton r5 = r11.OooOOoo
            r6 = 0
            if (r1 == 0) goto L4c
            if (r3 == 0) goto L24
            int r1 = r11.OooOO0O
            int r3 = r5.getSizeDimension()
            int r1 = r1 - r3
            int r1 = r1 / 2
            int r6 = java.lang.Math.max(r1, r6)
        L24:
            boolean r1 = r11.OooO0oO
            if (r1 == 0) goto L30
            float r1 = r5.getElevation()
            float r3 = r11.OooOO0
            float r1 = r1 + r3
            goto L31
        L30:
            r1 = 0
        L31:
            double r7 = (double) r1
            double r7 = java.lang.Math.ceil(r7)
            int r3 = (int) r7
            int r3 = java.lang.Math.max(r6, r3)
            r7 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r7
            double r7 = (double) r1
            double r7 = java.lang.Math.ceil(r7)
            int r1 = (int) r7
            int r1 = java.lang.Math.max(r6, r1)
            r4.set(r3, r1, r3, r1)
            goto L64
        L4c:
            if (r3 == 0) goto L61
            int r1 = r5.getSizeDimension()
            int r3 = r11.OooOO0O
            if (r1 >= r3) goto L61
            int r1 = r5.getSizeDimension()
            int r3 = r3 - r1
            int r3 = r3 / 2
            r4.set(r3, r3, r3, r3)
            goto L64
        L61:
            r4.set(r6, r6, r6, r6)
        L64:
            android.graphics.drawable.RippleDrawable r1 = r11.OooO0o0
            java.lang.String r3 = "Didn't initialize content background"
            com.cmaster.cloner.fy2.OooO00o(r1, r3)
            java.lang.Object r0 = r0.OooO0o0
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            boolean r0 = r0.OooOOO
            if (r0 != 0) goto L88
            boolean r0 = r11.OooO0o
            if (r0 == 0) goto L80
            int r0 = r5.getSizeDimension()
            int r1 = r11.OooOO0O
            if (r0 >= r1) goto L80
            goto L88
        L80:
            android.graphics.drawable.RippleDrawable r11 = r11.OooO0o0
            if (r11 == 0) goto L9a
            com.google.android.material.floatingactionbutton.FloatingActionButton.OooO0O0(r2, r11)
            goto L9a
        L88:
            android.graphics.drawable.InsetDrawable r5 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.RippleDrawable r6 = r11.OooO0o0
            int r7 = r4.left
            int r8 = r4.top
            int r9 = r4.right
            int r10 = r4.bottom
            r5.<init>(r6, r7, r8, r9, r10)
            com.google.android.material.floatingactionbutton.FloatingActionButton.OooO0O0(r2, r5)
        L9a:
            int r11 = r4.left
            int r0 = r4.top
            int r1 = r4.right
            int r3 = r4.bottom
            android.graphics.Rect r4 = r2.OooOOOO
            r4.set(r11, r0, r1, r3)
            int r4 = r2.OooOO0o
            int r11 = r11 + r4
            int r0 = r0 + r4
            int r1 = r1 + r4
            int r3 = r3 + r4
            r2.setPadding(r11, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.n00.OooO0oo():void");
    }
}
