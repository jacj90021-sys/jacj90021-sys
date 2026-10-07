package com.cmaster.cloner;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO000Oo0 {
    public final ta3 OooO00o;
    public final o0OOO0OO OooO0O0;

    public oO000Oo0(ta3 ta3Var) {
        this.OooO00o = ta3Var;
        th2 th2Var = ta3Var.OooO0o;
        this.OooO0O0 = th2Var == null ? null : th2Var.OooO00o();
    }

    public final JSONObject OooO00o() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ta3 ta3Var = this.OooO00o;
        jSONObject.put("Adapter", ta3Var.OooO0Oo);
        jSONObject.put("Latency", ta3Var.OooO0o0);
        String str = ta3Var.OooO0oo;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = ta3Var.OooO;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = ta3Var.OooOO0;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = ta3Var.OooOO0O;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = ta3Var.OooO0oO;
        for (String str5 : bundle.keySet()) {
            jSONObject2.put(str5, bundle.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        o0OOO0OO o0ooo0oo = this.OooO0O0;
        if (o0ooo0oo == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", o0ooo0oo.OooO0O0());
        return jSONObject;
    }

    public final String toString() {
        try {
            return OooO00o().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
