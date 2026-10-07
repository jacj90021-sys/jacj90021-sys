package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ny2 {
    public static void OooO00o(List list, List list2, sa saVar, int i) {
        if (list2 == null) {
            return;
        }
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        for (Object obj : list) {
            ComponentName componentNameOooO0OO = OooO0OO(i, obj);
            if (componentNameOooO0OO != null) {
                map.put(componentNameOooO0OO, obj);
                hashSet.add(componentNameOooO0OO.getPackageName());
            }
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            ComponentName componentNameOooO0OO2 = OooO0OO(i, resolveInfo);
            if (componentNameOooO0OO2 == null || (map.get(componentNameOooO0OO2) == null && !hashSet.contains(componentNameOooO0OO2.getPackageName()))) {
                ApplicationInfo applicationInfoOooO0O0 = OooO0O0(resolveInfo);
                if (i21.OooO0oO(applicationInfoOooO0O0) && !TextUtils.equals(applicationInfoOooO0O0.packageName, qx1.OooO00o())) {
                    list.add(resolveInfo);
                }
            }
        }
    }

    public static ApplicationInfo OooO0O0(ResolveInfo resolveInfo) {
        if (resolveInfo == null) {
            return null;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        if (activityInfo != null) {
            return activityInfo.applicationInfo;
        }
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo != null) {
            return serviceInfo.applicationInfo;
        }
        ProviderInfo providerInfo = resolveInfo.providerInfo;
        if (providerInfo != null) {
            return providerInfo.applicationInfo;
        }
        return null;
    }

    public static ComponentName OooO0OO(int i, Object obj) {
        if (obj == null) {
            return null;
        }
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        if (i == 1 || i == 2) {
            if (resolveInfo.activityInfo == null) {
                return null;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (i == 3) {
            if (resolveInfo.serviceInfo == null) {
                return null;
            }
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (i != 4 || resolveInfo.providerInfo == null) {
            return null;
        }
        ProviderInfo providerInfo = resolveInfo.providerInfo;
        return new ComponentName(providerInfo.packageName, providerInfo.name);
    }
}
