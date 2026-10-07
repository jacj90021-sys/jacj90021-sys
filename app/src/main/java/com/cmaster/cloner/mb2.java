package com.cmaster.cloner;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mb2 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final String OooO00o;
    public final /* synthetic */ nb2 OooO0O0;

    public mb2(nb2 nb2Var, String str) {
        Objects.requireNonNull(nb2Var);
        this.OooO0O0 = nb2Var;
        this.OooO00o = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        nb2 nb2Var = this.OooO0O0;
        synchronized (nb2Var) {
            try {
                ArrayList arrayList = nb2Var.OooO0O0;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str2 = this.OooO00o;
                    HashMap map = ((wa2) obj).OooO00o;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        ((ts2) ya3.OooOooO.OooO0oo.zzi()).OooO0Oo(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
