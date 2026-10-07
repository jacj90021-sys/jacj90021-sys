package com.cmaster.cloner;

import android.content.pm.ProviderInfo;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oa0 extends rq {
    @Override // com.cmaster.cloner.rq, java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        ProviderInfo providerInfo;
        if (!TextUtils.equals(u7.OooO00o(new byte[]{107, 70, -36, 5, 75, -67, -18, 16, 104, 70, -38, 27, 88, -65, -3}, new byte[]{12, 35, -88, 85, 57, -46, -104, 121}), method.getName())) {
            return super.invoke(obj, method, objArr);
        }
        vi viVar = (vi) po0.OooO00o(rq.OooO0O0());
        if (viVar != null && (providerInfo = viVar.OooO0Oo) != null) {
            return providerInfo.name;
        }
        qa.OooO0o(u7.OooO00o(new byte[]{83, 125, -4, -57, 93, -109, 69, -99, 90, 108, -40, -10, 93, -117, 88, -100, 81, 106, -88, -22, 93, -119, 17, -80, 91, 119, -29}, new byte[]{52, 24, -120, -124, 50, -3, 49, -8}));
        return null;
    }
}
