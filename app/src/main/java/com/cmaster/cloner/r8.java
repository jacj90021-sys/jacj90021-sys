package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r8 extends Drawable {
    public int OooO;
    public final Paint OooO0O0;
    public float OooO0oo;
    public int OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public int OooOOO0;
    public ag1 OooOOOO;
    public ColorStateList OooOOOo;
    public final cg1 OooO00o = bg1.OooO00o;
    public final Path OooO0OO = new Path();
    public final Rect OooO0Oo = new Rect();
    public final RectF OooO0o0 = new RectF();
    public final RectF OooO0o = new RectF();
    public final ooo0o OooO0oO = new ooo0o(this);
    public boolean OooOOO = true;

    public r8(ag1 ag1Var) {
        this.OooOOOO = ag1Var;
        Paint paint = new Paint(1);
        this.OooO0O0 = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.OooOOO;
        Rect rect = this.OooO0Oo;
        Paint paint = this.OooO0O0;
        if (z) {
            copyBounds(rect);
            float fHeight = this.OooO0oo / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{ye.OooO0O0(this.OooO, this.OooOOO0), ye.OooO0O0(this.OooOO0, this.OooOOO0), ye.OooO0O0(ye.OooO0Oo(this.OooOO0, 0), this.OooOOO0), ye.OooO0O0(ye.OooO0Oo(this.OooOO0o, 0), this.OooOOO0), ye.OooO0O0(this.OooOO0o, this.OooOOO0), ye.OooO0O0(this.OooOO0O, this.OooOOO0)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.OooOOO = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.OooO0o0;
        rectF.set(rect);
        qj qjVar = this.OooOOOO.OooO0o0;
        Rect bounds = getBounds();
        RectF rectF2 = this.OooO0o;
        rectF2.set(bounds);
        float fMin = Math.min(qjVar.OooO00o(rectF2), rectF.width() / 2.0f);
        ag1 ag1Var = this.OooOOOO;
        rectF2.set(getBounds());
        if (ag1Var.OooO0o0(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.OooO0oO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.OooO0oo > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ag1 ag1Var = this.OooOOOO;
        Rect bounds = getBounds();
        RectF rectF = this.OooO0o;
        rectF.set(bounds);
        if (ag1Var.OooO0o0(rectF)) {
            qj qjVar = this.OooOOOO.OooO0o0;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), qjVar.OooO00o(rectF));
            return;
        }
        Rect rect = this.OooO0Oo;
        copyBounds(rect);
        RectF rectF2 = this.OooO0o0;
        rectF2.set(rect);
        ag1 ag1Var2 = this.OooOOOO;
        cg1 cg1Var = this.OooO00o;
        Path path = this.OooO0OO;
        cg1Var.OooO00o(ag1Var2, null, 1.0f, rectF2, null, path);
        mq2.OooO0O0(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        ag1 ag1Var = this.OooOOOO;
        Rect bounds = getBounds();
        RectF rectF = this.OooO0o;
        rectF.set(bounds);
        if (!ag1Var.OooO0o0(rectF)) {
            return true;
        }
        int iRound = Math.round(this.OooO0oo);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.OooOOOo;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.OooOOO = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.OooOOOo;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.OooOOO0)) != this.OooOOO0) {
            this.OooOOO = true;
            this.OooOOO0 = colorForState;
        }
        if (this.OooOOO) {
            invalidateSelf();
        }
        return this.OooOOO;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.OooO0O0.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.OooO0O0.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
