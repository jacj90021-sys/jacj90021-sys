package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oc0 implements jo1 {
    public final int OooO00o;
    public final sa OooO0O0 = new sa();

    public oc0(int i) {
        this.OooO00o = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.cmaster.cloner.yq] */
    @Override // com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        String packageName;
        List OooO0OO;
        Object[] objArr = yqVar.OooO0o;
        Intent intent = (Intent) objArr[0];
        String str = (String) objArr[1];
        int iOooO0OO = (int) fn2.OooO0OO(objArr[2]);
        if (intent == null) {
            packageName = null;
        } else {
            ComponentName component = intent.getComponent();
            packageName = component != null ? component.getPackageName() : intent.getPackage();
        }
        mx1.OooO0oO().getClass();
        int i = this.OooO00o;
        if (i == 1) {
            OooO0OO = mx1.OooO0oO().OooOOO(intent, str, iOooO0OO, qx1.OooO0oO());
        } else if (i == 2) {
            mx1 mx1VarOooO0oO = mx1.OooO0oO();
            int iOooO0oO = qx1.OooO0oO();
            mx1VarOooO0oO.getClass();
            try {
                List listOooOOoo = mx1VarOooO0oO.OooO00o.OooOOoo(qx1.OooO00o(), intent, str, iOooO0OO, iOooO0oO);
                mx1.OooO0o(iOooO0oO, listOooOOoo);
                OooO0OO = listOooOOoo;
            } catch (Exception e) {
                mx1.OooO00o(e);
                OooO0OO = new ArrayList(0);
            }
        } else if (i == 3) {
            mx1 mx1VarOooO0oO2 = mx1.OooO0oO();
            int iOooO0oO2 = qx1.OooO0oO();
            mx1VarOooO0oO2.getClass();
            try {
                ArrayList arrayListOooOoO = mx1VarOooO0oO2.OooO00o.OooOoO(qx1.OooO00o(), intent, str, iOooO0OO, iOooO0oO2);
                mx1.OooO0o(iOooO0oO2, arrayListOooOoO);
                OooO0OO = arrayListOooOoO;
            } catch (Exception e2) {
                mx1.OooO00o(e2);
                OooO0OO = new ArrayList(0);
            }
        } else if (i != 4) {
            OooO0OO = new ArrayList(0);
        } else {
            mx1 mx1VarOooO0oO3 = mx1.OooO0oO();
            int iOooO0oO3 = qx1.OooO0oO();
            mx1VarOooO0oO3.getClass();
            try {
                List listO0000o0 = mx1VarOooO0oO3.OooO00o.o0000o0(qx1.OooO00o(), intent, str, iOooO0OO, iOooO0oO3);
                mx1.OooO0o(iOooO0oO3, listO0000o0);
                OooO0OO = listO0000o0;
            } catch (Exception e3) {
                mx1.OooO00o(e3);
                OooO0OO = new ArrayList(0);
            }
        }
        if (OooO0OO == null) {
            OooO0OO = new ArrayList();
        }
        Object objOooO0oO = (packageName == null || !mx1.OooO0oO().OooOO0(packageName)) ? yqVar.OooO0oO() : null;
        boolean zOooO0O0 = m21.OooO0O0(yqVar.OooO0o0.getReturnType());
        boolean z = objOooO0oO instanceof List;
        sa saVar = this.OooO0O0;
        if (z) {
            ny2.OooO00o(OooO0OO, (List) objOooO0oO, saVar, i);
        } else {
            Class cls = m21.OooO00o;
            if (cls != null && cls.isInstance(objOooO0oO)) {
                ny2.OooO00o(OooO0OO, m21.OooO00o(objOooO0oO), saVar, i);
            }
        }
        Iterator it = OooO0OO.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                it.remove();
            }
        }
        if (zOooO0O0) {
            OooO0OO = m21.OooO0OO(OooO0OO);
        }
        yqVar.OooO0oo(OooO0OO);
    }
}
