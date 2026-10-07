package com.cmaster.cloner;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbez;
import com.google.android.gms.internal.ads.zzbfn;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class l72 {
    public static final jd2 OooO00o;

    static {
        jd2 cd2Var = null;
        try {
            Object objNewInstance = t62.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                cd2Var = iInterfaceQueryLocalInterface instanceof jd2 ? (jd2) iInterfaceQueryLocalInterface : new cd2(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
            } else {
                uh2.OooOO0("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            uh2.OooOO0("Failed to instantiate ClientApi class.");
        }
        OooO00o = cd2Var;
    }

    public abstract Object OooO00o();

    public abstract Object OooO0O0(jd2 jd2Var);

    public abstract Object OooO0OO();

    public final Object OooO0Oo(Context context, boolean z) {
        boolean z2;
        Object objOooO0OO;
        Object objOooO0O0;
        if (!z) {
            zj2 zj2Var = p72.OooO0o.OooO00o;
            if (e60.OooO0O0.OooO0OO(context, 12451000) != 0) {
                uh2.OooO0o0("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(fu.OooO00o(context, ModuleDescriptor.MODULE_ID) <= fu.OooO0Oo(context, ModuleDescriptor.MODULE_ID, false));
        zzbde.zza(context);
        if (((Boolean) zzbez.zza.zze()).booleanValue()) {
            z2 = false;
        } else if (((Boolean) zzbez.zzb.zze()).booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z | z4;
            z2 = false;
        }
        jd2 jd2Var = OooO00o;
        Object objOooO0O02 = null;
        if (z3) {
            if (jd2Var != null) {
                try {
                    objOooO0O0 = OooO0O0(jd2Var);
                } catch (RemoteException e) {
                    uh2.OooOO0O("Cannot invoke local loader using ClientApi class.", e);
                }
                if (objOooO0O0 == null && !z2) {
                    try {
                        objOooO0O02 = OooO0OO();
                    } catch (RemoteException e2) {
                        uh2.OooOO0O("Cannot invoke remote loader.", e2);
                    }
                    objOooO0O0 = objOooO0O02;
                }
            } else {
                uh2.OooOO0("ClientApi class cannot be loaded.");
            }
            objOooO0O0 = null;
            if (objOooO0O0 == null) {
                objOooO0O02 = OooO0OO();
                objOooO0O0 = objOooO0O02;
            }
        } else {
            try {
                objOooO0OO = OooO0OO();
            } catch (RemoteException e3) {
                uh2.OooOO0O("Cannot invoke remote loader.", e3);
                objOooO0OO = null;
            }
            if (objOooO0OO == null) {
                int iIntValue = ((Long) zzbfn.zza.zze()).intValue();
                p72 p72Var = p72.OooO0o;
                if (p72Var.OooO0o0.nextInt(iIntValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zj2 zj2Var2 = p72Var.OooO00o;
                    String str = p72Var.OooO0Oo.OooO0Oo;
                    zj2Var2.getClass();
                    zj2.OooO00o(context, str, bundle, new er1(zj2Var2, context, 8));
                }
            }
            if (objOooO0OO == null) {
                if (jd2Var != null) {
                    try {
                        objOooO0O02 = OooO0O0(jd2Var);
                    } catch (RemoteException e4) {
                        uh2.OooOO0O("Cannot invoke local loader using ClientApi class.", e4);
                    }
                } else {
                    uh2.OooOO0("ClientApi class cannot be loaded.");
                }
                objOooO0O0 = objOooO0O02;
            } else {
                objOooO0O0 = objOooO0OO;
            }
        }
        return objOooO0O0 == null ? OooO00o() : objOooO0O0;
    }
}
