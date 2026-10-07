package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ru0 {
    public final gh1 OooO00o = new gh1(0);
    public final gh1 OooO0O0 = new gh1(0);

    public static ru0 OooO00o(Context context, int i) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return OooO0O0(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return OooO0O0(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static ru0 OooO0O0(ArrayList arrayList) {
        ru0 ru0Var = new ru0();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                sa.OooOO0o(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            ru0Var.OooO0O0.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            su0 su0Var = new su0();
            su0Var.OooO0Oo = 0;
            su0Var.OooO0o0 = 1;
            su0Var.OooO00o = startDelay;
            su0Var.OooO0O0 = duration;
            su0Var.OooO0OO = interpolator;
            su0Var.OooO0Oo = objectAnimator.getRepeatCount();
            su0Var.OooO0o0 = objectAnimator.getRepeatMode();
            ru0Var.OooO00o.put(propertyName, su0Var);
        }
        return ru0Var;
    }

    public final su0 OooO0OO(String str) {
        gh1 gh1Var = this.OooO00o;
        if (gh1Var.get(str) != null) {
            return (su0) gh1Var.get(str);
        }
        qa.OooOO0();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ru0) {
            return this.OooO00o.equals(((ru0) obj).OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO00o.hashCode();
    }

    public final String toString() {
        return "\n" + ru0.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.OooO00o + "}\n";
    }
}
