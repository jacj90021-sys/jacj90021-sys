package com.cmaster.cloner;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOo0oooO extends Animatable2.AnimationCallback {
    public final /* synthetic */ t6 OooO00o;

    public oOo0oooO(t6 t6Var) {
        this.OooO00o = t6Var;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.OooO00o.OooO00o(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.OooO00o.OooO0O0(drawable);
    }
}
