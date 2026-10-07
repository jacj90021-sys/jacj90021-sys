package com.cmaster.cloner;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.Resources;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class c92 {
    public static final int[] OooO00o = {android.R.attr.stateListAnimator};

    public static void OooO00o(AppBarLayout appBarLayout, float f) throws Resources.NotFoundException {
        int integer = appBarLayout.getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, R.attr.state_liftable, -R.attr.state_lifted}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}
