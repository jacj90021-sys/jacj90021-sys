package com.cmaster.cloner;

import android.os.Build;
import android.view.WindowManager;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qf0 implements jo1 {
    public boolean OooO00o = false;

    @Override // com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        WindowManager.LayoutParams layoutParams;
        Object[] objArr = yqVar.OooO0o;
        this.OooO00o = false;
        int iOooO00o = fn2.OooO00o(objArr, WindowManager.LayoutParams.class, 0);
        if (iOooO00o == -1 || (layoutParams = (WindowManager.LayoutParams) objArr[iOooO00o]) == null) {
            return;
        }
        layoutParams.packageName = qx1.OooO0Oo();
        int i = layoutParams.type;
        if (i == 2002 || i == 2003 || i == 2006 || i == 2007 || i == 2010 || i == 2038) {
            this.OooO00o = true;
        }
        if (Build.VERSION.SDK_INT < 26 || qx1.OooO0o0() < 26 || !this.OooO00o) {
            return;
        }
        layoutParams.type = 2038;
    }
}
