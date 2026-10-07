package com.cmaster.cloner;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbmz;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class gj0 {
    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        try {
            return y62.OooO00o(context).zzt(str);
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
            return false;
        }
    }

    public static void load(Context context, String str, oO000 oo000, hj0 hj0Var) {
        by2.OooO(context, "Context cannot be null.");
        by2.OooO(str, "AdUnitId cannot be null.");
        by2.OooO(oo000, "AdRequest cannot be null.");
        by2.OooO(hj0Var, "LoadCallback cannot be null.");
        by2.OooO0Oo("#008 Must be called on the main UI thread.");
        zzbde.zza(context);
        if (((Boolean) zzbfc.zzi.zze()).booleanValue()) {
            if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlE)).booleanValue()) {
                f72.OooO0O0.execute(new sb(context, str, oo000, hj0Var, 3, false));
                return;
            }
        }
        new zzbmz(context, str).zza(oo000.OooO00o, hj0Var);
    }

    @Deprecated
    public static gj0 pollAd(Context context, String str) {
        try {
            sa2 sa2VarZzj = y62.OooO00o(context).zzj(str);
            if (sa2VarZzj != null) {
                return new zzbmz(context, str, sa2VarZzj);
            }
            uh2.OooOO0o("Failed to obtain an Interstitial Ad from the preloader.", null);
            return null;
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
            return null;
        }
    }

    public abstract ya1 getResponseInfo();

    public abstract void setFullScreenContentCallback(n30 n30Var);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(hz0 hz0Var);

    public abstract void show(Activity activity);
}
