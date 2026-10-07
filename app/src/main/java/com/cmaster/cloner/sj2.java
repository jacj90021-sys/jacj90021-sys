package com.cmaster.cloner;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzbmm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sj2 {
    public static sj2 OooO0oo;
    public te2 OooO0o;
    public final Object OooO00o = new Object();
    public boolean OooO0OO = false;
    public boolean OooO0Oo = false;
    public final Object OooO0o0 = new Object();
    public final q91 OooO0oO = new q91(new ArrayList());
    public final ArrayList OooO0O0 = new ArrayList();

    static {
        new HashSet(Arrays.asList(o0OOOO00.APP_OPEN_AD, o0OOOO00.INTERSTITIAL, o0OOOO00.REWARDED));
    }

    public static zzbmm OooO00o(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbmd zzbmdVar = (zzbmd) it.next();
            map.put(zzbmdVar.zza, new zzbml(zzbmdVar.zzb ? oO000Oo.OooO0o0 : oO000Oo.OooO0Oo, zzbmdVar.zzd, zzbmdVar.zzc));
        }
        return new zzbmm(map);
    }

    public static sj2 OooO0o0() {
        sj2 sj2Var;
        synchronized (sj2.class) {
            try {
                if (OooO0oo == null) {
                    OooO0oo = new sj2();
                }
                sj2Var = OooO0oo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sj2Var;
    }

    public final void OooO0O0() {
        try {
            this.OooO0o.zzk();
            this.OooO0o.zzl(null, new ey0(null));
        } catch (RemoteException e) {
            uh2.OooOO0O("MobileAdsSettingManager initialization failed", e);
        }
    }

    public final void OooO0OO(App app) {
        if (this.OooO0o == null) {
            this.OooO0o = (te2) new f62(p72.OooO0o.OooO0O0, app).OooO0Oo(app, false);
        }
    }

    public final ng0 OooO0Oo() {
        zzbmm zzbmmVarOooO00o;
        synchronized (this.OooO0o0) {
            try {
                by2.OooOO0("MobileAds.initialize() must be called prior to getting initialization status.", this.OooO0o != null);
                try {
                    zzbmmVarOooO00o = OooO00o(this.OooO0o.zzg());
                } catch (RemoteException unused) {
                    uh2.OooO0oO("Unable to get Initialization status.");
                    return new qc3(16);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbmmVarOooO00o;
    }
}
