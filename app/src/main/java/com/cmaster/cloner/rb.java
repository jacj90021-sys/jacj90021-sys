package com.cmaster.cloner;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rb implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ rb(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    private final void OooO00o(View view) {
    }

    private final void OooO0O0(View view) {
    }

    private final void OooO0OO(View view) {
    }

    private final void OooO0Oo(View view) {
    }

    private final void OooO0o0(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 1:
                iw iwVar = (iw) obj;
                AccessibilityManager accessibilityManager = iwVar.OooOo0o;
                if (iwVar.OooOo != null && accessibilityManager != null && iwVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(iwVar.OooOo);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = nt1.OooO00o;
                dt1.OooO0OO(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                ub ubVar = (ub) obj;
                ViewTreeObserver viewTreeObserver = ubVar.OooOoOO;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        ubVar.OooOoOO = view.getViewTreeObserver();
                    }
                    ubVar.OooOoOO.removeGlobalOnLayoutListener(ubVar.OooOO0o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                iw iwVar = (iw) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = iwVar.OooOo;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = iwVar.OooOo0o) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                q70 q70Var = hideBottomViewOnScrollBehavior.OooO0oo;
                if (q70Var != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.OooO0oO) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(q70Var);
                    hideBottomViewOnScrollBehavior.OooO0oo = null;
                    break;
                }
                break;
            case 4:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                q70 q70Var2 = hideViewOnScrollBehavior.OooO0OO;
                if (q70Var2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.OooO0O0) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(q70Var2);
                    hideViewOnScrollBehavior.OooO0OO = null;
                    break;
                }
                break;
            default:
                oi1 oi1Var = (oi1) obj;
                ViewTreeObserver viewTreeObserver2 = oi1Var.OooOOo;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        oi1Var.OooOOo = view.getViewTreeObserver();
                    }
                    oi1Var.OooOOo.removeGlobalOnLayoutListener(oi1Var.OooOO0o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
