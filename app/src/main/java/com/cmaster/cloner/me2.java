package com.cmaster.cloner;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class me2 {
    public SharedPreferences OooO00o;
    public SharedPreferences.Editor OooO0O0;
    public final Context OooO0OO;
    public final Object OooO0Oo = new Object();

    public me2(Context context) {
        this.OooO0OO = context;
    }

    public final String OooO00o(String str) {
        String string;
        OooO0o0();
        synchronized (this.OooO0Oo) {
            string = this.OooO00o.getString(str, null);
            this.OooO0O0.remove(str).commit();
        }
        return string;
    }

    public final HashMap OooO0O0() {
        HashMap map;
        OooO0o0();
        synchronized (this.OooO0Oo) {
            try {
                Map<String, ?> all = this.OooO00o.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public final void OooO0OO() {
        OooO0o0();
        synchronized (this.OooO0Oo) {
            this.OooO0O0.clear().commit();
        }
    }

    public final void OooO0Oo(int i, int i2, String str) {
        String str2 = Build.MODEL;
        OooO0o0();
        synchronized (this.OooO0Oo) {
            this.OooO0O0.putString("pn", str).putInt("vc", i).putString("dm", str2).putInt("aav", i2).commit();
        }
    }

    public final void OooO0o0() {
        synchronized (this.OooO0Oo) {
            try {
                if (this.OooO00o != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.OooO0OO.getSharedPreferences("query_info_shared_prefs", 0);
                this.OooO00o = sharedPreferences;
                this.OooO0O0 = sharedPreferences.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
