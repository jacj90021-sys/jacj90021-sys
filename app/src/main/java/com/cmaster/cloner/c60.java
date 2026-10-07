package com.cmaster.cloner;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.job.JobWorkItem;
import android.content.pm.VersionedPackage;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c60 {
    public static /* bridge */ /* synthetic */ NotificationChannel OooO0O0(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel OooO0OO(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup OooO0Oo(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static /* bridge */ /* synthetic */ VersionedPackage OooO0o(Object obj) {
        return (VersionedPackage) obj;
    }

    public static /* bridge */ /* synthetic */ JobWorkItem OooO0o0(Object obj) {
        return (JobWorkItem) obj;
    }

    public static /* bridge */ /* synthetic */ Class OooOO0() {
        return VersionedPackage.class;
    }

    public static /* bridge */ /* synthetic */ boolean OooOo0O(Object obj) {
        return obj instanceof JobWorkItem;
    }

    public static /* bridge */ /* synthetic */ Class OooOoO0() {
        return JobWorkItem.class;
    }

    public static /* bridge */ /* synthetic */ boolean OooOoOO(Object obj) {
        return obj instanceof NotificationChannel;
    }

    public static /* bridge */ /* synthetic */ boolean OooOoo(Object obj) {
        return obj instanceof NotificationChannelGroup;
    }

    public static /* bridge */ /* synthetic */ Class OooOoo0() {
        return NotificationChannelGroup.class;
    }

    public static /* bridge */ /* synthetic */ Class OooOooO() {
        return NotificationChannel.class;
    }
}
