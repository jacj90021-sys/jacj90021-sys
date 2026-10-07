package com.cmaster.cloner;

import android.os.IBinder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yz1 implements IBinder.DeathRecipient {
    public final IBinder OooO0Oo;
    public final /* synthetic */ a02 OooO0o;
    public boolean OooO0o0;

    public yz1(a02 a02Var, IBinder iBinder) {
        this.OooO0o = a02Var;
        this.OooO0Oo = iBinder;
        try {
            iBinder.linkToDeath(this, 0);
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        synchronized (this.OooO0o) {
            try {
                if (this.OooO0o0) {
                    return;
                }
                this.OooO0o0 = true;
                try {
                    this.OooO0Oo.unlinkToDeath(this, 0);
                } catch (Throwable unused) {
                }
                synchronized (this.OooO0o) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
