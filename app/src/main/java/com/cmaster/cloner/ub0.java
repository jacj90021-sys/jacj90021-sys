package com.cmaster.cloner;

import android.location.ILocationListener;
import android.location.LocationRequest;
import android.text.TextUtils;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ub0 implements jo1 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ vb0 OooO0O0;

    public /* synthetic */ ub0(vb0 vb0Var, int i) {
        this.OooO00o = i;
        this.OooO0O0 = vb0Var;
    }

    @Override // com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) throws IllegalAccessException, IllegalArgumentException {
        switch (this.OooO00o) {
            case 0:
                Object[] objArr = yqVar.OooO0o;
                int iOooO00o = fn2.OooO00o(objArr, ILocationListener.class, 0);
                if (objArr == null || iOooO00o < 0 || iOooO00o >= objArr.length) {
                    return;
                }
                ILocationListener iLocationListener = (ILocationListener) objArr[iOooO00o];
                synchronized (this.OooO0O0.OooOO0O) {
                    try {
                        tb0 tb0Var = (tb0) this.OooO0O0.OooOO0O.get(iLocationListener);
                        if (tb0Var != null) {
                            objArr[iOooO00o] = tb0Var;
                        }
                    } finally {
                    }
                }
                return;
            default:
                vb0 vb0Var = this.OooO0O0;
                Object[] objArr2 = yqVar.OooO0o;
                t43.OooO0Oo(objArr2, true);
                LocationRequest locationRequest = (LocationRequest) objArr2[0];
                vb0.OooOOO0(locationRequest);
                l81 l81Var = to0.OooO0OO;
                String str = l81Var != null ? (String) l81Var.OooO0O0(locationRequest) : null;
                int iOooO00o2 = fn2.OooO00o(objArr2, ILocationListener.class, 0);
                if (str == null || iOooO00o2 < 0) {
                    return;
                }
                if (!TextUtils.equals(str, u7.OooO00o(new byte[]{90, 4, -81, -65, -97}, new byte[]{60, 113, -36, -38, -5, 101, -125, 80})) && vb0.OooOO0(vb0Var)) {
                    String strOooO00o = u7.OooO00o(new byte[]{-19, 77, -15, 11, -70}, new byte[]{-117, 56, -126, 110, -34, -15, 37, -76});
                    if (l81Var != null) {
                        l81Var.OooO0oo(locationRequest, strOooO00o);
                    }
                }
                objArr2[iOooO00o2] = vb0.OooOO0O(vb0Var, (ILocationListener) objArr2[iOooO00o2], str);
                return;
        }
    }
}
