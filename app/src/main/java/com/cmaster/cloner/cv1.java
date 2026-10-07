package com.cmaster.cloner;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.io.File;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class cv1 {
    public static final String OooO00o = sn2.OooO00o("Hx0qQ+SzDpYE\n", "dnNZN4XfYvM=\n");
    public static final String OooO0OO = sn2.OooO00o("v0ghB4BhRw==\n", "ySFTc/UAKwU=\n");
    public static final String OooO0Oo = sn2.OooO00o("Svp7HA==\n", "ZJsLd5w8Xb4=\n");
    public static final File OooO0O0 = new File(e2.OooO.OooO00o.getCacheDir(), sn2.OooO00o("5ka3QG0RBgb5QbZAeRwGBg==\n", "kC/FNBhwaik=\n"));

    public static wa1 OooO00o(File file) {
        PackageInfo packageArchiveInfo = e2.OooO0O0().getPackageArchiveInfo(file.getPath(), 128);
        if (packageArchiveInfo == null) {
            return wa1.OooO00o(-1, "unknown", null);
        }
        boolean zIsDirectory = file.isDirectory();
        ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
        if (zIsDirectory) {
            applicationInfo.sourceDir = new File(file, sn2.OooO00o("n0MG25Pf2qU=\n", "/SJ1vr2+qs4=\n")).getPath();
        } else {
            applicationInfo.sourceDir = file.getPath();
        }
        try {
            ApplicationInfo applicationInfo2 = packageArchiveInfo.applicationInfo;
            String[] strArr = applicationInfo2.splitSourceDirs;
            return k63.OooO0O0(3, 0, null, null, (strArr == null || strArr.length <= 0) ? applicationInfo2.sourceDir : new File(packageArchiveInfo.applicationInfo.sourceDir).getParent()).OooO0Oo == 1 ? wa1.OooO0o0(k63.OooO00o(0, 0, packageArchiveInfo.packageName)) : wa1.OooO00o(-1, sn2.OooO00o("TIxGjyqZxlxAkEeUOQ==\n", "JeI1+0v1qnw=\n"), null);
        } catch (Exception e) {
            return wa1.OooO0OO(e);
        }
    }
}
