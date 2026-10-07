package com.cmaster.cloner;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class et extends Drawable implements Animatable {
    public static final hc OooOOOo = new hc(Float.class, "growFraction", 9);
    public final Context OooO0Oo;
    public final ld OooO0o0;
    public ObjectAnimator OooO0oO;
    public ObjectAnimator OooO0oo;
    public ArrayList OooOO0;
    public boolean OooOO0O;
    public float OooOO0o;
    public int OooOOO;
    public final float OooO = -1.0f;
    public final Paint OooOOO0 = new Paint();
    public final Rect OooOOOO = new Rect();
    public oOo00o00 OooO0o = new oOo00o00();

    public et(Context context, ld ldVar) {
        this.OooO0Oo = context;
        this.OooO0o0 = ldVar;
        setAlpha(255);
    }

    public final float OooO0O0() {
        ld ldVar = this.OooO0o0;
        if (ldVar.OooO0oO == 0 && ldVar.OooO0oo == 0) {
            return 1.0f;
        }
        return this.OooOO0o;
    }

    public final float OooO0OO() {
        float f = this.OooO;
        if (f > 0.0f) {
            return f;
        }
        boolean z = this instanceof yp;
        ld ldVar = this.OooO0o0;
        if (ldVar.OooO00o(z) && ldVar.OooOOO0 != 0) {
            oOo00o00 ooo00o00 = this.OooO0o;
            ContentResolver contentResolver = this.OooO0Oo.getContentResolver();
            ooo00o00.getClass();
            float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f2 > 0.0f) {
                float fUptimeMillis = (SystemClock.uptimeMillis() % r7) / ((int) ((((z ? ldVar.OooOO0 : ldVar.OooOO0O) * 1000.0f) / ldVar.OooOOO0) * f2));
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    public final boolean OooO0Oo(boolean z, boolean z2, boolean z3) {
        oOo00o00 ooo00o00 = this.OooO0o;
        ContentResolver contentResolver = this.OooO0Oo.getContentResolver();
        ooo00o00.getClass();
        return OooO0o0(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public final void OooO0o(t6 t6Var) {
        ArrayList arrayList = this.OooOO0;
        if (arrayList == null || !arrayList.contains(t6Var)) {
            return;
        }
        this.OooOO0.remove(t6Var);
        if (this.OooOO0.isEmpty()) {
            this.OooOO0 = null;
        }
    }

    public boolean OooO0o0(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.OooO0oO;
        int i = 0;
        hc hcVar = OooOOOo;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, hcVar, 0.0f, 1.0f);
            this.OooO0oO = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.OooO0oO.setInterpolator(oO0oO000.OooO0O0);
            ObjectAnimator objectAnimator2 = this.OooO0oO;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                ra.OooOOO("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.OooO0oO = objectAnimator2;
            objectAnimator2.addListener(new dt(this, i));
        }
        int i2 = 1;
        if (this.OooO0oo == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, hcVar, 1.0f, 0.0f);
            this.OooO0oo = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.OooO0oo.setInterpolator(oO0oO000.OooO0O0);
            ObjectAnimator objectAnimator3 = this.OooO0oo;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                ra.OooOOO("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.OooO0oo = objectAnimator3;
            objectAnimator3.addListener(new dt(this, i2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.OooO0oO : this.OooO0oo;
            ObjectAnimator objectAnimator5 = z ? this.OooO0oo : this.OooO0oO;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.OooOO0O;
                    this.OooOO0O = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.OooOO0O = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.OooOO0O;
                    this.OooOO0O = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.OooOO0O = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                ld ldVar = this.OooO0o0;
                if (!z ? ldVar.OooO0oo != 0 : ldVar.OooO0oO != 0) {
                    boolean z7 = this.OooOO0O;
                    this.OooOO0O = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.OooOO0O = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.OooOOO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.OooO0oO;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.OooO0oo;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.OooOOO = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.OooOOO0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return OooO0Oo(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        OooO0o0(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        OooO0o0(false, true, false);
    }
}
