package com.cmaster.cloner;

import android.app.ApplicationExitInfo;
import android.content.pm.InstallSourceInfo;
import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o000OO {
    public static /* bridge */ /* synthetic */ ApplicationExitInfo OooO0o(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* bridge */ /* synthetic */ InstallSourceInfo OooO0oO(Object obj) {
        return (InstallSourceInfo) obj;
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds OooOO0o(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation OooOOO(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ WindowInsetsAnimation OooOOO0(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* synthetic */ void OooOo0() {
    }
}
