package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public interface hf0 extends IInterface {
    boolean OooOO0(int i, String str);

    List OooOO0O(int i, int i2, int i3, String str, String str2);

    IBinder OooOOO();

    List OooOOoo(String str, Intent intent, String str2, int i, int i2);

    ActivityInfo OooOo0(String str, ComponentName componentName, int i, int i2);

    ArrayList OooOoO(String str, Intent intent, String str2, int i, int i2);

    ArrayList OooOooo(int i, int i2);

    List Oooo0(String str, Intent intent, String str2, int i, int i2);

    ArrayList Oooo0o0(int i, int i2);

    ir1 Oooo0oO(int i, String str);

    void OoooOO0(int i, int i2, String str, int i3);

    int OooooOo(int i, int i2, String str);

    int Oooooo(int i, String str, String str2);

    ActivityInfo o000000o(String str, ComponentName componentName, int i, int i2);

    int o0000Oo(int i, String str);

    int o0000Oo0(String str, String str2, int i, String str3);

    List o0000o0(String str, Intent intent, String str2, int i, int i2);

    boolean o0000o0o(int i, int i2, String str);

    ApplicationInfo o0000oO0(int i, int i2, String str, String str2);

    ResolveInfo o000O0(String str, Intent intent, String str2, int i, int i2);

    ArrayList o000O00(int i, String str);

    ProviderInfo o000O0oO(String str, ComponentName componentName, int i, int i2);

    String o000OO0o(int i, String str);

    ResolveInfo o000OOO(int i, Intent intent);

    i01 o000Oo(int i, String str);

    String[] o000Oo0(int i, int i2, int i3);

    ResolveInfo o000OoOo(String str, Intent intent, String str2, int i, int i2);

    boolean o000OooO(int i, String str);

    ProviderInfo o000o0Oo(int i, int i2, String str, String str2);

    PackageInfo o000o0oo(int i, int i2, String str, String str2);

    int o000ooo0(int i, int i2, String str);

    ServiceInfo o00O0O(String str, ComponentName componentName, int i, int i2);

    int o0OoO0o(ComponentName componentName, int i);

    void oo0o0Oo(ComponentName componentName, int i, int i2, int i3);

    PermissionInfo oooo00o(int i, int i2, String str);
}
