package com.cmaster.cloner;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class pr0 {
    public static final or0 OooO00o(Context context) {
        context.getClass();
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        oO000O0 oo000o0 = oO000O0.OooO00o;
        sb.append(i >= 30 ? oo000o0.OooO00o() : 0);
        Log.d("MeasurementManager", sb.toString());
        mr0 mr0Var = (i >= 30 ? oo000o0.OooO00o() : 0) >= 5 ? new mr0(context) : null;
        if (mr0Var != null) {
            return new or0(mr0Var);
        }
        return null;
    }

    public abstract nn0 OooO0O0(Uri uri, InputEvent inputEvent);
}
