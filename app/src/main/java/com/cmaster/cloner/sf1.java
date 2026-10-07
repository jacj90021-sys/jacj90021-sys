package com.cmaster.cloner;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public interface sf1 extends IInterface {
    void onBindingDied(ComponentName componentName);

    void onNullBinding(ComponentName componentName);

    void onServiceConnected(ComponentName componentName, IBinder iBinder);

    void onServiceDisconnected(ComponentName componentName);
}
