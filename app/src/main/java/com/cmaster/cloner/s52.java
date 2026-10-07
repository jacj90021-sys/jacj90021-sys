package com.cmaster.cloner;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s52 {
    public static final cf2 OooO0Oo = cf2.OooO0o(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    public final Application OooO00o;
    public final SharedPreferences OooO0O0;
    public final HashSet OooO0OO;

    public s52(Application application) {
        this.OooO00o = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.OooO0O0 = sharedPreferences;
        this.OooO0OO = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final HashMap OooO00o() {
        String string;
        Set<String> stringSet = this.OooO0O0.getStringSet("stored_info", mf2.OooOOO);
        if (stringSet.isEmpty()) {
            stringSet = OooO0Oo;
        }
        HashMap map = new HashMap();
        for (String str : stringSet) {
            Application application = this.OooO00o;
            vr1 vr1VarOooO00o = n73.OooO00o(application, str);
            if (vr1VarOooO00o == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str)));
            } else {
                Object obj = application.getSharedPreferences((String) vr1VarOooO00o.OooO0o0, 0).getAll().get((String) vr1VarOooO00o.OooO0o);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str)));
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str)));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }
}
