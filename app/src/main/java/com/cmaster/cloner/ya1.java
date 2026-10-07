package com.cmaster.cloner;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ya1 {
    public final yh2 OooO00o;
    public final ArrayList OooO0O0 = new ArrayList();
    public final oO000Oo0 OooO0OO;

    public ya1(yh2 yh2Var) {
        this.OooO00o = yh2Var;
        if (yh2Var != null) {
            try {
                List<ta3> listZzj = yh2Var.zzj();
                if (listZzj != null) {
                    for (ta3 ta3Var : listZzj) {
                        oO000Oo0 oo000oo0 = ta3Var != null ? new oO000Oo0(ta3Var) : null;
                        if (oo000oo0 != null) {
                            this.OooO0O0.add(oo000oo0);
                        }
                    }
                }
            } catch (RemoteException e) {
                uh2.OooO0oo("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        yh2 yh2Var2 = this.OooO00o;
        if (yh2Var2 == null) {
            return;
        }
        try {
            ta3 ta3VarZzf = yh2Var2.zzf();
            if (ta3VarZzf != null) {
                this.OooO0OO = new oO000Oo0(ta3VarZzf);
            }
        } catch (RemoteException e2) {
            uh2.OooO0oo("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    public final JSONObject OooO00o() throws JSONException {
        String strZzi;
        Bundle bundleZze;
        JSONObject jSONObject = new JSONObject();
        String strZzg = null;
        yh2 yh2Var = this.OooO00o;
        if (yh2Var != null) {
            try {
                strZzi = yh2Var.zzi();
            } catch (RemoteException e) {
                uh2.OooO0oo("Could not forward getResponseId to ResponseInfo.", e);
            }
        } else {
            strZzi = null;
        }
        if (strZzi == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strZzi);
        }
        if (yh2Var != null) {
            try {
                strZzg = yh2Var.zzg();
            } catch (RemoteException e2) {
                uh2.OooO0oo("Could not forward getMediationAdapterClassName to ResponseInfo.", e2);
            }
        }
        if (strZzg == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strZzg);
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.OooO0O0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jSONArray.put(((oO000Oo0) obj).OooO00o());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        oO000Oo0 oo000oo0 = this.OooO0OO;
        if (oo000oo0 != null) {
            jSONObject.put("Loaded Adapter Response", oo000oo0.OooO00o());
        }
        if (yh2Var != null) {
            try {
                bundleZze = yh2Var.zze();
            } catch (RemoteException e3) {
                uh2.OooO0oo("Could not forward getResponseExtras to ResponseInfo.", e3);
            }
        } else {
            bundleZze = new Bundle();
        }
        if (bundleZze != null) {
            jSONObject.put("Response Extras", p72.OooO0o.OooO00o.OooOO0(bundleZze));
        }
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
