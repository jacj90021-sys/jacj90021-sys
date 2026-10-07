package com.cmaster.cloner;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t62 implements dg2 {
    public Object OooO;
    public Object OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;
    public Object OooO0oO;
    public Object OooO0oo;
    public Object OooOO0;

    public static boolean OooO(fh0 fh0Var) {
        if (fh0Var != null && !fh0Var.OooO0oo) {
            int i = fh0Var.OooO0o0;
            p80 p80Var = p80.OooO0OO;
            PackageInfo packageInfoOooO0O0 = w01.OooO0O0(p80Var.OooO00o, fh0Var.OooOOO0, 0);
            if (packageInfoOooO0O0 == null || packageInfoOooO0O0.versionCode > i) {
                return true;
            }
            ApplicationInfo applicationInfo = packageInfoOooO0O0.applicationInfo;
            if (applicationInfo != null && !TextUtils.equals(fh0Var.OooOOOo, applicationInfo.sourceDir)) {
                return true;
            }
        }
        return false;
    }

    public static void OooOOOo(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        p72 p72Var = p72.OooO0o;
        zj2 zj2Var = p72Var.OooO00o;
        String str2 = p72Var.OooO0Oo.OooO0Oo;
        zj2Var.getClass();
        zj2.OooO00o(context, str2, bundle, new er1(zj2Var, context, 8));
    }

    public ActivityInfo OooO00o(ComponentName componentName, int i, int i2) {
        z01 z01Var;
        c21 c21VarOooO0O0;
        ng ngVar = (ng) this.OooO0oo;
        synchronized (ngVar.OooO00o) {
            z01Var = (z01) ngVar.OooO0O0.OooOO0.get(componentName);
        }
        if (z01Var == null || !OooO0oo(z01Var.OooO0o, i, i2) || (c21VarOooO0O0 = OooO0O0(componentName.getPackageName())) == null) {
            return null;
        }
        return z01Var.OooO00o.OooO0o0.OooO0OO(z01Var, i, c21VarOooO0O0.OooO0o0(i2), i2);
    }

    public c21 OooO0O0(String str) {
        d11 d11Var = (d11) ((LinkedHashMap) this.OooO0Oo).get(str);
        if (d11Var == null) {
            return null;
        }
        return d11Var.OooO0Oo;
    }

    public c21 OooO0OO(String str) {
        return (c21) ((LinkedHashMap) this.OooO0o0).get(str);
    }

    public ProviderInfo OooO0Oo(ComponentName componentName, int i, int i2) {
        g11 g11Var;
        c21 c21VarOooO0O0;
        ng ngVar = (ng) this.OooO0oo;
        synchronized (ngVar.OooO00o) {
            g11Var = (g11) ngVar.OooO0OO.OooOO0.get(componentName);
        }
        if (g11Var == null || !OooO0oo(g11Var.OooO0o, i, i2) || (c21VarOooO0O0 = OooO0O0(componentName.getPackageName())) == null) {
            return null;
        }
        return g11Var.OooO00o.OooO0o0.OooO0o0(g11Var, i, c21VarOooO0O0.OooO0o0(i2), i2);
    }

    public ArrayList OooO0o(int i, String str) {
        ApplicationInfo applicationInfoOooO0oO;
        ArrayList arrayList = new ArrayList();
        d11 d11Var = (d11) ((LinkedHashMap) this.OooO0Oo).get(str);
        if (d11Var != null) {
            ArrayList arrayList2 = d11Var.OooO0oO;
            if (!fn2.OooO0Oo(arrayList2)) {
                try {
                    applicationInfoOooO0oO = d11Var.OooO0o0.OooO0oO(0, i);
                } catch (Exception e) {
                    e.printStackTrace();
                    applicationInfoOooO0oO = null;
                }
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    z01 z01Var = (z01) obj;
                    if (OooO0oo(z01Var.OooO0o, 0, i)) {
                        ActivityInfo activityInfo = z01Var.OooO0o;
                        activityInfo.applicationInfo = applicationInfoOooO0oO;
                        arrayList.add(activityInfo);
                    }
                }
            }
        }
        return arrayList;
    }

    public ActivityInfo OooO0o0(ComponentName componentName, int i, int i2) {
        z01 z01Var;
        d11 d11Var = (d11) ((LinkedHashMap) this.OooO0Oo).get(componentName.getPackageName());
        if (d11Var == null || !d11Var.OooO0Oo.OooO0o0(i2).OooO0Oo) {
            return null;
        }
        ng ngVar = (ng) this.OooO0oo;
        synchronized (ngVar.OooO00o) {
            z01Var = (z01) ngVar.OooO0Oo.OooOO0.get(componentName);
        }
        if (z01Var == null || !OooO0oo(z01Var.OooO0o, i, i2)) {
            return null;
        }
        return z01Var.OooO00o.OooO0o0.OooO0OO(z01Var, i, d11Var.OooO0Oo.OooO0o0(i2), i2);
    }

    public ServiceInfo OooO0oO(ComponentName componentName, int i, int i2) {
        i11 i11Var;
        c21 c21VarOooO0O0;
        ng ngVar = (ng) this.OooO0oo;
        synchronized (ngVar.OooO00o) {
            i11Var = (i11) ngVar.OooO0o0.OooOO0.get(componentName);
        }
        if (i11Var == null || !OooO0oo(i11Var.OooO0o, i, i2) || (c21VarOooO0O0 = OooO0O0(componentName.getPackageName())) == null) {
            return null;
        }
        return i11Var.OooO00o.OooO0o0.OooO0o(i11Var, i, c21VarOooO0O0.OooO0o0(i2), i2);
    }

    public boolean OooO0oo(ComponentInfo componentInfo, int i, int i2) {
        c21 c21VarOooO0OO = OooO0OO(componentInfo.packageName);
        if (c21VarOooO0OO == null) {
            return false;
        }
        return c21VarOooO0OO.OooO0o0(i2).OooO0OO(componentInfo, i);
    }

    public List OooOO0(Intent intent, String str, int i, int i2) {
        ArrayList arrayListOooOOo;
        ArrayList arrayListOooO;
        String str2 = intent.getPackage();
        if (str2 == null) {
            ng ngVar = (ng) this.OooO0oo;
            synchronized (ngVar.OooO00o) {
                kg kgVar = ngVar.OooO0O0;
                kgVar.getClass();
                if (ng.OooOO0O.OooO00o(i2)) {
                    kgVar.OooOO0O = i;
                    arrayListOooO = kgVar.OooO(intent, str, (i & 65536) != 0, i2);
                } else {
                    arrayListOooO = null;
                }
            }
            return arrayListOooO;
        }
        d11 d11Var = (d11) ((LinkedHashMap) this.OooO0Oo).get(str2);
        if (d11Var != null) {
            ng ngVar2 = (ng) this.OooO0oo;
            ArrayList arrayList = d11Var.OooO0o;
            synchronized (ngVar2.OooO00o) {
                arrayListOooOOo = ngVar2.OooO0O0.OooOOo(intent, str, i, arrayList, i2);
            }
            if (arrayListOooOOo != null) {
                return arrayListOooOOo;
            }
        }
        return Collections.EMPTY_LIST;
    }

    public List OooOO0O(Intent intent, String str, int i, int i2) {
        ArrayList arrayListOooOOOo;
        ArrayList arrayListOooO;
        String str2 = intent.getPackage();
        if (str2 != null) {
            d11 d11Var = (d11) ((LinkedHashMap) this.OooO0Oo).get(str2);
            if (d11Var == null) {
                return Collections.EMPTY_LIST;
            }
            ng ngVar = (ng) this.OooO0oo;
            ArrayList arrayList = d11Var.OooO0oo;
            synchronized (ngVar.OooO00o) {
                arrayListOooOOOo = ngVar.OooO0OO.OooOOOo(intent, str, i, arrayList, i2);
            }
            return arrayListOooOOOo;
        }
        ng ngVar2 = (ng) this.OooO0oo;
        synchronized (ngVar2.OooO00o) {
            lg lgVar = ngVar2.OooO0OO;
            lgVar.getClass();
            if (ng.OooOO0O.OooO00o(i2)) {
                lgVar.OooOO0O = i;
                arrayListOooO = lgVar.OooO(intent, str, (i & 65536) != 0, i2);
            } else {
                arrayListOooO = null;
            }
        }
        return arrayListOooO;
    }

    public List OooOO0o(Intent intent, String str, int i, int i2) {
        ArrayList arrayListOooOOo;
        ArrayList arrayListOooO;
        String str2 = intent.getPackage();
        if (str2 != null) {
            d11 d11Var = (d11) ((LinkedHashMap) this.OooO0Oo).get(str2);
            if (d11Var == null) {
                return Collections.EMPTY_LIST;
            }
            ng ngVar = (ng) this.OooO0oo;
            ArrayList arrayList = d11Var.OooO0oO;
            synchronized (ngVar.OooO00o) {
                arrayListOooOOo = ngVar.OooO0Oo.OooOOo(intent, str, i, arrayList, i2);
            }
            return arrayListOooOOo;
        }
        ng ngVar2 = (ng) this.OooO0oo;
        synchronized (ngVar2.OooO00o) {
            kg kgVar = ngVar2.OooO0Oo;
            kgVar.getClass();
            if (ng.OooOO0O.OooO00o(i2)) {
                kgVar.OooOO0O = i;
                arrayListOooO = kgVar.OooO(intent, str, (i & 65536) != 0, i2);
            } else {
                arrayListOooO = null;
            }
        }
        return arrayListOooO;
    }

    public boolean OooOOO(c21 c21Var, k11 k11Var) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.OooO0o0;
            String str = c21Var.OooO00o;
            int i = c21Var.OooO0O0;
            linkedHashMap.put(str, c21Var);
            ((SparseArray) this.OooO0o).put(i, c21Var);
            fh0 fh0Var = c21Var.OooOOoo;
            if (OooO(fh0Var)) {
                return false;
            }
            if (k11Var == null) {
                Context context = (Context) this.OooOO0;
                int i2 = fh0Var.OooO0o;
                k11Var = new k11(context, fh0Var);
            }
            d11 d11Var = k11Var.OooO0O0;
            c21Var.OooOo00 = d11Var;
            d11Var.OooO0Oo = c21Var;
            ((LinkedHashMap) this.OooO0Oo).put(str, d11Var);
            c21Var.OooOo00.OooO0OO = k11Var.OooO0oO(0, -1);
            if (!TextUtils.isEmpty(c21Var.OooO0Oo)) {
                rg1 rg1Var = (rg1) ((LinkedHashMap) this.OooO0oO).get(c21Var.OooO0Oo);
                if (rg1Var == null) {
                    rg1Var = new rg1(i);
                }
                rg1Var.OooO00o.put(str, c21Var);
            }
            ((ng) this.OooO0oo).OooO0O0(c21Var.OooOo00);
            ((hx2) this.OooO).OooOo0(c21Var.OooOo00);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List OooOOO0(Intent intent, String str, int i, int i2) {
        ArrayList arrayListOooOOOo;
        ArrayList arrayListOooO;
        String str2 = intent.getPackage();
        if (str2 != null) {
            d11 d11Var = (d11) ((LinkedHashMap) this.OooO0Oo).get(str2);
            if (d11Var == null) {
                return Collections.EMPTY_LIST;
            }
            ng ngVar = (ng) this.OooO0oo;
            ArrayList arrayList = d11Var.OooO;
            synchronized (ngVar.OooO00o) {
                arrayListOooOOOo = ngVar.OooO0o0.OooOOOo(intent, str, i, arrayList, i2);
            }
            return arrayListOooOOOo;
        }
        ng ngVar2 = (ng) this.OooO0oo;
        synchronized (ngVar2.OooO00o) {
            mg mgVar = ngVar2.OooO0o0;
            mgVar.getClass();
            if (ng.OooOO0O.OooO00o(i2)) {
                mgVar.OooOO0O = i;
                arrayListOooO = mgVar.OooO(intent, str, (i & 65536) != 0, i2);
            } else {
                arrayListOooO = null;
            }
        }
        return arrayListOooO;
    }

    @Override // com.cmaster.cloner.lg2
    /* renamed from: OooOOOO, reason: merged with bridge method [inline-methods] */
    public k42 zza() {
        Application application = (Application) ((uf) this.OooO0Oo).OooO0Oo;
        Handler handler = kd2.OooO00o;
        u73.OooO00o(handler);
        gd2 gd2Var = kd2.OooO0O0;
        u73.OooO00o(gd2Var);
        return new k42(application, handler, gd2Var, (s52) ((zf2) this.OooO0o).zza(), (h92) ((zf2) this.OooO0oO).zza(), ((er1) this.OooO0oo).zza(), ((hx2) this.OooO).OooOooO(), (qh2) ((zf2) this.OooOO0).zza());
    }
}
