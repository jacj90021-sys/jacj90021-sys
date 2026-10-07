package com.cmaster.cloner;

import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pt1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int OooO0Oo;

    public /* synthetic */ pt1(int i) {
        this.OooO0Oo = i;
    }

    private final void OooO00o(View view) {
    }

    private final void OooO0O0(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.OooO0Oo) {
            case 0:
                (view != null ? (rt1) view.getTag(R.id.dataBinding) : null).OooO0o0.run();
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                view.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.OooO0Oo;
    }
}
