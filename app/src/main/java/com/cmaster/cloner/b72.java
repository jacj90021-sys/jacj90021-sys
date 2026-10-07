package com.cmaster.cloner;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b72 extends Thread {
    public final WeakReference OooO0Oo;
    public final long OooO0o0;
    public final CountDownLatch OooO0o = new CountDownLatch(1);
    public boolean OooO0oO = false;

    public b72(oO00O0oO oo00o0oo, long j) {
        this.OooO0Oo = new WeakReference(oo00o0oo);
        this.OooO0o0 = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        oO00O0oO oo00o0oo;
        WeakReference weakReference = this.OooO0Oo;
        try {
            if (this.OooO0o.await(this.OooO0o0, TimeUnit.MILLISECONDS) || (oo00o0oo = (oO00O0oO) weakReference.get()) == null) {
                return;
            }
            oo00o0oo.OooO0OO();
            this.OooO0oO = true;
        } catch (InterruptedException unused) {
            oO00O0oO oo00o0oo2 = (oO00O0oO) weakReference.get();
            if (oo00o0oo2 != null) {
                oo00o0oo2.OooO0OO();
                this.OooO0oO = true;
            }
        }
    }
}
