package com.cmaster.cloner;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00O00 extends Drawable {
    public final ActionBarContainer OooO00o;

    public o00O00(ActionBarContainer actionBarContainer) {
        this.OooO00o = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.OooO00o;
        if (actionBarContainer.OooOO0) {
            Drawable drawable = actionBarContainer.OooO;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.OooO0oO;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.OooO0oo;
        if (drawable3 == null || !actionBarContainer.OooOO0O) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.OooO00o;
        if (actionBarContainer.OooOO0) {
            if (actionBarContainer.OooO != null) {
                actionBarContainer.OooO0oO.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.OooO0oO;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
