package com.cmaster.cloner;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yp extends et {
    public static final xp OooOoo0 = new xp();
    public final gi1 OooOOo;
    public final fd OooOOo0;
    public final fi1 OooOOoo;
    public ValueAnimator OooOo;
    public float OooOo0;
    public final ft OooOo00;
    public boolean OooOo0O;
    public final ValueAnimator OooOo0o;
    public TimeInterpolator OooOoO;
    public TimeInterpolator OooOoO0;
    public TimeInterpolator OooOoOO;

    public yp(Context context, ld ldVar, fd fdVar) {
        super(context, ldVar);
        this.OooOo0O = false;
        this.OooOOo0 = fdVar;
        ft ftVar = new ft();
        this.OooOo00 = ftVar;
        ftVar.OooO0oO = true;
        gi1 gi1Var = new gi1();
        this.OooOOo = gi1Var;
        gi1Var.OooO00o(1.0f);
        gi1Var.OooO0O0(50.0f);
        fi1 fi1Var = new fi1(this, OooOoo0);
        this.OooOOoo = fi1Var;
        fi1Var.OooOO0O = gi1Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.OooOo0o = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new oOO0Oo00(this, ldVar, 1));
        if (ldVar.OooO00o(true) && ldVar.OooOOO0 != 0) {
            valueAnimator.start();
        }
        if (this.OooOO0o != 1.0f) {
            this.OooOO0o = 1.0f;
            invalidateSelf();
        }
    }

    @Override // com.cmaster.cloner.et
    public final boolean OooO0o0(boolean z, boolean z2, boolean z3) {
        boolean zOooO0o0 = super.OooO0o0(z, z2, z3);
        oOo00o00 ooo00o00 = this.OooO0o;
        ContentResolver contentResolver = this.OooO0Oo.getContentResolver();
        ooo00o00.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.OooOo0O = true;
            return zOooO0o0;
        }
        this.OooOo0O = false;
        this.OooOOo.OooO0O0(50.0f / f);
        return zOooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.OooOOOO)) {
            canvas.save();
            Rect bounds = getBounds();
            float fOooO0O0 = OooO0O0();
            ObjectAnimator objectAnimator = this.OooO0oO;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.OooO0oo;
            this.OooOOo0.OooO0O0(canvas, bounds, fOooO0O0, z, objectAnimator2 != null && objectAnimator2.isRunning());
            float fOooO0OO = OooO0OO();
            ft ftVar = this.OooOo00;
            ftVar.OooO0o0 = fOooO0OO;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.OooOOO0;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            ld ldVar = this.OooO0o0;
            ftVar.OooO0OO = ldVar.OooO0o0[0];
            int i = ldVar.OooO;
            if (i > 0) {
                this.OooOOo0.OooO0o(canvas, paint, ftVar.OooO0O0, 1.0f, ldVar.OooO0o, this.OooOOO, (int) ((cw2.OooO00o(ftVar.OooO0O0, 0.0f, 0.01f) * i) / 0.01f));
            } else {
                this.OooOOo0.OooO0o(canvas, paint, 0.0f, 1.0f, ldVar.OooO0o, this.OooOOO, 0);
            }
            int i2 = this.OooOOO;
            fd fdVar = this.OooOOo0;
            fdVar.OooO0o0(canvas, paint, ftVar, i2);
            int i3 = ldVar.OooO0o0[0];
            fdVar.getClass();
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.OooOOo0.OooO0oO();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.OooOOo0.OooO0oO();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.OooOOoo.OooO0Oo();
        this.OooOo00.OooO0O0 = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i;
        float f2 = (f < 1000.0f || f > 9000.0f) ? 0.0f : 1.0f;
        boolean z = this.OooOo0O;
        ft ftVar = this.OooOo00;
        fi1 fi1Var = this.OooOOoo;
        if (!z) {
            fi1Var.OooO0O0 = ftVar.OooO0O0 * 10000.0f;
            fi1Var.OooO0OO = true;
            fi1Var.OooO00o(f);
            return true;
        }
        fi1Var.OooO0Oo();
        ftVar.OooO0O0 = f / 10000.0f;
        invalidateSelf();
        ftVar.OooO0Oo = f2;
        invalidateSelf();
        return true;
    }
}
