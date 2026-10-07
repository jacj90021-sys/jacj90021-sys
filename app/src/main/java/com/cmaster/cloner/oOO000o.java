package com.cmaster.cloner;

import android.window.BackEvent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOO000o {
    public static final oOO000o OooO00o = new oOO000o();

    public final BackEvent OooO00o(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float OooO0O0(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getProgress();
    }

    public final int OooO0OO(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getSwipeEdge();
    }

    public final float OooO0Oo(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchX();
    }

    public final float OooO0o0(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchY();
    }
}
