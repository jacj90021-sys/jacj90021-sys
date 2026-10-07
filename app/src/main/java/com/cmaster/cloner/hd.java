package com.cmaster.cloner;

import android.animation.ObjectAnimator;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hd extends h {
    public final ld OooO;
    public ObjectAnimator OooO0o;
    public ObjectAnimator OooO0oO;
    public float OooOO0O;
    public float OooOO0o;
    public static final int[] OooOOO = {0, 1350, 2700, 4050};
    public static final int[] OooOOOO = {667, 2017, 3367, 4717};
    public static final int[] OooOOOo = {zzbcj.zzq.zzf, 2350, 3700, 5050};
    public static final hc OooOOo0 = new hc(Float.class, "animationFraction", 5);
    public static final hc OooOOo = new hc(Float.class, "completeEndFraction", 6);
    public int OooOO0 = 0;
    public t6 OooOOO0 = null;
    public final yy OooO0oo = new yy(1);

    public hd(ld ldVar) {
        this.OooO = ldVar;
    }

    @Override // com.cmaster.cloner.h
    public final void OooO0OO() {
        ObjectAnimator objectAnimator = this.OooO0o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.cmaster.cloner.h
    public final void OooOO0() {
        OooOOo0();
        ObjectAnimator objectAnimator = this.OooO0o;
        ld ldVar = this.OooO;
        objectAnimator.setDuration((long) (ldVar.OooOOO * 5400.0f));
        this.OooO0oO.setDuration((long) (ldVar.OooOOO * 333.0f));
        this.OooOO0 = 0;
        ((ft) ((ArrayList) this.OooO0o0).get(0)).OooO0OO = ldVar.OooO0o0[0];
        this.OooOO0o = 0.0f;
    }

    @Override // com.cmaster.cloner.h
    public final void OooOO0o(t6 t6Var) {
        this.OooOOO0 = t6Var;
    }

    @Override // com.cmaster.cloner.h
    public final void OooOOO0() {
        ObjectAnimator objectAnimator = this.OooO0oO;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((eg0) this.OooO0Oo).isVisible()) {
            this.OooO0oO.start();
        } else {
            OooO0OO();
        }
    }

    @Override // com.cmaster.cloner.h
    public final void OooOOOO() {
        OooOOo0();
        this.OooOO0 = 0;
        ((ft) ((ArrayList) this.OooO0o0).get(0)).OooO0OO = this.OooO.OooO0o0[0];
        this.OooOO0o = 0.0f;
        this.OooO0o.start();
    }

    @Override // com.cmaster.cloner.h
    public final void OooOOOo() {
        this.OooOOO0 = null;
    }

    public final void OooOOo0() {
        ObjectAnimator objectAnimator = this.OooO0o;
        ld ldVar = this.OooO;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, OooOOo0, 0.0f, 1.0f);
            this.OooO0o = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (ldVar.OooOOO * 5400.0f));
            this.OooO0o.setInterpolator(null);
            this.OooO0o.setRepeatCount(-1);
            this.OooO0o.addListener(new gd(this, 0));
        }
        if (this.OooO0oO == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, OooOOo, 0.0f, 1.0f);
            this.OooO0oO = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (ldVar.OooOOO * 333.0f));
            this.OooO0oO.setInterpolator(this.OooO0oo);
            this.OooO0oO.addListener(new gd(this, 1));
        }
    }
}
