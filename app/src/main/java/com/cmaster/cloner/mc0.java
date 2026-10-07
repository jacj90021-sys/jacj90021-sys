package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mc0 implements jo1 {
    public final int OooO00o;

    public mc0(int i) {
        this.OooO00o = i;
    }

    @Override // com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) throws Exception {
        ComponentInfo componentInfoOooOo0;
        Object[] objArr = yqVar.OooO0o;
        ComponentName componentName = (ComponentName) objArr[0];
        int iOooO0OO = (int) fn2.OooO0OO(objArr[1]);
        mx1.OooO0oO().getClass();
        int i = this.OooO00o;
        if (i == 1) {
            mx1 mx1VarOooO0oO = mx1.OooO0oO();
            int iOooO0oO = qx1.OooO0oO();
            mx1VarOooO0oO.getClass();
            try {
                componentInfoOooOo0 = mx1VarOooO0oO.OooO00o.OooOo0(qx1.OooO00o(), componentName, iOooO0OO, iOooO0oO);
                mx1.OooO0OO(componentInfoOooOo0, iOooO0oO);
            } catch (Exception e) {
                mx1.OooO00o(e);
            }
        } else if (i == 2) {
            mx1 mx1VarOooO0oO2 = mx1.OooO0oO();
            int iOooO0oO2 = qx1.OooO0oO();
            mx1VarOooO0oO2.getClass();
            try {
                componentInfoOooOo0 = mx1VarOooO0oO2.OooO00o.o000000o(qx1.OooO00o(), componentName, iOooO0OO, iOooO0oO2);
                mx1.OooO0OO(componentInfoOooOo0, iOooO0oO2);
            } catch (Exception e2) {
                mx1.OooO00o(e2);
            }
        } else if (i == 3) {
            mx1 mx1VarOooO0oO3 = mx1.OooO0oO();
            int iOooO0oO3 = qx1.OooO0oO();
            mx1VarOooO0oO3.getClass();
            try {
                componentInfoOooOo0 = mx1VarOooO0oO3.OooO00o.o00O0O(qx1.OooO00o(), componentName, iOooO0OO, iOooO0oO3);
                mx1.OooO0OO(componentInfoOooOo0, iOooO0oO3);
            } catch (Exception e3) {
                mx1.OooO00o(e3);
            }
        } else if (i != 4) {
            componentInfoOooOo0 = null;
        } else {
            mx1 mx1VarOooO0oO4 = mx1.OooO0oO();
            int iOooO0oO4 = qx1.OooO0oO();
            mx1VarOooO0oO4.getClass();
            try {
                componentInfoOooOo0 = mx1VarOooO0oO4.OooO00o.o000O0oO(qx1.OooO00o(), componentName, iOooO0OO, iOooO0oO4);
                mx1.OooO0OO(componentInfoOooOo0, iOooO0oO4);
            } catch (Exception e4) {
                mx1.OooO00o(e4);
            }
        }
        if (componentInfoOooOo0 != null && !i21.OooO00o(componentInfoOooOo0.packageName)) {
            yqVar.OooO0oo(componentInfoOooOo0);
            return;
        }
        Object objOooO0oO = yqVar.OooO0oO();
        if ((objOooO0oO instanceof ComponentInfo) && !i21.OooO0oO(((ComponentInfo) objOooO0oO).applicationInfo)) {
            yqVar.OooO0oo(null);
        }
    }
}
