package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class rm2 {
    public static void OooO00o(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }
}
