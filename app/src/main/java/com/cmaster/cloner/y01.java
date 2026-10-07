package com.cmaster.cloner;

import android.app.NotificationChannel;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.VersionedPackage;

/* loaded from: classes.dex */
public abstract /* synthetic */ class y01 {
    public static /* synthetic */ VersionedPackage OooO(int i, String str) {
        return new VersionedPackage(str, i);
    }

    public static /* synthetic */ NotificationChannel OooO0o0(String str, CharSequence charSequence) {
        return new NotificationChannel(str, charSequence, 3);
    }

    public static /* bridge */ /* synthetic */ SharedLibraryInfo OooO0oo(Object obj) {
        return (SharedLibraryInfo) obj;
    }

    public static /* synthetic */ void OooOOo0() {
    }
}
