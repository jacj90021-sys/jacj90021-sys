package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class d91 {
    private final String zza;
    private Object zzb;

    public d91(String str) {
        this.zza = str;
    }

    public abstract Object getRemoteCreator(IBinder iBinder);

    public final Object getRemoteCreatorInstance(Context context) throws PackageManager.NameNotFoundException, c91 {
        Context contextCreatePackageContext;
        if (this.zzb == null) {
            by2.OooO0oo(context);
            AtomicBoolean atomicBoolean = n60.OooO00o;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new c91("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) contextCreatePackageContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e) {
                throw new c91("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new c91("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new c91("Could not instantiate creator.", e3);
            }
        }
        return this.zzb;
    }
}
