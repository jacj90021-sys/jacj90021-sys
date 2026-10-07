package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOO00O extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ oOO00O(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.OooOoO = null;
                actionBarOverlayLayout.OooOOO0 = false;
                break;
            case 5:
                super.onAnimationCancel(animator);
                ((ez) obj).OooOo00 = false;
                break;
            case 12:
                o93 o93Var = (o93) obj;
                o93Var.setEnabled(true);
                o93Var.OooO0Oo.setEnabled(true);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.OooOoO = null;
                actionBarOverlayLayout.OooOOO0 = false;
                break;
            case 1:
                oO0OO00 oo0oo00 = (oO0OO00) obj;
                ArrayList arrayList = new ArrayList(oo0oo00.OooO0oo);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((t6) arrayList.get(i2)).OooO00o(oo0oo00);
                }
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.Oooo0OO(5);
                WeakReference weakReference = bottomSheetBehavior.OoooOOO;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.OoooOOO.get()).requestLayout();
                    break;
                }
                break;
            case 3:
                tt ttVar = (tt) obj;
                ttVar.OooOOOo();
                ttVar.OooOOo.start();
                break;
            case 4:
                ((ExpandableTransformationBehavior) obj).OooO0O0 = null;
                break;
            case 5:
                super.onAnimationEnd(animator);
                ((ez) obj).OooOo00 = false;
                break;
            case 6:
                n00 n00Var = (n00) obj;
                n00Var.OooOOo = 0;
                n00Var.OooOOO0 = null;
                break;
            case 7:
                ((HideBottomViewOnScrollBehavior) obj).OooOO0O = null;
                break;
            case 8:
                ((HideViewOnScrollBehavior) obj).OooOO0O = null;
                break;
            case 9:
                hq0 hq0Var = (hq0) obj;
                hq0Var.OooO0O0.setTranslationY(0.0f);
                hq0Var.OooO0O0(0.0f);
                break;
            case 10:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.OooOo(5);
                WeakReference weakReference2 = sideSheetBehavior.OooOOOo;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.OooOOOo.get()).requestLayout();
                    break;
                }
                break;
            case 11:
                ((vo1) obj).OooOOO0();
                animator.removeListener(this);
                break;
            default:
                o93 o93Var = (o93) obj;
                o93Var.setEnabled(true);
                o93Var.OooO0Oo.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 1:
                oO0OO00 oo0oo00 = (oO0OO00) obj;
                ArrayList arrayList = new ArrayList(oo0oo00.OooO0oo);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((t6) arrayList.get(i2)).OooO0O0(oo0oo00);
                }
                break;
            case 6:
                n00 n00Var = (n00) obj;
                n00Var.OooOOoo.OooO00o(0, false);
                n00Var.OooOOo = 2;
                n00Var.OooOOO0 = animator;
                break;
            case 12:
                o93 o93Var = (o93) obj;
                o93Var.setEnabled(false);
                o93Var.OooO0Oo.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
