package com.cmaster.cloner;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class q70 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ View OooO0O0;
    public final /* synthetic */ lj OooO0OO;

    public /* synthetic */ q70(lj ljVar, View view, int i) {
        this.OooO00o = i;
        this.OooO0OO = ljVar;
        this.OooO0O0 = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.OooO00o;
        View view = this.OooO0O0;
        lj ljVar = this.OooO0OO;
        switch (i) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) ljVar;
                if (z && hideBottomViewOnScrollBehavior.OooOO0 == 1) {
                    hideBottomViewOnScrollBehavior.OooOo0o(view);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) ljVar;
                if (z && hideViewOnScrollBehavior.OooOO0 == 1) {
                    hideViewOnScrollBehavior.OooOo(view);
                    break;
                }
                break;
        }
    }
}
