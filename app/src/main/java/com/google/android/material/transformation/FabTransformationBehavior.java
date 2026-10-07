package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.cmaster.cloner.R;
import com.cmaster.cloner.gy;
import com.cmaster.cloner.o0O000O;
import com.cmaster.cloner.oO0oO000;
import com.cmaster.cloner.oj;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.qc3;
import com.cmaster.cloner.rm2;
import com.cmaster.cloner.ru0;
import com.cmaster.cloner.su0;
import com.cmaster.cloner.tc;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect OooO0OO;
    public final RectF OooO0Oo;
    public final int[] OooO0o;
    public final RectF OooO0o0;
    public float OooO0oO;
    public float OooO0oo;

    public FabTransformationBehavior() {
        this.OooO0OO = new Rect();
        this.OooO0Oo = new RectF();
        this.OooO0o0 = new RectF();
        this.OooO0o = new int[2];
    }

    public static Pair OooOoO0(float f, float f2, boolean z, o0O000O o0o000o) {
        su0 su0VarOooO0OO;
        su0 su0VarOooO0OO2;
        if (f == 0.0f || f2 == 0.0f) {
            su0VarOooO0OO = ((ru0) o0o000o.OooO0o0).OooO0OO("translationXLinear");
            su0VarOooO0OO2 = ((ru0) o0o000o.OooO0o0).OooO0OO("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            su0VarOooO0OO = ((ru0) o0o000o.OooO0o0).OooO0OO("translationXCurveDownwards");
            su0VarOooO0OO2 = ((ru0) o0o000o.OooO0o0).OooO0OO("translationYCurveDownwards");
        } else {
            su0VarOooO0OO = ((ru0) o0o000o.OooO0o0).OooO0OO("translationXCurveUpwards");
            su0VarOooO0OO2 = ((ru0) o0o000o.OooO0o0).OooO0OO("translationYCurveUpwards");
        }
        return new Pair(su0VarOooO0OO, su0VarOooO0OO2);
    }

    public static float OooOoo0(o0O000O o0o000o, su0 su0Var, float f) {
        long j = su0Var.OooO00o;
        long j2 = su0Var.OooO0O0;
        su0 su0VarOooO0OO = ((ru0) o0o000o.OooO0o0).OooO0OO("expansion");
        return oO0oO000.OooO00o(f, 0.0f, su0Var.OooO0O0().getInterpolation((((su0VarOooO0OO.OooO00o + su0VarOooO0OO.OooO0O0) + 17) - j) / j2));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, com.cmaster.cloner.lj
    public final boolean OooO0o(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        qa.OooO0o("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // com.cmaster.cloner.lj
    public final void OooO0oO(oj ojVar) {
        if (ojVar.OooO0oo == 0) {
            ojVar.OooO0oo = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet OooOo(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat;
        int i;
        float f;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4;
        o0O000O o0o000oOooOooO = OooOooO(view2.getContext(), z);
        if (z) {
            this.OooO0oO = view.getTranslationX();
            this.OooO0oo = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((ru0) o0o000oOooOooO.OooO0o0).OooO0OO("elevation").OooO00o(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        float fOooOoO = OooOoO(view, view2, (qc3) o0o000oOooOooO.OooO0o);
        float fOooOoOO = OooOoOO(view, view2, (qc3) o0o000oOooOooO.OooO0o);
        Pair pairOooOoO0 = OooOoO0(fOooOoO, fOooOoOO, z, o0o000oOooOooO);
        su0 su0Var = (su0) pairOooOoO0.first;
        su0 su0Var2 = (su0) pairOooOoO0.second;
        RectF rectF = this.OooO0Oo;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fOooOoO);
                view2.setTranslationY(-fOooOoOO);
            }
            i = 0;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f = 0.0f;
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fOooOoo0 = OooOoo0(o0o000oOooOooO, su0Var, -fOooOoO);
            float fOooOoo02 = OooOoo0(o0o000oOooOooO, su0Var2, -fOooOoOO);
            Rect rect = this.OooO0OO;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.OooO0o0;
            OooOoo(view2, rectF2);
            rectF2.offset(fOooOoo0, fOooOoo02);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i = 0;
            f = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fOooOoO);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fOooOoOO);
        }
        su0Var.OooO00o(objectAnimatorOfFloat2);
        su0Var2.OooO00o(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat3);
        rectF.width();
        rectF.height();
        float fOooOoO2 = OooOoO(view, view2, (qc3) o0o000oOooOooO.OooO0o);
        float fOooOoOO2 = OooOoOO(view, view2, (qc3) o0o000oOooOooO.OooO0o);
        Pair pairOooOoO02 = OooOoO0(fOooOoO2, fOooOoOO2, z, o0o000oOooOooO);
        su0 su0Var3 = (su0) pairOooOoO02.first;
        su0 su0Var4 = (su0) pairOooOoO02.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            fOooOoO2 = this.OooO0oO;
        }
        float[] fArr = new float[1];
        fArr[i] = fOooOoO2;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            fOooOoOO2 = this.OooO0oo;
        }
        float[] fArr2 = new float[1];
        fArr2[i] = fOooOoOO2;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        su0Var3.OooO00o(objectAnimatorOfFloat5);
        su0Var4.OooO00o(objectAnimatorOfFloat6);
        arrayList.add(objectAnimatorOfFloat5);
        arrayList.add(objectAnimatorOfFloat6);
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = viewFindViewById != null ? viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z) {
                    if (!z2) {
                        tc.OooO00o.set(viewGroup, Float.valueOf(f));
                    }
                    tc tcVar = tc.OooO00o;
                    float[] fArr3 = new float[1];
                    fArr3[i] = 1.0f;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, tcVar, fArr3);
                } else {
                    tc tcVar2 = tc.OooO00o;
                    float[] fArr4 = new float[1];
                    fArr4[i] = f;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, tcVar2, fArr4);
                }
                ((ru0) o0o000oOooOooO.OooO0o0).OooO0OO("contentFade").OooO00o(objectAnimatorOfFloat4);
                arrayList.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        rm2.OooO00o(animatorSet, arrayList);
        animatorSet.addListener(new gy(z, view2, view));
        int size = arrayList2.size();
        for (int i2 = i; i2 < size; i2++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i2));
        }
        return animatorSet;
    }

    public final float OooOoO(View view, View view2, qc3 qc3Var) {
        RectF rectF = this.OooO0Oo;
        OooOoo(view, rectF);
        rectF.offset(this.OooO0oO, this.OooO0oo);
        RectF rectF2 = this.OooO0o0;
        OooOoo(view2, rectF2);
        qc3Var.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float OooOoOO(View view, View view2, qc3 qc3Var) {
        RectF rectF = this.OooO0Oo;
        OooOoo(view, rectF);
        rectF.offset(this.OooO0oO, this.OooO0oo);
        RectF rectF2 = this.OooO0o0;
        OooOoo(view2, rectF2);
        qc3Var.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void OooOoo(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.OooO0o);
        rectF.offsetTo(r3[0], r3[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract o0O000O OooOooO(Context context, boolean z);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO0OO = new Rect();
        this.OooO0Oo = new RectF();
        this.OooO0o0 = new RectF();
        this.OooO0o = new int[2];
    }
}
