package com.cmaster.cloner;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzftf;
import com.google.android.gms.internal.ads.zzfty;
import com.google.android.gms.internal.ads.zzfuc;
import com.google.android.gms.internal.ads.zzfud;
import com.google.android.gms.internal.ads.zzfuq;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u12 implements k6 {
    public Object OooO;
    public boolean OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;
    public Object OooO0oO;
    public Object OooO0oo;

    public void OooO00o(gh ghVar) {
        s12 s12Var = (s12) ((h60) this.OooO).OooOOO0.get((oOO0O0) this.OooO0o);
        if (s12Var != null) {
            s12Var.OooOOO0(ghVar);
        }
    }

    public void OooO0O0(String str, String str2) {
        uh2.OooO00o(str);
        if (((zzcfg) this.OooO0oO) != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            zzcaf.zzf.execute(new l1(this, "onError", map, 23, false));
        }
    }

    public void OooO0OO(zzcfg zzcfgVar, zzfty zzftyVar) {
        if (zzcfgVar == null) {
            OooO0O0("adWebview missing", "onLMDShow");
            return;
        }
        this.OooO0oO = zzcfgVar;
        if (!this.OooO0Oo && !OooO0Oo(zzcfgVar.getContext())) {
            OooO0O0("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlU)).booleanValue()) {
            this.OooO0o = zzftyVar.zzh();
        }
        if (((na1) this.OooO) == null) {
            this.OooO = new na1(this, 19);
        }
        zzfte zzfteVar = (zzfte) this.OooO0oo;
        if (zzfteVar != null) {
            zzfteVar.zzd(zzftyVar, (na1) this.OooO);
        }
    }

    public synchronized boolean OooO0Oo(Context context) {
        if (!zzfuq.zza(context)) {
            return false;
        }
        try {
            this.OooO0oo = zzftf.zza(context);
        } catch (NullPointerException e) {
            uh2.OooO00o("Error connecting LMD Overlay service");
            ya3.OooOooO.OooO0oo.zzw(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (((zzfte) this.OooO0oo) == null) {
            this.OooO0Oo = false;
            return false;
        }
        if (((na1) this.OooO) == null) {
            this.OooO = new na1(this, 19);
        }
        this.OooO0Oo = true;
        return true;
    }

    public zzfud OooO0o0() {
        zzfuc zzfucVarZzc = zzfud.zzc();
        if (!((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlU)).booleanValue() || TextUtils.isEmpty((String) this.OooO0o)) {
            String str = (String) this.OooO0o0;
            if (str != null) {
                zzfucVarZzc.zzb(str);
            } else {
                OooO0O0("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfucVarZzc.zza((String) this.OooO0o);
        }
        return zzfucVarZzc.zzc();
    }

    @Override // com.cmaster.cloner.k6
    public void OooOOo(gh ghVar) {
        ((h60) this.OooO).OooOOOo.post(new bf1(this, ghVar, 6));
    }
}
