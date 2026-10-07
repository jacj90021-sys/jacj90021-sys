package com.cmaster.cloner;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ooOOO0Oo implements Drawable.Callback {
    public final /* synthetic */ oO0OO00 OooO0Oo;

    public ooOOO0Oo(oO0OO00 oo0oo00) {
        this.OooO0Oo = oo0oo00;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.OooO0Oo.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.OooO0Oo.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.OooO0Oo.unscheduleSelf(runnable);
    }
}
