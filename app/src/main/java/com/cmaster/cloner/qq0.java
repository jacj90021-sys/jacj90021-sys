package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.TypedValue;
import android.view.View;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qq0 extends Transition {
    public int OooO;
    public boolean OooO0Oo;
    public boolean OooO0o;
    public boolean OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public float OooOOO;
    public boolean OooOOO0;
    public float OooOOOO;
    public static final String[] OooOOOo = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
    public static final ho1 OooOOo0 = new ho1(new zt(0.0f, 0.25f), new zt(0.0f, 1.0f), new zt(0.0f, 1.0f), new zt(0.0f, 0.75f), 10);
    public static final ho1 OooOOo = new ho1(new zt(0.6f, 0.9f), new zt(0.0f, 1.0f), new zt(0.0f, 0.9f), new zt(0.3f, 0.9f), 10);
    public static final ho1 OooOOoo = new ho1(new zt(0.1f, 0.4f), new zt(0.1f, 1.0f), new zt(0.1f, 1.0f), new zt(0.1f, 0.9f), 10);
    public static final ho1 OooOo00 = new ho1(new zt(0.6f, 0.9f), new zt(0.0f, 0.9f), new zt(0.0f, 0.9f), new zt(0.2f, 0.9f), 10);

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO00o(TransitionValues transitionValues, int i) throws Resources.NotFoundException {
        RectF rectFOooO0O0;
        ag1 shapeAppearanceModel;
        if (i != -1) {
            View view = transitionValues.view;
            RectF rectF = dp1.OooO00o;
            View viewFindViewById = view.findViewById(i);
            if (viewFindViewById == null) {
                viewFindViewById = dp1.OooO00o(view, i);
            }
            transitionValues.view = viewFindViewById;
        } else if (transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view) instanceof View) {
            View view2 = (View) transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view);
            transitionValues.view.setTag(R.id.mtrl_motion_snapshot_view, null);
            transitionValues.view = view2;
        }
        View view3 = transitionValues.view;
        if (!view3.isLaidOut() && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        if (view3.getParent() == null) {
            RectF rectF2 = dp1.OooO00o;
            rectFOooO0O0 = new RectF(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
        } else {
            rectFOooO0O0 = dp1.OooO0O0(view3);
        }
        transitionValues.values.put("materialContainerTransition:bounds", rectFOooO0O0);
        Map map = transitionValues.values;
        if (view3.getTag(R.id.mtrl_motion_snapshot_view) instanceof ag1) {
            shapeAppearanceModel = (ag1) view3.getTag(R.id.mtrl_motion_snapshot_view);
        } else {
            Context context = view3.getContext();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId != -1) {
                shapeAppearanceModel = ag1.OooO00o(context, resourceId, 0, new OooOO0(0.0f)).OooO00o();
            } else if (view3 instanceof lg1) {
                shapeAppearanceModel = ((lg1) view3).getShapeAppearanceModel();
            } else {
                hc1 hc1Var = new hc1();
                hc1 hc1Var2 = new hc1();
                hc1 hc1Var3 = new hc1();
                hc1 hc1Var4 = new hc1();
                OooOO0 oooOO0 = new OooOO0(0.0f);
                OooOO0 oooOO02 = new OooOO0(0.0f);
                OooOO0 oooOO03 = new OooOO0(0.0f);
                OooOO0 oooOO04 = new OooOO0(0.0f);
                iu iuVar = new iu(0);
                iu iuVar2 = new iu(0);
                iu iuVar3 = new iu(0);
                iu iuVar4 = new iu(0);
                ag1 ag1Var = new ag1();
                ag1Var.OooO00o = hc1Var;
                ag1Var.OooO0O0 = hc1Var2;
                ag1Var.OooO0OO = hc1Var3;
                ag1Var.OooO0Oo = hc1Var4;
                ag1Var.OooO0o0 = oooOO0;
                ag1Var.OooO0o = oooOO02;
                ag1Var.OooO0oO = oooOO03;
                ag1Var.OooO0oo = oooOO04;
                ag1Var.OooO = iuVar;
                ag1Var.OooOO0 = iuVar2;
                ag1Var.OooOO0O = iuVar3;
                ag1Var.OooOO0o = iuVar4;
                shapeAppearanceModel = ag1Var;
            }
        }
        map.put("materialContainerTransition:shapeAppearance", shapeAppearanceModel.OooO0oO(new pg0(rectFOooO0O0)));
    }

    public final void OooO0O0(Context context, boolean z) {
        int iOooO0OO;
        yy yyVar = oO0oO000.OooO0O0;
        RectF rectF = dp1.OooO00o;
        if (getInterpolator() == null) {
            setInterpolator(ow2.OooO0Oo(context, R.attr.motionEasingEmphasizedInterpolator, yyVar));
        }
        int i = z ? R.attr.motionDurationLong2 : R.attr.motionDurationMedium4;
        if (getDuration() == -1 && (iOooO0OO = ow2.OooO0OO(context, i, -1)) != -1) {
            setDuration(iOooO0OO);
        }
        if (this.OooO0o0) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        PathMotion patternPathMotion = null;
        if (context.getTheme().resolveAttribute(R.attr.motionPath, typedValue, true)) {
            int i2 = typedValue.type;
            if (i2 == 16) {
                int i3 = typedValue.data;
                if (i3 != 0) {
                    if (i3 != 1) {
                        ra.OooOOO(px0.OooOOO(i3, "Invalid motion path type: "));
                        return;
                    }
                    patternPathMotion = new aq0();
                }
            } else {
                if (i2 != 3) {
                    ra.OooOOO("Motion path theme attribute must either be an enum value or path data string");
                    return;
                }
                String strValueOf = String.valueOf(typedValue.string);
                Path path = new Path();
                try {
                    o21.OooO0O0(px2.OooO0O0(strValueOf), path);
                    patternPathMotion = new PatternPathMotion(path);
                } catch (RuntimeException e) {
                    qa.OooO0oO("Error in parsing ".concat(strValueOf), e);
                    return;
                }
            }
        }
        if (patternPathMotion != null) {
            setPathMotion(patternPathMotion);
        }
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) throws Resources.NotFoundException {
        OooO00o(transitionValues, this.OooO);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) throws Resources.NotFoundException {
        OooO00o(transitionValues, this.OooO0oo);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010b A[PHI: r24
      0x010b: PHI (r24v1 android.view.View) = (r24v0 android.view.View), (r24v4 android.view.View) binds: [B:56:0x0110, B:53:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator createAnimator(android.view.ViewGroup r32, android.transition.TransitionValues r33, android.transition.TransitionValues r34) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.qq0.createAnimator(android.view.ViewGroup, android.transition.TransitionValues, android.transition.TransitionValues):android.animation.Animator");
    }

    @Override // android.transition.Transition
    public final String[] getTransitionProperties() {
        return OooOOOo;
    }

    @Override // android.transition.Transition
    public final void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.OooO0o0 = true;
    }
}
