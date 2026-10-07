package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzfyv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ak2 {
    public final Context OooO00o;
    public final ApplicationInfo OooO0O0;
    public final List OooO0OO;
    public final ms1 OooO0Oo;
    public final JSONObject OooO0o0 = new JSONObject();
    public final AtomicBoolean OooO0o = new AtomicBoolean(false);

    public ak2(Context context, List list, ms1 ms1Var) {
        this.OooO00o = context;
        this.OooO0O0 = context.getApplicationInfo();
        this.OooO0OO = list;
        this.OooO0Oo = ms1Var;
    }

    public final JSONObject OooO00o() {
        if (!this.OooO0o.get()) {
            OooO0O0(null);
        }
        return this.OooO0o0;
    }

    public final void OooO0O0(WebView webView) {
        if (this.OooO0o.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoOooO0oO = null;
        ApplicationInfo applicationInfo = this.OooO0O0;
        if (applicationInfo != null) {
            try {
                packageInfoOooO0oO = e12.OooO00o(this.OooO00o).OooO0oO(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.OooO0o0;
        if (packageInfoOooO0oO != null) {
            try {
                jSONObject.put("vc", packageInfoOooO0oO.versionCode);
                jSONObject.put("vnm", packageInfoOooO0oO.versionName);
            } catch (JSONException e) {
                ya3.OooOooO.OooO0oo.zzw(e, "PawAppSignalGenerator.initialize");
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        List list = this.OooO0OO;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzkk)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject.put("eid", arrayList);
        jSONObject.put("js", this.OooO0Oo.OooO0Oo);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) zzbfj.zzb.zze()).booleanValue() && u53.OooO00o("DOCUMENT_START_SCRIPT") && webView != null) {
            String str2 = String.format(Locale.getDefault(), (String) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzkj), OooO00o());
            zzfyv zzfyvVarZzo = zzfyv.zzo("*");
            int i = ey1.OooO00o;
            if (!hy1.OooO0o0.OooO0O0()) {
                throw hy1.OooO00o();
            }
        }
    }
}
