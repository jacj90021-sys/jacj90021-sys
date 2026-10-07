package com.cmaster.cloner;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class o0OOO0OO {
    public final int OooO00o;
    public final String OooO0O0;
    public final String OooO0OO;
    public final o0OOO0OO OooO0Oo;

    public o0OOO0OO(int i, String str, String str2, o0OOO0OO o0ooo0oo) {
        this.OooO00o = i;
        this.OooO0O0 = str;
        this.OooO0OO = str2;
        this.OooO0Oo = o0ooo0oo;
    }

    public final th2 OooO00o() {
        th2 th2Var;
        o0OOO0OO o0ooo0oo = this.OooO0Oo;
        if (o0ooo0oo == null) {
            th2Var = null;
        } else {
            th2Var = new th2(o0ooo0oo.OooO00o, o0ooo0oo.OooO0O0, o0ooo0oo.OooO0OO, null, null);
        }
        return new th2(this.OooO00o, this.OooO0O0, this.OooO0OO, th2Var, null);
    }

    public JSONObject OooO0O0() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.OooO00o);
        jSONObject.put("Message", this.OooO0O0);
        jSONObject.put("Domain", this.OooO0OO);
        o0OOO0OO o0ooo0oo = this.OooO0Oo;
        if (o0ooo0oo == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", o0ooo0oo.OooO0O0());
        return jSONObject;
    }

    public String toString() {
        try {
            return OooO0O0().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
