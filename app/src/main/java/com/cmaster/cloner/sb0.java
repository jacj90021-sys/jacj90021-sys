package com.cmaster.cloner;

import android.content.pm.ShortcutInfo;
import android.location.ILocationListener;
import android.location.LocationRequest;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sb0 extends t2 {
    public final /* synthetic */ int OooO0O0;
    public final Object OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb0(Object obj, int i) {
        super(false, 4);
        this.OooO0O0 = i;
        this.OooO0OO = obj;
    }

    @Override // com.cmaster.cloner.t2, com.cmaster.cloner.jo1
    public void OooO00o(yq yqVar) throws Exception {
        ShortcutInfo shortcutInfoOooOO0;
        int i = this.OooO0O0;
        Object obj = this.OooO0OO;
        switch (i) {
            case 1:
                vb0 vb0Var = (vb0) obj;
                Object[] objArr = yqVar.OooO0o;
                LocationRequest locationRequest = (LocationRequest) objArr[1];
                vb0.OooOOO0(locationRequest);
                l81 l81Var = to0.OooO0OO;
                String str = l81Var != null ? (String) l81Var.OooO0O0(locationRequest) : null;
                int iOooO00o = fn2.OooO00o(objArr, ILocationListener.class, 0);
                if (str != null && iOooO00o >= 0) {
                    if (!TextUtils.equals(str, u7.OooO00o(new byte[]{-109, -41, -95, -57, -125}, new byte[]{-11, -94, -46, -94, -25, -16, 5, 111})) && vb0.OooOO0(vb0Var)) {
                        String strOooO00o = u7.OooO00o(new byte[]{-47, 19, -67, 17, 2}, new byte[]{-73, 102, -50, 116, 102, -48, -54, -75});
                        if (l81Var != null) {
                            l81Var.OooO0oo(locationRequest, strOooO00o);
                        }
                        objArr[0] = u7.OooO00o(new byte[]{94, 120, 94, -55, 28}, new byte[]{56, 13, 45, -84, 120, 79, -18, -13});
                    }
                    ILocationListener iLocationListener = (ILocationListener) objArr[iOooO00o];
                    if (iLocationListener != null) {
                        objArr[iOooO00o] = vb0.OooOO0O(vb0Var, iLocationListener, str);
                    }
                }
                super.OooO00o(yqVar);
                break;
            case 2:
                pd0 pd0Var = (pd0) obj;
                Object[] objArr2 = yqVar.OooO0o;
                int iOooO00o2 = fn2.OooO00o(objArr2, lu.OooO(), 0);
                if (iOooO00o2 >= 0) {
                    ShortcutInfo shortcutInfoOooOO02 = pd0.OooOO0(pd0Var, lu.OooO0oO(objArr2[iOooO00o2]));
                    if (shortcutInfoOooOO02 != null) {
                        objArr2[iOooO00o2] = shortcutInfoOooOO02;
                    }
                } else {
                    int iOooO00o3 = fn2.OooO00o(objArr2, m21.OooO00o, 0);
                    if (iOooO00o3 >= 0) {
                        List listOooO00o = m21.OooO00o(objArr2[iOooO00o3]);
                        ArrayList arrayList = new ArrayList();
                        if (!fn2.OooO0Oo(listOooO00o)) {
                            for (Object obj2 : listOooO00o) {
                                if (lu.OooOo00(obj2) && (shortcutInfoOooOO0 = pd0.OooOO0(pd0Var, lu.OooO0oO(obj2))) != null) {
                                    arrayList.add(shortcutInfoOooOO0);
                                }
                            }
                        }
                        if (!fn2.OooO0Oo(arrayList)) {
                            objArr2[iOooO00o3] = m21.OooO0OO(arrayList);
                        }
                    }
                }
                super.OooO00o(yqVar);
                pd0.OooOO0O(pd0Var, yqVar);
                break;
            default:
                super.OooO00o(yqVar);
                break;
        }
    }
}
