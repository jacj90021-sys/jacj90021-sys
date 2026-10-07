package com.cmaster.cloner;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzavu;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzdso;
import com.google.android.gms.internal.ads.zzfda;
import com.google.android.gms.internal.ads.zzfjy;
import com.google.android.gms.internal.ads.zzgdy;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rl1 {
    public final zzfjy OooO;
    public final Context OooO00o;
    public final WebView OooO0O0;
    public final zzavu OooO0OO;
    public final zzfda OooO0Oo;
    public final zzdso OooO0o;
    public final int OooO0o0;
    public final boolean OooO0oO;
    public final zzgdy OooO0oo = zzcaf.zzf;
    public final k23 OooOO0;
    public final ak2 OooOO0O;
    public final us2 OooOO0o;

    public rl1(WebView webView, zzavu zzavuVar, zzdso zzdsoVar, zzfjy zzfjyVar, zzfda zzfdaVar, k23 k23Var, ak2 ak2Var, us2 us2Var) {
        this.OooO0O0 = webView;
        Context context = webView.getContext();
        this.OooO00o = context;
        this.OooO0OO = zzavuVar;
        this.OooO0o = zzdsoVar;
        zzbde.zza(context);
        zzbcv zzbcvVar = zzbde.zzjZ;
        u72 u72Var = u72.OooO0Oo;
        this.OooO0o0 = ((Integer) u72Var.OooO0OO.zzb(zzbcvVar)).intValue();
        this.OooO0oO = ((Boolean) u72Var.OooO0OO.zzb(zzbde.zzka)).booleanValue();
        this.OooO = zzfjyVar;
        this.OooO0Oo = zzfdaVar;
        this.OooOO0 = k23Var;
        this.OooOO0O = ak2Var;
        this.OooOO0o = us2Var;
    }

    @JavascriptInterface
    @TargetApi(zzbcj.zzt.zzm)
    public String getClickSignals(String str) {
        try {
            ya3 ya3Var = ya3.OooOooO;
            ya3Var.OooOO0O.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzd = this.OooO0OO.zzc().zzd(this.OooO00o, str, this.OooO0O0);
            if (this.OooO0oO) {
                ya3Var.OooOO0O.getClass();
                x63.OooO0Oo(this.OooO0o, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzd;
        } catch (RuntimeException e) {
            int i = uh2.OooO0O0;
            uh2.OooO0oo("Exception getting click signals. ", e);
            ya3.OooOooO.OooO0oo.zzw(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(zzbcj.zzt.zzm)
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            String strOooOOO = px0.OooOOO(i, "Invalid timeout for getting click signals. Timeout=");
            int i2 = uh2.OooO0O0;
            uh2.OooO0oO(strOooOOO);
            return "";
        }
        try {
            return (String) zzcaf.zza.zzb(new b32(this, str, 1)).get(Math.min(i, this.OooO0o0), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i3 = uh2.OooO0O0;
            uh2.OooO0oo("Exception getting click signals with timeout. ", e);
            ya3.OooOooO.OooO0oo.zzw(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(zzbcj.zzt.zzm)
    public String getQueryInfo() throws Throwable {
        a73 a73Var = ya3.OooOooO.OooO0OO;
        String string = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        ea2 ea2Var = new ea2(this, string);
        if (((Boolean) zzbfj.zze.zze()).booleanValue()) {
            this.OooOO0.OooO0O0(this.OooO0O0, ea2Var);
            return string;
        }
        if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzkc)).booleanValue()) {
            this.OooO0oo.execute(new l1(this, bundle, ea2Var, 18, false));
            return string;
        }
        a61.OooO00o(this.OooO00o, new oO000((oO0000o0) new oO0000o0(0).OooO0O0(bundle)), ea2Var);
        return string;
    }

    @JavascriptInterface
    @TargetApi(zzbcj.zzt.zzm)
    public String getViewSignals() {
        try {
            ya3 ya3Var = ya3.OooOooO;
            ya3Var.OooOO0O.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzh = this.OooO0OO.zzc().zzh(this.OooO00o, this.OooO0O0, null);
            if (this.OooO0oO) {
                ya3Var.OooOO0O.getClass();
                x63.OooO0Oo(this.OooO0o, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzh;
        } catch (RuntimeException e) {
            int i = uh2.OooO0O0;
            uh2.OooO0oo("Exception getting view signals. ", e);
            ya3.OooOooO.OooO0oo.zzw(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(zzbcj.zzt.zzm)
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            String strOooOOO = px0.OooOOO(i, "Invalid timeout for getting view signals. Timeout=");
            int i2 = uh2.OooO0O0;
            uh2.OooO0oO(strOooOOO);
            return "";
        }
        try {
            return (String) zzcaf.zza.zzb(new xr(this, 2)).get(Math.min(i, this.OooO0o0), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i3 = uh2.OooO0O0;
            uh2.OooO0oo("Exception getting view signals with timeout. ", e);
            ya3.OooOooO.OooO0oo.zzw(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(zzbcj.zzt.zzm)
    public void recordClick(String str) {
        if (!((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzke)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcaf.zza.execute(new bf1(this, str, 13, false));
    }

    @JavascriptInterface
    @TargetApi(zzbcj.zzt.zzm)
    public void reportTouchEvent(String str) throws JSONException {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("x");
            int i3 = jSONObject.getInt("y");
            int i4 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i5 = jSONObject.getInt("type");
            if (i5 != 0) {
                i = 1;
                if (i5 != 1) {
                    i = 2;
                    if (i5 != 2) {
                        i = 3;
                        if (i5 != 3) {
                            i = -1;
                        }
                    }
                }
            } else {
                i = 0;
            }
            this.OooO0OO.zzd(MotionEvent.obtain(0L, i4, i, i2, i3, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException | JSONException e) {
            int i6 = uh2.OooO0O0;
            uh2.OooO0oo("Failed to parse the touch string. ", e);
            ya3.OooOooO.OooO0oo.zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
