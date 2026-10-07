package com.cmaster.cloner;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fi1 {
    public final Drawable OooO0Oo;
    public final rr2 OooO0o0;
    public final float OooO0oo;
    public gi1 OooOO0O;
    public float OooOO0o;
    public boolean OooOOO0;
    public static final yt OooOOO = new yt(1);
    public static final yt OooOOOO = new yt(2);
    public static final yt OooOOOo = new yt(3);
    public static final yt OooOOo0 = new yt(4);
    public static final yt OooOOo = new yt(5);
    public static final yt OooOOoo = new yt(0);
    public float OooO00o = 0.0f;
    public float OooO0O0 = Float.MAX_VALUE;
    public boolean OooO0OO = false;
    public boolean OooO0o = false;
    public long OooO0oO = 0;
    public final ArrayList OooO = new ArrayList();
    public final ArrayList OooOO0 = new ArrayList();

    public fi1(Drawable drawable, rr2 rr2Var) {
        this.OooO0Oo = drawable;
        this.OooO0o0 = rr2Var;
        if (rr2Var == OooOOOo || rr2Var == OooOOo0 || rr2Var == OooOOo) {
            this.OooO0oo = 0.1f;
        } else if (rr2Var == OooOOoo) {
            this.OooO0oo = 0.00390625f;
        } else if (rr2Var == OooOOO || rr2Var == OooOOOO) {
            this.OooO0oo = 0.002f;
        } else {
            this.OooO0oo = 1.0f;
        }
        this.OooOO0O = null;
        this.OooOO0o = Float.MAX_VALUE;
        this.OooOOO0 = false;
    }

    public static oO0o0000 OooO0O0() {
        ThreadLocal threadLocal = oO0o0000.OooO;
        if (threadLocal.get() == null) {
            threadLocal.set(new oO0o0000(new e81(3)));
        }
        return (oO0o0000) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [com.cmaster.cloner.oO0OO0O, java.lang.Object] */
    public final void OooO00o(float f) {
        if (this.OooO0o) {
            this.OooOO0o = f;
            return;
        }
        if (this.OooOO0O == null) {
            this.OooOO0O = new gi1(f);
        }
        gi1 gi1Var = this.OooOO0O;
        double d = f;
        gi1Var.OooO = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            sa.OooO0oO("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < -3.4028234663852886E38d) {
            sa.OooO0oO("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.OooO0oo * 0.75f);
        gi1Var.OooO0Oo = dAbs;
        gi1Var.OooO0o0 = dAbs * 62.5d;
        e81 e81Var = OooO0O0().OooO0o0;
        e81Var.getClass();
        if (Thread.currentThread() != ((Looper) e81Var.OooO0o).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.OooO0o;
        if (z || z) {
            return;
        }
        this.OooO0o = true;
        if (!this.OooO0OO) {
            this.OooO0O0 = this.OooO0o0.OooO00o(this.OooO0Oo);
        }
        float f2 = this.OooO0O0;
        if (f2 > Float.MAX_VALUE || f2 < -3.4028235E38f) {
            ra.OooOOO("Starting value need to be in between min value and max value");
            return;
        }
        oO0o0000 oo0o0000OooO0O0 = OooO0O0();
        ArrayList arrayList = oo0o0000OooO0O0.OooO0O0;
        if (arrayList.size() == 0) {
            ((Choreographer) oo0o0000OooO0O0.OooO0o0.OooO0o0).postFrameCallback(new oO0Oo0o0(oo0o0000OooO0O0.OooO0Oo));
            if (Build.VERSION.SDK_INT >= 33) {
                oo0o0000OooO0O0.OooO0oO = ValueAnimator.getDurationScale();
                if (oo0o0000OooO0O0.OooO0oo == null) {
                    oo0o0000OooO0O0.OooO0oo = new o0O000O(3, (Object) oo0o0000OooO0O0, false);
                }
                final o0O000O o0o000o = oo0o0000OooO0O0.OooO0oo;
                if (((ValueAnimator.DurationScaleChangeListener) o0o000o.OooO0o0) == null) {
                    ValueAnimator.DurationScaleChangeListener r1 = new ValueAnimator.DurationScaleChangeListener() {
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f3) {
                            ((oO0o0000) o0o000o.OooO0o).OooO0oO = f3;
                        }
                    };
                    o0o000o.OooO0o0 = r1;
                    ValueAnimator.registerDurationScaleChangeListener(r1);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void OooO0OO(float f) {
        this.OooO0o0.OooO0O0(this.OooO0Oo, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooOO0;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                ra.OooOO0o();
                return;
            }
            i++;
        }
    }

    public final void OooO0Oo() {
        if (this.OooOO0O.OooO0O0 <= 0.0d) {
            sa.OooO0oO("Spring animations can only come to an end when there is damping");
            return;
        }
        e81 e81Var = OooO0O0().OooO0o0;
        e81Var.getClass();
        if (Thread.currentThread() != ((Looper) e81Var.OooO0o).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.OooO0o) {
            this.OooOOO0 = true;
        }
    }
}
