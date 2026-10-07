package com.cmaster.cloner;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzfrw;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yj2 extends zzfrw {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            ya3.OooOooO.OooO0oo.zzw(e, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            ya3 ya3Var = ya3.OooOooO;
            a73 a73Var = ya3Var.OooO0OO;
            Context contextZzd = ya3Var.OooO0oo.zzd();
            if (contextZzd != null) {
                try {
                    if (((Boolean) zzbfn.zzb.zze()).booleanValue()) {
                        up2.OooO00o(contextZzd, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }
}
