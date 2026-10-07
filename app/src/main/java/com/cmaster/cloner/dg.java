package com.cmaster.cloner;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dg implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long OooO0Oo = SystemClock.uptimeMillis() + 10000;
    public boolean OooO0o = false;
    public Runnable OooO0o0;
    public final /* synthetic */ oOOO00 OooO0oO;

    public dg(oOOO00 oooo00) {
        this.OooO0oO = oooo00;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.OooO0o0 = runnable;
        View decorView = this.OooO0oO.getWindow().getDecorView();
        if (!this.OooO0o) {
            decorView.postOnAnimation(new o00OOOOo(this, 6));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.OooO0o0;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.OooO0Oo) {
                this.OooO0o = false;
                this.OooO0oO.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.OooO0o0 = null;
        oh1 oh1Var = this.OooO0oO.OooOOO0;
        synchronized (oh1Var.OooO0o) {
            z = oh1Var.OooO0o0;
        }
        if (z) {
            this.OooO0o = false;
            this.OooO0oO.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.OooO0oO.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
