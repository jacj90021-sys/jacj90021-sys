package com.cmaster.cloner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y extends SeekBar {
    public final z OooO0Oo;

    public y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        sm1.OooO00o(getContext(), this);
        z zVar = new z(this);
        this.OooO0Oo = zVar;
        zVar.Oooo0oO(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        z zVar = this.OooO0Oo;
        y yVar = zVar.OooO0oo;
        Drawable drawable = zVar.OooO;
        if (drawable != null && drawable.isStateful() && drawable.setState(yVar.getDrawableState())) {
            yVar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.OooO0Oo.OooO;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.OooO0Oo.Ooooo0o(canvas);
    }
}
