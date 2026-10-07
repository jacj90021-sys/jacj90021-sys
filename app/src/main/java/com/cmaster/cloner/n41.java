package com.cmaster.cloner;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n41 {
    public final Context OooO00o;
    public long OooO0O0 = 0;
    public SharedPreferences OooO0OO = null;
    public final String OooO0Oo;
    public j41 OooO0o;
    public PreferenceScreen OooO0o0;
    public j41 OooO0oO;
    public j41 OooO0oo;

    public n41(Context context) {
        this.OooO00o = context;
        this.OooO0Oo = context.getPackageName() + "_preferences";
    }

    public final SharedPreferences OooO00o() {
        if (this.OooO0OO == null) {
            this.OooO0OO = this.OooO00o.getSharedPreferences(this.OooO0Oo, 0);
        }
        return this.OooO0OO;
    }
}
