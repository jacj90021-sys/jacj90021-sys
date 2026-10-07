package com.cmaster.cloner;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yy1 {
    public xy1 OooO00o;

    public yy1(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.OooO00o = new wy1(o000OO.OooOOO0(i, interpolator, j));
        } else {
            this.OooO00o = new uy1(i, interpolator, j);
        }
    }
}
