package com.cmaster.cloner;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzaqg;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzbde;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g92 {
    public static zzaqg OooO00o;
    public static final Object OooO0O0 = new Object();

    public g92(Context context) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (OooO0O0) {
            try {
                if (OooO00o == null) {
                    zzbde.zza(context);
                    OooO00o = ((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzeJ)).booleanValue() ? p62.OooO00o(context) : zzark.zza(context, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final r82 OooO00o(int i, String str, HashMap map, byte[] bArr) {
        r82 r82Var = new r82();
        vr1 vr1Var = new vr1(this, str, r82Var);
        fx2 fx2Var = new fx2();
        n82 n82Var = new n82(this, i, str, r82Var, vr1Var, bArr, map, fx2Var);
        if (fx2.OooO0OO()) {
            try {
                Map mapZzl = n82Var.zzl();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (fx2.OooO0OO()) {
                    fx2Var.OooO0Oo("onNetworkRequest", new ho1(str, "GET", mapZzl, bArr2, 27));
                }
            } catch (zzapl e) {
                String message = e.getMessage();
                int i2 = uh2.OooO0O0;
                uh2.OooOO0(message);
            }
        }
        OooO00o.zza(n82Var);
        return r82Var;
    }
}
