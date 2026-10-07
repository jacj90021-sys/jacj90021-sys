package com.cmaster.cloner;

import android.preference.PreferenceManager;
import com.bumptech.matrix.business.BusinessDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u5 extends lh1 {
    public final /* synthetic */ int OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u5(int i) {
        super(1);
        this.OooO0OO = i;
    }

    @Override // com.cmaster.cloner.lh1
    public final Object OooO00o() {
        s5 s5Var;
        switch (this.OooO0OO) {
            case 0:
                v5 v5Var = new v5();
                App app = e2.OooO.OooO00o;
                String str = p41.OooO00o;
                Set<String> stringSet = PreferenceManager.getDefaultSharedPreferences(e2.OooO.OooO00o).getStringSet(p41.OooO00o, new HashSet());
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = stringSet.iterator();
                while (it.hasNext()) {
                    try {
                        JSONObject jSONObject = new JSONObject(it.next());
                        String strOptString = jSONObject.optString(sn2.OooO00o("9LC9g4F5+9Lrpw==\n", "h9Pc7dMciKc=\n"));
                        s5Var = new s5(jSONObject.optInt(sn2.OooO00o("B+w9O1Vn\n", "YYNPVjQTm+I=\n")), jSONObject.optLong(sn2.OooO00o("X+1EBQ==\n", "K4QpYK9xmXs=\n")), strOptString);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        s5Var = null;
                    }
                    if (s5Var != null) {
                        arrayList.add(s5Var);
                    }
                }
                arrayList.sort(new jg(3));
                v5Var.OooO00o = arrayList;
                return v5Var;
            case 1:
                return (BusinessDatabase) vy2.OooO00o(e2.OooO.OooO00o, BusinessDatabase.class, sn2.OooO00o("P6zdIivDY/4=\n", "XdmuS0WmEI0=\n")).OooO0O0();
            case 2:
                return new dr0();
            default:
                return new x41(e2.OooO.OooO00o);
        }
    }
}
