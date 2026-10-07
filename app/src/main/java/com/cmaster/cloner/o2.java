package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o2 extends g7 implements Comparable {
    public String OooO0o;
    public PackageInfo OooO0o0;
    public String OooO0oO;

    public final String OooO0Oo() {
        if (this.OooO0oO == null) {
            this.OooO0oO = String.valueOf(this.OooO0o0.applicationInfo.loadLabel(e2.OooO0O0()));
        }
        return this.OooO0oO;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.OooO0o.compareTo(((o2) obj).OooO0o);
    }

    public final boolean equals(Object obj) {
        PackageInfo packageInfo = this.OooO0o0;
        if (this == obj) {
            return true;
        }
        if (obj == null || o2.class != obj.getClass()) {
            return false;
        }
        o2 o2Var = (o2) obj;
        PackageInfo packageInfo2 = o2Var.OooO0o0;
        return Objects.equals(packageInfo.applicationInfo.sourceDir, packageInfo2.applicationInfo.sourceDir) && packageInfo.lastUpdateTime == packageInfo2.lastUpdateTime && Objects.equals(this.OooO0o, o2Var.OooO0o);
    }

    public final int hashCode() {
        PackageInfo packageInfo = this.OooO0o0;
        return Objects.hash(packageInfo.applicationInfo.sourceDir, Long.valueOf(packageInfo.lastUpdateTime), this.OooO0o);
    }
}
