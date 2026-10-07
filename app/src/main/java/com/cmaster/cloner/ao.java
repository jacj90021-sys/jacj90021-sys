package com.cmaster.cloner;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ao extends vu0 {
    @Override // com.cmaster.cloner.vu0
    public final Signature[] OooO0oo(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
