package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class x40 extends Drawable implements Animatable {
    public int OooO;
    public final ooo0o OooO0Oo;
    public boolean OooO0o;
    public boolean OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo = true;
    public final int OooOO0 = -1;
    public boolean OooOO0O;
    public Paint OooOO0o;
    public Rect OooOOO0;

    public x40(ooo0o ooo0oVar) {
        this.OooO0Oo = ooo0oVar;
    }

    public final void OooO00o() {
        zx2.OooO00o("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.OooO0oO);
        d50 d50Var = (d50) this.OooO0Oo.OooO0O0;
        if (d50Var.OooO00o.OooOO0o.OooO0OO == 1) {
            invalidateSelf();
            return;
        }
        if (this.OooO0o0) {
            return;
        }
        this.OooO0o0 = true;
        ArrayList arrayList = d50Var.OooO0OO;
        if (d50Var.OooOO0) {
            qa.OooO0o("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            qa.OooO0o("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !d50Var.OooO0o) {
            d50Var.OooO0o = true;
            d50Var.OooOO0 = false;
            d50Var.OooO00o();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.OooO0oO) {
            return;
        }
        if (this.OooOO0O) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.OooOOO0 == null) {
                this.OooOOO0 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.OooOOO0);
            this.OooOO0O = false;
        }
        d50 d50Var = (d50) this.OooO0Oo.OooO0O0;
        b50 b50Var = d50Var.OooO;
        Bitmap bitmap = b50Var != null ? b50Var.OooOO0 : d50Var.OooOO0o;
        if (this.OooOOO0 == null) {
            this.OooOOO0 = new Rect();
        }
        Rect rect = this.OooOOO0;
        if (this.OooOO0o == null) {
            this.OooOO0o = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.OooOO0o);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.OooO0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((d50) this.OooO0Oo.OooO0O0).OooOOOo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((d50) this.OooO0Oo.OooO0O0).OooOOOO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.OooOO0O = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.OooOO0o == null) {
            this.OooOO0o = new Paint(2);
        }
        this.OooOO0o.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.OooOO0o == null) {
            this.OooOO0o = new Paint(2);
        }
        this.OooOO0o.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        zx2.OooO00o("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.OooO0oO);
        this.OooO0oo = z;
        if (!z) {
            this.OooO0o0 = false;
            d50 d50Var = (d50) this.OooO0Oo.OooO0O0;
            ArrayList arrayList = d50Var.OooO0OO;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                d50Var.OooO0o = false;
            }
        } else if (this.OooO0o) {
            OooO00o();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.OooO0o = true;
        this.OooO = 0;
        if (this.OooO0oo) {
            OooO00o();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.OooO0o = false;
        this.OooO0o0 = false;
        d50 d50Var = (d50) this.OooO0Oo.OooO0O0;
        ArrayList arrayList = d50Var.OooO0OO;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            d50Var.OooO0o = false;
        }
    }
}
