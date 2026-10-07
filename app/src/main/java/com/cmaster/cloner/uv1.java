package com.cmaster.cloner;

import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class uv1 extends FutureTask implements AccountManagerFuture {
    public final tv1 OooO0Oo;
    public final Handler OooO0o;
    public final oO00O0o0 OooO0o0;

    public uv1(oO00O0o0 oo00o0o0) {
        super(new a72(1));
        this.OooO0o0 = oo00o0o0;
        this.OooO0Oo = new tv1(this);
        this.OooO0o = new Handler(Looper.getMainLooper());
    }

    public abstract void OooO0O0();

    public final Bundle OooO0OO(Long l, TimeUnit timeUnit) throws OperationCanceledException {
        if (!isDone()) {
            Looper looperMyLooper = Looper.myLooper();
            Integer num = qx1.OooO00o;
            Context context = e92.OooO00o;
            if (looperMyLooper != null && looperMyLooper == context.getMainLooper()) {
                IllegalStateException illegalStateException = new IllegalStateException(u7.OooO00o(new byte[]{-17, 61, -114, 80, 83, -42, 40, -105, -8, 52, -117, 79, 26, -34, 61, -40, -31, 124, -101, 83, 79, -54, 111, -38, -19, 53, -116, 28, 78, -48, 61, -46, -19, 56, -62, 95, 91, -42, 111, -37, -23, 61, -122, 28, 78, -41, 111, -45, -23, 61, -122, 80, 85, -37, 36}, new byte[]{-116, 92, -30, 60, 58, -72, 79, -73}));
                u7.OooO00o(new byte[]{63, 2, -35, -87, 101, -108, 90, 18, 40, 11, -40, -74, 44, -100, 79, 93, 49, 67, -56, -86, 121, -120, 29, 95, 61, 10, -33, -27, 120, -110, 79, 87, 61, 7, -111, -90, 109, -108, 29, 94, 57, 2, -43, -27, 120, -107, 29, 86, 57, 2, -43, -87, 99, -103, 86, 18, 61, 13, -43, -22, 99, -120, 29, 115, 18, 49, -62}, new byte[]{92, 99, -79, -59, 12, -6, 61, 50});
                int i = fp0.OooO00o;
                throw illegalStateException;
            }
        }
        try {
            try {
                try {
                    return l == null ? (Bundle) get() : (Bundle) get(l.longValue(), timeUnit);
                } catch (InterruptedException | TimeoutException unused) {
                    cancel(true);
                    throw new OperationCanceledException();
                }
            } catch (CancellationException unused2) {
                throw new OperationCanceledException();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                if (cause instanceof UnsupportedOperationException) {
                    throw new AuthenticatorException(cause);
                }
                if (cause instanceof AuthenticatorException) {
                    throw ((AuthenticatorException) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new IllegalStateException(cause);
            }
        } finally {
            cancel(true);
        }
    }

    @Override // java.util.concurrent.FutureTask
    /* renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public final void set(Bundle bundle) {
        if (bundle == null) {
            u7.OooO00o(new byte[]{-58, -92, 55, 97, 11, 43, -23, -102, -34, -87, 114, 44, 28, 45, -13, -34, -36, -93, 38, 97, 11, 59, -89, -112, -57, -96, 62}, new byte[]{-78, -52, 82, 65, 105, 94, -121, -2});
            new Exception();
            int i = fp0.OooO00o;
        }
        super.set(bundle);
    }

    public final void OooO0o0() {
        try {
            OooO0O0();
        } catch (RemoteException e) {
            setException(e);
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        oO00O0o0 oo00o0o0 = this.OooO0o0;
        if (oo00o0o0 != null) {
            this.OooO0o.post(new oO000o00(oo00o0o0, this, 9));
        }
    }

    @Override // android.accounts.AccountManagerFuture
    public final Object getResult(long j, TimeUnit timeUnit) {
        return OooO0OO(Long.valueOf(j), timeUnit);
    }

    @Override // android.accounts.AccountManagerFuture
    public final Object getResult() {
        return OooO0OO(null, null);
    }
}
