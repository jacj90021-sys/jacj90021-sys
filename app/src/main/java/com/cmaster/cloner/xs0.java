package com.cmaster.cloner;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xs0 extends FrameLayout implements me {
    public final CollapsibleActionView OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    public xs0(View view) {
        super(view.getContext());
        this.OooO0Oo = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // com.cmaster.cloner.me
    public final void onActionViewCollapsed() {
        this.OooO0Oo.onActionViewCollapsed();
    }

    @Override // com.cmaster.cloner.me
    public final void onActionViewExpanded() {
        this.OooO0Oo.onActionViewExpanded();
    }
}
