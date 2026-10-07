package com.cmaster.cloner;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cy implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View OooO0Oo;
    public final /* synthetic */ dy OooO0o;
    public final /* synthetic */ int OooO0o0;
    public final /* synthetic */ ExpandableBehavior OooO0oO;

    public cy(ExpandableBehavior expandableBehavior, View view, int i, dy dyVar) {
        this.OooO0oO = expandableBehavior;
        this.OooO0Oo = view;
        this.OooO0o0 = i;
        this.OooO0o = dyVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.OooO0Oo;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.OooO0oO;
        if (expandableBehavior.OooO00o == this.OooO0o0) {
            Object obj = this.OooO0o;
            expandableBehavior.OooOo0o((View) obj, view, ((FloatingActionButton) obj).OooOOo.OooO00o, false);
        }
        return false;
    }
}
