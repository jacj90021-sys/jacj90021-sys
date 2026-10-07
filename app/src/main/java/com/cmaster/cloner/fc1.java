package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fc1 extends Drawable {
    public PorterDuffColorFilter OooO;
    public float OooO00o;
    public final Paint OooO0O0;
    public final RectF OooO0OO;
    public final Rect OooO0Oo;
    public float OooO0o0;
    public ColorStateList OooO0oo;
    public ColorStateList OooOO0;
    public boolean OooO0o = false;
    public boolean OooO0oO = true;
    public PorterDuff.Mode OooOO0O = PorterDuff.Mode.SRC_IN;

    public fc1(ColorStateList colorStateList, float f) {
        this.OooO00o = f;
        Paint paint = new Paint(5);
        this.OooO0O0 = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.OooO0oo = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.OooO0oo.getDefaultColor()));
        this.OooO0OO = new RectF();
        this.OooO0Oo = new Rect();
    }

    public final PorterDuffColorFilter OooO00o(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void OooO0O0(Rect rect) {
        float f;
        if (rect == null) {
            rect = getBounds();
        }
        float f2 = rect.left;
        float f3 = rect.top;
        float f4 = rect.right;
        float f5 = rect.bottom;
        RectF rectF = this.OooO0OO;
        rectF.set(f2, f3, f4, f5);
        Rect rect2 = this.OooO0Oo;
        rect2.set(rect);
        if (this.OooO0o) {
            float f6 = this.OooO0o0;
            float f7 = this.OooO00o;
            boolean z = this.OooO0oO;
            if (z) {
                f = (float) (((1.0d - gc1.OooO00o) * f7) + (1.5f * f6));
            } else {
                int i = gc1.OooO0O0;
                f = 1.5f * f6;
            }
            if (z) {
                f6 = (float) (((1.0d - gc1.OooO00o) * f7) + f6);
            }
            rect2.inset((int) Math.ceil(f6), (int) Math.ceil(f));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.OooO;
        Paint paint = this.OooO0O0;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.OooO);
            z = true;
        }
        RectF rectF = this.OooO0OO;
        float f = this.OooO00o;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.OooO0Oo, this.OooO00o);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.OooOO0;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.OooO0oo;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        OooO0O0(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.OooO0oo;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.OooO0O0;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.OooOO0;
        if (colorStateList2 == null || (mode = this.OooOO0O) == null) {
            return z;
        }
        this.OooO = OooO00o(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.OooO0O0.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.OooO0O0.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.OooOO0 = colorStateList;
        this.OooO = OooO00o(colorStateList, this.OooOO0O);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.OooOO0O = mode;
        this.OooO = OooO00o(this.OooOO0, mode);
        invalidateSelf();
    }
}
