package com.cmaster.cloner;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzavr;
import com.google.android.gms.internal.ads.zzavt;
import com.google.android.gms.internal.ads.zzavu;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xr implements Callable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ xr(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.OooO0Oo) {
            case 0:
                synchronized (((as) this.OooO0o0)) {
                    try {
                        as asVar = (as) this.OooO0o0;
                        if (asVar.OooOO0o == null) {
                            return null;
                        }
                        asVar.OooOoO0();
                        if (((as) this.OooO0o0).OooOOo()) {
                            ((as) this.OooO0o0).OooOo0o();
                            ((as) this.OooO0o0).OooOOO = 0;
                        }
                        return null;
                    } finally {
                    }
                }
            case 1:
                JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) this.OooO0o0;
                bk0 bk0Var = new bk0();
                bk0Var.OooO00o = jsReplyProxyBoundaryInterface;
                return bk0Var;
            case 2:
                return ((rl1) this.OooO0o0).getViewSignals();
            case 3:
                return sl0.OooO0OO.OooO00o(((c03) this.OooO0o0).OooO0oO);
            case 4:
                yj2 yj2Var = a73.OooOO0o;
                a73 a73Var = ya3.OooOooO.OooO0OO;
                return a73.OooOOO0((Uri) this.OooO0o0);
            case 5:
                u93 u93Var = (u93) this.OooO0o0;
                return new zzavu(zzavt.zzt(u93Var.OooO0oO, new zzavr(u93Var.OooO0Oo.OooO0Oo, false)));
            case 6:
                return sl0.OooO0OO.OooO00o(((l73) this.OooO0o0).OooO00o);
            default:
                return sl0.OooO0OO.OooO00o(((ic3) this.OooO0o0).OooO0oO);
        }
    }
}
