package com.cmaster.cloner;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xn0 extends o0OOO0OO {
    public final ya1 OooO0o0;

    public xn0(int i, String str, String str2, o0OOO0OO o0ooo0oo, ya1 ya1Var) {
        super(i, str, str2, o0ooo0oo);
        this.OooO0o0 = ya1Var;
    }

    @Override // com.cmaster.cloner.o0OOO0OO
    public final JSONObject OooO0O0() throws JSONException {
        JSONObject jSONObjectOooO0O0 = super.OooO0O0();
        ya1 ya1Var = this.OooO0o0;
        if (ya1Var == null) {
            jSONObjectOooO0O0.put("Response Info", "null");
            return jSONObjectOooO0O0;
        }
        jSONObjectOooO0O0.put("Response Info", ya1Var.OooO00o());
        return jSONObjectOooO0O0;
    }

    @Override // com.cmaster.cloner.o0OOO0OO
    public final String toString() {
        try {
            return OooO0O0().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
