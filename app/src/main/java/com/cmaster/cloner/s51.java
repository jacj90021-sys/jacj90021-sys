package com.cmaster.cloner;

import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s51 implements uyi, IBinder.DeathRecipient {
    public static final LinkedHashMap OooO0oO = new LinkedHashMap();
    public final Context OooO0Oo;
    public ContentProviderClient OooO0o = null;
    public final String OooO0o0;

    public s51(Context context, String str) {
        this.OooO0Oo = context;
        this.OooO0o0 = str;
    }

    public static s51 OooO00o(String str) {
        s51 s51Var;
        LinkedHashMap linkedHashMap = OooO0oO;
        synchronized (linkedHashMap) {
            try {
                s51Var = (s51) linkedHashMap.get(str);
                if (s51Var == null) {
                    s51Var = new s51(e92.OooO00o, str);
                    linkedHashMap.put(str, s51Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return s51Var;
    }

    public final Bundle OooO0O0(String str, String str2, Bundle bundle) {
        ContentProviderClient contentProviderClient;
        int i = 5;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return null;
            }
            synchronized (this) {
                try {
                    if (this.OooO0o == null) {
                        this.OooO0o = this.OooO0Oo.getContentResolver().acquireUnstableContentProviderClient(this.OooO0o0);
                    }
                    contentProviderClient = this.OooO0o;
                } finally {
                }
            }
            if (contentProviderClient != null) {
                if (bundle == null) {
                    try {
                        bundle = Bundle.EMPTY;
                    } catch (RemoteException e) {
                        if (this.OooO0o == null) {
                            Log.e(u7.OooO00o(new byte[]{66, 126, 29, -54, 27}, new byte[]{4, 63, 73, -117, 87, 31, 73, 115}), u7.OooO00o(new byte[]{-102, -9, 40, 99, 39, 73, 105, 80, -105, -1, 49, 104, 32, 1}, new byte[]{-10, -106, 93, 13, 68, 33, 73, 54}) + this.OooO0o0, e);
                        }
                        if (i2 <= 0) {
                            throw e;
                        }
                    }
                }
                return contentProviderClient.call(str, str2, bundle);
            }
            synchronized (this) {
                try {
                    ContentProviderClient contentProviderClient2 = this.OooO0o;
                    if (contentProviderClient2 != null) {
                        if (contentProviderClient2 != null) {
                            try {
                                contentProviderClient2.release();
                            } catch (Exception unused) {
                            } catch (Throwable th) {
                                this.OooO0o = null;
                                throw th;
                            }
                        }
                        try {
                            this.OooO0o = null;
                            Thread.sleep(200L);
                        } catch (Exception unused2) {
                        } catch (Throwable th2) {
                            this.OooO0o = null;
                            throw th2;
                        }
                        this.OooO0o = null;
                    }
                } finally {
                }
            }
            i = i2;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        LinkedHashMap linkedHashMap = OooO0oO;
        synchronized (linkedHashMap) {
            if (((s51) linkedHashMap.remove(this.OooO0o0)) != null) {
                try {
                    ContentProviderClient contentProviderClient = this.OooO0o;
                    if (contentProviderClient != null) {
                        contentProviderClient.release();
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.OooO0o = null;
                    throw th;
                }
                this.OooO0o = null;
            }
        }
    }

    @Override // com.cmaster.cloner.uyi
    public final Bundle call(String str, String str2, Bundle bundle) {
        return OooO0O0(str, str2, bundle);
    }
}
