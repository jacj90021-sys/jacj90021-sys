package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO00O0oO {
    public q8 OooO00o;
    public wj2 OooO0O0;
    public boolean OooO0OO;
    public final Object OooO0Oo = new Object();
    public final Context OooO0o;
    public b72 OooO0o0;
    public final long OooO0oO;

    public oO00O0oO(Context context, long j, boolean z) {
        Context applicationContext;
        by2.OooO0oo(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.OooO0o = context;
        this.OooO0OO = false;
        this.OooO0oO = j;
    }

    public static oOo00OO0 OooO00o(Context context) {
        oO00O0oO oo00o0oo = new oO00O0oO(context, -1L, true);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            oo00o0oo.OooO0Oo(false);
            oOo00OO0 ooo00oo0OooO0o = oo00o0oo.OooO0o();
            OooO0o0(ooo00oo0OooO0o, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            return ooo00oo0OooO0o;
        } finally {
        }
    }

    public static boolean OooO0O0(Context context) {
        boolean z;
        oO00O0oO oo00o0oo = new oO00O0oO(context, -1L, false);
        try {
            oo00o0oo.OooO0Oo(false);
            by2.OooO0oO("Calling this from your main thread can lead to deadlock");
            synchronized (oo00o0oo) {
                try {
                    if (!oo00o0oo.OooO0OO) {
                        synchronized (oo00o0oo.OooO0Oo) {
                            b72 b72Var = oo00o0oo.OooO0o0;
                            if (b72Var == null || !b72Var.OooO0oO) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            oo00o0oo.OooO0Oo(false);
                            if (!oo00o0oo.OooO0OO) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    by2.OooO0oo(oo00o0oo.OooO00o);
                    by2.OooO0oo(oo00o0oo.OooO0O0);
                    try {
                        ee2 ee2Var = (ee2) oo00o0oo.OooO0O0;
                        ee2Var.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel parcelO0000o0O = ee2Var.o0000o0O(6, parcelObtain);
                        int i = cb2.OooO00o;
                        z = parcelO0000o0O.readInt() != 0;
                        parcelO0000o0O.recycle();
                    } catch (RemoteException e2) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oo00o0oo.OooO0oO();
            return z;
        } finally {
            oo00o0oo.OooO0OO();
        }
    }

    public static void OooO0o0(oOo00OO0 ooo00oo0, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (ooo00oo0 != null) {
                map.put("limit_ad_tracking", true != ooo00oo0.OooO0O0 ? "0" : "1");
                String str = ooo00oo0.OooO00o;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new s40(map, 2).start();
        }
    }

    public final void OooO0OO() {
        by2.OooO0oO("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.OooO0o == null || this.OooO00o == null) {
                    return;
                }
                try {
                    if (this.OooO0OO) {
                        xb1.OooOooo().Oooo0OO(this.OooO0o, this.OooO00o);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.OooO0OO = false;
                this.OooO0O0 = null;
                this.OooO00o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void OooO0Oo(boolean z) {
        by2.OooO0oO("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.OooO0OO) {
                    OooO0OO();
                }
                Context context = this.OooO0o;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iOooO0OO = e60.OooO0O0.OooO0OO(context, 12451000);
                    if (iOooO0OO != 0 && iOooO0OO != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    q8 q8Var = new q8();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!xb1.OooOooo().Oooo0o(context, context.getClass().getName(), intent, q8Var, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.OooO00o = q8Var;
                        try {
                            IBinder iBinderOooO00o = q8Var.OooO00o();
                            int i = ph2.OooO0Oo;
                            IInterface iInterfaceQueryLocalInterface = iBinderOooO00o.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.OooO0O0 = iInterfaceQueryLocalInterface instanceof wj2 ? (wj2) iInterfaceQueryLocalInterface : new ee2(iBinderOooO00o);
                            this.OooO0OO = true;
                            if (z) {
                                OooO0oO();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new m60();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final oOo00OO0 OooO0o() {
        oOo00OO0 ooo00oo0;
        by2.OooO0oO("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.OooO0OO) {
                    synchronized (this.OooO0Oo) {
                        b72 b72Var = this.OooO0o0;
                        if (b72Var == null || !b72Var.OooO0oO) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        OooO0Oo(false);
                        if (!this.OooO0OO) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                by2.OooO0oo(this.OooO00o);
                by2.OooO0oo(this.OooO0O0);
                try {
                    ee2 ee2Var = (ee2) this.OooO0O0;
                    ee2Var.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelO0000o0O = ee2Var.o0000o0O(1, parcelObtain);
                    String string = parcelO0000o0O.readString();
                    parcelO0000o0O.recycle();
                    ee2 ee2Var2 = (ee2) this.OooO0O0;
                    ee2Var2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = cb2.OooO00o;
                    parcelObtain2.writeInt(1);
                    Parcel parcelO0000o0O2 = ee2Var2.o0000o0O(2, parcelObtain2);
                    boolean z = parcelO0000o0O2.readInt() != 0;
                    parcelO0000o0O2.recycle();
                    ooo00oo0 = new oOo00OO0(string, z);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        OooO0oO();
        return ooo00oo0;
    }

    public final void OooO0oO() {
        synchronized (this.OooO0Oo) {
            b72 b72Var = this.OooO0o0;
            if (b72Var != null) {
                b72Var.OooO0o.countDown();
                try {
                    this.OooO0o0.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.OooO0oO;
            if (j > 0) {
                this.OooO0o0 = new b72(this, j);
            }
        }
    }

    public final void finalize() throws Throwable {
        OooO0OO();
        super.finalize();
    }
}
