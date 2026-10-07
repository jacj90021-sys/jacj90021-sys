package com.cmaster.cloner;

import android.content.Context;
import java.util.UUID;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pg1 {
    public static final vf OooO0O0;
    public final Context OooO00o;

    static {
        xb xbVarOooO00o = vf.OooO00o(pg1.class);
        xbVarOooO00o.OooO00o(new pp(1, 0, au0.class));
        xbVarOooO00o.OooO00o(new pp(1, 0, Context.class));
        xbVarOooO00o.OooO0oo = new oOO0OO();
        OooO0O0 = xbVarOooO00o.OooO0o0();
    }

    public pg1(Context context) {
        this.OooO00o = context;
    }

    public final synchronized String OooO00o() {
        String string = this.OooO00o.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.OooO00o.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
