package com.cmaster.cloner;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzfhj;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzgdj;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yo implements iy, xs1, zzgdj {
    public Object OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;
    public Object OooO0oO;
    public Object OooO0oo;

    public yo(Map map) {
        map.getClass();
        this.OooO0Oo = new LinkedHashMap(map);
        this.OooO0o0 = new LinkedHashMap();
        this.OooO0o = new LinkedHashMap();
        this.OooO0oO = new LinkedHashMap();
        this.OooO0oo = new c20(this, 1);
    }

    public void OooO00o(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.OooO0Oo).put(str, obj);
        si1 si1Var = (si1) ((LinkedHashMap) this.OooO0o).get(str);
        uk1 uk1Var = k72.OooO00o;
        if (si1Var != null) {
            si1Var.OooO00o(null, obj == null ? uk1Var : obj);
        }
        si1 si1Var2 = (si1) ((LinkedHashMap) this.OooO0oO).get(str);
        if (si1Var2 != null) {
            if (obj == null) {
                obj = uk1Var;
            }
            si1Var2.OooO00o(null, obj);
        }
    }

    @Override // com.cmaster.cloner.q51
    public Object get() {
        return new xo((Executor) ((q51) this.OooO0Oo).get(), (ot0) ((q51) this.OooO0o0).get(), (a02) ((a02) this.OooO0oo).get(), (qc1) ((q51) this.OooO0o).get(), (qc1) ((q51) this.OooO0oO).get());
    }

    @Override // com.cmaster.cloner.xs1
    public View getRoot() {
        return (ConstraintLayout) this.OooO0Oo;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzia)).booleanValue()) {
            ya3.OooOooO.OooO0oo.zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            ya3.OooOooO.OooO0oo.zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfhu zzfhuVarO00O00O = d62.o00O00O((nn0) this.OooO0Oo, (zzbze) this.OooO0o0);
        if (((Boolean) zzbex.zze.zze()).booleanValue() && zzfhuVarO00O00O != null) {
            zzfhj zzfhjVar = (zzfhj) this.OooO0oO;
            zzfhjVar.zzh(th);
            zzfhjVar.zzg(false);
            zzfhuVarO00O00O.zza(zzfhjVar);
            zzfhuVarO00O00O.zzh();
        }
        zzbyx zzbyxVar = (zzbyx) this.OooO0o;
        if (zzbyxVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            zzbyxVar.zzb(message);
        } catch (RemoteException e) {
            int i = uh2.OooO0O0;
            uh2.OooO0oo("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public void zzb(Object obj) {
        zzbyx zzbyxVar = (zzbyx) this.OooO0o;
        zzfhj zzfhjVar = (zzfhj) this.OooO0oO;
        s82 s82Var = (s82) obj;
        zzfhu zzfhuVarO00O00O = d62.o00O00O((nn0) this.OooO0Oo, (zzbze) this.OooO0o0);
        d62 d62Var = (d62) this.OooO0oo;
        d62Var.OooOooo.set(true);
        if (!((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzhU)).booleanValue()) {
            if (zzbyxVar != null) {
                try {
                    zzbyxVar.zzb("QueryInfo generation has been disabled.");
                } catch (RemoteException e) {
                    String strConcat = "QueryInfo generation has been disabled.".concat(e.toString());
                    int i = uh2.OooO0O0;
                    uh2.OooO0oO(strConcat);
                }
            }
            if (!((Boolean) zzbex.zze.zze()).booleanValue() || zzfhuVarO00O00O == null) {
                return;
            }
            zzfhjVar.zzc("QueryInfo generation has been disabled.");
            zzfhjVar.zzg(false);
            zzfhuVarO00O00O.zza(zzfhjVar);
            zzfhuVarO00O00O.zzh();
            return;
        }
        try {
            try {
                if (s82Var == null) {
                    if (zzbyxVar != null) {
                        zzbyxVar.zzc(null, null, null);
                    }
                    zzfhjVar.zzg(true);
                    if (!((Boolean) zzbex.zze.zze()).booleanValue() || zzfhuVarO00O00O == null) {
                        return;
                    }
                    zzfhuVarO00O00O.zza(zzfhjVar);
                    zzfhuVarO00O00O.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(s82Var.OooO0OO) ? new JSONObject(s82Var.OooO0OO) : new JSONObject(s82Var.OooO0O0)).optString("request_id", ""))) {
                        int i2 = uh2.OooO0O0;
                        uh2.OooOO0("The request ID is empty in request JSON.");
                        if (zzbyxVar != null) {
                            zzbyxVar.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        zzfhjVar.zzc("Request ID empty");
                        zzfhjVar.zzg(false);
                        if (!((Boolean) zzbex.zze.zze()).booleanValue() || zzfhuVarO00O00O == null) {
                            return;
                        }
                        zzfhuVarO00O00O.zza(zzfhjVar);
                        zzfhuVarO00O00O.zzh();
                        return;
                    }
                    Bundle bundle = s82Var.OooO0o;
                    boolean z = d62Var.OooOOoo;
                    String str = d62Var.OooOo00;
                    String str2 = d62Var.OooOo0;
                    if (z && bundle != null && bundle.getInt(str2, -1) == -1) {
                        bundle.putInt(str2, d62Var.OooOo0O.get());
                    }
                    if (d62Var.OooOOo && bundle != null && TextUtils.isEmpty(bundle.getString(str))) {
                        if (TextUtils.isEmpty(d62Var.OooOo)) {
                            d62Var.OooOo = ya3.OooOooO.OooO0OO.OooOoO0(d62Var.OooO0o0, d62Var.OooOo0o.OooO0Oo);
                        }
                        bundle.putString(str, d62Var.OooOo);
                    }
                    if (zzbyxVar != null) {
                        boolean zIsEmpty = TextUtils.isEmpty(s82Var.OooO0OO);
                        String str3 = s82Var.OooO00o;
                        if (zIsEmpty) {
                            zzbyxVar.zzc(str3, s82Var.OooO0O0, bundle);
                        } else {
                            zzbyxVar.zzc(str3, s82Var.OooO0OO, bundle);
                        }
                    }
                    zzfhjVar.zzg(true);
                    if (!((Boolean) zzbex.zze.zze()).booleanValue() || zzfhuVarO00O00O == null) {
                        return;
                    }
                    zzfhuVarO00O00O.zza(zzfhjVar);
                    zzfhuVarO00O00O.zzh();
                } catch (JSONException e2) {
                    int i3 = uh2.OooO0O0;
                    uh2.OooOO0("Failed to create JSON object from the request string.");
                    if (zzbyxVar != null) {
                        zzbyxVar.zzb("Internal error for request JSON: " + e2.toString());
                    }
                    zzfhjVar.zzh(e2);
                    zzfhjVar.zzg(false);
                    ya3.OooOooO.OooO0oo.zzw(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbex.zze.zze()).booleanValue() || zzfhuVarO00O00O == null) {
                        return;
                    }
                    zzfhuVarO00O00O.zza(zzfhjVar);
                    zzfhuVarO00O00O.zzh();
                }
            } catch (RemoteException e3) {
                zzfhjVar.zzh(e3);
                zzfhjVar.zzg(false);
                int i4 = uh2.OooO0O0;
                uh2.OooO0oo("", e3);
                ya3.OooOooO.OooO0oo.zzw(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbex.zze.zze()).booleanValue() || zzfhuVarO00O00O == null) {
                    return;
                }
                zzfhuVarO00O00O.zza(zzfhjVar);
                zzfhuVarO00O00O.zzh();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbex.zze.zze()).booleanValue() && zzfhuVarO00O00O != null) {
                zzfhuVarO00O00O.zza(zzfhjVar);
                zzfhuVarO00O00O.zzh();
            }
            throw th;
        }
    }
}
