package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbcj;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class wz1 extends v6 {
    @Override // com.cmaster.cloner.v6, android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        try {
            o63.OooO0O0 = o63.OooO0O0(context);
            Method declaredMethod = Class.forName(qn2.OooO00o("ulGWpPxOUkqtW4mk/E9cV7xM1cHSbA==\n", "2T77ip8jMzk=\n"), true, o63.OooO0O0).getDeclaredMethod(qn2.OooO00o("Qzz9qA==\n", "Cm2/473uAc4=\n"), Integer.TYPE, Object[].class);
            o63.OooO00o = declaredMethod;
            declaredMethod.invoke(null, Integer.valueOf(zzbcj.zzq.zzf), new Object[]{context, providerInfo, -1, eo0.OooO0o0, (byte) 0});
        } catch (Throwable th) {
            sa.OooOO0(th);
        }
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        try {
            return o63.OooO00o(str, str2, bundle);
        } catch (Throwable th) {
            th.printStackTrace();
            sa.OooOO0(th);
            return null;
        }
    }

    @Override // com.cmaster.cloner.v6, android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, String str3, Bundle bundle) {
        try {
            return o63.OooO00o(str2, str3, bundle);
        } catch (Throwable th) {
            th.printStackTrace();
            sa.OooOO0(th);
            return null;
        }
    }
}
