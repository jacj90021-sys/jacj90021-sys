package com.cmaster.cloner;

import android.os.IBinder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xq extends yq {
    public final IBinder OooOO0O;

    public xq(IBinder iBinder) {
        this.OooOO0O = iBinder;
    }

    @Override // com.cmaster.cloner.yq
    public final boolean OooO00o() throws Throwable {
        IBinder iBinder = null;
        try {
            IBinder iBinder2 = this.OooOO0O;
            ThreadLocal threadLocal = rq.OooO0o;
            IBinder iBinder3 = (IBinder) threadLocal.get();
            threadLocal.set(iBinder2);
            try {
                boolean zOooO00o = super.OooO00o();
                threadLocal.set(iBinder3);
                return zOooO00o;
            } catch (Throwable th) {
                th = th;
                iBinder = iBinder3;
                rq.OooO0o.set(iBinder);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
