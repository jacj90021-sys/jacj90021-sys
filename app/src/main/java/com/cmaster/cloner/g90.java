package com.cmaster.cloner;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g90 implements jo1 {
    public static final String OooO00o = u7.OooO00o(new byte[]{100, -117, 123, 112, 72, 10, -66, -13, 103, -105, 112, 99, 67, 0, -69, -70, 113, -53, 107, 103, 74, 19, -75, -69, 100, -105, 102, 67, 87, 19, -101, -91, 105, -118, 104, 110, 78, 16, -82, -115, 112, -105, 126, 118, 78, 12, -76}, new byte[]{5, -27, 31, 2, 39, 99, -38, -55});
    public static final String OooO0O0 = u7.OooO00o(new byte[]{54, 113, 14, 43, -98, -81, -39, 4, 53, 109, 5, 56, -107, -91, -36, 77, 35, 49, 30, 60, -100, -74, -46, 76, 54, 109, 19, 24, -127, -74, -22, 86, 62, 107, 15, 53, -104, -75, -55, 122, 34, 109, 11, 45, -104, -87, -45}, new byte[]{87, 31, 106, 89, -15, -58, -67, 62});
    public static final String OooO0OO = u7.OooO00o(new byte[]{106, -74, -15, -117, -33, 51, -46, -88, 105, -86, -6, -104, -44, 57, -41, -31, 127, -10, -4, -99, -10, 53, -60, -64, 110, -85, -27, -106, -34, 41, -45, -41, 125, -67, -5, -115}, new byte[]{11, -40, -107, -7, -80, 90, -74, -110});

    @Override // com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        Uri uriOooO0O0;
        Object[] objArr = yqVar.OooO0o;
        t43.OooO0Oo(objArr, true);
        t43.OooO0o(objArr.length - 1, objArr);
        int iOooO00o = fn2.OooO00o(objArr, Intent.class, 0);
        if (iOooO00o >= 0) {
            int i = iOooO00o + 6;
            objArr[i] = null;
            Intent intent = (Intent) objArr[iOooO00o];
            if (intent.getComponent() != null) {
                lw1 lw1VarOooO0O0 = lw1.OooO0O0();
                lw1VarOooO0O0.getClass();
                try {
                    lw1VarOooO0O0.OooO00o.o00000(qx1.OooO0oO(), intent, qx1.OooO00o());
                } catch (Exception e) {
                    lw1.OooO00o(e);
                }
                yqVar.OooO0oo(0);
                return;
            }
            String action = intent.getAction();
            if (TextUtils.equals(action, u7.OooO00o(new byte[]{103, -82, 1, -92, -128, -35, 72, -123, 111, -82, 17, -77, -127, -64, 2, -54, 101, -76, 12, -71, -127, -102, 97, -18, 66, -119, 36, -119, -68, -9, 109, -27, 72, -123, 55, -119, -68, -9, 109, -27, 89, -122, 44, -102, -86}, new byte[]{6, -64, 101, -42, -17, -76, 44, -85})) && (uriOooO0O0 = lr2.OooO0O0(qx1.OooO0oO(), intent.getData(), qx1.OooO0Oo())) != null) {
                intent.setDataAndType(uriOooO0O0, intent.getType());
            }
            int iOooO0OO = yqVar.OooO0OO(i, Bundle.class);
            if (iOooO0OO >= 0) {
                Object obj = objArr[iOooO0OO];
                if (obj instanceof Bundle) {
                    Bundle bundle = (Bundle) obj;
                    long j = bundle.getLong(OooO00o);
                    if (j <= 0) {
                        j = bundle.getLong(OooO0O0);
                    }
                    if (j > 0 || bundle.containsKey(OooO0OO)) {
                        objArr[iOooO0OO] = null;
                    }
                }
            }
            if (objArr[objArr.length - 1] instanceof Integer) {
                objArr[objArr.length - 1] = Integer.valueOf(jr1.OooO00o());
            }
            String strOooO00o = intent.getPackage();
            if (strOooO00o == null) {
                strOooO00o = qx1.OooO00o();
            }
            String strOooO00o2 = u61.OooO00o(qx1.OooO0oO(), action, strOooO00o);
            if (strOooO00o2 != null) {
                intent.setAction(strOooO00o2);
            }
            intent.setPackage(qx1.OooO0Oo());
        }
    }
}
