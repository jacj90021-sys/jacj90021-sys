package com.cmaster.cloner;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbde;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class y32 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ c62 OooO0o0;

    public /* synthetic */ y32(c62 c62Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = c62Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        c62 c62Var = this.OooO0o0;
        switch (i) {
            case 0:
                c62Var.OooO0OO(c62Var.OooO00o);
                return;
            case 1:
                c62Var.OooO0oO = 4;
                c62Var.OooO0O0();
                return;
            case 2:
                ya3 ya3Var = ya3.OooOooO;
                pb1 pb1Var = ya3Var.OooOOOO;
                Context context = c62Var.OooO00o;
                String str = c62Var.OooO0Oo;
                String str2 = c62Var.OooO0o0;
                pb1Var.getClass();
                zzbcv zzbcvVar = zzbde.zzfi;
                u72 u72Var = u72.OooO0Oo;
                String strOooOOOo = pb1.OooOOOo(context, pb1Var.OooOOo0(context, (String) u72Var.OooO0OO.zzb(zzbcvVar), str, str2).toString(), str2);
                if (TextUtils.isEmpty(strOooOOOo)) {
                    int i2 = uh2.OooO0O0;
                    uh2.OooO0o0("Not linked for in app preview.");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strOooOOOo.trim());
                        String strOptString = jSONObject.optString("gct");
                        pb1Var.OooO0o = jSONObject.optString("status");
                        if (((Boolean) u72Var.OooO0OO.zzb(zzbde.zzjE)).booleanValue()) {
                            boolean z = "0".equals((String) pb1Var.OooO0o) || "2".equals((String) pb1Var.OooO0o);
                            pb1Var.OooOO0(z);
                            ((ts2) ya3Var.OooO0oo.zzi()).OooOOo0(!z ? "" : str);
                        }
                        synchronized (pb1Var.OooO0OO) {
                            pb1Var.OooO0o0 = strOptString;
                        }
                        if ("2".equals((String) pb1Var.OooO0o)) {
                            int i3 = uh2.OooO0O0;
                            uh2.OooO0o0("Creative is not pushed for this device.");
                            pb1Var.OooOO0O(context, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals((String) pb1Var.OooO0o)) {
                            int i4 = uh2.OooO0O0;
                            uh2.OooO0o0("The app is not linked for creative preview.");
                            pb1Var.OooO0oo(context, str, str2);
                            return;
                        } else {
                            if ("0".equals((String) pb1Var.OooO0o)) {
                                int i5 = uh2.OooO0O0;
                                uh2.OooO0o0("Device is linked for in app preview.");
                                pb1Var.OooOO0O(context, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e) {
                        int i6 = uh2.OooO0O0;
                        uh2.OooOO0O("Fail to get in app preview response json.", e);
                    }
                }
                pb1Var.OooOO0O(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 3:
                ya3.OooOooO.OooOOOO.OooO0oO(c62Var.OooO00o);
                return;
            case 4:
                c62Var.OooO0OO(c62Var.OooO00o);
                return;
            case 5:
                ya3.OooOooO.OooOOOO.OooO0oO(c62Var.OooO00o);
                return;
            default:
                pb1 pb1Var2 = ya3.OooOooO.OooOOOO;
                String str3 = c62Var.OooO0Oo;
                String str4 = c62Var.OooO0o0;
                String str5 = c62Var.OooO0o;
                boolean zOooOOO = pb1Var2.OooOOO();
                Context context2 = c62Var.OooO00o;
                boolean zOooOO0o = pb1Var2.OooOO0o(context2, str3, str4);
                synchronized (pb1Var2.OooO0OO) {
                    pb1Var2.OooO00o = zOooOO0o;
                }
                if (!pb1Var2.OooOOO()) {
                    pb1Var2.OooO0oo(context2, str3, str4);
                    return;
                }
                if (!zOooOOO && !TextUtils.isEmpty(str5)) {
                    pb1Var2.OooO(context2, str4, str5, str3);
                }
                int i7 = uh2.OooO0O0;
                uh2.OooO0o0("Device is linked for debug signals.");
                pb1Var2.OooOO0O(context2, "The device is successfully linked for troubleshooting.", false, true);
                return;
        }
    }
}
