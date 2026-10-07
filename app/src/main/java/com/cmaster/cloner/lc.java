package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lc extends vo1 {
    public static final String[] OooOooO = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final hc OooOooo = new hc(PointF.class, "topLeft", 0);
    public static final hc Oooo000 = new hc(PointF.class, "bottomRight", 1);
    public static final hc Oooo00O = new hc(PointF.class, "bottomRight", 2);
    public static final hc Oooo00o = new hc(PointF.class, "topLeft", 3);
    public static final hc Oooo0 = new hc(PointF.class, "position", 4);

    public static void Oooo0(fp1 fp1Var) {
        View view = fp1Var.OooO0O0;
        HashMap map = fp1Var.OooO00o;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooO0Oo(fp1 fp1Var) {
        Oooo0(fp1Var);
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooO0oO(fp1 fp1Var) {
        Oooo0(fp1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.vo1
    public final Animator OooOO0O(ViewGroup viewGroup, fp1 fp1Var, fp1 fp1Var2) {
        int i;
        lc lcVar;
        ObjectAnimator objectAnimatorOooO00o;
        if (fp1Var == null) {
            return null;
        }
        HashMap map = fp1Var.OooO00o;
        if (fp1Var2 == null) {
            return null;
        }
        HashMap map2 = fp1Var2.OooO00o;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = fp1Var2.OooO0O0;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        mu1.OooO00o(view, i2, i4, i6, i8);
        if (i14 != 2) {
            lcVar = this;
            if (i2 == i3 && i4 == i5) {
                lcVar.OooOoO0.getClass();
                objectAnimatorOooO00o = yx0.OooO00o(view, Oooo00O, gu0.OooO0oO(i6, i8, i7, i9));
            } else {
                lcVar.OooOoO0.getClass();
                objectAnimatorOooO00o = yx0.OooO00o(view, Oooo00o, gu0.OooO0oO(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            lcVar = this;
            lcVar.OooOoO0.getClass();
            objectAnimatorOooO00o = yx0.OooO00o(view, Oooo0, gu0.OooO0oO(i2, i4, i3, i5));
        } else {
            lcVar = this;
            kc kcVar = new kc(view);
            lcVar.OooOoO0.getClass();
            ObjectAnimator objectAnimatorOooO00o2 = yx0.OooO00o(kcVar, OooOooo, gu0.OooO0oO(i2, i4, i3, i5));
            lcVar.OooOoO0.getClass();
            ObjectAnimator objectAnimatorOooO00o3 = yx0.OooO00o(kcVar, Oooo000, gu0.OooO0oO(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOooO00o2, objectAnimatorOooO00o3);
            animatorSet.addListener(new ic(kcVar));
            objectAnimatorOooO00o = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            p53.OooO00o(viewGroup4, true);
            lcVar.OooOOOO().OooO00o(new jc(viewGroup4));
        }
        return objectAnimatorOooO00o;
    }

    @Override // com.cmaster.cloner.vo1
    public final String[] OooOOo0() {
        return OooOooO;
    }
}
