package com.cmaster.cloner;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbde;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nb2 {
    public final HashMap OooO00o = new HashMap();
    public final ArrayList OooO0O0 = new ArrayList();
    public final Context OooO0OO;

    public nb2(Context context) {
        this.OooO0OO = context;
    }

    public final void OooO00o() {
        zzbcv zzbcvVar = zzbde.zzkQ;
        u72 u72Var = u72.OooO0Oo;
        if (((Boolean) u72Var.OooO0OO.zzb(zzbcvVar)).booleanValue()) {
            a73 a73Var = ya3.OooOooO.OooO0OO;
            HashMap mapOooo0O0 = a73.Oooo0O0((String) u72Var.OooO0OO.zzb(zzbde.zzkV));
            for (String str : mapOooo0O0.keySet()) {
                synchronized (this) {
                    try {
                        HashMap map = this.OooO00o;
                        if (!map.containsKey(str)) {
                            boolean zEquals = Objects.equals(str, "__default__");
                            Context context = this.OooO0OO;
                            SharedPreferences defaultSharedPreferences = zEquals ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0);
                            mb2 mb2Var = new mb2(this, str);
                            map.put(str, mb2Var);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(mb2Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            wa2 wa2Var = new wa2(mapOooo0O0);
            synchronized (this) {
                this.OooO0O0.add(wa2Var);
            }
        }
    }
}
