package com.cmaster.cloner;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class p41 {
    public static final String OooO00o = sn2.OooO00o("rxn8DlDVCAOgGdo4T8EEHw==\n", "xHyFUSGna2w=\n");

    public static void OooO00o(ArrayList arrayList) throws JSONException {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(e2.OooO.OooO00o);
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            s5 s5Var = (s5) obj;
            s5Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(sn2.OooO00o("tNpPoVpFRN6rzQ==\n", "x7kuzwggN6s=\n"), s5Var.OooO0Oo);
                jSONObject.put(sn2.OooO00o("T4S51w==\n", "O+3UshFIQ2k=\n"), s5Var.OooO0o0);
                jSONObject.put(sn2.OooO00o("Q7w03MXz\n", "JdNGsaSH9LE=\n"), s5Var.OooO0o);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            hashSet.add(jSONObject.toString());
        }
        defaultSharedPreferences.edit().putStringSet(OooO00o, hashSet).apply();
    }
}
