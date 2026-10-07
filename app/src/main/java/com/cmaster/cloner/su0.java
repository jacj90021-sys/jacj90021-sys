package com.cmaster.cloner;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class su0 {
    public long OooO00o;
    public TimeInterpolator OooO0OO = null;
    public int OooO0Oo = 0;
    public int OooO0o0 = 1;
    public long OooO0O0 = 150;

    public su0(long j) {
        this.OooO00o = j;
    }

    public final void OooO00o(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.OooO00o);
        objectAnimator.setDuration(this.OooO0O0);
        objectAnimator.setInterpolator(OooO0O0());
        objectAnimator.setRepeatCount(this.OooO0Oo);
        objectAnimator.setRepeatMode(this.OooO0o0);
    }

    public final TimeInterpolator OooO0O0() {
        TimeInterpolator timeInterpolator = this.OooO0OO;
        return timeInterpolator != null ? timeInterpolator : oO0oO000.OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su0)) {
            return false;
        }
        su0 su0Var = (su0) obj;
        if (this.OooO00o == su0Var.OooO00o && this.OooO0O0 == su0Var.OooO0O0 && this.OooO0Oo == su0Var.OooO0Oo && this.OooO0o0 == su0Var.OooO0o0) {
            return OooO0O0().getClass().equals(su0Var.OooO0O0().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.OooO00o;
        long j2 = this.OooO0O0;
        return ((((OooO0O0().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.OooO0Oo) * 31) + this.OooO0o0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(su0.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.OooO00o);
        sb.append(" duration: ");
        sb.append(this.OooO0O0);
        sb.append(" interpolator: ");
        sb.append(OooO0O0().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.OooO0Oo);
        sb.append(" repeatMode: ");
        return rj.OooO0o(sb, this.OooO0o0, "}\n");
    }
}
