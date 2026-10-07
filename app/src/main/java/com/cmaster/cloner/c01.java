package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class c01 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ d01 OooO0o0;

    public /* synthetic */ c01(d01 d01Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = d01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<PackageInfo> installedPackages;
        switch (this.OooO0Oo) {
            case 0:
                d01 d01Var = this.OooO0o0;
                PackageManager packageManager = e2.OooO.OooO00o.getPackageManager();
                String str = e2.OooO00o().applicationInfo.nativeLibraryDir;
                if (str != null) {
                    new File(str).getName();
                }
                try {
                    installedPackages = packageManager.getInstalledPackages(128);
                } catch (Exception unused) {
                    installedPackages = Collections.EMPTY_LIST;
                }
                int i = 1;
                d01Var.OooO0oo.OooOO0(Boolean.valueOf(installedPackages.size() > 1));
                LinkedHashMap linkedHashMap = new LinkedHashMap(installedPackages.size());
                for (PackageInfo packageInfo : installedPackages) {
                    linkedHashMap.put(packageInfo.packageName, packageInfo);
                }
                Collection<PackageInfo> collectionValues = linkedHashMap.values();
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (PackageInfo packageInfo2 : collectionValues) {
                    String str2 = packageInfo2.versionName;
                    if (str2 == null || !str2.contains(Build.VERSION.INCREMENTAL)) {
                        if (!packageInfo2.packageName.equals(e2.OooO.OooO00o.getPackageName()) && !hz.OooO0OO.contains(packageInfo2.packageName)) {
                            o2 o2Var = new o2();
                            o2Var.OooO0o0 = packageInfo2;
                            try {
                                o2Var.OooO0o = d01Var.OooO00o.OooOOO(o2Var.OooO0Oo());
                            } catch (Throwable unused2) {
                                o2Var.OooO0o = sn2.OooO00o("Jg==\n", "BU+R3Ffx51E=\n");
                            }
                            List arrayList2 = (List) linkedHashMap2.get(o2Var.OooO0o);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMap2.put(o2Var.OooO0o, arrayList2);
                            }
                            if (d01.OooOO0.contains(packageInfo2.packageName)) {
                                String str3 = d01.OooOO0O;
                                o2 o2Var2 = new o2();
                                o2Var2.OooO0o0 = packageInfo2;
                                o2Var2.OooO0oO = String.valueOf(packageInfo2.applicationInfo.loadLabel(e2.OooO0O0()));
                                o2Var2.OooO0o = str3;
                                arrayList.add(o2Var2);
                            }
                            arrayList2.add(o2Var);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    linkedHashMap2.put(d01.OooOO0O, arrayList);
                }
                d01Var.OooO0Oo = linkedHashMap2;
                h1.OooO0O0.execute(new c01(d01Var, i));
                this.OooO0o0.OooO0O0.OooOO0(Boolean.FALSE);
                break;
            default:
                this.OooO0o0.OooO00o();
                break;
        }
    }
}
