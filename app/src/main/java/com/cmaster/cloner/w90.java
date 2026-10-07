package com.cmaster.cloner;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public interface w90 extends IInterface {
    void OooOOO0(Intent intent, ActivityInfo activityInfo);

    void OooOoOO(IBinder iBinder);

    void OoooooO(IBinder iBinder, IBinder iBinder2, Intent intent, boolean z, int i);

    void o0000o(IBinder iBinder, ArrayList arrayList);

    boolean o000O000(Intent intent, sf1 sf1Var, int i);

    void o000O0o(IBinder iBinder, ServiceInfo serviceInfo, int i);

    boolean o000OO0O(sf1 sf1Var, int i);

    void o000Oo0O(ce ceVar);

    void o000o0O0(p2 p2Var);

    void o000oOoo(IBinder iBinder, IBinder iBinder2, Intent intent);

    IBinder o00Oo0(String str, ProviderInfo providerInfo);

    void o0Oo0oo(IBinder iBinder, ArrayList arrayList);
}
