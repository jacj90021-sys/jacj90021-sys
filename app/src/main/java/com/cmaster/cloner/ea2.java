package com.cmaster.cloner;

import com.google.android.gms.internal.ads.zzbeo;
import com.google.android.gms.internal.ads.zzbfj;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ea2 extends b61 {
    public final /* synthetic */ String OooO00o;
    public final /* synthetic */ rl1 OooO0O0;

    public ea2(rl1 rl1Var, String str) {
        this.OooO00o = str;
        this.OooO0O0 = rl1Var;
    }

    @Override // com.cmaster.cloner.b61
    public final void onFailure(String str) {
        int i = uh2.OooO0O0;
        uh2.OooOO0("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        boolean zBooleanValue = ((Boolean) zzbfj.zzc.zze()).booleanValue();
        rl1 rl1Var = this.OooO0O0;
        String strConcat = zBooleanValue ? ",\"as\":".concat(rl1Var.OooOO0O.OooO00o().toString()) : "";
        Locale locale = Locale.getDefault();
        zzbeo zzbeoVar = zzbfj.zze;
        String str2 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.OooO00o, str, Long.valueOf(((Boolean) zzbeoVar.zze()).booleanValue() ? ((Long) zzbfj.zzh.zze()).longValue() : 0L), strConcat);
        int i2 = 0;
        if (((Boolean) zzbeoVar.zze()).booleanValue()) {
            try {
                rl1Var.OooO0oo.execute(new v92(this, str2, i2));
            } catch (RuntimeException e) {
                ya3.OooOooO.OooO0oo.zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            rl1Var.OooO0O0.evaluateJavascript(str2, null);
        }
        if (((Boolean) zzbfj.zzc.zze()).booleanValue() && ((Boolean) zzbfj.zzd.zze()).booleanValue()) {
            us2 us2Var = rl1Var.OooOO0o;
            us2Var.getClass();
            us2Var.OooO0OO.execute(new uo2(us2Var, i2));
        }
    }

    @Override // com.cmaster.cloner.b61
    public final void onSuccess(a61 a61Var) throws JSONException {
        String str;
        String str2 = this.OooO00o;
        rl1 rl1Var = this.OooO0O0;
        String str3 = (String) a61Var.OooO00o.OooO0o0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", str2);
            if (((Boolean) zzbfj.zzc.zze()).booleanValue()) {
                jSONObject.put("as", rl1Var.OooOO0O.OooO00o());
            }
            jSONObject.put("sdk_ttl_ms", ((Boolean) zzbfj.zze.zze()).booleanValue() ? ((Long) zzbfj.zzh.zze()).longValue() : 0L);
            jSONObject.put("signal", str3);
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, (String) a61Var.OooO00o.OooO0o0, Long.valueOf(((Boolean) zzbfj.zze.zze()).booleanValue() ? ((Long) zzbfj.zzh.zze()).longValue() : 0L), ((Boolean) zzbfj.zzc.zze()).booleanValue() ? ",\"as\":".concat(rl1Var.OooOO0O.OooO00o().toString()) : "");
        }
        if (((Boolean) zzbfj.zze.zze()).booleanValue()) {
            try {
                rl1Var.OooO0oo.execute(new v92(this, str, 1));
            } catch (RuntimeException e) {
                ya3.OooOooO.OooO0oo.zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            rl1Var.OooO0O0.evaluateJavascript(str, null);
        }
        if (((Boolean) zzbfj.zzc.zze()).booleanValue() && ((Boolean) zzbfj.zzd.zze()).booleanValue()) {
            us2 us2Var = rl1Var.OooOO0o;
            us2Var.getClass();
            us2Var.OooO0OO.execute(new uo2(us2Var, 0));
        }
    }
}
