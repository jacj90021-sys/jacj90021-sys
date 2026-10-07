package com.cmaster.cloner;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j10 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ k10 OooO0o0;

    public /* synthetic */ j10(k10 k10Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = k10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        k10 k10Var = this.OooO0o0;
        switch (i) {
            case 0:
                ViewParent parent = k10Var.OooO0oO.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                k10Var.OooO00o();
                View view = k10Var.OooO0oO;
                if (view.isEnabled() && !view.isLongClickable() && k10Var.OooO0OO()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    k10Var.OooOO0 = true;
                    break;
                }
                break;
        }
    }
}
