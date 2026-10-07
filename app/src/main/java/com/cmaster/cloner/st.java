package com.cmaster.cloner;

import android.view.accessibility.AccessibilityManager;

public final class st implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final tt OooO00o;

    public st(tt ttVar) {
        this.OooO00o = ttVar;
    }

    @Override
    public final void onTouchExplorationStateChanged(boolean z) {
        tt ttVar = this.OooO00o;
        if (ttVar.OooO0oo == null) {
            return;
        }
        if (ttVar.OooO0oo.getInputType() != 0) {
            return;
        }
        ttVar.OooO0Oo.setImportantForAccessibility(z ? 2 : 1);
    }
}