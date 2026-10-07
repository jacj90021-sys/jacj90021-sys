package com.cmaster.cloner;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r10 extends AnimationSet implements Runnable {
    public final ViewGroup OooO0Oo;
    public boolean OooO0o;
    public final View OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;

    public r10(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.OooO0oo = true;
        this.OooO0Oo = viewGroup;
        this.OooO0o0 = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.OooO0oo = true;
        if (this.OooO0o) {
            return !this.OooO0oO;
        }
        if (!super.getTransformation(j, transformation)) {
            this.OooO0o = true;
            lz0.OooO00o(this.OooO0Oo, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.OooO0o;
        ViewGroup viewGroup = this.OooO0Oo;
        if (z || !this.OooO0oo) {
            viewGroup.endViewTransition(this.OooO0o0);
            this.OooO0oO = true;
        } else {
            this.OooO0oo = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.OooO0oo = true;
        if (this.OooO0o) {
            return !this.OooO0oO;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.OooO0o = true;
            lz0.OooO00o(this.OooO0Oo, this);
        }
        return true;
    }
}
