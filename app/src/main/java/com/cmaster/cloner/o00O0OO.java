package com.cmaster.cloner;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00O0OO extends s implements oo0oOO0 {
    public final /* synthetic */ o00O0OOO OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(o00O0OOO o00o0ooo, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.OooO0oO = o00o0ooo;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        r43.OooO00o(this, getContentDescription());
        setOnTouchListener(new o00O0O0(this, this));
    }

    @Override // com.cmaster.cloner.oo0oOO0
    public final boolean OooO0O0() {
        return false;
    }

    @Override // com.cmaster.cloner.oo0oOO0
    public final boolean OooO0OO() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.OooO0oO.OooOO0o();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
