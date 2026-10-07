package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class mm implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, gm gmVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext != null) {
            onCustomTabsServiceConnected(componentName, new lm(ICustomTabsService.Stub.asInterface(iBinder), componentName));
        } else {
            qa.OooO0o("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
