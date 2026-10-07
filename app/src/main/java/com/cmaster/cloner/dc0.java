package com.cmaster.cloner;

import android.text.TextUtils;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dc0 extends t2 {
    public final int OooO0O0;

    public dc0(ec0 ec0Var, int i) {
        super(false, 4);
        this.OooO0O0 = i;
    }

    @Override // com.cmaster.cloner.t2, com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        Object[] objArr = yqVar.OooO0o;
        if (objArr != null) {
            int length = objArr.length;
            int i = this.OooO0O0;
            if (length > i) {
                Object obj = objArr[i];
                if (obj instanceof String) {
                    String str = (String) obj;
                    String strOooO00o = qx1.OooO00o();
                    String strOooO0Oo = qx1.OooO0Oo();
                    int iOooO0oO = qx1.OooO0oO();
                    if (!TextUtils.equals(str, strOooO00o) && !TextUtils.equals(str, strOooO0Oo)) {
                        objArr[i] = ec0.OooOOO0(iOooO0oO, str, strOooO00o);
                    }
                }
            }
        }
        t43.OooO0Oo(objArr, true);
        ec0.OooOOOo(yqVar.OooO0oO(), true);
    }
}
